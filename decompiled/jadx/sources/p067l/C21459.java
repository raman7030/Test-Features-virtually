package p067l;

import android.content.pm.ShortcutManager;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: renamed from: l.᩶ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21459 implements InterfaceC9934, InterfaceC1209, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f67692;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ ShortcutManager m48619(Object obj) {
        return (ShortcutManager) obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ String m48620(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "count is negative: "));
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

    /* JADX INFO: renamed from: ֫ */
    public static String m48621(int i, String str, StringBuilder sb) {
        sb.append(str.substring(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m48622(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    @Override // p067l.InterfaceC1209
    /* JADX INFO: renamed from: ֫ */
    public boolean mo14675(String str) {
        return true;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f67692) {
            case 5:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        return new ConcurrentSkipListMap();
    }
}
