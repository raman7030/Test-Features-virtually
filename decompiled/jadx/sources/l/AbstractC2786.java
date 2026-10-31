package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2786 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f8682;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f8683;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f8684;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f8685;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f8686;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f8687;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC2786 mo8612(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo8613(int i, Object obj);

    public AbstractC2786(C19720 c19720) {
        this.f8684 = c19720;
        this.f8682 = 0;
        this.f8685 = c19720.f63730;
        this.f8686 = 0;
        this.f8683 = c19720.f63737;
        this.f8687 = false;
    }

    public AbstractC2786(C19720 c19720, int i, int i2, boolean z) {
        this.f8684 = c19720;
        this.f8686 = 0;
        this.f8682 = i;
        this.f8685 = i2;
        this.f8683 = z;
        this.f8687 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f8683;
        C19720 c19720 = this.f8684;
        if (z) {
            this.f8683 = false;
            this.f8686++;
            mo8613(c19720.f63730, obj);
            return true;
        }
        int[] iArr = c19720.f63729;
        while (true) {
            int i = this.f8682;
            if (i >= this.f8685) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f8686++;
                this.f8682 = i + 1;
                mo8613(i, obj);
                return true;
            }
            this.f8682 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f8683;
        C19720 c19720 = this.f8684;
        if (z) {
            this.f8683 = false;
            this.f8686++;
            mo8613(c19720.f63730, obj);
        }
        int[] iArr = c19720.f63729;
        while (true) {
            int i = this.f8682;
            if (i >= this.f8685) {
                return;
            }
            if (iArr[i] != 0) {
                mo8613(i, obj);
                this.f8686++;
            }
            this.f8682++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f8687;
        C19720 c19720 = this.f8684;
        if (!z) {
            return c19720.f63732 - this.f8686;
        }
        int i = c19720.f63732;
        long j = i - this.f8686;
        if (c19720.f63737) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c19720.f63730)) * ((double) (this.f8685 - this.f8682)))) + (this.f8683 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC2786 m8614trySplit() {
        int i;
        int i2 = this.f8682;
        int i3 = this.f8685;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC2786 abstractC2786Mo8612 = mo8612(i2, i4, this.f8683);
        this.f8682 = i4;
        this.f8683 = false;
        this.f8687 = true;
        return abstractC2786Mo8612;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15234 m8615trySplit() {
        return (InterfaceC15234) m8614trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return (InterfaceC1124) m8614trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18764 m8616trySplit() {
        return (InterfaceC18764) m8614trySplit();
    }
}
