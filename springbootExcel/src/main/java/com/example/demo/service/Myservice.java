package com.example.demo.service;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Service;

@Service
public class Myservice {
    public HSSFWorkbook export(){
        // 声明String数组，并初始化元素（表头名称）
        //第一行表头字段，合并单元格时字段跨几列就将该字段重复几次
        String[] excelHeader0 = { "城市名称", "监测点", "污染物浓度及空气质量分指数（AQI）", "污染物浓度及空气质量分指数（AQI）", "污染物浓度及空气质量分指数（AQI）",
                "污染物浓度及空气质量分指数（AQI）", "污染物浓度及空气质量分指数（AQI）", "污染物浓度及空气质量分指数（AQI）", "污染物浓度及空气质量分指数（AQI）",
                "污染物浓度及空气质量分指数（AQI）", "污染物浓度及空气质量分指数（AQI）", "污染物浓度及空气质量分指数（AQI）", "污染物浓度及空气质量分指数（AQI）",
                "污染物浓度及空气质量分指数（AQI）", "空气质量指数（AQI）", "首要污染物", "空气质量指数级别", "空气质量指数类别", "空气质量指数类别" };
        //  “0,2,0,0”  ===>  “起始行，截止行，起始列，截止列”
        String[] headnum0 = { "0,2,0,0", "0,2,1,1", "0,0,2,13", "0,2,14,14", "0,2,15,15", "0,2,16,16", "0,1,17,18" };

        //第二行表头字段，其中的空的双引号是为了补全表格边框
        String[] excelHeader1 = { "二氧化硫（SO₂）24小时平均", "二氧化硫（SO₂）24小时平均", "二氧化氮（NO₂）24小时平均", "二氧化氮（NO₂）24小时平均",
                "颗粒物（粒径小于等于10μm）24小时平均", "颗粒物（粒径小于等于10μm）24小时平均", "一氧化碳（CO）24小时平均", "一氧化碳（CO）24小时平均", "臭氧（O₃）最大8小时平均",
                "臭氧（O₃）最大8小时平均", "颗粒物（粒径小于等于2.5μm）24小时平均", "颗粒物（粒径小于等于2.5μm）24小时平均","","","","","" };
        // 合并单元格
        String[] headnum1 = { "1,1,2,3", "1,1,4,5", "1,1,6,7", "1,1,8,9", "1,1,10,11", "1,1,12,13" };

        //第三行表头字段
        String[] excelHeader2 = {  "", "", "浓度/（μg/m3）", "分指数", "浓度/（μg/m3）", "分指数", "浓度/（μg/m3）", "分指数", "浓度/（μg/m3）", "分指数",
                "浓度/（μg/m3）", "分指数", "浓度/（μg/m3）", "分指数","", "类别", "颜色" };
//
//        String[] headnum2 = { "2,2,2,2", "2,2,3,3", "2,2,4,4", "2,2,5,5", "2,2,6,6", "2,2,7,7", "2,2,8,8", "2,2,9,9",
//                "2,2,10,10", "2,2,11,11", "2,2,12,12", "2,2,13,13", "2,2,17,17", "2,2,18,18" };

        // 声明一个工作簿
        HSSFWorkbook wb = new HSSFWorkbook();
        // 生成一个表格
        HSSFSheet sheet = wb.createSheet("TAQIDataReport");

        // 生成一种样式
        HSSFCellStyle style = wb.createCellStyle();
        // 设置样式
        style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        // 生成一种字体
        HSSFFont font = wb.createFont();
        // 设置字体
        font.setFontName("微软雅黑");
        // 设置字体大小
        font.setFontHeightInPoints((short) 10);
        // 字体加粗
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 在样式中引用这种字体
        style.setFont(font);

        // 生成并设置另一个样式
        HSSFCellStyle style2 = wb.createCellStyle();
        style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
        style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        // 生成另一种字体2
        HSSFFont font2 = wb.createFont();
        // 设置字体
        font2.setFontName("微软雅黑");
        // 设置字体大小
        font2.setFontHeightInPoints((short) 8);
        // 字体加粗
        // font2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 在样式2中引用这种字体
        style2.setFont(font2);

        // 生成表格的第一行
        // 第一行表头
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < excelHeader0.length; i++) {

            sheet.autoSizeColumn(i, true);// 根据字段长度自动调整列的宽度
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(excelHeader0[i]);
            cell.setCellStyle(style);

            // System.out.println(excelHeader0[i]);

            if (i >= 0 && i <= 18) {
                for (int j = 0; j < excelHeader0.length; j++) {
                    // 从第j列开始填充
                    cell = row.createCell(j);
                    // 填充excelHeader1[j]第j个元素
                    cell.setCellValue(excelHeader0[j]);
                    cell.setCellStyle(style);
                }

            }

            // 设置列宽

            // sheet.setColumnWidth(0, 5500);
            // sheet.setColumnWidth(1, 6500);
            // sheet.setColumnWidth(2, 6500);
            // sheet.setColumnWidth(3, 6000);
            // sheet.setColumnWidth(4, 6500);
            // sheet.setColumnWidth(5, 6500);
            // sheet.setColumnWidth(6, 6500);
            // sheet.setColumnWidth(7, 6500);
            // sheet.setColumnWidth(8, 6500);
            // sheet.setColumnWidth(9, 6500);
            // sheet.setColumnWidth(10, 6500);
            // sheet.setColumnWidth(11, 6500);
            // sheet.setColumnWidth(12, 6500);
            // sheet.setColumnWidth(13, 6500);
            // sheet.setColumnWidth(14, 6500);
            // sheet.setColumnWidth(15, 6500);
            // sheet.setColumnWidth(16, 6500);
            // sheet.setColumnWidth(17, 6500);
            // sheet.setColumnWidth(18, 6500);
            // sheet.setDefaultRowHeight((short) 360);// 设置行高

        }

        // 动态合并单元格
        for (int i = 0; i < headnum0.length; i++) {

            sheet.autoSizeColumn(i, true);
            String[] temp = headnum0[i].split(",");
            Integer startrow = Integer.parseInt(temp[0]);
            Integer overrow = Integer.parseInt(temp[1]);
            Integer startcol = Integer.parseInt(temp[2]);
            Integer overcol = Integer.parseInt(temp[3]);
            sheet.addMergedRegion(new CellRangeAddress(startrow, overrow, startcol, overcol));
        }

        // 第二行表头
        row = sheet.createRow(1);
        for (int i = 0; i < excelHeader1.length; i++) {

            sheet.autoSizeColumn(i, true);// 自动调整宽度
            HSSFCell cell = row.createCell(i + 1);
            cell.setCellValue(excelHeader1[i]);
            cell.setCellStyle(style);

            if (i >= 2 && i <= 18) {
                for (int j = 0; j < excelHeader1.length; j++) {
                    // 从第j+1列开始填充
                    cell = row.createCell(j + 2);
                    // 填充excelHeader1[j]第j个元素
                    cell.setCellValue(excelHeader1[j]);
                    cell.setCellStyle(style);
                }
            }
        }

        // 动态合并单元格
        for (int i = 0; i < headnum1.length; i++) {

            sheet.autoSizeColumn(i, true);
            String[] temp = headnum1[i].split(",");
            Integer startrow = Integer.parseInt(temp[0]);
            Integer overrow = Integer.parseInt(temp[1]);
            Integer startcol = Integer.parseInt(temp[2]);
            Integer overcol = Integer.parseInt(temp[3]);
            sheet.addMergedRegion(new CellRangeAddress(startrow, overrow, startcol, overcol));
        }
        // 第三行表头
        row = sheet.createRow(2);
        for (int i = 0; i < excelHeader2.length; i++) {

            HSSFCell cell = row.createCell(i + 2);
            cell.setCellValue(excelHeader2[i]);
            cell.setCellStyle(style);
            // System.out.println(excelHeader2[i]);
            sheet.autoSizeColumn(i, true);// 自动调整宽度

            if (i > 1 && i <= 18) {
                for (int j = 0; j < excelHeader2.length; j++) {
                    // 从第j+2列开始填充
                    cell = row.createCell(j);
                    // 填充excelHeader1[j]第j个元素
                    cell.setCellValue(excelHeader2[j]);
                    cell.setCellStyle(style);
                }
            }
        }
//        // 动态合并单元格
//        for (int i = 0; i < headnum2.length; i++) {
//
//            sheet.autoSizeColumn(i, true);
//            String[] temp = headnum2[i].split(",");
//            Integer startrow = Integer.parseInt(temp[0]);
//            Integer overrow = Integer.parseInt(temp[1]);
//            Integer startcol = Integer.parseInt(temp[2]);
//            Integer overcol = Integer.parseInt(temp[3]);
//            sheet.addMergedRegion(new CellRangeAddress(startrow, overrow, startcol, overcol));
//        }

        // 第四行数据
        for (int i = 0; i < 100; i++) {

            row = sheet.createRow(i + 3);


            // 导入对应列的数据
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("00"+i);
            cell.setCellStyle(style2);

            HSSFCell cell1 = row.createCell(1);
            cell1.setCellValue("11"+i);
            cell1.setCellStyle(style2);

            HSSFCell cell2 = row.createCell(2);
            cell2.setCellValue("22"+i);
            cell2.setCellStyle(style2);
            HSSFCell cell3 = row.createCell(3);
            cell3.setCellValue("33"+i);
            cell3.setCellStyle(style2);

            HSSFCell cell4 = row.createCell(4);
            cell4.setCellValue("44"+i);
            cell4.setCellStyle(style2);
            HSSFCell cell5 = row.createCell(5);
            cell5.setCellValue("55"+i);
            cell5.setCellStyle(style2);

            HSSFCell cell6 = row.createCell(6);
            cell6.setCellValue("66"+i);
            cell6.setCellStyle(style2);
            HSSFCell cell7 = row.createCell(7);
            cell7.setCellValue("77"+i);
            cell7.setCellStyle(style2);

            HSSFCell cell8 = row.createCell(8);
            cell8.setCellValue("88"+i);
            cell8.setCellStyle(style2);
            HSSFCell cell9 = row.createCell(9);
            cell9.setCellValue("99"+i);
            cell9.setCellStyle(style2);

            HSSFCell cell10 = row.createCell(10);
            cell10.setCellValue("1010"+i);
            cell10.setCellStyle(style2);
            HSSFCell cell11 = row.createCell(11);
            cell11.setCellValue("11"+i);
            cell11.setCellStyle(style2);

            HSSFCell cell12 = row.createCell(12);
            cell12.setCellValue("1212"+i);
            cell12.setCellStyle(style2);
            HSSFCell cell13 = row.createCell(13);
            cell13.setCellValue("1313"+i);
            cell13.setCellStyle(style2);

            HSSFCell cell14 = row.createCell(14);
            cell14.setCellValue("1414"+i);
            cell14.setCellStyle(style2);

            HSSFCell cell15 = row.createCell(15);
            cell15.setCellValue("1515"+i);
            cell15.setCellStyle(style2);

            HSSFCell cell16 = row.createCell(16);
            cell16.setCellValue("1616"+i);
            cell16.setCellStyle(style2);

            HSSFCell cell17 = row.createCell(17);
            cell17.setCellValue("1717"+i);
            cell17.setCellStyle(style2);

            HSSFCell cell18 = row.createCell(18);
            cell18.setCellValue("1818"+i);
            cell18.setCellStyle(style2);
        }
        return wb;

    }
}
