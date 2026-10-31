package l;

import android.media.metrics.PlaybackMetrics;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Q7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2180 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7176;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7177;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7178;

    public /* synthetic */ RunnableC2180(int i, Object obj, Object obj2) {
        this.f7177 = i;
        this.f7178 = obj;
        this.f7176 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7177) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f7178;
                C2450 c2450 = (C2450) this.f7176;
                ((C10211) arrayList.get(0)).m25619();
                ((C10211) arrayList.get(1)).m25619();
                AbstractC15440 abstractC15440M25622 = ((C10211) arrayList.get(0)).m25622();
                AbstractC15440 abstractC15440M25623 = ((C10211) arrayList.get(1)).m25622();
                C7309 c7309 = new C7309(abstractC15440M25622, abstractC15440M25623, abstractC15440M25622.mo23554(), abstractC15440M25623.mo23554(), c2450.m7922(), c2450.m7922());
                C16560 c16560M7921 = c2450.m7921();
                c7309.m19593();
                C19738.m45446(c16560M7921, c7309);
                break;
            case 1:
                ((C11715) this.f7178).f34960.reportPlaybackMetrics((PlaybackMetrics) this.f7176);
                break;
            case 2:
                C10833.m27079((C10833) this.f7178, (C3519) this.f7176);
                break;
            default:
                InterfaceC21403 interfaceC21403 = (InterfaceC21403) this.f7178;
                C22108 c22108 = (C22108) this.f7176;
                interfaceC21403.mo22512(c22108.f71772, c22108.f71773);
                interfaceC21403.mo22514();
                break;
        }
    }
}
