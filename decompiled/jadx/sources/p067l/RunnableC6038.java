package p067l;

import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: renamed from: l.ۘۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6038 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f15121;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f15122;

    public /* synthetic */ RunnableC6038(int i, Object obj) {
        this.f15121 = i;
        this.f15122 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15121) {
            case 0:
                ((TransitionDrawable) this.f15122).startTransition(EnumC5674.f13824);
                break;
            case 1:
                ((C17869) this.f15122).m40603();
                break;
            case 2:
                ((InterfaceC19764) this.f15122).cancel();
                break;
            default:
                C18154.m41343((C18154) this.f15122);
                break;
        }
    }
}
