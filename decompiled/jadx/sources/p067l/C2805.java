package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֡ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R3LO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2805 implements InterfaceC4699 {
    /* JADX INFO: renamed from: ֫ */
    public static String m4426(String str, String str2) {
        Charset charset = StandardCharsets.UTF_8;
        return "Basic ".concat(C13598.m30950(str + ":" + str2).mo4697());
    }

    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public void mo4126(C17613 c17613) {
        ((C13731) c17613.m40106()).toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4427(InterfaceC20568 interfaceC20568) {
        int iMo5886;
        if (interfaceC20568 != null) {
            int iMo6075 = interfaceC20568.mo6075();
            int i = 0;
            for (InterfaceC23920 interfaceC23920 : interfaceC20568.mo6074()) {
                if (interfaceC23920.mo6217().f6092 == 3) {
                    InterfaceC7568 interfaceC7568 = (InterfaceC7568) ((InterfaceC12777) interfaceC23920).getReference();
                    EnumC3167 enumC3167Mo6217 = interfaceC23920.mo6217();
                    if (enumC3167Mo6217 != EnumC3167.f5818 && enumC3167Mo6217 != EnumC3167.f5874) {
                        boolean z = enumC3167Mo6217 == EnumC3167.f5826 || enumC3167Mo6217 == EnumC3167.f5907;
                        InterfaceC20276 interfaceC20276 = C18693.f55824;
                        iMo5886 = C18693.m42656(interfaceC7568.mo5852(), z);
                    } else {
                        iMo5886 = ((InterfaceC8753) interfaceC23920).mo5886();
                    }
                    if (iMo5886 > i) {
                        i = iMo5886;
                    }
                }
            }
            if (i > 5 && i > iMo6075) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m4425(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return ClassTransform.FLOAT;
        }
        int i = 1;
        if (cCharAt == 'L') {
            int iLastIndexOf = str.lastIndexOf(47);
            return C17073.m38720(1, iLastIndexOf < 0 ? 1 : iLastIndexOf + 1, str);
        }
        if (cCharAt == 'S') {
            return ClassTransform.SHORT;
        }
        if (cCharAt == 'V') {
            return ClassTransform.VOID;
        }
        if (cCharAt == 'I') {
            return ClassTransform.INTEGER;
        }
        if (cCharAt == 'J') {
            return ClassTransform.LONG;
        }
        if (cCharAt == 'Z') {
            return ClassTransform.BOOLEAN;
        }
        if (cCharAt != '[') {
            switch (cCharAt) {
                case 'B':
                    return ClassTransform.BYTE;
                case 'C':
                    return ClassTransform.CHARACTER;
                case 'D':
                    return ClassTransform.DOUBLE;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        while (i < str.length() && str.charAt(i) == '[') {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m4425(str.substring(i)));
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
