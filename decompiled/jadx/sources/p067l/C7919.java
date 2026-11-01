package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۛۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7919 implements InterfaceC17068 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C13284 f20756;

    /* JADX INFO: renamed from: ۙ */
    public List f20757;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C5738 f20758;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f20759;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f20760;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f20761;

    public C7919(C13284 c13284, C5738 c5738) {
        this.f20756 = c13284;
        this.f20758 = c5738;
    }

    @Override // p067l.InterfaceC17068
    /* JADX INFO: renamed from: ֫ */
    public final void mo18281(long j, long j2) {
        this.f20756.f37295.m51885(j, j2);
    }

    @Override // p067l.InterfaceC17068
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo18283() {
        C13284 c13284 = this.f20756;
        C18107 c18107 = c13284.f37290;
        if (!c13284.f37291.m44472()) {
            this.f20761 = false;
            this.f20759 = false;
            return true;
        }
        C5738 c5738 = this.f20758;
        if (C23775.m52847(c5738)) {
            if (this.f20757 == null) {
                this.f20757 = C23775.m52840(c13284.f37291, c5738, this);
            }
            this.f20761 = false;
            C13848 c13848 = new C13848(c18107.m41282(), c13284.f37291);
            c13848.m31525(new BooleanSupplier() { // from class: l.ۤۙ᩻
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f33265.mo3924();
                }
            });
            boolean zM31527 = c13848.m31527(this.f20757);
            this.f20759 = zM31527;
            return zM31527;
        }
        if (this.f20760 == null) {
            this.f20760 = C12248.m28245();
        }
        if (this.f20760.hasNext()) {
            c13284.f37291.m44451((String) this.f20760.next());
            this.f20761 = true;
            this.f20759 = false;
            return true;
        }
        this.f20761 = false;
        boolean zM31526 = new C13848(c18107.m41282(), c13284.f37291).m31526();
        this.f20759 = zM31526;
        return zM31526;
    }

    @Override // p067l.InterfaceC17068
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo18284() {
        return this.f20761;
    }

    @Override // p067l.InterfaceC17068
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo18282() {
        return this.f20759;
    }

    @Override // p067l.InterfaceC17068
    public final void cancel() {
        this.f20756.f37295.m53435();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f20756.f37295.m53444();
    }
}
