package com.example.ceshisuan.cn.com;

public class ChangeXmlToObj {
    public static String getStr() {
        return str;
    }

    public static void setStr(String str) {
        ChangeXmlToObj.str = str;
    }

    public static void main(String[] args) {
        SoapUtil soapUtil=new SoapUtil();

    }
    private static String str="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "\n" +
            "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
            "  <soap:Body>\n" +
            "    <UpdateListItemsResponse xmlns=\"http://schemas.microsoft.com/sharepoint/soap/\">\n" +
            "      <UpdateListItemsResult>\n" +
            "        <Results>\n" +
            "          <Result ID=\"1,New\">\n" +
            "            <ErrorCode>0x00000000</ErrorCode>\n" +
            "            <ID/>\n" +
            "            <z:row xmlns:z=\"#RowsetSchema\" ows_ContentTypeId=\"0x0100CB28B8AF868C7F44BB77B4F73D7312E7\" ows_description=\"1\" ows_PublishTime=\"2019-03-11 17:25:48\" ows_ViewsCount=\"0\" ows_Status=\"Without Approval/未审批\" ows_IsTop=\"0\" ows_PromoteInformation=\"No/否\" ows_PromoteApp=\"No/否\" ows_ID=\"123244\" ows_ContentType=\"项目\" ows_Modified=\"2019-03-11 17:25:48\" ows_Created=\"2019-03-11 17:25:48\" ows_Author=\"32071;#xnygys04\" ows_Editor=\"32071;#xnygys04\" ows_owshiddenversion=\"1\" ows_WorkflowVersion=\"1\" ows__UIVersion=\"512\" ows__UIVersionString=\"1.0\" ows_Attachments=\"0\" ows__ModerationStatus=\"0\" ows_SelectTitle=\"123244\" ows_Order=\"12324400.0000000\" ows_GUID=\"{22AE1029-F357-49F3-9747-F3CE15818F58}\" ows_FileRef=\"123244;#Lists/List15/123244_.000\" ows_FileDirRef=\"123244;#Lists/List15\" ows_Last_x0020_Modified=\"123244;#2019-03-11 17:25:48\" ows_Created_x0020_Date=\"123244;#2019-03-11 17:25:48\" ows_FSObjType=\"123244;#0\" ows_SortBehavior=\"123244;#0\" ows_PermMask=\"0x1b00c4310ef\" ows_FileLeafRef=\"123244;#123244_.000\" ows_UniqueId=\"123244;#{2383C655-CC20-4FFE-A034-17D25CE80DDF}\" ows_ProgId=\"123244;#\" ows_ScopeId=\"123244;#{17D2C963-F4B3-493A-B9E5-1E0E76AF4115}\" ows__EditMenuTableStart=\"123244_.000\" ows__EditMenuTableStart2=\"123244\" ows__EditMenuTableEnd=\"123244\" ows_LinkFilenameNoMenu=\"123244_.000\" ows_LinkFilename2=\"123244_.000\" ows_ServerUrl=\"/Lists/List15/123244_.000\" ows_EncodedAbsUrl=\"http://eip.gcl-power.com/Lists/List15/123244_.000\" ows_BaseName=\"123244_\" ows_MetaInfo=\"123244;#\" ows__Level=\"1\" ows__IsCurrentVersion=\"1\" ows_ItemChildCount=\"123244;#0\" ows_FolderChildCount=\"123244;#0\" ows_PushToApp=\"1\" ows_PublishTime2=\"2019-03-11 17:25:48\" ows_PushToEIP=\"0\" ows_LinkFilename=\"123244_.000\"></z:row>\n" +
            "          </Result>\n" +
            "        </Results>\n" +
            "      </UpdateListItemsResult>\n" +
            "    </UpdateListItemsResponse>\n" +
            "  </soap:Body>\n" +
            "</soap:Envelope>\n";
}
