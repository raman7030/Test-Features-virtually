package pl.droidsonroids.gif;

import java.io.IOException;
import l.EnumC17962;

/* JADX INFO: loaded from: classes2.dex */
public class GifIOException extends IOException {
    public static final long serialVersionUID = 13038402904505L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f77901;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC17962 f77902;

    @Override // java.lang.Throwable
    public final String getMessage() {
        EnumC17962 enumC17962 = this.f77902;
        String str = this.f77901;
        if (str == null) {
            return enumC17962.m41956();
        }
        return enumC17962.m41956() + ": " + str;
    }

    public GifIOException(int i, String str) {
        this.f77902 = EnumC17962.m41953(i);
        this.f77901 = str;
    }
}
