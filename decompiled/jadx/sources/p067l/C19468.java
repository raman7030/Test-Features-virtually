package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19468 implements InterfaceC11100 {
    @Override // p067l.InterfaceC11100
    /* JADX INFO: renamed from: ֫ */
    public final int mo10800(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return 0;
        }
        return str.toLowerCase(Locale.ROOT).hashCode();
    }

    @Override // p067l.InterfaceC11100
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10801(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str != str2) {
            return (str == null || str2 == null || !str.equalsIgnoreCase(str2)) ? false : true;
        }
        return true;
    }
}
