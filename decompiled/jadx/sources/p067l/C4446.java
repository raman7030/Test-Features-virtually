package p067l;

import com.alipay.sdk.p010m.p032k0.C0159c;

/* JADX INFO: renamed from: l.ۖ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9WT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4446 extends C20777 {
    public static final long serialVersionUID = 492638554095148960L;

    /* JADX INFO: renamed from: ᩸ */
    public int f9973;

    /* JADX INFO: renamed from: ᩹ */
    public int f9974;

    /* JADX INFO: renamed from: ֫ */
    public static String m9283(int i, int i2) {
        if (i == 0) {
            return C0159c.f524p;
        }
        if (i == 1) {
            return (i2 != 1 ? "ERR_NAM_SRVC/" : "ERR_NAM_SRVC/FMT_ERR: Format Error") + "Unknown error code: " + i2;
        }
        if (i != 2) {
            return C20778.m46922(i, "unknown error class: ");
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
                return C20778.m46922(i2, "ERR_SSN_SRVC/Unknown error code: ");
        }
    }

    public C4446(int i) {
        super(m9283(2, i));
        this.f9973 = 2;
        this.f9974 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("errorClass=");
        int i = this.f9973;
        sb.append(i);
        sb.append(",errorCode=");
        int i2 = this.f9974;
        sb.append(i2);
        sb.append(",errorString=");
        sb.append(m9283(i, i2));
        return new String(sb.toString());
    }
}
