package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17992 implements InterfaceC9187 {
    @Override // l.InterfaceC9187
    /* JADX INFO: renamed from: ֫ */
    public final int mo8733(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return 0;
        }
        return str.toLowerCase(Locale.ROOT).hashCode();
    }

    @Override // l.InterfaceC9187
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8734(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str != str2) {
            return (str == null || str2 == null || !str.equalsIgnoreCase(str2)) ? false : true;
        }
        return true;
    }
}
