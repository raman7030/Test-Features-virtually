package p067l;

/* JADX INFO: renamed from: l.۟᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35R0 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9677 {
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


    /* JADX INFO: renamed from: ᩸ */
    public int f26671;

    EnumC9677(int i) {
        this.f26671 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m22553() {
        return (this.f26671 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m22554() {
        return (this.f26671 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m22555() {
        return (this.f26671 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean m22556() {
        return (this.f26671 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean m22557() {
        return (this.f26671 & 8) != 0;
    }
}
