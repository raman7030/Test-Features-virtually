package l;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: l.۟ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7412 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22789;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22790;

    public /* synthetic */ RunnableC7412(int i, Object obj) {
        this.f22789 = i;
        this.f22790 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22789;
        Object obj = this.f22790;
        switch (i) {
            case 0:
                C12392.m30247((C12392) obj);
                break;
            case 1:
                ((C9762) obj).collapseActionView();
                break;
            case 2:
                C4671.m13729((Runnable) obj);
                break;
            case 3:
                ((C0273) obj).close();
                break;
            case 4:
                AbstractC15252.m36252((AbstractC15252) obj);
                break;
            case 5:
                ((MediaPlayer) obj).release();
                break;
            case 6:
                C23713 c23713 = (C23713) obj;
                int i2 = ActivityC10227.f30722;
                if (c23713 != null) {
                    c23713.close();
                }
                break;
            default:
                ActivityC0921.m3304((ActivityC0921) obj);
                break;
        }
    }
}
