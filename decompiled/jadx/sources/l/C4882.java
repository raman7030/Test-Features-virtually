package l;

/* JADX INFO: renamed from: l.ۙ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4882 extends C22521 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C4882 f15426 = new C4882(1, 0, 1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15427 = 0;

    @Override // l.C22521
    public final boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // l.C22521
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4882)) {
            return false;
        }
        if (isEmpty() && ((C4882) obj).isEmpty()) {
            return true;
        }
        C4882 c4882 = (C4882) obj;
        return getFirst() == c4882.getFirst() && getLast() == c4882.getLast();
    }

    @Override // l.C22521
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getLast() + (getFirst() * 31);
    }

    @Override // l.C22521
    public final String toString() {
        return getFirst() + ".." + getLast();
    }
}
