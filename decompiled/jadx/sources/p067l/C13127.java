package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: XAQ1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13127 extends AbstractC18017 {

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC18017[] f36880;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f36881;

    public C13127(C9971 c9971) {
        this(new AbstractC18017[]{c9971.f27620}, new int[]{c9971.f27621});
    }

    @Override // p067l.AbstractC18017
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo30021() {
        return this.f36881[0] == Integer.MAX_VALUE;
    }

    @Override // p067l.AbstractC18017
    /* JADX INFO: renamed from: ܽ */
    public final int mo23283() {
        return this.f36881.length;
    }

    @Override // p067l.AbstractC18017
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18017 mo23281(int i) {
        return this.f36880[i];
    }

    @Override // p067l.AbstractC18017
    /* JADX INFO: renamed from: ۧ */
    public final int mo23282(int i) {
        return this.f36881[i];
    }

    @Override // p067l.AbstractC18017
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13127)) {
            return false;
        }
        if (this.f53786 != ((AbstractC18017) obj).f53786) {
            return false;
        }
        C13127 c13127 = (C13127) obj;
        return Arrays.equals(this.f36881, c13127.f36881) && Arrays.equals(this.f36880, c13127.f36880);
    }

    public final String toString() {
        if (mo30021()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.f36881;
            if (i < iArr.length) {
                if (i > 0) {
                    sb.append(", ");
                }
                int i2 = iArr[i];
                if (i2 == Integer.MAX_VALUE) {
                    sb.append("$");
                } else {
                    sb.append(i2);
                    AbstractC18017[] abstractC18017Arr = this.f36880;
                    if (abstractC18017Arr[i] != null) {
                        sb.append(' ');
                        sb.append(abstractC18017Arr[i].toString());
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
    public C13127(AbstractC18017[] abstractC18017Arr, int[] iArr) {
        int iM9002 = 1;
        for (AbstractC18017 abstractC18017 : abstractC18017Arr) {
            iM9002 = C4358.m9000(iM9002, abstractC18017);
        }
        for (int i : iArr) {
            iM9002 = C4358.m9002(iM9002, i);
        }
        super(C4358.m8999(iM9002, abstractC18017Arr.length * 2));
        this.f36880 = abstractC18017Arr;
        this.f36881 = iArr;
    }
}
