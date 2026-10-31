package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes3.dex */
public final class C12135 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f36234;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36235;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f36236;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6778 f36237;

    public C12135(C6778 c6778) {
        this.f36237 = c6778;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29559() {
        this.f36234 = null;
        this.f36235 = false;
        this.f36236 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29556(C12135 c12135, InterfaceC3458 interfaceC3458, AbstractC10782 abstractC10782) {
        int length = interfaceC3458.length();
        interfaceC3458.mo10586(abstractC10782);
        if (c12135.f36234 != null) {
            C17820 c17820Builder = interfaceC3458.builder();
            int length2 = c17820Builder.length();
            boolean z = length2 > 0 && '\n' != c17820Builder.charAt(length2 - 1);
            if (z) {
                interfaceC3458.mo10591();
            }
            c17820Builder.append((char) 160);
            C1839 c1839 = new C1839(c12135.f36237, c12135.f36234, c12135.f36235, c12135.f36236 % 2 == 1);
            c12135.f36236 = c12135.f36235 ? 0 : c12135.f36236 + 1;
            if (z) {
                length++;
            }
            interfaceC3458.mo10584(length, c1839);
            c12135.f36234 = null;
        }
    }
}
