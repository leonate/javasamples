package org.sample.file;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Leonid Vysochyn on 11-Oct-15.
 */
public class PathTest {
    @Test
    public void testPathCreation(){
        Path currentDir = Paths.get(".");
        System.out.println(currentDir.toAbsolutePath());
        try(DirectoryStream<Path> stream
                    = Files.newDirectoryStream(currentDir, "*.*")) {
            for (Path entry: stream)
            {
                System.out.println(entry.getFileName());
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
