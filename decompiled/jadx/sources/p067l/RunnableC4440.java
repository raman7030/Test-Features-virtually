package p067l;

import android.media.metrics.PlaybackMetrics;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Q7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4440 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f9961;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f9962;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f9963;

    public /* synthetic */ RunnableC4440(int i, Object obj, Object obj2) {
        this.f9962 = i;
        this.f9963 = obj;
        this.f9961 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9962) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f9963;
                C4697 c4697 = (C4697) this.f9961;
                ((C12073) arrayList.get(0)).m27641();
                ((C12073) arrayList.get(1)).m27641();
                AbstractC17043 abstractC17043M27644 = ((C12073) arrayList.get(0)).m27644();
                AbstractC17043 abstractC17043M27645 = ((C12073) arrayList.get(1)).m27644();
                C9315 c9315 = new C9315(abstractC17043M27644, abstractC17043M27645, abstractC17043M27644.mo25505(), abstractC17043M27645.mo25505(), c4697.m9970(), c4697.m9970());
                C18107 c18107M9969 = c4697.m9969();
                c9315.m21561();
                C21128.m47750(c18107M9969, c9315);
                break;
            case 1:
                ((C13502) this.f9963).f37960.reportPlaybackMetrics((PlaybackMetrics) this.f9961);
                break;
            case 2:
                C12664.m29124((C12664) this.f9963, (C5713) this.f9961);
                break;
            default:
                InterfaceC22710 interfaceC22710 = (InterfaceC22710) this.f9963;
                C23380 c23380 = (C23380) this.f9961;
                interfaceC22710.mo24481(c23380.f74494, c23380.f74495);
                interfaceC22710.mo24483();
                break;
        }
    }
}
