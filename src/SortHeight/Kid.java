package SortHeight;

public class Kid implements Comparable<Kid>{
    private int heightInCm;
    private String name;


    public Kid(int heightInCm, String name){
        this.heightInCm = heightInCm;
        this.name = name;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "heightInCm=" + heightInCm +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Kid o) {
        return this.heightInCm - o.getHeightInCm();
    }
}
