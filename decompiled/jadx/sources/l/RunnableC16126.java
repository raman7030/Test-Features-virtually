package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16126 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f49690;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49691;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49692;

    public /* synthetic */ RunnableC16126(Object obj, Serializable serializable, int i) {
        this.f49691 = i;
        this.f49692 = obj;
        this.f49690 = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f49691) {
            case 0:
                C19656.m45174((C19656) this.f49692, (Throwable) this.f49690);
                break;
            default:
                C1478.m5114((C1478) this.f49692, (String) this.f49690);
                break;
        }
    }
}
