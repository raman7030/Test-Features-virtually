package p067l;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C15373 {
    /* JADX INFO: renamed from: ֫ */
    public static void m35046(C23616 c23616, C5636 c5636, InterfaceC5815 interfaceC5815, InterfaceC12262 interfaceC12262, boolean z) throws IOException {
        int iMo13086 = interfaceC5815.mo13086();
        if (z && EnumC17248.STATIC.m39032(iMo13086) && EnumC17248.FINAL.m39032(iMo13086) && interfaceC12262 != null) {
            if (C8437.m19648(interfaceC12262)) {
                interfaceC12262 = null;
            } else {
                c5636.getClass();
                c5636.write("# The value of this static final field might be set in the static constructor\n", 0, 78);
            }
        }
        c5636.getClass();
        c5636.write(".field ", 0, 7);
        int iMo13087 = interfaceC5815.mo13086();
        Set setMo13087 = interfaceC5815.mo13087();
        for (EnumC17248 enumC17248 : EnumC17248.m39030(iMo13087)) {
            c5636.write(enumC17248.toString());
            c5636.write(32);
        }
        Iterator it = setMo13087.iterator();
        while (it.hasNext()) {
            c5636.write(((EnumC19932) it.next()).toString());
            c5636.write(32);
        }
        C16010.m36387((Writer) c5636, (InterfaceC20309) interfaceC5815, true);
        if (interfaceC12262 != null) {
            c5636.write(" = ", 0, 3);
            c23616.getClass();
            AbstractC13363.m30508(c5636, interfaceC12262);
        }
        c5636.write(10);
        Set annotations = interfaceC5815.getAnnotations();
        if (annotations.size() > 0) {
            c5636.m12536();
            c23616.getClass();
            C20069.m45448(c5636, annotations);
            c5636.m12532();
            c5636.write(".end field\n", 0, 11);
        }
    }
}
