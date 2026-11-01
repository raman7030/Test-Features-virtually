package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15123 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f43178;

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811((int) EnumC9462.AE_ARRAY.m21974());
        ArrayList arrayList = this.f43178;
        c8121.m18818(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4079) it.next()).mo5157(c8121);
        }
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return C7480.stream(this.f43178).flatMapToInt(new C5736()).sum() + 3;
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4079 mo16297(C5263 c5263) {
        Iterator it = this.f43178.iterator();
        while (it.hasNext()) {
            C14650.m33519((InterfaceC4079) it.next(), c5263);
        }
        return this;
    }
}
