package p067l;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۙܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6898 {

    /* JADX INFO: renamed from: ֫ */
    public final IdentityHashMap f17955 = new IdentityHashMap();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m15809(InterfaceC3080 interfaceC3080) {
        IdentityHashMap identityHashMap = this.f17955;
        ArrayList arrayList = (ArrayList) identityHashMap.get(interfaceC3080);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayListM25242 = C10962.m25242((Iterable) interfaceC3080.mo5205());
        identityHashMap.put(interfaceC3080, arrayListM25242);
        return arrayListM25242;
    }
}
