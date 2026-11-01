package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9481 {
    /* JADX INFO: renamed from: ֫ */
    public static EnumC15515 m22083(final int i, C18189 c18189) {
        if (EnumC15515.m35306(i)) {
            return EnumC15515.get(i);
        }
        c18189.ifPresent(new Consumer() { // from class: l.ۨ۬ۚ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC15912) obj).mo36031(Integer.valueOf(i));
            }
        });
        return EnumC15515.ITEM_UNKNOWN;
    }
}
