package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18959 extends AbstractC0613 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Class f59796 = C20195.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // l.AbstractC0613
    /* JADX INFO: renamed from: ۧ */
    public final List mo2522(long j, Object obj) {
        return m43764(10, j, obj);
    }

    @Override // l.AbstractC0613
    /* JADX INFO: renamed from: ֫ */
    public final void mo2520(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) C21244.m48234(j, obj);
        if (list instanceof InterfaceC4142) {
            objUnmodifiableList = ((InterfaceC4142) list).mo8470();
        } else {
            if (f59796.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC9934) && (list instanceof InterfaceC23170)) {
                InterfaceC23170 interfaceC23170 = (InterfaceC23170) list;
                if (interfaceC23170.mo44491()) {
                    interfaceC23170.mo44493();
                    return;
                }
                return;
            }
            objUnmodifiableList = C20195.unmodifiableList(list);
        }
        C21244.m48224(j, obj, objUnmodifiableList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m43764(int i, long j, Object obj) {
        List arrayList;
        List list = (List) C21244.m48234(j, obj);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC4142) {
                arrayList = new C2731(i);
            } else if ((list instanceof InterfaceC9934) && (list instanceof InterfaceC23170)) {
                arrayList = ((InterfaceC23170) list).mo8473(i);
            } else {
                arrayList = new ArrayList(i);
            }
            C21244.m48224(j, obj, arrayList);
            return arrayList;
        }
        if (f59796.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            C21244.m48224(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof C19127) {
            C2731 c2731 = new C2731(list.size() + i);
            c2731.addAll((C19127) list);
            C21244.m48224(j, obj, c2731);
            return c2731;
        }
        if ((list instanceof InterfaceC9934) && (list instanceof InterfaceC23170)) {
            InterfaceC23170 interfaceC23170 = (InterfaceC23170) list;
            if (!interfaceC23170.mo44491()) {
                InterfaceC23170 interfaceC23170Mo8473 = interfaceC23170.mo8473(list.size() + i);
                C21244.m48224(j, obj, interfaceC23170Mo8473);
                return interfaceC23170Mo8473;
            }
        }
        return list;
    }

    @Override // l.AbstractC0613
    /* JADX INFO: renamed from: ֫ */
    public final void mo2521(long j, Object obj, Object obj2) {
        List list = (List) C21244.m48234(j, obj2);
        List listM43764 = m43764(list.size(), j, obj);
        int size = listM43764.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM43764.addAll(list);
        }
        if (size > 0) {
            list = listM43764;
        }
        C21244.m48224(j, obj, list);
    }
}
