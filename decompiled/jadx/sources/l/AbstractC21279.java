package l;

import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21279 implements InterfaceC15234 {
    public final boolean a;
    public final AbstractC12725 b;
    public Supplier c;
    public InterfaceC15234 d;
    public InterfaceC0585 e;
    public BooleanSupplier f;
    public long g;
    public AbstractC19510 h;
    public boolean i;

    public abstract void d();

    public abstract AbstractC21279 e(InterfaceC15234 interfaceC15234);

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public AbstractC21279(AbstractC12725 abstractC12725, Supplier supplier, boolean z) {
        this.b = abstractC12725;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    public AbstractC21279(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234, boolean z) {
        this.b = abstractC12725;
        this.c = null;
        this.d = interfaceC15234;
        this.a = z;
    }

    public final void c() {
        if (this.d == null) {
            this.d = (InterfaceC15234) this.c.get();
            this.c = null;
        }
    }

    public final boolean a() {
        AbstractC19510 abstractC19510 = this.h;
        if (abstractC19510 == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.c(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < abstractC19510.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    @Override // l.InterfaceC15234
    public InterfaceC15234 trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        InterfaceC15234 interfaceC15234TrySplit = this.d.trySplit();
        if (interfaceC15234TrySplit == null) {
            return null;
        }
        return e(interfaceC15234TrySplit);
    }

    public final boolean b() {
        while (this.h.count() == 0) {
            if (this.e.f() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.end();
                this.i = true;
            }
        }
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // l.InterfaceC15234
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC7330.SIZED.s(this.b.m)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        c();
        int i = this.b.m;
        int i2 = i & ((~i) >> 1) & EnumC7330.j & EnumC7330.f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.d.characteristics() & 16448) : i2;
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        if (C2536.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }
}
