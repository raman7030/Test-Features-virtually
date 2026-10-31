package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܶ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A8E */
/* JADX INFO: loaded from: classes4.dex */
public final class C15514 implements InterfaceC13431 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f47414;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f47415;

    public C15514(String str, String str2) {
        this.f47415 = str;
        this.f47414 = str2;
    }

    @Override // l.InterfaceC13431
    /* JADX INFO: renamed from: ֫ */
    public final C8743 mo10819(C18621 c18621) {
        if (c18621.m43168().m22615("Authorization") != null) {
            return null;
        }
        int i = C14746.f45027;
        Charset charset = StandardCharsets.UTF_8;
        String strM2046 = C0459.m2046(this.f47415, this.f47414);
        C9449 c9449M22618 = c18621.m43168().m22618();
        c9449M22618.m24283("Authorization", strM2046);
        return c9449M22618.m24274();
    }
}
