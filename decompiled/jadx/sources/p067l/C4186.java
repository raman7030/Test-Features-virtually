package p067l;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: l.֫ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4186 extends UserPrincipalLookupService {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f9217b = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC14049 f9218a;

    public /* synthetic */ C4186(AbstractC14049 abstractC14049) {
        this.f9218a = abstractC14049;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC14049 abstractC14049 = this.f9218a;
        if (obj instanceof C4186) {
            obj = ((C4186) obj).f9218a;
        }
        return abstractC14049.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f9218a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ GroupPrincipal lookupPrincipalByGroupName(String str) {
        C3515 c3515Mo31882a = this.f9218a.mo31882a(str);
        if (c3515Mo31882a == null) {
            return null;
        }
        return c3515Mo31882a.f7124a;
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ UserPrincipal lookupPrincipalByName(String str) {
        return C12038.m27552a(this.f9218a.mo31883b(str));
    }
}
