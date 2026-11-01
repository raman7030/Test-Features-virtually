package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 27L2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20787 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10057 f65340;

    /* JADX INFO: renamed from: ۧ */
    public final Object f65341;

    /* JADX INFO: renamed from: ܽ */
    public final C4848 f65342;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC10057[] f65343;

    public C20787(final C8374 c8374, InterfaceC10057 interfaceC10057, InterfaceC10057[] interfaceC10057Arr) {
        this.f65340 = interfaceC10057;
        this.f65341 = interfaceC10057.mo5861(c8374);
        this.f65343 = interfaceC10057Arr;
        this.f65342 = (C4848) C18486.m42024of((Object[]) interfaceC10057Arr).map(new Function() { // from class: l.ᩴۢ۠
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((InterfaceC10057) obj).mo5861(c8374);
            }
        }).collect(C4848.m10284());
    }

    public final int hashCode() {
        return this.f65342.hashCode() + this.f65341.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20787)) {
            return false;
        }
        C20787 c20787 = (C20787) obj;
        return C12826.equals(this.f65341, c20787.f65341) && C12826.equals(this.f65342, c20787.f65342);
    }
}
