package l;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* JADX INFO: renamed from: l.ۨ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11979 implements OpenOption {
    public final /* synthetic */ InterfaceC23579 a;

    public /* synthetic */ C11979(InterfaceC23579 interfaceC23579) {
        this.a = interfaceC23579;
    }

    public static /* synthetic */ OpenOption a(InterfaceC23579 interfaceC23579) {
        if (interfaceC23579 == null) {
            return null;
        }
        if (interfaceC23579 instanceof C3512) {
            return ((C3512) interfaceC23579).a;
        }
        if (!(interfaceC23579 instanceof EnumC14406)) {
            return interfaceC23579 instanceof EnumC3824 ? AbstractC22791.n((EnumC3824) interfaceC23579) : new C11979(interfaceC23579);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC23579 interfaceC23579 = this.a;
        if (obj instanceof C11979) {
            obj = ((C11979) obj).a;
        }
        return interfaceC23579.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
