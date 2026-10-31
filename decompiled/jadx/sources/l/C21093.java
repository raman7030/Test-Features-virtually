package l;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21093 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC9098 f68018;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f68021;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Bundle f68023;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Notification f68024;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4656 f68025;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f68026;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f68027;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public ArrayList f68028;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f68029;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f68030;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PendingIntent f68031;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f68033;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Context f68035;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f68019 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f68020 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f68034 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f68032 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f68022 = 0;

    public C21093(Context context, String str) {
        Notification notification = new Notification();
        this.f68024 = notification;
        this.f68035 = context;
        this.f68029 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f68021 = 0;
        this.f68028 = new ArrayList();
        this.f68026 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47998(boolean z) {
        this.f68032 = z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48000() {
        this.f68024.icon = R.drawable.MT_Protector;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m48002() {
        this.f68033 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47996(String str) {
        this.f68027 = m47990(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47995(CharSequence charSequence) {
        this.f68030 = m47990(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47993(PendingIntent pendingIntent) {
        this.f68031 = pendingIntent;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47999() {
        this.f68024.flags |= 16;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48001() {
        this.f68024.flags |= 2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m48003() {
        this.f68021 = 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47992(int i, String str, PendingIntent pendingIntent) {
        this.f68019.add(new C23914(i == 0 ? null : C4656.m13625((Resources) null, "", i), str, pendingIntent, new Bundle(), null, null, true, true));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47997(AbstractC9098 abstractC9098) {
        if (this.f68018 != abstractC9098) {
            this.f68018 = abstractC9098;
            if (abstractC9098 == null || abstractC9098.f27572 == this) {
                return;
            }
            abstractC9098.f27572 = this;
            m47997(abstractC9098);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m48004() {
        this.f68022 = 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Notification m47991() {
        return new C8392(this).m21995();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m47990(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47994(Bitmap bitmap) {
        C4656 c4656M13628;
        if (bitmap == null) {
            c4656M13628 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f68035.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.MT_Protector);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.MT_Protector);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            c4656M13628 = C4656.m13628(bitmap);
        }
        this.f68025 = c4656M13628;
    }
}
