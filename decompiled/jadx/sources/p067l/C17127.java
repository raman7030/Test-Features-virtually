package p067l;

import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.ܶ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 12AL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17127 {

    /* JADX INFO: renamed from: ֫ */
    public static C23164 f50591;

    /* JADX INFO: renamed from: ֫ */
    public static void m38754(Main main) {
        f50591 = new C23164(main);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m38757(Main main) {
        if (m38753() == main) {
            f50591 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static Main m38753() {
        C23164 c23164 = f50591;
        if (c23164 == null) {
            return null;
        }
        return (Main) c23164.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38755(String str) {
        C11245 c11245M130;
        Main mainM38753 = m38753();
        if (mainM38753 == null || (c11245M130 = mainM38753.m130()) == null) {
            return;
        }
        c11245M130.m26067(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m38756() {
        C11245 c11245M130;
        Main mainM38753 = m38753();
        if (mainM38753 == null || (c11245M130 = mainM38753.m130()) == null) {
            return;
        }
        c11245M130.m26062();
    }
}
