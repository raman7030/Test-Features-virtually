package l;

import android.content.ContextWrapper;

/* JADX INFO: renamed from: l.᩻ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18S9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23729 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f76836;

    public C23729(ContextWrapper contextWrapper) {
        this.f76836 = contextWrapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m52377(C8353 c8353) {
        String str = c8353.f25614;
        if (str == null || !C9786.m24799(str)) {
            return C11010.m27348(0, 0, 0, 0);
        }
        String str2 = c8353.f25614;
        String str3 = C3603.f11424;
        str2.getClass();
        switch (str2) {
            case "image/avif":
                break;
            case "image/heic":
            case "image/heif":
                break;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return C11010.m27348(4, 0, 0, 0);
        }
        return C11010.m27348(1, 0, 0, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6796 m52378() {
        return new C6796(this.f76836);
    }
}
