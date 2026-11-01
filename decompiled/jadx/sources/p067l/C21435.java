package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21435 extends OutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public int f67623;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f67624 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f67625 = new byte[16384];

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC2658 m48561() {
        return new C23446();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48562(C17351 c17351) throws IOException {
        ArrayList arrayList = this.f67624;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c17351.write((byte[]) it.next());
        }
        int i = this.f67623;
        if (i > 0) {
            c17351.write(this.f67625, 0, i);
        }
        arrayList.clear();
        this.f67623 = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f67625;
        if (bArr.length - this.f67623 == 0) {
            this.f67624.add(bArr);
            this.f67625 = new byte[this.f67625.length];
            this.f67623 = 0;
        }
        byte[] bArr2 = this.f67625;
        int i2 = this.f67623;
        this.f67623 = i2 + 1;
        bArr2[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length = this.f67625.length - this.f67623;
        int i3 = 0;
        while (true) {
            int i4 = i2 - i3;
            if (i4 <= 0) {
                return;
            }
            int iMin = Math.min(length, i4);
            System.arraycopy(bArr, i + i3, this.f67625, this.f67623, iMin);
            i3 += iMin;
            int i5 = this.f67623 + iMin;
            this.f67623 = i5;
            byte[] bArr2 = this.f67625;
            int length2 = bArr2.length - i5;
            if (length2 == 0) {
                this.f67624.add(bArr2);
                length = this.f67625.length;
                this.f67625 = new byte[length];
                this.f67623 = 0;
            } else {
                length = length2;
            }
        }
    }
}
