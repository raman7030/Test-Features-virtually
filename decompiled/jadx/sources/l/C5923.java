package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KQ */
/* JADX INFO: loaded from: classes3.dex */
public class C5923 extends C15094 {

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public ArrayList f18169 = new ArrayList();

    @Override // l.C15094
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void mo16611() {
        this.f18169.clear();
        super.mo16611();
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void mo16610() {
        ArrayList arrayList = this.f18169;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15094 c15094 = (C15094) this.f18169.get(i);
            if (c15094 instanceof C5923) {
                ((C5923) c15094).mo16610();
            }
        }
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16609(C16506 c16506) {
        super.mo16609(c16506);
        int size = this.f18169.size();
        for (int i = 0; i < size; i++) {
            ((C15094) this.f18169.get(i)).mo16609(c16506);
        }
    }
}
