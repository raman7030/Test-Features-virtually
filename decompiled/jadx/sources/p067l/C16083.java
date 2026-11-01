package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16083 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f47325;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C18107 f47326;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f47327;

    /* JADX INFO: renamed from: ܳ */
    public C12744 f47328;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f47329;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C7367 f47330;

    public C16083(C7367 c7367, C18107 c18107, String str, boolean z, String str2) {
        this.f47330 = c7367;
        this.f47326 = c18107;
        this.f47327 = str;
        this.f47325 = z;
        this.f47329 = str2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f47328 = this.f47326.m41253();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C16150, IOException {
        C7367 c7367 = this.f47330;
        AbstractC5375 abstractC5375Mo8217 = c7367.mo8217();
        String str = this.f47327;
        if (abstractC5375Mo8217.mo11747(str)) {
            throw new C16150(R.string.MT_Protector);
        }
        if (this.f47325) {
            c7367.mo8217().mo11746(str);
        } else {
            c7367.mo8217().mo11737(0L, str).close();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f47326.m41279(this.f47329);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f47326.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f47328.m29269();
        C17127.m38755(this.f47330.mo8217().mo11732());
    }
}
