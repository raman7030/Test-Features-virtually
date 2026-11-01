package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ۠ */
/* JADX INFO: compiled from: P1KQ */
/* JADX INFO: loaded from: classes3.dex */
public class C1136 extends C1591 {

    /* JADX INFO: renamed from: ᩺֫ */
    public ArrayList f21023 = new ArrayList();

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ᩺ */
    public void mo18537() {
        this.f21023.clear();
        super.mo18537();
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public void mo18536() {
        ArrayList arrayList = this.f21023;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1591 c1591 = (C1591) this.f21023.get(i);
            if (c1591 instanceof C1136) {
                ((C1136) c1591).mo18536();
            }
        }
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public final void mo18535(C1661 c1661) {
        super.mo18535(c1661);
        int size = this.f21023.size();
        for (int i = 0; i < size; i++) {
            ((C1591) this.f21023.get(i)).mo18535(c1661);
        }
    }
}
