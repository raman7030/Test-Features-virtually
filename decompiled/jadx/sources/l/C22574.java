package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S403 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC4914(EnumC3503.RELEASE_6)
public class C22574 extends AbstractC8463 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m50558(List list, Object obj) {
        Iterator it = list.iterator();
        Set setM24774 = null;
        while (it.hasNext()) {
            setM24774 = ((C9770) this).m24774((InterfaceC11970) it.next(), (Set) obj);
        }
        return setM24774;
    }

    @Override // l.AbstractC8463
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10388(C4287 c4287, Object obj) {
        return m50558(c4287.mo958(), obj);
    }
}
