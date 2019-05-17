package ua.lviv.iot.lab7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringProcessorTest {
  StringProcessor sp = new StringProcessor();
  String st = new String();
  
  
  @BeforeEach
  void setUp() throws Exception {
     
  }

@Test
void stringTest() throws IOException {
    st = StringProcessor.readInputText();
  assertEquals("In this article, we would be going Lviv,str.Naukova,7b", st);
}



}
