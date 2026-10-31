package l;

/* JADX INFO: renamed from: l.ܳۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAU5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14485 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44376;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f44377;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f44378;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14485 f44379;

    public C14485(C14485 c14485, Object obj, Object obj2, int i) {
        this.f44379 = c14485;
        this.f44378 = obj;
        this.f44377 = obj2;
        this.f44376 = i;
    }

    public final String toString() {
        C14485 c14485 = this.f44379;
        if (c14485 == null) {
            return "$";
        }
        Object obj = this.f44377;
        if (obj instanceof Integer) {
            return c14485.toString() + "[" + obj + "]";
        }
        return c14485.toString() + "." + obj;
    }
}
