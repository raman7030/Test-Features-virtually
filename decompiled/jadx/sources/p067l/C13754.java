package p067l;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* JADX INFO: renamed from: l.ۨ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13754 implements OpenOption {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC24778 f38878a;

    public /* synthetic */ C13754(InterfaceC24778 interfaceC24778) {
        this.f38878a = interfaceC24778;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ OpenOption m31339a(InterfaceC24778 interfaceC24778) {
        if (interfaceC24778 == null) {
            return null;
        }
        if (interfaceC24778 instanceof C5707) {
            return ((C5707) interfaceC24778).f13968a;
        }
        if (!(interfaceC24778 instanceof EnumC16060)) {
            return interfaceC24778 instanceof EnumC6003 ? AbstractC24029.m53245n((EnumC6003) interfaceC24778) : new C13754(interfaceC24778);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC24778 interfaceC24778 = this.f38878a;
        if (obj instanceof C13754) {
            obj = ((C13754) obj).f38878a;
        }
        return interfaceC24778.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f38878a.hashCode();
    }
}
