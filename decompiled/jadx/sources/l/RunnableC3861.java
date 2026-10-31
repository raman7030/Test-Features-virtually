package l;

import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: renamed from: l.ۘۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3861 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12314;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12315;

    public /* synthetic */ RunnableC3861(int i, Object obj) {
        this.f12314 = i;
        this.f12315 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12314) {
            case 0:
                ((TransitionDrawable) this.f12315).startTransition(EnumC3478.f11019);
                break;
            case 1:
                ((C16310) this.f12315).m38388();
                break;
            case 2:
                ((InterfaceC18303) this.f12315).cancel();
                break;
            default:
                C16609.m39116((C16609) this.f12315);
                break;
        }
    }
}
