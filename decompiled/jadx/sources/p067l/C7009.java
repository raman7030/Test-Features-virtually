package p067l;

/* JADX INFO: renamed from: l.ۙ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7009 extends C23773 {

    /* JADX INFO: renamed from: ۗ */
    public static final C7009 f18261 = new C7009(1, 0, 1);

    /* JADX INFO: renamed from: ۙ */
    public static final /* synthetic */ int f18262 = 0;

    @Override // p067l.C23773
    public final boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // p067l.C23773
    public final boolean equals(Object obj) {
        if (!(obj instanceof C7009)) {
            return false;
        }
        if (isEmpty() && ((C7009) obj).isEmpty()) {
            return true;
        }
        C7009 c7009 = (C7009) obj;
        return getFirst() == c7009.getFirst() && getLast() == c7009.getLast();
    }

    @Override // p067l.C23773
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getLast() + (getFirst() * 31);
    }

    @Override // p067l.C23773
    public final String toString() {
        return getFirst() + ".." + getLast();
    }
}
