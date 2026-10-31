package l;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20084 implements InterfaceC19087 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4561 f65024;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21289 f65025;

    public C20084(C21289 c21289, C4561 c4561) {
        this.f65025 = c21289;
        this.f65024 = c4561;
    }

    @Override // l.InterfaceC19087
    /* JADX INFO: renamed from: ֫ */
    public final long mo43979(OutputStream outputStream) {
        C4561 c4561 = this.f65024;
        C3150 c3150 = new C3150((FilterOutputStream) outputStream);
        try {
            long jM48316 = this.f65025.m48316(c3150);
            if (jM48316 != c3150.f9841) {
                throw C12322.m29878("Local source byte count does not match bytes written.");
            }
            C4561.m13415(c4561, c3150);
            return jM48316;
        } catch (Throwable th) {
            C4561.m13415(c4561, c3150);
            throw th;
        }
    }

    @Override // l.InterfaceC19087
    /* JADX INFO: renamed from: ֫ */
    public final void mo43980(long j) {
        this.f65025.m48317(j);
    }
}
