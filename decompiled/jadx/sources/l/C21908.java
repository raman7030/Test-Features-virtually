package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes.dex */
public final class C21908 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m49309(InterfaceC18380 interfaceC18380, Object obj) {
        if (obj == null) {
            return null;
        }
        return interfaceC18380.mo4329(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m49311(Set set, InterfaceC18380 interfaceC18380) {
        return new C9208(set, interfaceC18380);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m49310(InterfaceC18380 interfaceC18380, List list) {
        return new C16262(interfaceC18380, list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterable m49308(Iterable iterable, InterfaceC18380 interfaceC18380) {
        return new C4269(iterable, interfaceC18380);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2541 m49312(InterfaceC19583 interfaceC19583, C16696 c16696) {
        switch (interfaceC19583.mo2849()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C19792(interfaceC19583, c16696);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C0740(interfaceC19583, c16696);
            default:
                throw new C15431(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC19583.mo2849()));
        }
    }
}
