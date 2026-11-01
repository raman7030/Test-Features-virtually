package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CY */
/* JADX INFO: loaded from: classes5.dex */
public class C19521 extends C8792 {

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f59449;

    public C19521(C5263 c5263, EnumC6799 enumC6799, List list) {
        super(c5263, enumC6799);
        this.f59449 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f59449.add(mo15436((C17450) it.next(), c5263));
        }
    }

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        return (this.f59449.size() * 2) + 2;
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo5157(interfaceC2756);
        ArrayList arrayList = this.f59449;
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c8121.m18818(((C17450) it.next()).f23817);
        }
    }
}
