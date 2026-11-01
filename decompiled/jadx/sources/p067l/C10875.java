package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10875 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C17579 f30132;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ String f30133;

    public C10875(C17579 c17579, String str) {
        this.f30132 = c17579;
        this.f30133 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f30132.f52541.m9965(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C17579 c17579 = this.f30132;
        AbstractC5375 abstractC5375 = c17579.f52540;
        InterfaceC19370 interfaceC19370 = c17579.f52536;
        String path = interfaceC19370.getPath();
        String parent = interfaceC19370.getParent();
        String str = this.f30133;
        String strM26403 = C11419.m26403(parent, str);
        if (c17579.f52538 && str.equalsIgnoreCase(c17579.f52539)) {
            String strM26404 = C11419.m26403(interfaceC19370.getParent(), System.currentTimeMillis() + ".tmp");
            abstractC5375.mo11728(path, strM26404);
            abstractC5375.mo11728(strM26404, strM26403);
            return;
        }
        abstractC5375.mo11728(path, strM26403);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C17579 c17579 = this.f30132;
        c17579.f52541.m9968(this.f30133);
        c17579.m33348();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f30132.f52541.m9965().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        C17127.m38755(this.f30132.f52540.mo11732());
    }
}
