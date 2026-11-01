package p067l;

/* JADX INFO: renamed from: l.ܳ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: YATV */
/* JADX INFO: loaded from: classes3.dex */
public final class C15879 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f45974;

    /* JADX INFO: renamed from: ۧ */
    public Object f45975;

    /* JADX INFO: renamed from: ܽ */
    public final C15879 f45976;

    /* JADX INFO: renamed from: ᩳ */
    public transient String f45977;

    public C15879(C15879 c15879, Object obj, Object obj2) {
        this.f45976 = c15879;
        this.f45975 = obj;
        this.f45974 = obj2;
    }

    public final String toString() {
        if (this.f45977 == null) {
            C15879 c15879 = this.f45976;
            if (c15879 == null) {
                this.f45977 = "$";
            } else {
                Object obj = this.f45974;
                if (obj instanceof Integer) {
                    this.f45977 = c15879.toString() + "[" + obj + "]";
                } else {
                    this.f45977 = c15879.toString() + "." + obj;
                }
            }
        }
        return this.f45977;
    }
}
