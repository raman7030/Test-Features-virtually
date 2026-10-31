package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 026V */
/* JADX INFO: loaded from: classes4.dex */
public final class C19334 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f60782;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3811 f60783;

    public C19334(C3811 c3811) {
        this.f60783 = c3811;
        ArrayList arrayList = new ArrayList();
        this.f60782 = arrayList;
        arrayList.add(new C18628(c3811, new int[]{1}));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44550(int i, int[] iArr) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f60782;
        int size = arrayList.size();
        C3811 c3811 = this.f60783;
        if (i >= size) {
            C18628 c18628M43188 = (C18628) C18566.m43105(arrayList, 1);
            for (int size2 = arrayList.size(); size2 <= i; size2++) {
                c18628M43188 = c18628M43188.m43188(new C18628(c3811, new int[]{1, c3811.m11494(c3811.m11493() + (size2 - 1))}));
                arrayList.add(c18628M43188);
            }
        }
        C18628 c18628 = (C18628) arrayList.get(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM43185 = new C18628(c3811, iArr2).m43183(i, 1).m43187(c18628)[1].m43185();
        int length2 = i - iArrM43185.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrM43185, 0, iArr, length + length2, iArrM43185.length);
    }
}
