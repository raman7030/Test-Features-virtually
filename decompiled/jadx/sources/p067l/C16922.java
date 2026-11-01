package p067l;

/* JADX INFO: renamed from: l.ܶܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16922 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f50093 = false;

    /* JADX INFO: renamed from: ۧ */
    public boolean f50092 = false;

    /* JADX INFO: renamed from: ֫ */
    public boolean f50091 = true;

    /* JADX INFO: renamed from: ֫ */
    public final void m38499(C19561 c19561) {
        C5738 entry = c19561.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            this.f50093 = false;
            this.f50092 = false;
            return;
        }
        try {
            C16820 c16820M38130 = C16820.m38130(c19561.m44448(entry));
            this.f50093 = C23527.m52310(c16820M38130);
            this.f50092 = C23527.m52312(c16820M38130);
        } catch (Throwable unused) {
            this.f50093 = false;
            this.f50092 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38500(byte[] bArr) {
        try {
            C16820 c16820M38138 = C16820.m38138(bArr);
            this.f50093 = C23527.m52310(c16820M38138);
            this.f50092 = C23527.m52312(c16820M38138);
        } catch (Exception unused) {
            this.f50093 = false;
            this.f50092 = false;
        }
    }
}
