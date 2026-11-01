package p067l;

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

/* JADX INFO: renamed from: l.ۖ۬ */
/* JADX INFO: compiled from: O19Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0968 extends C1808 {
    /* JADX INFO: renamed from: ֫ */
    public static int m10080(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Font m10081(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM10080 = m10080(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM10081 = m10080(fontStyle, font2.getStyle());
            if (iM10081 < iM10080) {
                font = font2;
                iM10080 = iM10081;
            }
        }
        return font;
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final C1699 mo10086(int i, C1699[] c1699Arr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10083(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10085(Context context, C1699[] c1699Arr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C1699 c1699 : c1699Arr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c1699.m42814(), "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c1699.m42816()).setSlant(c1699.m42815() ? 1 : 0).setTtcIndex(c1699.m42813()).build();
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
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m10081(fontFamilyBuild, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10084(Context context, C1304 c1304, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C1269 c1269 : c1304.m25902()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c1269.m24318()).setWeight(c1269.m24321()).setSlant(c1269.m24319() ? 1 : 0).setTtcIndex(c1269.m24320()).setFontVariationSettings(c1269.m24322()).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m10081(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10082(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
