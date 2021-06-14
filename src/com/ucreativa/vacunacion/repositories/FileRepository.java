package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepository implements Repository{

    private final String FILE_PATH = "db.txt";

    @Override
    public void save(Persona persona, String marca, Date fecha) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");

        String text = persona.getNombre() + " " + marca + " " + format.format(fecha) + "\n";

        try {
            BufferedWriter  writer = new BufferedWriter(new FileWriter(FILE_PATH,true));
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> get() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
