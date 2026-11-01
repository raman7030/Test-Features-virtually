package p067l;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷᩶ */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C1888 {

    /* JADX INFO: renamed from: ֡ */
    public AbstractC1293 f70700;

    /* JADX INFO: renamed from: ۘ */
    public int f70703;

    /* JADX INFO: renamed from: ۜ */
    public Bundle f70705;

    /* JADX INFO: renamed from: ۡ */
    public Notification f70706;

    /* JADX INFO: renamed from: ۢ */
    public C1073 f70707;

    /* JADX INFO: renamed from: ۧ */
    public boolean f70708;

    /* JADX INFO: renamed from: ܳ */
    public CharSequence f70709;

    /* JADX INFO: renamed from: ܺ */
    @Deprecated
    public ArrayList f70710;

    /* JADX INFO: renamed from: ܽ */
    public String f70711;

    /* JADX INFO: renamed from: ܿ */
    public CharSequence f70712;

    /* JADX INFO: renamed from: ᩳ */
    public PendingIntent f70713;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f70715;

    /* JADX INFO: renamed from: ᩻ */
    public Context f70717;

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f70701 = new ArrayList();

    /* JADX INFO: renamed from: ۖ */
    public ArrayList f70702 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f70716 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ */
    public boolean f70714 = true;

    /* JADX INFO: renamed from: ۚ */
    public int f70704 = 0;

    public C1888(Context context, String str) {
        Notification notification = new Notification();
        this.f70706 = notification;
        this.f70717 = context;
        this.f70711 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f70703 = 0;
        this.f70710 = new ArrayList();
        this.f70708 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50328(boolean z) {
        this.f70714 = z;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m50330() {
        this.f70706.icon = R.drawable.MT_Protector;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m50332() {
        this.f70715 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50326(String str) {
        this.f70709 = m50320(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50325(CharSequence charSequence) {
        this.f70712 = m50320(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50323(PendingIntent pendingIntent) {
        this.f70713 = pendingIntent;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50329() {
        this.f70706.flags |= 16;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50331() {
        this.f70706.flags |= 2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m50333() {
        this.f70703 = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50322(int i, String str, PendingIntent pendingIntent) {
        this.f70701.add(new C2028(i == 0 ? null : C1073.m15500((Resources) null, "", i), str, pendingIntent, new Bundle(), null, null, true, true));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50327(AbstractC1293 abstractC1293) {
        if (this.f70700 != abstractC1293) {
            this.f70700 = abstractC1293;
            if (abstractC1293 == null || abstractC1293.f30509 == this) {
                return;
            }
            abstractC1293.f30509 = this;
            m50327(abstractC1293);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m50334() {
        this.f70704 = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Notification m50321() {
        return new C1258(this).m23966();
    }

    /* JADX INFO: renamed from: ۧ */
    public static CharSequence m50320(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50324(Bitmap bitmap) {
        C1073 c1073M15503;
        if (bitmap == null) {
            c1073M15503 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f70717.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.MT_Protector);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.MT_Protector);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            c1073M15503 = C1073.m15503(bitmap);
        }
        this.f70707 = c1073M15503;
    }
}
