package p067l;

import java.util.concurrent.CancellationException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܺۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17478 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C15802 f52269;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C14698 f52270;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f52271;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C13259 f52272;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ InterfaceC9768 f52273;

    /* JADX INFO: renamed from: ܳ */
    public C8427 f52274;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ String f52275;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ int f52276;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC22097 f52277;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C3397 f52278;

    public C17478(C3397 c3397, C15802 c15802, InterfaceC9768 interfaceC9768, int i, C13259 c13259, C14698 c14698, String str, boolean z, InterfaceC22097 interfaceC22097) {
        this.f52278 = c3397;
        this.f52269 = c15802;
        this.f52273 = interfaceC9768;
        this.f52276 = i;
        this.f52272 = c13259;
        this.f52270 = c14698;
        this.f52275 = str;
        this.f52271 = z;
        this.f52277 = interfaceC22097;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C3397.m5961(this.f52278);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C15802 c15802 = this.f52269;
        c15802.m35874();
        RunnableC21169 runnableC21169 = new RunnableC21169(0, c15802);
        C9729 c9729Mo28595 = this.f52273.mo28595();
        try {
            c9729Mo28595.m22746(runnableC21169);
            c15802.m35874();
            if (c9729Mo28595.m22747() != this.f52276) {
                throw new CancellationException();
            }
            C13929 c13929Matcher = this.f52272.matcher((CharSequence) c9729Mo28595);
            c13929Matcher.m31669();
            c13929Matcher.m31664(runnableC21169);
            C14698 c14698 = this.f52270;
            if (c14698 != null) {
                c13929Matcher.m56472region(c14698.f41923, c14698.f41922);
            }
            this.f52274 = C8427.m19621(c9729Mo28595, c13929Matcher, this.f52275, this.f52271, 0, false, runnableC21169, new C17380(1, this.f52277));
            c15802.m35874();
            c9729Mo28595.close();
        } catch (Throwable th) {
            try {
                c9729Mo28595.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f52269.m35869()) {
            int iCount = this.f52274.count();
            C3397 c3397 = this.f52278;
            if (iCount != 0) {
                this.f52274.m19634(c3397.f6734, this.f52273, false);
                C3397.m5945(c3397, this.f52274.count());
            } else {
                c3397.m5971(true);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f52269.m35870()) {
            boolean z = exc instanceof RuntimeException;
            C3397 c3397 = this.f52278;
            if (z) {
                if (c3397.f6734.m32421(this.f52273, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof C16150) {
                C22682.m50800(exc.getMessage());
            } else if (exc instanceof PatternSyntaxException) {
                c3397.m5944((PatternSyntaxException) exc);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C15802 c15802 = this.f52269;
        C3397 c3397 = this.f52278;
        try {
            C8427 c8427 = this.f52274;
            if (c8427 != null) {
                c8427.close();
            }
        } finally {
            c15802.m35873();
            if (c3397.f6735 == c15802) {
                c3397.f6735 = null;
            }
            C3397.m5960(c3397);
        }
    }
}
