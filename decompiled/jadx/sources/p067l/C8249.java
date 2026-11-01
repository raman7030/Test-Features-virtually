package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8249 implements InterfaceC3595, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C24342 f21850;

    /* JADX INFO: renamed from: ᩸ */
    public int f21851 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f21852 = 0;

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7619.m17576(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    public C8249(C24342 c24342) {
        this.f21850 = c24342;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21852 < this.f21850.f77107;
    }

    @Override // p067l.InterfaceC3595
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f21850.f77106;
        int i = this.f21852;
        this.f21852 = i + 1;
        this.f21851 = i;
        return fArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f21851 == -1) {
            throw new IllegalStateException();
        }
        this.f21851 = -1;
        C24342 c24342 = this.f21850;
        int i = c24342.f77107;
        c24342.f77107 = i - 1;
        int i2 = this.f21852;
        int i3 = i2 - 1;
        this.f21852 = i3;
        float[] fArr = c24342.f77106;
        System.arraycopy(fArr, i2, fArr, i3, i - i2);
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ܽ, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC6278 interfaceC6278) {
        C24342 c24342 = this.f21850;
        float[] fArr = c24342.f77106;
        while (true) {
            int i = this.f21852;
            if (i >= c24342.f77107) {
                return;
            }
            this.f21852 = i + 1;
            interfaceC6278.mo14251(fArr[i]);
        }
    }
}
