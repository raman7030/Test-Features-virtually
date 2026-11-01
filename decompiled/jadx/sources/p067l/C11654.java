package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C11654 extends C23153 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7059 f32505;

    public C11654(C22602 c22602) {
        this.f32505 = c22602;
    }

    @Override // p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12426(C5771 c5771, Object obj) {
        Object obj2 = (Set) obj;
        m52900(c5771.mo9257(), obj2);
        List parameters = c5771.getParameters();
        C4848 c4848Mo9257 = c5771.mo9257();
        if (!c4848Mo9257.isEmpty()) {
            ArrayList arrayList = new ArrayList(c4848Mo9257);
            arrayList.addAll(parameters);
            parameters = arrayList;
        }
        return (Set) m52900(parameters, obj2);
    }

    @Override // p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12429(C9794 c9794, Object obj) {
        return (Set) obj;
    }

    @Override // p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12431(C15828 c15828, Object obj) {
        Object obj2 = (Set) obj;
        m52900(c15828.mo9257(), obj2);
        List listMo3353 = c15828.mo3353();
        C4848 c4848Mo9257 = c15828.mo9257();
        if (!c4848Mo9257.isEmpty()) {
            ArrayList arrayList = new ArrayList(c4848Mo9257);
            arrayList.addAll(listMo3353);
            listMo3353 = arrayList;
        }
        return (Set) m52900(listMo3353, obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m26788(InterfaceC13745 interfaceC13745, Set set) {
        Iterator it = ((C22602) this.f32505).m50654(interfaceC13745).iterator();
        while (it.hasNext()) {
            set.add((InterfaceC11083) ((InterfaceC14415) it.next()).mo33029().mo47761());
        }
        return (Set) interfaceC13745.mo3346(this, set);
    }
}
