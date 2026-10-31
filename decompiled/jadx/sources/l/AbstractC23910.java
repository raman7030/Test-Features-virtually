package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23910 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f77303;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77304;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f77305;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f77306;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f77307;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f77308;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC23910 mo33603(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo33604(int i, Object obj);

    public AbstractC23910(C9800 c9800) {
        this.f77305 = c9800;
        this.f77303 = 0;
        this.f77306 = c9800.f29627;
        this.f77307 = 0;
        this.f77304 = c9800.f29634;
        this.f77308 = false;
    }

    public AbstractC23910(C9800 c9800, int i, int i2, boolean z) {
        this.f77305 = c9800;
        this.f77307 = 0;
        this.f77303 = i;
        this.f77306 = i2;
        this.f77304 = z;
        this.f77308 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f77304;
        C9800 c9800 = this.f77305;
        if (z) {
            this.f77304 = false;
            this.f77307++;
            mo33604(c9800.f29627, obj);
            return true;
        }
        Object[] objArr = c9800.f29626;
        while (true) {
            int i = this.f77303;
            if (i >= this.f77306) {
                return false;
            }
            if (objArr[i] != null) {
                this.f77307++;
                this.f77303 = i + 1;
                mo33604(i, obj);
                return true;
            }
            this.f77303 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f77304;
        C9800 c9800 = this.f77305;
        if (z) {
            this.f77304 = false;
            this.f77307++;
            mo33604(c9800.f29627, obj);
        }
        Object[] objArr = c9800.f29626;
        while (true) {
            int i = this.f77303;
            if (i >= this.f77306) {
                return;
            }
            if (objArr[i] != null) {
                mo33604(i, obj);
                this.f77307++;
            }
            this.f77303++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f77308;
        C9800 c9800 = this.f77305;
        if (!z) {
            return c9800.f29629 - this.f77307;
        }
        int i = c9800.f29629;
        long j = i - this.f77307;
        if (c9800.f29634) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c9800.f29627)) * ((double) (this.f77306 - this.f77303)))) + (this.f77304 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC23910 m52665trySplit() {
        int i;
        int i2 = this.f77303;
        int i3 = this.f77306;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC23910 abstractC23910Mo33603 = mo33603(i2, i4, this.f77304);
        this.f77303 = i4;
        this.f77304 = false;
        this.f77308 = true;
        return abstractC23910Mo33603;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15234 m52663trySplit() {
        return (InterfaceC15234) m52665trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return (InterfaceC1124) m52665trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18764 m52664trySplit() {
        return (InterfaceC18764) m52665trySplit();
    }
}
