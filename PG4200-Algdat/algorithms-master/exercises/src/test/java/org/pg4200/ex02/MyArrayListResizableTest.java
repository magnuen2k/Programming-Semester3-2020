package org.pg4200.ex02;

import org.junit.jupiter.api.Test;
import org.pg4200.les02.list.MyListTestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListResizableTest extends MyListTestTemplate {

    @Override
    protected <T> MyArrayListResizable getNewInstance(Class<T> klass) {
        return new MyArrayListResizable<>(1);
    }
}