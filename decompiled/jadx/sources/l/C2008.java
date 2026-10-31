package l;

import java.util.ServiceLoader;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A7L5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2008 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5808 m6548(String str) {
        int iIndexOf = str.indexOf(":");
        final String strSubstring = iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
        return (InterfaceC5808) C14841.stream(C19846.spliterator(ServiceLoader.load(InterfaceC22741.class, C15829.class.getClassLoader())), false).filter(new Predicate() { // from class: l.ܰۘ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C2008.m6549(strSubstring, (InterfaceC22741) obj);
            }
        }).findFirst().flatMap(new C23519(strSubstring, iIndexOf != -1 ? str.substring(iIndexOf + 1) : "")).orElse(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m6549(final String str, InterfaceC22741 interfaceC22741) {
        InterfaceC17664 interfaceC17664Stream = C14841.stream(C19846.spliterator(interfaceC22741.m50821()), false);
        C11003.requireNonNull(str);
        return interfaceC17664Stream.anyMatch(new Predicate() { // from class: l.۟ۘ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals((String) obj);
            }
        });
    }
}
