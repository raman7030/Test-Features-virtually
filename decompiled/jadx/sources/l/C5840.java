package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۛۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5840 implements InterfaceC15466 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11485 f17904;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f17905;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3545 f17906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f17907;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f17908;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f17909;

    public C5840(C11485 c11485, C3545 c3545) {
        this.f17904 = c11485;
        this.f17906 = c3545;
    }

    @Override // l.InterfaceC15466
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16356(long j, long j2) {
        this.f17904.f34298.m49549(j, j2);
    }

    @Override // l.InterfaceC15466
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo16358() {
        C11485 c11485 = this.f17904;
        C16560 c16560 = c11485.f34293;
        if (!c11485.f34294.m42213()) {
            this.f17909 = false;
            this.f17907 = false;
            return true;
        }
        C3545 c3545 = this.f17906;
        if (C22523.m50505(c3545)) {
            if (this.f17905 == null) {
                this.f17905 = C22523.m50498(c11485.f34294, c3545, this);
            }
            this.f17909 = false;
            C12079 c12079 = new C12079(c16560.m39056(), c11485.f34294);
            c12079.m29463(new BooleanSupplier() { // from class: l.ۤۙ᩻
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f30304.mo1526();
                }
            });
            boolean zM29465 = c12079.m29465(this.f17905);
            this.f17907 = zM29465;
            return zM29465;
        }
        if (this.f17908 == null) {
            this.f17908 = C10395.m26216();
        }
        if (this.f17908.hasNext()) {
            c11485.f34294.m42192((String) this.f17908.next());
            this.f17909 = true;
            this.f17907 = false;
            return true;
        }
        this.f17909 = false;
        boolean zM29464 = new C12079(c16560.m39056(), c11485.f34294).m29464();
        this.f17907 = zM29464;
        return zM29464;
    }

    @Override // l.InterfaceC15466
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean mo16359() {
        return this.f17909;
    }

    @Override // l.InterfaceC15466
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo16357() {
        return this.f17907;
    }

    @Override // l.InterfaceC15466
    public final void cancel() {
        this.f17904.f34298.m51044();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f17904.f34298.m51053();
    }
}
