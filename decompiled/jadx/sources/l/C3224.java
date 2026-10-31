package l;

import android.util.TypedValue;
import com.umeng.analytics.pro.d;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۗۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M7AC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3224 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20158 m9893(C18090 c18090) {
        String str;
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null) {
            C20158 c20158 = new C20158();
            c20158.f65275 = false;
            c20158.f65277 = "AndroidManifest.xml not found";
            return c20158;
        }
        try {
            C15206 c15206M35978 = C15206.m35978(c18090.m42193(entry, (C19277) null));
            C20158 c20159 = new C20158();
            C12534 c12534 = c18090.getEntry("resources.arsc") == null ? new C12534() : new C12534(c18090);
            c15206M35978.m35986(c12534);
            XmlResourceParserC10269 xmlResourceParserC10269M35994 = c15206M35978.m35994();
            while (true) {
                C4635 c4635 = null;
                while (true) {
                    try {
                        int next = xmlResourceParserC10269M35994.next();
                        if (next == 1) {
                            xmlResourceParserC10269M35994.close();
                            c20159.f65275 = true;
                            return c20159;
                        }
                        if (next == 2) {
                            String name = xmlResourceParserC10269M35994.getName();
                            if ("manifest".equals(name)) {
                                c20159.f65279 = m9892(xmlResourceParserC10269M35994, "package", c12534);
                                c20159.f65272 = m9892(xmlResourceParserC10269M35994, "versionName", c12534);
                                c20159.f65278 = m9892(xmlResourceParserC10269M35994, "versionCode", c12534);
                            } else if ("uses-sdk".equals(name)) {
                                c20159.f65274 = m9892(xmlResourceParserC10269M35994, "minSdkVersion", c12534);
                                c20159.f65271 = m9892(xmlResourceParserC10269M35994, "targetSdkVersion", c12534);
                            } else if (!"uses-permission".equals(name)) {
                                if ("application".equals(name)) {
                                    m9894(c20159, xmlResourceParserC10269M35994, c12534);
                                } else if ("activity".equals(name) || "activity-alias".equals(name)) {
                                    String str2 = c20159.f65279;
                                    String strM9892 = m9892(xmlResourceParserC10269M35994, "name", c12534);
                                    String strM9893 = m9892(xmlResourceParserC10269M35994, "targetActivity", c12534);
                                    if ("activity-alias".equals(name) && strM9893 != null && !strM9893.isEmpty()) {
                                        strM9892 = strM9893;
                                    }
                                    if (strM9892 != null && !strM9892.isEmpty() && str2 != null && !str2.isEmpty()) {
                                        if (strM9892.charAt(0) == '.') {
                                            strM9892 = str2.concat(strM9892);
                                        } else if (strM9892.indexOf(46) < 0) {
                                            strM9892 = C22870.m50967(str2, ".", strM9892);
                                        }
                                    }
                                    c4635 = new C4635(strM9892);
                                } else if (c4635 != null && "intent-filter".equals(name)) {
                                    c4635.f14720 = true;
                                    c4635.f14719 = false;
                                    c4635.f14718 = false;
                                } else if (!"service".equals(name) && !"receiver".equals(name) && !d.M.equals(name)) {
                                    if (c4635 != null && "action".equals(name)) {
                                        String strM9894 = m9892(xmlResourceParserC10269M35994, "name", c12534);
                                        if (c4635.f14720) {
                                            c4635.f14719 = "android.intent.action.MAIN".equals(strM9894) | c4635.f14719;
                                        }
                                    } else if (c4635 != null && "category".equals(name)) {
                                        String strM9895 = m9892(xmlResourceParserC10269M35994, "name", c12534);
                                        if (c4635.f14720) {
                                            c4635.f14718 = "android.intent.category.LAUNCHER".equals(strM9895) | c4635.f14718;
                                        }
                                    }
                                }
                            }
                        } else if (next == 3) {
                            String name2 = xmlResourceParserC10269M35994.getName();
                            if (c4635 != null && "intent-filter".equals(name2)) {
                                if (c4635.f14720 && c4635.f14719 && c4635.f14718) {
                                    c4635.f14722 = true;
                                }
                                c4635.f14720 = false;
                                c4635.f14719 = false;
                                c4635.f14718 = false;
                            } else if (c4635 != null && ("activity".equals(name2) || "activity-alias".equals(name2))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        try {
                            xmlResourceParserC10269M35994.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c4635.f14722 && (str = c4635.f14721) != null) {
                    c20159.f65276.add(str);
                }
            }
        } catch (Exception e) {
            String message = e.getMessage() == null ? "Failed to parse manifest" : e.getMessage();
            C20158 c201510 = new C20158();
            c201510.f65275 = false;
            c201510.f65277 = message;
            return c201510;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9894(C20158 c20158, XmlResourceParserC10269 xmlResourceParserC10269, C12534 c12534) {
        CharSequence charSequence;
        for (int i = 0; i < xmlResourceParserC10269.getAttributeCount(); i++) {
            if (AnnotatedPrivateKey.LABEL.equals(xmlResourceParserC10269.getAttributeName(i))) {
                int i2 = C12396.f37328;
                C11418 c11418 = new C11418();
                C12396.m30555(c11418, xmlResourceParserC10269.m26023(i), xmlResourceParserC10269.m26020(i), xmlResourceParserC10269.getAttributeNamespace(i), xmlResourceParserC10269.getAttributeName(i), xmlResourceParserC10269.getAttributeNameResource(i), xmlResourceParserC10269.getAttributeValue(i), c12534);
                c20158.f65273 = c11418.toString();
                int iM26023 = xmlResourceParserC10269.m26023(i);
                int iM26020 = xmlResourceParserC10269.m26020(i);
                String attributeValue = xmlResourceParserC10269.getAttributeValue(i);
                String str = null;
                if (iM26023 != 3) {
                    if (iM26023 == 1 && iM26020 != 0) {
                        try {
                            TypedValue typedValue = new TypedValue();
                            c12534.m30770(iM26020, typedValue, true);
                            if (typedValue.type == 3 && (charSequence = typedValue.string) != null && (attributeValue = charSequence.toString()) != null && !attributeValue.trim().isEmpty()) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (str != null) {
                        c20158.f65270 = str;
                        return;
                    }
                    return;
                }
                if (attributeValue == null || attributeValue.trim().isEmpty()) {
                    attributeValue = null;
                }
                str = attributeValue;
                if (str != null) {
                    c20158.f65270 = str;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9892(XmlResourceParserC10269 xmlResourceParserC10269, String str, C12534 c12534) {
        for (int i = 0; i < xmlResourceParserC10269.getAttributeCount(); i++) {
            if (str.equals(xmlResourceParserC10269.getAttributeName(i))) {
                int i2 = C12396.f37328;
                C11418 c11418 = new C11418();
                C12396.m30555(c11418, xmlResourceParserC10269.m26023(i), xmlResourceParserC10269.m26020(i), xmlResourceParserC10269.getAttributeNamespace(i), xmlResourceParserC10269.getAttributeName(i), xmlResourceParserC10269.getAttributeNameResource(i), xmlResourceParserC10269.getAttributeValue(i), c12534);
                return c11418.toString();
            }
        }
        return null;
    }
}
