package l;

/* JADX INFO: renamed from: l.֡ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0136 extends C23363 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7898 f1250;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14169 f1251;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f1252;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18837 f1253;

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1215(C5557 c5557) {
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1217(C14169 c14169) {
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1216(final C9938 c9938) {
        this.f75051 = c9938;
        boolean z = this.f1252;
        C18837 c18837 = this.f1253;
        C7898 c7898 = this.f1250;
        if (z) {
            if (c9938.f30017 != null) {
                final C3440 c3440M39949 = c7898.f24472.m39949(C2609.of((Object) c9938));
                this.f75051 = c3440M39949;
                final C14169 c14169 = this.f1251;
                c18837.m43511(new Runnable(this) { // from class: l.ۘۗ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19188 c19188 = new C19188(c3440M39949, c9938);
                        C14169 c141610 = c14169;
                        c141610.f42776 = c19188.mo23617(c141610.f42776);
                    }
                });
                return;
            }
            return;
        }
        if (c9938.f30017 == null) {
            C3440 c3440M39948 = c7898.f24472.m39948();
            c3440M39948.f16086 = c7898.f24473.f66457;
            c9938.f30017 = c3440M39948;
            c18837.m43511(new Runnable() { // from class: l.ᩴۗ֨
                @Override // java.lang.Runnable
                public final void run() {
                    c9938.f30017 = null;
                }
            });
        }
    }

    public C0136(C7898 c7898, boolean z, C18837 c18837, C14169 c14169) {
        this.f1250 = c7898;
        this.f1252 = z;
        this.f1253 = c18837;
        this.f1251 = c14169;
    }
}
