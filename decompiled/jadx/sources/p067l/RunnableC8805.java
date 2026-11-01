package p067l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۜ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8805 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23902;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f23903;

    public /* synthetic */ RunnableC8805(int i, Object obj) {
        this.f23902 = i;
        this.f23903 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23902) {
            case 0:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f23903;
                if (abstractActivityC5549 instanceof ActivityC10363) {
                    ((ActivityC10363) abstractActivityC5549).m23985(false);
                }
                break;
            case 1:
                AbstractC5390.m11794((AbstractC5390) this.f23903);
                break;
            case 2:
                ((ActivityC17586) this.f23903).m40050();
                break;
            case 3:
                C0906.m55813(((ActivityC18153) this.f23903).f54190);
                break;
            default:
                C23058.m51449((Context) this.f23903);
                break;
        }
    }
}
