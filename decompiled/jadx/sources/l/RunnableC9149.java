package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9149 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27691;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27692;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27693;

    public /* synthetic */ RunnableC9149(int i, Object obj, Object obj2) {
        this.f27692 = i;
        this.f27693 = obj;
        this.f27691 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27692) {
            case 0:
                ((InterfaceC2799) this.f27693).mo8644((IOException) this.f27691);
                break;
            case 1:
                C10632.m26672((C10632) this.f27693, (Class) this.f27691);
                break;
            case 2:
                C5921.m16591((C5921) this.f27693, (C16971) this.f27691);
                break;
            default:
                ViewOnClickListenerC7528.m20195((ViewOnClickListenerC7528) this.f27693, (Runnable) this.f27691);
                break;
        }
    }
}
