package l;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ܽ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O6MN */
/* JADX INFO: loaded from: classes5.dex */
public final class C16838 extends AbstractC5697 {
    @Override // l.AbstractC5697, l.InterfaceC10076
    /* JADX INFO: renamed from: ֫ */
    public final void mo16055(C19249 c19249) {
        AbstractC0197 abstractC0197M1341 = c19249.m1341();
        if (abstractC0197M1341 instanceof C21365) {
            AbstractC0197 abstractC0197M1342 = abstractC0197M1341.m1341();
            if (abstractC0197M1342 instanceof C12897) {
                C12897 c12897 = (C12897) abstractC0197M1342;
                Matcher matcher = C18250.f56729.matcher(c12897.m31335());
                if (matcher.matches()) {
                    boolean z = true;
                    String strGroup = matcher.group(1);
                    if (!C11003.equals(strGroup, "X") && !C11003.equals(strGroup, "x")) {
                        z = false;
                    }
                    c19249.m1346(new C13994(z));
                    c12897.m31334(matcher.group(2));
                }
            }
        }
        mo16061(c19249);
    }
}
