package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20387 extends AbstractC2951 {

    /* JADX INFO: renamed from: ܽ */
    public static final Class f63025 = C21562.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // p067l.AbstractC2951
    /* JADX INFO: renamed from: ۧ */
    public final List mo4878(long j, Object obj) {
        return m46031(10, j, obj);
    }

    @Override // p067l.AbstractC2951
    /* JADX INFO: renamed from: ֫ */
    public final void mo4876(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) C22558.m50565(j, obj);
        if (list instanceof InterfaceC6305) {
            objUnmodifiableList = ((InterfaceC6305) list).mo10517();
        } else {
            if (f63025.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC11809) && (list instanceof InterfaceC24389)) {
                InterfaceC24389 interfaceC24389 = (InterfaceC24389) list;
                if (interfaceC24389.mo46785()) {
                    interfaceC24389.mo46787();
                    return;
                }
                return;
            }
            objUnmodifiableList = C21562.unmodifiableList(list);
        }
        C22558.m50555(j, obj, objUnmodifiableList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m46031(int i, long j, Object obj) {
        List arrayList;
        List list = (List) C22558.m50565(j, obj);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC6305) {
                arrayList = new C4964(i);
            } else if ((list instanceof InterfaceC11809) && (list instanceof InterfaceC24389)) {
                arrayList = ((InterfaceC24389) list).mo10520(i);
            } else {
                arrayList = new ArrayList(i);
            }
            C22558.m50555(j, obj, arrayList);
            return arrayList;
        }
        if (f63025.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            C22558.m50555(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof C20546) {
            C4964 c4964 = new C4964(list.size() + i);
            c4964.addAll((C20546) list);
            C22558.m50555(j, obj, c4964);
            return c4964;
        }
        if ((list instanceof InterfaceC11809) && (list instanceof InterfaceC24389)) {
            InterfaceC24389 interfaceC24389 = (InterfaceC24389) list;
            if (!interfaceC24389.mo46785()) {
                InterfaceC24389 interfaceC24389Mo10520 = interfaceC24389.mo10520(list.size() + i);
                C22558.m50555(j, obj, interfaceC24389Mo10520);
                return interfaceC24389Mo10520;
            }
        }
        return list;
    }

    @Override // p067l.AbstractC2951
    /* JADX INFO: renamed from: ֫ */
    public final void mo4877(long j, Object obj, Object obj2) {
        List list = (List) C22558.m50565(j, obj2);
        List listM46031 = m46031(list.size(), j, obj);
        int size = listM46031.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM46031.addAll(list);
        }
        if (size > 0) {
            list = listM46031;
        }
        C22558.m50555(j, obj, list);
    }
}
