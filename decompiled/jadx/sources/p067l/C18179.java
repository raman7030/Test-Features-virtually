package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes5.dex */
public class C18179 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ᩶ */
    public C17450 f54264;

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f54265 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public boolean f54266;

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC4079 mo16297(C5263 c5263) {
        Iterator it = this.f54265.iterator();
        while (it.hasNext()) {
            ((C12816) it.next()).mo16297(c5263);
        }
        return this;
    }

    public C18179(C17450 c17450, boolean z) {
        this.f54264 = c17450;
        this.f54266 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m41396(C12816 c12816) {
        this.f54265.add(c12816);
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f54264.f23817);
        ArrayList arrayList = this.f54265;
        c8121.m18818(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4079) it.next()).mo5157(c8121);
        }
    }

    @Override // p067l.InterfaceC4079
    public int getLength() {
        return C7480.stream(this.f54265).flatMapToInt(new C4098()).sum() + 4;
    }
}
