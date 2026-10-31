package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15076 {
    BYTE(new C2378()),
    SHORT(new C18606()),
    INT(new C21038(1)),
    LONG(new C19312()),
    FLOAT(new C0260()),
    DOUBLE(new C6795(1)),
    CHAR(new C5200()),
    BOOLEAN(new C0966(0)),
    OBJECT(new C8022()),
    STRING(new C3789()),
    BOT(new C14555(1));


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Function f46068;

    EnumC15076(Function function) {
        this.f46068 = function;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4308 m35695(C20661 c20661) {
        return (AbstractC4308) this.f46068.apply(c20661);
    }
}
