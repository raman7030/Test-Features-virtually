package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D5UJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12729 extends ContextWrapper {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Configuration f38285;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LayoutInflater f38286;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Configuration f38287;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Resources f38288;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38289;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Resources.Theme f38290;

    public C12729() {
        super(null);
    }

    public C12729(Context context, int i) {
        super(context);
        this.f38289 = i;
    }

    public C12729(Context context, Resources.Theme theme) {
        super(context);
        this.f38290 = theme;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31026(Configuration configuration) {
        if (this.f38288 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f38287 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f38287 = new Configuration(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f38288 == null) {
            Configuration configuration = this.f38287;
            if (configuration == null) {
                this.f38288 = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f38285 == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f38285 = configuration2;
                    }
                    if (configuration.equals(f38285)) {
                        this.f38288 = super.getResources();
                    }
                }
                this.f38288 = createConfigurationContext(this.f38287).getResources();
            }
        }
        return this.f38288;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f38289 != i) {
            this.f38289 = i;
            m31024();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31025() {
        return this.f38289;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f38290;
        if (theme != null) {
            return theme;
        }
        if (this.f38289 == 0) {
            this.f38289 = R.style.MT_Protector;
        }
        m31024();
        return this.f38290;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f38286 == null) {
                this.f38286 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f38286;
        }
        return getBaseContext().getSystemService(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31024() {
        if (this.f38290 == null) {
            this.f38290 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f38290.setTo(theme);
            }
        }
        this.f38290.applyStyle(this.f38289, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }
}
