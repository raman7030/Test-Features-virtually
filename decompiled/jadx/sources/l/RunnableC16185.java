package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16185 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49854;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49855;

    public /* synthetic */ RunnableC16185(int i, Object obj) {
        this.f49854 = i;
        this.f49855 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49854) {
            case 0:
                C16560.m38978((C16560) this.f49855);
                break;
            case 1:
                Iterator it = ((List) this.f49855).iterator();
                while (it.hasNext()) {
                    ((C19697) it.next()).m45351();
                }
                break;
            case 2:
                ServiceC3219.m9879((ServiceC3219) this.f49855);
                break;
            case 3:
                C5561.m15792((C5561) this.f49855);
                break;
            case 4:
                C20478.m46897((C20478) this.f49855);
                break;
            default:
                ((C7864) this.f49855).m21099();
                break;
        }
    }
}
