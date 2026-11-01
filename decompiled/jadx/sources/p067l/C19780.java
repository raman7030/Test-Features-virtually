package p067l;

/* JADX INFO: renamed from: l.ᩳ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B3ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C19780 {

    /* JADX INFO: renamed from: ֫ */
    public final C18258 f60180;

    public C19780(C18258 c18258) {
        this.f60180 = c18258;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m44954(AbstractC14355 abstractC14355) {
        C18258 c18258 = this.f60180;
        C16051 c16051M41591 = c18258.m41591();
        long lineNumber = c18258.getLineNumber();
        long jM36526 = c16051M41591.m36526(abstractC14355.f18924);
        long jM36523 = c16051M41591.m36523(abstractC14355.f18924, false);
        if (jM36526 == lineNumber) {
            return String.valueOf(jM36523);
        }
        return jM36526 + ":" + jM36523;
    }
}
