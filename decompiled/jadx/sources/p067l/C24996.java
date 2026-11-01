package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩻ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24996 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C8903 f79789;

    /* JADX INFO: renamed from: ܳ */
    public C12256 f79790;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f79791;

    public C24996(AbstractActivityC5549 abstractActivityC5549, C8903 c8903) {
        this.f79791 = abstractActivityC5549;
        this.f79789 = c8903;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f79791, R.string.MT_Protector);
        C14853 c14853 = this.f26234;
        C12826.requireNonNull(c14853);
        c14853.m33952(new RunnableC24165(3, c14853));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C20807 {
        try {
            try {
                m54897();
                if (this.f26234.m33960()) {
                    C12256 c12256 = this.f79790;
                    if (c12256 == null || !c12256.m17450()) {
                        return;
                    }
                } else {
                    try {
                        this.f26234.m33950(R.string.MT_Protector);
                        m54898();
                        if (this.f26234.m33960()) {
                            C12256 c12257 = this.f79790;
                            if (c12257 == null || !c12257.m17450()) {
                                return;
                            }
                        } else {
                            this.f26234.m33955(R.string.MT_Protector);
                            this.f79790.mo28271();
                            this.f79790.m15756();
                            if (this.f79790.m38513() != 226) {
                                throw new Exception(this.f79790.m38509());
                            }
                            C12256 c12258 = this.f79790;
                            if (c12258 == null || !c12258.m17450()) {
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
                    this.f79790.mo15741();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                C12256 c12259 = this.f79790;
                if (c12259 != null && c12259.m17450()) {
                    try {
                        this.f79790.mo15741();
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
    private void m54897() throws IOException {
        C8903 c8903 = this.f79789;
        C12256 c12256 = new C12256(!c8903.f24121, null);
        this.f79790 = c12256;
        c12256.m28269(c8903.f24126);
        this.f79790.m38512(c8903.f24119);
        C12256 c12257 = this.f79790;
        Charset.forName(c8903.f24119);
        c12257.getClass();
        this.f79790.m17442(c8903.f24122, c8903.f24123);
        if (c8903.f24125) {
            this.f79790.m15734();
            this.f79790.m35439();
            this.f79790.m35438();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m54898() throws C3924 {
        C8903 c8903 = this.f79789;
        String str = c8903.f24120;
        String str2 = c8903.f24124;
        if (str.equals("anonymous") && str2.isEmpty()) {
            str2 = "anonymous@";
        }
        if (this.f79790.m15748(str, str2)) {
            return;
        }
        StringBuilder sbM21133 = C9179.m21133(C7050.m16224(R.string.MT_Protector), ": ");
        sbM21133.append(this.f79790.m38509());
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
        this.f79791.m12259(exc, (DialogInterface.OnDismissListener) null);
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
