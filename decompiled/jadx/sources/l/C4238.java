package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C4238 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m12763(Object obj) {
        long length;
        if (obj instanceof C8199) {
            length = ((C8199) obj).f25201;
        } else {
            if (obj instanceof C11002) {
                return ((C11002) obj).m27312() + 48;
            }
            if (!(obj instanceof C23993)) {
                if (obj instanceof C21877) {
                    return 112L;
                }
                if (obj instanceof C11999) {
                    return 88L;
                }
                throw new IllegalArgumentException("Unsupported text budget object");
            }
            length = ((long) ((C23993) obj).f77779.length) * 8;
        }
        return length + 112;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12764(Object obj, Consumer consumer) {
        if (obj instanceof C11999) {
            consumer.accept(((C11999) obj).f35929);
            return;
        }
        if (obj instanceof C23993) {
            for (AbstractC20466 abstractC20466 : ((C23993) obj).f77779) {
                consumer.accept(abstractC20466);
            }
            return;
        }
        if (obj instanceof C21877) {
            consumer.accept(((C21877) obj).m49270());
        }
    }
}
