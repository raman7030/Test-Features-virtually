package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.cb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38GN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13940 {
    /* JADX WARN: Code duplicated, block: B:102:0x01a5 A[PHI: r5
      0x01a5: PHI (r5v10 java.lang.String) = (r5v7 java.lang.String), (r5v9 java.lang.String) binds: [B:101:0x01a3, B:107:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33379(C8839 c8839, C23655 c23655, List list) {
        String str;
        String strM37867;
        ArrayList<String> arrayList = new ArrayList();
        C13277 c13277 = new C13277(c23655.f76629);
        while (true) {
            String strM32240 = c13277.m32240();
            if (strM32240 == null) {
                break;
            }
            arrayList.add(strM32240);
        }
        ArrayList<String> arrayList2 = new ArrayList(arrayList.size());
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= arrayList.size()) {
                if (c23655.f76634.equals("<clinit>")) {
                    str = ".classInitializer";
                } else if (c23655.f76634.equals("<init>")) {
                    str = "[\"$init\"]";
                } else {
                    str = "[\"" + C10035.f30191.m28254(c23655.f76634) + "\"]";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m33377(c8839));
                sb.append("\n");
                sb.append(m33381(c8839));
                sb.append(str);
                String str2 = c23655.f76634;
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((C23655) it.next()).f76634.equals(str2)) {
                        i2++;
                    }
                }
                if (i2 > 1) {
                    sb.append(".overload(");
                    boolean z2 = true;
                    for (String str3 : arrayList) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(C9045.m23341(new StringBuilder("'"), m33376(str3), "'"));
                    }
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                sb.append(".implementation = function (");
                m33380(arrayList2, sb, (C23113) null);
                C20177.m46410(sb, "", ") {\n", "    console.log(`");
                sb.append(c8839.f26917);
                sb.append(".");
                sb.append(c23655.f76634);
                sb.append(" is called");
                if (!arrayList2.isEmpty()) {
                    sb.append(": ");
                    for (String str4 : arrayList2) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(str4 + "=${" + str4 + l.d);
                    }
                    sb.append("");
                }
                sb.append("`);\n");
                if (c23655.f76633.equals("V")) {
                    C20177.m46410(sb, "    this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m33380(arrayList2, sb, (C23113) null);
                    sb.append("");
                    sb.append(");\n");
                } else {
                    C20177.m46410(sb, "    let result = this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m33380(arrayList2, sb, (C23113) null);
                    C20177.m46410(sb, "", ");\n", "    console.log(`");
                    sb.append(c8839.f26917);
                    sb.append(".");
                    C20177.m46410(sb, c23655.f76634, " result=${result}`);\n", "    return result;\n");
                }
                sb.append("};");
                return sb.toString();
            }
            String strSubstring = (String) arrayList.get(i);
            boolean zStartsWith = strSubstring.startsWith("[");
            if (zStartsWith) {
                strSubstring = strSubstring.substring(strSubstring.lastIndexOf(91) + 1);
            }
            int i3 = 2;
            if (strSubstring.length() != 1) {
                int i4 = i + 1;
                byte b = -1;
                switch (strSubstring.hashCode()) {
                    case -1568911010:
                        if (strSubstring.equals("Ljava/util/Double;")) {
                            b = 0;
                        }
                        break;
                    case -1379929247:
                        if (strSubstring.equals("Ljava/util/Iterator;")) {
                            b = 1;
                        }
                        break;
                    case -1170786036:
                        if (strSubstring.equals("Ljava/lang/Exception;")) {
                            b = 2;
                        }
                        break;
                    case -1126271266:
                        if (strSubstring.equals("Ljava/util/Character;")) {
                            b = 3;
                        }
                        break;
                    case -745004865:
                        if (strSubstring.equals("Ljava/util/Boolean;")) {
                            b = 4;
                        }
                        break;
                    case -550491125:
                        if (strSubstring.equals("Ljava/util/Float;")) {
                            b = 5;
                        }
                        break;
                    case -328614435:
                        if (strSubstring.equals("Ljava/util/StringBuilder;")) {
                            b = 6;
                        }
                        break;
                    case -181989909:
                        if (strSubstring.equals("Ljava/util/Short;")) {
                            b = 7;
                        }
                        break;
                    case -128922053:
                        if (strSubstring.equals("Ljava/lang/Throwable;")) {
                            b = 8;
                        }
                        break;
                    case 117487623:
                        if (strSubstring.equals("Ljava/util/Byte;")) {
                            b = 9;
                        }
                        break;
                    case 126419219:
                        if (strSubstring.equals("Ljava/util/Long;")) {
                            b = 10;
                        }
                        break;
                    case 1379658506:
                        if (strSubstring.equals("Ljava/lang/String;")) {
                            b = 11;
                        }
                        break;
                    case 1518216451:
                        if (strSubstring.equals("Ljava/lang/Class;")) {
                            b = 12;
                        }
                        break;
                    case 1601768860:
                        if (strSubstring.equals("Ljava/lang/Object;")) {
                            b = cb.k;
                        }
                        break;
                    case 2113973865:
                        if (strSubstring.equals("Ljava/util/Integer;")) {
                            b = cb.f77931l;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        strM37867 = "d";
                        break;
                    case 1:
                        strM37867 = "it";
                        break;
                    case 2:
                        strM37867 = "ex";
                        break;
                    case 3:
                        strM37867 = "ch";
                        break;
                    case 4:
                        strM37867 = "bool";
                        break;
                    case 5:
                        strM37867 = "f";
                        break;
                    case 6:
                        strM37867 = "sb";
                        break;
                    case 7:
                        strM37867 = "sh";
                        break;
                    case 8:
                        strM37867 = "th";
                        break;
                    case 9:
                        strM37867 = "b";
                        break;
                    case 10:
                        strM37867 = "l";
                        break;
                    case 11:
                        strM37867 = "str";
                        break;
                    case 12:
                        strM37867 = "cls";
                        break;
                    case 13:
                        strM37867 = "obj";
                        break;
                    case 14:
                        strM37867 = "num";
                        break;
                    default:
                        String strM36561 = C15472.m36561(1, 1, strSubstring);
                        String strSubstring2 = strM36561.substring(strM36561.lastIndexOf(47) + 1);
                        String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf(36) + 1);
                        if (!strSubstring3.matches("[a-zA-Z]\\w*")) {
                            strM37867 = C19370.m44628(i4, "arg");
                        } else if (strSubstring3.toUpperCase().equals(strSubstring3)) {
                            strM37867 = strSubstring3.toLowerCase();
                        } else {
                            String lowerCase = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
                            if (!lowerCase.equals(strSubstring3)) {
                                strM37867 = lowerCase;
                            } else if (strSubstring3.length() < 3) {
                                strM37867 = strSubstring3.concat("Var");
                            } else {
                                lowerCase = strSubstring3.toLowerCase();
                                if (strSubstring3.equals(lowerCase)) {
                                    strM37867 = C16014.m37867(lowerCase, "Var");
                                } else {
                                    strM37867 = lowerCase;
                                }
                            }
                        }
                        break;
                }
            } else {
                strM37867 = strSubstring.toLowerCase();
            }
            if (zStartsWith) {
                strM37867 = C16014.m37867(strM37867, "Arr");
            }
            if (arrayList2.contains(strM37867)) {
                while (true) {
                    if (arrayList2.contains(strM37867 + i3)) {
                        i3++;
                    } else {
                        arrayList2.add(strM37867 + i3);
                    }
                }
            } else {
                arrayList2.add(strM37867);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33377(C8839 c8839) {
        return C20087.m46306("let ", m33381(c8839), " = Java.use(\"", m33376(c8839.f26919), "\");");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33376(String str) {
        if (str.startsWith("L")) {
            return str.substring(1, str.length() - 1).replace('/', '.');
        }
        if (str.startsWith("[")) {
            return str.replace('/', '.');
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return ClassTransform.FLOAT;
        }
        if (cCharAt == 'S') {
            return ClassTransform.SHORT;
        }
        if (cCharAt == 'V') {
            return ClassTransform.VOID;
        }
        if (cCharAt == 'Z') {
            return ClassTransform.BOOLEAN;
        }
        if (cCharAt == 'I') {
            return ClassTransform.INTEGER;
        }
        if (cCharAt == 'J') {
            return ClassTransform.LONG;
        }
        switch (cCharAt) {
            case 'B':
                return ClassTransform.BYTE;
            case 'C':
                return ClassTransform.CHARACTER;
            case 'D':
                return ClassTransform.DOUBLE;
            default:
                throw new C9796("Unknown type ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m33381(C8839 c8839) {
        String str = c8839.f26917;
        return str.matches("[a-zA-Z]\\w*") ? str : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33380(ArrayList arrayList, StringBuilder sb, C23113 c23113) {
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33378(C8839 c8839, C14482 c14482, List list) {
        String str = c14482.f44373;
        if (!str.matches("[a-zA-Z]\\w*")) {
            str = String.format("field%X", Integer.valueOf(str.hashCode() & 65535));
        }
        String strM46315 = c14482.f44373;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C23655) it.next()).f76634.equals(strM46315)) {
                strM46315 = C20094.m46315("_", strM46315);
                break;
            }
        }
        String strM28254 = C10035.f30191.m28254(strM46315);
        return m33377(c8839) + "\n" + str + " = " + m33381(c8839) + "." + strM28254 + ".value;";
    }
}
