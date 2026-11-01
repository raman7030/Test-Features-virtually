package p067l;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: l.۟ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9413 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f25701;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f25702;

    public /* synthetic */ RunnableC9413(int i, Object obj) {
        this.f25701 = i;
        this.f25702 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25701;
        Object obj = this.f25702;
        switch (i) {
            case 0:
                C14146.m32311((C14146) obj);
                break;
            case 1:
                ((C1326) obj).collapseActionView();
                break;
            case 2:
                C6808.m15604((Runnable) obj);
                break;
            case 3:
                ((C2628) obj).close();
                break;
            case 4:
                AbstractC16864.m38413((AbstractC16864) obj);
                break;
            case 5:
                ((MediaPlayer) obj).release();
                break;
            case 6:
                C24905 c24905 = (C24905) obj;
                int i2 = ActivityC12088.f33683;
                if (c24905 != null) {
                    c24905.close();
                }
                break;
            default:
                ActivityC3244.m5623((ActivityC3244) obj);
                break;
        }
    }
}
