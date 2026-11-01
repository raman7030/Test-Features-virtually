package p067l;

/* JADX INFO: renamed from: l.ۨ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FAXN */
/* JADX INFO: loaded from: classes4.dex */
public class C13755 extends C14425 {
    @Override // p067l.C14425
    /* JADX INFO: renamed from: ֫ */
    public final void mo31340(Throwable th, Throwable th2) {
        C13045.m29867(th, "cause");
        C13045.m29867(th2, "exception");
        Integer num = C8390.f22503;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo31340(th, th2);
        }
    }
}
