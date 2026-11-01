package p067l;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X564 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19241 {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f57504 = Pattern.compile("(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*");

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8213 m43826(C5531 c5531) {
        return m43824(c5531.m12220(), c5531);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8213 m43825(String str) {
        if (str == null) {
            throw new C4489("Parser key cannot be null");
        }
        return m43824(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8213 m43824(String str, C5531 c5531) {
        AbstractC17899 c5830;
        C5531 c5532;
        InterfaceC8213 c12536;
        if (f57504.matcher(str).matches()) {
            try {
                Class<?> cls = Class.forName(str);
                try {
                    c5830 = (InterfaceC8213) cls.getConstructor(null).newInstance(null);
                } catch (ClassCastException e) {
                    throw new C4489(cls.getName() + " does not implement the interface " + InterfaceC8213.class.getCanonicalName(), e);
                } catch (Exception e2) {
                    e = e2;
                    throw new C4489("Error initializing parser", e);
                } catch (LinkageError e3) {
                    e = e3;
                    throw new C4489("Error initializing parser", e);
                }
            } catch (ClassNotFoundException unused) {
                c5830 = 0;
            }
        } else {
            c5830 = 0;
        }
        if (c5830 == 0) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if (upperCase.contains("UNIX_LTRIM")) {
                c5830 = new C5830(c5531, true);
            } else if (upperCase.contains("UNIX")) {
                c5830 = new C5830(c5531, false);
            } else if (upperCase.contains("VMS")) {
                c5830 = new C20583("(.*?;[0-9]+)\\s*(\\d+)(?:/\\d+)?\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)");
                c5830.mo6295((C5531) null);
                c5830.mo6295(c5531);
            } else {
                if (!upperCase.contains("WINDOWS")) {
                    if (upperCase.contains("OS/2")) {
                        c5830 = new C10524("\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)");
                        c5830.mo6295(c5531);
                    } else if (!upperCase.contains("OS/400") && !upperCase.contains("AS/400")) {
                        if (upperCase.contains("MVS")) {
                            c5830 = new C24605();
                        } else if (upperCase.contains("NETWARE")) {
                            c5830 = new C11195("(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)");
                            c5830.mo6295(c5531);
                        } else if (upperCase.contains("MACOS PETER")) {
                            c5830 = new C8512("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)");
                            c5830.mo6295(c5531);
                        } else if (upperCase.contains("TYPE: L8")) {
                            c5830 = new C5830(c5531, false);
                        } else {
                            throw new C4489("Unknown parser type: ".concat(str));
                        }
                    } else if (c5531 != null && "OS/400".equals(c5531.m12220())) {
                        c12536 = new C17228(c5531);
                    } else {
                        c5532 = c5531 != null ? new C5531(c5531) : null;
                        c12536 = new C12536(new InterfaceC8213[]{new C17228(c5531), new C5830(c5532, c5532 != null && "UNIX_LTRIM".equals(c5532.m12220()))});
                    }
                } else if (c5531 != null && "WINDOWS".equals(c5531.m12220())) {
                    c12536 = new C21924(c5531);
                } else {
                    c5532 = c5531 != null ? new C5531(c5531) : null;
                    c12536 = new C12536(new InterfaceC8213[]{new C21924(c5531), new C5830(c5532, c5532 != null && "UNIX_LTRIM".equals(c5532.m12220()))});
                }
                c5830 = c12536;
            }
        }
        if (c5830 instanceof InterfaceC3519) {
            c5830.mo6295(c5531);
        }
        return c5830;
    }
}
