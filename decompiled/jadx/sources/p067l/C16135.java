package p067l;

/* JADX INFO: renamed from: l.ܳۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAU5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16135 {

    /* JADX INFO: renamed from: ֫ */
    public final int f47477;

    /* JADX INFO: renamed from: ۧ */
    public final Object f47478;

    /* JADX INFO: renamed from: ܽ */
    public final Object f47479;

    /* JADX INFO: renamed from: ᩳ */
    public final C16135 f47480;

    public C16135(C16135 c16135, Object obj, Object obj2, int i) {
        this.f47480 = c16135;
        this.f47479 = obj;
        this.f47478 = obj2;
        this.f47477 = i;
    }

    public final String toString() {
        C16135 c16135 = this.f47480;
        if (c16135 == null) {
            return "$";
        }
        Object obj = this.f47478;
        if (obj instanceof Integer) {
            return c16135.toString() + "[" + obj + "]";
        }
        return c16135.toString() + "." + obj;
    }
}
