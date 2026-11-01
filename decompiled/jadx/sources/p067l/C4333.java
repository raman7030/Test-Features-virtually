package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.֫᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E94U */
/* JADX INFO: loaded from: classes2.dex */
public final class C4333 implements InterfaceC12618 {

    /* JADX INFO: renamed from: ֫ */
    public int f9679;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC9303 f9680;

    /* JADX INFO: renamed from: ܽ */
    public int f9681 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f9682;

    /* JADX INFO: renamed from: ֫ */
    public static C4333 m8882(AbstractC9303 abstractC9303) {
        C4333 c4333 = abstractC9303.f25293;
        return c4333 != null ? c4333 : new C4333(abstractC9303);
    }

    public C4333(AbstractC9303 abstractC9303) {
        C15671.m35602(abstractC9303, "input");
        this.f9680 = abstractC9303;
        abstractC9303.f25293 = this;
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8924() {
        this.f9680.getClass();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۘ */
    public final int mo8900() {
        int i = this.f9681;
        if (i != 0) {
            this.f9682 = i;
            this.f9681 = 0;
        } else {
            this.f9682 = this.f9680.mo21535();
        }
        int i2 = this.f9682;
        if (i2 == 0 || i2 == this.f9679) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // p067l.InterfaceC12618
    public final int getTag() {
        return this.f9682;
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo8927() {
        int i;
        AbstractC9303 abstractC9303 = this.f9680;
        if (abstractC9303.mo21540() || (i = this.f9682) == this.f9679) {
            return false;
        }
        return abstractC9303.mo21541(i);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m8884(int i) throws C9637 {
        if ((this.f9682 & 7) != i) {
            throw C4293.m8708();
        }
    }

    @Override // p067l.InterfaceC12618
    public final double readDouble() throws C9637 {
        m8884(1);
        return this.f9680.mo21547();
    }

    @Override // p067l.InterfaceC12618
    public final float readFloat() throws C9637 {
        m8884(5);
        return this.f9680.mo21530();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۢ */
    public final long mo8907() throws C9637 {
        m8884(0);
        return this.f9680.mo21546();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۚ */
    public final long mo8902() throws C9637 {
        m8884(0);
        return this.f9680.mo21525();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8928() throws C9637 {
        m8884(0);
        return this.f9680.mo21536();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ֫ */
    public final long mo8892() throws C9637 {
        m8884(1);
        return this.f9680.mo21531();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۡ */
    public final int mo8905() throws C9637 {
        m8884(5);
        return this.f9680.mo21544();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8913() throws C9637 {
        m8884(0);
        return this.f9680.mo21539();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۖ */
    public final String mo8898() throws C9637 {
        m8884(2);
        return this.f9680.mo21519();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ֨ */
    public final String mo8891() throws C9637 {
        m8884(2);
        return this.f9680.mo21529();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۧ */
    public final Object mo8909(Class cls, C19283 c19283) throws C4293 {
        m8884(2);
        InterfaceC11277 interfaceC11277M30099 = C13150.m30098().m30099(cls);
        Object objMo26207 = interfaceC11277M30099.mo26207();
        m8888(objMo26207, interfaceC11277M30099, c19283);
        interfaceC11277M30099.mo26208(objMo26207);
        return objMo26207;
    }

    @Override // p067l.InterfaceC12618
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8893(Class cls, C19283 c19283) throws C9637 {
        m8884(3);
        InterfaceC11277 interfaceC11277M30099 = C13150.m30098().m30099(cls);
        Object objMo26207 = interfaceC11277M30099.mo26207();
        m8886(objMo26207, interfaceC11277M30099, c19283);
        interfaceC11277M30099.mo26208(objMo26207);
        return objMo26207;
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۧ */
    public final void mo8910(Object obj, InterfaceC11277 interfaceC11277, C19283 c19283) throws C4293 {
        m8884(2);
        m8888(obj, interfaceC11277, c19283);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m8888(Object obj, InterfaceC11277 interfaceC11277, C19283 c19283) throws C4293 {
        AbstractC9303 abstractC9303 = this.f9680;
        int iMo21545 = abstractC9303.mo21545();
        if (abstractC9303.f25290 >= abstractC9303.f25291) {
            throw new C4293("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo21538 = abstractC9303.mo21538(iMo21545);
        abstractC9303.f25290++;
        interfaceC11277.mo26211(obj, this, c19283);
        abstractC9303.mo21522(0);
        abstractC9303.f25290--;
        abstractC9303.mo21533(iMo21538);
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ֫ */
    public final void mo8894(Object obj, InterfaceC11277 interfaceC11277, C19283 c19283) throws C9637 {
        m8884(3);
        m8886(obj, interfaceC11277, c19283);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m8886(Object obj, InterfaceC11277 interfaceC11277, C19283 c19283) {
        int i = this.f9679;
        this.f9679 = ((this.f9682 >>> 3) << 3) | 4;
        try {
            interfaceC11277.mo26211(obj, this, c19283);
            if (this.f9682 != this.f9679) {
                throw C4293.m8704();
            }
            this.f9679 = i;
        } catch (Throwable th) {
            this.f9679 = i;
            throw th;
        }
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۜ */
    public final AbstractC7962 mo8903() throws C9637 {
        m8884(2);
        return this.f9680.mo21534();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8922() throws C9637 {
        m8884(0);
        return this.f9680.mo21545();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ܳ */
    public final int mo8914() throws C9637 {
        m8884(0);
        return this.f9680.mo21528();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ֡ */
    public final int mo8889() throws C9637 {
        m8884(5);
        return this.f9680.mo21542();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ܽ */
    public final long mo8918() throws C9637 {
        m8884(1);
        return this.f9680.mo21543();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩻ */
    public final int mo8930() throws C9637 {
        m8884(0);
        return this.f9680.mo21518();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ܺ */
    public final long mo8916() throws C9637 {
        m8884(0);
        return this.f9680.mo21527();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ֡ */
    public final void mo8890(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C21257;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C21257 c21257 = (C21257) list;
            int i = this.f9682 & 7;
            if (i == 1) {
                do {
                    c21257.m48019(abstractC9303.mo21547());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21545 = abstractC9303.mo21545();
                m8887(iMo21545);
                int iMo21537 = abstractC9303.mo21537() + iMo21545;
                do {
                    c21257.m48019(abstractC9303.mo21547());
                } while (abstractC9303.mo21537() < iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(abstractC9303.mo21547()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21546 = abstractC9303.mo21545();
            m8887(iMo21546);
            int iMo21538 = abstractC9303.mo21537() + iMo21546;
            do {
                list.add(Double.valueOf(abstractC9303.mo21547()));
            } while (abstractC9303.mo21537() < iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8925(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C9895;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C9895 c9895 = (C9895) list;
            int i = this.f9682 & 7;
            if (i == 2) {
                int iMo21545 = abstractC9303.mo21545();
                m8885(iMo21545);
                int iMo21537 = abstractC9303.mo21537() + iMo21545;
                do {
                    c9895.m23172(abstractC9303.mo21530());
                } while (abstractC9303.mo21537() < iMo21537);
                return;
            }
            if (i == 5) {
                do {
                    c9895.m23172(abstractC9303.mo21530());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 2) {
            int iMo21546 = abstractC9303.mo21545();
            m8885(iMo21546);
            int iMo21538 = abstractC9303.mo21537() + iMo21546;
            do {
                list.add(Float.valueOf(abstractC9303.mo21530()));
            } while (abstractC9303.mo21537() < iMo21538);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Float.valueOf(abstractC9303.mo21530()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ܽ */
    public final void mo8919(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C7646;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C7646 c7646 = (C7646) list;
            int i = this.f9682 & 7;
            if (i == 0) {
                do {
                    c7646.m17622(abstractC9303.mo21546());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21537 = abstractC9303.mo21537() + abstractC9303.mo21545();
                do {
                    c7646.m17622(abstractC9303.mo21546());
                } while (abstractC9303.mo21537() < iMo21537);
                m8883(iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC9303.mo21546()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21538 = abstractC9303.mo21537() + abstractC9303.mo21545();
            do {
                list.add(Long.valueOf(abstractC9303.mo21546()));
            } while (abstractC9303.mo21537() < iMo21538);
            m8883(iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8923(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C7646;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C7646 c7646 = (C7646) list;
            int i = this.f9682 & 7;
            if (i == 0) {
                do {
                    c7646.m17622(abstractC9303.mo21525());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21537 = abstractC9303.mo21537() + abstractC9303.mo21545();
                do {
                    c7646.m17622(abstractC9303.mo21525());
                } while (abstractC9303.mo21537() < iMo21537);
                m8883(iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC9303.mo21525()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21538 = abstractC9303.mo21537() + abstractC9303.mo21545();
            do {
                list.add(Long.valueOf(abstractC9303.mo21525()));
            } while (abstractC9303.mo21537() < iMo21538);
            m8883(iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ܺ */
    public final void mo8917(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C23719;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C23719 c23719 = (C23719) list;
            int i = this.f9682 & 7;
            if (i == 0) {
                do {
                    c23719.mo19112(abstractC9303.mo21536());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21537 = abstractC9303.mo21537() + abstractC9303.mo21545();
                do {
                    c23719.mo19112(abstractC9303.mo21536());
                } while (abstractC9303.mo21537() < iMo21537);
                m8883(iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC9303.mo21536()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21538 = abstractC9303.mo21537() + abstractC9303.mo21545();
            do {
                list.add(Integer.valueOf(abstractC9303.mo21536()));
            } while (abstractC9303.mo21537() < iMo21538);
            m8883(iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۜ */
    public final void mo8904(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C7646;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C7646 c7646 = (C7646) list;
            int i = this.f9682 & 7;
            if (i == 1) {
                do {
                    c7646.m17622(abstractC9303.mo21531());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21545 = abstractC9303.mo21545();
                m8887(iMo21545);
                int iMo21537 = abstractC9303.mo21537() + iMo21545;
                do {
                    c7646.m17622(abstractC9303.mo21531());
                } while (abstractC9303.mo21537() < iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC9303.mo21531()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21546 = abstractC9303.mo21545();
            m8887(iMo21546);
            int iMo21538 = abstractC9303.mo21537() + iMo21546;
            do {
                list.add(Long.valueOf(abstractC9303.mo21531()));
            } while (abstractC9303.mo21537() < iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۖ */
    public final void mo8899(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C23719;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C23719 c23719 = (C23719) list;
            int i = this.f9682 & 7;
            if (i == 2) {
                int iMo21545 = abstractC9303.mo21545();
                m8885(iMo21545);
                int iMo21537 = abstractC9303.mo21537() + iMo21545;
                do {
                    c23719.mo19112(abstractC9303.mo21544());
                } while (abstractC9303.mo21537() < iMo21537);
                return;
            }
            if (i == 5) {
                do {
                    c23719.mo19112(abstractC9303.mo21544());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 2) {
            int iMo21546 = abstractC9303.mo21545();
            m8885(iMo21546);
            int iMo21538 = abstractC9303.mo21537() + iMo21546;
            do {
                list.add(Integer.valueOf(abstractC9303.mo21544()));
            } while (abstractC9303.mo21537() < iMo21538);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(abstractC9303.mo21544()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ܳ */
    public final void mo8915(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C7292;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C7292 c7292 = (C7292) list;
            int i = this.f9682 & 7;
            if (i == 0) {
                do {
                    c7292.m16845(abstractC9303.mo21539());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21537 = abstractC9303.mo21537() + abstractC9303.mo21545();
                do {
                    c7292.m16845(abstractC9303.mo21539());
                } while (abstractC9303.mo21537() < iMo21537);
                m8883(iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(abstractC9303.mo21539()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21538 = abstractC9303.mo21537() + abstractC9303.mo21545();
            do {
                list.add(Boolean.valueOf(abstractC9303.mo21539()));
            } while (abstractC9303.mo21537() < iMo21538);
            m8883(iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۘ */
    public final void mo8901(List list) throws C9637 {
        m8897(list, false);
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩻ */
    public final void mo8931(List list) throws C9637 {
        m8897(list, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8897(List list, boolean z) throws C9637 {
        int iMo21535;
        int iMo21536;
        if ((this.f9682 & 7) != 2) {
            throw C4293.m8708();
        }
        boolean z2 = list instanceof InterfaceC6305;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z2 && !z) {
            InterfaceC6305 interfaceC6305 = (InterfaceC6305) list;
            do {
                interfaceC6305.mo10516(mo8903());
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21536 = abstractC9303.mo21535();
                }
            } while (iMo21536 == this.f9682);
            this.f9681 = iMo21536;
            return;
        }
        do {
            list.add(z ? mo8891() : mo8898());
            if (abstractC9303.mo21540()) {
                return;
            } else {
                iMo21535 = abstractC9303.mo21535();
            }
        } while (iMo21535 == this.f9682);
        this.f9681 = iMo21535;
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۧ */
    public final void mo8912(List list, InterfaceC11277 interfaceC11277, C19283 c19283) throws C4293 {
        int iMo21535;
        int i = this.f9682;
        if ((i & 7) != 2) {
            throw C4293.m8708();
        }
        do {
            Object objMo26207 = interfaceC11277.mo26207();
            m8888(objMo26207, interfaceC11277, c19283);
            interfaceC11277.mo26208(objMo26207);
            list.add(objMo26207);
            AbstractC9303 abstractC9303 = this.f9680;
            if (abstractC9303.mo21540() || this.f9681 != 0) {
                return;
            } else {
                iMo21535 = abstractC9303.mo21535();
            }
        } while (iMo21535 == i);
        this.f9681 = iMo21535;
    }

    @Override // p067l.InterfaceC12618
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo8896(List list, InterfaceC11277 interfaceC11277, C19283 c19283) throws C9637 {
        int iMo21535;
        int i = this.f9682;
        if ((i & 7) != 3) {
            throw C4293.m8708();
        }
        do {
            Object objMo26207 = interfaceC11277.mo26207();
            m8886(objMo26207, interfaceC11277, c19283);
            interfaceC11277.mo26208(objMo26207);
            list.add(objMo26207);
            AbstractC9303 abstractC9303 = this.f9680;
            if (abstractC9303.mo21540() || this.f9681 != 0) {
                return;
            } else {
                iMo21535 = abstractC9303.mo21535();
            }
        } while (iMo21535 == i);
        this.f9681 = iMo21535;
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩵ */
    public final void mo8926(List list) throws C9637 {
        int iMo21535;
        if ((this.f9682 & 7) != 2) {
            throw C4293.m8708();
        }
        do {
            list.add(mo8903());
            AbstractC9303 abstractC9303 = this.f9680;
            if (abstractC9303.mo21540()) {
                return;
            } else {
                iMo21535 = abstractC9303.mo21535();
            }
        } while (iMo21535 == this.f9682);
        this.f9681 = iMo21535;
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۢ */
    public final void mo8908(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C23719;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C23719 c23719 = (C23719) list;
            int i = this.f9682 & 7;
            if (i == 0) {
                do {
                    c23719.mo19112(abstractC9303.mo21545());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21537 = abstractC9303.mo21537() + abstractC9303.mo21545();
                do {
                    c23719.mo19112(abstractC9303.mo21545());
                } while (abstractC9303.mo21537() < iMo21537);
                m8883(iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC9303.mo21545()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21538 = abstractC9303.mo21537() + abstractC9303.mo21545();
            do {
                list.add(Integer.valueOf(abstractC9303.mo21545()));
            } while (abstractC9303.mo21537() < iMo21538);
            m8883(iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ܿ */
    public final void mo8921(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C23719;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C23719 c23719 = (C23719) list;
            int i = this.f9682 & 7;
            if (i == 0) {
                do {
                    c23719.mo19112(abstractC9303.mo21528());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21537 = abstractC9303.mo21537() + abstractC9303.mo21545();
                do {
                    c23719.mo19112(abstractC9303.mo21528());
                } while (abstractC9303.mo21537() < iMo21537);
                m8883(iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC9303.mo21528()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21538 = abstractC9303.mo21537() + abstractC9303.mo21545();
            do {
                list.add(Integer.valueOf(abstractC9303.mo21528()));
            } while (abstractC9303.mo21537() < iMo21538);
            m8883(iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ֫ */
    public final void mo8895(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C23719;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C23719 c23719 = (C23719) list;
            int i = this.f9682 & 7;
            if (i == 2) {
                int iMo21545 = abstractC9303.mo21545();
                m8885(iMo21545);
                int iMo21537 = abstractC9303.mo21537() + iMo21545;
                do {
                    c23719.mo19112(abstractC9303.mo21542());
                } while (abstractC9303.mo21537() < iMo21537);
                return;
            }
            if (i == 5) {
                do {
                    c23719.mo19112(abstractC9303.mo21542());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 2) {
            int iMo21546 = abstractC9303.mo21545();
            m8885(iMo21546);
            int iMo21538 = abstractC9303.mo21537() + iMo21546;
            do {
                list.add(Integer.valueOf(abstractC9303.mo21542()));
            } while (abstractC9303.mo21537() < iMo21538);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(abstractC9303.mo21542()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۡ */
    public final void mo8906(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C7646;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C7646 c7646 = (C7646) list;
            int i = this.f9682 & 7;
            if (i == 1) {
                do {
                    c7646.m17622(abstractC9303.mo21543());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21545 = abstractC9303.mo21545();
                m8887(iMo21545);
                int iMo21537 = abstractC9303.mo21537() + iMo21545;
                do {
                    c7646.m17622(abstractC9303.mo21543());
                } while (abstractC9303.mo21537() < iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC9303.mo21543()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21546 = abstractC9303.mo21545();
            m8887(iMo21546);
            int iMo21538 = abstractC9303.mo21537() + iMo21546;
            do {
                list.add(Long.valueOf(abstractC9303.mo21543()));
            } while (abstractC9303.mo21537() < iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8929(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C23719;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C23719 c23719 = (C23719) list;
            int i = this.f9682 & 7;
            if (i == 0) {
                do {
                    c23719.mo19112(abstractC9303.mo21518());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21537 = abstractC9303.mo21537() + abstractC9303.mo21545();
                do {
                    c23719.mo19112(abstractC9303.mo21518());
                } while (abstractC9303.mo21537() < iMo21537);
                m8883(iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC9303.mo21518()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21538 = abstractC9303.mo21537() + abstractC9303.mo21545();
            do {
                list.add(Integer.valueOf(abstractC9303.mo21518()));
            } while (abstractC9303.mo21537() < iMo21538);
            m8883(iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ۧ */
    public final void mo8911(List list) throws C4293 {
        int iMo21535;
        int iMo21536;
        boolean z = list instanceof C7646;
        AbstractC9303 abstractC9303 = this.f9680;
        if (z) {
            C7646 c7646 = (C7646) list;
            int i = this.f9682 & 7;
            if (i == 0) {
                do {
                    c7646.m17622(abstractC9303.mo21527());
                    if (abstractC9303.mo21540()) {
                        return;
                    } else {
                        iMo21536 = abstractC9303.mo21535();
                    }
                } while (iMo21536 == this.f9682);
                this.f9681 = iMo21536;
                return;
            }
            if (i == 2) {
                int iMo21537 = abstractC9303.mo21537() + abstractC9303.mo21545();
                do {
                    c7646.m17622(abstractC9303.mo21527());
                } while (abstractC9303.mo21537() < iMo21537);
                m8883(iMo21537);
                return;
            }
            throw C4293.m8708();
        }
        int i2 = this.f9682 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC9303.mo21527()));
                if (abstractC9303.mo21540()) {
                    return;
                } else {
                    iMo21535 = abstractC9303.mo21535();
                }
            } while (iMo21535 == this.f9682);
            this.f9681 = iMo21535;
            return;
        }
        if (i2 == 2) {
            int iMo21538 = abstractC9303.mo21537() + abstractC9303.mo21545();
            do {
                list.add(Long.valueOf(abstractC9303.mo21527()));
            } while (abstractC9303.mo21537() < iMo21538);
            m8883(iMo21538);
            return;
        }
        throw C4293.m8708();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m8887(int i) throws C4293 {
        if ((i & 7) != 0) {
            throw C4293.m8704();
        }
    }

    @Override // p067l.InterfaceC12618
    /* JADX INFO: renamed from: ܿ */
    public final void mo8920() throws C9637 {
        m8884(2);
        AbstractC9303 abstractC9303 = this.f9680;
        abstractC9303.mo21538(abstractC9303.mo21545());
        throw null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m8885(int i) throws C4293 {
        if ((i & 3) != 0) {
            throw C4293.m8704();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8883(int i) throws C4293 {
        if (this.f9680.mo21537() != i) {
            throw C4293.m8710();
        }
    }
}
