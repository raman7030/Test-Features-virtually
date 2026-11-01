package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16696 {
    BYTE(new C4628()),
    SHORT(new C20051()),
    INT(new C22363(1)),
    LONG(new C20722()),
    FLOAT(new C2615()),
    DOUBLE(new C8826(1)),
    CHAR(new C7310()),
    BOOLEAN(new C3286(0)),
    OBJECT(new C9992()),
    STRING(new C5969()),
    BOT(new C16201(1));


    /* JADX INFO: renamed from: ᩸ */
    public final Function f49186;

    EnumC16696(Function function) {
        this.f49186 = function;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 m37853(C22004 c22004) {
        return (AbstractC6462) this.f49186.apply(c22004);
    }
}
