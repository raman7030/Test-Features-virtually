package p067l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AOM */
/* JADX INFO: loaded from: classes.dex */
public final class C23527 {
    /* JADX INFO: renamed from: ֫ */
    public static String m52306(AbstractC17043 abstractC17043) {
        try {
            C19561 c19561 = new C19561(abstractC17043);
            try {
                String strM52307 = m52307(c19561);
                c19561.close();
                return strM52307;
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52307(C19561 c19561) {
        C5738 entry = c19561.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return null;
        }
        try {
            return m52308(C16820.m38130(c19561.m44448(entry)));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m52309(C19561 c19561) {
        C5738 entry = c19561.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return false;
        }
        try {
            return m52312(C16820.m38130(c19561.m44448(entry)));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m52308(C16820 c16820) {
        try {
            XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820.m38154();
            while (true) {
                int next = xmlResourceParserC12128M38154.next();
                if (next == 1) {
                    return null;
                }
                if (next == 2) {
                    int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                    for (int i = 0; i != attributeCount; i++) {
                        StringBuilder sb = new StringBuilder();
                        String attributePrefix = xmlResourceParserC12128M38154.getAttributePrefix(i);
                        sb.append((attributePrefix == null || attributePrefix.length() == 0) ? "" : attributePrefix.concat(":"));
                        sb.append(xmlResourceParserC12128M38154.getAttributeName(i));
                        if ("package".equals(sb.toString())) {
                            return xmlResourceParserC12128M38154.getAttributeValue(i);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String[] m52311(C16820 c16820) {
        try {
            XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820.m38154();
            String attributeValue = null;
            while (true) {
                int next = xmlResourceParserC12128M38154.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int i = 0;
                    if (xmlResourceParserC12128M38154.getName().equals("manifest")) {
                        int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                        while (i < attributeCount) {
                            if (xmlResourceParserC12128M38154.getAttributeName(i).equals("package")) {
                                attributeValue = xmlResourceParserC12128M38154.getAttributeValue(i);
                            }
                            i++;
                        }
                    } else if (xmlResourceParserC12128M38154.getName().equals("application")) {
                        if (attributeValue != null) {
                            int attributeCount2 = xmlResourceParserC12128M38154.getAttributeCount();
                            while (i < attributeCount2) {
                                if (xmlResourceParserC12128M38154.getAttributeNameResource(i) == 16842755) {
                                    String attributeValue2 = xmlResourceParserC12128M38154.getAttributeValue(i);
                                    if (attributeValue2.startsWith(".")) {
                                        attributeValue2 = attributeValue + attributeValue2;
                                    }
                                    return new String[]{attributeValue, attributeValue2};
                                }
                                i++;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            return new String[]{attributeValue, null};
        } catch (Throwable unused) {
            return new String[2];
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m52310(C16820 c16820) {
        XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820.m38154();
        while (true) {
            int next = xmlResourceParserC12128M38154.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC12128M38154.getName().equals("application")) {
                int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC12128M38154.getAttributeNameResource(i) == 16844010) {
                        return !xmlResourceParserC12128M38154.getAttributeBooleanValue(i, true);
                    }
                }
                break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m52312(C16820 c16820) {
        XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820.m38154();
        while (true) {
            int next = xmlResourceParserC12128M38154.next();
            if (next == 1) {
                return false;
            }
            if (next == 2 && (xmlResourceParserC12128M38154.getName().equals("application") || xmlResourceParserC12128M38154.getName().equals(UMModuleRegister.PROCESS))) {
                int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC12128M38154.getAttributeNameResource(i) == 16844190 && xmlResourceParserC12128M38154.getAttributeBooleanValue(i, false)) {
                        return true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m52313(C16820 c16820) {
        XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820.m38154();
        while (true) {
            int next = xmlResourceParserC12128M38154.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC12128M38154.getName().equals("uses-sdk")) {
                int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC12128M38154.getAttributeNameResource(i) == 16843376) {
                        return xmlResourceParserC12128M38154.getAttributeIntValue(i, -1);
                    }
                }
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m52305(C16820 c16820) {
        XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820.m38154();
        while (true) {
            int next = xmlResourceParserC12128M38154.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC12128M38154.getName().equals("uses-sdk")) {
                int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC12128M38154.getAttributeNameResource(i) == 16843276) {
                        return xmlResourceParserC12128M38154.getAttributeIntValue(i, -1);
                    }
                }
                break;
            }
        }
        return -1;
    }
}
