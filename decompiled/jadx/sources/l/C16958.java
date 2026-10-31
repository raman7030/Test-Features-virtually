package l;

/* JADX INFO: renamed from: l.ܽ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16958 {
    public static InterfaceC17664 empty() {
        return C14841.stream(C22291.a, false);
    }

    public static InterfaceC17664 of(Object obj) {
        C23121 c23121 = new C23121();
        c23121.b = obj;
        c23121.a = -2;
        return C14841.stream(c23121, false);
    }

    public static InterfaceC17664 of(Object... objArr) {
        return C22311.stream(objArr);
    }
}
