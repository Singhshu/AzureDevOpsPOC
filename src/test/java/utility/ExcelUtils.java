package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    private static Sheet excelSheet;
    private static XSSFWorkbook excelWorkbook;
    private static Cell cell;
    private static Row row;

    public static void setExcelFile(String filePath, String sheetName) throws Exception {
        try {
            FileInputStream file = new FileInputStream(filePath);
            excelWorkbook = new XSSFWorkbook(file);
            excelSheet = excelWorkbook.getSheet(sheetName);
        } catch (Exception e) {
            throw e;
        }
    }

    public static String getCellData(int rowNum, int colNum) throws Exception {
        try {
            row = excelSheet.getRow(rowNum);
            cell = row.getCell(colNum);
            String cellData = cell.getStringCellValue();
            return cellData;
        } catch (Exception e) {
            return "";
        }
    }

    public static void setCellData(String result, int rowNum, int colNum) throws Exception {
        try {
            row = excelSheet.getRow(rowNum);
            cell = row.getCell(colNum);

            if (cell == null) {
                cell = row.createCell(colNum);
                cell.setCellValue(result);
            } else {
                cell.setCellValue(result);
            }

            FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
            excelWorkbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (Exception e) {
            throw e;
        }
    }
}
