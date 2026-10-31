package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11343 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f33937;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C2609 f33932 = C2609.of((Object) null);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C2609 f33931 = C2609.of((Object) null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2609 f33933 = f33932;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2609 f33936 = C2609.m8239();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2609 f33935 = C2609.m8239();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 f33934 = C2609.m8239();

    public C11343(AbstractC5698 abstractC5698) {
        this.f33937 = abstractC5698;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m28039() {
        C2609 c2609 = this.f33933;
        return (c2609 == f33931 || c2609 == f33932) ? C2609.m8239() : c2609;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m28047() {
        return this.f33936;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m28043() {
        return this.f33935;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m28033() {
        return this.f33934;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m28041(C2609 c2609) {
        C12171.m29642(m28050() || this.f33933 == f33932);
        c2609.getClass();
        this.f33933 = c2609;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m28038(C2609 c2609) {
        c2609.getClass();
        this.f33936 = c2609;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m28049(C2609 c2609) {
        c2609.getClass();
        this.f33935 = c2609;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m28045(C2609 c2609) {
        c2609.getClass();
        this.f33934 = c2609;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28035(C11343 c11343) {
        c11343.getClass();
        C2609 c2609M8239 = c11343.f33933;
        if (c2609M8239 == f33931 || c2609M8239 == f33932) {
            c2609M8239 = C2609.m8239();
        }
        m28041(c2609M8239);
        AbstractC5698 abstractC5698 = this.f33937;
        if ((abstractC5698.mo16084() & 2147483648L) != 0) {
            C12171.m29642(c11343.f33937.f17559 == EnumC1296.f4571);
            C18837 c18837 = new C18837();
            for (C6507 c6507 : c11343.f33936) {
                if (!c6507.f50415.f30045.m24192()) {
                    c18837.m43511(c6507);
                }
            }
            m28038(c18837.m43517());
        } else {
            m28038(c11343.f33936);
        }
        if (abstractC5698.f17559 == EnumC1296.f4582) {
            m28049(c11343.f33935);
            m28045(c11343.f33934);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m28037() {
        this.f33933 = f33931;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m28042() {
        return this.f33936.isEmpty();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m28050() {
        return this.f33933 == f33931;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28034(C2609 c2609) {
        C2609 c2609M8239 = this.f33933;
        if (c2609M8239 == f33931 || c2609M8239 == f33932) {
            c2609M8239 = C2609.m8239();
        }
        this.f33933 = c2609M8239;
        if (c2609.isEmpty()) {
            return;
        }
        if (this.f33933.isEmpty()) {
            this.f33933 = c2609;
            return;
        }
        C2609 c26010 = this.f33933;
        c26010.getClass();
        this.f33933 = c2609.m8248(c26010);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m28048(C2609 c2609) {
        if (c2609.isEmpty()) {
            return;
        }
        if (this.f33936.isEmpty()) {
            this.f33936 = c2609;
            return;
        }
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C6507 c6507 = (C6507) it.next();
            if (!this.f33936.contains(c6507)) {
                this.f33936 = this.f33936.m8242(c6507);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28044(C2609 c2609) {
        if (c2609.isEmpty()) {
            return;
        }
        if (this.f33935.isEmpty()) {
            this.f33935 = c2609;
            return;
        }
        C2609 c26010 = this.f33935;
        c26010.getClass();
        this.f33935 = c2609.m8248(c26010);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28040(C2609 c2609) {
        if (c2609.isEmpty()) {
            return;
        }
        if (this.f33934.isEmpty()) {
            this.f33934 = c2609;
            return;
        }
        C2609 c26010 = this.f33934;
        c26010.getClass();
        this.f33934 = c2609.m8248(c26010);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m28046() {
        return this.f33933 == f33932 || m28050() || this.f33933.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m28032(C2609 c2609, C16384 c16384) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C16384 c16385 = (C16384) it.next();
            if (c16385 != c16384) {
                c18837.m43511(c16385);
            }
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28036(C16384 c16384) {
        if (this.f33933.contains(c16384)) {
            this.f33933 = m28032(this.f33933, c16384);
            return;
        }
        for (C16384 c16385 : this.f33933) {
            boolean zM38583 = c16385.m38583();
            C2609 c2609 = c16385.f50417;
            if (zM38583 && !c2609.isEmpty()) {
                C23069 c23069 = (C23069) c2609.get(0);
                if (((C3581) c23069.f74207).f17562.mo26175(b.d)) {
                    Object obj = c23069.f74208;
                    if (obj instanceof C1568) {
                        AbstractC8624[] abstractC8624Arr = ((C1568) obj).f5564;
                        if (abstractC8624Arr.length != 0) {
                            AbstractC8624 abstractC8624 = abstractC8624Arr[0];
                            if ((abstractC8624 instanceof C16384) && abstractC8624.f26338 == c16384.f26338) {
                                this.f33933 = m28032(this.f33933, c16385);
                            }
                        }
                    }
                }
            }
        }
    }
}
