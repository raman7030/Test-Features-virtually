package p067l;

/* JADX INFO: renamed from: l.ܿᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H401 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19029 {

    /* JADX INFO: renamed from: ֫ */
    public int f56731;

    /* JADX INFO: renamed from: ۧ */
    public C23623 f56732;

    /* JADX INFO: renamed from: ܽ */
    public C3606 f56733;

    public final String toString() {
        return "javac Messager";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43229(EnumC8400 enumC8400, String str) {
        C23623 c23623 = this.f56732;
        this.f56733.m6759().getClass();
        int i = C19700.f59883[enumC8400.ordinal()];
        if (i == 1) {
            this.f56731++;
            EnumC21417 enumC21417 = EnumC21417.API;
            String string = str.toString();
            C14040 c14040 = C8300.f21997;
            c23623.m9359(enumC21417, (InterfaceC5323) null, new C14040("compiler", "proc.messager", string));
            return;
        }
        if (i == 2) {
            String string2 = str.toString();
            C12895 c12895 = C15675.f45417;
            c23623.m9364((InterfaceC5323) null, new C12895("compiler", "proc.messager", string2));
        } else if (i == 3) {
            String string3 = str.toString();
            C12895 c12896 = C15675.f45417;
            c23623.m9351((InterfaceC5323) null, new C12895("compiler", "proc.messager", string3));
        } else {
            String string4 = str.toString();
            C15380 c15380 = C24393.f77212;
            c23623.m9353((AbstractC7257) null, new C15380("compiler", "proc.messager", string4));
        }
    }
}
