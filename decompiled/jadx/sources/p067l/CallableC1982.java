package p067l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩺۫ */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1982 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Context f76731;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ String f76732;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C1422 f76733;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ int f76734;

    public CallableC1982(String str, Context context, C1422 c1422, int i) {
        this.f76732 = str;
        this.f76731 = context;
        this.f76733 = c1422;
        this.f76734 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C1664.m41302(this.f76732, this.f76731, this.f76733, this.f76734);
    }
}
