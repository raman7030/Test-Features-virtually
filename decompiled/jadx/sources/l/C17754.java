package l;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X564 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17754 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f54310 = Pattern.compile("(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6150 m41581(C3328 c3328) {
        return m41579(c3328.m10184(), c3328);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6150 m41580(String str) {
        if (str == null) {
            throw new C2232("Parser key cannot be null");
        }
        return m41579(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6150 m41579(String str, C3328 c3328) {
        AbstractC16342 c3643;
        C3328 c3329;
        InterfaceC6150 c10699;
        if (f54310.matcher(str).matches()) {
            try {
                Class<?> cls = Class.forName(str);
                try {
                    c3643 = (InterfaceC6150) cls.getConstructor(null).newInstance(null);
                } catch (ClassCastException e) {
                    throw new C2232(cls.getName() + " does not implement the interface " + InterfaceC6150.class.getCanonicalName(), e);
                } catch (Exception e2) {
                    e = e2;
                    throw new C2232("Error initializing parser", e);
                } catch (LinkageError e3) {
                    e = e3;
                    throw new C2232("Error initializing parser", e);
                }
            } catch (ClassNotFoundException unused) {
                c3643 = 0;
            }
        } else {
            c3643 = 0;
        }
        if (c3643 == 0) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if (upperCase.contains("UNIX_LTRIM")) {
                c3643 = new C3643(c3328, true);
            } else if (upperCase.contains("UNIX")) {
                c3643 = new C3643(c3328, false);
            } else if (upperCase.contains("VMS")) {
                c3643 = new C19166("(.*?;[0-9]+)\\s*(\\d+)(?:/\\d+)?\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)");
                c3643.mo4051((C3328) null);
                c3643.mo4051(c3328);
            } else {
                if (!upperCase.contains("WINDOWS")) {
                    if (upperCase.contains("OS/2")) {
                        c3643 = new C8582("\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)");
                        c3643.mo4051(c3328);
                    } else if (!upperCase.contains("OS/400") && !upperCase.contains("AS/400")) {
                        if (upperCase.contains("MVS")) {
                            c3643 = new C23398();
                        } else if (upperCase.contains("NETWARE")) {
                            c3643 = new C9288("(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)");
                            c3643.mo4051(c3328);
                        } else if (upperCase.contains("MACOS PETER")) {
                            c3643 = new C6465("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)");
                            c3643.mo4051(c3328);
                        } else if (upperCase.contains("TYPE: L8")) {
                            c3643 = new C3643(c3328, false);
                        } else {
                            throw new C2232("Unknown parser type: ".concat(str));
                        }
                    } else if (c3328 != null && "OS/400".equals(c3328.m10184())) {
                        c10699 = new C15636(c3328);
                    } else {
                        c3329 = c3328 != null ? new C3328(c3328) : null;
                        c10699 = new C10699(new InterfaceC6150[]{new C15636(c3328), new C3643(c3329, c3329 != null && "UNIX_LTRIM".equals(c3329.m10184()))});
                    }
                } else if (c3328 != null && "WINDOWS".equals(c3328.m10184())) {
                    c10699 = new C20577(c3328);
                } else {
                    c3329 = c3328 != null ? new C3328(c3328) : null;
                    c10699 = new C10699(new InterfaceC6150[]{new C20577(c3328), new C3643(c3329, c3329 != null && "UNIX_LTRIM".equals(c3329.m10184()))});
                }
                c3643 = c10699;
            }
        }
        if (c3643 instanceof InterfaceC1211) {
            c3643.mo4051(c3328);
        }
        return c3643;
    }
}
