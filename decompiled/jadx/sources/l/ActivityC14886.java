package l;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC14886 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45433 = 0;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f45434;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public String f45435;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public SpannableStringBuilder f45436;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public TextView[] f45437;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "FontViewer";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Typeface typefaceCreateFromFile;
        super.onCreate(bundle);
        m10241(R.string.MT_Protector);
        m10241(R.layout.MT_Protector);
        int[] iArr = {R.id.text1, R.id.text2, R.id.text3, R.id.text4, R.id.MT_Protector, R.id.MT_Protector};
        this.f45437 = new TextView[6];
        int i = 0;
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.f45437;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2] = (TextView) m10241(iArr[i2]);
            i2++;
        }
        String string = ApplicationC20075.f65008.getString("font_viewer_displayed_text", "");
        this.f45435 = string;
        if (TextUtils.isEmpty(string)) {
            this.f45435 = getString(R.string.MT_Protector);
        }
        if (this.f45435.length() > 200) {
            this.f45435 = this.f45435.substring(0, 200);
        }
        for (TextView textView : this.f45437) {
            textView.setText(this.f45435);
        }
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC0775(i, this));
        if (C16999.m39873((AbstractActivityC3346) this)) {
            return;
        }
        try {
            AbstractC15440 abstractC15440M39862 = C16999.m39862(getIntent());
            this.f10584.setSubtitle(abstractC15440M39862.getName());
            try {
                FileInputStream fileInputStream = new FileInputStream(abstractC15440M39862.mo23554());
                try {
                    typefaceCreateFromFile = Build.VERSION.SDK_INT >= 26 ? new Typeface.Builder(fileInputStream.getFD()).build() : Typeface.createFromFile(abstractC15440M39862.mo23544());
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception unused) {
                AbstractC15440 abstractC15440M36527 = C16293.f50111.m36527();
                this.f45434 = abstractC15440M36527;
                abstractC15440M39862.m36500(abstractC15440M36527, (C17558) null, (InterfaceC5627) null);
                abstractC15440M39862 = this.f45434;
                typefaceCreateFromFile = Typeface.createFromFile(abstractC15440M39862.mo23544());
            }
            if (typefaceCreateFromFile == null || typefaceCreateFromFile == Typeface.DEFAULT) {
                throw new Exception("Invalid font file");
            }
            TextView[] textViewArr2 = this.f45437;
            int length = textViewArr2.length;
            while (i < length) {
                textViewArr2[i].setTypeface(typefaceCreateFromFile);
                i++;
            }
            ((TextView) m10241(R.id.text)).setTypeface(typefaceCreateFromFile);
            m35324(abstractC15440M39862);
        } catch (Throwable unused2) {
            C21374.m48457(R.string.MT_Protector);
            finish();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35324(AbstractC15440 abstractC15440) {
        try {
            InputStream inputStreamMo27926 = abstractC15440.mo27926();
            try {
                C9913 c9913M25023 = C9913.m25023(inputStreamMo27926);
                Locale locale = getResources().getConfiguration().locale;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                m35322(spannableStringBuilder, "Full Name", c9913M25023.m25024(4, locale));
                m35322(spannableStringBuilder, "Font Family", c9913M25023.m25024(1, locale));
                m35322(spannableStringBuilder, "Font Subfamily", c9913M25023.m25024(2, locale));
                m35322(spannableStringBuilder, "Unique Subfamily Identification", c9913M25023.m25024(3, locale));
                m35322(spannableStringBuilder, e.g, c9913M25023.m25024(5, locale));
                m35322(spannableStringBuilder, "Post Script", c9913M25023.m25024(6, locale));
                m35322(spannableStringBuilder, "Trademark", c9913M25023.m25024(7, locale));
                m35322(spannableStringBuilder, "Manufacturer", c9913M25023.m25024(8, locale));
                m35322(spannableStringBuilder, "Designer", c9913M25023.m25024(9, locale));
                m35322(spannableStringBuilder, "Description", c9913M25023.m25024(10, locale));
                m35322(spannableStringBuilder, "Copyright", c9913M25023.m25024(0, locale));
                m35322(spannableStringBuilder, "License", c9913M25023.m25024(13, locale));
                this.f45436 = spannableStringBuilder;
                invalidateOptionsMenu();
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35322(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append("\n\n");
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70257), length, length2, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
        spannableStringBuilder.append("\n");
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length3, spannableStringBuilder.length(), 33);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        if (this.f45436 != null) {
            return true;
        }
        menu.findItem(R.id.MT_Protector).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C7831 c7831 = new C7831(this, this);
            c7831.m31258(R.string.MT_Protector);
            c7831.m31250((CharSequence) this.f45435);
            c7831.m31268(200);
            c7831.m31270();
            c7831.m31281();
            c7831.m31266(true);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44424(this.f45436);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C8960.m23095(dialogInterfaceC0206M44438);
        ((TextView) dialogInterfaceC0206M44438.m1433(android.R.id.message)).setTextIsSelectable(true);
        return true;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AbstractC15440 abstractC15440 = this.f45434;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
    }
}
