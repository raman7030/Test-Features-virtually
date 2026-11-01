package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۖܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54GG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4818 {

    /* JADX INFO: renamed from: ܳ */
    public static final C4818 f10944;

    /* JADX INFO: renamed from: ܿ */
    public static final C4818 f10945;

    /* JADX INFO: renamed from: ᩻ */
    public static final C4818 f10946;

    /* JADX INFO: renamed from: ֫ */
    public final String[] f10947;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f10948;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f10949;

    /* JADX INFO: renamed from: ᩳ */
    public final String[] f10950;

    static {
        C22253 c22253 = C22253.f70357;
        C22253 c22254 = C22253.f70362;
        C22253 c22255 = C22253.f70348;
        C22253 c22256 = C22253.f70358;
        C22253 c22257 = C22253.f70353;
        C22253 c22258 = C22253.f70361;
        C22253 c22259 = C22253.f70345;
        C22253 c222510 = C22253.f70351;
        C22253 c222511 = C22253.f70359;
        C22253 c222512 = C22253.f70350;
        C22253 c222513 = C22253.f70360;
        C22253[] c22253Arr = {c22253, c22254, c22255, c22256, c22257, c22258, c22259, c222510, c222511, c222512, c222513};
        C22253[] c22253Arr2 = {c22253, c22254, c22255, c22256, c22257, c22258, c22259, c222510, c222511, c222512, c222513, C22253.f70355, C22253.f70346, C22253.f70344, C22253.f70354, C22253.f70347, C22253.f70349, C22253.f70343};
        C17557 c17557 = new C17557(true);
        c17557.m39968(c22253Arr);
        EnumC3301 enumC3301 = EnumC3301.TLS_1_3;
        EnumC3301 enumC3302 = EnumC3301.TLS_1_2;
        c17557.m39967(enumC3301, enumC3302);
        c17557.f52486 = true;
        C17557 c17558 = new C17557(true);
        c17558.m39968(c22253Arr2);
        EnumC3301 enumC3303 = EnumC3301.TLS_1_0;
        c17558.m39967(enumC3301, enumC3302, EnumC3301.TLS_1_1, enumC3303);
        c17558.f52486 = true;
        f10946 = new C4818(c17558);
        C17557 c17559 = new C17557(true);
        c17559.m39968(c22253Arr2);
        c17559.m39967(enumC3303);
        c17559.f52486 = true;
        f10944 = new C4818(c17559);
        f10945 = new C4818(new C17557(false));
    }

    public C4818(C17557 c17557) {
        this.f10949 = c17557.f52487;
        this.f10947 = c17557.f52485;
        this.f10950 = c17557.f52488;
        this.f10948 = c17557.f52486;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10215() {
        return this.f10948;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10216(SSLSocket sSLSocket) {
        if (!this.f10949) {
            return false;
        }
        String[] strArr = this.f10950;
        if (strArr != null && !C21407.m48504(C21407.f67537, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f10947;
        return strArr2 == null || C21407.m48504(C22253.f70356, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4818)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4818 c4818 = (C4818) obj;
        boolean z = c4818.f10949;
        boolean z2 = this.f10949;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f10947, c4818.f10947) && Arrays.equals(this.f10950, c4818.f10950) && this.f10948 == c4818.f10948;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f10949) {
            return ((((Arrays.hashCode(this.f10947) + 527) * 31) + Arrays.hashCode(this.f10950)) * 31) + (!this.f10948 ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.f10949) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f10947;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C22253.m50079(str));
            }
            string = C21562.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f10950;
        StringBuilder sbM12525 = C5633.m12525("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", strArr2 != null ? EnumC3301.m5748(strArr2).toString() : "[all enabled]", ", supportsTlsExtensions=");
        sbM12525.append(this.f10948);
        sbM12525.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sbM12525.toString();
    }
}
