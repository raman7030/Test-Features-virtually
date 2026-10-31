package l;

import java.util.List;

/* JADX INFO: renamed from: l.֫᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E94U */
/* JADX INFO: loaded from: classes2.dex */
public final class C2067 implements InterfaceC10785 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6895;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC7297 f6896;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6897 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f6898;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2067 m6756(AbstractC7297 abstractC7297) {
        C2067 c2067 = abstractC7297.f22402;
        return c2067 != null ? c2067 : new C2067(abstractC7297);
    }

    public C2067(AbstractC7297 abstractC7297) {
        C13997.m33482(abstractC7297, "input");
        this.f6896 = abstractC7297;
        abstractC7297.f22402 = this;
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo6798() {
        this.f6896.getClass();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo6774() {
        int i = this.f6897;
        if (i != 0) {
            this.f6898 = i;
            this.f6897 = 0;
        } else {
            this.f6898 = this.f6896.mo19567();
        }
        int i2 = this.f6898;
        if (i2 == 0 || i2 == this.f6895) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // l.InterfaceC10785
    public final int getTag() {
        return this.f6898;
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean mo6801() {
        int i;
        AbstractC7297 abstractC7297 = this.f6896;
        if (abstractC7297.mo19572() || (i = this.f6898) == this.f6895) {
            return false;
        }
        return abstractC7297.mo19573(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m6758(int i) throws C7648 {
        if ((this.f6898 & 7) != i) {
            throw C2025.m6582();
        }
    }

    @Override // l.InterfaceC10785
    public final double readDouble() throws C7648 {
        m6758(1);
        return this.f6896.mo19579();
    }

    @Override // l.InterfaceC10785
    public final float readFloat() throws C7648 {
        m6758(5);
        return this.f6896.mo19562();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long mo6781() throws C7648 {
        m6758(0);
        return this.f6896.mo19578();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long mo6776() throws C7648 {
        m6758(0);
        return this.f6896.mo19557();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo6802() throws C7648 {
        m6758(0);
        return this.f6896.mo19568();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo6766() throws C7648 {
        m6758(1);
        return this.f6896.mo19563();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int mo6779() throws C7648 {
        m6758(5);
        return this.f6896.mo19576();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo6787() throws C7648 {
        m6758(0);
        return this.f6896.mo19571();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo6772() throws C7648 {
        m6758(2);
        return this.f6896.mo19551();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String mo6765() throws C7648 {
        m6758(2);
        return this.f6896.mo19561();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo6783(Class cls, C17798 c17798) throws C2025 {
        m6758(2);
        InterfaceC9374 interfaceC9374M28054 = C11345.m28053().m28054(cls);
        Object objMo24197 = interfaceC9374M28054.mo24197();
        m6762(objMo24197, interfaceC9374M28054, c17798);
        interfaceC9374M28054.mo24198(objMo24197);
        return objMo24197;
    }

    @Override // l.InterfaceC10785
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo6767(Class cls, C17798 c17798) throws C7648 {
        m6758(3);
        InterfaceC9374 interfaceC9374M28054 = C11345.m28053().m28054(cls);
        Object objMo24197 = interfaceC9374M28054.mo24197();
        m6760(objMo24197, interfaceC9374M28054, c17798);
        interfaceC9374M28054.mo24198(objMo24197);
        return objMo24197;
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6784(Object obj, InterfaceC9374 interfaceC9374, C17798 c17798) throws C2025 {
        m6758(2);
        m6762(obj, interfaceC9374, c17798);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m6762(Object obj, InterfaceC9374 interfaceC9374, C17798 c17798) throws C2025 {
        AbstractC7297 abstractC7297 = this.f6896;
        int iMo19577 = abstractC7297.mo19577();
        if (abstractC7297.f22399 >= abstractC7297.f22400) {
            throw new C2025("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo19570 = abstractC7297.mo19570(iMo19577);
        abstractC7297.f22399++;
        interfaceC9374.mo24201(obj, this, c17798);
        abstractC7297.mo19554(0);
        abstractC7297.f22399--;
        abstractC7297.mo19565(iMo19570);
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6768(Object obj, InterfaceC9374 interfaceC9374, C17798 c17798) throws C7648 {
        m6758(3);
        m6760(obj, interfaceC9374, c17798);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m6760(Object obj, InterfaceC9374 interfaceC9374, C17798 c17798) {
        int i = this.f6895;
        this.f6895 = ((this.f6898 >>> 3) << 3) | 4;
        try {
            interfaceC9374.mo24201(obj, this, c17798);
            if (this.f6898 != this.f6895) {
                throw C2025.m6578();
            }
            this.f6895 = i;
        } catch (Throwable th) {
            this.f6895 = i;
            throw th;
        }
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC5886 mo6777() throws C7648 {
        m6758(2);
        return this.f6896.mo19566();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo6796() throws C7648 {
        m6758(0);
        return this.f6896.mo19577();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo6788() throws C7648 {
        m6758(0);
        return this.f6896.mo19560();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int mo6763() throws C7648 {
        m6758(5);
        return this.f6896.mo19574();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo6792() throws C7648 {
        m6758(1);
        return this.f6896.mo19575();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo6804() throws C7648 {
        m6758(0);
        return this.f6896.mo19550();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long mo6790() throws C7648 {
        m6758(0);
        return this.f6896.mo19559();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void mo6764(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C19875;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C19875 c19875 = (C19875) list;
            int i = this.f6898 & 7;
            if (i == 1) {
                do {
                    c19875.m45708(abstractC7297.mo19579());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19577 = abstractC7297.mo19577();
                m6761(iMo19577);
                int iMo19569 = abstractC7297.mo19569() + iMo19577;
                do {
                    c19875.m45708(abstractC7297.mo19579());
                } while (abstractC7297.mo19569() < iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(abstractC7297.mo19579()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo19578 = abstractC7297.mo19577();
            m6761(iMo19578);
            int iMo195610 = abstractC7297.mo19569() + iMo19578;
            do {
                list.add(Double.valueOf(abstractC7297.mo19579()));
            } while (abstractC7297.mo19569() < iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo6799(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C7920;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C7920 c7920 = (C7920) list;
            int i = this.f6898 & 7;
            if (i == 2) {
                int iMo19577 = abstractC7297.mo19577();
                m6759(iMo19577);
                int iMo19569 = abstractC7297.mo19569() + iMo19577;
                do {
                    c7920.m21206(abstractC7297.mo19562());
                } while (abstractC7297.mo19569() < iMo19569);
                return;
            }
            if (i == 5) {
                do {
                    c7920.m21206(abstractC7297.mo19562());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 2) {
            int iMo19578 = abstractC7297.mo19577();
            m6759(iMo19578);
            int iMo195610 = abstractC7297.mo19569() + iMo19578;
            do {
                list.add(Float.valueOf(abstractC7297.mo19562()));
            } while (abstractC7297.mo19569() < iMo195610);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Float.valueOf(abstractC7297.mo19562()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6793(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C5553;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C5553 c5553 = (C5553) list;
            int i = this.f6898 & 7;
            if (i == 0) {
                do {
                    c5553.m15708(abstractC7297.mo19578());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19569 = abstractC7297.mo19569() + abstractC7297.mo19577();
                do {
                    c5553.m15708(abstractC7297.mo19578());
                } while (abstractC7297.mo19569() < iMo19569);
                m6757(iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC7297.mo19578()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo195610 = abstractC7297.mo19569() + abstractC7297.mo19577();
            do {
                list.add(Long.valueOf(abstractC7297.mo19578()));
            } while (abstractC7297.mo19569() < iMo195610);
            m6757(iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo6797(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C5553;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C5553 c5553 = (C5553) list;
            int i = this.f6898 & 7;
            if (i == 0) {
                do {
                    c5553.m15708(abstractC7297.mo19557());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19569 = abstractC7297.mo19569() + abstractC7297.mo19577();
                do {
                    c5553.m15708(abstractC7297.mo19557());
                } while (abstractC7297.mo19569() < iMo19569);
                m6757(iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC7297.mo19557()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo195610 = abstractC7297.mo19569() + abstractC7297.mo19577();
            do {
                list.add(Long.valueOf(abstractC7297.mo19557()));
            } while (abstractC7297.mo19569() < iMo195610);
            m6757(iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo6791(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C22465;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C22465 c22465 = (C22465) list;
            int i = this.f6898 & 7;
            if (i == 0) {
                do {
                    c22465.mo17174(abstractC7297.mo19568());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19569 = abstractC7297.mo19569() + abstractC7297.mo19577();
                do {
                    c22465.mo17174(abstractC7297.mo19568());
                } while (abstractC7297.mo19569() < iMo19569);
                m6757(iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC7297.mo19568()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo195610 = abstractC7297.mo19569() + abstractC7297.mo19577();
            do {
                list.add(Integer.valueOf(abstractC7297.mo19568()));
            } while (abstractC7297.mo19569() < iMo195610);
            m6757(iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo6778(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C5553;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C5553 c5553 = (C5553) list;
            int i = this.f6898 & 7;
            if (i == 1) {
                do {
                    c5553.m15708(abstractC7297.mo19563());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19577 = abstractC7297.mo19577();
                m6761(iMo19577);
                int iMo19569 = abstractC7297.mo19569() + iMo19577;
                do {
                    c5553.m15708(abstractC7297.mo19563());
                } while (abstractC7297.mo19569() < iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC7297.mo19563()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo19578 = abstractC7297.mo19577();
            m6761(iMo19578);
            int iMo195610 = abstractC7297.mo19569() + iMo19578;
            do {
                list.add(Long.valueOf(abstractC7297.mo19563()));
            } while (abstractC7297.mo19569() < iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo6773(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C22465;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C22465 c22465 = (C22465) list;
            int i = this.f6898 & 7;
            if (i == 2) {
                int iMo19577 = abstractC7297.mo19577();
                m6759(iMo19577);
                int iMo19569 = abstractC7297.mo19569() + iMo19577;
                do {
                    c22465.mo17174(abstractC7297.mo19576());
                } while (abstractC7297.mo19569() < iMo19569);
                return;
            }
            if (i == 5) {
                do {
                    c22465.mo17174(abstractC7297.mo19576());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 2) {
            int iMo19578 = abstractC7297.mo19577();
            m6759(iMo19578);
            int iMo195610 = abstractC7297.mo19569() + iMo19578;
            do {
                list.add(Integer.valueOf(abstractC7297.mo19576()));
            } while (abstractC7297.mo19569() < iMo195610);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(abstractC7297.mo19576()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo6789(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C5181;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C5181 c5181 = (C5181) list;
            int i = this.f6898 & 7;
            if (i == 0) {
                do {
                    c5181.m14935(abstractC7297.mo19571());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19569 = abstractC7297.mo19569() + abstractC7297.mo19577();
                do {
                    c5181.m14935(abstractC7297.mo19571());
                } while (abstractC7297.mo19569() < iMo19569);
                m6757(iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(abstractC7297.mo19571()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo195610 = abstractC7297.mo19569() + abstractC7297.mo19577();
            do {
                list.add(Boolean.valueOf(abstractC7297.mo19571()));
            } while (abstractC7297.mo19569() < iMo195610);
            m6757(iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo6775(List list) throws C7648 {
        m6771(list, false);
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo6805(List list) throws C7648 {
        m6771(list, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6771(List list, boolean z) throws C7648 {
        int iMo19567;
        int iMo19568;
        if ((this.f6898 & 7) != 2) {
            throw C2025.m6582();
        }
        boolean z2 = list instanceof InterfaceC4142;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z2 && !z) {
            InterfaceC4142 interfaceC4142 = (InterfaceC4142) list;
            do {
                interfaceC4142.mo8469(mo6777());
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19568 = abstractC7297.mo19567();
                }
            } while (iMo19568 == this.f6898);
            this.f6897 = iMo19568;
            return;
        }
        do {
            list.add(z ? mo6765() : mo6772());
            if (abstractC7297.mo19572()) {
                return;
            } else {
                iMo19567 = abstractC7297.mo19567();
            }
        } while (iMo19567 == this.f6898);
        this.f6897 = iMo19567;
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6786(List list, InterfaceC9374 interfaceC9374, C17798 c17798) throws C2025 {
        int iMo19567;
        int i = this.f6898;
        if ((i & 7) != 2) {
            throw C2025.m6582();
        }
        do {
            Object objMo24197 = interfaceC9374.mo24197();
            m6762(objMo24197, interfaceC9374, c17798);
            interfaceC9374.mo24198(objMo24197);
            list.add(objMo24197);
            AbstractC7297 abstractC7297 = this.f6896;
            if (abstractC7297.mo19572() || this.f6897 != 0) {
                return;
            } else {
                iMo19567 = abstractC7297.mo19567();
            }
        } while (iMo19567 == i);
        this.f6897 = iMo19567;
    }

    @Override // l.InterfaceC10785
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6770(List list, InterfaceC9374 interfaceC9374, C17798 c17798) throws C7648 {
        int iMo19567;
        int i = this.f6898;
        if ((i & 7) != 3) {
            throw C2025.m6582();
        }
        do {
            Object objMo24197 = interfaceC9374.mo24197();
            m6760(objMo24197, interfaceC9374, c17798);
            interfaceC9374.mo24198(objMo24197);
            list.add(objMo24197);
            AbstractC7297 abstractC7297 = this.f6896;
            if (abstractC7297.mo19572() || this.f6897 != 0) {
                return;
            } else {
                iMo19567 = abstractC7297.mo19567();
            }
        } while (iMo19567 == i);
        this.f6897 = iMo19567;
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void mo6800(List list) throws C7648 {
        int iMo19567;
        if ((this.f6898 & 7) != 2) {
            throw C2025.m6582();
        }
        do {
            list.add(mo6777());
            AbstractC7297 abstractC7297 = this.f6896;
            if (abstractC7297.mo19572()) {
                return;
            } else {
                iMo19567 = abstractC7297.mo19567();
            }
        } while (iMo19567 == this.f6898);
        this.f6897 = iMo19567;
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo6782(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C22465;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C22465 c22465 = (C22465) list;
            int i = this.f6898 & 7;
            if (i == 0) {
                do {
                    c22465.mo17174(abstractC7297.mo19577());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19569 = abstractC7297.mo19569() + abstractC7297.mo19577();
                do {
                    c22465.mo17174(abstractC7297.mo19577());
                } while (abstractC7297.mo19569() < iMo19569);
                m6757(iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC7297.mo19577()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo195610 = abstractC7297.mo19569() + abstractC7297.mo19577();
            do {
                list.add(Integer.valueOf(abstractC7297.mo19577()));
            } while (abstractC7297.mo19569() < iMo195610);
            m6757(iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo6795(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C22465;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C22465 c22465 = (C22465) list;
            int i = this.f6898 & 7;
            if (i == 0) {
                do {
                    c22465.mo17174(abstractC7297.mo19560());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19569 = abstractC7297.mo19569() + abstractC7297.mo19577();
                do {
                    c22465.mo17174(abstractC7297.mo19560());
                } while (abstractC7297.mo19569() < iMo19569);
                m6757(iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC7297.mo19560()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo195610 = abstractC7297.mo19569() + abstractC7297.mo19577();
            do {
                list.add(Integer.valueOf(abstractC7297.mo19560()));
            } while (abstractC7297.mo19569() < iMo195610);
            m6757(iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6769(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C22465;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C22465 c22465 = (C22465) list;
            int i = this.f6898 & 7;
            if (i == 2) {
                int iMo19577 = abstractC7297.mo19577();
                m6759(iMo19577);
                int iMo19569 = abstractC7297.mo19569() + iMo19577;
                do {
                    c22465.mo17174(abstractC7297.mo19574());
                } while (abstractC7297.mo19569() < iMo19569);
                return;
            }
            if (i == 5) {
                do {
                    c22465.mo17174(abstractC7297.mo19574());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 2) {
            int iMo19578 = abstractC7297.mo19577();
            m6759(iMo19578);
            int iMo195610 = abstractC7297.mo19569() + iMo19578;
            do {
                list.add(Integer.valueOf(abstractC7297.mo19574()));
            } while (abstractC7297.mo19569() < iMo195610);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(abstractC7297.mo19574()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo6780(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C5553;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C5553 c5553 = (C5553) list;
            int i = this.f6898 & 7;
            if (i == 1) {
                do {
                    c5553.m15708(abstractC7297.mo19575());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19577 = abstractC7297.mo19577();
                m6761(iMo19577);
                int iMo19569 = abstractC7297.mo19569() + iMo19577;
                do {
                    c5553.m15708(abstractC7297.mo19575());
                } while (abstractC7297.mo19569() < iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC7297.mo19575()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo19578 = abstractC7297.mo19577();
            m6761(iMo19578);
            int iMo195610 = abstractC7297.mo19569() + iMo19578;
            do {
                list.add(Long.valueOf(abstractC7297.mo19575()));
            } while (abstractC7297.mo19569() < iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo6803(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C22465;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C22465 c22465 = (C22465) list;
            int i = this.f6898 & 7;
            if (i == 0) {
                do {
                    c22465.mo17174(abstractC7297.mo19550());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19569 = abstractC7297.mo19569() + abstractC7297.mo19577();
                do {
                    c22465.mo17174(abstractC7297.mo19550());
                } while (abstractC7297.mo19569() < iMo19569);
                m6757(iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC7297.mo19550()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo195610 = abstractC7297.mo19569() + abstractC7297.mo19577();
            do {
                list.add(Integer.valueOf(abstractC7297.mo19550()));
            } while (abstractC7297.mo19569() < iMo195610);
            m6757(iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6785(List list) throws C2025 {
        int iMo19567;
        int iMo19568;
        boolean z = list instanceof C5553;
        AbstractC7297 abstractC7297 = this.f6896;
        if (z) {
            C5553 c5553 = (C5553) list;
            int i = this.f6898 & 7;
            if (i == 0) {
                do {
                    c5553.m15708(abstractC7297.mo19559());
                    if (abstractC7297.mo19572()) {
                        return;
                    } else {
                        iMo19568 = abstractC7297.mo19567();
                    }
                } while (iMo19568 == this.f6898);
                this.f6897 = iMo19568;
                return;
            }
            if (i == 2) {
                int iMo19569 = abstractC7297.mo19569() + abstractC7297.mo19577();
                do {
                    c5553.m15708(abstractC7297.mo19559());
                } while (abstractC7297.mo19569() < iMo19569);
                m6757(iMo19569);
                return;
            }
            throw C2025.m6582();
        }
        int i2 = this.f6898 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC7297.mo19559()));
                if (abstractC7297.mo19572()) {
                    return;
                } else {
                    iMo19567 = abstractC7297.mo19567();
                }
            } while (iMo19567 == this.f6898);
            this.f6897 = iMo19567;
            return;
        }
        if (i2 == 2) {
            int iMo195610 = abstractC7297.mo19569() + abstractC7297.mo19577();
            do {
                list.add(Long.valueOf(abstractC7297.mo19559()));
            } while (abstractC7297.mo19569() < iMo195610);
            m6757(iMo195610);
            return;
        }
        throw C2025.m6582();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m6761(int i) throws C2025 {
        if ((i & 7) != 0) {
            throw C2025.m6578();
        }
    }

    @Override // l.InterfaceC10785
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo6794() throws C7648 {
        m6758(2);
        AbstractC7297 abstractC7297 = this.f6896;
        abstractC7297.mo19570(abstractC7297.mo19577());
        throw null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m6759(int i) throws C2025 {
        if ((i & 3) != 0) {
            throw C2025.m6578();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6757(int i) throws C2025 {
        if (this.f6896.mo19569() != i) {
            throw C2025.m6584();
        }
    }
}
