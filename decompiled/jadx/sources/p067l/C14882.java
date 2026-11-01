package p067l;

/* JADX INFO: renamed from: l.۬ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes3.dex */
public class C14882 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f42436;

    /* JADX INFO: renamed from: ۧ */
    public final Object f42437;

    public C14882(Object obj, Object obj2) {
        this.f42436 = obj;
        this.f42437 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14882)) {
            return false;
        }
        C14882 c14882 = (C14882) obj;
        return C12981.m29758(this.f42436, c14882.f42436) && C12981.m29758(this.f42437, c14882.f42437);
    }

    public final int hashCode() {
        Object obj = this.f42436;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f42437;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "<" + this.f42436 + "," + this.f42437 + ">";
    }
}
