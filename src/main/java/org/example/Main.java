package org.example;

import org.rdfhdt.hdt.exceptions.ParserException;
import org.rdfhdt.hdt.hdt.HDT;
import org.rdfhdt.hdt.triples.TripleID;
import org.rdfhdt.hdt.triples.IteratorTripleID;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ParserException {

Prueba eje = new Prueba();
//        String hdtOutput = "./examples/dataset.hdt";
        HDT hdt = eje.Pruebap();

        ArrayList<TripleID> listTripleID = new ArrayList<>();
//        IteratorTripleID it = hdt.search("", "", "");
        IteratorTripleID it = hdt.getTriples().searchAll();
        while(it.hasNext()) {
            TripleID ts = it.next();
            System.out.println(ts);
        }

//        hdt.saveToHDT(hdtOutput, null);

//        System.out.println("Hola   "+hdt.getTriples() +"_____");


    }
}