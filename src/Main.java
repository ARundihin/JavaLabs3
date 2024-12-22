//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HornerScheme horn = new HornerScheme();
        JFrame frame = new JFrame("Многочлен");
        List<PolynomialData> data = new ArrayList<>();
        data.add(new PolynomialData(horn.hornerScheme(2), 2));
        data.add(new PolynomialData(horn.hornerScheme(10), 10));
        data.add(new PolynomialData(horn.hornerScheme(1), 1));

        PolynomialTableModel model = new PolynomialTableModel(data);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("Справка");
        JMenuItem aboutItem = new JMenuItem("О программе");
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Автор: Рундыгин А.Д., группа: 7", "О программе", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        helpMenu.add(aboutItem);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}


