package p067l;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۗ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W14G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5134 implements InterfaceC7796 {

    /* JADX INFO: renamed from: ֫ */
    public final String f12068;

    /* JADX INFO: renamed from: ۧ */
    public final String f12069;

    /* JADX INFO: renamed from: ܽ */
    public final ResolveInfo f12070;

    /* JADX INFO: renamed from: ܿ */
    public boolean f12071;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f12072;

    public C5134(ResolveInfo resolveInfo) {
        this.f12070 = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f12069 = activityInfo.packageName;
        this.f12068 = activityInfo.name;
    }

    @Override // p067l.InterfaceC7796
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo10961() {
        return this.f12071;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m10966() {
        this.f12071 = true;
    }

    @Override // p067l.InterfaceC7796
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10959() {
        return this.f12072;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m10962() {
        this.f12072 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m10960(PackageManager packageManager) {
        CharSequence charSequenceLoadLabel = this.f12070.loadLabel(packageManager);
        if (charSequenceLoadLabel == null) {
            return this.f12068;
        }
        return charSequenceLoadLabel.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Drawable m10958(PackageManager packageManager) {
        return this.f12070.loadIcon(packageManager);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m10964() {
        return this.f12069;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m10965() {
        return this.f12069 + "/" + this.f12068;
    }

    @Override // p067l.InterfaceC7796
    /* JADX INFO: renamed from: ܽ */
    public final ComponentName mo10963() {
        return new ComponentName(this.f12069, this.f12068);
    }
}
