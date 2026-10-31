package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20062 extends OutputStream {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f64982;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f64983 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f64984 = new byte[16384];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC0305 m46245() {
        return new C22178();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46246(C15765 c15765) throws IOException {
        ArrayList arrayList = this.f64983;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c15765.write((byte[]) it.next());
        }
        int i = this.f64982;
        if (i > 0) {
            c15765.write(this.f64984, 0, i);
        }
        arrayList.clear();
        this.f64982 = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f64984;
        if (bArr.length - this.f64982 == 0) {
            this.f64983.add(bArr);
            this.f64984 = new byte[this.f64984.length];
            this.f64982 = 0;
        }
        byte[] bArr2 = this.f64984;
        int i2 = this.f64982;
        this.f64982 = i2 + 1;
        bArr2[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length = this.f64984.length - this.f64982;
        int i3 = 0;
        while (true) {
            int i4 = i2 - i3;
            if (i4 <= 0) {
                return;
            }
            int iMin = Math.min(length, i4);
            System.arraycopy(bArr, i + i3, this.f64984, this.f64982, iMin);
            i3 += iMin;
            int i5 = this.f64982 + iMin;
            this.f64982 = i5;
            byte[] bArr2 = this.f64984;
            int length2 = bArr2.length - i5;
            if (length2 == 0) {
                this.f64983.add(bArr2);
                length = this.f64984.length;
                this.f64984 = new byte[length];
                this.f64982 = 0;
            } else {
                length = length2;
            }
        }
    }
}
