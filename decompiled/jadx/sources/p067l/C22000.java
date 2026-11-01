package p067l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۙ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes5.dex */
public final class C22000 extends C5906 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m49568(C17975 c17975) {
        C12612 c12612 = new C12612(c17975);
        if (c12612.hasNext()) {
            return c12612.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC15963 m49570(View view, InterfaceC17797 interfaceC17797) {
        if (view == null) {
            return C3894.f8439;
        }
        return new C18646(new C17304(view), interfaceC17797);
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m49569(InterfaceC15963 interfaceC15963) {
        Iterator it = interfaceC15963.iterator();
        if (!it.hasNext()) {
            return C10893.f30179;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C4187.m8475(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
