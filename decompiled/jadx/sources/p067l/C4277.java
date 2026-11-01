package p067l;

import java.util.ServiceLoader;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A7L5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4277 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC7888 m8690(String str) {
        int iIndexOf = str.indexOf(":");
        final String strSubstring = iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
        return (InterfaceC7888) C16474.stream(C21230.spliterator(ServiceLoader.load(InterfaceC23981.class, C17412.class.getClassLoader())), false).filter(new Predicate() { // from class: l.ܰۘ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m34726or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C4277.m8691(strSubstring, (InterfaceC23981) obj);
            }
        }).findFirst().flatMap(new C24721(strSubstring, iIndexOf != -1 ? str.substring(iIndexOf + 1) : "")).orElse(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m8691(final String str, InterfaceC23981 interfaceC23981) {
        InterfaceC19157 interfaceC19157Stream = C16474.stream(C21230.spliterator(interfaceC23981.m53154()), false);
        C12826.requireNonNull(str);
        return interfaceC19157Stream.anyMatch(new Predicate() { // from class: l.۟ۘ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m21266or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals((String) obj);
            }
        });
    }
}
