package l;

import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: l.ܰ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13700 extends AbstractC12290 {
    public final /* synthetic */ UserPrincipalLookupService a;

    @Override // l.AbstractC12290
    public final /* synthetic */ C1206 a(String str) {
        return C1206.a(this.a.lookupPrincipalByGroupName(str));
    }

    @Override // l.AbstractC12290
    public final /* synthetic */ InterfaceC11585 b(String str) {
        return C20257.a(this.a.lookupPrincipalByName(str));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof C13700) {
            obj = ((C13700) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public C13700(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }
}
