package Pertemuan15;

public class GraphMatriks {
    int vertex;
    int [][] matriks;

    GraphMatriks(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        
    }
}
