package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۙܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4766 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f15125 = new IdentityHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m13929(InterfaceC0748 interfaceC0748) {
        IdentityHashMap identityHashMap = this.f15125;
        ArrayList arrayList = (ArrayList) identityHashMap.get(interfaceC0748);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayListM23297 = C9042.m23297((Iterable) interfaceC0748.mo2876());
        identityHashMap.put(interfaceC0748, arrayListM23297);
        return arrayListM23297;
    }
}
