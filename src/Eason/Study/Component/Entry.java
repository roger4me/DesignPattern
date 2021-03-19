package Eason.Study.Component;

import java.io.FileNotFoundException;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry e) throws FileNotFoundException
    {
        throw  new FileNotFoundException();
    }

    public void printList()
    {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString()
    {
        return getName()+"("+getSize()+")";
    }
}
