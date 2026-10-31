package l;

import com.alipay.sdk.m.k0.c;

/* JADX INFO: renamed from: l.ۖ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9WT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2186 extends C19369 {
    public static final long serialVersionUID = 492638554095148960L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7188;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7189;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7204(int i, int i2) {
        if (i == 0) {
            return c.p;
        }
        if (i == 1) {
            return (i2 != 1 ? "ERR_NAM_SRVC/" : "ERR_NAM_SRVC/FMT_ERR: Format Error") + "Unknown error code: " + i2;
        }
        if (i != 2) {
            return C19370.m44628(i, "unknown error class: ");
        }
        if (i2 == -1) {
            return "ERR_SSN_SRVC/Connection refused";
        }
        if (i2 == 143) {
            return "ERR_SSN_SRVC/Unspecified error";
        }
        switch (i2) {
            case 128:
                return "ERR_SSN_SRVC/Not listening on called name";
            case 129:
                return "ERR_SSN_SRVC/Not listening for calling name";
            case 130:
                return "ERR_SSN_SRVC/Called name not present";
            case 131:
                return "ERR_SSN_SRVC/Called name present, but insufficient resources";
            default:
                return C19370.m44628(i2, "ERR_SSN_SRVC/Unknown error code: ");
        }
    }

    public C2186(int i) {
        super(m7204(2, i));
        this.f7188 = 2;
        this.f7189 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("errorClass=");
        int i = this.f7188;
        sb.append(i);
        sb.append(",errorCode=");
        int i2 = this.f7189;
        sb.append(i2);
        sb.append(",errorString=");
        sb.append(m7204(i, i2));
        return new String(sb.toString());
    }
}
