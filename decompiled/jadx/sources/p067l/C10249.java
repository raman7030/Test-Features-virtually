package p067l;

/* JADX INFO: renamed from: l.۠ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10249 implements InterfaceC4885 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16953 f28385;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C18139 f28386;

    public C10249(C16953 c16953, C18139 c18139) {
        this.f28385 = c16953;
        this.f28386 = c18139;
    }

    @Override // p067l.InterfaceC4885
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10364(C18139 c18139) {
        C18139 c181310 = this.f28386;
        boolean zM41320 = c18139.m41320(c181310);
        C16953 c16953M38536 = this.f28385;
        if (!zM41320) {
            C16953.f50142.mo9182(c18139.m41319(), "Re-routing the connection to host {}");
            c16953M38536 = c16953M38536.m38536(c18139);
        }
        if (c18139.m41322(c181310)) {
            return null;
        }
        return c16953M38536.m38534(c18139.m41323());
    }
}
