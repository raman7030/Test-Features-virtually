package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23646 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76595;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC13499 f76596;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f76597;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23646(C22235 c22235, Object[] objArr, int i, EnumC13499 enumC13499) {
        super("OkHttp %s stream %d", objArr);
        this.f76597 = c22235;
        this.f76595 = i;
        this.f76596 = enumC13499;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        C22235 c22235 = this.f76597;
        try {
            try {
                c22235.f72147.m16815(this.f76595, this.f76596);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            EnumC13499 enumC13499 = EnumC13499.PROTOCOL_ERROR;
            c22235.m49933(enumC13499, enumC13499);
        }
    }
}
