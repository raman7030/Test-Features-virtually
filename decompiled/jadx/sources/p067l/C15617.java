package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0698cb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38GN */
/* JADX INFO: loaded from: classes3.dex */
public final class C15617 {
    /* JADX WARN: Code duplicated, block: B:102:0x01a5 A[PHI: r5
      0x01a5: PHI (r5v10 java.lang.String) = (r5v7 java.lang.String), (r5v9 java.lang.String) binds: [B:101:0x01a3, B:107:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public static String m35498(C10769 c10769, C24850 c24850, List list) {
        String str;
        String strM40053;
        ArrayList<String> arrayList = new ArrayList();
        C14987 c14987 = new C14987(c24850.f79375);
        while (true) {
            String strM34339 = c14987.m34339();
            if (strM34339 == null) {
                break;
            }
            arrayList.add(strM34339);
        }
        ArrayList<String> arrayList2 = new ArrayList(arrayList.size());
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= arrayList.size()) {
                if (c24850.f79380.equals("<clinit>")) {
                    str = ".classInitializer";
                } else if (c24850.f79380.equals("<init>")) {
                    str = "[\"$init\"]";
                } else {
                    str = "[\"" + C11905.f33149.m30298(c24850.f79380) + "\"]";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m35496(c10769));
                sb.append("\n");
                sb.append(m35500(c10769));
                sb.append(str);
                String str2 = c24850.f79380;
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((C24850) it.next()).f79380.equals(str2)) {
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
                        sb.append(C10965.m25286(new StringBuilder("'"), m35495(str3), "'"));
                    }
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                sb.append(".implementation = function (");
                m35499(arrayList2, sb, (C24335) null);
                C21545.m48729(sb, "", ") {\n", "    console.log(`");
                sb.append(c10769.f29841);
                sb.append(".");
                sb.append(c24850.f79380);
                sb.append(" is called");
                if (!arrayList2.isEmpty()) {
                    sb.append(": ");
                    for (String str4 : arrayList2) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(str4 + "=${" + str4 + C0249l.f1198d);
                    }
                    sb.append("");
                }
                sb.append("`);\n");
                if (c24850.f79379.equals("V")) {
                    C21545.m48729(sb, "    this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m35499(arrayList2, sb, (C24335) null);
                    sb.append("");
                    sb.append(");\n");
                } else {
                    C21545.m48729(sb, "    let result = this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m35499(arrayList2, sb, (C24335) null);
                    C21545.m48729(sb, "", ");\n", "    console.log(`");
                    sb.append(c10769.f29841);
                    sb.append(".");
                    C21545.m48729(sb, c24850.f79380, " result=${result}`);\n", "    return result;\n");
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
                            b = C0698cb.f2569k;
                        }
                        break;
                    case 2113973865:
                        if (strSubstring.equals("Ljava/util/Integer;")) {
                            b = C0698cb.f2570l;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        strM40053 = "d";
                        break;
                    case 1:
                        strM40053 = "it";
                        break;
                    case 2:
                        strM40053 = "ex";
                        break;
                    case 3:
                        strM40053 = "ch";
                        break;
                    case 4:
                        strM40053 = "bool";
                        break;
                    case 5:
                        strM40053 = "f";
                        break;
                    case 6:
                        strM40053 = "sb";
                        break;
                    case 7:
                        strM40053 = "sh";
                        break;
                    case 8:
                        strM40053 = "th";
                        break;
                    case 9:
                        strM40053 = "b";
                        break;
                    case 10:
                        strM40053 = "l";
                        break;
                    case 11:
                        strM40053 = "str";
                        break;
                    case 12:
                        strM40053 = "cls";
                        break;
                    case 13:
                        strM40053 = "obj";
                        break;
                    case 14:
                        strM40053 = "num";
                        break;
                    default:
                        String strM38720 = C17073.m38720(1, 1, strSubstring);
                        String strSubstring2 = strM38720.substring(strM38720.lastIndexOf(47) + 1);
                        String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf(36) + 1);
                        if (!strSubstring3.matches("[a-zA-Z]\\w*")) {
                            strM40053 = C20778.m46922(i4, "arg");
                        } else if (strSubstring3.toUpperCase().equals(strSubstring3)) {
                            strM40053 = strSubstring3.toLowerCase();
                        } else {
                            String lowerCase = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
                            if (!lowerCase.equals(strSubstring3)) {
                                strM40053 = lowerCase;
                            } else if (strSubstring3.length() < 3) {
                                strM40053 = strSubstring3.concat("Var");
                            } else {
                                lowerCase = strSubstring3.toLowerCase();
                                if (strSubstring3.equals(lowerCase)) {
                                    strM40053 = C17588.m40053(lowerCase, "Var");
                                } else {
                                    strM40053 = lowerCase;
                                }
                            }
                        }
                        break;
                }
            } else {
                strM40053 = strSubstring.toLowerCase();
            }
            if (zStartsWith) {
                strM40053 = C17588.m40053(strM40053, "Arr");
            }
            if (arrayList2.contains(strM40053)) {
                while (true) {
                    if (arrayList2.contains(strM40053 + i3)) {
                        i3++;
                    } else {
                        arrayList2.add(strM40053 + i3);
                    }
                }
            } else {
                arrayList2.add(strM40053);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m35496(C10769 c10769) {
        return C21459.m48622("let ", m35500(c10769), " = Java.use(\"", m35495(c10769.f29843), "\");");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m35495(String str) {
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
                throw new C11679("Unknown type ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m35500(C10769 c10769) {
        String str = c10769.f29841;
        return str.matches("[a-zA-Z]\\w*") ? str : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35499(ArrayList arrayList, StringBuilder sb, C24335 c24335) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m35497(C10769 c10769, C16132 c16132, List list) {
        String str = c16132.f47474;
        if (!str.matches("[a-zA-Z]\\w*")) {
            str = String.format("field%X", Integer.valueOf(str.hashCode() & 65535));
        }
        String strM48631 = c16132.f47474;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C24850) it.next()).f79380.equals(strM48631)) {
                strM48631 = C21466.m48631("_", strM48631);
                break;
            }
        }
        String strM30298 = C11905.f33149.m30298(strM48631);
        return m35496(c10769) + "\n" + str + " = " + m35500(c10769) + "." + strM30298 + ".value;";
    }
}
