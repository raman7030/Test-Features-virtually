package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ܽۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16593 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        AbstractC17299 abstractC17299 = (AbstractC17299) obj;
        int iOrdinal = abstractC17299.mo26812().ordinal();
        if (iOrdinal == 0) {
            return abstractC17299.mo38472().getPosition();
        }
        if (iOrdinal == 1) {
            return C3188.m9805((InterfaceC13206) abstractC17299.mo26811());
        }
        throw new AssertionError();
    }
}
