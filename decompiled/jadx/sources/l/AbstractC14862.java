package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14862 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f45331;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f45332;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f45333;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45334;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45335;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f45336;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC14862 mo19104(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19105(int i, Object obj);

    public AbstractC14862(C21214 c21214) {
        this.f45333 = c21214;
        this.f45331 = 0;
        this.f45334 = c21214.f68348;
        this.f45335 = 0;
        this.f45332 = c21214.f68353;
        this.f45336 = false;
    }

    public AbstractC14862(C21214 c21214, int i, int i2, boolean z) {
        this.f45333 = c21214;
        this.f45335 = 0;
        this.f45331 = i;
        this.f45334 = i2;
        this.f45332 = z;
        this.f45336 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f45332;
        C21214 c21214 = this.f45333;
        if (z) {
            this.f45332 = false;
            this.f45335++;
            mo19105(c21214.f68348, obj);
            return true;
        }
        int[] iArr = c21214.f68352;
        while (true) {
            int i = this.f45331;
            if (i >= this.f45334) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f45335++;
                this.f45331 = i + 1;
                mo19105(i, obj);
                return true;
            }
            this.f45331 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f45332;
        C21214 c21214 = this.f45333;
        if (z) {
            this.f45332 = false;
            this.f45335++;
            mo19105(c21214.f68348, obj);
        }
        int[] iArr = c21214.f68352;
        while (true) {
            int i = this.f45331;
            if (i >= this.f45334) {
                return;
            }
            if (iArr[i] != 0) {
                mo19105(i, obj);
                this.f45335++;
            }
            this.f45331++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f45336;
        C21214 c21214 = this.f45333;
        if (!z) {
            return c21214.f68347 - this.f45335;
        }
        int i = c21214.f68347;
        long j = i - this.f45335;
        if (c21214.f68353) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c21214.f68348)) * ((double) (this.f45334 - this.f45331)))) + (this.f45332 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC14862 m35257trySplit() {
        int i;
        int i2 = this.f45331;
        int i3 = this.f45334;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC14862 abstractC14862Mo19104 = mo19104(i2, i4, this.f45332);
        this.f45331 = i4;
        this.f45332 = false;
        this.f45336 = true;
        return abstractC14862Mo19104;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15234 m35258trySplit() {
        return (InterfaceC15234) m35257trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return (InterfaceC1124) m35257trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18764 m35259trySplit() {
        return (InterfaceC18764) m35257trySplit();
    }
}
