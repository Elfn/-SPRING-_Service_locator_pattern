package com.pattern.service.locator.app.file.structure;
//We made enum more reusable by using beans(implementations)
public enum ContentType {
    JSON(TypeConstants.JSON_PARSER),
    CSV(TypeConstants.CSV_PARSER),
    XML(TypeConstants.XML_PARSER);
    private final String parserName;
    ContentType(String parserName) {
        this.parserName = parserName;
    }

    @Override
    public String toString() {
        return this.parserName;
    }
    public  interface TypeConstants {

        String CSV_PARSER = "csvParser";
        String JSON_PARSER = "jsonParser";
        String XML_PARSER = "xmlParser";
    }
}
