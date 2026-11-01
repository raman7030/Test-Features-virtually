package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C3851 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f8290 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f8291 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f8292 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public final C17932 f8293;

    public C3851(C17932 c17932) {
        this.f8293 = c17932;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7564() {
        while (!this.f8291.isEmpty() && ((C13279) this.f8291.get(0)).f37283.isEmpty()) {
            this.f8291.remove(0);
        }
        while (!this.f8291.isEmpty() && ((C13279) C20013.m45383(this.f8291, 1)).f37283.isEmpty()) {
            C19925.m45229(this.f8291, 1);
        }
        if (this.f8291.size() == 1 && ((C13279) this.f8291.get(0)).f37283.equals("nop")) {
            this.f8291.clear();
            return;
        }
        if (this.f8291.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f8290;
        arrayList.add(new C9255(this.f8293, arrayList.size(), this.f8291));
        this.f8291 = new ArrayList();
    }
}
