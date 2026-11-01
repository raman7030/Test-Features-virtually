package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܶ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A8E */
/* JADX INFO: loaded from: classes4.dex */
public final class C17113 implements InterfaceC15134 {

    /* JADX INFO: renamed from: ۧ */
    public String f50546;

    /* JADX INFO: renamed from: ܽ */
    public String f50547;

    public C17113(String str, String str2) {
        this.f50547 = str;
        this.f50546 = str2;
    }

    @Override // p067l.InterfaceC15134
    /* JADX INFO: renamed from: ֫ */
    public final C10678 mo12799(C20066 c20066) {
        if (c20066.m45434().m24584("Authorization") != null) {
            return null;
        }
        int i = C16383.f48140;
        Charset charset = StandardCharsets.UTF_8;
        String strM4426 = C2805.m4426(this.f50547, this.f50546);
        C11349 c11349M24587 = c20066.m45434().m24587();
        c11349M24587.m26293("Authorization", strM4426);
        return c11349M24587.m26284();
    }
}
