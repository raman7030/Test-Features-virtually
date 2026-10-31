package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩺۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22847 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC2289 f73731;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f73732;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13674 f73733;

    public RunnableC22847(C13674 c13674, ArrayList arrayList, C4365 c4365) {
        this.f73733 = c13674;
        this.f73732 = arrayList;
        this.f73731 = c4365;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f73732;
        C13674 c13674 = this.f73733;
        c13674.f40813.lock();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC15440) list.get(i)).mo18537(this.f73731.getLong(i));
            }
            c13674.f40813.unlock();
        } catch (Throwable th) {
            c13674.f40813.unlock();
            throw th;
        }
    }
}
