package Drawing;

public class FaceDrawing {
    private String[][] face;

    public FaceDrawing(String[][] face)
    {
        this.face = face;
    }

    public void fill(String str) {
        for (int row = 0; row < face.length; row++)
        {
            for (int column = 0; column < face[row].length;column++)
            {
                face[row][column]=str;
            }
        }
    }

    public void edit(String replace, int row, int column)
    {

        face[row][column] = replace;
    }
    public String toString(){
        String face1 = "";
        for (int row = 0; row < face.length; row++)
        {
            for (int column = 0; column < face[row].length; column++)
            {

                face1 = face1 + face[row][column];
            }
            face1=face1+"\n";
        }
        return face1;
    }
}