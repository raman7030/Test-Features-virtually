package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 94CO */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0981 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f3678;

    EnumC0981(String str) {
        this.f3678 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC0981 m3446(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m3445(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m3446(str));
        }
        return C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m3447() {
        return this.f3678;
    }
}
