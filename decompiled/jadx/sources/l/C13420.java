package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13420 implements InterfaceC12218 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f40109;

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882((int) EnumC7464.AE_ARRAY.m19999());
        ArrayList arrayList = this.f40109;
        c6053.m16889(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1800) it.next()).mo2828(c6053);
        }
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        return C5378.stream(this.f40109).flatMapToInt(new C3543()).sum() + 3;
    }

    @Override // l.InterfaceC12218
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1800 mo14394(C3046 c3046) {
        Iterator it = this.f40109.iterator();
        while (it.hasNext()) {
            C12923.m31433((InterfaceC1800) it.next(), c3046);
        }
        return this;
    }
}
