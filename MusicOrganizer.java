import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) 
        {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
            if (validIndex(index))
            {
                files.remove(index);
            }
        }
    
    
    public void checkIdex (int index)
    {
        if (index <0 || index > (files.size()-1))
        {
            System.out.println("Error. El indice de archivo no es valido");
            System.out.println("El indice debe estar contenido entre el número 0 y el número " + (files.size() -1));
        }
    }
    
    public boolean validIndex(int index)
    {
        boolean temp = true;
        if (index <0 || index > (files.size()-1))
        {
            temp = false;
        }
        return temp;
    }
}
