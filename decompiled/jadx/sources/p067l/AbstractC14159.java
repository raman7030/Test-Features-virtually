package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۫۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14159 extends AbstractC24937 {

    /* JADX INFO: renamed from: ۙ */
    public static final Set f40374;

    /* JADX INFO: renamed from: ֡ */
    public final HashMap f40375;

    /* JADX INFO: renamed from: ֨ */
    public boolean f40376;

    /* JADX INFO: renamed from: ۚ */
    public final C5442 f40377;

    /* JADX INFO: renamed from: ۠ */
    public boolean f40378;

    /* JADX INFO: renamed from: ܶ */
    public final C24830 f40379;

    /* JADX INFO: renamed from: ᩵ */
    public String f40380;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f40381;

    /* JADX INFO: renamed from: ᩸ */
    public String f40382;

    /* JADX INFO: renamed from: ᩹ */
    public String f40383;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m32638(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f';
    }

    static {
        Object[] objArr = {"script", "style", "title", "textarea", "xmp", "iframe", "noembed", "noframes", "noscript", "plaintext"};
        HashSet hashSet = new HashSet(10);
        for (int i = 0; i < 10; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f40374 = C21562.unmodifiableSet(hashSet);
    }

    public AbstractC14159(C22149 c22149) {
        super(c22149);
        this.f40377 = new C5442();
        this.f40375 = new HashMap();
        CharSequence charSequenceM49959 = c22149.m49959();
        this.f40379 = charSequenceM49959 instanceof C24830 ? (C24830) charSequenceM49959 : null;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m32642() {
        return this.f40381;
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
    @Override // p067l.AbstractC24937, p067l.InterfaceC3479
    public final InterfaceC2808 nextToken() {
        C22149.m49958();
        if (this.f40381) {
            return m54805();
        }
        if (this.f40382 != null) {
            InterfaceC24346 interfaceC24346 = this.f79642;
            if (interfaceC24346.mo8405(1) != -1) {
                int iIndex = interfaceC24346.index();
                CharSequence charSequenceM49959 = ((C22149) interfaceC24346).m49959();
                int length = (this.f40382.equals("plaintext") ? charSequenceM49959.length() : m32640(this.f40382, charSequenceM49959, iIndex)) - iIndex;
                this.f40382 = null;
                if (length > 0) {
                    C15628 c15628 = new C15628(this.f79634, 1, 0, iIndex, (iIndex + length) - 1);
                    c15628.m35512(getLine());
                    c15628.m35510(mo6209());
                    for (int i = 0; i < length; i++) {
                        ((C6421) m45729()).m14700(interfaceC24346);
                    }
                    return c15628;
                }
            }
        }
        InterfaceC2808 interfaceC2808NextToken = super.nextToken();
        C24830 c24830 = this.f40379;
        if (c24830 == null || interfaceC2808NextToken.getType() != 14 || this.f40383 != null || !c24830.m54531(interfaceC2808NextToken.mo4434(), interfaceC2808NextToken.mo4433() + 1)) {
            C5442 c5442 = this.f40377;
            if (c24830 != null && !this.f40376 && c24830.m54531(interfaceC2808NextToken.mo4434(), interfaceC2808NextToken.mo4433() + 1)) {
                boolean z = interfaceC2808NextToken.getType() != 19 || this.f40380 == null;
                if (!"annotation-xml".equals(this.f40383)) {
                }
            }
            int type = interfaceC2808NextToken.getType();
            HashMap map = this.f40375;
            if (type == 6 || type == 7) {
                this.f40383 = null;
                this.f40376 = interfaceC2808NextToken.getType() == 6;
                map.clear();
                this.f40380 = null;
                return interfaceC2808NextToken;
            }
            if (type == 10 || type == 11) {
                boolean z2 = interfaceC2808NextToken.getType() == 10;
                String str = this.f40383;
                if (str != null) {
                    if (this.f40376) {
                        c5442.m11958(str);
                    } else if (c5442.m11959(str, map, z2, null).f17563 == 0 && f40374.contains(this.f40383)) {
                        this.f40382 = this.f40383;
                    }
                }
                this.f40383 = null;
                return interfaceC2808NextToken;
            }
            if (type == 14) {
                if (this.f40383 == null) {
                    this.f40383 = m32637(interfaceC2808NextToken.getText());
                    return interfaceC2808NextToken;
                }
                String strM32637 = m32637(interfaceC2808NextToken.getText());
                this.f40380 = strM32637;
                boolean zContainsKey = map.containsKey(strM32637);
                this.f40378 = !zContainsKey;
                if (!zContainsKey) {
                    map.put(this.f40380, "");
                }
            } else if (type == 19 || type == 20) {
                if (this.f40380 != null && this.f40378) {
                    String text = interfaceC2808NextToken.getText();
                    if (interfaceC2808NextToken.getType() == 19 && text.length() >= 2) {
                        text = C17073.m38720(1, 1, text);
                    }
                    map.put(this.f40380, text);
                }
                this.f40380 = null;
                return interfaceC2808NextToken;
            }
            return interfaceC2808NextToken;
        }
        this.f40381 = true;
        return m54805();
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m32641() {
        C6783 c6783M11957 = this.f40377.m11957();
        InterfaceC24346 interfaceC24346 = this.f79642;
        if (c6783M11957 == null || c6783M11957.f17563 == 0) {
            while (interfaceC24346.mo8405(1) != -1) {
                int iMo8405 = interfaceC24346.mo8405(1);
                ((C6421) m45729()).m14700(interfaceC24346);
                if (iMo8405 == 62) {
                    break;
                }
            }
            this.f79640 = 2;
            return;
        }
        while (true) {
            int iMin = 0;
            while (interfaceC24346.mo8405(1) != -1) {
                int iMo8406 = interfaceC24346.mo8405(1);
                ((C6421) m45729()).m14700(interfaceC24346);
                if (iMo8406 == 62 && iMin >= 2) {
                    return;
                }
                if (iMo8406 == 93) {
                    iMin = Math.min(2, iMin + 1);
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m32636(CharSequence charSequence, String str) {
        return m32640(str, charSequence, 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066 A[PHI: r2 r3
      0x0066: PHI (r2v2 char) = (r2v1 char), (r2v4 char), (r2v4 char) binds: [B:9:0x001e, B:27:0x0057, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r3v2 int) = (r3v1 int), (r3v4 int), (r3v4 int) binds: [B:9:0x001e, B:27:0x0057, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static int m32640(String str, CharSequence charSequence, int i) {
        boolean zEquals = str.equals("script");
        String strConcat = "</".concat(str);
        char c = 0;
        int iMin = 0;
        while (i < charSequence.length()) {
            if ((i & 1023) == 0) {
                C22149.m49958();
            }
            if (zEquals) {
                if (c == 0 && C4965.m10524(charSequence, false, i, "<!--", 4)) {
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
                    if (c == 1 && m32639("<script", charSequence, i)) {
                        i += 6;
                        c = 2;
                    } else if (c == 2 && m32639("</script", charSequence, i)) {
                        i += 7;
                        c = 1;
                    } else if (c != 2) {
                        continue;
                    }
                    iMin = 0;
                }
            } else if (c != 2 && m32639(strConcat, charSequence, i)) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m32639(String str, CharSequence charSequence, int i) {
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
        return cCharAt2 == '>' || cCharAt2 == '/' || m32638(cCharAt2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m32637(String str) {
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
