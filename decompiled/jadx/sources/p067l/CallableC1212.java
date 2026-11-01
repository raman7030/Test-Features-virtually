package p067l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۟۫ */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC1212 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Context f25796;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ String f25797;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C1422 f25798;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ int f25799;

    public CallableC1212(String str, Context context, C1422 c1422, int i) {
        this.f25797 = str;
        this.f25796 = context;
        this.f25798 = c1422;
        this.f25799 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return C1664.m41302(this.f25797, this.f25796, this.f25798, this.f25799);
        } catch (Throwable unused) {
            return new C1384(-3);
        }
    }
}
