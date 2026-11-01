package p067l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ܽᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18364 {

    /* JADX INFO: renamed from: ۧ */
    public final StringBuilder f54848;

    /* JADX INFO: renamed from: ܽ */
    public int f54849;

    /* JADX INFO: renamed from: ܿ */
    public final String f54850;

    /* JADX INFO: renamed from: ֫ */
    public final BitSet f54847 = new BitSet();

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f54851 = new ArrayList();

    public C18364(StringBuilder sb, String str) {
        this.f54850 = str;
        this.f54848 = sb;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return;
            }
            if (str.charAt(i) != '\\') {
                i = i2;
            } else if (str.charAt(i2) != 'Q') {
                i += 2;
            } else {
                int i3 = i + 2;
                int iIndexOf = str.indexOf("\\E", i3);
                int length = iIndexOf < 0 ? str.length() : iIndexOf + 2;
                this.f54851.add(new int[]{i, i3, iIndexOf < 0 ? length : iIndexOf, length});
                i = length;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41839(int i, int i2) {
        StringBuilder sb;
        String str;
        int[] iArr;
        int i3;
        BitSet bitSet = this.f54847;
        int iNextSetBit = bitSet.nextSetBit(i);
        while (true) {
            int i4 = this.f54849;
            ArrayList arrayList = this.f54851;
            int size = arrayList.size();
            sb = this.f54848;
            str = this.f54850;
            if (i4 >= size || (i3 = (iArr = (int[]) arrayList.get(this.f54849))[0]) >= i2) {
                break;
            }
            this.f54849++;
            if (i3 >= i && iArr[3] <= i2) {
                while (iNextSetBit >= 0 && iNextSetBit < iArr[0]) {
                    iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
                }
                if (iNextSetBit < 0 || iNextSetBit >= iArr[3]) {
                    C22389.m50260(i, iArr[0], str, sb);
                    C22389.m50261(str, iArr[1], iArr[2], sb, true);
                    i = iArr[3];
                }
            }
        }
        C22389.m50260(i, i2, str, sb);
    }
}
