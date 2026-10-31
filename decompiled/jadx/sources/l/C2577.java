package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۖܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54GG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2577 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C2577 f8152;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C2577 f8153;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C2577 f8154;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] f8155;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f8156;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f8157;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String[] f8158;

    static {
        C20922 c20922 = C20922.f67672;
        C20922 c20923 = C20922.f67677;
        C20922 c20924 = C20922.f67663;
        C20922 c20925 = C20922.f67673;
        C20922 c20926 = C20922.f67668;
        C20922 c20927 = C20922.f67676;
        C20922 c20928 = C20922.f67660;
        C20922 c20929 = C20922.f67666;
        C20922 c209210 = C20922.f67674;
        C20922 c209211 = C20922.f67665;
        C20922 c209212 = C20922.f67675;
        C20922[] c20922Arr = {c20922, c20923, c20924, c20925, c20926, c20927, c20928, c20929, c209210, c209211, c209212};
        C20922[] c20922Arr2 = {c20922, c20923, c20924, c20925, c20926, c20927, c20928, c20929, c209210, c209211, c209212, C20922.f67670, C20922.f67661, C20922.f67659, C20922.f67669, C20922.f67662, C20922.f67664, C20922.f67658};
        C15981 c15981 = new C15981(true);
        c15981.m37783(c20922Arr);
        EnumC0981 enumC0981 = EnumC0981.TLS_1_3;
        EnumC0981 enumC0982 = EnumC0981.TLS_1_2;
        c15981.m37782(enumC0981, enumC0982);
        c15981.f49323 = true;
        C15981 c15982 = new C15981(true);
        c15982.m37783(c20922Arr2);
        EnumC0981 enumC0983 = EnumC0981.TLS_1_0;
        c15982.m37782(enumC0981, enumC0982, EnumC0981.TLS_1_1, enumC0983);
        c15982.f49323 = true;
        f8154 = new C2577(c15982);
        C15981 c15983 = new C15981(true);
        c15983.m37783(c20922Arr2);
        c15983.m37782(enumC0983);
        c15983.f49323 = true;
        f8152 = new C2577(c15983);
        f8153 = new C2577(new C15981(false));
    }

    public C2577(C15981 c15981) {
        this.f8157 = c15981.f49324;
        this.f8155 = c15981.f49322;
        this.f8158 = c15981.f49325;
        this.f8156 = c15981.f49323;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8176() {
        return this.f8156;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8177(SSLSocket sSLSocket) {
        if (!this.f8157) {
            return false;
        }
        String[] strArr = this.f8158;
        if (strArr != null && !C20032.m46188(C20032.f64895, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f8155;
        return strArr2 == null || C20032.m46188(C20922.f67671, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2577)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2577 c2577 = (C2577) obj;
        boolean z = c2577.f8157;
        boolean z2 = this.f8157;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f8155, c2577.f8155) && Arrays.equals(this.f8158, c2577.f8158) && this.f8156 == c2577.f8156;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f8157) {
            return ((((Arrays.hashCode(this.f8155) + 527) * 31) + Arrays.hashCode(this.f8158)) * 31) + (!this.f8156 ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.f8157) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f8155;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C20922.m47749(str));
            }
            string = C20195.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f8158;
        StringBuilder sbM10501 = C3435.m10501("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", strArr2 != null ? EnumC0981.m3445(strArr2).toString() : "[all enabled]", ", supportsTlsExtensions=");
        sbM10501.append(this.f8156);
        sbM10501.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sbM10501.toString();
    }
}
