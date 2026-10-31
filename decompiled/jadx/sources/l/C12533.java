package l;

/* JADX INFO: renamed from: l.۫ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A570 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12533 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13943 f37653;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13238 f37654;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21064 f37655;

    public C12533(AbstractC13943 abstractC13943, C13238 c13238, C21064 c21064) {
        if (abstractC13943 == null) {
            throw new NullPointerException("locals == null");
        }
        if (c13238 == null) {
            throw new NullPointerException("stack == null");
        }
        c21064.m43732();
        this.f37653 = abstractC13943;
        this.f37654 = c13238;
        this.f37655 = c21064;
    }

    public C12533(int i, int i2) {
        this(new C1992(i), new C13238(i2), C21064.f67936);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30742() {
        return new C12533(this.f37653.mo6520(), this.f37654.m32110(), this.f37655);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m30753() {
        this.f37653.mo20349();
        this.f37654.mo20349();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30748(C7573 c7573) {
        this.f37653.mo6522(c7573);
        this.f37654.m32117(c7573);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30745(C12533 c12533) {
        C21064 c21064;
        AbstractC13943 abstractC13943 = c12533.f37653;
        AbstractC13943 abstractC13944 = this.f37653;
        AbstractC13943 abstractC13943Mo6516 = abstractC13944.mo6516(abstractC13943);
        C13238 c13238 = c12533.f37654;
        C13238 c13239 = this.f37654;
        c13239.getClass();
        try {
            C13238 c13238M51023 = C22927.m51023(c13239, c13238);
            C21064 c21065 = c12533.f37655;
            C21064 c21066 = this.f37655;
            if (c21066.equals(c21065)) {
                c21064 = c21066;
            } else {
                c21064 = new C21064();
                int size = c21066.size();
                int size2 = c21065.size();
                for (int i = 0; i < size && i < size2 && c21066.get(i) == c21065.get(i); i++) {
                    c21064.add(i);
                }
                c21064.mo20349();
            }
            if (abstractC13943Mo6516 instanceof C7594) {
                abstractC13943Mo6516 = (C7594) abstractC13943Mo6516;
                if (c21064.size() == 0) {
                    abstractC13943Mo6516 = abstractC13943Mo6516.mo6513();
                }
            }
            return (abstractC13943Mo6516 == abstractC13944 && c13238M51023 == c13239 && c21066 == c21064) ? this : new C12533(abstractC13943Mo6516, c13238M51023, c21064);
        } catch (C2698 e) {
            e.m21602("underlay stack:");
            c13239.m32114(e);
            e.m21602("overlay stack:");
            c13238.m32114(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30746(C12533 c12533, int i, int i2) {
        AbstractC13943 abstractC13943 = c12533.f37653;
        AbstractC13943 abstractC13944 = this.f37653;
        C7594 c7594Mo6515 = abstractC13944.mo6515(abstractC13943, i2);
        C13238 c13238 = c12533.f37654;
        C13238 c13239 = this.f37654;
        c13239.getClass();
        try {
            C13238 c13238M51023 = C22927.m51023(c13239, c13238);
            C21064 c21064M47913 = c12533.f37655.m47913();
            c21064M47913.add(i);
            c21064M47913.mo20349();
            C21064 c21064 = this.f37655;
            if (c7594Mo6515 == abstractC13944 && c13238M51023 == c13239 && c21064.equals(c21064M47913)) {
                return this;
            }
            if (!c21064.equals(c21064M47913)) {
                if (c21064.size() > c21064M47913.size()) {
                    c21064 = c21064M47913;
                    c21064M47913 = c21064;
                }
                int size = c21064M47913.size();
                int size2 = c21064.size();
                for (int i3 = size2 - 1; i3 >= 0; i3--) {
                    if (c21064.get(i3) != c21064M47913.get((size - size2) + i3)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
                c21064 = c21064M47913;
            }
            return new C12533(c7594Mo6515, c13238M51023, c21064);
        } catch (C2698 e) {
            e.m21602("underlay stack:");
            c13239.m32114(e);
            e.m21602("overlay stack:");
            c13238.m32114(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13943 m30751() {
        return this.f37653;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30744(C12512 c12512) {
        C13238 c13238M32110 = this.f37654.m32110();
        c13238M32110.m32115();
        c13238M32110.m32113(c12512);
        return new C12533(this.f37653, c13238M32110, this.f37655);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13238 m30752() {
        return this.f37654;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21064 m30754() {
        return this.f37655;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30749(C13922 c13922) {
        int size = c13922.size();
        int iM20314 = 0;
        for (int i = 0; i < size; i++) {
            C7573 c7573M40995get = c13922.m40995get(i);
            this.f37653.mo6517(iM20314, c7573M40995get);
            iM20314 += c7573M40995get.m20314();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12533 m30750(int i, int i2) {
        AbstractC13943 abstractC13943 = this.f37653;
        AbstractC13943 abstractC13943M20348 = abstractC13943 instanceof C7594 ? ((C7594) abstractC13943).m20348(i2) : null;
        try {
            C21064 c21064M47913 = this.f37655.m47913();
            if (c21064M47913.m47911() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            c21064M47913.mo20349();
            if (abstractC13943M20348 == null) {
                return null;
            }
            return new C12533(abstractC13943M20348, this.f37654, c21064M47913);
        } catch (IndexOutOfBoundsException unused) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30743(int i, int i2) {
        this.f37655.m47913().add(i);
        return new C12533(this.f37653.mo6513(), this.f37654, C21064.m47910(i)).m30746(this, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30747(C2698 c2698) {
        this.f37653.mo6518(c2698);
        this.f37654.m32114(c2698);
    }
}
