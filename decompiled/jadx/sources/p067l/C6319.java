package p067l;

/* JADX INFO: renamed from: l.ۘ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6319 extends AbstractC14345 {

    /* JADX INFO: renamed from: ֡֫ */
    public InterfaceC10047 f16376;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f16377;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f16378;

    /* JADX INFO: renamed from: ᩵֫ */
    public final byte[] f16379;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    public C6319(int i, InterfaceC3341 interfaceC3341, byte[] bArr) {
        super(interfaceC3341);
        this.f16379 = bArr;
        this.f16378 = i;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final int m14449() {
        return this.f16378;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final InterfaceC10047 m14446() {
        return this.f16376;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10047 m14447(Class cls) throws C5255 {
        InterfaceC10047 interfaceC10047 = this.f16376;
        if (interfaceC10047 == null) {
            throw new C5255("Failed to decode output data");
        }
        if (cls.isAssignableFrom(interfaceC10047.getClass())) {
            return interfaceC10047;
        }
        throw new C5255("Incompatible response data " + interfaceC10047.getClass());
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public final int m14448() {
        return this.f16377;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo12494() {
        int i;
        int i2;
        int iM12485 = m12485();
        if (iM12485 == -1073741811) {
            return false;
        }
        if (iM12485 == -1073741811 && ((i2 = this.f16378) == 1327346 || i2 == 1343730)) {
            return false;
        }
        return !(iM12485 == -2147483643 && ((i = this.f16378) == 1163287 || i == 1130508 || i == 393620)) && super.mo12494();
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        int iM7363 = C3775.m7363(i, bArr);
        if (iM7363 == 9) {
            return m12495(i, bArr);
        }
        if (iM7363 != 49) {
            throw new C19258("Expected structureSize = 49");
        }
        this.f16378 = C3775.m7365(i + 4, bArr);
        System.arraycopy(bArr, i + 8, new byte[16], 0, 16);
        int iM12492 = m12492() + C3775.m7365(i + 24, bArr);
        int iM7365 = C3775.m7365(i + 28, bArr);
        int iM12493 = m12492() + C3775.m7365(i + 32, bArr);
        int iM7366 = C3775.m7365(i + 36, bArr);
        C3775.m7365(i + 40, bArr);
        int i2 = i + 48;
        byte[] bArr2 = this.f16379;
        InterfaceC10047 c4506 = null;
        if (bArr2 == null) {
            switch (this.f16378) {
                case 393620:
                    c4506 = new C4506();
                    break;
                case 1130508:
                    c4506 = new C21072();
                    break;
                case 1310840:
                    c4506 = new C2965();
                    break;
                case 1311236:
                    c4506 = new C3636();
                    break;
                case 1327346:
                case 1343730:
                    c4506 = new C20401();
                    break;
            }
        }
        this.f16376 = c4506;
        int iMax = Math.max(iM12492 + iM7365, i2);
        if (bArr2 != null) {
            if (iM7366 > bArr2.length) {
                throw new C19258("Output length exceeds buffer size");
            }
            System.arraycopy(bArr, iM12493, bArr2, 0, iM7366);
        } else {
            InterfaceC10047 interfaceC10047 = this.f16376;
            if (interfaceC10047 != null) {
                interfaceC10047.mo4913(iM12493, iM7366, bArr);
            }
        }
        this.f16377 = iM7366;
        return Math.max(iM12493 + iM7366, iMax) - i;
    }
}
