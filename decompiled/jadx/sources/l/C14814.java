package l;

import android.content.SharedPreferences;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܳ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27EO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14814 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f45212 = C16293.f50117.m36526("term_text_font_custom.dat");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10220 f45213;

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m35218() {
        int i;
        C10220 c10220;
        SharedPreferences sharedPreferences = C4925.f15523;
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
            if (C4925.f15523.getString("term_text_font_custom_md5", "").isEmpty() || !f45212.mo23120()) {
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
            return C4925.m14319();
        }
        synchronized (C14814.class) {
            String string = C4925.f15523.getString("term_text_font_custom_md5", "");
            c10220 = f45213;
            if (c10220 == null || !((String) c10220.f30697).equals(string)) {
                Typeface typefaceM14319 = C4925.m14319();
                if (string.isEmpty()) {
                    string = "";
                } else {
                    AbstractC15440 abstractC15440 = f45212;
                    if (abstractC15440.mo23120()) {
                        try {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(abstractC15440.mo23554());
                            if (typefaceCreateFromFile != null && typefaceCreateFromFile != Typeface.DEFAULT) {
                                typefaceM14319 = typefaceCreateFromFile;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        string = "";
                    }
                }
                C10220 c10221 = new C10220(string, typefaceM14319);
                f45213 = c10221;
                c10220 = c10221;
            }
        }
        return (Typeface) c10220.f30698;
    }
}
