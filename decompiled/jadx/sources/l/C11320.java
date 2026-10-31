package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: XAQ1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11320 extends AbstractC16466 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC16466[] f33881;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f33882;

    public C11320(C8000 c8000) {
        this(new AbstractC16466[]{c8000.f24706}, new int[]{c8000.f24707});
    }

    @Override // l.AbstractC16466
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo27960() {
        return this.f33882[0] == Integer.MAX_VALUE;
    }

    @Override // l.AbstractC16466
    /* JADX INFO: renamed from: ܽ */
    public final int mo21317() {
        return this.f33882.length;
    }

    @Override // l.AbstractC16466
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16466 mo21315(int i) {
        return this.f33881[i];
    }

    @Override // l.AbstractC16466
    /* JADX INFO: renamed from: ۧ */
    public final int mo21316(int i) {
        return this.f33882[i];
    }

    @Override // l.AbstractC16466
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11320)) {
            return false;
        }
        if (this.f50608 != ((AbstractC16466) obj).f50608) {
            return false;
        }
        C11320 c11320 = (C11320) obj;
        return Arrays.equals(this.f33882, c11320.f33882) && Arrays.equals(this.f33881, c11320.f33881);
    }

    public final String toString() {
        if (mo27960()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.f33882;
            if (i < iArr.length) {
                if (i > 0) {
                    sb.append(", ");
                }
                int i2 = iArr[i];
                if (i2 == Integer.MAX_VALUE) {
                    sb.append("$");
                } else {
                    sb.append(i2);
                    AbstractC16466[] abstractC16466Arr = this.f33881;
                    if (abstractC16466Arr[i] != null) {
                        sb.append(' ');
                        sb.append(abstractC16466Arr[i].toString());
                    } else {
                        sb.append("null");
                    }
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11320(AbstractC16466[] abstractC16466Arr, int[] iArr) {
        int iM6876 = 1;
        for (AbstractC16466 abstractC16466 : abstractC16466Arr) {
            iM6876 = C2093.m6874(iM6876, abstractC16466);
        }
        for (int i : iArr) {
            iM6876 = C2093.m6876(iM6876, i);
        }
        super(C2093.m6873(iM6876, abstractC16466Arr.length * 2));
        this.f33881 = abstractC16466Arr;
        this.f33882 = iArr;
    }
}
