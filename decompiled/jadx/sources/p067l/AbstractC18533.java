package p067l;

/* JADX INFO: renamed from: l.ܿ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9PS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18533 {
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo9306();

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo9307(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo9308(Object obj, Object obj2);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9309(int i, int i2, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9310(int i, long j, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9311(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9312(Object obj, int i, AbstractC7962 abstractC7962);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9313(Object obj, InterfaceC8672 interfaceC8672);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo9314(InterfaceC12618 interfaceC12618);

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo9315(Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo9316(int i, long j, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo9317(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo9318(Object obj, InterfaceC8672 interfaceC8672);

    /* JADX INFO: renamed from: ܳ */
    public abstract Object mo9319(Object obj);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo9320(Object obj);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo9321(Object obj, Object obj2);

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo9322(Object obj);

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo9323(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42136(Object obj, InterfaceC12618 interfaceC12618) throws C4293 {
        int tag = interfaceC12618.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            mo9316(i, interfaceC12618.mo8902(), obj);
            return true;
        }
        if (i2 == 1) {
            mo9310(i, interfaceC12618.mo8892(), obj);
            return true;
        }
        if (i2 == 2) {
            mo9312(obj, i, interfaceC12618.mo8903());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                mo9309(i, interfaceC12618.mo8905(), obj);
                return true;
            }
            throw C4293.m8708();
        }
        Object objMo9306 = mo9306();
        int i3 = 4 | (i << 3);
        while (interfaceC12618.mo8900() != Integer.MAX_VALUE && m42136(objMo9306, interfaceC12618)) {
        }
        if (i3 != interfaceC12618.getTag()) {
            throw C4293.m8705();
        }
        mo9311(i, obj, mo9319(objMo9306));
        return true;
    }
}
