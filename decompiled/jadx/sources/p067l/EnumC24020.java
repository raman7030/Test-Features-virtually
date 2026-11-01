package p067l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.᩺ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24020 {
    START_POS(new C12934(1)),
    FIRST_STAT_POS(new C7927()),
    END_POS(new C13292());


    /* JADX INFO: renamed from: ᩸ */
    public final ToIntFunction f76296;

    EnumC24020(ToIntFunction toIntFunction) {
        this.f76296 = toIntFunction;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m53206(AbstractC7257 abstractC7257) {
        return this.f76296.applyAsInt(abstractC7257);
    }
}
