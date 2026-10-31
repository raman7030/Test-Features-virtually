package l;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* JADX INFO: renamed from: l.ۗ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3512 implements InterfaceC23579 {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ C3512(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.file.StandardOpenOption, l.᩻۠ᩴ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.LinkOption, l.᩻۠ᩴ] */
    public static /* synthetic */ InterfaceC23579 a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof C11979) {
            return ((C11979) openOption).a;
        }
        if (!(openOption instanceof EnumC14406)) {
            return openOption instanceof EnumC3824 ? AbstractC22791.n((EnumC3824) openOption) : new C3512(openOption);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof C3512) {
            obj = ((C3512) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
