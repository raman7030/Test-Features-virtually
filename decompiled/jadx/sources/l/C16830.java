package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ܽᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16830 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f51668;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51669;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f51670;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f51667 = new BitSet();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51671 = new ArrayList();

    public C16830(StringBuilder sb, String str) {
        this.f51670 = str;
        this.f51668 = sb;
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
                this.f51671.add(new int[]{i, i3, iIndexOf < 0 ? length : iIndexOf, length});
                i = length;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39603(int i, int i2) {
        StringBuilder sb;
        String str;
        int[] iArr;
        int i3;
        BitSet bitSet = this.f51667;
        int iNextSetBit = bitSet.nextSetBit(i);
        while (true) {
            int i4 = this.f51669;
            ArrayList arrayList = this.f51671;
            int size = arrayList.size();
            sb = this.f51668;
            str = this.f51670;
            if (i4 >= size || (i3 = (iArr = (int[]) arrayList.get(this.f51669))[0]) >= i2) {
                break;
            }
            this.f51669++;
            if (i3 >= i && iArr[3] <= i2) {
                while (iNextSetBit >= 0 && iNextSetBit < iArr[0]) {
                    iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
                }
                if (iNextSetBit < 0 || iNextSetBit >= iArr[3]) {
                    C21065.m47930(i, iArr[0], str, sb);
                    C21065.m47931(str, iArr[1], iArr[2], sb, true);
                    i = iArr[3];
                }
            }
        }
        C21065.m47930(i, i2, str, sb);
    }
}
