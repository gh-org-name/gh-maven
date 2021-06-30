package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static List<String> zipSlipNoncompliant(ZipFile zipFile) throws IOException {
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        List<String> filesContent = new ArrayList<>();

        while (entries.hasMoreElements()) {
          ZipEntry entry = entries.nextElement();
          File file = new File(entry.getName());
          String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8); // Noncompliant
          filesContent.add(content);
        }
    return filesContent;
  }

}
