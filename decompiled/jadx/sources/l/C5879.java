package l;

/* JADX INFO: renamed from: l.ۛۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5879 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14801 f18028;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15941[] f18029;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18030;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object[] f18031;

    public C5879(InterfaceC14801 interfaceC14801, int i) {
        this.f18028 = interfaceC14801;
        this.f18031 = new Object[i];
        this.f18029 = new InterfaceC15941[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16440(InterfaceC15941 interfaceC15941, Object obj) {
        int i = this.f18030;
        this.f18031[i] = obj;
        this.f18030 = i + 1;
        this.f18029[i] = interfaceC15941;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16439(InterfaceC14801 interfaceC14801) {
        InterfaceC15941[] interfaceC15941Arr = this.f18029;
        int length = interfaceC15941Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC15941 interfaceC15941 = interfaceC15941Arr[length];
            C11233.m27799(interfaceC15941);
            interfaceC15941.m37716(this.f18031[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
