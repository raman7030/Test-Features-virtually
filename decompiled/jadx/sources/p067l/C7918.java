package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes3.dex */
public class C7918 extends AbstractC5907 {

    /* JADX INFO: renamed from: ۛ֫ */
    public C8331 f20753;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f20754;

    /* JADX INFO: renamed from: ۫֫ */
    public final C11942 f20755;

    public C7918(Context context) {
        super(context);
        this.f20755 = new C11942();
        m18273((AttributeSet) null);
    }

    public C7918(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20755 = new C11942();
        m18273(attributeSet);
    }

    public C7918(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20755 = new C11942();
        m18273(attributeSet);
    }

    public C7918(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20755 = new C11942();
        m18273(attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18277(C7918 c7918, AbstractActivityC5549 abstractActivityC5549, String str) {
        if (c7918.f20755.f33259 == null) {
            return;
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        ApplicationC21448.f67649.edit().putString("ffpp", abstractC17043M42109.getParent()).apply();
        new C13953(c7918, abstractActivityC5549, abstractC17043M42109, str).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m18273(AttributeSet attributeSet) {
        int resourceId = R.array.MT_Protector;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = m9012().obtainStyledAttributes(attributeSet, C21133.f66416);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.array.MT_Protector);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f20754 = resourceId;
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) C7453.m17221(m9012());
        C12826.requireNonNull(abstractActivityC5549);
        this.f20753 = ViewOnClickListenerC20541.m46366(abstractActivityC5549, new C19950(this, abstractActivityC5549));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m18272(SharedPreferences sharedPreferences, String str) {
        int i;
        String[] stringArray = m9012().getResources().getStringArray(this.f20754);
        if (stringArray.length == 0) {
            stringArray = new String[]{C7050.m16224(R.string.MT_Protector)};
        }
        String[] strArr = (String[]) Arrays.copyOf(stringArray, stringArray.length + 1);
        C11942 c11942 = this.f20755;
        c11942.f33256 = strArr;
        c11942.f33260 = stringArray.length;
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
        c11942.f33257 = i;
        c11942.f33261 = sharedPreferences.getString(str + "_custom", null);
        c11942.f33262 = sharedPreferences.getString(str + "_custom_md5", null);
        AbstractC17043 abstractC17043 = C17853.f53284;
        c11942.f33258 = abstractC17043.m38684(str + "_custom.dat");
        c11942.f33263 = abstractC17043.m38684(str + "_custom.dat.tmp");
        c11942.f33264 = false;
        if (c11942.f33261 != null && (c11942.f33262 == null || !c11942.f33258.mo25094())) {
            c11942.f33261 = null;
            c11942.f33262 = null;
        }
        if (c11942.f33261 == null && c11942.f33258.mo25094()) {
            c11942.f33258.mo29990();
        }
        int i2 = c11942.f33257;
        if (i2 < 0 || i2 > c11942.f33260) {
            c11942.f33257 = 0;
        }
        String strM16224 = c11942.f33261;
        if (strM16224 == null && c11942.f33257 == c11942.f33260) {
            c11942.f33257 = 0;
        }
        String[] strArr2 = c11942.f33256;
        int i3 = c11942.f33260;
        if (strM16224 == null) {
            strM16224 = C7050.m16224(R.string.MT_Protector);
        }
        strArr2[i3] = C7050.m16203(R.string.MT_Protector, strM16224);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۤ */
    public final void mo9038() {
        super.mo9038();
        m18272(m13265(), m9037());
        C11942 c11942 = this.f20755;
        mo9020((CharSequence) c11942.f33256[c11942.f33257]);
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(final AbstractActivityC5549 abstractActivityC5549) {
        final SharedPreferences sharedPreferencesM13265 = m13265();
        final String strM9037 = m9037();
        m18272(sharedPreferencesM13265, strM9037);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46730(m9035());
        C11942 c11942 = this.f20755;
        c20671BuildDialog.m46723(c11942.f33256, c11942.f33257, new DialogInterfaceOnClickListenerC22216(3, this));
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11487(2, this));
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.᩶ۙ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C7918.m18274(this.f67252);
            }
        });
        c11942.f33259 = c20671BuildDialog.m46732();
        c11942.m27304();
        c11942.f33259.m3861().setOnClickListener(new ViewOnClickListenerC6577(0, this));
        c11942.f33259.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۗۙ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7918.m18276(this.f12341, abstractActivityC5549, sharedPreferencesM13265, strM9037);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18275(C7918 c7918, int i) {
        C11942 c11942 = c7918.f20755;
        c11942.f33257 = i;
        c11942.m27304();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18278(C7918 c7918) {
        C11942 c11942 = c7918.f20755;
        if (c11942.f33264) {
            c11942.f33263.mo29990();
            c11942.f33264 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18274(C7918 c7918) {
        C11942 c11942 = c7918.f20755;
        if (c11942.f33264) {
            c11942.f33263.mo29990();
            c11942.f33264 = false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m18279(C7918 c7918) {
        String string = ApplicationC21448.f67649.getString("ffpp", null);
        if (TextUtils.isEmpty(string)) {
            string = C17853.f53287.mo25505();
        }
        C8331 c8331 = c7918.f20753;
        c8331.getClass();
        C8331.m19221(c8331, R.string.MT_Protector, string, new String[]{"ttf", "ttc", "otf", "woff"}, 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18276(C7918 c7918, AbstractActivityC5549 abstractActivityC5549, SharedPreferences sharedPreferences, String str) {
        C11942 c11942 = c7918.f20755;
        if (c11942.f33257 != c11942.f33260) {
            if (c11942.f33264) {
                c11942.f33263.mo29990();
                c11942.f33264 = false;
            }
            sharedPreferences.edit().putInt(str, c11942.f33257).apply();
        } else {
            if (c11942.f33261 == null) {
                c11942.f33259.m3860().setEnabled(false);
                return;
            }
            if (c11942.f33264) {
                try {
                    c11942.f33263.m38656(c11942.f33258, (Runnable) null);
                } catch (IOException e) {
                    abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
            sharedPreferences.edit().putInt(str, c11942.f33257).putString(C17588.m40053(str, "_custom"), c11942.f33261).putString(C17588.m40053(str, "_custom_md5"), c11942.f33262).apply();
        }
        c7918.mo9020((CharSequence) c11942.f33256[c11942.f33257]);
        c11942.f33259.dismiss();
    }
}
