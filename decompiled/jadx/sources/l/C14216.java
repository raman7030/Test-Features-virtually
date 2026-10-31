package l;

/* JADX INFO: renamed from: l.ܳ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: YATV */
/* JADX INFO: loaded from: classes3.dex */
public final class C14216 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f42884;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f42885;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14216 f42886;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient String f42887;

    public C14216(C14216 c14216, Object obj, Object obj2) {
        this.f42886 = c14216;
        this.f42885 = obj;
        this.f42884 = obj2;
    }

    public final String toString() {
        if (this.f42887 == null) {
            C14216 c14216 = this.f42886;
            if (c14216 == null) {
                this.f42887 = "$";
            } else {
                Object obj = this.f42884;
                if (obj instanceof Integer) {
                    this.f42887 = c14216.toString() + "[" + obj + "]";
                } else {
                    this.f42887 = c14216.toString() + "." + obj;
                }
            }
        }
        return this.f42887;
    }
}
