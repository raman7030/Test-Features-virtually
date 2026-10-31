package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4KR */
/* JADX INFO: loaded from: classes.dex */
public final class C22152 extends AbstractC21447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15300 f71897;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC14915 f71898;

    public C22152(int i, C15300 c15300, InterfaceC14915 interfaceC14915) {
        super(i, -1);
        this.f71898 = interfaceC14915;
        this.f71897 = c15300;
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) throws IOException {
        c3438.getClass();
        c3438.write(".end local ", 0, 11);
        InterfaceC14915 interfaceC14915 = this.f71898;
        this.f71897.m36320(c3438, interfaceC14915.mo23290());
        String name = interfaceC14915.getName();
        String type = interfaceC14915.getType();
        String signature = interfaceC14915.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c3438.write("  # ", 0, 4);
        C3102.m9464(c3438, name, type, signature);
        return true;
    }
}
