package l;

import android.content.pm.ShortcutManager;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: renamed from: l.᩶ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20087 implements InterfaceC7961, InterfaceC7397, InterfaceC21013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65052;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ ShortcutManager m46303(Object obj) {
        return (ShortcutManager) obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m46304(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "count is negative: "));
        }
        int length = str.length();
        if (i == 0 || length == 0) {
            return "";
        }
        if (i == 1) {
            return str;
        }
        if (str.length() <= Integer.MAX_VALUE / i) {
            StringBuilder sb = new StringBuilder(length * i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(str);
            }
            return sb.toString();
        }
        throw new OutOfMemoryError("Repeating " + str.length() + " bytes String " + i + " times will produce a String exceeding maximum size.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46305(int i, String str, StringBuilder sb) {
        sb.append(str.substring(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46306(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    @Override // l.InterfaceC7397
    /* JADX INFO: renamed from: ֫ */
    public boolean mo12795(String str) {
        return true;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f65052) {
            case 5:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        return new ConcurrentSkipListMap();
    }
}
