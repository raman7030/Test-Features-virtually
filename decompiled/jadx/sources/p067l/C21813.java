package p067l;

import java.lang.ref.SoftReference;
import java.util.List;

/* JADX INFO: renamed from: l.᩶᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes4.dex */
public final class C21813 {

    /* JADX INFO: renamed from: ֫ */
    public static SoftReference f68638 = new SoftReference(new C23824());

    /* JADX INFO: renamed from: ֫ */
    public static C23824 m49183() {
        C23824 c23824 = (C23824) f68638.get();
        if (c23824 != null) {
            return c23824;
        }
        C23824 c23825 = new C23824();
        f68638 = new SoftReference(c23825);
        return c23825;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17117 m49182(String str, boolean z) {
        String strM52902 = m49183().m52902(str, z);
        if (strM52902 == null) {
            return null;
        }
        C20472 c20472 = new C20472();
        c20472.f20267 = C1563.m36822(strM52902);
        c20472.f63217 = C1759.m45241(-16777216);
        c20472.f63214 = C1759.m45241(0);
        C17117 c17117 = new C17117();
        C3707 c3707 = c17117.f50563.f28799;
        float fM29939 = C13076.m29939(24.0f);
        c3707.f7831 = fM29939;
        c3707.f7837 = fM29939;
        c3707.f7833 = 24.0f;
        c3707.f7843 = 24.0f;
        c3707.f7836.f66435.add(c20472);
        return c17117;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m49184() {
        return (List) C7480.stream(m49183().f75712.entrySet()).filter(new C4781(2)).map(new C15868(1)).sorted().collect(C24205.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m49185() {
        return (List) C7480.stream(m49183().f75712.entrySet()).filter(new C23154(0)).map(new C15868(1)).sorted().collect(C24205.toUnmodifiableList());
    }
}
