package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5622 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17394;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17395;

    public /* synthetic */ RunnableC5622(int i, Object obj) {
        this.f17394 = i;
        this.f17395 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17394) {
            case 0:
                ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = (ViewOnLayoutChangeListenerC7738) this.f17395;
                viewOnLayoutChangeListenerC7738.f23945.m29307(49, viewOnLayoutChangeListenerC7738.f23940.getHeight() - viewOnLayoutChangeListenerC7738.m10241(R.id.MT_Protector).getHeight(), true);
                break;
            case 1:
                ((C16310) this.f17395).m38377();
                break;
            case 2:
                C3885.m11724((C3885) this.f17395);
                break;
            default:
                ((InterfaceC17664) this.f17395).close();
                break;
        }
    }
}
