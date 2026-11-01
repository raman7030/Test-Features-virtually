package p067l;

import android.util.TypedValue;
import com.umeng.analytics.pro.C0708d;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۗۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M7AC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5433 {
    /* JADX INFO: renamed from: ֫ */
    public static C21527 m11941(C19561 c19561) {
        String str;
        C5738 entry = c19561.getEntry("AndroidManifest.xml");
        if (entry == null) {
            C21527 c21527 = new C21527();
            c21527.f67918 = false;
            c21527.f67920 = "AndroidManifest.xml not found";
            return c21527;
        }
        try {
            C16820 c16820M38138 = C16820.m38138(c19561.m44452(entry, (C20689) null));
            C21527 c21528 = new C21527();
            C14281 c14281 = c19561.getEntry("resources.arsc") == null ? new C14281() : new C14281(c19561);
            c16820M38138.m38146(c14281);
            XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820M38138.m38154();
            while (true) {
                C6774 c6774 = null;
                while (true) {
                    try {
                        int next = xmlResourceParserC12128M38154.next();
                        if (next == 1) {
                            xmlResourceParserC12128M38154.close();
                            c21528.f67918 = true;
                            return c21528;
                        }
                        if (next == 2) {
                            String name = xmlResourceParserC12128M38154.getName();
                            if ("manifest".equals(name)) {
                                c21528.f67922 = m11940(xmlResourceParserC12128M38154, "package", c14281);
                                c21528.f67915 = m11940(xmlResourceParserC12128M38154, "versionName", c14281);
                                c21528.f67921 = m11940(xmlResourceParserC12128M38154, "versionCode", c14281);
                            } else if ("uses-sdk".equals(name)) {
                                c21528.f67917 = m11940(xmlResourceParserC12128M38154, "minSdkVersion", c14281);
                                c21528.f67914 = m11940(xmlResourceParserC12128M38154, "targetSdkVersion", c14281);
                            } else if (!"uses-permission".equals(name)) {
                                if ("application".equals(name)) {
                                    m11942(c21528, xmlResourceParserC12128M38154, c14281);
                                } else if ("activity".equals(name) || "activity-alias".equals(name)) {
                                    String str2 = c21528.f67922;
                                    String strM11940 = m11940(xmlResourceParserC12128M38154, "name", c14281);
                                    String strM11941 = m11940(xmlResourceParserC12128M38154, "targetActivity", c14281);
                                    if ("activity-alias".equals(name) && strM11941 != null && !strM11941.isEmpty()) {
                                        strM11940 = strM11941;
                                    }
                                    if (strM11940 != null && !strM11940.isEmpty() && str2 != null && !str2.isEmpty()) {
                                        if (strM11940.charAt(0) == '.') {
                                            strM11940 = str2.concat(strM11940);
                                        } else if (strM11940.indexOf(46) < 0) {
                                            strM11940 = C24104.m53357(str2, ".", strM11940);
                                        }
                                    }
                                    c6774 = new C6774(strM11940);
                                } else if (c6774 != null && "intent-filter".equals(name)) {
                                    c6774.f17548 = true;
                                    c6774.f17547 = false;
                                    c6774.f17546 = false;
                                } else if (!"service".equals(name) && !"receiver".equals(name) && !C0708d.f2597M.equals(name)) {
                                    if (c6774 != null && "action".equals(name)) {
                                        String strM11942 = m11940(xmlResourceParserC12128M38154, "name", c14281);
                                        if (c6774.f17548) {
                                            c6774.f17547 = "android.intent.action.MAIN".equals(strM11942) | c6774.f17547;
                                        }
                                    } else if (c6774 != null && "category".equals(name)) {
                                        String strM11943 = m11940(xmlResourceParserC12128M38154, "name", c14281);
                                        if (c6774.f17548) {
                                            c6774.f17546 = "android.intent.category.LAUNCHER".equals(strM11943) | c6774.f17546;
                                        }
                                    }
                                }
                            }
                        } else if (next == 3) {
                            String name2 = xmlResourceParserC12128M38154.getName();
                            if (c6774 != null && "intent-filter".equals(name2)) {
                                if (c6774.f17548 && c6774.f17547 && c6774.f17546) {
                                    c6774.f17550 = true;
                                }
                                c6774.f17548 = false;
                                c6774.f17547 = false;
                                c6774.f17546 = false;
                            } else if (c6774 != null && ("activity".equals(name2) || "activity-alias".equals(name2))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        try {
                            xmlResourceParserC12128M38154.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c6774.f17550 && (str = c6774.f17549) != null) {
                    c21528.f67919.add(str);
                }
            }
        } catch (Exception e) {
            String message = e.getMessage() == null ? "Failed to parse manifest" : e.getMessage();
            C21527 c21529 = new C21527();
            c21529.f67918 = false;
            c21529.f67920 = message;
            return c21529;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static void m11942(C21527 c21527, XmlResourceParserC12128 xmlResourceParserC12128, C14281 c14281) {
        CharSequence charSequence;
        for (int i = 0; i < xmlResourceParserC12128.getAttributeCount(); i++) {
            if (AnnotatedPrivateKey.LABEL.equals(xmlResourceParserC12128.getAttributeName(i))) {
                int i2 = C14150.f40344;
                C13220 c13220 = new C13220();
                C14150.m32619(c13220, xmlResourceParserC12128.m28045(i), xmlResourceParserC12128.m28042(i), xmlResourceParserC12128.getAttributeNamespace(i), xmlResourceParserC12128.getAttributeName(i), xmlResourceParserC12128.getAttributeNameResource(i), xmlResourceParserC12128.getAttributeValue(i), c14281);
                c21527.f67916 = c13220.toString();
                int iM28045 = xmlResourceParserC12128.m28045(i);
                int iM28042 = xmlResourceParserC12128.m28042(i);
                String attributeValue = xmlResourceParserC12128.getAttributeValue(i);
                String str = null;
                if (iM28045 != 3) {
                    if (iM28045 == 1 && iM28042 != 0) {
                        try {
                            TypedValue typedValue = new TypedValue();
                            c14281.m32842(iM28042, typedValue, true);
                            if (typedValue.type == 3 && (charSequence = typedValue.string) != null && (attributeValue = charSequence.toString()) != null && !attributeValue.trim().isEmpty()) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (str != null) {
                        c21527.f67913 = str;
                        return;
                    }
                    return;
                }
                if (attributeValue == null || attributeValue.trim().isEmpty()) {
                    attributeValue = null;
                }
                str = attributeValue;
                if (str != null) {
                    c21527.f67913 = str;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11940(XmlResourceParserC12128 xmlResourceParserC12128, String str, C14281 c14281) {
        for (int i = 0; i < xmlResourceParserC12128.getAttributeCount(); i++) {
            if (str.equals(xmlResourceParserC12128.getAttributeName(i))) {
                int i2 = C14150.f40344;
                C13220 c13220 = new C13220();
                C14150.m32619(c13220, xmlResourceParserC12128.m28045(i), xmlResourceParserC12128.m28042(i), xmlResourceParserC12128.getAttributeNamespace(i), xmlResourceParserC12128.getAttributeName(i), xmlResourceParserC12128.getAttributeNameResource(i), xmlResourceParserC12128.getAttributeValue(i), c14281);
                return c13220.toString();
            }
        }
        return null;
    }
}
