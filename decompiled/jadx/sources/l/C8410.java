package l;

/* JADX INFO: renamed from: l.۠᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8410 extends C5588 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25763 = 0;

    public final int hashCode() {
        char last = getLast();
        if (1 >= last && 1 != last) {
            return -1;
        }
        return getLast() + 31;
    }

    public final boolean equals(Object obj) {
        char last;
        if (!(obj instanceof C8410)) {
            return false;
        }
        char last2 = getLast();
        return (1 >= last2 && 1 != last2 && 1 >= (last = ((C8410) obj).getLast()) && 1 != last) || getLast() == ((C8410) obj).getLast();
    }

    public final String toString() {
        return "\u0001.." + getLast();
    }

    static {
        new C8410();
    }
}
