package p067l;

/* JADX INFO: renamed from: l.۫ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A570 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14280 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15620 f40677;

    /* JADX INFO: renamed from: ۧ */
    public final C14950 f40678;

    /* JADX INFO: renamed from: ܽ */
    public final C22388 f40679;

    public C14280(AbstractC15620 abstractC15620, C14950 c14950, C22388 c22388) {
        if (abstractC15620 == null) {
            throw new NullPointerException("locals == null");
        }
        if (c14950 == null) {
            throw new NullPointerException("stack == null");
        }
        c22388.m45999();
        this.f40677 = abstractC15620;
        this.f40678 = c14950;
        this.f40679 = c22388;
    }

    public C14280(int i, int i2) {
        this(new C4262(i), new C14950(i2), C22388.f70620);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14280 m32814() {
        return new C14280(this.f40677.mo8662(), this.f40678.m34208(), this.f40679);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m32825() {
        this.f40677.mo22326();
        this.f40678.mo22326();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32820(C9566 c9566) {
        this.f40677.mo8664(c9566);
        this.f40678.m34215(c9566);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14280 m32817(C14280 c14280) {
        C22388 c22388;
        AbstractC15620 abstractC15620 = c14280.f40677;
        AbstractC15620 abstractC15621 = this.f40677;
        AbstractC15620 abstractC15620Mo8658 = abstractC15621.mo8658(abstractC15620);
        C14950 c14950 = c14280.f40678;
        C14950 c14951 = this.f40678;
        c14951.getClass();
        try {
            C14950 c14950M53414 = C24158.m53414(c14951, c14950);
            C22388 c22389 = c14280.f40679;
            C22388 c223810 = this.f40679;
            if (c223810.equals(c22389)) {
                c22388 = c223810;
            } else {
                c22388 = new C22388();
                int size = c223810.size();
                int size2 = c22389.size();
                for (int i = 0; i < size && i < size2 && c223810.get(i) == c22389.get(i); i++) {
                    c22388.add(i);
                }
                c22388.mo22326();
            }
            if (abstractC15620Mo8658 instanceof C9586) {
                abstractC15620Mo8658 = (C9586) abstractC15620Mo8658;
                if (c22388.size() == 0) {
                    abstractC15620Mo8658 = abstractC15620Mo8658.mo8655();
                }
            }
            return (abstractC15620Mo8658 == abstractC15621 && c14950M53414 == c14951 && c223810 == c22388) ? this : new C14280(abstractC15620Mo8658, c14950M53414, c22388);
        } catch (C4933 e) {
            e.m23570("underlay stack:");
            c14951.m34212(e);
            e.m23570("overlay stack:");
            c14950.m34212(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14280 m32818(C14280 c14280, int i, int i2) {
        AbstractC15620 abstractC15620 = c14280.f40677;
        AbstractC15620 abstractC15621 = this.f40677;
        C9586 c9586Mo8657 = abstractC15621.mo8657(abstractC15620, i2);
        C14950 c14950 = c14280.f40678;
        C14950 c14951 = this.f40678;
        c14951.getClass();
        try {
            C14950 c14950M53414 = C24158.m53414(c14951, c14950);
            C22388 c22388M50243 = c14280.f40679.m50243();
            c22388M50243.add(i);
            c22388M50243.mo22326();
            C22388 c22388 = this.f40679;
            if (c9586Mo8657 == abstractC15621 && c14950M53414 == c14951 && c22388.equals(c22388M50243)) {
                return this;
            }
            if (!c22388.equals(c22388M50243)) {
                if (c22388.size() > c22388M50243.size()) {
                    c22388 = c22388M50243;
                    c22388M50243 = c22388;
                }
                int size = c22388M50243.size();
                int size2 = c22388.size();
                for (int i3 = size2 - 1; i3 >= 0; i3--) {
                    if (c22388.get(i3) != c22388M50243.get((size - size2) + i3)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
                c22388 = c22388M50243;
            }
            return new C14280(c9586Mo8657, c14950M53414, c22388);
        } catch (C4933 e) {
            e.m23570("underlay stack:");
            c14951.m34212(e);
            e.m23570("overlay stack:");
            c14950.m34212(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15620 m32823() {
        return this.f40677;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14280 m32816(C14260 c14260) {
        C14950 c14950M34208 = this.f40678.m34208();
        c14950M34208.m34213();
        c14950M34208.m34211(c14260);
        return new C14280(this.f40677, c14950M34208, this.f40679);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C14950 m32824() {
        return this.f40678;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C22388 m32826() {
        return this.f40679;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32821(C15600 c15600) {
        int size = c15600.size();
        int iM22291 = 0;
        for (int i = 0; i < size; i++) {
            C9566 c9566M56515get = c15600.m56515get(i);
            this.f40677.mo8659(iM22291, c9566M56515get);
            iM22291 += c9566M56515get.m22291();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C14280 m32822(int i, int i2) {
        AbstractC15620 abstractC15620 = this.f40677;
        AbstractC15620 abstractC15620M22325 = abstractC15620 instanceof C9586 ? ((C9586) abstractC15620).m22325(i2) : null;
        try {
            C22388 c22388M50243 = this.f40679.m50243();
            if (c22388M50243.m50241() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            c22388M50243.mo22326();
            if (abstractC15620M22325 == null) {
                return null;
            }
            return new C14280(abstractC15620M22325, this.f40678, c22388M50243);
        } catch (IndexOutOfBoundsException unused) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14280 m32815(int i, int i2) {
        this.f40679.m50243().add(i);
        return new C14280(this.f40677.mo8655(), this.f40678, C22388.m50240(i)).m32818(this, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32819(C4933 c4933) {
        this.f40677.mo8660(c4933);
        this.f40678.m34212(c4933);
    }
}
