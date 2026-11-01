package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩺۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24082 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC4544 f76463;

    /* JADX INFO: renamed from: ᩸ */
    public final List f76464;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C15364 f76465;

    public RunnableC24082(C15364 c15364, ArrayList arrayList, C6517 c6517) {
        this.f76465 = c15364;
        this.f76464 = arrayList;
        this.f76463 = c6517;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f76464;
        C15364 c15364 = this.f76465;
        c15364.f43894.lock();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC17043) list.get(i)).mo20486(this.f76463.getLong(i));
            }
            c15364.f43894.unlock();
        } catch (Throwable th) {
            c15364.f43894.unlock();
            throw th;
        }
    }
}
