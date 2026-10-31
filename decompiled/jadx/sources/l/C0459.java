package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֡ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R3LO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0459 implements InterfaceC2452 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m2046(String str, String str2) {
        Charset charset = StandardCharsets.UTF_8;
        return "Basic ".concat(C11816.m28901(str + ":" + str2).mo2326());
    }

    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public void mo1728(C16040 c16040) {
        ((C11955) c16040.m37919()).toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m2047(InterfaceC19150 interfaceC19150) {
        int iMo3615;
        if (interfaceC19150 != null) {
            int iMo3818 = interfaceC19150.mo3818();
            int i = 0;
            for (InterfaceC22677 interfaceC22677 : interfaceC19150.mo3817()) {
                if (interfaceC22677.mo3975().f3318 == 3) {
                    InterfaceC5471 interfaceC5471 = (InterfaceC5471) ((InterfaceC10952) interfaceC22677).getReference();
                    EnumC0841 enumC0841Mo3975 = interfaceC22677.mo3975();
                    if (enumC0841Mo3975 != EnumC0841.f3044 && enumC0841Mo3975 != EnumC0841.f3100) {
                        boolean z = enumC0841Mo3975 == EnumC0841.f3052 || enumC0841Mo3975 == EnumC0841.f3133;
                        InterfaceC18842 interfaceC18842 = C17177.f52643;
                        iMo3615 = C17177.m40411(interfaceC5471.mo3565(), z);
                    } else {
                        iMo3615 = ((InterfaceC6718) interfaceC22677).mo3615();
                    }
                    if (iMo3615 > i) {
                        i = iMo3615;
                    }
                }
            }
            if (i > 5 && i > iMo3818) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m2045(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return ClassTransform.FLOAT;
        }
        int i = 1;
        if (cCharAt == 'L') {
            int iLastIndexOf = str.lastIndexOf(47);
            return C15472.m36561(1, iLastIndexOf < 0 ? 1 : iLastIndexOf + 1, str);
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
        sb.append(m2045(str.substring(i)));
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
