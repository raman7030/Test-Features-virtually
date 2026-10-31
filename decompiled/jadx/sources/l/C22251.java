package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes2.dex */
public final class C22251 implements InterfaceC16770 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f72210;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f72211;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20135 f72212;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72213;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72214;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f72215;

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11127.m27611(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11127.m27612(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16770, l.InterfaceC15234
    public final InterfaceC1790 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        C20135 c20135 = this.f72212;
        char[] cArr = c20135.f65201;
        if (this.f72211) {
            this.f72211 = false;
            interfaceC23662.mo18328(cArr[c20135.f65199]);
            this.f72214++;
        }
        while (true) {
            int i = this.f72210;
            if (i >= this.f72213) {
                return;
            }
            char c = cArr[i];
            if (c != 0) {
                interfaceC23662.mo18328(c);
                this.f72214++;
            }
            this.f72210++;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        boolean z = this.f72211;
        C20135 c20135 = this.f72212;
        if (z) {
            this.f72211 = false;
            this.f72214++;
            interfaceC23662.mo18328(c20135.f65201[c20135.f65199]);
            return true;
        }
        char[] cArr = c20135.f65201;
        while (true) {
            int i = this.f72210;
            if (i >= this.f72213) {
                return false;
            }
            char c = cArr[i];
            if (c != 0) {
                this.f72214++;
                this.f72210 = i + 1;
                interfaceC23662.mo18328(c);
                return true;
            }
            this.f72210 = i + 1;
        }
    }

    public C22251(C20135 c20135) {
        this.f72212 = c20135;
        this.f72210 = 0;
        this.f72213 = c20135.f65199;
        this.f72214 = 0;
        this.f72211 = c20135.f65202;
        this.f72215 = false;
    }

    public C22251(C20135 c20135, int i, int i2, boolean z) {
        this.f72212 = c20135;
        this.f72214 = 0;
        this.f72210 = i;
        this.f72213 = i2;
        this.f72211 = z;
        this.f72215 = true;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f72215 ? 257 : 321;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        boolean z = this.f72215;
        C20135 c20135 = this.f72212;
        if (!z) {
            return c20135.f65198 - this.f72214;
        }
        int i = c20135.f65198;
        long j = i - this.f72214;
        if (c20135.f65202) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c20135.f65199)) * ((double) (this.f72213 - this.f72210)))) + (this.f72211 ? 1L : 0L));
    }

    @Override // l.InterfaceC15234
    public final C22251 trySplit() {
        int i;
        int i2 = this.f72210;
        int i3 = this.f72213;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C22251 c22251 = new C22251(this.f72212, i2, i4, this.f72211);
        this.f72210 = i4;
        this.f72211 = false;
        this.f72215 = true;
        return c22251;
    }
}
