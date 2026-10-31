package l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0789 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2898;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Cloneable f2899;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2900;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2901;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2902;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2903;

    public /* synthetic */ RunnableC0789(Object obj, Object obj2, Cloneable cloneable, Object obj3, Object obj4, int i) {
        this.f2902 = i;
        this.f2903 = obj;
        this.f2901 = obj2;
        this.f2899 = cloneable;
        this.f2898 = obj3;
        this.f2900 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2902) {
            case 0:
                C12079.m29460((C12079) this.f2903, (AtomicBoolean) this.f2901, (CharSequence[]) this.f2899, (AtomicInteger) this.f2898, (AtomicReference) this.f2900);
                break;
            default:
                C13395.m32397((C13395) this.f2903, (C1755) this.f2901, (C8526) this.f2899, (AbstractC12612) this.f2898, (C3581) this.f2900);
                break;
        }
    }
}
