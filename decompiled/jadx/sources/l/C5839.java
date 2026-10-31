package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes3.dex */
public class C5839 extends AbstractC3723 {

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public C6273 f17901;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f17902;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final C10073 f17903;

    public C5839(Context context) {
        super(context);
        this.f17903 = new C10073();
        m16348((AttributeSet) null);
    }

    public C5839(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17903 = new C10073();
        m16348(attributeSet);
    }

    public C5839(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17903 = new C10073();
        m16348(attributeSet);
    }

    public C5839(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f17903 = new C10073();
        m16348(attributeSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16352(C5839 c5839, AbstractActivityC3346 abstractActivityC3346, String str) {
        if (c5839.f17903.f30298 == null) {
            return;
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        ApplicationC20075.f65008.edit().putString("ffpp", abstractC15440M39866.getParent()).apply();
        new C12189(c5839, abstractActivityC3346, abstractC15440M39866, str).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16348(AttributeSet attributeSet) {
        int resourceId = R.array.MT_Protector;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = m6886().obtainStyledAttributes(attributeSet, C19743.f63781);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.array.MT_Protector);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f17902 = resourceId;
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(m6886());
        C11003.requireNonNull(abstractActivityC3346);
        this.f17901 = ViewOnClickListenerC19121.m44072(abstractActivityC3346, new C18499(this, abstractActivityC3346));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16347(SharedPreferences sharedPreferences, String str) {
        int i;
        String[] stringArray = m6886().getResources().getStringArray(this.f17902);
        if (stringArray.length == 0) {
            stringArray = new String[]{C4925.m14327(R.string.MT_Protector)};
        }
        String[] strArr = (String[]) Arrays.copyOf(stringArray, stringArray.length + 1);
        C10073 c10073 = this.f17903;
        c10073.f30295 = strArr;
        c10073.f30299 = stringArray.length;
        try {
            try {
                i = sharedPreferences.getInt(str, 0);
            } catch (ClassCastException unused) {
                i = Integer.parseInt(sharedPreferences.getString(str, null));
                sharedPreferences.edit().putInt(str, i).apply();
            }
        } catch (Exception unused2) {
            sharedPreferences.edit().remove(str).apply();
            i = 0;
        }
        c10073.f30296 = i;
        c10073.f30300 = sharedPreferences.getString(str + "_custom", null);
        c10073.f30301 = sharedPreferences.getString(str + "_custom_md5", null);
        AbstractC15440 abstractC15440 = C16293.f50117;
        c10073.f30297 = abstractC15440.m36526(str + "_custom.dat");
        c10073.f30302 = abstractC15440.m36526(str + "_custom.dat.tmp");
        c10073.f30303 = false;
        if (c10073.f30300 != null && (c10073.f30301 == null || !c10073.f30297.mo23120())) {
            c10073.f30300 = null;
            c10073.f30301 = null;
        }
        if (c10073.f30300 == null && c10073.f30297.mo23120()) {
            c10073.f30297.mo27929();
        }
        int i2 = c10073.f30296;
        if (i2 < 0 || i2 > c10073.f30299) {
            c10073.f30296 = 0;
        }
        String strM14327 = c10073.f30300;
        if (strM14327 == null && c10073.f30296 == c10073.f30299) {
            c10073.f30296 = 0;
        }
        String[] strArr2 = c10073.f30295;
        int i3 = c10073.f30299;
        if (strM14327 == null) {
            strM14327 = C4925.m14327(R.string.MT_Protector);
        }
        strArr2[i3] = C4925.m14306(R.string.MT_Protector, strM14327);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۤ */
    public final void mo6912() {
        super.mo6912();
        m16347(m11313(), m6911());
        C10073 c10073 = this.f17903;
        mo6894((CharSequence) c10073.f30295[c10073.f30296]);
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(final AbstractActivityC3346 abstractActivityC3346) {
        final SharedPreferences sharedPreferencesM11313 = m11313();
        final String strM6911 = m6911();
        m16347(sharedPreferencesM11313, strM6911);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44436(m6909());
        C10073 c10073 = this.f17903;
        c19258BuildDialog.m44429(c10073.f30295, c10073.f30296, new DialogInterfaceOnClickListenerC20883(3, this));
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9594(2, this));
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.᩶ۙ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C5839.m16349(this.f64611);
            }
        });
        c10073.f30298 = c19258BuildDialog.m44438();
        c10073.m25285();
        c10073.f30298.m1448().setOnClickListener(new ViewOnClickListenerC4428(0, this));
        c10073.f30298.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۗۙ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5839.m16351(this.f9538, abstractActivityC3346, sharedPreferencesM11313, strM6911);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16350(C5839 c5839, int i) {
        C10073 c10073 = c5839.f17903;
        c10073.f30296 = i;
        c10073.m25285();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16353(C5839 c5839) {
        C10073 c10073 = c5839.f17903;
        if (c10073.f30303) {
            c10073.f30302.mo27929();
            c10073.f30303 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16349(C5839 c5839) {
        C10073 c10073 = c5839.f17903;
        if (c10073.f30303) {
            c10073.f30302.mo27929();
            c10073.f30303 = false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m16354(C5839 c5839) {
        String string = ApplicationC20075.f65008.getString("ffpp", null);
        if (TextUtils.isEmpty(string)) {
            string = C16293.f50120.mo23554();
        }
        C6273 c6273 = c5839.f17901;
        c6273.getClass();
        C6273.m17283(c6273, R.string.MT_Protector, string, new String[]{"ttf", "ttc", "otf", "woff"}, 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16351(C5839 c5839, AbstractActivityC3346 abstractActivityC3346, SharedPreferences sharedPreferences, String str) {
        C10073 c10073 = c5839.f17903;
        if (c10073.f30296 != c10073.f30299) {
            if (c10073.f30303) {
                c10073.f30302.mo27929();
                c10073.f30303 = false;
            }
            sharedPreferences.edit().putInt(str, c10073.f30296).apply();
        } else {
            if (c10073.f30300 == null) {
                c10073.f30298.m1447().setEnabled(false);
                return;
            }
            if (c10073.f30303) {
                try {
                    c10073.f30302.m36498(c10073.f30297, (Runnable) null);
                } catch (IOException e) {
                    abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
            sharedPreferences.edit().putInt(str, c10073.f30296).putString(C16014.m37867(str, "_custom"), c10073.f30300).putString(C16014.m37867(str, "_custom_md5"), c10073.f30301).apply();
        }
        c5839.mo6894((CharSequence) c10073.f30295[c10073.f30296]);
        c10073.f30298.dismiss();
    }
}
