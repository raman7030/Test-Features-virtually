package p067l;

import java.io.Writer;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 74H5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11964 extends AbstractC17522 implements InterfaceC5815 {

    /* JADX INFO: renamed from: ۗ */
    public int f33357;

    /* JADX INFO: renamed from: ۙ */
    public final C14645 f33358;

    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC12262 f33359;

    /* JADX INFO: renamed from: ۫ */
    public final int f33360;

    /* JADX INFO: renamed from: ۬ */
    public final int f33361;

    /* JADX INFO: renamed from: ᩶ */
    public final C9952 f33362;

    /* JADX INFO: renamed from: ᩸ */
    public final int f33363;

    /* JADX INFO: renamed from: ᩹ */
    public final int f33364;

    public C11964(C14645 c14645, C20168 c20168, C9952 c9952, int i, InterfaceC15529 interfaceC15529, int i2) {
        this.f33358 = c14645;
        this.f33362 = c9952;
        c20168.getClass();
        int iM45630 = c20168.m45630() + i;
        this.f33361 = iM45630;
        this.f33363 = c20168.m45635();
        this.f33364 = interfaceC15529.seekTo(iM45630);
        this.f33359 = null;
        this.f33360 = i2;
    }

    public C11964(C14645 c14645, C20168 c20168, C9952 c9952, int i, AbstractC17366 abstractC17366, InterfaceC15529 interfaceC15529, int i2) {
        this.f33358 = c14645;
        this.f33362 = c9952;
        c20168.getClass();
        int iM45630 = c20168.m45630() + i;
        this.f33361 = iM45630;
        this.f33363 = c20168.m45635();
        this.f33364 = interfaceC15529.seekTo(iM45630);
        abstractC17366.mo24529();
        this.f33359 = abstractC17366.mo24528();
        this.f33360 = i2;
    }

    @Override // p067l.InterfaceC20309
    public final String getName() {
        C14645 c14645 = this.f33358;
        return c14645.m33508(c14645.m33504().mo13855(m27386() + 4));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27387(Writer writer) {
        C14645 c14645 = this.f33358;
        c14645.m33471(c14645.m33504().mo13855(m27386() + 4), writer, false);
    }

    @Override // p067l.InterfaceC20309
    public final String getType() {
        C14645 c14645 = this.f33358;
        return c14645.m33487(c14645.m33504().m13856(m27386() + 2));
    }

    @Override // p067l.InterfaceC20309
    /* JADX INFO: renamed from: ܳ */
    public final String mo10231() {
        return this.f33362.getType();
    }

    @Override // p067l.InterfaceC5815
    /* JADX INFO: renamed from: ܽ */
    public final int mo13086() {
        return this.f33363;
    }

    @Override // p067l.InterfaceC5815
    /* JADX INFO: renamed from: ۚ֫ */
    public final InterfaceC12262 mo13085() {
        return this.f33359;
    }

    @Override // p067l.InterfaceC5815
    public final Set getAnnotations() {
        return AbstractC12674.m29151(this.f33358, this.f33364);
    }

    @Override // p067l.InterfaceC5815
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo13087() {
        int i = this.f33360;
        if (i == 7) {
            return AbstractC8146.m18915of();
        }
        return EnumSet.copyOf((Collection) EnumC19932.m45246(i));
    }

    /* JADX INFO: renamed from: ֡ */
    private int m27386() {
        if (this.f33357 == 0) {
            this.f33357 = this.f33358.m33490(this.f33361);
        }
        return this.f33357;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m27388(C11964 c11964, boolean z) {
        String type = getType();
        if (!this.f33362.getType().equals(c11964.f33362.getType()) || !getName().equals(c11964.getName()) || !type.equals(c11964.getType())) {
            return false;
        }
        int i = c11964.f33363;
        int i2 = this.f33363;
        if (i2 != i) {
            return false;
        }
        if ((this.f33364 != 0 || c11964.f33364 != 0) && !C5755.m12839(getAnnotations(), c11964.getAnnotations())) {
            return false;
        }
        if ((this.f33360 != 7 || c11964.f33360 != 7) && !C5755.m12839(mo13087(), c11964.mo13087())) {
            return false;
        }
        InterfaceC12262 interfaceC12262 = c11964.f33359;
        InterfaceC12262 interfaceC12263 = this.f33359;
        if (C12826.equals(interfaceC12263, interfaceC12262)) {
            return true;
        }
        if (interfaceC12263 == null) {
            return C25022.m54942(type).equals(interfaceC12262);
        }
        if (interfaceC12262 == null) {
            return C25022.m54942(type).equals(interfaceC12263);
        }
        return z && EnumC17248.STATIC.m39032(i2) && (interfaceC12263 instanceof InterfaceC15613) && (((InterfaceC15613) interfaceC12263).getValue() >>> 24) == 127 && (interfaceC12262 instanceof InterfaceC15613) && (((InterfaceC15613) interfaceC12262).getValue() >>> 24) == 127;
    }
}
