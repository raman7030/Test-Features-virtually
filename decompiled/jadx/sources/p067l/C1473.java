package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫᩻ */
/* JADX INFO: compiled from: D5UJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1473 extends ContextWrapper {

    /* JADX INFO: renamed from: ܳ */
    public static Configuration f41325;

    /* JADX INFO: renamed from: ֫ */
    public LayoutInflater f41326;

    /* JADX INFO: renamed from: ۧ */
    public Configuration f41327;

    /* JADX INFO: renamed from: ܽ */
    public Resources f41328;

    /* JADX INFO: renamed from: ܿ */
    public int f41329;

    /* JADX INFO: renamed from: ᩳ */
    public Resources.Theme f41330;

    public C1473() {
        super(null);
    }

    public C1473(Context context, int i) {
        super(context);
        this.f41329 = i;
    }

    public C1473(Context context, Resources.Theme theme) {
        super(context);
        this.f41330 = theme;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33110(Configuration configuration) {
        if (this.f41328 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f41327 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f41327 = new Configuration(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f41328 == null) {
            Configuration configuration = this.f41327;
            if (configuration == null) {
                this.f41328 = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f41325 == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f41325 = configuration2;
                    }
                    if (configuration.equals(f41325)) {
                        this.f41328 = super.getResources();
                    }
                }
                this.f41328 = createConfigurationContext(this.f41327).getResources();
            }
        }
        return this.f41328;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f41329 != i) {
            this.f41329 = i;
            m33108();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33109() {
        return this.f41329;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f41330;
        if (theme != null) {
            return theme;
        }
        if (this.f41329 == 0) {
            this.f41329 = R.style.MT_Protector;
        }
        m33108();
        return this.f41330;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f41326 == null) {
                this.f41326 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f41326;
        }
        return getBaseContext().getSystemService(str);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33108() {
        if (this.f41330 == null) {
            this.f41330 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f41330.setTo(theme);
            }
        }
        this.f41330.applyStyle(this.f41329, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }
}
