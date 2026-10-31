package l;

/* JADX INFO: renamed from: l.ܰ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B4FX */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13499 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f40308;

    EnumC13499(int i) {
        this.f40308 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC13499 m32529(int i) {
        for (EnumC13499 enumC13499 : values()) {
            if (enumC13499.f40308 == i) {
                return enumC13499;
            }
        }
        return null;
    }
}
