package p067l;

import android.content.SharedPreferences;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܳ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27EO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16448 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17043 f48328 = C17853.f53284.m38684("term_text_font_custom.dat");

    /* JADX INFO: renamed from: ۧ */
    public static C1349 f48329;

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX INFO: renamed from: ֫ */
    public static Typeface m37366() {
        int i;
        C1349 c1349;
        SharedPreferences sharedPreferences = C7050.f18355;
        int i2 = 0;
        try {
            i = sharedPreferences.getInt("term_text_font", 0);
        } catch (ClassCastException unused) {
            try {
                i = Integer.parseInt(sharedPreferences.getString("term_text_font", null));
                sharedPreferences.edit().putInt("term_text_font", i).apply();
            } catch (Exception unused2) {
                sharedPreferences.edit().remove("term_text_font").apply();
                i = 0;
            }
        }
        if (i == 1) {
            if (C7050.f18355.getString("term_text_font_custom_md5", "").isEmpty() || !f48328.mo25094()) {
                sharedPreferences.edit().remove("term_text_font").apply();
            } else {
                i2 = i;
            }
        } else if (i != 0) {
            sharedPreferences.edit().remove("term_text_font").apply();
        } else {
            i2 = i;
        }
        if (i2 != 1) {
            return C7050.m16216();
        }
        synchronized (C16448.class) {
            String string = C7050.f18355.getString("term_text_font_custom_md5", "");
            c1349 = f48329;
            if (c1349 == null || !((String) c1349.f33658).equals(string)) {
                Typeface typefaceM16216 = C7050.m16216();
                if (string.isEmpty()) {
                    string = "";
                } else {
                    AbstractC17043 abstractC17043 = f48328;
                    if (abstractC17043.mo25094()) {
                        try {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(abstractC17043.mo25505());
                            if (typefaceCreateFromFile != null && typefaceCreateFromFile != Typeface.DEFAULT) {
                                typefaceM16216 = typefaceCreateFromFile;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        string = "";
                    }
                }
                C1349 c13410 = new C1349(string, typefaceM16216);
                f48329 = c13410;
                c1349 = c13410;
            }
        }
        return (Typeface) c1349.f33659;
    }
}
