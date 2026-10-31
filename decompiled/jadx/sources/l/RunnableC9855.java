package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9855 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2799 f29818;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29819;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f29820;

    public /* synthetic */ RunnableC9855(int i, String str, InterfaceC2799 interfaceC2799) {
        this.f29819 = i;
        this.f29820 = str;
        this.f29818 = interfaceC2799;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f29820;
        int i = this.f29819;
        InterfaceC2799 interfaceC2799 = this.f29818;
        if (i > 0) {
            try {
                SystemClock.sleep(i);
            } catch (IOException e) {
                C4925.m14315(new RunnableC9149(0, interfaceC2799, e));
                return;
            } catch (Throwable th) {
                C4925.m14315(new RunnableC16203(0, interfaceC2799, th));
                return;
            }
        }
        C4925.m14315(new RunnableC10882(4, interfaceC2799, C4210.m12701(str)));
    }
}
