package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C6397 {
    /* JADX INFO: renamed from: ֫ */
    public static long m14638(Object obj) {
        long length;
        if (obj instanceof C10161) {
            length = ((C10161) obj).f28111;
        } else {
            if (obj instanceof C12825) {
                return ((C12825) obj).m29374() + 48;
            }
            if (!(obj instanceof C25172)) {
                if (obj instanceof C23161) {
                    return 112L;
                }
                if (obj instanceof C13773) {
                    return 88L;
                }
                throw new IllegalArgumentException("Unsupported text budget object");
            }
            length = ((long) ((C25172) obj).f80530.length) * 8;
        }
        return length + 112;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14639(Object obj, Consumer consumer) {
        if (obj instanceof C13773) {
            consumer.accept(((C13773) obj).f38939);
            return;
        }
        if (obj instanceof C25172) {
            for (AbstractC21820 abstractC21820 : ((C25172) obj).f80530) {
                consumer.accept(abstractC21820);
            }
            return;
        }
        if (obj instanceof C23161) {
            consumer.accept(((C23161) obj).m51622());
        }
    }
}
