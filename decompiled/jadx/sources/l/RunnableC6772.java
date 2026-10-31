package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۜ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6772 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21028;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21029;

    public /* synthetic */ RunnableC6772(int i, Object obj) {
        this.f21028 = i;
        this.f21029 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21028) {
            case 0:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f21029;
                if (abstractActivityC3346 instanceof ActivityC8411) {
                    ((ActivityC8411) abstractActivityC3346).m22015(false);
                }
                break;
            case 1:
                AbstractC3179.m9750((AbstractC3179) this.f21029);
                break;
            case 2:
                ((ActivityC16012) this.f21029).m37864();
                break;
            case 3:
                C1294.m4376(((ActivityC16608) this.f21029).f51013);
                break;
            default:
                C21769.m49099((Context) this.f21029);
                break;
        }
    }
}
