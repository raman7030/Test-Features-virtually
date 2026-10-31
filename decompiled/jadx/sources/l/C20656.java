package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۙ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes5.dex */
public final class C20656 extends C3722 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m47241(C16421 c16421) {
        C10778 c10778 = new C10778(c16421);
        if (c10778.hasNext()) {
            return c10778.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC14304 m47243(View view, InterfaceC16233 interfaceC16233) {
        if (view == null) {
            return C1605.f5659;
        }
        return new C17127(new C15715(view), interfaceC16233);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m47242(InterfaceC14304 interfaceC14304) {
        Iterator it = interfaceC14304.iterator();
        if (!it.hasNext()) {
            return C8969.f27244;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C1913.m6273(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
