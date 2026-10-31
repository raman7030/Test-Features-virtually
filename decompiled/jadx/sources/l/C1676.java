package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C1676 extends C6759 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f5846;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13813 f5847;

    public C1676(C13813 c13813) {
        super(c13813.f37150, EnumC4662.f14787);
        this.f5846 = new ArrayList();
        this.f5847 = c13813;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5677(C15869 c15869, C15869 c158610, C15869 c158611, ArrayList arrayList) {
        int iM16931 = EnumC6073.m16931(EnumC6073.f18604, EnumC6073.f18626, EnumC6073.f18613);
        C13813 c13813 = this.f5847;
        C7504 c7504 = new C7504(c13813, c13813.m33159(iM16931, c15869, c158610));
        if (arrayList != null) {
            c7504.m30109(arrayList);
        }
        if (c158611 != null) {
            c7504.m30110(c158611);
        }
        this.f5846.add(c7504);
    }

    public final boolean isEmpty() {
        return this.f5846.isEmpty();
    }

    @Override // l.C6759, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo2828(interfaceC0408);
        ArrayList arrayList = this.f5846;
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C7504) it.next()).m20131(c6053);
        }
    }

    @Override // l.C6759
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo5678() {
        return C5378.stream(this.f5846).mapToInt(new C13853()).sum() + 2;
    }
}
