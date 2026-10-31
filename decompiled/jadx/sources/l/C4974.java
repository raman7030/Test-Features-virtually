package l;

/* JADX INFO: renamed from: l.ۙ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 72QW */
/* JADX INFO: loaded from: classes3.dex */
public class C4974 implements InterfaceC18380 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo14437(String str) {
        return str;
    }

    @Override // l.InterfaceC18380
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4329(Object obj) {
        String str = (String) obj;
        if (str.length() <= 0 || str.charAt(0) != '[') {
            return mo14437(str);
        }
        int iLastIndexOf = str.lastIndexOf("[") + 1;
        return C16014.m37867(str.substring(0, iLastIndexOf), mo14437(str.substring(iLastIndexOf)));
    }
}
