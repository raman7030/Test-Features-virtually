package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۧۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44QG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12635 extends AbstractC19535 {

    /* JADX INFO: renamed from: ۗ */
    public final int f35465;

    /* JADX INFO: renamed from: ۙ */
    public final int f35466;

    /* JADX INFO: renamed from: ᩶ */
    public final int f35467;

    /* JADX INFO: renamed from: ᩹ */
    public final C14645 f35468;

    public C12635(C14645 c14645, int i) {
        this.f35468 = c14645;
        C20168 c20168M13859 = c14645.m33504().m13859(i);
        this.f35465 = c20168M13859.m45625();
        this.f35466 = c20168M13859.m45635();
        this.f35467 = c20168M13859.m45631();
        c20168M13859.m45626();
    }

    @Override // p067l.InterfaceC21909
    public final int getVisibility() {
        return this.f35465;
    }

    @Override // p067l.InterfaceC21909
    public final String getType() {
        return this.f35468.m33487(this.f35466);
    }

    @Override // p067l.InterfaceC21909
    public final Set getElements() {
        C14645 c14645 = this.f35468;
        C20168 c20168M13859 = c14645.m33504().m13859(this.f35467);
        int iM45635 = c20168M13859.m45635();
        int iM45631 = c20168M13859.m45631();
        c20168M13859.m45626();
        return new C3917(this, c14645, iM45631, iM45635);
    }
}
