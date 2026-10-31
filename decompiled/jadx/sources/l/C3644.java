package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P3JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3644 implements Iterable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3644 f11498;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC15823 f11499;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC13206 f11500;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3644 m11135(InterfaceC15823 interfaceC15823, C5557 c5557) {
        C3644 c3644 = new C3644(null, interfaceC15823);
        if (c3644.f11500 == c5557) {
            return c3644;
        }
        try {
            new C15637().m42941(c3644, c5557);
            return null;
        } catch (C2233 e) {
            return e.f7290;
        }
    }

    public C3644(C3644 c3644, InterfaceC13206 interfaceC13206) {
        if (interfaceC13206.mo987() == EnumC3329.COMPILATION_UNIT) {
            this.f11499 = (InterfaceC15823) interfaceC13206;
            this.f11498 = null;
        } else {
            this.f11499 = c3644.f11499;
            this.f11498 = c3644;
        }
        this.f11500 = interfaceC13206;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15823 m11138() {
        return this.f11499;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13206 m11139() {
        return this.f11500;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C8583(this);
    }
}
