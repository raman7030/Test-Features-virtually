package l;

import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19263 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f60636;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f60637 = C16293.f50120.m36526("Android/mt_install_tmp.apk");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Intent f60638;

    public C19263(C10671 c10671, Intent intent) {
        this.f60636 = c10671;
        this.f60638 = intent;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44446(C19263 c19263) {
        c19263.f23322.m31860((Runnable) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20269(this.f60636.f32087, R.string.MT_Protector, 300, new Runnable() { // from class: l.ᩴۚܿ
            @Override // java.lang.Runnable
            public final void run() {
                C19263.m44446(this.f57594);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m44447(C19263 c19263) {
        C13136 c13136 = c19263.f23322;
        return c13136 != null && c13136.m31868();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        this.f60636.f32088.m36500(this.f60637, (C17558) null, new InterfaceC5627() { // from class: l.ۘۚܿ
            @Override // l.InterfaceC5627
            /* JADX INFO: renamed from: ᩷֫ */
            public final /* synthetic */ void mo1648() {
                throw null;
            }

            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo1526() {
                return C19263.m44447(this.f11812);
            }
        });
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C13136 c13136 = this.f23322;
        AbstractC15440 abstractC15440 = this.f60637;
        if (c13136 != null && c13136.m31868()) {
            abstractC15440.mo27929();
            return;
        }
        Uri uriM36522 = abstractC15440.m36522();
        Intent intent = this.f60638;
        intent.setDataAndType(uriM36522, "application/vnd.android.package-archive");
        this.f60636.m26775(intent);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f60636.m26776(exc);
        this.f60637.mo27929();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
