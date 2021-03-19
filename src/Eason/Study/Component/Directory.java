package Eason.Study.Component;

import Eason.Study.Builder.Director;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

    private String name;

    private ArrayList directory =new ArrayList();

    public Directory(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry e)
    {
        directory.add(e);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator it = directory.iterator();
        while (it.hasNext())
        {
            Entry e=(Entry)it.next();
            e.printList(prefix + "/" + name);
        }
    }
}
