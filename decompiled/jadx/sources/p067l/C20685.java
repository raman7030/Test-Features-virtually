package p067l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79FR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20685 extends C5932 {

    /* JADX INFO: renamed from: ܽ */
    public Set f63879;

    public final String toString() {
        return "SMB_COM_NEGOTIATE";
    }

    public C20685(EnumSet enumSet) {
        super(new C17330());
        this.f63879 = enumSet;
    }

    @Override // p067l.C5932
    /* JADX INFO: renamed from: ۧ */
    public final void mo13314(C2460 c2460) {
        int length = 0;
        c2460.m28100((byte) 0);
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("SMB 2.002");
        Set set = this.f63879;
        if (set.size() > 1 || !set.contains(EnumC23366.SMB_2_0_2)) {
            arrayList.add("SMB 2.???");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            length += ((String) it.next()).length() + 2;
        }
        c2460.m28111(length);
        for (String str : arrayList) {
            c2460.m28100((byte) 2);
            c2460.m28104(str, C10169.f28134);
        }
        ((C17330) this.f5707).m39314(c2460.m28116());
    }
}
