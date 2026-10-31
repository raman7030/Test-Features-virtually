package l;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۗ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W14G */
/* JADX INFO: loaded from: classes2.dex */
public final class C2910 implements InterfaceC5711 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f9270;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f9271;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ResolveInfo f9272;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f9273;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f9274;

    public C2910(ResolveInfo resolveInfo) {
        this.f9272 = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f9271 = activityInfo.packageName;
        this.f9270 = activityInfo.name;
    }

    @Override // l.InterfaceC5711
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo8894() {
        return this.f9273;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m8899() {
        this.f9273 = true;
    }

    @Override // l.InterfaceC5711
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8892() {
        return this.f9274;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m8895() {
        this.f9274 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m8893(PackageManager packageManager) {
        CharSequence charSequenceLoadLabel = this.f9272.loadLabel(packageManager);
        if (charSequenceLoadLabel == null) {
            return this.f9270;
        }
        return charSequenceLoadLabel.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable m8891(PackageManager packageManager) {
        return this.f9272.loadIcon(packageManager);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m8897() {
        return this.f9271;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m8898() {
        return this.f9271 + "/" + this.f9270;
    }

    @Override // l.InterfaceC5711
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ComponentName mo8896() {
        return new ComponentName(this.f9271, this.f9270);
    }
}
