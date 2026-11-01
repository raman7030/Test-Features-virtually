package p067l;

import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܶܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9I0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16873 {
    /* JADX INFO: renamed from: ֫ */
    public static long m38438(Collection collection) {
        long value = 0;
        for (Object obj : collection) {
            if (obj instanceof InterfaceC22910) {
                value |= ((InterfaceC22910) obj).getValue();
            } else {
                throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
            }
        }
        return value;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumSet m38439(long j, Class cls) {
        if (!InterfaceC22910.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(cls);
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            if (m38441(j, (InterfaceC22910) obj)) {
                enumSetNoneOf.add(obj);
            }
        }
        return enumSetNoneOf;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38441(long j, InterfaceC22910 interfaceC22910) {
        return (j & interfaceC22910.getValue()) > 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC22910 m38440(long j, Class cls, EnumC9460 enumC9460) {
        for (InterfaceC22910 interfaceC22910 : (InterfaceC22910[]) cls.getEnumConstants()) {
            if (interfaceC22910.getValue() == j) {
                return interfaceC22910;
            }
        }
        return enumC9460;
    }
}
