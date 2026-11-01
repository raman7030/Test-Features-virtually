package p067l;

/* JADX INFO: renamed from: l.ۧۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12723 implements InterfaceC16409 {

    /* JADX INFO: renamed from: ֫ */
    public final C8363 f35741;

    /* JADX INFO: renamed from: ۧ */
    public final int f35742;

    /* JADX INFO: renamed from: ܽ */
    public final C7022 f35743 = new C7022();

    @Override // p067l.InterfaceC16409
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo29260() {
    }

    public C12723(C8363 c8363, int i) {
        this.f35741 = c8363;
        this.f35742 = i;
    }

    @Override // p067l.InterfaceC16409
    /* JADX INFO: renamed from: ֫ */
    public final C19092 mo29259(InterfaceC10375 interfaceC10375, long j) {
        long position = interfaceC10375.getPosition();
        long jM29258 = m29258(interfaceC10375);
        long jMo24039 = interfaceC10375.mo24039();
        interfaceC10375.mo24030(Math.max(6, this.f35741.f22399));
        long jM29259 = m29258(interfaceC10375);
        long jMo240310 = interfaceC10375.mo24039();
        if (jM29258 <= j && jM29259 > j) {
            return C19092.m43372(jMo24039);
        }
        if (jM29259 <= j) {
            return C19092.m43375(jM29259, jMo240310);
        }
        return C19092.m43373(jM29258, position);
    }

    /* JADX INFO: renamed from: ֫ */
    private long m29258(InterfaceC10375 interfaceC10375) {
        C7022 c7022;
        C8363 c8363;
        int iMo24035;
        while (true) {
            long jMo24039 = interfaceC10375.mo24039();
            long length = interfaceC10375.getLength() - 6;
            c7022 = this.f35743;
            c8363 = this.f35741;
            if (jMo24039 >= length) {
                break;
            }
            long jMo240310 = interfaceC10375.mo24039();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean zM12663 = false;
            interfaceC10375.mo24031(0, 2, bArr);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.f35742;
            if (i2 != i3) {
                interfaceC10375.mo24036();
                interfaceC10375.mo24030((int) (jMo240310 - interfaceC10375.getPosition()));
            } else {
                C19203 c19203 = new C19203(16);
                System.arraycopy(bArr, 0, c19203.m43728(), 0, 2);
                byte[] bArrM43728 = c19203.m43728();
                while (i < 14 && (iMo24035 = interfaceC10375.mo24035(2 + i, 14 - i, bArrM43728)) != -1) {
                    i += iMo24035;
                }
                c19203.m43732(i);
                interfaceC10375.mo24036();
                interfaceC10375.mo24030((int) (jMo240310 - interfaceC10375.getPosition()));
                zM12663 = C5681.m12663(c19203, c8363, i3, c7022);
            }
            if (zM12663) {
                break;
            }
            interfaceC10375.mo24030(1);
        }
        if (interfaceC10375.mo24039() >= interfaceC10375.getLength() - 6) {
            interfaceC10375.mo24030((int) (interfaceC10375.getLength() - interfaceC10375.mo24039()));
            return c8363.f22404;
        }
        return c7022.f18293;
    }
}
