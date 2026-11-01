package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩵۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E61U */
/* JADX INFO: loaded from: classes5.dex */
public final class C20721 extends AbstractC22218 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f63959;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Set f63960;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f63961;

    public C20721(String str, String str2, Set set) {
        this.f63960 = set;
        this.f63961 = str;
        this.f63959 = str2;
    }

    @Override // p067l.InterfaceC2461
    public final Set getAnnotations() {
        return this.f63960;
    }

    @Override // p067l.InterfaceC2461, p067l.InterfaceC23250
    public final String getName() {
        return this.f63961;
    }

    @Override // p067l.InterfaceC22991
    public final String getType() {
        return this.f63959;
    }
}
