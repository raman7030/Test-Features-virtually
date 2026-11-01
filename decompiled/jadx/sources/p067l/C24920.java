package p067l;

import android.content.ContextWrapper;

/* JADX INFO: renamed from: l.᩻ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18S9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24920 {

    /* JADX INFO: renamed from: ֫ */
    public final ContextWrapper f79587;

    public C24920(ContextWrapper contextWrapper) {
        this.f79587 = contextWrapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m54784(C10307 c10307) {
        String str = c10307.f28528;
        if (str == null || !C11669.m26814(str)) {
            return C12832.m29410(0, 0, 0, 0);
        }
        String str2 = c10307.f28528;
        String str3 = C5792.f14228;
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
                return C12832.m29410(4, 0, 0, 0);
        }
        return C12832.m29410(1, 0, 0, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8827 m54785() {
        return new C8827(this.f79587);
    }
}
