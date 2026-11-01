package p067l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3118 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Object f5670;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Cloneable f5671;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ Object f5672;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f5673;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f5674;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f5675;

    public /* synthetic */ RunnableC3118(Object obj, Object obj2, Cloneable cloneable, Object obj3, Object obj4, int i) {
        this.f5674 = i;
        this.f5675 = obj;
        this.f5673 = obj2;
        this.f5671 = cloneable;
        this.f5670 = obj3;
        this.f5672 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5674) {
            case 0:
                C13848.m31522((C13848) this.f5675, (AtomicBoolean) this.f5673, (CharSequence[]) this.f5671, (AtomicInteger) this.f5670, (AtomicReference) this.f5672);
                break;
            default:
                C15099.m34499((C15099) this.f5675, (C4036) this.f5673, (C10471) this.f5671, (AbstractC14355) this.f5670, (C5771) this.f5672);
                break;
        }
    }
}
