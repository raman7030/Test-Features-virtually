package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6187 implements InterfaceC1290, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23120 f18991;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18992 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18993 = 0;

    @Override // java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C5524.m15661(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    public C6187(C23120 c23120) {
        this.f18991 = c23120;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18993 < this.f18991.f74363;
    }

    @Override // l.InterfaceC1290
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f18991.f74362;
        int i = this.f18993;
        this.f18993 = i + 1;
        this.f18992 = i;
        return fArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f18992 == -1) {
            throw new IllegalStateException();
        }
        this.f18992 = -1;
        C23120 c23120 = this.f18991;
        int i = c23120.f74363;
        c23120.f74363 = i - 1;
        int i2 = this.f18993;
        int i3 = i2 - 1;
        this.f18993 = i3;
        float[] fArr = c23120.f74362;
        System.arraycopy(fArr, i2, fArr, i3, i - i2);
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ܽ, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC4113 interfaceC4113) {
        C23120 c23120 = this.f18991;
        float[] fArr = c23120.f74362;
        while (true) {
            int i = this.f18993;
            if (i >= c23120.f74363) {
                return;
            }
            this.f18993 = i + 1;
            interfaceC4113.mo12346(fArr[i]);
        }
    }
}
