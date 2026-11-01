package p067l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ܽۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18138 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        AbstractC18809 abstractC18809 = (AbstractC18809) obj;
        int iOrdinal = abstractC18809.mo28851().ordinal();
        if (iOrdinal == 0) {
            return abstractC18809.mo40687().getPosition();
        }
        if (iOrdinal == 1) {
            return C5398.m11850((InterfaceC14919) abstractC18809.mo28850());
        }
        throw new AssertionError();
    }
}
