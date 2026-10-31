package l;

/* JADX INFO: renamed from: l.۟᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35R0 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7690 {
    LOCAL_START(1),
    LOCAL_END(1),
    ASSIGN(17),
    IDENTITY(1),
    LABEL(1),
    LOCK(9),
    NOP(1),
    UNLOCK(9),
    VOID_INVOKE(9),
    FILL_ARRAY_DATA(9),
    RETURN(16),
    RETURN_VOID(0),
    THROW(8),
    GOTO(2),
    IF(19),
    LOOKUP_SWITCH(20),
    TABLE_SWITCH(20);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23758;

    EnumC7690(int i) {
        this.f23758 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m20573() {
        return (this.f23758 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m20574() {
        return (this.f23758 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m20575() {
        return (this.f23758 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m20576() {
        return (this.f23758 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m20577() {
        return (this.f23758 & 8) != 0;
    }
}
