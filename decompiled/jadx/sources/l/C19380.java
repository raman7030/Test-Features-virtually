package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 27L2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19380 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8090 f62729;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f62730;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 f62731;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8090[] f62732;

    public C19380(final C6319 c6319, InterfaceC8090 interfaceC8090, InterfaceC8090[] interfaceC8090Arr) {
        this.f62729 = interfaceC8090;
        this.f62730 = interfaceC8090.mo3574(c6319);
        this.f62732 = interfaceC8090Arr;
        this.f62731 = (C2609) C16958.of((Object[]) interfaceC8090Arr).map(new Function() { // from class: l.ᩴۢ۠
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((InterfaceC8090) obj).mo3574(c6319);
            }
        }).collect(C2609.m8240());
    }

    public final int hashCode() {
        return this.f62731.hashCode() + this.f62730.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19380)) {
            return false;
        }
        C19380 c19380 = (C19380) obj;
        return C11003.equals(this.f62730, c19380.f62730) && C11003.equals(this.f62731, c19380.f62731);
    }
}
