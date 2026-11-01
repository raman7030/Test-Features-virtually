package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17751 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f53020;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f53021;

    public /* synthetic */ RunnableC17751(int i, Object obj) {
        this.f53020 = i;
        this.f53021 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53020) {
            case 0:
                C18107.m41204((C18107) this.f53021);
                break;
            case 1:
                Iterator it = ((List) this.f53021).iterator();
                while (it.hasNext()) {
                    ((C21089) it.next()).m47648();
                }
                break;
            case 2:
                ServiceC5428.m11926((ServiceC5428) this.f53021);
                break;
            case 3:
                C7654.m17707((C7654) this.f53021);
                break;
            case 4:
                C21831.m49220((C21831) this.f53021);
                break;
            default:
                ((C9842) this.f53021).m23064();
                break;
        }
    }
}
