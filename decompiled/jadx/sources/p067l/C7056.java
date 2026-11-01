package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۙ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7056 implements InterfaceC24263 {

    /* JADX INFO: renamed from: ֫ */
    public final String f18395;

    /* JADX INFO: renamed from: ۧ */
    public final String f18396;

    public C7056(String str, String str2) {
        this.f18396 = str;
        this.f18395 = str2;
    }

    @Override // p067l.InterfaceC24263
    /* JADX INFO: renamed from: ֫ */
    public final C20066 mo9467(C9833 c9833) {
        C11349 c11349M24587 = c9833.m23010().m24587();
        int i = C16383.f48140;
        Charset charset = StandardCharsets.UTF_8;
        c11349M24587.m26293("Authorization", C2805.m4426(this.f18396, this.f18395));
        return c9833.m23001(c11349M24587.m26284());
    }
}
