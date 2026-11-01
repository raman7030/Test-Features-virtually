package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P3JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5831 implements Iterable {

    /* JADX INFO: renamed from: ᩶ */
    public C5831 f14304;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC17406 f14305;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC14919 f14306;

    /* JADX INFO: renamed from: ֫ */
    public static C5831 m13111(InterfaceC17406 interfaceC17406, C7650 c7650) {
        C5831 c5831 = new C5831(null, interfaceC17406);
        if (c5831.f14306 == c7650) {
            return c5831;
        }
        try {
            new C17229().m45217(c5831, c7650);
            return null;
        } catch (C4490 e) {
            return e.f10078;
        }
    }

    public C5831(C5831 c5831, InterfaceC14919 interfaceC14919) {
        if (interfaceC14919.mo3381() == EnumC5532.COMPILATION_UNIT) {
            this.f14305 = (InterfaceC17406) interfaceC14919;
            this.f14304 = null;
        } else {
            this.f14305 = c5831.f14305;
            this.f14304 = c5831;
        }
        this.f14306 = interfaceC14919;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC17406 m13114() {
        return this.f14305;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC14919 m13115() {
        return this.f14306;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10525(this);
    }
}
