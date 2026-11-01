package p067l;

import com.google.android.material.motion.MotionUtils;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.ۖۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9HI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4729 extends C18158 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C6070 f10714;

    /* JADX INFO: renamed from: ܿ */
    public SecretKey f10715;

    /* JADX INFO: renamed from: ᩻ */
    public final C18158 f10716;

    public C4729(C6070 c6070, C18158 c18158, SecretKey secretKey) {
        this.f10714 = c6070;
        this.f10716 = c18158;
        this.f10715 = secretKey;
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ܿ */
    public final int mo10023() {
        return this.f10716.mo10023();
    }

    @Override // p067l.AbstractC3131
    /* JADX INFO: renamed from: ܽ */
    public final int mo5342() {
        return this.f10716.mo5342();
    }

    @Override // p067l.C18158, p067l.InterfaceC2792
    /* JADX INFO: renamed from: ܽ */
    public final void mo4380(C2460 c2460) {
        C6070 c6070 = this.f10714;
        C18158 c18158 = this.f10716;
        try {
            ((C24864) c18158.mo5341()).m54610(EnumC4077.SMB2_FLAGS_SIGNED);
            int iM28116 = c2460.m28116();
            c18158.mo4380(c2460);
            int iM28117 = c2460.m28116() - iM28116;
            int i = C6070.f15274;
            SecretKey secretKey = this.f10715;
            C4473 c4473 = c6070.f15275;
            String algorithm = secretKey.getAlgorithm();
            c4473.getClass();
            InterfaceC7312 interfaceC7312M9473 = C4473.m9473(algorithm);
            interfaceC7312M9473.init(secretKey.getEncoded());
            interfaceC7312M9473.update(c2460.m28106(), iM28116, iM28117);
            System.arraycopy(interfaceC7312M9473.mo16885(), 0, c2460.m28106(), iM28116 + 48, 16);
        } catch (C9994 e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p067l.AbstractC3131
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7155 mo5341() {
        return (C24864) this.f10716.mo5341();
    }

    @Override // p067l.C18158
    public final String toString() {
        return "Signed(" + this.f10716.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ܳ */
    public final C18158 mo10021() {
        return this.f10716.mo10021();
    }
}
