package l;

import java.util.Random;

/* JADX INFO: renamed from: l.᩹᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9FZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22591 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20475 f73023;

    public C22591(Random random) {
        C20475 c20475 = new C20475();
        this.f73023 = c20475;
        c20475.f65998 = new C19498(EnumC3975.WINDOWS_MAJOR_VERSION_6, EnumC18792.WINDOWS_MINOR_VERSION_1, EnumC2564.NTLMSSP_REVISION_W2K3);
        c20475.f65996 = true;
        c20475.f65997 = new byte[32];
        random.nextBytes(c20475.f65997);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20475 m50564() {
        return new C20475(this.f73023);
    }
}
