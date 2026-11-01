package p067l;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* JADX INFO: renamed from: l.ۗ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5707 implements InterfaceC24778 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OpenOption f13968a;

    public /* synthetic */ C5707(OpenOption openOption) {
        this.f13968a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.file.StandardOpenOption, l.᩻۠ᩴ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.LinkOption, l.᩻۠ᩴ] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC24778 m12701a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof C13754) {
            return ((C13754) openOption).f38878a;
        }
        if (!(openOption instanceof EnumC16060)) {
            return openOption instanceof EnumC6003 ? AbstractC24029.m53245n((EnumC6003) openOption) : new C5707(openOption);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.f13968a;
        if (obj instanceof C5707) {
            obj = ((C5707) obj).f13968a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f13968a.hashCode();
    }
}
