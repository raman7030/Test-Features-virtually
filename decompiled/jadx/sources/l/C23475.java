package l;

import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6TZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23475 implements InterfaceC9177 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f75323;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15713 f75324 = new C15713();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Supplier f75325;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f75326;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC14051 f75327;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f75328;

    public C23475(EnumC14051 enumC14051, long j, long j2, Supplier supplier, boolean z) {
        this.f75323 = z;
        if (enumC14051 != EnumC14051.USER && enumC14051 != EnumC14051.BATCH) {
            throw new IllegalArgumentException("Only user edits produce history");
        }
        this.f75327 = enumC14051;
        this.f75326 = j;
        this.f75328 = j2;
        this.f75325 = supplier;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m51930() {
        return this.f75326;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m51931() {
        return this.f75328;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15713 m51929() {
        return this.f75324;
    }

    @Override // l.InterfaceC9177
    /* JADX INFO: renamed from: ֫ */
    public final void mo23583(int i, int i2, C11999 c11999, C11999 c119910, int i3) {
        if (this.f75328 == C13132.FOREVER_NS) {
            throw new IllegalStateException("Edit mark exhausted");
        }
        C5089 c5089 = (C5089) this.f75325.get();
        C11003.requireNonNull(c5089);
        if (c5089.m14642() > c11999.m29347() || c5089.m14640() > c11999.m29347()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (this.f75323 && i2 > i && i3 > 0 && c5089.m14642() == i2 && c5089.m14640() == i2) {
            c5089 = new C5089(i, i2);
        }
        C5089 c50810 = c5089;
        C15713 c15713M37044 = this.f75324;
        if (i2 - i != i3) {
            c15713M37044 = this.f75324.m37044(new C23224(i, this.f75326, this.f75328 + 1, c50810, c11999.m29343(i, i2), c119910.m29343(i, i + i3)));
            break;
        }
        if (!c11999.m29348(c119910)) {
            C21172 c21172 = new C21172(c11999, i);
            try {
                C21172 c21173 = new C21172(c119910, i);
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        try {
                            if (c21172.m48115() != c21173.m48115()) {
                                c21173.close();
                                c21172.close();
                                c15713M37044 = this.f75324.m37044(new C23224(i, this.f75326, this.f75328 + 1, c50810, c11999.m29343(i, i2), c119910.m29343(i, i + i3)));
                                break;
                            }
                            i4++;
                        } catch (Throwable th) {
                            try {
                                c21173.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        c21173.close();
                        c21172.close();
                        break;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c21172.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        this.f75324 = c15713M37044;
        long j = this.f75328 + 1;
        this.f75328 = j;
        this.f75326 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9611 m51928(C9611 c9611, long j) {
        if (this.f75324.isEmpty()) {
            return c9611;
        }
        if (this.f75327 == EnumC14051.BATCH) {
            return c9611.m24541(this.f75324, j);
        }
        Iterator it = this.f75324.iterator();
        while (true) {
            C20654 c20654 = (C20654) it;
            if (!c20654.hasNext()) {
                return c9611;
            }
            c9611 = c9611.m24542((C23224) c20654.next(), j);
        }
    }
}
