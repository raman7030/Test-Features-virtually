package p067l;

import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: l.ܰ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15389 extends AbstractC14049 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserPrincipalLookupService f43977a;

    @Override // p067l.AbstractC14049
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3515 mo31882a(String str) {
        return C3515.m6292a(this.f43977a.lookupPrincipalByGroupName(str));
    }

    @Override // p067l.AbstractC14049
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC13379 mo31883b(String str) {
        return C21621.m48825a(this.f43977a.lookupPrincipalByName(str));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.f43977a;
        if (obj instanceof C15389) {
            obj = ((C15389) obj).f43977a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f43977a.hashCode();
    }

    public C15389(UserPrincipalLookupService userPrincipalLookupService) {
        this.f43977a = userPrincipalLookupService;
    }
}
