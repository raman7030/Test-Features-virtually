package l;

/* JADX INFO: renamed from: l.ᩴܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18802 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18177 f59341;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f59342;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43450() {
        return this.f59342 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43451(Object obj, C18177 c18177) {
        return this.f59342 == obj && this.f59341 == c18177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43452(C18177 c18177) {
        return this.f59342 != null && this.f59341 == c18177;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43453(Object obj, C18177 c18177) {
        if (m43451(obj, c18177)) {
            this.f59342 = null;
            this.f59341 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43454(Object obj, C18177 c18177) {
        if (this.f59342 != null) {
            return false;
        }
        this.f59342 = obj;
        this.f59341 = c18177;
        return true;
    }
}
