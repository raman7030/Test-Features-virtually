package l;

/* JADX INFO: renamed from: l.᩻ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes.dex */
public final class C23598 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f76502;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23097 f76503;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9302 f76504;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f76505;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f76506;

    public C23598(InterfaceC7785 interfaceC7785, C23097 c23097, C9302 c9302) {
        this.f76505 = interfaceC7785;
        this.f76503 = c23097;
        this.f76504 = c9302;
        this.f76502 = interfaceC7785.mo26548();
        int length = interfaceC7785.length();
        this.f76506 = length;
        if (c9302.m23880() != length) {
            throw new IllegalArgumentException("Line background store length differs from text");
        }
    }
}
