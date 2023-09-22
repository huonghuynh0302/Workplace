package Data;

import org.example.Method.ExcelUtils;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DaTa {
    @DataProvider(name = "meeting",parallel = true)
    public Object[][] getExcelData() throws IOException {
        String excelSheetPath = System.getProperty("user.dir")+"\\src\\main\\java\\Data\\Excel\\Book11.xlsx";
        String sheetName = "Sheet1";
        ExcelUtils excelUtils = new ExcelUtils();
        return excelUtils.getExcelData(excelSheetPath, sheetName);
    }
    @DataProvider(name = "VoteVote")
    public Object[][] keywork(){
        return new Object[][] {{"Content này rất là dàiii","Câu hỏi này cũng rất là dàiiiii"}};
    }
    @DataProvider(name = "VoteVote2")
    public Object[][] keywork2(){
        return new Object[][] {{"Content này rất là dàiii","Câu hỏi này cũng rất là dàiiiii","alo alo alo"}
                                ,{"ngắn","hi","hoho"}
                                ,{"Hôm nay bạn thế nào","Đang rất vui","Đang rất buồn ngủ"}};
    }
    @DataProvider(name = "keyworksearch")
    public Object[][] ksearch(){
        return new Object[][] {{"hasaki"},{"h"}};
    }
}
