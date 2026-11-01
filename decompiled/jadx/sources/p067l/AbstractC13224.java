package p067l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۨۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9VM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13224 implements InterfaceC9571, InterfaceC3835, InterfaceC17916 {

    /* JADX INFO: renamed from: ᩵֫ */
    public static final InterfaceC4410 f37131 = C13128.m30022(AbstractC13224.class);

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f37132;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f37133;

    /* JADX INFO: renamed from: ۗ */
    public String f37134;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f37135;

    /* JADX INFO: renamed from: ۙ */
    public C7859 f37136;

    /* JADX INFO: renamed from: ۛ */
    public boolean f37137;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f37138;

    /* JADX INFO: renamed from: ۟ */
    public int f37139;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f37140;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f37141;

    /* JADX INFO: renamed from: ۤ */
    public Long f37142;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f37143;

    /* JADX INFO: renamed from: ۨ */
    public byte f37144;

    /* JADX INFO: renamed from: ۫ */
    public Exception f37145;

    /* JADX INFO: renamed from: ۬ */
    public int f37146;

    /* JADX INFO: renamed from: ܰ */
    public String f37147;

    /* JADX INFO: renamed from: ܳ֫ */
    public volatile boolean f37148;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f37149;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f37150;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f37151;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f37152;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f37153;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC3341 f37154;

    /* JADX INFO: renamed from: ᩷֫ */
    public String f37155;

    /* JADX INFO: renamed from: ᩸ */
    public int f37156;

    /* JADX INFO: renamed from: ᩹ */
    public byte f37157;

    /* JADX INFO: renamed from: ᩺ */
    public int f37158;

    /* JADX INFO: renamed from: ᩻֫ */
    public AbstractC13224 f37159;

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: getNext, reason: merged with bridge method [inline-methods] */
    public AbstractC13224 mo22299() {
        return null;
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        return 0;
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC9571 mo22295() {
        return null;
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ֫ */
    public final void mo22296(int i) {
    }

    @Override // p067l.InterfaceC3835
    /* JADX INFO: renamed from: ֫ */
    public final void mo7517(InterfaceC9571 interfaceC9571) {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo3714(int i, byte[] bArr);

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final void mo12487(long j) {
    }

    @Override // p067l.InterfaceC3835
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo7518() {
        return false;
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo22297() {
        return false;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ܶ */
    public final int mo30266() {
        return 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo3716(int i, byte[] bArr);

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo22298(InterfaceC9571 interfaceC9571) {
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo3717(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩻ */
    public abstract int mo3719(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean mo17602() {
        return this instanceof C2945;
    }

    public AbstractC13224(InterfaceC3341 interfaceC3341) {
        this(interfaceC3341, (byte) 0, null);
    }

    public AbstractC13224(InterfaceC3341 interfaceC3341, byte b) {
        this(interfaceC3341, b, null);
    }

    public AbstractC13224(InterfaceC3341 interfaceC3341, byte b, String str) {
        this.f37140 = 65535;
        this.f37136 = null;
        this.f37154 = interfaceC3341;
        this.f37157 = b;
        this.f37152 = str;
        this.f37144 = (byte) 24;
        this.f37151 = ((C15410) interfaceC3341).m35109();
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ᩶ */
    public final int mo12502() {
        return this.f37157;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ܿ */
    public final void mo12498(int i) {
        this.f37157 = (byte) i;
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final int m30251() {
        return this.f37156;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final byte m30267() {
        return this.f37144;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30245(byte b) {
        this.f37144 = b;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m30255(int i) {
        this.f37158 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m30263(int i) {
        this.f37158 = i | this.f37158;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ܳ */
    public final void mo8761() {
        m30263(4096);
    }

    @Override // p067l.InterfaceC15194
    public final int getErrorCode() {
        return this.f37146;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m30276(int i) {
        this.f37146 = i;
    }

    @Override // p067l.InterfaceC17916
    public final String getPath() {
        return this.f37152;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ᩵ */
    public final String mo8767() {
        return this.f37147;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ܽ */
    public final String mo8763() {
        return this.f37134;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ֫ */
    public final String mo8755() {
        return this.f37155;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ֫ */
    public final void mo8757(String str, String str2, String str3) {
        this.f37134 = str;
        this.f37155 = str2;
        this.f37147 = str3;
    }

    @Override // p067l.InterfaceC17916
    /* JADX INFO: renamed from: ֫ */
    public final void mo8756(String str) {
        this.f37152 = str;
    }

    @Override // p067l.InterfaceC15605
    public final C7859 getDigest() {
        return this.f37136;
    }

    @Override // p067l.InterfaceC15605
    public final InterfaceC18587 getDigest() {
        return this.f37136;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final void mo12475(InterfaceC18587 interfaceC18587) {
        this.f37136 = (C7859) interfaceC18587;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean m30265() {
        return this.f37137;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final void mo12476(boolean z) {
        this.f37137 = z;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean m30259() {
        return this.f37133;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30261(boolean z) {
        this.f37133 = z;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo30257() {
        return this.f37148;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۤ */
    public final void mo30260() {
        this.f37148 = false;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ᩷ */
    public final void mo30272() {
        this.f37148 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ֫ */
    public final void mo30246(Exception exc) {
        this.f37145 = exc;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۗ */
    public final void mo30252() {
        this.f37132 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p067l.InterfaceC9571, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public AbstractC13224 mo7658() {
        return this.f37159;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final void mo30248(InterfaceC3835 interfaceC3835) {
        if (!(interfaceC3835 instanceof AbstractC13224)) {
            throw new IllegalArgumentException();
        }
        this.f37159 = (AbstractC13224) interfaceC3835;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۜ */
    public final long mo30254() {
        return this.f37150;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final void mo12473(long j) {
        this.f37150 = (int) j;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final int m30275() {
        return this.f37140;
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ᩳ */
    public final void mo22300(int i) {
        this.f37140 = i;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final int m30268() {
        return this.f37149;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final void mo12486(int i) {
        this.f37149 = i;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int m30271() {
        return this.f37141;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m30273(int i) {
        this.f37141 = i;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo30258() {
        return this.f37135;
    }

    @Override // p067l.InterfaceC15194
    public final Exception getException() {
        return this.f37145;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo30253() {
        return this.f37132;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean m30274() {
        return this.f37138;
    }

    @Override // p067l.InterfaceC13184
    /* JADX INFO: renamed from: ֡ */
    public final void mo12468() {
        this.f37138 = true;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ᩳ */
    public final Long mo30269() {
        return this.f37142;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ֫ */
    public final void mo30247(Long l2) {
        this.f37142 = l2;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final InterfaceC3341 m30262() {
        return this.f37154;
    }

    @Override // p067l.InterfaceC15605
    public void reset() {
        this.f37144 = (byte) 24;
        this.f37158 = 0;
        this.f37146 = 0;
        this.f37148 = false;
        this.f37136 = null;
        this.f37149 = 0;
        this.f37140 = 65535;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30250(int i, int i2, byte[] bArr) {
        C7859 c7859 = this.f37136;
        if (c7859 == null || this.f37146 != 0) {
            return true;
        }
        boolean zM18168 = c7859.m18168(bArr, 4, i2, this);
        this.f37135 = zM18168;
        return !zM18168;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30241(String str, int i, byte[] bArr) {
        return m30242(str, bArr, i, this.f37133);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30242(String str, byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            if ((i - this.f37139) % 2 != 0) {
                i3 = i + 1;
                bArr[i] = 0;
            } else {
                i3 = i;
            }
            System.arraycopy(C11843.m27147(str), 0, bArr, i3, str.length() * 2);
            int length = (str.length() * 2) + i3;
            int i4 = length + 1;
            bArr[length] = 0;
            i2 = length + 2;
            bArr[i4] = 0;
        } else {
            byte[] bArrM27145 = C11843.m27145(str, this.f37154);
            System.arraycopy(bArrM27145, 0, bArr, i, bArrM27145.length);
            int length2 = bArrM27145.length + i;
            bArr[length2] = 0;
            i2 = length2 + 1;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m30270(int i, byte[] bArr) {
        return m30243(this.f37133, i, 255, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30243(boolean z, int i, int i2, byte[] bArr) {
        if (z) {
            if ((i - this.f37139) % 2 != 0) {
                i++;
            }
            return C11843.m27148(i, C11843.m27146(i, i2, bArr), bArr);
        }
        return C11843.m27143(bArr, i, C11843.m27142(i, i2, bArr), this.f37154);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30244(byte[] bArr, int i, boolean z) {
        if (z) {
            if ((i - this.f37139) % 2 != 0) {
                i++;
            }
            return C11843.m27148(i, C11843.m27146(i, 255, bArr), bArr);
        }
        return C11843.m27143(bArr, i, C11843.m27142(i, 255, bArr), this.f37154);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30240(int i, String str) {
        int length = str.length() + 1;
        if (this.f37133) {
            int length2 = str.length() * 2;
            length = length2 + 2;
            if (i % 2 != 0) {
                return length2 + 3;
            }
        }
        return length;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public int mo12469(int i, byte[] bArr) {
        this.f37139 = i;
        m30264(i, bArr);
        int i2 = i + 33;
        int iMo3719 = mo3719(i2, bArr);
        this.f37153 = iMo3719;
        int i3 = iMo3719 / 2;
        bArr[i + 32] = (byte) (i3 & 255);
        int i4 = i2 + iMo3719;
        this.f37153 = i3;
        int i5 = i4 + 2;
        int iMo3717 = mo3717(i5, bArr);
        this.f37156 = iMo3717;
        bArr[i4] = (byte) (iMo3717 & 255);
        bArr[i4 + 1] = (byte) ((iMo3717 >> 8) & 255);
        int i6 = (i5 + iMo3717) - i;
        this.f37143 = i6;
        C7859 c7859 = this.f37136;
        if (c7859 != null) {
            c7859.m18167(bArr, this.f37139, i6, this, this.f37159);
        }
        return this.f37143;
    }

    @Override // p067l.InterfaceC15605
    public int decode(byte[] bArr) throws C19258 {
        this.f37139 = 4;
        m30249(bArr);
        byte b = bArr[36];
        this.f37153 = b;
        InterfaceC4410 interfaceC4410 = f37131;
        int i = 37;
        if (b != 0) {
            int iMo3716 = mo3716(37, bArr);
            if (iMo3716 != this.f37153 * 2 && interfaceC4410.mo9194()) {
                interfaceC4410.mo9196("wordCount * 2=" + (this.f37153 * 2) + " but readParameterWordsWireFormat returned " + iMo3716);
            }
            i = 37 + (this.f37153 * 2);
        }
        int iM7363 = C3775.m7363(i, bArr);
        this.f37156 = iM7363;
        int i2 = i + 2;
        if (iM7363 != 0) {
            int iMo3714 = mo3714(i2, bArr);
            if (iMo3714 != this.f37156 && interfaceC4410.mo9194()) {
                interfaceC4410.mo9196("byteCount=" + this.f37156 + " but readBytesWireFormat returned " + iMo3714);
            }
            i2 += this.f37156;
        }
        int i3 = i2 - 4;
        this.f37143 = i3;
        if (this.f37138) {
            System.arraycopy(bArr, 4, new byte[i3], 0, i3);
        }
        if (m30250(4, i3, bArr)) {
            return i3;
        }
        throw new C19258("Signature verification failed for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m30264(int i, byte[] bArr) {
        System.arraycopy(C3775.f8084, 0, bArr, i, 24);
        bArr[i + 4] = this.f37157;
        bArr[i + 9] = this.f37144;
        C3775.m7364(this.f37158, i + 10, bArr);
        C3775.m7364(this.f37140, i + 24, bArr);
        C3775.m7364(this.f37151, i + 26, bArr);
        C3775.m7364(this.f37149, i + 28, bArr);
        C3775.m7364(this.f37150, i + 30, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30249(byte[] bArr) {
        this.f37157 = bArr[8];
        this.f37146 = C3775.m7365(9, bArr);
        this.f37144 = bArr[13];
        this.f37158 = C3775.m7363(14, bArr);
        this.f37140 = C3775.m7363(28, bArr);
        this.f37151 = C3775.m7363(30, bArr);
        this.f37149 = C3775.m7363(32, bArr);
        this.f37150 = C3775.m7363(34, bArr);
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean m30256() {
        return (this.f37144 & GCMSIVBlockCipher.MASK) == 128;
    }

    public final int hashCode() {
        return this.f37150;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC13224) && ((AbstractC13224) obj).f37150 == this.f37150;
    }

    public String toString() {
        String str;
        byte b = this.f37157;
        if (b == 0) {
            str = "SMB_COM_CREATE_DIRECTORY";
        } else if (b == 1) {
            str = "SMB_COM_DELETE_DIRECTORY";
        } else if (b == 4) {
            str = "SMB_COM_CLOSE";
        } else if (b == 16) {
            str = "SMB_COM_CHECK_DIRECTORY";
        } else if (b == 50) {
            str = "SMB_COM_TRANSACTION2";
        } else if (b == 52) {
            str = "SMB_COM_FIND_CLOSE2";
        } else if (b == 6) {
            str = "SMB_COM_DELETE";
        } else if (b == 7) {
            str = "SMB_COM_RENAME";
        } else if (b == 8) {
            str = "SMB_COM_QUERY_INFORMATION";
        } else if (b == 42) {
            str = "SMB_COM_MOVE";
        } else if (b != 43) {
            switch (b) {
                case -96:
                    str = "SMB_COM_NT_TRANSACT";
                    break;
                case -95:
                    str = "SMB_COM_NT_TRANSACT_SECONDARY";
                    break;
                case -94:
                    str = "SMB_COM_NT_CREATE_ANDX";
                    break;
                default:
                    switch (b) {
                        case 36:
                            str = "SMB_COM_LOCKING_ANDX";
                            break;
                        case 37:
                            str = "SMB_COM_TRANSACTION";
                            break;
                        case 38:
                            str = "SMB_COM_TRANSACTION_SECONDARY";
                            break;
                        default:
                            switch (b) {
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    str = "SMB_COM_OPEN_ANDX";
                                    break;
                                case 46:
                                    str = "SMB_COM_READ_ANDX";
                                    break;
                                case 47:
                                    str = "SMB_COM_WRITE_ANDX";
                                    break;
                                default:
                                    switch (b) {
                                        case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            str = "SMB_COM_TREE_DISCONNECT";
                                            break;
                                        case 114:
                                            str = "SMB_COM_NEGOTIATE";
                                            break;
                                        case 115:
                                            str = "SMB_COM_SESSION_SETUP_ANDX";
                                            break;
                                        case 116:
                                            str = "SMB_COM_LOGOFF_ANDX";
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                            str = "SMB_COM_TREE_CONNECT_ANDX";
                                            break;
                                        default:
                                            str = "UNKNOWN";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            str = "SMB_COM_ECHO";
        }
        int i = this.f37146;
        String strM11330 = i == 0 ? "0" : C5255.m11330(i);
        StringBuilder sbM11879 = C5410.m11879("command=", str, ",received=");
        sbM11879.append(this.f37148);
        sbM11879.append(",errorCode=");
        sbM11879.append(strM11330);
        sbM11879.append(",flags=0x");
        C20458.m46154(this.f37144 & 255, 4, ",flags2=0x", sbM11879);
        C20458.m46154(this.f37158, 4, ",signSeq=", sbM11879);
        sbM11879.append(this.f37141);
        sbM11879.append(",tid=");
        sbM11879.append(this.f37140);
        sbM11879.append(",pid=");
        sbM11879.append(this.f37151);
        sbM11879.append(",uid=");
        sbM11879.append(this.f37149);
        sbM11879.append(",mid=");
        sbM11879.append(this.f37150);
        sbM11879.append(",wordCount=");
        sbM11879.append(this.f37153);
        sbM11879.append(",byteCount=");
        sbM11879.append(this.f37156);
        return new String(sbM11879.toString());
    }
}
