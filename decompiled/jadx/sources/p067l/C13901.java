package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes3.dex */
public final class C13901 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f39246;

    /* JADX INFO: renamed from: ۧ */
    public boolean f39247;

    /* JADX INFO: renamed from: ܽ */
    public int f39248;

    /* JADX INFO: renamed from: ᩳ */
    public final C8810 f39249;

    public C13901(C8810 c8810) {
        this.f39249 = c8810;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31624() {
        this.f39246 = null;
        this.f39247 = false;
        this.f39248 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31621(C13901 c13901, InterfaceC5655 interfaceC5655, AbstractC12615 abstractC12615) {
        int length = interfaceC5655.length();
        interfaceC5655.mo12594(abstractC12615);
        if (c13901.f39246 != null) {
            C19304 c19304Builder = interfaceC5655.builder();
            int length2 = c19304Builder.length();
            boolean z = length2 > 0 && '\n' != c19304Builder.charAt(length2 - 1);
            if (z) {
                interfaceC5655.mo12599();
            }
            c19304Builder.append((char) 160);
            C4116 c4116 = new C4116(c13901.f39249, c13901.f39246, c13901.f39247, c13901.f39248 % 2 == 1);
            c13901.f39248 = c13901.f39247 ? 0 : c13901.f39248 + 1;
            if (z) {
                length++;
            }
            interfaceC5655.mo12592(length, c4116);
            c13901.f39246 = null;
        }
    }
}
