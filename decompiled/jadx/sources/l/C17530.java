package l;

/* JADX INFO: renamed from: l.ܿᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H401 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17530 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f53540;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22364 f53541;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1302 f53542;

    public final String toString() {
        return "javac Messager";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40970(EnumC6346 enumC6346, String str) {
        C22364 c22364 = this.f53541;
        this.f53542.m4527().getClass();
        int i = C18236.f56664[enumC6346.ordinal()];
        if (i == 1) {
            this.f53540++;
            EnumC20043 enumC20043 = EnumC20043.API;
            String string = str.toString();
            C12281 c12281 = C6241.f19132;
            c22364.m7280(enumC20043, (InterfaceC3109) null, new C12281("compiler", "proc.messager", string));
            return;
        }
        if (i == 2) {
            String string2 = str.toString();
            C11076 c11076 = C14001.f42334;
            c22364.m7285((InterfaceC3109) null, new C11076("compiler", "proc.messager", string2));
        } else if (i == 3) {
            String string3 = str.toString();
            C11076 c11077 = C14001.f42334;
            c22364.m7272((InterfaceC3109) null, new C11076("compiler", "proc.messager", string3));
        } else {
            String string4 = str.toString();
            C13691 c13691 = C23174.f74467;
            c22364.m7274((AbstractC5144) null, new C13691("compiler", "proc.messager", string4));
        }
    }
}
