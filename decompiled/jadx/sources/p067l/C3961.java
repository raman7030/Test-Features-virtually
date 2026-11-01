package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C3961 extends C8792 {

    /* JADX INFO: renamed from: ۙ */
    public ArrayList f8625;

    /* JADX INFO: renamed from: ᩶ */
    public C15496 f8626;

    public C3961(C15496 c15496) {
        super(c15496.f40167, EnumC6799.f17617);
        this.f8625 = new ArrayList();
        this.f8626 = c15496;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7907(C17450 c17450, C17450 c17451, C17450 c17452, ArrayList arrayList) {
        int iM18860 = EnumC8140.m18860(EnumC8140.f21460, EnumC8140.f21482, EnumC8140.f21469);
        C15496 c15496 = this.f8626;
        C9500 c9500 = new C9500(c15496, c15496.m35276(iM18860, c17450, c17451));
        if (arrayList != null) {
            c9500.m32173(arrayList);
        }
        if (c17452 != null) {
            c9500.m32174(c17452);
        }
        this.f8625.add(c9500);
    }

    public final boolean isEmpty() {
        return this.f8625.isEmpty();
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo5157(interfaceC2756);
        ArrayList arrayList = this.f8625;
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C9500) it.next()).m22107(c8121);
        }
    }

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        return C7480.stream(this.f8625).mapToInt(new C15534()).sum() + 2;
    }
}
