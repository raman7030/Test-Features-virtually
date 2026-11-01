package p067l;

import java.util.Collections;

/* JADX INFO: renamed from: l.ۜ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9035 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f24515;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f24516;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f24517 = 1;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f24518;

    public /* synthetic */ RunnableC9035(InterfaceC6616 interfaceC6616, String str, String str2) {
        this.f24518 = interfaceC6616;
        this.f24515 = str;
        this.f24516 = str2;
    }

    public /* synthetic */ RunnableC9035(C18107 c18107, C4341 c4341, String str) {
        this.f24518 = c18107;
        this.f24516 = c4341;
        this.f24515 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24517) {
            case 0:
                C18107.m41194((C18107) this.f24518, (C4341) this.f24516, this.f24515);
                break;
            default:
                InterfaceC6616 interfaceC6616 = (InterfaceC6616) this.f24518;
                String str = (String) this.f24516;
                interfaceC6616.mo5691(new C3263("", C20865.m47154("Override: ", this.f24515, "->", str), Collections.EMPTY_LIST));
                interfaceC6616.mo5693();
                break;
        }
    }
}
