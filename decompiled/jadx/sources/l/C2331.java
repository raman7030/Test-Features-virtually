package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2331 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f7473;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7474;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3742 f7475;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f7476;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7477;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f7478;

    @Override // l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public C2331(C3742 c3742) {
        this.f7475 = c3742;
        this.f7473 = 0;
        this.f7476 = c3742.f11817;
        this.f7477 = 0;
        this.f7474 = c3742.f11820;
        this.f7478 = false;
    }

    public C2331(C3742 c3742, int i, int i2, boolean z) {
        this.f7475 = c3742;
        this.f7477 = 0;
        this.f7473 = i;
        this.f7476 = i2;
        this.f7474 = z;
        this.f7478 = true;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.f7474;
        C3742 c3742 = this.f7475;
        if (z) {
            this.f7474 = false;
            this.f7477++;
            consumer.accept(c3742.f11819[c3742.f11817]);
            return true;
        }
        Object[] objArr = c3742.f11819;
        while (true) {
            int i = this.f7473;
            if (i >= this.f7476) {
                return false;
            }
            Object obj = objArr[i];
            if (obj != null) {
                this.f7477++;
                this.f7473 = i + 1;
                consumer.accept(obj);
                return true;
            }
            this.f7473 = i + 1;
        }
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C3742 c3742 = this.f7475;
        Object[] objArr = c3742.f11819;
        if (this.f7474) {
            this.f7474 = false;
            consumer.accept(objArr[c3742.f11817]);
            this.f7477++;
        }
        while (true) {
            int i = this.f7473;
            if (i >= this.f7476) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.f7477++;
            }
            this.f7473++;
        }
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f7478 ? 1 : 65;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        boolean z = this.f7478;
        C3742 c3742 = this.f7475;
        if (!z) {
            return c3742.f11816 - this.f7477;
        }
        int i = c3742.f11816;
        long j = i - this.f7477;
        if (c3742.f11820) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c3742.f11817)) * ((double) (this.f7476 - this.f7473)))) + (this.f7474 ? 1L : 0L));
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        int i;
        int i2 = this.f7473;
        int i3 = this.f7476;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C2331 c2331 = new C2331(this.f7475, i2, i4, this.f7474);
        this.f7473 = i4;
        this.f7474 = false;
        this.f7478 = true;
        return c2331;
    }
}
