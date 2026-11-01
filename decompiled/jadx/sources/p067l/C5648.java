package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Date;

/* JADX INFO: renamed from: l.ۗ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9X8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5648 extends AbstractC14345 implements InterfaceC21941 {

    /* JADX INFO: renamed from: ۫֫ */
    public static final InterfaceC4410 f13704 = C13128.m30022(C5648.class);

    /* JADX INFO: renamed from: ֡֫ */
    public int f13705;

    /* JADX INFO: renamed from: ֨֫ */
    public int f13706;

    /* JADX INFO: renamed from: ۗ֫ */
    public byte[] f13707;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f13708;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f13709;

    /* JADX INFO: renamed from: ۠֫ */
    public int f13710;

    /* JADX INFO: renamed from: ۬֫ */
    public long f13711;

    /* JADX INFO: renamed from: ܶ֫ */
    public InterfaceC23753[] f13712;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f13713;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f13714;

    /* JADX INFO: renamed from: ᩶֫ */
    public EnumC22788 f13715;

    /* JADX INFO: renamed from: ᩸֫ */
    public byte[] f13716;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f13717;

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ֫ */
    public final void mo12560(InterfaceC15194 interfaceC15194) {
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ۧ */
    public final void mo12567(InterfaceC9571 interfaceC9571) {
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    public C5648(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
        this.f13707 = new byte[16];
        this.f13708 = -1;
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public final int m12565() {
        return this.f13705;
    }

    /* JADX INFO: renamed from: ᩸֫ */
    public final byte[] m12575() {
        return this.f13707;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ᩻ */
    public final EnumC22788 mo12576() {
        return this.f13715;
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public final int m12570() {
        return this.f13708;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final int m12573() {
        return this.f13713;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final int m12558() {
        return this.f13714;
    }

    /* JADX INFO: renamed from: ֨֫ */
    public final byte[] m12559() {
        return this.f13716;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ۫ */
    public final int mo12568() {
        return this.f13706;
    }

    /* JADX INFO: renamed from: ۠֫ */
    public final int m12566() {
        return this.f13717;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12572(int i) {
        return (this.f13714 & i) == i;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo12569() {
        m12497().getClass();
        return mo12572(1);
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12561(InterfaceC20106 interfaceC20106) {
        return m12497().equals(interfaceC20106.mo29602());
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12562(InterfaceC20106 interfaceC20106, InterfaceC8529 interfaceC8529) {
        if (mo30257() && m12485() == 0) {
            boolean zMo16060 = interfaceC8529.mo16060();
            InterfaceC4410 interfaceC4410 = f13704;
            if (!zMo16060 || mo12564()) {
                if (this.f13705 == 767) {
                    interfaceC4410.mo9175("Server returned ANY dialect");
                    return false;
                }
                C6989 c6989 = (C6989) interfaceC8529;
                EnumC22788 enumC22788 = null;
                for (EnumC22788 enumC22789 : EnumC22788.values()) {
                    if (enumC22789.m50997() && enumC22789.m50995() == this.f13705) {
                        enumC22788 = enumC22789;
                    }
                }
                if (enumC22788 == null) {
                    interfaceC4410.mo9175("Server returned an unknown dialect");
                    return false;
                }
                if (!enumC22788.m50996(((C15410) m12497()).m35095()) || !enumC22788.m50998(((C15410) m12497()).m35086())) {
                    interfaceC4410.mo9175("Server selected an disallowed dialect version " + enumC22788 + " (min: " + ((C15410) m12497()).m35095() + " max: " + ((C15410) m12497()).m35086() + MotionUtils.EASING_TYPE_FORMAT_END);
                    return false;
                }
                this.f13715 = enumC22788;
                int iM16058 = c6989.m16058() & this.f13713;
                this.f13714 = iM16058;
                if ((iM16058 & 64) != 0) {
                    interfaceC20106.mo29602().getClass();
                }
                int i = 1;
                if (this.f13715.m50996(EnumC22788.SMB311)) {
                    int i2 = this.f13714;
                    InterfaceC23753[] interfaceC23753Arr = this.f13712;
                    if (interfaceC23753Arr == null || interfaceC23753Arr.length == 0) {
                        interfaceC4410.mo9175("Response lacks negotiate contexts");
                        return false;
                    }
                    int length = interfaceC23753Arr.length;
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    while (i3 < length) {
                        InterfaceC23753 interfaceC23753 = interfaceC23753Arr[i3];
                        if (interfaceC23753 != null) {
                            if (!z2 && interfaceC23753.mo38695() == 2) {
                                C17046 c17046 = (C17046) interfaceC23753;
                                if (c17046.m38696() == null || c17046.m38696().length != i) {
                                    interfaceC4410.mo9175("Server returned no cipher selection");
                                    return false;
                                }
                                C17046 c17047 = null;
                                for (InterfaceC23083 interfaceC23083 : c6989.m16057()) {
                                    if (interfaceC23083 instanceof C17046) {
                                        c17047 = (C17046) interfaceC23083;
                                    }
                                }
                                if (c17047 == null) {
                                    return false;
                                }
                                int[] iArrM38696 = c17047.m38696();
                                boolean z3 = false;
                                for (int i4 : iArrM38696) {
                                    if (i4 == c17046.m38696()[0]) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    int i5 = c17046.m38696()[0];
                                    z2 = true;
                                } else {
                                    interfaceC4410.mo9175("Server returned invalid cipher selection");
                                    return false;
                                }
                            } else {
                                if (interfaceC23753.mo38695() == 2) {
                                    interfaceC4410.mo9175("Multiple encryption negotiate contexts");
                                    return false;
                                }
                                if (!z && interfaceC23753.mo38695() == 1) {
                                    C21742 c21742 = (C21742) interfaceC23753;
                                    if (c21742.m49021() == null || c21742.m49021().length != 1) {
                                        interfaceC4410.mo9175("Server returned no hash selection");
                                        return false;
                                    }
                                    C21742 c21743 = null;
                                    for (InterfaceC23083 interfaceC23084 : c6989.m16057()) {
                                        if (interfaceC23084 instanceof C21742) {
                                            c21743 = (C21742) interfaceC23084;
                                        }
                                    }
                                    if (c21743 != null) {
                                        int[] iArrM49021 = c21743.m49021();
                                        boolean z4 = false;
                                        for (int i6 : iArrM49021) {
                                            if (i6 == c21742.m49021()[0]) {
                                                z4 = true;
                                            }
                                        }
                                        if (z4) {
                                            this.f13708 = c21742.m49021()[0];
                                            z = true;
                                        } else {
                                            interfaceC4410.mo9175("Server returned invalid hash selection");
                                            return false;
                                        }
                                    }
                                } else if (interfaceC23753.mo38695() == 1) {
                                    interfaceC4410.mo9175("Multiple preauth negotiate contexts");
                                    return false;
                                }
                            }
                        }
                        i3++;
                        i = 1;
                    }
                    if (!z) {
                        interfaceC4410.mo9175("Missing preauth negotiate context");
                        return false;
                    }
                    if (!z2 && (i2 & 64) != 0) {
                        interfaceC4410.mo9175("Missing encryption negotiate context");
                        return false;
                    }
                    if (!z2) {
                        interfaceC4410.mo9183("No encryption support");
                    }
                }
                int iM35117 = ((C15410) interfaceC20106.mo29602()).m35117();
                this.f13709 = Math.min(iM35117 - 80, Math.min(((C15410) interfaceC20106.mo29602()).m35096(), this.f13709)) & (-8);
                this.f13710 = Math.min(iM35117 - 112, Math.min(((C15410) interfaceC20106.mo29602()).m35111(), this.f13710)) & (-8);
                this.f13706 = Math.min(iM35117 - 512, this.f13706) & (-8);
                return true;
            }
            interfaceC4410.mo9175("Signing is enforced but server does not allow it");
            return false;
        }
        return false;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ܺ */
    public final int mo12571() {
        return this.f13709;
    }

    @Override // p067l.InterfaceC21941
    public final int getSendBufferSize() {
        return this.f13710;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo12564() {
        return (this.f13717 & 1) != 0;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo12563() {
        return (this.f13717 & 2) != 0;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo12574() {
        return mo12563();
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        InterfaceC23753 c21742;
        if (C3775.m7363(i, bArr) != 65) {
            throw new C19258("Structure size is not 65");
        }
        this.f13717 = C3775.m7363(i + 2, bArr);
        this.f13705 = C3775.m7363(i + 4, bArr);
        int iM7363 = C3775.m7363(i + 6, bArr);
        System.arraycopy(bArr, i + 8, this.f13707, 0, 16);
        this.f13713 = C3775.m7365(i + 24, bArr);
        this.f13706 = C3775.m7365(i + 28, bArr);
        this.f13709 = C3775.m7365(i + 32, bArr);
        this.f13710 = C3775.m7365(i + 36, bArr);
        this.f13711 = C3775.m7369(i + 40, bArr);
        C3775.m7369(i + 48, bArr);
        int iM7364 = C3775.m7363(i + 56, bArr);
        int iM7365 = C3775.m7363(i + 58, bArr);
        int iM7366 = C3775.m7365(i + 60, bArr);
        int i2 = i + 64;
        int iM12492 = m12492();
        int i3 = iM7364 + iM12492;
        if (i3 + iM7365 < bArr.length) {
            byte[] bArr2 = new byte[iM7365];
            this.f13716 = bArr2;
            System.arraycopy(bArr, i3, bArr2, 0, iM7365);
            i2 += iM7365;
        }
        int i4 = ((i2 - iM12492) % 8) + i2;
        if (this.f13705 != 785 || iM7366 == 0 || iM7363 == 0) {
            return i4 - i;
        }
        int iM12493 = m12492() + iM7366;
        InterfaceC23753[] interfaceC23753Arr = new InterfaceC23753[iM7363];
        for (int i5 = 0; i5 < iM7363; i5++) {
            int iM7367 = C3775.m7363(iM12493, bArr);
            int iM7368 = C3775.m7363(iM12493 + 2, bArr);
            int i6 = iM12493 + 8;
            if (iM7367 != 1) {
                c21742 = iM7367 != 2 ? null : new C17046();
            } else {
                c21742 = new C21742();
            }
            if (c21742 != null) {
                c21742.mo4913(i6, iM7368, bArr);
                interfaceC23753Arr[i5] = c21742;
            }
            iM12493 = i6 + iM7368;
            if (i5 != iM7363 - 1) {
                iM12493 += m12507(iM12493);
            }
        }
        this.f13712 = interfaceC23753Arr;
        return Math.max(i4, iM12493) - i;
    }

    @Override // p067l.AbstractC5628
    public final String toString() {
        StringBuilder sb = new StringBuilder("Smb2NegotiateResponse[");
        sb.append(super.toString());
        sb.append(",dialectRevision=");
        sb.append(this.f13705);
        sb.append(",securityMode=0x");
        C20458.m46154(this.f13717, 1, ",capabilities=0x", sb);
        sb.append(C13854.m31529(this.f13713, 8));
        sb.append(",serverTime=");
        sb.append(new Date(this.f13711));
        return new String(sb.toString());
    }
}
