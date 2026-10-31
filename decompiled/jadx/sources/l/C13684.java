package l;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C13684 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32931(C22357 c22357, C3438 c3438, InterfaceC3627 interfaceC3627, InterfaceC10410 interfaceC10410, boolean z) throws IOException {
        int iMo11110 = interfaceC3627.mo11110();
        if (z && EnumC15657.STATIC.m36866(iMo11110) && EnumC15657.FINAL.m36866(iMo11110) && interfaceC10410 != null) {
            if (C6385.m17701(interfaceC10410)) {
                interfaceC10410 = null;
            } else {
                c3438.getClass();
                c3438.write("# The value of this static final field might be set in the static constructor\n", 0, 78);
            }
        }
        c3438.getClass();
        c3438.write(".field ", 0, 7);
        int iMo11111 = interfaceC3627.mo11110();
        Set setMo11111 = interfaceC3627.mo11111();
        for (EnumC15657 enumC15657 : EnumC15657.m36864(iMo11111)) {
            c3438.write(enumC15657.toString());
            c3438.write(32);
        }
        Iterator it = setMo11111.iterator();
        while (it.hasNext()) {
            c3438.write(((EnumC18481) it.next()).toString());
            c3438.write(32);
        }
        C14354.m34254((Writer) c3438, (InterfaceC18877) interfaceC3627, true);
        if (interfaceC10410 != null) {
            c3438.write(" = ", 0, 3);
            c22357.getClass();
            AbstractC11569.m28462(c3438, interfaceC10410);
        }
        c3438.write(10);
        Set annotations = interfaceC3627.getAnnotations();
        if (annotations.size() > 0) {
            c3438.m10512();
            c22357.getClass();
            C18625.m43182(c3438, annotations);
            c3438.m10508();
            c3438.write(".end field\n", 0, 11);
        }
    }
}
