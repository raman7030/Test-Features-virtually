package p067l;

import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۘۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5879 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC23116 f14454;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC16607 f14455;

    /* JADX INFO: renamed from: ܽ */
    public boolean f14456;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        try {
            return m13195(interfaceC10375);
        } catch (C10998 unused) {
            return false;
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f14454 = interfaceC23116;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        AbstractC16607 abstractC16607 = this.f14455;
        if (abstractC16607 != null) {
            abstractC16607.m37630(j, j2);
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        C23877.m52958(this.f14454);
        if (this.f14455 == null) {
            if (!m13195(interfaceC10375)) {
                throw C10998.m25387("Failed to determine bitstream type", (Throwable) null);
            }
            interfaceC10375.mo24036();
        }
        if (!this.f14456) {
            InterfaceC20790 interfaceC20790Mo5732 = this.f14454.mo5732(0, 1);
            this.f14454.mo5734();
            this.f14455.m37631(this.f14454, interfaceC20790Mo5732);
            this.f14456 = true;
        }
        return this.f14455.m37628(interfaceC10375, c24812);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: ۧ */
    private boolean m13195(InterfaceC10375 interfaceC10375) {
        boolean zM51005;
        C20632 c20632 = new C20632();
        if (c20632.m46630(interfaceC10375, true) && (c20632.f63748 & 2) == 2) {
            int iMin = Math.min(c20632.f63742, 8);
            C19203 c19203 = new C19203(iMin);
            interfaceC10375.mo24031(0, iMin, c19203.m43728());
            c19203.m43730(0);
            if (c19203.m43703() >= 5 && c19203.m43702() == 127 && c19203.m43725() == 1179402563) {
                this.f14455 = new C4538();
                return true;
            }
            c19203.m43730(0);
            try {
                zM51005 = C22801.m51005(1, c19203, true);
            } catch (C10998 unused) {
                zM51005 = false;
            }
            if (zM51005) {
                this.f14455 = new C23314();
            } else {
                c19203.m43730(0);
                if (C7220.m16560(c19203)) {
                    this.f14455 = new C7220();
                }
            }
            return true;
        }
        return false;
    }
}
