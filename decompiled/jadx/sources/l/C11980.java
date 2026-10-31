package l;

/* JADX INFO: renamed from: l.ۨ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FAXN */
/* JADX INFO: loaded from: classes4.dex */
public class C11980 extends C12685 {
    @Override // l.C12685
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo29285(Throwable th, Throwable th2) {
        C11233.m27805(th, "cause");
        C11233.m27805(th2, "exception");
        Integer num = C6335.f19630;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo29285(th, th2);
        }
    }
}
