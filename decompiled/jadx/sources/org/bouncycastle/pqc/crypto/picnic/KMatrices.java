package org.bouncycastle.pqc.crypto.picnic;

/* JADX INFO: loaded from: classes2.dex */
public class KMatrices {
    public int columns;
    public int[] data;
    public int nmatrices;
    public int rows;

    public KMatrices(int i, int i2, int i3, int[] iArr) {
        this.nmatrices = i;
        this.rows = i2;
        this.columns = i3;
        this.data = iArr;
    }

    public int getColumns() {
        return this.columns;
    }

    public int[] getData() {
        return this.data;
    }

    public int getNmatrices() {
        return this.nmatrices;
    }

    public int getRows() {
        return this.rows;
    }

    public int getSize() {
        return this.rows * this.columns;
    }
}
