package p067l;

import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

/* JADX INFO: renamed from: l.۠۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10026 implements InterfaceC23911 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CopyOption f27774a;

    public /* synthetic */ C10026(CopyOption copyOption) {
        this.f27774a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.file.StandardCopyOption, l.᩺֨ᩴ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.nio.file.StandardCopyOption, l.᩺֨ᩴ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.StandardCopyOption, l.᩺֨ᩴ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.nio.file.LinkOption, l.᩺֨ᩴ] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC23911 m23406a(CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C5527) {
            return ((C5527) copyOption).f13217a;
        }
        if (copyOption instanceof EnumC16060) {
            return LinkOption.NOFOLLOW_LINKS;
        }
        if (!(copyOption instanceof EnumC4662)) {
            return new C10026(copyOption);
        }
        EnumC4662 enumC4662 = (EnumC4662) copyOption;
        if (enumC4662 == EnumC4662.REPLACE_EXISTING) {
            return StandardCopyOption.REPLACE_EXISTING;
        }
        return enumC4662 == EnumC4662.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.f27774a;
        if (obj instanceof C10026) {
            obj = ((C10026) obj).f27774a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f27774a.hashCode();
    }
}
