package p067l;

/* JADX INFO: renamed from: l.ۙ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 72QW */
/* JADX INFO: loaded from: classes3.dex */
public class C7096 implements InterfaceC19837 {
    /* JADX INFO: renamed from: ֫ */
    public String mo16341(String str) {
        return str;
    }

    @Override // p067l.InterfaceC19837
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6575(Object obj) {
        String str = (String) obj;
        if (str.length() <= 0 || str.charAt(0) != '[') {
            return mo16341(str);
        }
        int iLastIndexOf = str.lastIndexOf("[") + 1;
        return C17588.m40053(str.substring(0, iLastIndexOf), mo16341(str.substring(iLastIndexOf)));
    }
}
