package l;

import com.google.android.material.motion.MotionUtils;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.ۖۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9HI */
/* JADX INFO: loaded from: classes3.dex */
public final class C2484 extends C16614 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3895 f7926;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public SecretKey f7927;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16614 f7928;

    public C2484(C3895 c3895, C16614 c16614, SecretKey secretKey) {
        this.f7926 = c3895;
        this.f7928 = c16614;
        this.f7927 = secretKey;
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo7975() {
        return this.f7928.mo7975();
    }

    @Override // l.AbstractC0803
    /* JADX INFO: renamed from: ܽ */
    public final int mo3029() {
        return this.f7928.mo3029();
    }

    @Override // l.C16614, l.InterfaceC0446
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo2003(C0097 c0097) {
        C3895 c3895 = this.f7926;
        C16614 c16614 = this.f7928;
        try {
            ((C23670) c16614.mo3028()).m52207(EnumC1798.SMB2_FLAGS_SIGNED);
            int iM26091 = c0097.m26091();
            c16614.mo2003(c0097);
            int iM26092 = c0097.m26091() - iM26091;
            int i = C3895.f12466;
            SecretKey secretKey = this.f7927;
            C2215 c2215 = c3895.f12467;
            String algorithm = secretKey.getAlgorithm();
            c2215.getClass();
            InterfaceC5202 interfaceC5202M7390 = C2215.m7390(algorithm);
            interfaceC5202M7390.init(secretKey.getEncoded());
            interfaceC5202M7390.update(c0097.m26081(), iM26091, iM26092);
            System.arraycopy(interfaceC5202M7390.mo14975(), 0, c0097.m26081(), iM26091 + 48, 16);
        } catch (C8024 e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // l.AbstractC0803
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC5037 mo3028() {
        return (C23670) this.f7928.mo3028();
    }

    @Override // l.C16614
    public final String toString() {
        return "Signed(" + this.f7928.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16614 mo7973() {
        return this.f7928.mo7973();
    }
}
