package org.example;import org.rdfhdt.hdt.enums.RDFNotation;import org.rdfhdt.hdt.hdt.HDT;import org.rdfhdt.hdt.hdt.HDTManager;import org.rdfhdt.hdt.options.HDTSpecification;public class Prueba {    public HDT Pruebap()  {        // Configuration variables        String rdfInput = "./examples/dataset.nt";//        String baseURI = "http://example.com/mydataset";        String baseURI = "";        String inputType = "ntriples";        String hdtOutput = "./examples/dataset.hdt";        HDT hdt = null;        // Create HDT from RDF file        try {             hdt = HDTManager.generateHDT(                    rdfInput,         // Input RDF File                    baseURI,          // Base URI                    RDFNotation.parse(inputType), // Input Type                    new HDTSpecification(),   // HDT Options                    null              // Progress Listener            );//         hdt.saveToHDT(hdtOutput, null);        }        catch (Exception E){        }        return hdt;    }}