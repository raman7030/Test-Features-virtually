package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4FB */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC14386 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f43348;

    EnumC14386(String str) {
        this.f43348 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC14386 m34359(String str) throws IOException {
        EnumC14386 enumC14386 = HTTP_1_0;
        if (str.equals(enumC14386.f43348)) {
            return enumC14386;
        }
        EnumC14386 enumC14387 = HTTP_1_1;
        if (str.equals(enumC14387.f43348)) {
            return enumC14387;
        }
        EnumC14386 enumC14388 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC14388.f43348)) {
            return enumC14388;
        }
        EnumC14386 enumC14389 = HTTP_2;
        if (str.equals(enumC14389.f43348)) {
            return enumC14389;
        }
        EnumC14386 enumC143810 = SPDY_3;
        if (str.equals(enumC143810.f43348)) {
            return enumC143810;
        }
        EnumC14386 enumC143811 = QUIC;
        if (str.equals(enumC143811.f43348)) {
            return enumC143811;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43348;
    }
}
