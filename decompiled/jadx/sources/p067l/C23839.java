package p067l;

import java.util.Random;

/* JADX INFO: renamed from: l.᩹᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9FZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23839 {

    /* JADX INFO: renamed from: ֫ */
    public C21828 f75750;

    public C23839(Random random) {
        C21828 c21828 = new C21828();
        this.f75750 = c21828;
        c21828.f68675 = new C20899(EnumC6146.WINDOWS_MAJOR_VERSION_6, EnumC20228.WINDOWS_MINOR_VERSION_1, EnumC4805.NTLMSSP_REVISION_W2K3);
        c21828.f68673 = true;
        c21828.f68674 = new byte[32];
        random.nextBytes(c21828.f68674);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21828 m52906() {
        return new C21828(this.f75750);
    }
}
