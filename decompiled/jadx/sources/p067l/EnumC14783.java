package p067l;

/* JADX INFO: renamed from: l.۬ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC14783 {
    REF_GETFIELD((byte) 1, "REF_getField", "REF_GETFIELD"),
    REF_GETSTATIC((byte) 2, "REF_getStatic", "REF_GETSTATIC"),
    REF_PUTFIELD((byte) 3, "REF_putField", "REF_PUTFIELD"),
    REF_PUTSTATIC((byte) 4, "REF_putStatic", "REF_PUTSTATIC"),
    REF_INVOKEVIRTUAL((byte) 5, "REF_invokeVirtual", "REF_INVOKEVIRTUAL"),
    REF_INVOKESTATIC((byte) 6, "REF_invokeStatic", "REF_INVOKESTATIC"),
    REF_INVOKESPECIAL((byte) 7, "REF_invokeSpecial", "REF_INVOKESPECIAL"),
    REF_NEWINVOKESPECIAL((byte) 8, "REF_newInvokeSpecial", "REF_NEWINVOKESPECIAL"),
    REF_INVOKEINTERFACE((byte) 9, "REF_invokeInterface", "REF_INVOKEINTERFACE");


    /* JADX INFO: renamed from: ᩶ */
    public final Byte f42148;

    /* JADX INFO: renamed from: ᩸ */
    public final String f42149;

    /* JADX INFO: renamed from: ᩹ */
    public final String f42150;

    EnumC14783(byte b, String str, String str2) {
        this.f42148 = Byte.valueOf(b);
        this.f42150 = str;
        this.f42149 = str2;
    }

    /* JADX INFO: renamed from: ۧ */
    public byte m33722() {
        return this.f42148.byteValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public String m33721() {
        return this.f42149;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C10965.m25286(new StringBuilder("<"), this.f42150, "> ");
    }
}
