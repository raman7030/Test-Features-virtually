package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CY */
/* JADX INFO: loaded from: classes5.dex */
public class C18048 extends C6759 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f56247;

    public C18048(C3046 c3046, EnumC4662 enumC4662, List list) {
        super(c3046, enumC4662);
        this.f56247 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f56247.add(mo13561((C15869) it.next(), c3046));
        }
    }

    @Override // l.C6759
    /* JADX INFO: renamed from: ܽ */
    public final int mo5678() {
        return (this.f56247.size() * 2) + 2;
    }

    @Override // l.C6759, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo2828(interfaceC0408);
        ArrayList arrayList = this.f56247;
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c6053.m16889(((C15869) it.next()).f20943);
        }
    }
}
