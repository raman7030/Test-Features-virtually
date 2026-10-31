package l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O19Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C2540 extends C19474 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8049(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Font m8050(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM8049 = m8049(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM80410 = m8049(fontStyle, font2.getStyle());
            if (iM80410 < iM8049) {
                font = font2;
                iM8049 = iM80410;
            }
        }
        return font;
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17275 mo8055(int i, C17275[] c17275Arr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Typeface mo8052(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C17275 c17275 : c17275Arr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c17275.m40565(), "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c17275.m40567()).setSlant(c17275.m40566() ? 1 : 0).setTtcIndex(c17275.m40564()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builder != null) {
                FontFamily fontFamilyBuild = builder.build();
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m8050(fontFamilyBuild, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C8602 c8602 : c9308.m23893()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c8602.m22349()).setWeight(c8602.m22352()).setSlant(c8602.m22350() ? 1 : 0).setTtcIndex(c8602.m22351()).setFontVariationSettings(c8602.m22353()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m8050(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Typeface mo8051(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
