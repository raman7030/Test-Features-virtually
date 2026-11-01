package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C20730 {

    /* JADX INFO: renamed from: ֫ */
    public String f63973 = "appassets.androidplatform.net";

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f63974 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m46811(InterfaceC2623 interfaceC2623) {
        this.f63974.add(new C1349("/", interfaceC2623));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46810(String str) {
        this.f63973 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3294 m46809() {
        ArrayList arrayList = new ArrayList();
        for (C1349 c1349 : this.f63974) {
            arrayList.add(new C7318(this.f63973, (String) c1349.f33658, (InterfaceC2623) c1349.f33659));
        }
        return new C3294(arrayList);
    }
}
