package p067l;

/* JADX INFO: renamed from: l.۠ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: XAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public class C9971 extends AbstractC18017 {

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC18017 f27620;

    /* JADX INFO: renamed from: ᩳ */
    public final int f27621;

    @Override // p067l.AbstractC18017
    /* JADX INFO: renamed from: ܽ */
    public int mo23283() {
        return 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9971 m23280(AbstractC18017 abstractC18017, int i) {
        if (i == Integer.MAX_VALUE && abstractC18017 == null) {
            return C22515.f71002;
        }
        return new C9971(abstractC18017, i);
    }

    @Override // p067l.AbstractC18017
    /* JADX INFO: renamed from: ֫ */
    public AbstractC18017 mo23281(int i) {
        return this.f27620;
    }

    @Override // p067l.AbstractC18017
    /* JADX INFO: renamed from: ۧ */
    public int mo23282(int i) {
        return this.f27621;
    }

    @Override // p067l.AbstractC18017
    public boolean equals(Object obj) {
        AbstractC18017 abstractC18017;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9971)) {
            return false;
        }
        if (this.f53786 != ((AbstractC18017) obj).f53786) {
            return false;
        }
        C9971 c9971 = (C9971) obj;
        return this.f27621 == c9971.f27621 && (abstractC18017 = this.f27620) != null && abstractC18017.equals(c9971.f27620);
    }

    public String toString() {
        AbstractC18017 abstractC18017 = this.f27620;
        String string = abstractC18017 != null ? abstractC18017.toString() : "";
        int length = string.length();
        int i = this.f27621;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9971(AbstractC18017 abstractC18017, int i) {
        int iM8999;
        if (abstractC18017 == null) {
            iM8999 = C4358.m8999(1, 0);
        } else {
            iM8999 = C4358.m8999(C4358.m9002(C4358.m9000(1, abstractC18017), i), 2);
        }
        super(iM8999);
        this.f27620 = abstractC18017;
        this.f27621 = i;
    }
}
