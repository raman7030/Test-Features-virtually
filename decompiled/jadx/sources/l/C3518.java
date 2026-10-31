package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes3.dex */
public final class C3518 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC3109 f11167;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1755 f11168;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f11169;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13395 f11170;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        this.f11170.m32407(c18257.f56778, this.f11168, this.f11169, this.f11167, false);
        mo10758(c18257.f56779);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        this.f11170.m32407(c14315.f43168, this.f11168, this.f11169, this.f11167, true);
        m33860(c14315.f43170);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        C2609 c2609 = c18404.f57137;
        InterfaceC3109 interfaceC3109 = this.f11167;
        C13395 c13395 = this.f11170;
        c13395.m32407(c2609, this.f11168, this.f11169, interfaceC3109, false);
        Iterator it = c18404.f57141.iterator();
        while (it.hasNext()) {
            c13395.m32407((C2609) it.next(), this.f11168, this.f11169, this.f11167, false);
        }
        mo10758(c18404.f57138);
        m33860(c18404.f57139);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        mo10758(c8526.f26046);
        mo10758(c8526.f26051);
        m33860(c8526.f26047);
        mo10758(c8526.f26052);
        m33860(c8526.f26048);
        m33860(c8526.f26042);
        mo10758(c8526.f26049);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        InterfaceC3109 interfaceC3109 = this.f11167;
        this.f11167 = c9378;
        try {
            AbstractC5698 abstractC5698 = this.f11169;
            if (abstractC5698 != null && abstractC5698.f17559 == EnumC1296.f4567) {
                mo10758(c9378.f28486);
                mo10758(c9378.f28488);
            }
            mo10758(c9378.f28487);
        } finally {
            this.f11167 = interfaceC3109;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        mo10758(c19110.f60199);
        m33860(c19110.f60198);
        if (c19110.f60195 == null) {
            mo10758(c19110.f60196);
        }
        m33860(c19110.f60197);
    }

    public C3518(C13395 c13395, C1755 c1755, AbstractC5698 abstractC5698, InterfaceC3109 interfaceC3109) {
        this.f11170 = c13395;
        this.f11168 = c1755;
        this.f11169 = abstractC5698;
        this.f11167 = interfaceC3109;
    }
}
