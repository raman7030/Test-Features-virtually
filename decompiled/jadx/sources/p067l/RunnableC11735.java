package p067l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11735 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC5029 f32771;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32772;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f32773;

    public /* synthetic */ RunnableC11735(int i, String str, InterfaceC5029 interfaceC5029) {
        this.f32772 = i;
        this.f32773 = str;
        this.f32771 = interfaceC5029;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f32773;
        int i = this.f32772;
        InterfaceC5029 interfaceC5029 = this.f32771;
        if (i > 0) {
            try {
                SystemClock.sleep(i);
            } catch (IOException e) {
                C7050.m16212(new RunnableC11064(0, interfaceC5029, e));
                return;
            } catch (Throwable th) {
                C7050.m16212(new RunnableC17768(0, interfaceC5029, th));
                return;
            }
        }
        C7050.m16212(new RunnableC12711(4, interfaceC5029, C6370.m14577(str)));
    }
}
