package p067l;

import android.os.Process;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3439 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f6868;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f6869;

    public /* synthetic */ RunnableC3439(int i, Object obj) {
        this.f6868 = i;
        this.f6869 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6868;
        Object obj = this.f6869;
        switch (i) {
            case 0:
                int i2 = ActivityC18686.f55776;
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((AbstractC17043) it.next()).mo25503();
                }
                break;
            case 1:
                ActivityC3069 activity = ((C23631) obj).getActivity();
                if (activity != null) {
                    ((ActivityC17874) activity).m40674(R.layout.MT_Protector);
                }
                break;
            case 2:
                ((C7654) obj).f20078.m54461(true);
                break;
            case 3:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                break;
            case 4:
                ((AbstractC21614) obj).cancel();
                break;
            default:
                ((ActivityC6391) obj).m14607();
                break;
        }
    }
}
