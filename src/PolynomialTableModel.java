import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class PolynomialTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Значение", "Точка", "«Точное значение?"};
    private final List<PolynomialData> data;

    public PolynomialTableModel(List<PolynomialData> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PolynomialData polynomialData = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return polynomialData.getValue();
            case 1:
                return polynomialData.getPoint();
            case 2:
                return ExactValue(polynomialData.getValue());
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 2) {
            return Boolean.class;
        }
        return String.class;
    }

    private boolean ExactValue(double value) {
        double intValue = value;
        int val = (int) intValue;
        return (intValue - val) % 1 == 0;
    }
}
