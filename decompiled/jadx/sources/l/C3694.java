package l;

import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۘۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3694 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f11652;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC14982 f11653;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f11654;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        try {
            return m11249(interfaceC8424);
        } catch (C9080 unused) {
            return false;
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f11652 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        AbstractC14982 abstractC14982 = this.f11653;
        if (abstractC14982 != null) {
            abstractC14982.m35474(j, j2);
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        C22632.m50632(this.f11652);
        if (this.f11653 == null) {
            if (!m11249(interfaceC8424)) {
                throw C9080.m23440("Failed to determine bitstream type", (Throwable) null);
            }
            interfaceC8424.mo22066();
        }
        if (!this.f11654) {
            InterfaceC19383 interfaceC19383Mo3429 = this.f11652.mo3429(0, 1);
            this.f11652.mo3431();
            this.f11653.m35475(this.f11652, interfaceC19383Mo3429);
            this.f11654 = true;
        }
        return this.f11653.m35472(interfaceC8424, c23615);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m11249(InterfaceC8424 interfaceC8424) {
        boolean zM48668;
        C19217 c19217 = new C19217();
        if (c19217.m44336(interfaceC8424, true) && (c19217.f60517 & 2) == 2) {
            int iMin = Math.min(c19217.f60511, 8);
            C17714 c17714 = new C17714(iMin);
            interfaceC8424.mo22061(0, iMin, c17714.m41482());
            c17714.m41484(0);
            if (c17714.m41457() >= 5 && c17714.m41456() == 127 && c17714.m41479() == 1179402563) {
                this.f11653 = new C2283();
                return true;
            }
            c17714.m41484(0);
            try {
                zM48668 = C21499.m48668(1, c17714, true);
            } catch (C9080 unused) {
                zM48668 = false;
            }
            if (zM48668) {
                this.f11653 = new C22039();
            } else {
                c17714.m41484(0);
                if (C5105.m14652(c17714)) {
                    this.f11653 = new C5105();
                }
            }
            return true;
        }
        return false;
    }
}
