package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AOM */
/* JADX INFO: loaded from: classes.dex */
public final class C22263 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49978(AbstractC15440 abstractC15440) {
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                String strM49979 = m49979(c18090);
                c18090.close();
                return strM49979;
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49979(C18090 c18090) {
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return null;
        }
        try {
            return m49980(C15206.m35970(c18090.m42189(entry)));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49981(C18090 c18090) {
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return false;
        }
        try {
            return m49984(C15206.m35970(c18090.m42189(entry)));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m49980(C15206 c15206) {
        try {
            XmlResourceParserC10269 xmlResourceParserC10269M35994 = c15206.m35994();
            while (true) {
                int next = xmlResourceParserC10269M35994.next();
                if (next == 1) {
                    return null;
                }
                if (next == 2) {
                    int attributeCount = xmlResourceParserC10269M35994.getAttributeCount();
                    for (int i = 0; i != attributeCount; i++) {
                        StringBuilder sb = new StringBuilder();
                        String attributePrefix = xmlResourceParserC10269M35994.getAttributePrefix(i);
                        sb.append((attributePrefix == null || attributePrefix.length() == 0) ? "" : attributePrefix.concat(":"));
                        sb.append(xmlResourceParserC10269M35994.getAttributeName(i));
                        if ("package".equals(sb.toString())) {
                            return xmlResourceParserC10269M35994.getAttributeValue(i);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String[] m49983(C15206 c15206) {
        try {
            XmlResourceParserC10269 xmlResourceParserC10269M35994 = c15206.m35994();
            String attributeValue = null;
            while (true) {
                int next = xmlResourceParserC10269M35994.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int i = 0;
                    if (xmlResourceParserC10269M35994.getName().equals("manifest")) {
                        int attributeCount = xmlResourceParserC10269M35994.getAttributeCount();
                        while (i < attributeCount) {
                            if (xmlResourceParserC10269M35994.getAttributeName(i).equals("package")) {
                                attributeValue = xmlResourceParserC10269M35994.getAttributeValue(i);
                            }
                            i++;
                        }
                    } else if (xmlResourceParserC10269M35994.getName().equals("application")) {
                        if (attributeValue != null) {
                            int attributeCount2 = xmlResourceParserC10269M35994.getAttributeCount();
                            while (i < attributeCount2) {
                                if (xmlResourceParserC10269M35994.getAttributeNameResource(i) == 16842755) {
                                    String attributeValue2 = xmlResourceParserC10269M35994.getAttributeValue(i);
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m49982(C15206 c15206) {
        XmlResourceParserC10269 xmlResourceParserC10269M35994 = c15206.m35994();
        while (true) {
            int next = xmlResourceParserC10269M35994.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC10269M35994.getName().equals("application")) {
                int attributeCount = xmlResourceParserC10269M35994.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC10269M35994.getAttributeNameResource(i) == 16844010) {
                        return !xmlResourceParserC10269M35994.getAttributeBooleanValue(i, true);
                    }
                }
                break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m49984(C15206 c15206) {
        XmlResourceParserC10269 xmlResourceParserC10269M35994 = c15206.m35994();
        while (true) {
            int next = xmlResourceParserC10269M35994.next();
            if (next == 1) {
                return false;
            }
            if (next == 2 && (xmlResourceParserC10269M35994.getName().equals("application") || xmlResourceParserC10269M35994.getName().equals(UMModuleRegister.PROCESS))) {
                int attributeCount = xmlResourceParserC10269M35994.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC10269M35994.getAttributeNameResource(i) == 16844190 && xmlResourceParserC10269M35994.getAttributeBooleanValue(i, false)) {
                        return true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m49985(C15206 c15206) {
        XmlResourceParserC10269 xmlResourceParserC10269M35994 = c15206.m35994();
        while (true) {
            int next = xmlResourceParserC10269M35994.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC10269M35994.getName().equals("uses-sdk")) {
                int attributeCount = xmlResourceParserC10269M35994.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC10269M35994.getAttributeNameResource(i) == 16843376) {
                        return xmlResourceParserC10269M35994.getAttributeIntValue(i, -1);
                    }
                }
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49977(C15206 c15206) {
        XmlResourceParserC10269 xmlResourceParserC10269M35994 = c15206.m35994();
        while (true) {
            int next = xmlResourceParserC10269M35994.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && xmlResourceParserC10269M35994.getName().equals("uses-sdk")) {
                int attributeCount = xmlResourceParserC10269M35994.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (xmlResourceParserC10269M35994.getAttributeNameResource(i) == 16843276) {
                        return xmlResourceParserC10269M35994.getAttributeIntValue(i, -1);
                    }
                }
                break;
            }
        }
        return -1;
    }
}
