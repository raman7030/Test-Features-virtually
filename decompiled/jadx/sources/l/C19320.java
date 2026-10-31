package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C19320 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f60743 = "appassets.androidplatform.net";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60744 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44517(InterfaceC0268 interfaceC0268) {
        this.f60744.add(new C10220("/", interfaceC0268));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44516(String str) {
        this.f60743 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0974 m44515() {
        ArrayList arrayList = new ArrayList();
        for (C10220 c10220 : this.f60744) {
            arrayList.add(new C5208(this.f60743, (String) c10220.f30697, (InterfaceC0268) c10220.f30698));
        }
        return new C0974(arrayList);
    }
}
