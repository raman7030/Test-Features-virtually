package p067l;

/* JADX INFO: renamed from: l.ܰ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B4FX */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15197 {
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


    /* JADX INFO: renamed from: ᩸ */
    public final int f43378;

    EnumC15197(int i) {
        this.f43378 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC15197 m34631(int i) {
        for (EnumC15197 enumC15197 : values()) {
            if (enumC15197.f43378 == i) {
                return enumC15197;
            }
        }
        return null;
    }
}
