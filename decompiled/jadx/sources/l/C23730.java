package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZE */
/* JADX INFO: loaded from: classes.dex */
public class C23730 extends C9620 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumSet f76837 = EnumSet.of(EnumC20909.NTLMSSP_NEGOTIATE_NTLM, EnumC20909.NTLMSSP_NEGOTIATE_UNICODE);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Set f76838;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19498 f76839;

    public C23730(Set set, C19498 c19498) {
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) set);
        this.f76838 = enumSetCopyOf;
        enumSetCopyOf.addAll(f76837);
        this.f76839 = c19498;
    }
}
