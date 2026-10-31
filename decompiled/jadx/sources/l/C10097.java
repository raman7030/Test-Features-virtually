package l;

import java.io.Writer;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 74H5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10097 extends AbstractC15945 implements InterfaceC3627 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f30398;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12918 f30399;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10410 f30400;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f30401;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f30402;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7980 f30403;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f30404;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f30405;

    public C10097(C12918 c12918, C18729 c18729, C7980 c7980, int i, InterfaceC13848 interfaceC13848, int i2) {
        this.f30399 = c12918;
        this.f30403 = c7980;
        c18729.getClass();
        int iM43363 = c18729.m43363() + i;
        this.f30402 = iM43363;
        this.f30404 = c18729.m43368();
        this.f30405 = interfaceC13848.seekTo(iM43363);
        this.f30400 = null;
        this.f30401 = i2;
    }

    public C10097(C12918 c12918, C18729 c18729, C7980 c7980, int i, AbstractC15781 abstractC15781, InterfaceC13848 interfaceC13848, int i2) {
        this.f30399 = c12918;
        this.f30403 = c7980;
        c18729.getClass();
        int iM43363 = c18729.m43363() + i;
        this.f30402 = iM43363;
        this.f30404 = c18729.m43368();
        this.f30405 = interfaceC13848.seekTo(iM43363);
        abstractC15781.mo22559();
        this.f30400 = abstractC15781.mo22558();
        this.f30401 = i2;
    }

    @Override // l.InterfaceC18877
    public final String getName() {
        C12918 c12918 = this.f30399;
        return c12918.m31422(c12918.m31418().mo11935(m25367() + 4));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25368(Writer writer) {
        C12918 c12918 = this.f30399;
        c12918.m31385(c12918.m31418().mo11935(m25367() + 4), writer, false);
    }

    @Override // l.InterfaceC18877
    public final String getType() {
        C12918 c12918 = this.f30399;
        return c12918.m31401(c12918.m31418().m11936(m25367() + 2));
    }

    @Override // l.InterfaceC18877
    /* JADX INFO: renamed from: ܳ */
    public final String mo8192() {
        return this.f30403.getType();
    }

    @Override // l.InterfaceC3627
    /* JADX INFO: renamed from: ܽ */
    public final int mo11110() {
        return this.f30404;
    }

    @Override // l.InterfaceC3627
    /* JADX INFO: renamed from: ۚ֫ */
    public final InterfaceC10410 mo11109() {
        return this.f30400;
    }

    @Override // l.InterfaceC3627
    public final Set getAnnotations() {
        return AbstractC10844.m27106(this.f30399, this.f30405);
    }

    @Override // l.InterfaceC3627
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo11111() {
        int i = this.f30401;
        if (i == 7) {
            return AbstractC6079.of();
        }
        return EnumSet.copyOf((Collection) EnumC18481.m42970(i));
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private int m25367() {
        if (this.f30398 == 0) {
            this.f30398 = this.f30399.m31404(this.f30402);
        }
        return this.f30398;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25369(C10097 c10097, boolean z) {
        String type = getType();
        if (!this.f30403.getType().equals(c10097.f30403.getType()) || !getName().equals(c10097.getName()) || !type.equals(c10097.getType())) {
            return false;
        }
        int i = c10097.f30404;
        int i2 = this.f30404;
        if (i2 != i) {
            return false;
        }
        if ((this.f30405 != 0 || c10097.f30405 != 0) && !C3563.m10859(getAnnotations(), c10097.getAnnotations())) {
            return false;
        }
        if ((this.f30401 != 7 || c10097.f30401 != 7) && !C3563.m10859(mo11111(), c10097.mo11111())) {
            return false;
        }
        InterfaceC10410 interfaceC10410 = c10097.f30400;
        InterfaceC10410 interfaceC10411 = this.f30400;
        if (C11003.equals(interfaceC10411, interfaceC10410)) {
            return true;
        }
        if (interfaceC10411 == null) {
            return C23836.m52533(type).equals(interfaceC10410);
        }
        if (interfaceC10410 == null) {
            return C23836.m52533(type).equals(interfaceC10411);
        }
        return z && EnumC15657.STATIC.m36866(i2) && (interfaceC10411 instanceof InterfaceC13936) && (((InterfaceC13936) interfaceC10411).getValue() >>> 24) == 127 && (interfaceC10410 instanceof InterfaceC13936) && (((InterfaceC13936) interfaceC10410).getValue() >>> 24) == 127;
    }
}
