package p067l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZE */
/* JADX INFO: loaded from: classes.dex */
public class C24921 extends C11511 {

    /* JADX INFO: renamed from: ܽ */
    public static EnumSet f79588 = EnumSet.of(EnumC22240.NTLMSSP_NEGOTIATE_NTLM, EnumC22240.NTLMSSP_NEGOTIATE_UNICODE);

    /* JADX INFO: renamed from: ֫ */
    public Set f79589;

    /* JADX INFO: renamed from: ۧ */
    public C20899 f79590;

    public C24921(Set set, C20899 c20899) {
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) set);
        this.f79589 = enumSetCopyOf;
        enumSetCopyOf.addAll(f79588);
        this.f79590 = c20899;
    }
}
