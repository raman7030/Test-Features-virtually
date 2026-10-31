package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7484 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC13833 m20107(final int i, C16646 c16646) {
        if (EnumC13833.m33188(i)) {
            return EnumC13833.get(i);
        }
        c16646.ifPresent(new Consumer() { // from class: l.ۨ۬ۚ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC14251) obj).mo33899(Integer.valueOf(i));
            }
        });
        return EnumC13833.ITEM_UNKNOWN;
    }
}
