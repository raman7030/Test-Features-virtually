package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۨۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9VM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11422 implements InterfaceC7578, InterfaceC1543, InterfaceC16359 {

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f34135 = C11321.m27961(AbstractC11422.class);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f34136;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f34137;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f34138;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f34139;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5777 f34140;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f34141;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f34142;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f34143;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f34144;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f34145;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Long f34146;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f34147;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f34148;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Exception f34149;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f34150;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f34151;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f34152;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f34153;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f34154;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f34155;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f34156;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f34157;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC1023 f34158;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public String f34159;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f34160;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f34161;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f34162;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public AbstractC11422 f34163;

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: getNext, reason: merged with bridge method [inline-methods] */
    public AbstractC11422 mo20322() {
        return null;
    }

    @Override // l.InterfaceC7578
    public final int size() {
        return 0;
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC7578 mo20318() {
        return null;
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ֫ */
    public final void mo20319(int i) {
    }

    @Override // l.InterfaceC1543
    /* JADX INFO: renamed from: ֫ */
    public final void mo5288(InterfaceC7578 interfaceC7578) {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo1306(int i, byte[] bArr);

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final void mo10448(long j) {
    }

    @Override // l.InterfaceC1543
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo5289() {
        return false;
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo20320() {
        return false;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int mo28222() {
        return 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo1308(int i, byte[] bArr);

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo20321(InterfaceC7578 interfaceC7578) {
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo1309(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩻ */
    public abstract int mo1311(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean mo15687() {
        return this instanceof C0606;
    }

    public AbstractC11422(InterfaceC1023 interfaceC1023) {
        this(interfaceC1023, (byte) 0, null);
    }

    public AbstractC11422(InterfaceC1023 interfaceC1023, byte b) {
        this(interfaceC1023, b, null);
    }

    public AbstractC11422(InterfaceC1023 interfaceC1023, byte b, String str) {
        this.f34144 = 65535;
        this.f34140 = null;
        this.f34158 = interfaceC1023;
        this.f34161 = b;
        this.f34156 = str;
        this.f34148 = (byte) 24;
        this.f34155 = ((C13722) interfaceC1023).m32995();
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ᩶ */
    public final int mo10463() {
        return this.f34161;
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ܿ */
    public final void mo10459(int i) {
        this.f34161 = (byte) i;
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int m28207() {
        return this.f34160;
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final byte m28223() {
        return this.f34148;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28201(byte b) {
        this.f34148 = b;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m28211(int i) {
        this.f34162 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m28219(int i) {
        this.f34162 = i | this.f34162;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ܳ */
    public final void mo6635() {
        m28219(4096);
    }

    @Override // l.InterfaceC13495
    public final int getErrorCode() {
        return this.f34150;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m28232(int i) {
        this.f34150 = i;
    }

    @Override // l.InterfaceC16359
    public final String getPath() {
        return this.f34156;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ᩵ */
    public final String mo6641() {
        return this.f34151;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ܽ */
    public final String mo6637() {
        return this.f34138;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ֫ */
    public final String mo6629() {
        return this.f34159;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ֫ */
    public final void mo6631(String str, String str2, String str3) {
        this.f34138 = str;
        this.f34159 = str2;
        this.f34151 = str3;
    }

    @Override // l.InterfaceC16359
    /* JADX INFO: renamed from: ֫ */
    public final void mo6630(String str) {
        this.f34156 = str;
    }

    @Override // l.InterfaceC13927
    public final C5777 getDigest() {
        return this.f34140;
    }

    @Override // l.InterfaceC13927
    public final InterfaceC17065 getDigest() {
        return this.f34140;
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ֫ */
    public final void mo10436(InterfaceC17065 interfaceC17065) {
        this.f34140 = (C5777) interfaceC17065;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28221() {
        return this.f34141;
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ֫ */
    public final void mo10437(boolean z) {
        this.f34141 = z;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28215() {
        return this.f34137;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28217(boolean z) {
        this.f34137 = z;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean mo28213() {
        return this.f34152;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo28216() {
        this.f34152 = false;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo28228() {
        this.f34152 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28202(Exception exc) {
        this.f34149 = exc;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void mo28208() {
        this.f34136 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC7578, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public AbstractC11422 mo5429() {
        return this.f34163;
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28204(InterfaceC1543 interfaceC1543) {
        if (!(interfaceC1543 instanceof AbstractC11422)) {
            throw new IllegalArgumentException();
        }
        this.f34163 = (AbstractC11422) interfaceC1543;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long mo28210() {
        return this.f34154;
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ֫ */
    public final void mo10434(long j) {
        this.f34154 = (int) j;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m28231() {
        return this.f34144;
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ᩳ */
    public final void mo20323(int i) {
        this.f34144 = i;
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final int m28224() {
        return this.f34153;
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final void mo10447(int i) {
        this.f34153 = i;
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int m28227() {
        return this.f34145;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28229(int i) {
        this.f34145 = i;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean mo28214() {
        return this.f34139;
    }

    @Override // l.InterfaceC13495
    public final Exception getException() {
        return this.f34149;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean mo28209() {
        return this.f34136;
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean m28230() {
        return this.f34142;
    }

    @Override // l.InterfaceC11380
    /* JADX INFO: renamed from: ֡ */
    public final void mo10429() {
        this.f34142 = true;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Long mo28225() {
        return this.f34146;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28203(Long l2) {
        this.f34146 = l2;
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 m28218() {
        return this.f34158;
    }

    @Override // l.InterfaceC13927
    public void reset() {
        this.f34148 = (byte) 24;
        this.f34162 = 0;
        this.f34150 = 0;
        this.f34152 = false;
        this.f34140 = null;
        this.f34153 = 0;
        this.f34144 = 65535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28206(int i, int i2, byte[] bArr) {
        C5777 c5777 = this.f34140;
        if (c5777 == null || this.f34150 != 0) {
            return true;
        }
        boolean zM16248 = c5777.m16248(bArr, 4, i2, this);
        this.f34139 = zM16248;
        return !zM16248;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28197(String str, int i, byte[] bArr) {
        return m28198(str, bArr, i, this.f34137);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28198(String str, byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            if ((i - this.f34143) % 2 != 0) {
                i3 = i + 1;
                bArr[i] = 0;
            } else {
                i3 = i;
            }
            System.arraycopy(C9969.m25130(str), 0, bArr, i3, str.length() * 2);
            int length = (str.length() * 2) + i3;
            int i4 = length + 1;
            bArr[length] = 0;
            i2 = length + 2;
            bArr[i4] = 0;
        } else {
            byte[] bArrM25128 = C9969.m25128(str, this.f34158);
            System.arraycopy(bArrM25128, 0, bArr, i, bArrM25128.length);
            int length2 = bArrM25128.length + i;
            bArr[length2] = 0;
            i2 = length2 + 1;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m28226(int i, byte[] bArr) {
        return m28199(this.f34137, i, 255, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28199(boolean z, int i, int i2, byte[] bArr) {
        if (z) {
            if ((i - this.f34143) % 2 != 0) {
                i++;
            }
            return C9969.m25131(i, C9969.m25129(i, i2, bArr), bArr);
        }
        return C9969.m25126(bArr, i, C9969.m25125(i, i2, bArr), this.f34158);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28200(byte[] bArr, int i, boolean z) {
        if (z) {
            if ((i - this.f34143) % 2 != 0) {
                i++;
            }
            return C9969.m25131(i, C9969.m25129(i, 255, bArr), bArr);
        }
        return C9969.m25126(bArr, i, C9969.m25125(i, 255, bArr), this.f34158);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28196(int i, String str) {
        int length = str.length() + 1;
        if (this.f34137) {
            int length2 = str.length() * 2;
            length = length2 + 2;
            if (i % 2 != 0) {
                return length2 + 3;
            }
        }
        return length;
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ֫ */
    public int mo10430(int i, byte[] bArr) {
        this.f34143 = i;
        m28220(i, bArr);
        int i2 = i + 33;
        int iMo1311 = mo1311(i2, bArr);
        this.f34157 = iMo1311;
        int i3 = iMo1311 / 2;
        bArr[i + 32] = (byte) (i3 & 255);
        int i4 = i2 + iMo1311;
        this.f34157 = i3;
        int i5 = i4 + 2;
        int iMo1309 = mo1309(i5, bArr);
        this.f34160 = iMo1309;
        bArr[i4] = (byte) (iMo1309 & 255);
        bArr[i4 + 1] = (byte) ((iMo1309 >> 8) & 255);
        int i6 = (i5 + iMo1309) - i;
        this.f34147 = i6;
        C5777 c5777 = this.f34140;
        if (c5777 != null) {
            c5777.m16247(bArr, this.f34143, i6, this, this.f34163);
        }
        return this.f34147;
    }

    @Override // l.InterfaceC13927
    public int decode(byte[] bArr) throws C17771 {
        this.f34143 = 4;
        m28205(bArr);
        byte b = bArr[36];
        this.f34157 = b;
        InterfaceC2148 interfaceC2148 = f34135;
        int i = 37;
        if (b != 0) {
            int iMo1308 = mo1308(37, bArr);
            if (iMo1308 != this.f34157 * 2 && interfaceC2148.mo7099()) {
                interfaceC2148.mo7101("wordCount * 2=" + (this.f34157 * 2) + " but readParameterWordsWireFormat returned " + iMo1308);
            }
            i = 37 + (this.f34157 * 2);
        }
        int iM5121 = C1480.m5121(i, bArr);
        this.f34160 = iM5121;
        int i2 = i + 2;
        if (iM5121 != 0) {
            int iMo1306 = mo1306(i2, bArr);
            if (iMo1306 != this.f34160 && interfaceC2148.mo7099()) {
                interfaceC2148.mo7101("byteCount=" + this.f34160 + " but readBytesWireFormat returned " + iMo1306);
            }
            i2 += this.f34160;
        }
        int i3 = i2 - 4;
        this.f34147 = i3;
        if (this.f34142) {
            System.arraycopy(bArr, 4, new byte[i3], 0, i3);
        }
        if (m28206(4, i3, bArr)) {
            return i3;
        }
        throw new C17771("Signature verification failed for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m28220(int i, byte[] bArr) {
        System.arraycopy(C1480.f5311, 0, bArr, i, 24);
        bArr[i + 4] = this.f34161;
        bArr[i + 9] = this.f34148;
        C1480.m5122(this.f34162, i + 10, bArr);
        C1480.m5122(this.f34144, i + 24, bArr);
        C1480.m5122(this.f34155, i + 26, bArr);
        C1480.m5122(this.f34153, i + 28, bArr);
        C1480.m5122(this.f34154, i + 30, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28205(byte[] bArr) {
        this.f34161 = bArr[8];
        this.f34150 = C1480.m5123(9, bArr);
        this.f34148 = bArr[13];
        this.f34162 = C1480.m5121(14, bArr);
        this.f34144 = C1480.m5121(28, bArr);
        this.f34155 = C1480.m5121(30, bArr);
        this.f34153 = C1480.m5121(32, bArr);
        this.f34154 = C1480.m5121(34, bArr);
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28212() {
        return (this.f34148 & GCMSIVBlockCipher.MASK) == 128;
    }

    public final int hashCode() {
        return this.f34154;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC11422) && ((AbstractC11422) obj).f34154 == this.f34154;
    }

    public String toString() {
        String str;
        byte b = this.f34161;
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
        int i = this.f34150;
        String strM9288 = i == 0 ? "0" : C3037.m9288(i);
        StringBuilder sbM9834 = C3200.m9834("command=", str, ",received=");
        sbM9834.append(this.f34152);
        sbM9834.append(",errorCode=");
        sbM9834.append(strM9288);
        sbM9834.append(",flags=0x");
        C19033.m43886(this.f34148 & 255, 4, ",flags2=0x", sbM9834);
        C19033.m43886(this.f34162, 4, ",signSeq=", sbM9834);
        sbM9834.append(this.f34145);
        sbM9834.append(",tid=");
        sbM9834.append(this.f34144);
        sbM9834.append(",pid=");
        sbM9834.append(this.f34155);
        sbM9834.append(",uid=");
        sbM9834.append(this.f34153);
        sbM9834.append(",mid=");
        sbM9834.append(this.f34154);
        sbM9834.append(",wordCount=");
        sbM9834.append(this.f34157);
        sbM9834.append(",byteCount=");
        sbM9834.append(this.f34160);
        return new String(sbM9834.toString());
    }
}
