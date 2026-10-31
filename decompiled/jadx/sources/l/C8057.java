package l;

import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

/* JADX INFO: renamed from: l.۠۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8057 implements InterfaceC22667 {
    public final /* synthetic */ CopyOption a;

    public /* synthetic */ C8057(CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.file.StandardCopyOption, l.᩺֨ᩴ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.nio.file.StandardCopyOption, l.᩺֨ᩴ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.StandardCopyOption, l.᩺֨ᩴ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.nio.file.LinkOption, l.᩺֨ᩴ] */
    public static /* synthetic */ InterfaceC22667 a(CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C3323) {
            return ((C3323) copyOption).a;
        }
        if (copyOption instanceof EnumC14406) {
            return LinkOption.NOFOLLOW_LINKS;
        }
        if (!(copyOption instanceof EnumC2413)) {
            return new C8057(copyOption);
        }
        EnumC2413 enumC2413 = (EnumC2413) copyOption;
        if (enumC2413 == EnumC2413.REPLACE_EXISTING) {
            return StandardCopyOption.REPLACE_EXISTING;
        }
        return enumC2413 == EnumC2413.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.a;
        if (obj instanceof C8057) {
            obj = ((C8057) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
