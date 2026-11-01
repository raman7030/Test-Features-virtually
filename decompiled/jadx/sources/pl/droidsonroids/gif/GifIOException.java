package pl.droidsonroids.gif;

import java.io.IOException;
import p067l.EnumC19439;

/* JADX INFO: loaded from: classes2.dex */
public class GifIOException extends IOException {
    public static final long serialVersionUID = 13038402904505L;

    /* JADX INFO: renamed from: ᩸ */
    public final String f81814;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC19439 f81815;

    @Override // java.lang.Throwable
    public final String getMessage() {
        EnumC19439 enumC19439 = this.f81815;
        String str = this.f81814;
        if (str == null) {
            return enumC19439.m44205();
        }
        return enumC19439.m44205() + ": " + str;
    }

    public GifIOException(int i, String str) {
        this.f81815 = EnumC19439.m44202(i);
        this.f81814 = str;
    }
}
