package p067l;

import java.util.Date;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۡۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10580 extends AbstractC13224 implements InterfaceC21941 {

    /* JADX INFO: renamed from: ۗ֫ */
    public static final InterfaceC4410 f29294 = C13128.m30022(C10580.class);

    /* JADX INFO: renamed from: ֡֫ */
    public int f29295;

    /* JADX INFO: renamed from: ֨֫ */
    public int f29296;

    /* JADX INFO: renamed from: ۙ֫ */
    public boolean f29297;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f29298;

    /* JADX INFO: renamed from: ۠֫ */
    public int f29299;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f29300;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f29301;

    /* JADX INFO: renamed from: ᩸֫ */
    public C15234 f29302;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f29303;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        return 0;
    }

    public C10580(InterfaceC20106 interfaceC20106) {
        super(interfaceC20106.mo29602());
        this.f29302 = new C15234();
        this.f29295 = ((C15410) interfaceC20106.mo29602()).m35120();
        this.f29299 = ((C15410) interfaceC20106.mo29602()).m35130();
        this.f29296 = ((C15410) interfaceC20106.mo29602()).m35093();
        this.f29303 = ((C15410) interfaceC20106.mo29602()).m35111();
        this.f29300 = ((C15410) interfaceC20106.mo29602()).m35096();
        this.f29301 = ((C15410) interfaceC20106.mo29602()).m35117();
        this.f29297 = ((C15410) interfaceC20106.mo29602()).m35102();
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ᩻ */
    public final EnumC22788 mo12576() {
        return EnumC22788.SMB1;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ۫ */
    public final int mo12568() {
        return this.f29301;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12561(InterfaceC20106 interfaceC20106) {
        return m30262().equals(interfaceC20106.mo29602());
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12562(InterfaceC20106 interfaceC20106, InterfaceC8529 interfaceC8529) {
        if (this.f29298 > 10) {
            return false;
        }
        C15234 c15234 = this.f29302;
        int i = c15234.f43481 & Integer.MIN_VALUE;
        InterfaceC4410 interfaceC4410 = f29294;
        if (i != Integer.MIN_VALUE && c15234.f43476 != 8 && ((C15410) interfaceC20106.mo29602()).m35103() == 0) {
            interfaceC4410.mo9199("Unexpected encryption key length: " + c15234.f43476);
            return false;
        }
        if (interfaceC8529.mo16060() || c15234.f43480) {
            this.f29299 |= 4;
            if (interfaceC8529.mo16060() || c15234.f43480) {
                this.f29299 |= 16;
            }
        } else {
            if (c15234.f43479) {
                interfaceC20106.mo29602().getClass();
            }
            this.f29299 &= 65515;
        }
        if (interfaceC4410.mo9181()) {
            StringBuilder sb = new StringBuilder("Signing ");
            sb.append((this.f29299 & 4) != 0 ? "enabled " : "not-enabled ");
            sb.append((this.f29299 & 16) != 0 ? AnnotationHandler.REQUIRED : "not-required");
            interfaceC4410.mo9183(sb.toString());
        }
        int iMin = Math.min(this.f29296, c15234.f43466);
        this.f29296 = iMin;
        if (iMin < 1) {
            this.f29296 = 1;
        }
        this.f29303 = Math.min(this.f29303, c15234.f43477);
        this.f29300 = Math.min(this.f29300, c15234.f43477);
        this.f29301 = Math.min(this.f29301, c15234.f43477);
        int i2 = this.f29295;
        int i3 = c15234.f43481;
        int i4 = i2 & i3;
        this.f29295 = i4;
        if ((i3 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f29295 = i4 | Integer.MIN_VALUE;
        }
        if (((C15410) interfaceC20106.mo29602()).m35102()) {
            this.f29295 |= 4;
        } else {
            interfaceC20106.mo29602().getClass();
        }
        if ((this.f29295 & 4) == 0) {
            interfaceC20106.mo29602().getClass();
            this.f29297 = false;
            this.f29299 &= EnumC8055.f21261;
        } else {
            this.f29297 = ((C15410) interfaceC20106.mo29602()).m35102();
        }
        if (this.f29297) {
            interfaceC4410.mo9183("Unicode is enabled");
            return true;
        }
        interfaceC4410.mo9183("Unicode is disabled");
        return true;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final int m24377() {
        return this.f29295;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final int m24378() {
        return this.f29303;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final int m24375() {
        return this.f29296;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final int m24376() {
        return this.f29296;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ܺ */
    public final int mo12571() {
        return this.f29300;
    }

    @Override // p067l.InterfaceC21941
    public final int getSendBufferSize() {
        return this.f29303;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final int m24374() {
        return this.f29299;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12572(int i) {
        return (this.f29295 & i) == i;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo12569() {
        m30262().getClass();
        return mo12572(4096);
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo12574() {
        return (this.f29299 & 4) == 4;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ۧ */
    public final void mo12567(InterfaceC9571 interfaceC9571) {
        if (interfaceC9571 instanceof AbstractC13224) {
            AbstractC13224 abstractC13224 = (AbstractC13224) interfaceC9571;
            abstractC13224.m30263(this.f29299);
            abstractC13224.m30261(abstractC13224.mo17602() || this.f29297);
            if (abstractC13224.m30259()) {
                abstractC13224.m30263(32768);
            }
            if (abstractC13224 instanceof AbstractC19710) {
                ((AbstractC19710) abstractC13224).m44788(this.f29303);
            }
        }
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ֫ */
    public final void mo12560(InterfaceC15194 interfaceC15194) {
        if (interfaceC15194 instanceof AbstractC13224) {
            ((AbstractC13224) interfaceC15194).m30261(this.f29297);
        }
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo12564() {
        C15234 c15234 = this.f29302;
        return c15234.f43479 || c15234.f43480;
    }

    @Override // p067l.InterfaceC21941
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo12563() {
        return this.f29302.f43480;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final C15234 m24379() {
        return this.f29302;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        int iM7363 = C3775.m7363(i, bArr);
        this.f29298 = iM7363;
        int i2 = i + 2;
        if (iM7363 > 10) {
            return i2 - i;
        }
        int i3 = i + 3;
        byte b = bArr[i2];
        C15234 c15234 = this.f29302;
        c15234.f43471 = b & 255;
        c15234.f43472 = b & 1;
        c15234.f43467 = (b & 2) == 2;
        c15234.f43479 = (b & 4) == 4;
        c15234.f43480 = (b & 8) == 8;
        c15234.f43466 = C3775.m7363(i3, bArr);
        c15234.f43474 = C3775.m7363(i + 5, bArr);
        c15234.f43477 = C3775.m7365(i + 7, bArr);
        c15234.f43482 = C3775.m7365(i + 11, bArr);
        c15234.f43469 = C3775.m7365(i + 15, bArr);
        c15234.f43481 = C3775.m7365(i + 19, bArr);
        c15234.f43475 = C3775.m7369(i + 23, bArr);
        int iM7364 = C3775.m7363(i + 31, bArr);
        if (iM7364 > 32767) {
            iM7364 = (65536 - iM7364) * (-1);
        }
        c15234.f43468 = iM7364;
        c15234.f43476 = bArr[i + 33] & 255;
        return (i + 34) - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        int i2;
        int iM27142;
        C15234 c15234 = this.f29302;
        if ((c15234.f43481 & Integer.MIN_VALUE) == 0) {
            int i3 = c15234.f43476;
            byte[] bArr2 = new byte[i3];
            c15234.f43473 = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i3);
            int i4 = c15234.f43476;
            i2 = i + i4;
            if (this.f37156 > i4) {
                if ((this.f29299 & 32768) == 32768) {
                    iM27142 = C11843.m27146(i2, 256, bArr);
                    c15234.f43470 = C11843.m27148(i2, iM27142, bArr);
                } else {
                    iM27142 = C11843.m27142(i2, 256, bArr);
                    c15234.f43470 = C11843.m27143(bArr, i2, iM27142, m30262());
                }
                i2 += iM27142;
            } else {
                c15234.f43470 = new String();
            }
        } else {
            byte[] bArr3 = new byte[16];
            c15234.f43478 = bArr3;
            System.arraycopy(bArr, i, bArr3, 0, 16);
            int length = c15234.f43478.length + i;
            c15234.f43470 = new String();
            int i5 = this.f37156;
            if (i5 > 16) {
                int i6 = i5 - 16;
                c15234.f43476 = i6;
                byte[] bArr4 = new byte[i6];
                c15234.f43473 = bArr4;
                System.arraycopy(bArr, length, bArr4, 0, i6);
                InterfaceC4410 interfaceC4410 = f29294;
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("Have initial token ".concat(C13854.m31530(c15234.f43473, 0, c15234.f43476)));
                }
            }
            i2 = length;
        }
        return i2 - i;
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNegotiateResponse[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        sb.append(this.f37153);
        sb.append(",dialectIndex=");
        sb.append(this.f29298);
        sb.append(",securityMode=0x");
        C15234 c15234 = this.f29302;
        C20458.m46154(c15234.f43471, 1, ",security=", sb);
        sb.append(c15234.f43472 == 0 ? "share" : "user");
        sb.append(",encryptedPasswords=");
        sb.append(c15234.f43467);
        sb.append(",maxMpxCount=");
        sb.append(c15234.f43466);
        sb.append(",maxNumberVcs=");
        sb.append(c15234.f43474);
        sb.append(",maxBufferSize=");
        sb.append(c15234.f43477);
        sb.append(",maxRawSize=");
        sb.append(c15234.f43482);
        sb.append(",sessionKey=0x");
        C20458.m46154(c15234.f43469, 8, ",capabilities=0x", sb);
        sb.append(C13854.m31529(c15234.f43481, 8));
        sb.append(",serverTime=");
        sb.append(new Date(c15234.f43475));
        sb.append(",serverTimeZone=");
        sb.append(c15234.f43468);
        sb.append(",encryptionKeyLength=");
        sb.append(c15234.f43476);
        sb.append(",byteCount=");
        sb.append(this.f37156);
        sb.append(",oemDomainName=");
        return new String(C10965.m25286(sb, c15234.f43470, "]"));
    }
}
