package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4840 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public boolean f11007;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C4697 f11008;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ InterfaceC19370 f11009;

    /* JADX INFO: renamed from: ܳ */
    public String f11010;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ AbstractC5375 f11011;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC14580 f11012;

    /* JADX INFO: renamed from: ᩻ */
    public String f11013;

    public C4840(InterfaceC19370 interfaceC19370, C4697 c4697, AbstractC5375 abstractC5375, AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580) {
        this.f11009 = interfaceC19370;
        this.f11008 = c4697;
        this.f11011 = abstractC5375;
        this.f11012 = abstractDialogInterfaceOnClickListenerC14580;
        String path = interfaceC19370.getPath();
        this.f11010 = path;
        this.f11013 = C17073.m38720(4, 0, path);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f11008.m9965(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        AbstractC5375 abstractC5375 = this.f11011;
        String str = this.f11013;
        boolean zMo11747 = abstractC5375.mo11747(str);
        String str2 = this.f11010;
        if (zMo11747) {
            String strM26403 = C11419.m26403(this.f11009.getParent(), System.currentTimeMillis() + ".tmp");
            abstractC5375.mo11728(str, strM26403);
            abstractC5375.mo11728(str2, str);
            abstractC5375.mo11728(strM26403, str2);
            this.f11007 = true;
            return;
        }
        abstractC5375.mo11728(str2, str);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f11012.m33348();
        String str = this.f11013;
        String strM26414 = C11419.m26414(str);
        C4697 c4697 = this.f11008;
        c4697.m9968(strM26414);
        if (this.f11007) {
            DialogInterfaceOnClickListenerC12648.m29080(c4697.m9965(), "restore_backup", C7050.m16203(R.string.MT_Protector, C11419.m26414(str)), true);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f11008.m9965().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        this.f11008.m9953();
        C17127.m38755(this.f11011.mo11732());
    }
}
