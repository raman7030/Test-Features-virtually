package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: KALN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10701 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f32212 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26826(C6356 c6356, InterfaceC16233 interfaceC16233) {
        Class clsMo17650 = c6356.mo17650();
        C11233.m27800((Object) clsMo17650, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        this.f32212.add(new C17756(clsMo17650, interfaceC16233));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1528 m26825() {
        C17756[] c17756Arr = (C17756[]) this.f32212.toArray(new C17756[0]);
        return new C1528((C17756[]) Arrays.copyOf(c17756Arr, c17756Arr.length));
    }
}
