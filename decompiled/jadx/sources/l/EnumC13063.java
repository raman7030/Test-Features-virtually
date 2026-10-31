package l;

/* JADX INFO: renamed from: l.۬ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13063 {
    REF_GETFIELD((byte) 1, "REF_getField", "REF_GETFIELD"),
    REF_GETSTATIC((byte) 2, "REF_getStatic", "REF_GETSTATIC"),
    REF_PUTFIELD((byte) 3, "REF_putField", "REF_PUTFIELD"),
    REF_PUTSTATIC((byte) 4, "REF_putStatic", "REF_PUTSTATIC"),
    REF_INVOKEVIRTUAL((byte) 5, "REF_invokeVirtual", "REF_INVOKEVIRTUAL"),
    REF_INVOKESTATIC((byte) 6, "REF_invokeStatic", "REF_INVOKESTATIC"),
    REF_INVOKESPECIAL((byte) 7, "REF_invokeSpecial", "REF_INVOKESPECIAL"),
    REF_NEWINVOKESPECIAL((byte) 8, "REF_newInvokeSpecial", "REF_NEWINVOKESPECIAL"),
    REF_INVOKEINTERFACE((byte) 9, "REF_invokeInterface", "REF_INVOKEINTERFACE");


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Byte f39100;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f39101;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f39102;

    EnumC13063(byte b, String str, String str2) {
        this.f39100 = Byte.valueOf(b);
        this.f39102 = str;
        this.f39101 = str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte m31635() {
        return this.f39100.byteValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m31634() {
        return this.f39101;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C9045.m23341(new StringBuilder("<"), this.f39102, "> ");
    }
}
