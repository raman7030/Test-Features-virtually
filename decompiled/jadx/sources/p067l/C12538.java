package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: KALN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12538 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f35187 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m28866(C8410 c8410, InterfaceC17797 interfaceC17797) {
        Class clsMo19593 = c8410.mo19593();
        C13045.m29862((Object) clsMo19593, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        this.f35187.add(new C19243(clsMo19593, interfaceC17797));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3820 m28865() {
        C19243[] c19243Arr = (C19243[]) this.f35187.toArray(new C19243[0]);
        return new C3820((C19243[]) Arrays.copyOf(c19243Arr, c19243Arr.length));
    }
}
