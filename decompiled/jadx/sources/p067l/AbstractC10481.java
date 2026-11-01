package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.net.InetAddress;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۡ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59W6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10481 {

    /* JADX INFO: renamed from: ֨ */
    public int f28986;

    /* JADX INFO: renamed from: ֫ */
    public int f28987;

    /* JADX INFO: renamed from: ۖ */
    public boolean f28988;

    /* JADX INFO: renamed from: ۗ */
    public int f28989;

    /* JADX INFO: renamed from: ۘ */
    public int f28990;

    /* JADX INFO: renamed from: ۙ */
    public int f28991;

    /* JADX INFO: renamed from: ۚ */
    public C17856 f28992;

    /* JADX INFO: renamed from: ۜ */
    public boolean f28993;

    /* JADX INFO: renamed from: ۠ */
    public int f28994;

    /* JADX INFO: renamed from: ۢ */
    public boolean f28996;

    /* JADX INFO: renamed from: ۧ */
    public InetAddress f28997;

    /* JADX INFO: renamed from: ܳ */
    public int f28998;

    /* JADX INFO: renamed from: ܶ */
    public boolean f28999;

    /* JADX INFO: renamed from: ܺ */
    public boolean f29000;

    /* JADX INFO: renamed from: ܽ */
    public C17185[] f29001;

    /* JADX INFO: renamed from: ܿ */
    public int f29002;

    /* JADX INFO: renamed from: ᩳ */
    public int f29003;

    /* JADX INFO: renamed from: ᩴ */
    public int f29004;

    /* JADX INFO: renamed from: ᩶ */
    public int f29006;

    /* JADX INFO: renamed from: ᩸ */
    public int f29008;

    /* JADX INFO: renamed from: ᩹ */
    public C17856 f29009;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC3341 f29010;

    /* JADX INFO: renamed from: ۡ */
    public boolean f28995 = true;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f29007 = true;

    /* JADX INFO: renamed from: ֡ */
    public int f28985 = 1;

    /* JADX INFO: renamed from: ᩵ */
    public int f29005 = 1;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo12970(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo12971(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo12972(int i, byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public static void m24185(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m24187(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    /* JADX INFO: renamed from: ܳ */
    public static int m24186(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public AbstractC10481(InterfaceC3341 interfaceC3341) {
        this.f29010 = interfaceC3341;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m24189(byte[] bArr) {
        m24185(this.f28990, 0, bArr);
        bArr[2] = (byte) ((this.f29000 ? 128 : 0) + ((this.f29004 << 3) & UMErrorCode.E_UM_BE_NOT_MAINPROCESS) + (this.f28993 ? 4 : 0) + (this.f28988 ? 2 : 0) + (this.f28995 ? 1 : 0));
        bArr[3] = (byte) ((this.f28996 ? 128 : 0) + (this.f29007 ? 16 : 0) + (this.f28991 & 15));
        m24185(this.f28985, 4, bArr);
        m24185(this.f29002, 6, bArr);
        m24185(this.f28998, 8, bArr);
        m24185(this.f28987, 10, bArr);
        return mo12972(12, bArr) + 12;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24188(byte[] bArr) {
        this.f28990 = m24187(0, bArr);
        byte b = bArr[2];
        this.f29000 = (b & GCMSIVBlockCipher.MASK) != 0;
        this.f29004 = (b & 120) >> 3;
        this.f28993 = (b & 4) != 0;
        this.f28988 = (b & 2) != 0;
        this.f28995 = (b & 1) != 0;
        byte b2 = bArr[3];
        this.f28996 = (b2 & GCMSIVBlockCipher.MASK) != 0;
        this.f29007 = (b2 & 16) != 0;
        this.f28991 = b2 & 15;
        this.f28985 = m24187(4, bArr);
        this.f29002 = m24187(6, bArr);
        this.f28998 = m24187(8, bArr);
        this.f28987 = m24187(10, bArr);
        mo12970(12, bArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24190(int i, byte[] bArr) {
        int iM40546;
        if ((bArr[i] & 192) == 192) {
            this.f29009 = this.f28992;
            iM40546 = i + 2;
        } else {
            iM40546 = this.f29009.m40546(i, bArr) + i;
        }
        this.f29006 = m24187(iM40546, bArr);
        this.f29008 = m24187(iM40546 + 2, bArr);
        this.f28989 = m24186(iM40546 + 4, bArr);
        int iM24187 = m24187(iM40546 + 8, bArr);
        this.f28994 = iM24187;
        int iMo12971 = iM40546 + 10;
        this.f29001 = new C17185[iM24187 / 6];
        int i2 = iM24187 + iMo12971;
        int i3 = 0;
        while (true) {
            this.f29003 = i3;
            if (iMo12971 >= i2) {
                return iMo12971 - i;
            }
            iMo12971 += mo12971(iMo12971, bArr);
            i3 = this.f29003 + 1;
        }
    }

    public String toString() {
        String string;
        String strConcat;
        String strConcat2;
        int i = this.f29004;
        if (i != 0) {
            string = i != 7 ? Integer.toString(i) : "WACK";
        } else {
            string = "QUERY";
        }
        int i2 = this.f28991;
        if (i2 == 1) {
            strConcat = "FMT_ERR";
        } else if (i2 == 2) {
            strConcat = "SRV_ERR";
        } else if (i2 == 4) {
            strConcat = "IMP_ERR";
        } else if (i2 == 5) {
            strConcat = "RFS_ERR";
        } else if (i2 != 6) {
            strConcat = i2 != 7 ? "0x".concat(C13854.m31529(i2, 1)) : "CFT_ERR";
        } else {
            strConcat = "ACT_ERR";
        }
        int i3 = this.f28986;
        String strConcat3 = "NB";
        if (i3 != 32) {
            strConcat2 = i3 != 33 ? "0x".concat(C13854.m31529(i3, 4)) : "NBSTAT";
        } else {
            strConcat2 = "NB";
        }
        int i4 = this.f29006;
        if (i4 == 1) {
            strConcat3 = "A";
        } else if (i4 == 2) {
            strConcat3 = "NS";
        } else if (i4 == 10) {
            strConcat3 = "NULL";
        } else if (i4 != 32) {
            strConcat3 = i4 != 33 ? "0x".concat(C13854.m31529(i4, 4)) : "NBSTAT";
        }
        StringBuilder sb = new StringBuilder("nameTrnId=");
        sb.append(this.f28990);
        sb.append(",isResponse=");
        sb.append(this.f29000);
        sb.append(",opCode=");
        sb.append(string);
        sb.append(",isAuthAnswer=");
        sb.append(this.f28993);
        sb.append(",isTruncated=");
        sb.append(this.f28988);
        sb.append(",isRecurAvailable=");
        sb.append(this.f28996);
        sb.append(",isRecurDesired=");
        sb.append(this.f28995);
        sb.append(",isBroadcast=");
        sb.append(this.f29007);
        sb.append(",resultCode=");
        sb.append(strConcat);
        sb.append(",questionCount=");
        sb.append(this.f28985);
        sb.append(",answerCount=");
        sb.append(this.f29002);
        sb.append(",authorityCount=");
        sb.append(this.f28998);
        sb.append(",additionalCount=");
        sb.append(this.f28987);
        sb.append(",questionName=");
        sb.append(this.f28992);
        sb.append(",questionType=");
        sb.append(strConcat2);
        sb.append(",questionClass=");
        int i5 = this.f29005;
        sb.append(i5 == 1 ? "IN" : "0x".concat(C13854.m31529(i5, 4)));
        sb.append(",recordName=");
        sb.append(this.f29009);
        sb.append(",recordType=");
        sb.append(strConcat3);
        sb.append(",recordClass=");
        int i6 = this.f29008;
        sb.append(i6 != 1 ? "0x".concat(C13854.m31529(i6, 4)) : "IN");
        sb.append(",ttl=");
        sb.append(this.f28989);
        sb.append(",rDataLength=");
        sb.append(this.f28994);
        return new String(sb.toString());
    }
}
