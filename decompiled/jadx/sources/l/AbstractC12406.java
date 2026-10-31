package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۫۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12406 extends AbstractC23747 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f37359;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f37360;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f37361;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3234 f37362;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f37363;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23634 f37364;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f37365;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f37366;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f37367;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f37368;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30574(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f';
    }

    static {
        Object[] objArr = {"script", "style", "title", "textarea", "xmp", "iframe", "noembed", "noframes", "noscript", "plaintext"};
        HashSet hashSet = new HashSet(10);
        for (int i = 0; i < 10; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f37359 = C20195.unmodifiableSet(hashSet);
    }

    public AbstractC12406(C20813 c20813) {
        super(c20813);
        this.f37362 = new C3234();
        this.f37360 = new HashMap();
        CharSequence charSequenceM47631 = c20813.m47631();
        this.f37364 = charSequenceM47631 instanceof C23634 ? (C23634) charSequenceM47631 : null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m30578() {
        return this.f37366;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        C20813.m47630();
        if (this.f37366) {
            return m52396();
        }
        if (this.f37367 != null) {
            InterfaceC23125 interfaceC23125 = this.f76890;
            if (interfaceC23125.mo6203(1) != -1) {
                int iIndex = interfaceC23125.index();
                CharSequence charSequenceM47631 = ((C20813) interfaceC23125).m47631();
                int length = (this.f37367.equals("plaintext") ? charSequenceM47631.length() : m30576(this.f37367, charSequenceM47631, iIndex)) - iIndex;
                this.f37367 = null;
                if (length > 0) {
                    C13952 c13952 = new C13952(this.f76882, 1, 0, iIndex, (iIndex + length) - 1);
                    c13952.m33393(getLine());
                    c13952.m33391(mo3967());
                    for (int i = 0; i < length; i++) {
                        ((C4264) m43460()).m12836(interfaceC23125);
                    }
                    return c13952;
                }
            }
        }
        InterfaceC0463 interfaceC0463NextToken = super.nextToken();
        C23634 c23634 = this.f37364;
        if (c23634 == null || interfaceC0463NextToken.getType() != 14 || this.f37368 != null || !c23634.m52128(interfaceC0463NextToken.mo2054(), interfaceC0463NextToken.mo2053() + 1)) {
            C3234 c3234 = this.f37362;
            if (c23634 != null && !this.f37361 && c23634.m52128(interfaceC0463NextToken.mo2054(), interfaceC0463NextToken.mo2053() + 1)) {
                boolean z = interfaceC0463NextToken.getType() != 19 || this.f37365 == null;
                if (!"annotation-xml".equals(this.f37368)) {
                }
            }
            int type = interfaceC0463NextToken.getType();
            HashMap map = this.f37360;
            if (type == 6 || type == 7) {
                this.f37368 = null;
                this.f37361 = interfaceC0463NextToken.getType() == 6;
                map.clear();
                this.f37365 = null;
                return interfaceC0463NextToken;
            }
            if (type == 10 || type == 11) {
                boolean z2 = interfaceC0463NextToken.getType() == 10;
                String str = this.f37368;
                if (str != null) {
                    if (this.f37361) {
                        c3234.m9910(str);
                    } else if (c3234.m9911(str, map, z2, null).f14735 == 0 && f37359.contains(this.f37368)) {
                        this.f37367 = this.f37368;
                    }
                }
                this.f37368 = null;
                return interfaceC0463NextToken;
            }
            if (type == 14) {
                if (this.f37368 == null) {
                    this.f37368 = m30573(interfaceC0463NextToken.getText());
                    return interfaceC0463NextToken;
                }
                String strM30573 = m30573(interfaceC0463NextToken.getText());
                this.f37365 = strM30573;
                boolean zContainsKey = map.containsKey(strM30573);
                this.f37363 = !zContainsKey;
                if (!zContainsKey) {
                    map.put(this.f37365, "");
                }
            } else if (type == 19 || type == 20) {
                if (this.f37365 != null && this.f37363) {
                    String text = interfaceC0463NextToken.getText();
                    if (interfaceC0463NextToken.getType() == 19 && text.length() >= 2) {
                        text = C15472.m36561(1, 1, text);
                    }
                    map.put(this.f37365, text);
                }
                this.f37365 = null;
                return interfaceC0463NextToken;
            }
            return interfaceC0463NextToken;
        }
        this.f37366 = true;
        return m52396();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m30577() {
        C4645 c4645M9909 = this.f37362.m9909();
        InterfaceC23125 interfaceC23125 = this.f76890;
        if (c4645M9909 == null || c4645M9909.f14735 == 0) {
            while (interfaceC23125.mo6203(1) != -1) {
                int iMo6203 = interfaceC23125.mo6203(1);
                ((C4264) m43460()).m12836(interfaceC23125);
                if (iMo6203 == 62) {
                    break;
                }
            }
            this.f76888 = 2;
            return;
        }
        while (true) {
            int iMin = 0;
            while (interfaceC23125.mo6203(1) != -1) {
                int iMo6204 = interfaceC23125.mo6203(1);
                ((C4264) m43460()).m12836(interfaceC23125);
                if (iMo6204 == 62 && iMin >= 2) {
                    return;
                }
                if (iMo6204 == 93) {
                    iMin = Math.min(2, iMin + 1);
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30572(CharSequence charSequence, String str) {
        return m30576(str, charSequence, 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066 A[PHI: r2 r3
      0x0066: PHI (r2v2 char) = (r2v1 char), (r2v4 char), (r2v4 char) binds: [B:9:0x001e, B:27:0x0057, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r3v2 int) = (r3v1 int), (r3v4 int), (r3v4 int) binds: [B:9:0x001e, B:27:0x0057, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m30576(String str, CharSequence charSequence, int i) {
        boolean zEquals = str.equals("script");
        String strConcat = "</".concat(str);
        char c = 0;
        int iMin = 0;
        while (i < charSequence.length()) {
            if ((i & 1023) == 0) {
                C20813.m47630();
            }
            if (zEquals) {
                if (c == 0 && C2732.m8477(charSequence, false, i, "<!--", 4)) {
                    i += 3;
                    c = 1;
                    iMin = 2;
                } else {
                    if (c != 0) {
                        char cCharAt = charSequence.charAt(i);
                        if (cCharAt == '-') {
                            iMin = Math.min(2, iMin + 1);
                        } else {
                            if (cCharAt == '>' && iMin == 2) {
                                c = 0;
                            }
                            iMin = 0;
                        }
                    }
                    if (c == 1 && m30575("<script", charSequence, i)) {
                        i += 6;
                        c = 2;
                    } else if (c == 2 && m30575("</script", charSequence, i)) {
                        i += 7;
                        c = 1;
                    } else if (c != 2) {
                        continue;
                    }
                    iMin = 0;
                }
            } else if (c != 2 && m30575(strConcat, charSequence, i)) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30575(String str, CharSequence charSequence, int i) {
        int length = str.length() + i;
        if (length >= charSequence.length()) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = charSequence.charAt(i + i2);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                cCharAt = (char) (cCharAt + ' ');
            }
            if (cCharAt != str.charAt(i2)) {
                return false;
            }
        }
        char cCharAt2 = charSequence.charAt(length);
        return cCharAt2 == '>' || cCharAt2 == '/' || m30574(cCharAt2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30573(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                cCharAt = (char) (cCharAt + ' ');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
