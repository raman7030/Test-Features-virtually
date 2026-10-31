package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۤۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10267 extends C6759 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30923;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TreeMap f30924;

    public C10267(C3046 c3046, EnumC4662 enumC4662, int i) {
        TreeMap treeMap = new TreeMap();
        super(c3046, enumC4662);
        this.f30923 = i;
        this.f30924 = treeMap;
    }

    @Override // l.C6759
    /* JADX INFO: renamed from: ܽ */
    public final int mo5678() {
        int length = 1;
        for (int i = 0; i < this.f30923; i++) {
            ArrayList arrayList = (ArrayList) this.f30924.get(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    length += ((InterfaceC1800) it.next()).getLength();
                }
            }
            length += 2;
        }
        return length;
    }

    @Override // l.C6759, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo2828(interfaceC0408);
        C6053 c6053 = (C6053) interfaceC0408;
        int i = this.f30923;
        c6053.m16882(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) this.f30924.get(Integer.valueOf(i2));
            if (arrayList != null) {
                c6053.m16889(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1800) it.next()).mo2828(c6053);
                }
            } else {
                c6053.m16889(0);
            }
        }
    }
}
