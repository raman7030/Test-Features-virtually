package l;

/* JADX INFO: renamed from: l.ܳۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T89U */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC14312 {
    WINREG_V1_0("winreg interface", "338cd001-2244-31f1-aaaa-900038001003:v1.0"),
    SRVSVC_V3_0("srvsvc interface", "4b324fc8-1670-01d3-1278-5a47bf6ee188:v3.0"),
    LSASVC_V0_0("lsarpc interface", "12345778-1234-ABCD-EF00-0123456789AB:v0.0"),
    SAMSVC_V1_0("samr interface", "12345778-1234-ABCD-EF00-0123456789AC:v1.0"),
    SVCCTL_V2_0("svcctl_interface", "367abb81-9844-35f1-ad32-98f038001003:v2.0"),
    NDR_32BIT_V2("NDR transfer syntax identifier", "8a885d04-1ceb-11c9-9fe8-08002b104860:v2.0");


    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f43161 = new byte[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f43162;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f43163;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short f43164;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final short f43165;

    EnumC14312(String str, String str2) {
        this.f43163 = str;
        this.f43162 = str2;
        String[] strArrSplit = str2.split(":", 2);
        String[] strArrSplit2 = strArrSplit[0].split("-", 5);
        String[] strArr = {strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]};
        String[] strArr2 = {strArrSplit2[3], strArrSplit2[4]};
        int i = 0;
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 3; i < i4; i4 = 3) {
            String str3 = strArr[i];
            byte[] bytes = str3.getBytes();
            for (int length = str3.length() - 2; length >= 0; length -= 2) {
                for (int i5 = length; i5 < length + 2; i5++) {
                    byte b = bytes[i5];
                    byte[] bArr = this.f43161;
                    bArr[i2] = (byte) (((byte) (Character.digit(b, 16) << i3)) | bArr[i2]);
                    if (i3 == 0) {
                        i2++;
                        i3 = 4;
                    } else {
                        i3 = 0;
                    }
                }
            }
            i++;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            for (byte b2 : strArr2[i6].getBytes()) {
                byte[] bArr2 = this.f43161;
                bArr2[i2] = (byte) (((byte) (Character.digit(b2, 16) << i3)) | bArr2[i2]);
                if (i3 == 0) {
                    i2++;
                    i3 = 4;
                } else {
                    i3 = 0;
                }
            }
        }
        String[] strArrSplit3 = strArrSplit[1].split("\\.", 2);
        this.f43164 = Short.valueOf(strArrSplit3[0].substring(1)).shortValue();
        this.f43165 = Short.valueOf(strArrSplit3[1]).shortValue();
    }

    public String getName() {
        return this.f43163;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String m34179() {
        return this.f43162;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] m34180() {
        return this.f43161;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public short m34177() {
        return this.f43164;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short m34178() {
        return this.f43165;
    }
}
