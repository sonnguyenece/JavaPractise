public interface test {
   int a = 1;
   int b = 0;

    default int play() {
        return a+b;
    }


}
