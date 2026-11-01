package p067l;

import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22592 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public final boolean f71312a;

    /* JADX INFO: renamed from: b */
    public final AbstractC14463 f71313b;

    /* JADX INFO: renamed from: c */
    public Supplier f71314c;

    /* JADX INFO: renamed from: d */
    public InterfaceC16847 f71315d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2925 f71316e;

    /* JADX INFO: renamed from: f */
    public BooleanSupplier f71317f;

    /* JADX INFO: renamed from: g */
    public long f71318g;

    /* JADX INFO: renamed from: h */
    public AbstractC20911 f71319h;

    /* JADX INFO: renamed from: i */
    public boolean f71320i;

    /* JADX INFO: renamed from: d */
    public abstract void mo6602d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC22592 mo6603e(InterfaceC16847 interfaceC16847);

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public AbstractC22592(AbstractC14463 abstractC14463, Supplier supplier, boolean z) {
        this.f71313b = abstractC14463;
        this.f71314c = supplier;
        this.f71315d = null;
        this.f71312a = z;
    }

    public AbstractC22592(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847, boolean z) {
        this.f71313b = abstractC14463;
        this.f71314c = null;
        this.f71315d = interfaceC16847;
        this.f71312a = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m50632c() {
        if (this.f71315d == null) {
            this.f71315d = (InterfaceC16847) this.f71314c.get();
            this.f71314c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m50630a() {
        AbstractC20911 abstractC20911 = this.f71319h;
        if (abstractC20911 == null) {
            if (this.f71320i) {
                return false;
            }
            m50632c();
            mo6602d();
            this.f71318g = 0L;
            this.f71316e.mo4231c(this.f71315d.getExactSizeIfKnown());
            return m50631b();
        }
        long j = this.f71318g + 1;
        this.f71318g = j;
        boolean z = j < abstractC20911.count();
        if (z) {
            return z;
        }
        this.f71318g = 0L;
        this.f71319h.clear();
        return m50631b();
    }

    @Override // p067l.InterfaceC16847
    public InterfaceC16847 trySplit() {
        if (!this.f71312a || this.f71319h != null || this.f71320i) {
            return null;
        }
        m50632c();
        InterfaceC16847 interfaceC16847TrySplit = this.f71315d.trySplit();
        if (interfaceC16847TrySplit == null) {
            return null;
        }
        return mo6603e(interfaceC16847TrySplit);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50631b() {
        while (this.f71319h.count() == 0) {
            if (this.f71316e.mo4233f() || !this.f71317f.getAsBoolean()) {
                if (this.f71320i) {
                    return false;
                }
                this.f71316e.end();
                this.f71320i = true;
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        m50632c();
        return this.f71315d.estimateSize();
    }

    @Override // p067l.InterfaceC16847
    public final long getExactSizeIfKnown() {
        m50632c();
        if (EnumC9335.SIZED.m21660s(this.f71313b.f41316m)) {
            return this.f71315d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        m50632c();
        int i = this.f71313b.f41316m;
        int i2 = i & ((~i) >> 1) & EnumC9335.f25415j & EnumC9335.f25411f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.f71315d.characteristics() & 16448) : i2;
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        if (C4779.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f71315d);
    }
}
