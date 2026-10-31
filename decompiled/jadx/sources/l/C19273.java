package l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79FR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19273 extends C3750 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Set f60649;

    public final String toString() {
        return "SMB_COM_NEGOTIATE";
    }

    public C19273(EnumSet enumSet) {
        super(new C15743());
        this.f60649 = enumSet;
    }

    @Override // l.C3750
    /* JADX INFO: renamed from: ۧ */
    public final void mo11378(C0097 c0097) {
        int length = 0;
        c0097.m26075((byte) 0);
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("SMB 2.002");
        Set set = this.f60649;
        if (set.size() > 1 || !set.contains(EnumC22094.SMB_2_0_2)) {
            arrayList.add("SMB 2.???");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            length += ((String) it.next()).length() + 2;
        }
        c0097.m26086(length);
        for (String str : arrayList) {
            c0097.m26075((byte) 2);
            c0097.m26079(str, C8208.f25224);
        }
        ((C15743) this.f2936).m37144(c0097.m26091());
    }
}
