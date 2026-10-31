package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C9770 extends C21869 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4935 f29552;

    public C9770(C21290 c21290) {
        this.f29552 = c21290;
    }

    @Override // l.AbstractC8463
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10387(C3581 c3581, Object obj) {
        Object obj2 = (Set) obj;
        m50558(c3581.mo7178(), obj2);
        List parameters = c3581.getParameters();
        C2609 c2609Mo7178 = c3581.mo7178();
        if (!c2609Mo7178.isEmpty()) {
            ArrayList arrayList = new ArrayList(c2609Mo7178);
            arrayList.addAll(parameters);
            parameters = arrayList;
        }
        return (Set) m50558(parameters, obj2);
    }

    @Override // l.AbstractC8463
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10390(C7814 c7814, Object obj) {
        return (Set) obj;
    }

    @Override // l.AbstractC8463
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10392(C14163 c14163, Object obj) {
        Object obj2 = (Set) obj;
        m50558(c14163.mo7178(), obj2);
        List listMo958 = c14163.mo958();
        C2609 c2609Mo7178 = c14163.mo7178();
        if (!c2609Mo7178.isEmpty()) {
            ArrayList arrayList = new ArrayList(c2609Mo7178);
            arrayList.addAll(listMo958);
            listMo958 = arrayList;
        }
        return (Set) m50558(listMo958, obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m24774(InterfaceC11970 interfaceC11970, Set set) {
        Iterator it = ((C21290) this.f29552).m48320(interfaceC11970).iterator();
        while (it.hasNext()) {
            set.add((InterfaceC9169) ((InterfaceC12675) it.next()).mo30951().mo45454());
        }
        return (Set) interfaceC11970.mo951(this, set);
    }
}
