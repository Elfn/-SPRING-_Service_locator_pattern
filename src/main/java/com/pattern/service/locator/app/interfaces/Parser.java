package com.pattern.service.locator.app.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public interface Parser {
    List parse() throws IOException;
}
