package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.stream.DocumentReader;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1ES */
/* JADX INFO: loaded from: classes3.dex */
public final class C11540 {

    /* JADX INFO: renamed from: ֫ */
    public static final C0977 f32183;

    /* JADX INFO: renamed from: ۧ */
    public static final C18244 f32184 = new C18244();

    /* JADX INFO: renamed from: ܽ */
    public static final C20928 f32185 = new C20928();

    /* JADX INFO: renamed from: ᩳ */
    public static final C0977 f32186;

    static {
        C0977 c0977 = new C0977();
        f32183 = c0977;
        C0977 c0978 = new C0977();
        f32186 = c0978;
        c0977.put("attr", new C9607());
        c0977.put("^attr-private", new C9607());
        c0977.put("array", new C24359());
        c0977.put("style", new C7516());
        c0977.put("plurals", new C20257());
        c0978.put("bool", new C4163());
        c0978.put("dimen", new C18915());
        c0978.put("fraction", new C10869());
        c0978.put("id", new C17573());
        c0978.put("integer", new C4834());
        c0978.put("string", new C2821());
        c0978.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C12881());
        C6175 c6175 = new C6175();
        c0978.put("anim", c6175);
        c0978.put("animator", c6175);
        c0978.put("drawable", c6175);
        c0978.put("interpolator", c6175);
        c0978.put("layout", c6175);
        c0978.put("transition", c6175);
        c0978.put("menu", c6175);
        c0978.put("mipmap", c6175);
        c0978.put("raw", c6175);
        c0978.put(DocumentReader.RESERVED, c6175);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26605(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C16232 c16232, C19586 c19586) {
        InterfaceC24950 interfaceC24950;
        String typeName = interfaceC22528.getType().getTypeName();
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
        if (interfaceC22528.mo31474()) {
            interfaceC24950 = (InterfaceC24950) f32183.getOrDefault(typeName, f32184);
        } else {
            interfaceC24950 = (InterfaceC24950) f32186.getOrDefault(typeName, f32185);
        }
        interfaceC24950.mo17410(interfaceC15641, interfaceC22528, c16232, c19586);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26601(InterfaceC3751 interfaceC3751) throws IOException {
        int iMo7247 = interfaceC3751.mo7247();
        switch (iMo7247) {
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
                switch (iMo7247) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (iMo7247) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: " + C14281.m32835(interfaceC3751.mo7247()) + " id: " + interfaceC3751.getEntry().mo50216());
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m26599(C16232 c16232, InterfaceC3751 interfaceC3751) {
        int value = interfaceC3751.getValue();
        int iMo7247 = interfaceC3751.mo7247();
        switch (iMo7247) {
            case 0:
                return value == 1 ? "@empty" : "@null";
            case 1:
            case 7:
                return value == 0 ? "@null" : "@".concat(c16232.mo34338(interfaceC3751.mo3908().mo14722(), value));
            case 2:
            case 8:
                return value == 0 ? "?null" : "?".concat(c16232.mo34338(interfaceC3751.mo3908().mo14722(), value));
            case 3:
                return interfaceC3751.mo7251();
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return C14281.m32837(value);
            case 6:
                return C14281.m32834(value);
            default:
                switch (iMo7247) {
                    case 16:
                        return Integer.toString(value);
                    case 17:
                        return C1514.m34687(new StringBuilder("0x"), value);
                    case 18:
                        return value != 0 ? "true" : "false";
                    default:
                        switch (iMo7247) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return (value & (-16777216)) == -16777216 ? m26600(16777215 & value, 6) : m26600(value, 8);
                            default:
                                throw new IOException("Unsupported value type: " + C14281.m32835(interfaceC3751.mo7247()) + " id: " + interfaceC3751.getEntry().mo50216());
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26600(int i, int i2) {
        StringBuilder sb = new StringBuilder("#");
        String hexString = Long.toHexString(((long) i) & 4294967295L);
        int length = i2 - hexString.length();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append('0');
        }
        sb.append(hexString);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26606(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C19586 c19586) {
        if (c19586.f59596) {
            if (!interfaceC22528.mo31467()) {
                interfaceC15641.mo3699("public", "false");
            }
        } else if (interfaceC22528.mo31467()) {
            interfaceC15641.mo3699("public", "true");
        }
        if (c19586.f59597) {
            if (!interfaceC22528.mo31473()) {
                interfaceC15641.mo3699("weak", "false");
            }
        } else if (interfaceC22528.mo31473()) {
            interfaceC15641.mo3699("weak", "true");
        }
        if (c19586.f59595) {
            if (interfaceC22528.mo31470()) {
                return;
            }
            interfaceC15641.mo3699("compact", "false");
        } else if (interfaceC22528.mo31470()) {
            interfaceC15641.mo3699("compact", "true");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26602(InterfaceC15641 interfaceC15641, CharSequence charSequence) {
        if (charSequence instanceof InterfaceC5763) {
            InterfaceC5763 interfaceC5763 = (InterfaceC5763) charSequence;
            m26604(interfaceC15641, interfaceC5763.getValue(), interfaceC5763.mo12868());
        } else {
            interfaceC15641.text(charSequence.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26604(InterfaceC15641 interfaceC15641, String str, C23198[] c23198Arr) {
        if (c23198Arr == null || c23198Arr.length == 0) {
            String strReplace = str.replace("\\", "\\\\");
            if (strReplace.startsWith("@") || strReplace.startsWith("?")) {
                strReplace = "\\".concat(strReplace);
            }
            interfaceC15641.text(strReplace);
            return;
        }
        interfaceC15641.text("");
        int length = str.length();
        C23198[] c23198Arr2 = (C23198[]) C23573.stream(c23198Arr).sorted(new C8857()).toArray(new C22269());
        for (int i = 0; i <= length; i++) {
            boolean z = false;
            for (C23198 c23198 : c23198Arr2) {
                int i2 = c23198.f72882;
                if (i2 == i && i2 == c23198.f72881) {
                    m26603(interfaceC15641, c23198.f72883, false);
                    z = true;
                }
            }
            if (z) {
                interfaceC15641.text("");
            }
            for (int length2 = c23198Arr2.length - 1; length2 >= 0; length2--) {
                C23198 c23199 = c23198Arr2[length2];
                if (c23199.f72881 == i) {
                    m26603(interfaceC15641, c23199.f72883, true);
                }
            }
            for (C23198 c231910 : c23198Arr2) {
                int i3 = c231910.f72882;
                if (i3 == i && i3 != c231910.f72881) {
                    m26603(interfaceC15641, c231910.f72883, false);
                }
            }
            if (i != length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '?' || cCharAt == '@') {
                    if (i == 0) {
                        interfaceC15641.text("\\" + cCharAt);
                    } else {
                        interfaceC15641.text(String.valueOf(cCharAt));
                    }
                } else if (cCharAt == '\\') {
                    interfaceC15641.text("\\\\");
                } else {
                    interfaceC15641.text(String.valueOf(cCharAt));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26603(InterfaceC15641 interfaceC15641, String str, boolean z) {
        String strSubstring;
        int iIndexOf = str.indexOf(59);
        if (iIndexOf == -1) {
            if (z) {
                interfaceC15641.mo3698(str);
                return;
            } else {
                interfaceC15641.mo3702(str);
                return;
            }
        }
        if (z) {
            interfaceC15641.mo3698(str.substring(0, iIndexOf));
            return;
        }
        interfaceC15641.mo3702(str.substring(0, iIndexOf));
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
                interfaceC15641.mo3699(strSubstring2, strSubstring);
                iIndexOf = iIndexOf3;
            } else {
                z2 = false;
            }
        }
    }
}
