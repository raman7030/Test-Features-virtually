package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U7TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C3580 implements InterfaceC17006 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f11364 = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // l.InterfaceC17006
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4286 mo10955(C23188 c23188) {
        C9246 c9246M51434 = c23188.m51434();
        c9246M51434.m23723();
        char cM23725 = c9246M51434.m23725();
        if (cM23725 == '\n') {
            c9246M51434.m23723();
            return new C4286(new C23481(), c9246M51434.m23724());
        }
        if (!f11364.matcher(String.valueOf(cM23725)).matches()) {
            return new C4286(new C12897("\\"), c9246M51434.m23724());
        }
        c9246M51434.m23723();
        return new C4286(new C12897(String.valueOf(cM23725)), c9246M51434.m23724());
    }
}
