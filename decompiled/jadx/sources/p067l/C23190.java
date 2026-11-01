package p067l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes.dex */
public final class C23190 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m51662(InterfaceC19837 interfaceC19837, Object obj) {
        if (obj == null) {
            return null;
        }
        return interfaceC19837.mo6575(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Set m51664(Set set, InterfaceC19837 interfaceC19837) {
        return new C11120(set, interfaceC19837);
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m51663(InterfaceC19837 interfaceC19837, List list) {
        return new C17824(interfaceC19837, list);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterable m51661(Iterable iterable, InterfaceC19837 interfaceC19837) {
        return new C6426(iterable, interfaceC19837);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC4783 m51665(InterfaceC20980 interfaceC20980, C18236 c18236) {
        switch (interfaceC20980.mo5178()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C21179(interfaceC20980, c18236);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C3072(interfaceC20980, c18236);
            default:
                throw new C17034(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC20980.mo5178()));
        }
    }
}
