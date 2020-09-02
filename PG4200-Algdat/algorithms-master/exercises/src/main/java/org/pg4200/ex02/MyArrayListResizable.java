package org.pg4200.ex02;

import org.pg4200.les02.list.MyArrayList;

public class MyArrayListResizable<T> extends MyArrayList<T> {

    MyArrayListResizable() {
        super();
    }

    MyArrayListResizable(int capacity) {
        super(capacity);
    }

    @Override
    public void add(int index, T value) {

        if(index < 0 || index > size){
            //note that here "size" is a valid index
            throw new IndexOutOfBoundsException();
        }

        if(size == data.length) {
            Object[] doubled = new Object[data.length * 2];

            for(int i = 0; i<data.length; i++) {
                doubled[i] = data[i];
            }

            data = doubled;
        }

        super.add(index, value);

    }
}
