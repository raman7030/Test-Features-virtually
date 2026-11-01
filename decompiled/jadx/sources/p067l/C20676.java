package p067l;

import android.content.Intent;
import android.net.Uri;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20676 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C12510 f63866;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC17043 f63867 = C17853.f53287.m38684("Android/mt_install_tmp.apk");

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ Intent f63868;

    public C20676(C12510 c12510, Intent intent) {
        this.f63866 = c12510;
        this.f63868 = intent;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46740(C20676 c20676) {
        c20676.f26234.m33952((Runnable) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22245(this.f63866.f35058, R.string.MT_Protector, 300, new Runnable() { // from class: l.ᩴۚܿ
            @Override // java.lang.Runnable
            public final void run() {
                C20676.m46740(this.f60817);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m46741(C20676 c20676) {
        C14853 c14853 = c20676.f26234;
        return c14853 != null && c14853.m33960();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        this.f63866.f35059.m38658(this.f63867, (C19056) null, new InterfaceC7717() { // from class: l.ۘۚܿ
            @Override // p067l.InterfaceC7717
            /* JADX INFO: renamed from: ᩷֫ */
            public final /* synthetic */ void mo4048() {
                throw null;
            }

            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                return C20676.m46741(this.f14619);
            }
        });
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C14853 c14853 = this.f26234;
        AbstractC17043 abstractC17043 = this.f63867;
        if (c14853 != null && c14853.m33960()) {
            abstractC17043.mo29990();
            return;
        }
        Uri uriM38680 = abstractC17043.m38680();
        Intent intent = this.f63868;
        intent.setDataAndType(uriM38680, "application/vnd.android.package-archive");
        this.f63866.m28814(intent);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f63866.m28815(exc);
        this.f63867.mo29990();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
