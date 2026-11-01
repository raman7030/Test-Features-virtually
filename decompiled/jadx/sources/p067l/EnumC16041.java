package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4FB */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC16041 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: ᩸ */
    public final String f46441;

    EnumC16041(String str) {
        this.f46441 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC16041 m36493(String str) throws IOException {
        EnumC16041 enumC16041 = HTTP_1_0;
        if (str.equals(enumC16041.f46441)) {
            return enumC16041;
        }
        EnumC16041 enumC16042 = HTTP_1_1;
        if (str.equals(enumC16042.f46441)) {
            return enumC16042;
        }
        EnumC16041 enumC16043 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC16043.f46441)) {
            return enumC16043;
        }
        EnumC16041 enumC16044 = HTTP_2;
        if (str.equals(enumC16044.f46441)) {
            return enumC16044;
        }
        EnumC16041 enumC16045 = SPDY_3;
        if (str.equals(enumC16045.f46441)) {
            return enumC16045;
        }
        EnumC16041 enumC16046 = QUIC;
        if (str.equals(enumC16046.f46441)) {
            return enumC16046;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f46441;
    }
}
