package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.stream.DocumentReader;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1ES */
/* JADX INFO: loaded from: classes3.dex */
public final class C9650 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C2727 f29234;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C16704 f29235 = new C16704();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C19528 f29236 = new C19528();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C2727 f29237;

    static {
        C2727 c2727 = new C2727();
        f29234 = c2727;
        C2727 c2728 = new C2727();
        f29237 = c2728;
        c2727.put("attr", new C7616());
        c2727.put("^attr-private", new C7616());
        c2727.put("array", new C23138());
        c2727.put("style", new C5416());
        c2727.put("plurals", new C18822());
        c2728.put("bool", new C1888());
        c2728.put("dimen", new C17410());
        c2728.put("fraction", new C8944());
        c2728.put("id", new C15998());
        c2728.put("integer", new C2594());
        c2728.put("string", new C0476());
        c2728.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C11061());
        C4005 c4005 = new C4005();
        c2728.put("anim", c4005);
        c2728.put("animator", c4005);
        c2728.put("drawable", c4005);
        c2728.put("interpolator", c4005);
        c2728.put("layout", c4005);
        c2728.put("transition", c4005);
        c2728.put("menu", c4005);
        c2728.put("mipmap", c4005);
        c2728.put("raw", c4005);
        c2728.put(DocumentReader.RESERVED, c4005);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24591(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C14587 c14587, C18116 c18116) {
        InterfaceC23760 interfaceC23760;
        String typeName = interfaceC21211.getType().getTypeName();
        int length = typeName.length();
        while (length > 0) {
            char cCharAt = typeName.charAt(length - 1);
            if ('0' > cCharAt || cCharAt > '9') {
                break;
            } else {
                length--;
            }
        }
        if (length > 0 && length != typeName.length()) {
            typeName = typeName.substring(0, length);
        }
        if (interfaceC21211.mo29412()) {
            interfaceC23760 = (InterfaceC23760) f29234.getOrDefault(typeName, f29235);
        } else {
            interfaceC23760 = (InterfaceC23760) f29237.getOrDefault(typeName, f29236);
        }
        interfaceC23760.mo15499(interfaceC13965, interfaceC21211, c14587, c18116);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24587(InterfaceC1454 interfaceC1454) throws IOException {
        int iMo5004 = interfaceC1454.mo5004();
        switch (iMo5004) {
            case 0:
            case 1:
                return Name.REFER;
            case 2:
                return AnnotationHandler.ATTRIBUTE;
            case 3:
                return "string";
            case 4:
                return ClassTransform.FLOAT;
            case 5:
                return "dimen";
            case 6:
                return "fraction";
            case 7:
                return "dynamic-reference";
            case 8:
                return "dynamic-attribute";
            default:
                switch (iMo5004) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (iMo5004) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: " + C12534.m30763(interfaceC1454.mo5004()) + " id: " + interfaceC1454.getEntry().mo47886());
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m24585(C14587 c14587, InterfaceC1454 interfaceC1454) {
        int value = interfaceC1454.getValue();
        int iMo5004 = interfaceC1454.mo5004();
        switch (iMo5004) {
            case 0:
                return value == 1 ? "@empty" : "@null";
            case 1:
            case 7:
                return value == 0 ? "@null" : "@".concat(c14587.mo32239(interfaceC1454.mo1510().mo12858(), value));
            case 2:
            case 8:
                return value == 0 ? "?null" : "?".concat(c14587.mo32239(interfaceC1454.mo1510().mo12858(), value));
            case 3:
                return interfaceC1454.mo5008();
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return C12534.m30765(value);
            case 6:
                return C12534.m30762(value);
            default:
                switch (iMo5004) {
                    case 16:
                        return Integer.toString(value);
                    case 17:
                        return C13540.m32584(new StringBuilder("0x"), value);
                    case 18:
                        return value != 0 ? "true" : "false";
                    default:
                        switch (iMo5004) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return (value & (-16777216)) == -16777216 ? m24586(16777215 & value, 6) : m24586(value, 8);
                            default:
                                throw new IOException("Unsupported value type: " + C12534.m30763(interfaceC1454.mo5004()) + " id: " + interfaceC1454.getEntry().mo47886());
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24586(int i, int i2) {
        StringBuilder sb = new StringBuilder("#");
        String hexString = Long.toHexString(((long) i) & 4294967295L);
        int length = i2 - hexString.length();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append('0');
        }
        sb.append(hexString);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24592(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C18116 c18116) {
        if (c18116.f56383) {
            if (!interfaceC21211.mo29405()) {
                interfaceC13965.mo1291("public", "false");
            }
        } else if (interfaceC21211.mo29405()) {
            interfaceC13965.mo1291("public", "true");
        }
        if (c18116.f56384) {
            if (!interfaceC21211.mo29411()) {
                interfaceC13965.mo1291("weak", "false");
            }
        } else if (interfaceC21211.mo29411()) {
            interfaceC13965.mo1291("weak", "true");
        }
        if (c18116.f56382) {
            if (interfaceC21211.mo29408()) {
                return;
            }
            interfaceC13965.mo1291("compact", "false");
        } else if (interfaceC21211.mo29408()) {
            interfaceC13965.mo1291("compact", "true");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24588(InterfaceC13965 interfaceC13965, CharSequence charSequence) {
        if (charSequence instanceof InterfaceC3571) {
            InterfaceC3571 interfaceC3571 = (InterfaceC3571) charSequence;
            m24590(interfaceC13965, interfaceC3571.getValue(), interfaceC3571.mo10888());
        } else {
            interfaceC13965.text(charSequence.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24590(InterfaceC13965 interfaceC13965, String str, C21916[] c21916Arr) {
        if (c21916Arr == null || c21916Arr.length == 0) {
            String strReplace = str.replace("\\", "\\\\");
            if (strReplace.startsWith("@") || strReplace.startsWith("?")) {
                strReplace = "\\".concat(strReplace);
            }
            interfaceC13965.text(strReplace);
            return;
        }
        interfaceC13965.text("");
        int length = str.length();
        C21916[] c21916Arr2 = (C21916[]) C22311.stream(c21916Arr).sorted(new C6827()).toArray(new C20939());
        for (int i = 0; i <= length; i++) {
            boolean z = false;
            for (C21916 c21916 : c21916Arr2) {
                int i2 = c21916.f70168;
                if (i2 == i && i2 == c21916.f70167) {
                    m24589(interfaceC13965, c21916.f70169, false);
                    z = true;
                }
            }
            if (z) {
                interfaceC13965.text("");
            }
            for (int length2 = c21916Arr2.length - 1; length2 >= 0; length2--) {
                C21916 c21917 = c21916Arr2[length2];
                if (c21917.f70167 == i) {
                    m24589(interfaceC13965, c21917.f70169, true);
                }
            }
            for (C21916 c21918 : c21916Arr2) {
                int i3 = c21918.f70168;
                if (i3 == i && i3 != c21918.f70167) {
                    m24589(interfaceC13965, c21918.f70169, false);
                }
            }
            if (i != length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '?' || cCharAt == '@') {
                    if (i == 0) {
                        interfaceC13965.text("\\" + cCharAt);
                    } else {
                        interfaceC13965.text(String.valueOf(cCharAt));
                    }
                } else if (cCharAt == '\\') {
                    interfaceC13965.text("\\\\");
                } else {
                    interfaceC13965.text(String.valueOf(cCharAt));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24589(InterfaceC13965 interfaceC13965, String str, boolean z) {
        String strSubstring;
        int iIndexOf = str.indexOf(59);
        if (iIndexOf == -1) {
            if (z) {
                interfaceC13965.mo1290(str);
                return;
            } else {
                interfaceC13965.mo1294(str);
                return;
            }
        }
        if (z) {
            interfaceC13965.mo1290(str.substring(0, iIndexOf));
            return;
        }
        interfaceC13965.mo1294(str.substring(0, iIndexOf));
        boolean z2 = true;
        while (z2) {
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 != -1) {
                String strSubstring2 = str.substring(i, iIndexOf2);
                int i2 = iIndexOf2 + 1;
                int iIndexOf3 = str.indexOf(59, i2);
                if (iIndexOf3 != -1) {
                    strSubstring = str.substring(i2, iIndexOf3);
                } else {
                    strSubstring = str.substring(i2);
                    z2 = false;
                }
                interfaceC13965.mo1291(strSubstring2, strSubstring);
                iIndexOf = iIndexOf3;
            } else {
                z2 = false;
            }
        }
    }
}
