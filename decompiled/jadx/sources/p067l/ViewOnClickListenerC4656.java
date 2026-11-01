package p067l;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4656 implements InterfaceC2950, View.OnClickListener, InterfaceC3117 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C20079 f10459;

    /* JADX INFO: renamed from: ᩸ */
    public Object f10460;

    /* JADX INFO: renamed from: ᩹ */
    public final C23738 f10461 = new C23738();

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4847(int i) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4851(List list) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4852(C4963 c4963) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4854(AbstractC6974 abstractC6974, int i) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4856(C13010 c13010, int i) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4857(C13680 c13680) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4859(C17702 c17702) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4860(C19044 c19044) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4861(C20386 c20386) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4862(C21057 c21057) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4863(C25079 c25079) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4864(boolean z) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4865(int i) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4866(int i, boolean z) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4867(C17702 c17702) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4868(boolean z) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo4870(boolean z) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo4872(int i) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo4873(boolean z) {
    }

    public ViewOnClickListenerC4656(C20079 c20079) {
        this.f10459 = c20079;
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4853(C6443 c6443) {
        C20079 c20079 = this.f10459;
        if (c20079.f61025 != null) {
            c20079.f61025.m4036(c6443.f16655);
        }
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4855(C8454 c8454) {
        if (c8454.equals(C8454.f22684)) {
            return;
        }
        C20079 c20079 = this.f10459;
        if (c20079.f61043 == null || c20079.f61043.mo6835() == 1) {
            return;
        }
        c20079.m45462();
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4848(int i, int i2) {
        if (Build.VERSION.SDK_INT == 34) {
            View unused = this.f10459.f61034;
        }
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4871() {
        C20079 c20079 = this.f10459;
        if (c20079.f61026 != null) {
            c20079.f61026.setVisibility(4);
            if (c20079.m45467()) {
                C20079.m45466(c20079);
            } else {
                c20079.m45485();
            }
        }
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4858(C15690 c15690) {
        AbstractC6974 abstractC6974Mo6808;
        C20079 c20079 = this.f10459;
        InterfaceC3621 interfaceC3621 = c20079.f61043;
        interfaceC3621.getClass();
        if (interfaceC3621.mo6821(17)) {
            abstractC6974Mo6808 = interfaceC3621.mo6808();
        } else {
            abstractC6974Mo6808 = AbstractC6974.f18145;
        }
        if (abstractC6974Mo6808.m15990()) {
            this.f10460 = null;
        } else {
            boolean zMo6821 = interfaceC3621.mo6821(30);
            C23738 c23738 = this.f10461;
            if (zMo6821 && !interfaceC3621.mo6806().m35730()) {
                this.f10460 = abstractC6974Mo6808.mo15984(interfaceC3621.mo6824(), c23738, true).f75528;
            } else {
                Object obj = this.f10460;
                if (obj != null) {
                    int iMo15978 = abstractC6974Mo6808.mo15978(obj);
                    if (iMo15978 != -1) {
                        if (interfaceC3621.mo6811() == abstractC6974Mo6808.mo15984(iMo15978, c23738, false).f75532) {
                            return;
                        }
                    }
                    this.f10460 = null;
                }
            }
        }
        c20079.m45480(false);
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ܽ */
    public final void mo4869(int i) {
        C20079 c20079 = this.f10459;
        c20079.m45464();
        C20079.m45482(c20079);
        C20079.m45465(c20079);
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4850(int i, boolean z) {
        C20079 c20079 = this.f10459;
        c20079.m45464();
        C20079.m45465(c20079);
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4849(int i, C7645 c7645, C7645 c7646) {
        C20079 c20079 = this.f10459;
        if (c20079.m45471() && c20079.f61027) {
            c20079.m45497();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f10459.m45474();
    }

    @Override // p067l.InterfaceC3117
    /* JADX INFO: renamed from: ۧ */
    public final void mo5322() {
        this.f10459.m45481();
    }
}
