package com.pattern.service.locator.app.interfaces;


import com.pattern.service.locator.app.file.structure.ContentType;

public interface ParserFactory {
    Parser getParser(ContentType contentType);
}
