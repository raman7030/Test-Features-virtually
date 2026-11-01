package p067l;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ܽ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O6MN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18371 extends AbstractC7782 {
    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17974(C20662 c20662) {
        AbstractC2555 abstractC2555M3754 = c20662.m3754();
        if (abstractC2555M3754 instanceof C22673) {
            AbstractC2555 abstractC2555M3755 = abstractC2555M3754.m3754();
            if (abstractC2555M3755 instanceof C14625) {
                C14625 c14625 = (C14625) abstractC2555M3755;
                Matcher matcher = C19713.f59946.matcher(c14625.m33421());
                if (matcher.matches()) {
                    boolean z = true;
                    String strGroup = matcher.group(1);
                    if (!C12826.equals(strGroup, "X") && !C12826.equals(strGroup, "x")) {
                        z = false;
                    }
                    c20662.m3759(new C15668(z));
                    c14625.m33420(matcher.group(2));
                }
            }
        }
        mo17980(c20662);
    }
}
