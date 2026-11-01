package p067l;

import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6TZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24679 implements InterfaceC11091 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f78070;

    /* JADX INFO: renamed from: ۧ */
    public C17302 f78071 = new C17302();

    /* JADX INFO: renamed from: ܳ */
    public final Supplier f78072;

    /* JADX INFO: renamed from: ܽ */
    public long f78073;

    /* JADX INFO: renamed from: ܿ */
    public final EnumC15723 f78074;

    /* JADX INFO: renamed from: ᩳ */
    public long f78075;

    public C24679(EnumC15723 enumC15723, long j, long j2, Supplier supplier, boolean z) {
        this.f78070 = z;
        if (enumC15723 != EnumC15723.USER && enumC15723 != EnumC15723.BATCH) {
            throw new IllegalArgumentException("Only user edits produce history");
        }
        this.f78074 = enumC15723;
        this.f78073 = j;
        this.f78075 = j2;
        this.f78072 = supplier;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m54332() {
        return this.f78073;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m54333() {
        return this.f78075;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17302 m54331() {
        return this.f78071;
    }

    @Override // p067l.InterfaceC11091
    /* JADX INFO: renamed from: ֫ */
    public final void mo25534(int i, int i2, C13773 c13773, C13773 c13774, int i3) {
        if (this.f78075 == C14849.FOREVER_NS) {
            throw new IllegalStateException("Edit mark exhausted");
        }
        C7205 c7205 = (C7205) this.f78072.get();
        C12826.requireNonNull(c7205);
        if (c7205.m16550() > c13773.m31402() || c7205.m16548() > c13773.m31402()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (this.f78070 && i2 > i && i3 > 0 && c7205.m16550() == i2 && c7205.m16548() == i2) {
            c7205 = new C7205(i, i2);
        }
        C7205 c7206 = c7205;
        C17302 c17302M39211 = this.f78071;
        if (i2 - i != i3) {
            c17302M39211 = this.f78071.m39211(new C24441(i, this.f78073, this.f78075 + 1, c7206, c13773.m31398(i, i2), c13774.m31398(i, i + i3)));
            break;
        }
        if (!c13773.m31403(c13774)) {
            C22491 c22491 = new C22491(c13773, i);
            try {
                C22491 c22492 = new C22491(c13774, i);
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        try {
                            if (c22491.m50445() != c22492.m50445()) {
                                c22492.close();
                                c22491.close();
                                c17302M39211 = this.f78071.m39211(new C24441(i, this.f78073, this.f78075 + 1, c7206, c13773.m31398(i, i2), c13774.m31398(i, i + i3)));
                                break;
                            }
                            i4++;
                        } catch (Throwable th) {
                            try {
                                c22492.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        c22492.close();
                        c22491.close();
                        break;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c22491.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        this.f78071 = c17302M39211;
        long j = this.f78075 + 1;
        this.f78075 = j;
        this.f78073 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11503 m54330(C11503 c11503, long j) {
        if (this.f78071.isEmpty()) {
            return c11503;
        }
        if (this.f78074 == EnumC15723.BATCH) {
            return c11503.m26554(this.f78071, j);
        }
        Iterator it = this.f78071.iterator();
        while (true) {
            C21998 c21998 = (C21998) it;
            if (!c21998.hasNext()) {
                return c11503;
            }
            c11503 = c11503.m26555((C24441) c21998.next(), j);
        }
    }
}
