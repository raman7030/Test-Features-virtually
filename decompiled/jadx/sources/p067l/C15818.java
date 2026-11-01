package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6L6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15818 {

    /* JADX INFO: renamed from: ۧ */
    public float f45793;

    /* JADX INFO: renamed from: ܽ */
    public long f45794;

    /* JADX INFO: renamed from: ܿ */
    public long f45795 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public int f45796 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f45792 = 1;

    /* JADX INFO: renamed from: ֫ */
    public final int m35894(long j, int i, int i2, boolean z, boolean z2) {
        if (i != 0) {
            this.f45792 = i > 0 ? 1 : -1;
        }
        if (!z && !z2) {
            this.f45796 = 0;
            this.f45795 = j;
            this.f45793 = 0.0f;
        } else if (z2) {
            this.f45796 = 2;
            this.f45795 = j;
            this.f45794 = j;
            this.f45793 = 0.0f;
        } else {
            if (this.f45796 == 0) {
                this.f45796 = 1;
            }
            if (this.f45795 < 0) {
                this.f45795 = j;
            }
            float fAbs = this.f45793 + Math.abs(i);
            this.f45793 = fAbs;
            long j2 = j - this.f45795;
            if (j2 >= 40 && i2 > 0) {
                float f = (fAbs * 1000.0f) / (i2 * j2);
                if (f >= 2.0f) {
                    this.f45796 = 2;
                    this.f45794 = j;
                } else if (f <= 1.0f && j - this.f45794 >= 120) {
                    this.f45796 = 1;
                }
                this.f45793 = 0.0f;
                this.f45795 = j;
            }
        }
        return this.f45796;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m35893() {
        return this.f45792;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35895() {
        this.f45795 = -1L;
        this.f45793 = 0.0f;
        this.f45796 = 0;
        this.f45792 = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m35891(List list, int i, int i2, int i3, int i4) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 >= i && i < list.size()) {
            int iMin = Math.min(i2, list.size() - 1);
            for (int i5 = i; i5 <= iMin; i5++) {
                arrayList.add((InterfaceC19370) list.get(i5));
            }
            if (i3 != 2) {
                int i6 = iMin - i;
                int i7 = i6 + 1;
                int i8 = i3 == 0 ? i7 : (i6 + 2) / 2;
                int iMin2 = i3 == 0 ? (i6 + 2) / 2 : Math.min(2, i7 / 4);
                m35892(arrayList, list, i4 > 0 ? iMin + 1 : i - 1, i4, i8);
                m35892(arrayList, list, i4 > 0 ? i - 1 : iMin + 1, -i4, iMin2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35892(ArrayList arrayList, List list, int i, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && i >= 0 && i < list.size()) {
            arrayList.add((InterfaceC19370) list.get(i));
            i4++;
            i += i2;
        }
    }
}
