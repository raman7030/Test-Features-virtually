package l;

import android.os.Process;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1126 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4098;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4099;

    public /* synthetic */ RunnableC1126(int i, Object obj) {
        this.f4098 = i;
        this.f4099 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4098;
        Object obj = this.f4099;
        switch (i) {
            case 0:
                int i2 = ActivityC17169.f52595;
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((AbstractC15440) it.next()).mo23552();
                }
                break;
            case 1:
                ActivityC0737 activity = ((C22372) obj).getActivity();
                if (activity != null) {
                    ((ActivityC16315) activity).m38459(R.layout.MT_Protector);
                }
                break;
            case 2:
                ((C5561) obj).f17238.m52058(true);
                break;
            case 3:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                break;
            case 4:
                ((AbstractC20250) obj).cancel();
                break;
            default:
                ((ActivityC4232) obj).m12731();
                break;
        }
    }
}
