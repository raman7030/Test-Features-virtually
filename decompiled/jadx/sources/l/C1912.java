package l;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: l.֫ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1912 extends UserPrincipalLookupService {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ AbstractC12290 a;

    public /* synthetic */ C1912(AbstractC12290 abstractC12290) {
        this.a = abstractC12290;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC12290 abstractC12290 = this.a;
        if (obj instanceof C1912) {
            obj = ((C1912) obj).a;
        }
        return abstractC12290.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ GroupPrincipal lookupPrincipalByGroupName(String str) {
        C1206 c1206A = this.a.a(str);
        if (c1206A == null) {
            return null;
        }
        return c1206A.a;
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ UserPrincipal lookupPrincipalByName(String str) {
        return C10174.a(this.a.b(str));
    }
}
