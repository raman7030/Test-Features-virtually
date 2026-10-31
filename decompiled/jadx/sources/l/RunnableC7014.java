package l;

import java.util.Collections;

/* JADX INFO: renamed from: l.ۜ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7014 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21635;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21636 = 1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21637;

    public /* synthetic */ RunnableC7014(InterfaceC4469 interfaceC4469, String str, String str2) {
        this.f21637 = interfaceC4469;
        this.f21634 = str;
        this.f21635 = str2;
    }

    public /* synthetic */ RunnableC7014(C16560 c16560, C2075 c2075, String str) {
        this.f21637 = c16560;
        this.f21635 = c2075;
        this.f21634 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21636) {
            case 0:
                C16560.m38968((C16560) this.f21637, (C2075) this.f21635, this.f21634);
                break;
            default:
                InterfaceC4469 interfaceC4469 = (InterfaceC4469) this.f21637;
                String str = (String) this.f21635;
                interfaceC4469.mo3372(new C0941("", C19462.m44858("Override: ", this.f21634, "->", str), Collections.EMPTY_LIST));
                interfaceC4469.mo3374();
                break;
        }
    }
}
