package p067l;

/* JADX INFO: renamed from: l.ۛۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes2.dex */
public final class C7956 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16436 f20883;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC17519[] f20884;

    /* JADX INFO: renamed from: ܽ */
    public int f20885;

    /* JADX INFO: renamed from: ᩳ */
    public final Object[] f20886;

    public C7956(InterfaceC16436 interfaceC16436, int i) {
        this.f20883 = interfaceC16436;
        this.f20886 = new Object[i];
        this.f20884 = new InterfaceC17519[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18366(InterfaceC17519 interfaceC17519, Object obj) {
        int i = this.f20885;
        this.f20886[i] = obj;
        this.f20885 = i + 1;
        this.f20884[i] = interfaceC17519;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18365(InterfaceC16436 interfaceC16436) {
        InterfaceC17519[] interfaceC17519Arr = this.f20884;
        int length = interfaceC17519Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC17519 interfaceC17519 = interfaceC17519Arr[length];
            C13045.m29861(interfaceC17519);
            interfaceC17519.m39891(this.f20886[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
