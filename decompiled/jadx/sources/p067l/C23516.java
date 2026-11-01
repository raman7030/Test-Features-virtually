package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes2.dex */
public final class C23516 implements InterfaceC18307 {

    /* JADX INFO: renamed from: ۗ */
    public int f74935;

    /* JADX INFO: renamed from: ۙ */
    public boolean f74936;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C21505 f74937;

    /* JADX INFO: renamed from: ᩶ */
    public int f74938;

    /* JADX INFO: renamed from: ᩸ */
    public int f74939;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f74940;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12944.m29673(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12944.m29674(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC18307, p067l.InterfaceC16847
    public final InterfaceC4070 getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        C21505 c21505 = this.f74937;
        char[] cArr = c21505.f67840;
        if (this.f74936) {
            this.f74936 = false;
            interfaceC24857.mo20276(cArr[c21505.f67838]);
            this.f74939++;
        }
        while (true) {
            int i = this.f74935;
            if (i >= this.f74938) {
                return;
            }
            char c = cArr[i];
            if (c != 0) {
                interfaceC24857.mo20276(c);
                this.f74939++;
            }
            this.f74935++;
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        boolean z = this.f74936;
        C21505 c21505 = this.f74937;
        if (z) {
            this.f74936 = false;
            this.f74939++;
            interfaceC24857.mo20276(c21505.f67840[c21505.f67838]);
            return true;
        }
        char[] cArr = c21505.f67840;
        while (true) {
            int i = this.f74935;
            if (i >= this.f74938) {
                return false;
            }
            char c = cArr[i];
            if (c != 0) {
                this.f74939++;
                this.f74935 = i + 1;
                interfaceC24857.mo20276(c);
                return true;
            }
            this.f74935 = i + 1;
        }
    }

    public C23516(C21505 c21505) {
        this.f74937 = c21505;
        this.f74935 = 0;
        this.f74938 = c21505.f67838;
        this.f74939 = 0;
        this.f74936 = c21505.f67841;
        this.f74940 = false;
    }

    public C23516(C21505 c21505, int i, int i2, boolean z) {
        this.f74937 = c21505;
        this.f74939 = 0;
        this.f74935 = i;
        this.f74938 = i2;
        this.f74936 = z;
        this.f74940 = true;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f74940 ? 257 : 321;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        boolean z = this.f74940;
        C21505 c21505 = this.f74937;
        if (!z) {
            return c21505.f67837 - this.f74939;
        }
        int i = c21505.f67837;
        long j = i - this.f74939;
        if (c21505.f67841) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c21505.f67838)) * ((double) (this.f74938 - this.f74935)))) + (this.f74936 ? 1L : 0L));
    }

    @Override // p067l.InterfaceC16847
    public final C23516 trySplit() {
        int i;
        int i2 = this.f74935;
        int i3 = this.f74938;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C23516 c23516 = new C23516(this.f74937, i2, i4, this.f74936);
        this.f74935 = i4;
        this.f74936 = false;
        this.f74940 = true;
        return c23516;
    }
}
