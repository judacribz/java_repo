/*
  @author: Jude Sheron Balasingam(100504990)
  @title:  Assignment
*/

public class bt {
  public static void main(String[] args) {

    int integerRange = Integer.parseInt(args[1]);
    int streamLength = Integer.parseInt(args[2]);
    int seed = Integer.parseInt(args[0]);

    Stream stream = new Stream(integerRange, seed); 
    StreamProcessor processor = new StreamProcessor();


    for (int i=0; i<streamLength; ++i) {
      processor.consume(stream.getNext());
    }

    // HERE YOU WILL PERFORM SEARCHES AND COLLECT TIMES
    // AND PREPARE THE OUTPUT
    for(int i=3; i<args.length; i++) {
      String[] temp = args[i].split("=");

      if(temp[0].equals("search"))
        processor.search(Integer.parseInt(temp[1]));
      else if(temp[0].equals("at"))
        processor.at(Integer.parseInt(temp[1]));
    }

    processor.show(); //ouputs the times instead
  }
}
