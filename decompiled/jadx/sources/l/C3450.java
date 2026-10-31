package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Date;

/* JADX INFO: renamed from: l.ۗ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9X8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3450 extends AbstractC12601 implements InterfaceC20594 {

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f10902 = C11321.m27961(C3450.class);

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f10903;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f10904;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public byte[] f10905;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f10906;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f10907;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f10908;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public long f10909;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22500[] f10910;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f10911;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f10912;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public EnumC21485 f10913;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public byte[] f10914;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f10915;

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10536(InterfaceC13495 interfaceC13495) {
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo10543(InterfaceC7578 interfaceC7578) {
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C3450(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
        this.f10905 = new byte[16];
        this.f10906 = -1;
    }

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final int m10541() {
        return this.f10903;
    }

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final byte[] m10551() {
        return this.f10905;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC21485 mo10552() {
        return this.f10913;
    }

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final int m10546() {
        return this.f10906;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int m10549() {
        return this.f10911;
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int m10534() {
        return this.f10912;
    }

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final byte[] m10535() {
        return this.f10914;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo10544() {
        return this.f10904;
    }

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final int m10542() {
        return this.f10915;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo10548(int i) {
        return (this.f10912 & i) == i;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo10545() {
        m10458().getClass();
        return mo10548(1);
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10537(InterfaceC18663 interfaceC18663) {
        return m10458().equals(interfaceC18663.mo27540());
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10538(InterfaceC18663 interfaceC18663, InterfaceC6482 interfaceC6482) {
        if (mo28213() && m10446() == 0) {
            boolean zMo14179 = interfaceC6482.mo14179();
            InterfaceC2148 interfaceC2148 = f10902;
            if (!zMo14179 || mo10540()) {
                if (this.f10903 == 767) {
                    interfaceC2148.mo7080("Server returned ANY dialect");
                    return false;
                }
                C4861 c4861 = (C4861) interfaceC6482;
                EnumC21485 enumC21485 = null;
                for (EnumC21485 enumC21486 : EnumC21485.values()) {
                    if (enumC21486.m48660() && enumC21486.m48658() == this.f10903) {
                        enumC21485 = enumC21486;
                    }
                }
                if (enumC21485 == null) {
                    interfaceC2148.mo7080("Server returned an unknown dialect");
                    return false;
                }
                if (!enumC21485.m48659(((C13722) m10458()).m32981()) || !enumC21485.m48661(((C13722) m10458()).m32972())) {
                    interfaceC2148.mo7080("Server selected an disallowed dialect version " + enumC21485 + " (min: " + ((C13722) m10458()).m32981() + " max: " + ((C13722) m10458()).m32972() + MotionUtils.EASING_TYPE_FORMAT_END);
                    return false;
                }
                this.f10913 = enumC21485;
                int iM14177 = c4861.m14177() & this.f10911;
                this.f10912 = iM14177;
                if ((iM14177 & 64) != 0) {
                    interfaceC18663.mo27540().getClass();
                }
                int i = 1;
                if (this.f10913.m48659(EnumC21485.SMB311)) {
                    int i2 = this.f10912;
                    InterfaceC22500[] interfaceC22500Arr = this.f10910;
                    if (interfaceC22500Arr == null || interfaceC22500Arr.length == 0) {
                        interfaceC2148.mo7080("Response lacks negotiate contexts");
                        return false;
                    }
                    int length = interfaceC22500Arr.length;
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    while (i3 < length) {
                        InterfaceC22500 interfaceC22500 = interfaceC22500Arr[i3];
                        if (interfaceC22500 != null) {
                            if (!z2 && interfaceC22500.mo36537() == 2) {
                                C15443 c15443 = (C15443) interfaceC22500;
                                if (c15443.m36538() == null || c15443.m36538().length != i) {
                                    interfaceC2148.mo7080("Server returned no cipher selection");
                                    return false;
                                }
                                C15443 c15444 = null;
                                for (InterfaceC21795 interfaceC21795 : c4861.m14176()) {
                                    if (interfaceC21795 instanceof C15443) {
                                        c15444 = (C15443) interfaceC21795;
                                    }
                                }
                                if (c15444 == null) {
                                    return false;
                                }
                                int[] iArrM36538 = c15444.m36538();
                                boolean z3 = false;
                                for (int i4 : iArrM36538) {
                                    if (i4 == c15443.m36538()[0]) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    int i5 = c15443.m36538()[0];
                                    z2 = true;
                                } else {
                                    interfaceC2148.mo7080("Server returned invalid cipher selection");
                                    return false;
                                }
                            } else {
                                if (interfaceC22500.mo36537() == 2) {
                                    interfaceC2148.mo7080("Multiple encryption negotiate contexts");
                                    return false;
                                }
                                if (!z && interfaceC22500.mo36537() == 1) {
                                    C20384 c20384 = (C20384) interfaceC22500;
                                    if (c20384.m46698() == null || c20384.m46698().length != 1) {
                                        interfaceC2148.mo7080("Server returned no hash selection");
                                        return false;
                                    }
                                    C20384 c20385 = null;
                                    for (InterfaceC21795 interfaceC21796 : c4861.m14176()) {
                                        if (interfaceC21796 instanceof C20384) {
                                            c20385 = (C20384) interfaceC21796;
                                        }
                                    }
                                    if (c20385 != null) {
                                        int[] iArrM46698 = c20385.m46698();
                                        boolean z4 = false;
                                        for (int i6 : iArrM46698) {
                                            if (i6 == c20384.m46698()[0]) {
                                                z4 = true;
                                            }
                                        }
                                        if (z4) {
                                            this.f10906 = c20384.m46698()[0];
                                            z = true;
                                        } else {
                                            interfaceC2148.mo7080("Server returned invalid hash selection");
                                            return false;
                                        }
                                    }
                                } else if (interfaceC22500.mo36537() == 1) {
                                    interfaceC2148.mo7080("Multiple preauth negotiate contexts");
                                    return false;
                                }
                            }
                        }
                        i3++;
                        i = 1;
                    }
                    if (!z) {
                        interfaceC2148.mo7080("Missing preauth negotiate context");
                        return false;
                    }
                    if (!z2 && (i2 & 64) != 0) {
                        interfaceC2148.mo7080("Missing encryption negotiate context");
                        return false;
                    }
                    if (!z2) {
                        interfaceC2148.mo7088("No encryption support");
                    }
                }
                int iM33003 = ((C13722) interfaceC18663.mo27540()).m33003();
                this.f10907 = Math.min(iM33003 - 80, Math.min(((C13722) interfaceC18663.mo27540()).m32982(), this.f10907)) & (-8);
                this.f10908 = Math.min(iM33003 - 112, Math.min(((C13722) interfaceC18663.mo27540()).m32997(), this.f10908)) & (-8);
                this.f10904 = Math.min(iM33003 - 512, this.f10904) & (-8);
                return true;
            }
            interfaceC2148.mo7080("Signing is enforced but server does not allow it");
            return false;
        }
        return false;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int mo10547() {
        return this.f10907;
    }

    @Override // l.InterfaceC20594
    public final int getSendBufferSize() {
        return this.f10908;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo10540() {
        return (this.f10915 & 1) != 0;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo10539() {
        return (this.f10915 & 2) != 0;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo10550() {
        return mo10539();
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        InterfaceC22500 c20384;
        if (C1480.m5121(i, bArr) != 65) {
            throw new C17771("Structure size is not 65");
        }
        this.f10915 = C1480.m5121(i + 2, bArr);
        this.f10903 = C1480.m5121(i + 4, bArr);
        int iM5121 = C1480.m5121(i + 6, bArr);
        System.arraycopy(bArr, i + 8, this.f10905, 0, 16);
        this.f10911 = C1480.m5123(i + 24, bArr);
        this.f10904 = C1480.m5123(i + 28, bArr);
        this.f10907 = C1480.m5123(i + 32, bArr);
        this.f10908 = C1480.m5123(i + 36, bArr);
        this.f10909 = C1480.m5127(i + 40, bArr);
        C1480.m5127(i + 48, bArr);
        int iM5122 = C1480.m5121(i + 56, bArr);
        int iM5123 = C1480.m5121(i + 58, bArr);
        int iM5124 = C1480.m5123(i + 60, bArr);
        int i2 = i + 64;
        int iM10453 = m10453();
        int i3 = iM5122 + iM10453;
        if (i3 + iM5123 < bArr.length) {
            byte[] bArr2 = new byte[iM5123];
            this.f10914 = bArr2;
            System.arraycopy(bArr, i3, bArr2, 0, iM5123);
            i2 += iM5123;
        }
        int i4 = ((i2 - iM10453) % 8) + i2;
        if (this.f10903 != 785 || iM5124 == 0 || iM5121 == 0) {
            return i4 - i;
        }
        int iM10454 = m10453() + iM5124;
        InterfaceC22500[] interfaceC22500Arr = new InterfaceC22500[iM5121];
        for (int i5 = 0; i5 < iM5121; i5++) {
            int iM5125 = C1480.m5121(iM10454, bArr);
            int iM5126 = C1480.m5121(iM10454 + 2, bArr);
            int i6 = iM10454 + 8;
            if (iM5125 != 1) {
                c20384 = iM5125 != 2 ? null : new C15443();
            } else {
                c20384 = new C20384();
            }
            if (c20384 != null) {
                c20384.mo2557(i6, iM5126, bArr);
                interfaceC22500Arr[i5] = c20384;
            }
            iM10454 = i6 + iM5126;
            if (i5 != iM5121 - 1) {
                iM10454 += m10468(iM10454);
            }
        }
        this.f10910 = interfaceC22500Arr;
        return Math.max(i4, iM10454) - i;
    }

    @Override // l.AbstractC3429
    public final String toString() {
        StringBuilder sb = new StringBuilder("Smb2NegotiateResponse[");
        sb.append(super.toString());
        sb.append(",dialectRevision=");
        sb.append(this.f10903);
        sb.append(",securityMode=0x");
        C19033.m43886(this.f10915, 1, ",capabilities=0x", sb);
        sb.append(C12085.m29467(this.f10911, 8));
        sb.append(",serverTime=");
        sb.append(new Date(this.f10909));
        return new String(sb.toString());
    }
}
