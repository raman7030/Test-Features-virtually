package p067l;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0698cb;

/* JADX INFO: renamed from: l.᩸᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHY */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC23180 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: ۡ */
    public static C1349 f72810;

    /* JADX INFO: renamed from: ۢ */
    public static final AbstractC17043 f72811 = C17853.f53284.m38684("edit_text_font2_custom.dat");

    /* JADX INFO: renamed from: ܺ */
    public static boolean f72812;

    /* JADX INFO: renamed from: ᩷ */
    public static final /* synthetic */ int f72813 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f72814;

    /* JADX INFO: renamed from: ܳ */
    public boolean f72817;

    /* JADX INFO: renamed from: ᩳ */
    public final C14146 f72820;

    /* JADX INFO: renamed from: ᩻ */
    public C21405 f72821;

    /* JADX INFO: renamed from: ܿ */
    public String f72819 = "edit_word_wrap_normal";

    /* JADX INFO: renamed from: ۧ */
    public boolean f72816 = true;

    /* JADX INFO: renamed from: ۜ */
    public String f72815 = "Text";

    /* JADX INFO: renamed from: ܽ */
    public boolean f72818 = false;

    /* JADX INFO: renamed from: ۡ */
    public static synchronized C1349 m51634() {
        String string = C7050.f18355.getString("edit_text_font2_custom_md5", "");
        C1349 c1349 = f72810;
        if (c1349 != null && ((String) c1349.f33658).equals(string)) {
            return c1349;
        }
        AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("edit_text_font2_custom.dat");
        Typeface typefaceCreateFromFile = Typeface.DEFAULT;
        if (!string.isEmpty() && abstractC17043M38684.mo25094()) {
            try {
                typefaceCreateFromFile = Typeface.createFromFile(abstractC17043M38684.mo25505());
            } catch (Exception unused) {
            }
            if (typefaceCreateFromFile == null) {
                typefaceCreateFromFile = Typeface.DEFAULT;
            }
        }
        if (typefaceCreateFromFile == Typeface.DEFAULT) {
            string = "";
        }
        C1349 c13410 = new C1349(string, typefaceCreateFromFile);
        f72810 = c13410;
        return c13410;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51631(SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180, C14853 c14853) {
        sharedPreferencesOnSharedPreferenceChangeListenerC23180.getClass();
        c14853.m33949();
        C14146 c14146 = sharedPreferencesOnSharedPreferenceChangeListenerC23180.f72820;
        c14146.scrollTo(0, c14146.m32472());
        c14146.invalidate();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC23180(AbstractActivityC5549 abstractActivityC5549, C14146 c14146) {
        this.f72814 = abstractActivityC5549;
        this.f72820 = c14146;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51642(String str, boolean z) {
        this.f72819 = str;
        this.f72816 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51648() {
        this.f72818 = true;
        this.f72819 = "edit_word_wrap_diff";
        this.f72816 = false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m51653() {
        if (C7050.f18355.getBoolean(this.f72819, this.f72816)) {
            return C7050.f18355.getBoolean("edit_word_wrap_keep", true) ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51645(boolean z) {
        C7050.f18355.edit().putBoolean(this.f72819, z).apply();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m51647() {
        this.f72817 = true;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m51655() {
        return this.f72817;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51641(String str) {
        String strM37815;
        if (str.startsWith("syntax:")) {
            strM37815 = str.substring(7);
        } else {
            C16689 c16689M20943 = C9038.m20943(str);
            strM37815 = c16689M20943 == null ? "Text" : c16689M20943.m37815();
        }
        this.f72815 = strM37815;
        boolean z = this.f72817;
        C14146 c14146 = this.f72820;
        if (z || m51633()) {
            c14146.m32381(this.f72815, true);
        }
        if (!this.f72818) {
            c14146.m32571(C7050.f18355.getBoolean("edit_show_line_numbers", true));
            c14146.m32605(C7050.f18355.getBoolean("edit_fixed_line_numbers", false));
        }
        boolean z2 = C7050.f18355.getBoolean("edit_show_indent_guides", true);
        C23929 c23929 = c14146.f40262;
        C23929 c239210 = c14146.f40262;
        if (c23929.f75990 != z2) {
            c23929.f75990 = z2;
            c14146.postInvalidate();
        }
        c239210.f75952 = C7050.f18355.getBoolean("edit_pinch_to_zoom", true);
        c14146.m32551(C7050.f18355.getBoolean("edit_auto_indent", true));
        c239210.f75953 = m51636();
        c14146.m32437(C7050.f18355.getBoolean("edit_show_blank_symbol", false));
        c14146.m32457(C7050.f18355.getBoolean("hide_single_space", true));
        c14146.m32429(C7050.f18355.getBoolean("edit_show_ascii_control", false));
        c14146.m32359(C7050.f18355.getBoolean("edit_show_unicode_special", true));
        c14146.m32358(C7050.f18355.getInt("edit_tab_size", 4));
        c14146.m32587(C7050.f18355.getBoolean("edit_indent_with_tabs", false));
        c14146.m32374(m51650(), m51632());
        c14146.m32373(m51635());
        c14146.m32576(m51653());
        c14146.m32577(C7050.f18355.getBoolean("show_soft_wrap_arrows", true));
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m51652() {
        return this.f72815;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51649(String str) {
        this.f72815 = str;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m51654() {
        this.f72821 = m51651();
        C7050.f18355.registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51640(Class cls) {
        m51654();
        AbstractActivityC5549 abstractActivityC5549 = this.f72814;
        abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) cls));
    }

    /* JADX INFO: renamed from: ܽ */
    public final C21405 m51651() {
        int iM51632 = m51632();
        return new C21405(m51650(), m51635(), iM51632, m51653(), C7050.f18355.getInt("edit_tab_size", 4), this.f72815, iM51632 == 1 ? C7050.f18355.getString("edit_text_font2_custom_md5", "") : "", C7050.f18355.getBoolean("show_soft_wrap_arrows", true), this.f72818 || C7050.f18355.getBoolean("edit_show_line_numbers", true), C7050.f18355.getBoolean("edit_show_ascii_control", false), C7050.f18355.getBoolean("edit_show_unicode_special", true), m51633());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51643(C11996 c11996) {
        C21405 c21405M51651 = m51651();
        c11996.writeInt(388441883);
        c11996.m27443((CharSequence) c21405M51651.f67502);
        c11996.writeByte(c21405M51651.f67514);
        c11996.m27439(c21405M51651.f67523);
        c11996.writeInt(c21405M51651.f67520);
        c11996.m27445(c21405M51651.f67511);
        c11996.m27445(c21405M51651.f67508);
        c11996.m27445(c21405M51651.f67512);
        c11996.writeInt(0);
        c11996.writeInt(c21405M51651.f67503);
        c11996.m27459(c21405M51651.f67518);
        c11996.m27445(c21405M51651.f67515);
        c11996.m27445(c21405M51651.f67506);
        c11996.m27439(c21405M51651.f67513);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51644(C14677 c14677) {
        boolean zM33577 = c14677.m33577(388441883);
        boolean z = zM33577 || c14677.m33577(388441882);
        boolean z2 = z || c14677.m33577(388441881);
        boolean z3 = z2 || c14677.m33577(388441880);
        boolean z4 = z3 || c14677.m33577(388441879);
        boolean z5 = z4 || c14677.m33577(388441878);
        String strM33591 = c14677.m33591();
        int i = c14677.readByte() & 255;
        float fM33582 = c14677.m33582();
        int i2 = c14677.readInt();
        boolean zM33585 = c14677.m33585();
        boolean z6 = z4 && c14677.m33585();
        boolean zM33586 = c14677.m33585();
        if (z5) {
            c14677.readInt();
        }
        C21405 c21405 = new C21405(fM33582, zM33577 ? c14677.m33582() : 1.0f, i, i2, c14677.readInt(), strM33591, z3 ? c14677.m33593() : "", !z2 || c14677.m33585(), zM33585, z6, !z || c14677.m33585(), zM33586);
        this.f72815 = strM33591;
        C21405 c21405M51651 = m51651();
        c21405.f67509 = c21405M51651.f67514;
        c21405.f67522 = c21405M51651.f67523;
        c21405.f67517 = c21405M51651.f67513;
        c21405.f67519 = c21405M51651.f67520;
        c21405.f67510 = c21405M51651.f67515;
        c21405.f67521 = c21405M51651.f67511;
        c21405.f67524 = c21405M51651.f67508;
        c21405.f67505 = c21405M51651.f67506;
        c21405.f67504 = c21405M51651.f67512;
        c21405.f67507 = c21405M51651.f67503;
        c21405.f67516 = c21405M51651.f67518;
        if (!c21405.m48481()) {
            c21405 = null;
        }
        if (c21405 != null) {
            this.f72820.m32403(c21405);
            C7050.m16212(new RunnableC2765(1, this));
        }
        m51639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51630(SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180) {
        C14146 c14146 = sharedPreferencesOnSharedPreferenceChangeListenerC23180.f72820;
        c14146.scrollTo(0, c14146.m32472());
        c14146.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21405 m51638(C6827 c6827) {
        String str = c6827.f17741;
        int i = c6827.f17740;
        C21405 c21405 = new C21405(c6827.f17733, c6827.f17738, i, c6827.f17735, c6827.f17731, str, c6827.f17737, c6827.f17736, c6827.f17739, c6827.f17730, c6827.f17732, c6827.f17734);
        this.f72815 = str;
        C21405 c21405M51651 = m51651();
        c21405.f67509 = c21405M51651.f67514;
        c21405.f67522 = c21405M51651.f67523;
        c21405.f67517 = c21405M51651.f67513;
        c21405.f67519 = c21405M51651.f67520;
        c21405.f67510 = c21405M51651.f67515;
        c21405.f67521 = c21405M51651.f67511;
        c21405.f67524 = c21405M51651.f67508;
        c21405.f67505 = c21405M51651.f67506;
        c21405.f67504 = c21405M51651.f67512;
        c21405.f67507 = c21405M51651.f67503;
        c21405.f67516 = c21405M51651.f67518;
        if (c21405.m48481()) {
            return c21405;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            return;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -2113232115:
                if (str.equals("edit_line_spacing")) {
                    b = 0;
                }
                break;
            case -2099828180:
                if (str.equals("hide_single_space")) {
                    b = 1;
                }
                break;
            case -2032664963:
                if (str.equals("edit_show_indent_guides")) {
                    b = 2;
                }
                break;
            case -1797291235:
                if (str.equals("edit_pinch_to_zoom")) {
                    b = 3;
                }
                break;
            case -1384104704:
                if (str.equals("edit_tab_size")) {
                    b = 4;
                }
                break;
            case -391883495:
                if (str.equals("edit_indent_with_tabs")) {
                    b = 5;
                }
                break;
            case -343113470:
                if (str.equals("edit_show_ascii_control")) {
                    b = 6;
                }
                break;
            case 372354057:
                if (str.equals("edit_magnifier")) {
                    b = 7;
                }
                break;
            case 590121177:
                if (str.equals("diff_text_font_size")) {
                    b = 8;
                }
                break;
            case 760775466:
                if (str.equals("edit_show_unicode_special")) {
                    b = 9;
                }
                break;
            case 1050071438:
                if (str.equals("edit_high_light")) {
                    b = 10;
                }
                break;
            case 1329343111:
                if (str.equals("edit_auto_indent")) {
                    b = 11;
                }
                break;
            case 1447455756:
                if (str.equals("edit_show_line_numbers")) {
                    b = 12;
                }
                break;
            case 1493579248:
                if (str.equals("edit_show_blank_symbol")) {
                    b = C0698cb.f2569k;
                }
                break;
            case 1643461684:
                if (str.equals("edit_text_font_size")) {
                    b = C0698cb.f2570l;
                }
                break;
            case 1975085119:
                if (str.equals("edit_fixed_line_numbers")) {
                    b = 15;
                }
                break;
        }
        C14146 c14146 = this.f72820;
        switch (b) {
            case 0:
                this.f72821.f67517 = m51635();
                break;
            case 1:
                c14146.m32457(C7050.f18355.getBoolean("hide_single_space", true));
                break;
            case 2:
                boolean z = C7050.f18355.getBoolean("edit_show_indent_guides", true);
                C23929 c23929 = c14146.f40262;
                if (c23929.f75990 != z) {
                    c23929.f75990 = z;
                    c14146.postInvalidate();
                }
                break;
            case 3:
                c14146.f40262.f75952 = C7050.f18355.getBoolean("edit_pinch_to_zoom", true);
                break;
            case 4:
                this.f72821.f67507 = C7050.f18355.getInt("edit_tab_size", 4);
                break;
            case 5:
                c14146.m32587(C7050.f18355.getBoolean("edit_indent_with_tabs", false));
                break;
            case 6:
                this.f72821.f67524 = C7050.f18355.getBoolean("edit_show_ascii_control", false);
                break;
            case 7:
                c14146.f40262.f75953 = m51636();
                break;
            case 8:
            case 14:
                this.f72821.f67522 = m51650();
                break;
            case 9:
                this.f72821.f67505 = C7050.f18355.getBoolean("edit_show_unicode_special", true);
                break;
            case 10:
                this.f72821.f67504 = m51633();
                break;
            case 11:
                c14146.m32551(C7050.f18355.getBoolean("edit_auto_indent", true));
                break;
            case 12:
                if (!this.f72818) {
                    this.f72821.f67521 = C7050.f18355.getBoolean("edit_show_line_numbers", true);
                }
                break;
            case 13:
                c14146.m32437(C7050.f18355.getBoolean("edit_show_blank_symbol", false));
                break;
            case 15:
                if (!this.f72818) {
                    c14146.m32605(C7050.f18355.getBoolean("edit_fixed_line_numbers", false));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m51646() {
        if (this.f72821 == null) {
            return false;
        }
        C7050.f18355.unregisterOnSharedPreferenceChangeListener(this);
        C21405 c21405 = this.f72821;
        this.f72821 = null;
        AbstractActivityC5549 abstractActivityC5549 = this.f72814;
        boolean zM35142 = abstractActivityC5549.getLifecycle().mo21805().m35142(EnumC15415.CREATED);
        c21405.f67519 = m51653();
        c21405.f67510 = C7050.f18355.getBoolean("show_soft_wrap_arrows", true);
        int iM51632 = m51632();
        c21405.f67509 = iM51632;
        if (iM51632 == 1) {
            c21405.f67516 = C7050.f18355.getString("edit_text_font2_custom_md5", "");
        }
        if (zM35142 && c21405.m48481()) {
            C14853 c14853 = new C14853(abstractActivityC5549, R.string.MT_Protector);
            c14853.m33956();
            this.f72820.m32404(c21405, new RunnableC13855(1, this, c14853));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ */
    public static int m51632() {
        int i;
        try {
            try {
                i = C7050.f18355.getInt("edit_text_font2", 0);
            } catch (ClassCastException unused) {
                i = Integer.parseInt(C7050.f18355.getString("edit_text_font2", null));
                C7050.f18355.edit().putInt("edit_text_font2", i).apply();
            }
        } catch (Exception unused2) {
            C7050.f18355.edit().remove("edit_text_font2").apply();
            i = 0;
        }
        if (i == 2 && !f72811.mo25094()) {
            C7050.f18355.edit().remove("edit_text_font2").apply();
            i = 0;
        }
        if (i != 1) {
            return i != 2 ? 255 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public static float m51635() {
        try {
            int i = C7050.f18355.getInt("edit_line_spacing", 100);
            if (i < 80 || i > 200) {
                return 1.0f;
            }
            return i / 100.0f;
        } catch (ClassCastException unused) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m51650() {
        try {
            if (this.f72818) {
                return Integer.parseInt(C7050.f18355.getString("diff_text_font_size", "12"));
            }
            return Integer.parseInt(C7050.f18355.getString("edit_text_font_size", "15"));
        } catch (NumberFormatException unused) {
            return 15;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51639() {
        boolean z = C7050.f18355.getBoolean("edit_show_indent_guides", true);
        C14146 c14146 = this.f72820;
        C23929 c23929 = c14146.f40262;
        C23929 c239210 = c14146.f40262;
        if (c23929.f75990 != z) {
            c23929.f75990 = z;
            c14146.postInvalidate();
        }
        c239210.f75952 = C7050.f18355.getBoolean("edit_pinch_to_zoom", true);
        c14146.m32551(C7050.f18355.getBoolean("edit_auto_indent", true));
        c239210.f75953 = m51636();
        c14146.m32437(C7050.f18355.getBoolean("edit_show_blank_symbol", false));
        c14146.m32457(C7050.f18355.getBoolean("hide_single_space", true));
        c14146.m32587(C7050.f18355.getBoolean("edit_indent_with_tabs", false));
    }

    /* JADX INFO: renamed from: ۘ */
    public static boolean m51633() {
        return C7050.f18355.getBoolean("edit_high_light", true);
    }

    /* JADX INFO: renamed from: ᩴ */
    public static boolean m51636() {
        boolean z = C7050.f18355.getBoolean("edit_magnifier", true);
        f72812 = z;
        return z;
    }

    /* JADX INFO: renamed from: ᩵ */
    public static boolean m51637() {
        return f72812;
    }
}
