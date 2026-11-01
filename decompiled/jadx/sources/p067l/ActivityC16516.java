package p067l;

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
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16516 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۜۧ */
    public static final /* synthetic */ int f48548 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public AbstractC17043 f48549;

    /* JADX INFO: renamed from: ܿۧ */
    public String f48550;

    /* JADX INFO: renamed from: ᩳۧ */
    public SpannableStringBuilder f48551;

    /* JADX INFO: renamed from: ᩻ۧ */
    public TextView[] f48552;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "FontViewer";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Typeface typefaceCreateFromFile;
        super.onCreate(bundle);
        m12277(R.string.MT_Protector);
        m12277(R.layout.MT_Protector);
        int[] iArr = {R.id.text1, R.id.text2, R.id.text3, R.id.text4, R.id.MT_Protector, R.id.MT_Protector};
        this.f48552 = new TextView[6];
        int i = 0;
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.f48552;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2] = (TextView) m12277(iArr[i2]);
            i2++;
        }
        String string = ApplicationC21448.f67649.getString("font_viewer_displayed_text", "");
        this.f48550 = string;
        if (TextUtils.isEmpty(string)) {
            this.f48550 = getString(R.string.MT_Protector);
        }
        if (this.f48550.length() > 200) {
            this.f48550 = this.f48550.substring(0, 200);
        }
        for (TextView textView : this.f48552) {
            textView.setText(this.f48550);
        }
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC3105(i, this));
        if (C18524.m42116((AbstractActivityC5549) this)) {
            return;
        }
        try {
            AbstractC17043 abstractC17043M42105 = C18524.m42105(getIntent());
            this.f13392.setSubtitle(abstractC17043M42105.getName());
            try {
                FileInputStream fileInputStream = new FileInputStream(abstractC17043M42105.mo25505());
                try {
                    typefaceCreateFromFile = Build.VERSION.SDK_INT >= 26 ? new Typeface.Builder(fileInputStream.getFD()).build() : Typeface.createFromFile(abstractC17043M42105.mo25495());
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
                AbstractC17043 abstractC17043M38685 = C17853.f53278.m38685();
                this.f48549 = abstractC17043M38685;
                abstractC17043M42105.m38658(abstractC17043M38685, (C19056) null, (InterfaceC7717) null);
                abstractC17043M42105 = this.f48549;
                typefaceCreateFromFile = Typeface.createFromFile(abstractC17043M42105.mo25495());
            }
            if (typefaceCreateFromFile == null || typefaceCreateFromFile == Typeface.DEFAULT) {
                throw new Exception("Invalid font file");
            }
            TextView[] textViewArr2 = this.f48552;
            int length = textViewArr2.length;
            while (i < length) {
                textViewArr2[i].setTypeface(typefaceCreateFromFile);
                i++;
            }
            ((TextView) m12277(R.id.text)).setTypeface(typefaceCreateFromFile);
            m37476(abstractC17043M42105);
        } catch (Throwable unused2) {
            C22682.m50793(R.string.MT_Protector);
            finish();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37476(AbstractC17043 abstractC17043) {
        try {
            InputStream inputStreamMo29987 = abstractC17043.mo29987();
            try {
                C11790 c11790M27040 = C11790.m27040(inputStreamMo29987);
                Locale locale = getResources().getConfiguration().locale;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                m37474(spannableStringBuilder, "Full Name", c11790M27040.m27041(4, locale));
                m37474(spannableStringBuilder, "Font Family", c11790M27040.m27041(1, locale));
                m37474(spannableStringBuilder, "Font Subfamily", c11790M27040.m27041(2, locale));
                m37474(spannableStringBuilder, "Unique Subfamily Identification", c11790M27040.m27041(3, locale));
                m37474(spannableStringBuilder, AbstractC0213e.f983g, c11790M27040.m27041(5, locale));
                m37474(spannableStringBuilder, "Post Script", c11790M27040.m27041(6, locale));
                m37474(spannableStringBuilder, "Trademark", c11790M27040.m27041(7, locale));
                m37474(spannableStringBuilder, "Manufacturer", c11790M27040.m27041(8, locale));
                m37474(spannableStringBuilder, "Designer", c11790M27040.m27041(9, locale));
                m37474(spannableStringBuilder, "Description", c11790M27040.m27041(10, locale));
                m37474(spannableStringBuilder, "Copyright", c11790M27040.m27041(0, locale));
                m37474(spannableStringBuilder, "License", c11790M27040.m27041(13, locale));
                this.f48551 = spannableStringBuilder;
                invalidateOptionsMenu();
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37474(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append("\n\n");
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72969), length, length2, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
        spannableStringBuilder.append("\n");
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72980), length3, spannableStringBuilder.length(), 33);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        if (this.f48551 != null) {
            return true;
        }
        menu.findItem(R.id.MT_Protector).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C9811 c9811 = new C9811(this, this);
            c9811.m33344(R.string.MT_Protector);
            c9811.m33336((CharSequence) this.f48550);
            c9811.m33354(200);
            c9811.m33356();
            c9811.m33367();
            c9811.m33352(true);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46718(this.f48551);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C10884.m25069(dialogInterfaceC2564M46732);
        ((TextView) dialogInterfaceC2564M46732.m3846(android.R.id.message)).setTextIsSelectable(true);
        return true;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AbstractC17043 abstractC17043 = this.f48549;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
    }
}
