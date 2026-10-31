package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2227 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f7281;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7282;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f7283;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f7284;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7285;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f7286;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC2227 mo7407(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7408(int i, Object obj);

    public AbstractC2227(C19161 c19161) {
        this.f7283 = c19161;
        this.f7281 = 0;
        this.f7284 = c19161.f60377;
        this.f7285 = 0;
        this.f7282 = c19161.f60384;
        this.f7286 = false;
    }

    public AbstractC2227(C19161 c19161, int i, int i2, boolean z) {
        this.f7283 = c19161;
        this.f7285 = 0;
        this.f7281 = i;
        this.f7284 = i2;
        this.f7282 = z;
        this.f7286 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f7282;
        C19161 c19161 = this.f7283;
        if (z) {
            this.f7282 = false;
            this.f7285++;
            mo7408(c19161.f60377, obj);
            return true;
        }
        char[] cArr = c19161.f60376;
        while (true) {
            int i = this.f7281;
            if (i >= this.f7284) {
                return false;
            }
            if (cArr[i] != 0) {
                this.f7285++;
                this.f7281 = i + 1;
                mo7408(i, obj);
                return true;
            }
            this.f7281 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f7282;
        C19161 c19161 = this.f7283;
        if (z) {
            this.f7282 = false;
            this.f7285++;
            mo7408(c19161.f60377, obj);
        }
        char[] cArr = c19161.f60376;
        while (true) {
            int i = this.f7281;
            if (i >= this.f7284) {
                return;
            }
            if (cArr[i] != 0) {
                mo7408(i, obj);
                this.f7285++;
            }
            this.f7281++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f7286;
        C19161 c19161 = this.f7283;
        if (!z) {
            return c19161.f60379 - this.f7285;
        }
        int i = c19161.f60379;
        long j = i - this.f7285;
        if (c19161.f60384) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c19161.f60377)) * ((double) (this.f7284 - this.f7281)))) + (this.f7282 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC2227 m7409trySplit() {
        int i;
        int i2 = this.f7281;
        int i3 = this.f7284;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC2227 abstractC2227Mo7407 = mo7407(i2, i4, this.f7282);
        this.f7281 = i4;
        this.f7282 = false;
        this.f7286 = true;
        return abstractC2227Mo7407;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15234 m7410trySplit() {
        return (InterfaceC15234) m7409trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return (InterfaceC1124) m7409trySplit();
    }
}
