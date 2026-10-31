package l;

/* JADX INFO: renamed from: l.ܿ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9PS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17009 {
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo7227();

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo7228(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo7229(Object obj, Object obj2);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7230(int i, int i2, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7231(int i, long j, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7232(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7233(Object obj, int i, AbstractC5886 abstractC5886);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7234(Object obj, InterfaceC6633 interfaceC6633);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo7235(InterfaceC10785 interfaceC10785);

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo7236(Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7237(int i, long j, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7238(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7239(Object obj, InterfaceC6633 interfaceC6633);

    /* JADX INFO: renamed from: ܳ */
    public abstract Object mo7240(Object obj);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo7241(Object obj);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo7242(Object obj, Object obj2);

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo7243(Object obj);

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo7244(Object obj);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39893(Object obj, InterfaceC10785 interfaceC10785) throws C2025 {
        int tag = interfaceC10785.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            mo7237(i, interfaceC10785.mo6776(), obj);
            return true;
        }
        if (i2 == 1) {
            mo7231(i, interfaceC10785.mo6766(), obj);
            return true;
        }
        if (i2 == 2) {
            mo7233(obj, i, interfaceC10785.mo6777());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                mo7230(i, interfaceC10785.mo6779(), obj);
                return true;
            }
            throw C2025.m6582();
        }
        Object objMo7227 = mo7227();
        int i3 = 4 | (i << 3);
        while (interfaceC10785.mo6774() != Integer.MAX_VALUE && m39893(objMo7227, interfaceC10785)) {
        }
        if (i3 != interfaceC10785.getTag()) {
            throw C2025.m6579();
        }
        mo7232(i, obj, mo7240(objMo7227));
        return true;
    }
}
