package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C94 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18662 implements InterfaceC15132, InterfaceC12433 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19368 f58975;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58977;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58976 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f58978 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f58979 = 0;

    @Override // l.InterfaceC15132
    public final /* synthetic */ void add(int i) {
        C8078.m21440();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo5654((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6667, l.InterfaceC14529, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo5656((Integer) obj);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5653(int i) {
        C8078.m21443();
        throw null;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5654(Integer num) {
        C8078.m21441((InterfaceC15132) this, num);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo5656(Integer num) {
        C8078.m21444((InterfaceC15132) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Integer.valueOf(mo5655());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    public C18662(C19368 c19368) {
        this.f58975 = c19368;
        this.f58977 = c19368.f62700;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f58977 != -1;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f58976 != -1;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f58977;
        this.f58978 = i;
        C19368 c19368 = this.f58975;
        this.f58977 = (int) c19368.f62699[i];
        this.f58976 = i;
        int i2 = this.f58979;
        if (i2 >= 0) {
            this.f58979 = i2 + 1;
        }
        return c19368.f62694[i];
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f58976;
        this.f58978 = i;
        C19368 c19368 = this.f58975;
        this.f58976 = (int) (c19368.f62699[i] >>> 32);
        this.f58977 = i;
        int i2 = this.f58979;
        if (i2 >= 0) {
            this.f58979 = i2 - 1;
        }
        return c19368.f62694[i];
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        C19368 c19368 = this.f58975;
        int[] iArr = c19368.f62694;
        long[] jArr = c19368.f62699;
        while (true) {
            int i = this.f58977;
            if (i == -1) {
                return;
            }
            this.f58978 = i;
            this.f58977 = (int) jArr[i];
            this.f58976 = i;
            int i2 = this.f58979;
            if (i2 >= 0) {
                this.f58979 = i2 + 1;
            }
            intConsumer.accept(iArr[i]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m43268() {
        if (this.f58979 >= 0) {
            return;
        }
        if (this.f58976 == -1) {
            this.f58979 = 0;
            return;
        }
        int i = this.f58977;
        C19368 c19368 = this.f58975;
        if (i == -1) {
            this.f58979 = c19368.f62703;
            return;
        }
        int i2 = c19368.f62700;
        this.f58979 = 1;
        while (i2 != this.f58976) {
            i2 = (int) c19368.f62699[i2];
            this.f58979++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m43268();
        return this.f58979;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m43268();
        return this.f58979 - 1;
    }

    @Override // l.InterfaceC15132, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        m43268();
        int i2 = this.f58978;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        int i3 = this.f58976;
        C19368 c19368 = this.f58975;
        if (i2 == i3) {
            this.f58979--;
            this.f58976 = (int) (c19368.f62699[i2] >>> 32);
        } else {
            this.f58977 = (int) c19368.f62699[i2];
        }
        c19368.f62703--;
        int i4 = this.f58976;
        if (i4 == -1) {
            c19368.f62700 = this.f58977;
        } else {
            long[] jArr = c19368.f62699;
            long j = jArr[i4];
            jArr[i4] = j ^ (((((long) this.f58977) & 4294967295L) ^ j) & 4294967295L);
        }
        int i5 = this.f58977;
        if (i5 == -1) {
            c19368.f62693 = i4;
        } else {
            long[] jArr2 = c19368.f62699;
            long j2 = jArr2[i5];
            jArr2[i5] = ((((4294967295L & ((long) i4)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.f58978 = -1;
        int i6 = c19368.f62697;
        if (i2 == i6) {
            c19368.f62701 = false;
            c19368.f62694[i6] = 0;
            return;
        }
        int[] iArr = c19368.f62694;
        while (true) {
            int i7 = (i2 + 1) & c19368.f62698;
            while (true) {
                i = iArr[i7];
                if (i == 0) {
                    iArr[i2] = 0;
                    return;
                }
                int iM32766 = C13630.m32766(i);
                int i8 = c19368.f62698;
                int i9 = iM32766 & i8;
                if (i2 > i7) {
                    if (i2 >= i9 && i9 > i7) {
                        break;
                    } else {
                        i7 = (i7 + 1) & i8;
                    }
                } else if (i2 >= i9 || i9 > i7) {
                    break;
                } else {
                    i7 = (i7 + 1) & i8;
                }
            }
            iArr[i2] = i;
            if (this.f58977 == i7) {
                this.f58977 = i2;
            }
            if (this.f58976 == i7) {
                this.f58976 = i2;
            }
            c19368.m44626(i7, i2);
            i2 = i7;
        }
    }
}
