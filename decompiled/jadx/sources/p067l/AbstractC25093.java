package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25093 {

    /* JADX INFO: renamed from: ۗ */
    public int f80054;

    /* JADX INFO: renamed from: ۙ */
    public boolean f80055;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C11683 f80056;

    /* JADX INFO: renamed from: ᩶ */
    public int f80057;

    /* JADX INFO: renamed from: ᩸ */
    public int f80058;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f80059;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC25093 mo35723(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo35724(int i, Object obj);

    public AbstractC25093(C11683 c11683) {
        this.f80056 = c11683;
        this.f80054 = 0;
        this.f80057 = c11683.f32578;
        this.f80058 = 0;
        this.f80055 = c11683.f32585;
        this.f80059 = false;
    }

    public AbstractC25093(C11683 c11683, int i, int i2, boolean z) {
        this.f80056 = c11683;
        this.f80058 = 0;
        this.f80054 = i;
        this.f80057 = i2;
        this.f80055 = z;
        this.f80059 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f80055;
        C11683 c11683 = this.f80056;
        if (z) {
            this.f80055 = false;
            this.f80058++;
            mo35724(c11683.f32578, obj);
            return true;
        }
        Object[] objArr = c11683.f32577;
        while (true) {
            int i = this.f80054;
            if (i >= this.f80057) {
                return false;
            }
            if (objArr[i] != null) {
                this.f80058++;
                this.f80054 = i + 1;
                mo35724(i, obj);
                return true;
            }
            this.f80054 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f80055;
        C11683 c11683 = this.f80056;
        if (z) {
            this.f80055 = false;
            this.f80058++;
            mo35724(c11683.f32578, obj);
        }
        Object[] objArr = c11683.f32577;
        while (true) {
            int i = this.f80054;
            if (i >= this.f80057) {
                return;
            }
            if (objArr[i] != null) {
                mo35724(i, obj);
                this.f80058++;
            }
            this.f80054++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f80059;
        C11683 c11683 = this.f80056;
        if (!z) {
            return c11683.f32580 - this.f80058;
        }
        int i = c11683.f32580;
        long j = i - this.f80058;
        if (c11683.f32585) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c11683.f32578)) * ((double) (this.f80057 - this.f80054)))) + (this.f80055 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC25093 m56605trySplit() {
        int i;
        int i2 = this.f80054;
        int i3 = this.f80057;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC25093 abstractC25093Mo35723 = mo35723(i2, i4, this.f80055);
        this.f80054 = i4;
        this.f80055 = false;
        this.f80059 = true;
        return abstractC25093Mo35723;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC16847 m56603trySplit() {
        return (InterfaceC16847) m56605trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return (InterfaceC3437) m56605trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20202 m56604trySplit() {
        return (InterfaceC20202) m56605trySplit();
    }
}
