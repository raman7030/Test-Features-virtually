package l;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2407 implements InterfaceC0612, View.OnClickListener, InterfaceC0788 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18635 f7668;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f7669;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22485 f7670 = new C22485();

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2491(int i) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2495(List list) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2496(C2730 c2730) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2498(AbstractC4846 abstractC4846, int i) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2500(C11197 c11197, int i) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2501(C11902 c11902) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2503(C16134 c16134) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2504(C17546 c17546) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2505(C18958 c18958) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2506(C19664 c19664) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2507(C23896 c23896) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2508(boolean z) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo2509(int i) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo2510(int i, boolean z) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo2511(C16134 c16134) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo2512(boolean z) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo2514(boolean z) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo2516(int i) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo2517(boolean z) {
    }

    public ViewOnClickListenerC2407(C18635 c18635) {
        this.f7668 = c18635;
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2497(C4288 c4288) {
        C18635 c18635 = this.f7668;
        if (c18635.f57802 != null) {
            c18635.f57802.m1636(c4288.f13839);
        }
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2499(C6404 c6404) {
        if (c6404.equals(C6404.f19812)) {
            return;
        }
        C18635 c18635 = this.f7668;
        if (c18635.f57820 == null || c18635.f57820.mo4603() == 1) {
            return;
        }
        c18635.m43196();
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2492(int i, int i2) {
        if (Build.VERSION.SDK_INT == 34) {
            View unused = this.f7668.f57811;
        }
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ᩳ */
    public final void mo2515() {
        C18635 c18635 = this.f7668;
        if (c18635.f57803 != null) {
            c18635.f57803.setVisibility(4);
            if (c18635.m43201()) {
                C18635.m43200(c18635);
            } else {
                c18635.m43219();
            }
        }
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2502(C14017 c14017) {
        AbstractC4846 abstractC4846Mo4576;
        C18635 c18635 = this.f7668;
        InterfaceC1318 interfaceC1318 = c18635.f57820;
        interfaceC1318.getClass();
        if (interfaceC1318.mo4589(17)) {
            abstractC4846Mo4576 = interfaceC1318.mo4576();
        } else {
            abstractC4846Mo4576 = AbstractC4846.f15313;
        }
        if (abstractC4846Mo4576.m14110()) {
            this.f7669 = null;
        } else {
            boolean zMo4589 = interfaceC1318.mo4589(30);
            C22485 c22485 = this.f7670;
            if (zMo4589 && !interfaceC1318.mo4574().m33610()) {
                this.f7669 = abstractC4846Mo4576.mo14104(interfaceC1318.mo4592(), c22485, true).f72802;
            } else {
                Object obj = this.f7669;
                if (obj != null) {
                    int iMo14098 = abstractC4846Mo4576.mo14098(obj);
                    if (iMo14098 != -1) {
                        if (interfaceC1318.mo4579() == abstractC4846Mo4576.mo14104(iMo14098, c22485, false).f72806) {
                            return;
                        }
                    }
                    this.f7669 = null;
                }
            }
        }
        c18635.m43214(false);
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ܽ */
    public final void mo2513(int i) {
        C18635 c18635 = this.f7668;
        c18635.m43198();
        C18635.m43216(c18635);
        C18635.m43199(c18635);
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2494(int i, boolean z) {
        C18635 c18635 = this.f7668;
        c18635.m43198();
        C18635.m43199(c18635);
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2493(int i, C5552 c5552, C5552 c5553) {
        C18635 c18635 = this.f7668;
        if (c18635.m43205() && c18635.f57804) {
            c18635.m43231();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f7668.m43208();
    }

    @Override // l.InterfaceC0788
    /* JADX INFO: renamed from: ۧ */
    public final void mo2993() {
        this.f7668.m43215();
    }
}
