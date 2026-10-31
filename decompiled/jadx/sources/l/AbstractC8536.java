package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.net.InetAddress;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۡ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59W6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8536 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f26071;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26072;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f26073;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f26074;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f26075;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26076;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16296 f26077;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f26078;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f26079;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f26081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InetAddress f26082;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26083;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f26084;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f26085;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15590[] f26086;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26087;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f26088;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f26089;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26091;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f26093;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16296 f26094;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC1023 f26095;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f26080 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f26092 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f26070 = 1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f26090 = 1;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10994(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo10995(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo10996(int i, byte[] bArr);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22217(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m22219(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m22218(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public AbstractC8536(InterfaceC1023 interfaceC1023) {
        this.f26095 = interfaceC1023;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m22221(byte[] bArr) {
        m22217(this.f26075, 0, bArr);
        bArr[2] = (byte) ((this.f26085 ? 128 : 0) + ((this.f26089 << 3) & UMErrorCode.E_UM_BE_NOT_MAINPROCESS) + (this.f26078 ? 4 : 0) + (this.f26073 ? 2 : 0) + (this.f26080 ? 1 : 0));
        bArr[3] = (byte) ((this.f26081 ? 128 : 0) + (this.f26092 ? 16 : 0) + (this.f26076 & 15));
        m22217(this.f26070, 4, bArr);
        m22217(this.f26087, 6, bArr);
        m22217(this.f26083, 8, bArr);
        m22217(this.f26072, 10, bArr);
        return mo10996(12, bArr) + 12;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22220(byte[] bArr) {
        this.f26075 = m22219(0, bArr);
        byte b = bArr[2];
        this.f26085 = (b & GCMSIVBlockCipher.MASK) != 0;
        this.f26089 = (b & 120) >> 3;
        this.f26078 = (b & 4) != 0;
        this.f26073 = (b & 2) != 0;
        this.f26080 = (b & 1) != 0;
        byte b2 = bArr[3];
        this.f26081 = (b2 & GCMSIVBlockCipher.MASK) != 0;
        this.f26092 = (b2 & 16) != 0;
        this.f26076 = b2 & 15;
        this.f26070 = m22219(4, bArr);
        this.f26087 = m22219(6, bArr);
        this.f26083 = m22219(8, bArr);
        this.f26072 = m22219(10, bArr);
        mo10994(12, bArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22222(int i, byte[] bArr) {
        int iM38331;
        if ((bArr[i] & 192) == 192) {
            this.f26094 = this.f26077;
            iM38331 = i + 2;
        } else {
            iM38331 = this.f26094.m38331(i, bArr) + i;
        }
        this.f26091 = m22219(iM38331, bArr);
        this.f26093 = m22219(iM38331 + 2, bArr);
        this.f26074 = m22218(iM38331 + 4, bArr);
        int iM22219 = m22219(iM38331 + 8, bArr);
        this.f26079 = iM22219;
        int iMo10995 = iM38331 + 10;
        this.f26086 = new C15590[iM22219 / 6];
        int i2 = iM22219 + iMo10995;
        int i3 = 0;
        while (true) {
            this.f26088 = i3;
            if (iMo10995 >= i2) {
                return iMo10995 - i;
            }
            iMo10995 += mo10995(iMo10995, bArr);
            i3 = this.f26088 + 1;
        }
    }

    public String toString() {
        String string;
        String strConcat;
        String strConcat2;
        int i = this.f26089;
        if (i != 0) {
            string = i != 7 ? Integer.toString(i) : "WACK";
        } else {
            string = "QUERY";
        }
        int i2 = this.f26076;
        if (i2 == 1) {
            strConcat = "FMT_ERR";
        } else if (i2 == 2) {
            strConcat = "SRV_ERR";
        } else if (i2 == 4) {
            strConcat = "IMP_ERR";
        } else if (i2 == 5) {
            strConcat = "RFS_ERR";
        } else if (i2 != 6) {
            strConcat = i2 != 7 ? "0x".concat(C12085.m29467(i2, 1)) : "CFT_ERR";
        } else {
            strConcat = "ACT_ERR";
        }
        int i3 = this.f26071;
        String strConcat3 = "NB";
        if (i3 != 32) {
            strConcat2 = i3 != 33 ? "0x".concat(C12085.m29467(i3, 4)) : "NBSTAT";
        } else {
            strConcat2 = "NB";
        }
        int i4 = this.f26091;
        if (i4 == 1) {
            strConcat3 = "A";
        } else if (i4 == 2) {
            strConcat3 = "NS";
        } else if (i4 == 10) {
            strConcat3 = "NULL";
        } else if (i4 != 32) {
            strConcat3 = i4 != 33 ? "0x".concat(C12085.m29467(i4, 4)) : "NBSTAT";
        }
        StringBuilder sb = new StringBuilder("nameTrnId=");
        sb.append(this.f26075);
        sb.append(",isResponse=");
        sb.append(this.f26085);
        sb.append(",opCode=");
        sb.append(string);
        sb.append(",isAuthAnswer=");
        sb.append(this.f26078);
        sb.append(",isTruncated=");
        sb.append(this.f26073);
        sb.append(",isRecurAvailable=");
        sb.append(this.f26081);
        sb.append(",isRecurDesired=");
        sb.append(this.f26080);
        sb.append(",isBroadcast=");
        sb.append(this.f26092);
        sb.append(",resultCode=");
        sb.append(strConcat);
        sb.append(",questionCount=");
        sb.append(this.f26070);
        sb.append(",answerCount=");
        sb.append(this.f26087);
        sb.append(",authorityCount=");
        sb.append(this.f26083);
        sb.append(",additionalCount=");
        sb.append(this.f26072);
        sb.append(",questionName=");
        sb.append(this.f26077);
        sb.append(",questionType=");
        sb.append(strConcat2);
        sb.append(",questionClass=");
        int i5 = this.f26090;
        sb.append(i5 == 1 ? "IN" : "0x".concat(C12085.m29467(i5, 4)));
        sb.append(",recordName=");
        sb.append(this.f26094);
        sb.append(",recordType=");
        sb.append(strConcat3);
        sb.append(",recordClass=");
        int i6 = this.f26093;
        sb.append(i6 != 1 ? "0x".concat(C12085.m29467(i6, 4)) : "IN");
        sb.append(",ttl=");
        sb.append(this.f26074);
        sb.append(",rDataLength=");
        sb.append(this.f26079);
        return new String(sb.toString());
    }
}
