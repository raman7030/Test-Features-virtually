package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܰۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15412 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C4209 f44072;

    /* JADX INFO: renamed from: ܳ */
    public C14267 f44073;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f44074;

    public C15412(AbstractActivityC5549 abstractActivityC5549, C4209 c4209) {
        this.f44074 = abstractActivityC5549;
        this.f44072 = c4209;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f44074, R.string.MT_Protector);
        C14853 c14853 = this.f26234;
        C12826.requireNonNull(c14853);
        c14853.m33952(new RunnableC24165(3, c14853));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C20807 {
        try {
            try {
                m35134();
                if (this.f26234.m33960()) {
                    C14267 c14267 = this.f44073;
                    if (c14267 == null || !c14267.m17450()) {
                        return;
                    }
                } else {
                    try {
                        this.f26234.m33950(R.string.MT_Protector);
                        m35135();
                        if (this.f26234.m33960()) {
                            C14267 c14268 = this.f44073;
                            if (c14268 == null || !c14268.m17450()) {
                                return;
                            }
                        } else {
                            this.f26234.m33955(R.string.MT_Protector);
                            this.f44073.mo28271();
                            this.f44073.m15756();
                            if (this.f44073.m38513() != 226) {
                                throw new Exception(this.f44073.m38509());
                            }
                            C14267 c14269 = this.f44073;
                            if (c14269 == null || !c14269.m17450()) {
                                return;
                            }
                        }
                    } catch (C3924 e) {
                        throw e;
                    } catch (C20807 e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                    }
                }
                try {
                    this.f44073.mo15741();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                C14267 c142610 = this.f44073;
                if (c142610 != null && c142610.m17450()) {
                    try {
                        this.f44073.mo15741();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            throw new Exception(C7050.m16224(R.string.MT_Protector) + ": " + e4.getMessage(), e4);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m35134() throws IOException {
        C14267 c14267 = new C14267(null);
        this.f44073 = c14267;
        C4209 c4209 = this.f44072;
        c14267.m38512(c4209.f9257);
        C14267 c14268 = this.f44073;
        Charset.forName(c4209.f9257);
        c14268.getClass();
        this.f44073.m17442(c4209.f9261, c4209.f9258);
        if (c4209.f9260) {
            this.f44073.m15734();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m35135() throws C3924 {
        C4209 c4209 = this.f44072;
        String str = c4209.f9259;
        String str2 = c4209.f9262;
        if (str.equals("anonymous") && str2.isEmpty()) {
            str2 = "anonymous@";
        }
        if (this.f44073.m15748(str, str2)) {
            return;
        }
        StringBuilder sbM21133 = C9179.m21133(C7050.m16224(R.string.MT_Protector), ": ");
        sbM21133.append(this.f44073.m38509());
        throw new C3924(sbM21133.toString());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f26234.m33960()) {
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f26234.m33960()) {
            return;
        }
        this.f44074.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f26234.m33960()) {
            return;
        }
        m22249();
    }
}
