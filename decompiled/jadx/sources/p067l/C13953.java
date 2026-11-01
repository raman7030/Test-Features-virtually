package p067l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۫ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13953 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f39352;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f39353;

    /* JADX INFO: renamed from: ܳ */
    public boolean f39354 = false;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC17043 f39355;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C7918 f39356;

    public C13953(C7918 c7918, AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043, String str) {
        this.f39356 = c7918;
        this.f39352 = abstractActivityC5549;
        this.f39355 = abstractC17043;
        this.f39353 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        final AbstractActivityC5549 abstractActivityC5549 = this.f39352;
        C7050.m16206(200L, new Runnable() { // from class: l.۬ۙ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C13953.m31726(this.f41744, abstractActivityC5549);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m31726(C13953 c13953, AbstractActivityC5549 abstractActivityC5549) {
        if (c13953.f39354) {
            return;
        }
        c13953.m22243(abstractActivityC5549, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C16150, IOException {
        AbstractC17043 abstractC17043 = this.f39355;
        boolean zM38646 = abstractC17043.m38646();
        String strM38675 = null;
        C7918 c7918 = this.f39356;
        if (zM38646) {
            Typeface typefaceCreateFromFile = Typeface.createFromFile(this.f39353);
            if (typefaceCreateFromFile == null || typefaceCreateFromFile == Typeface.DEFAULT) {
                throw new C16150(R.string.MT_Protector);
            }
            abstractC17043.m38658(c7918.f20755.f33263, (C19056) null, (InterfaceC7717) null);
            c7918.f20755.f33264 = true;
        } else {
            abstractC17043.m38658(c7918.f20755.f33263, (C19056) null, (InterfaceC7717) null);
            c7918.f20755.f33264 = true;
            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(c7918.f20755.f33263.mo25505());
            if (typefaceCreateFromFile2 == null || typefaceCreateFromFile2 == Typeface.DEFAULT) {
                throw new C16150(R.string.MT_Protector);
            }
        }
        try {
            InputStream inputStreamMo29987 = c7918.f20755.f33263.mo29987();
            try {
                String strM27041 = C11790.m27040(inputStreamMo29987).m27041(4, c7918.m9012().getResources().getConfiguration().locale);
                if (!TextUtils.isEmpty(strM27041)) {
                    if (inputStreamMo29987 != null) {
                        inputStreamMo29987.close();
                    }
                    strM38675 = strM27041;
                } else if (inputStreamMo29987 != null) {
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
        if (strM38675 == null) {
            strM38675 = abstractC17043.m38675();
        }
        c7918.f20755.f33261 = strM38675;
        c7918.f20755.f33262 = C22148.m49955(c7918.f20755.f33263, "MD5");
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C7918 c7918 = this.f39356;
        c7918.f20755.m27304();
        String[] strArr = c7918.f20755.f33256;
        int i = c7918.f20755.f33260;
        String strM16224 = c7918.f20755.f33261;
        if (strM16224 == null) {
            strM16224 = C7050.m16224(R.string.MT_Protector);
        }
        strArr[i] = C7050.m16203(R.string.MT_Protector, strM16224);
        ((BaseAdapter) c7918.f20755.f33259.m3856().getAdapter()).notifyDataSetChanged();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (!(exc instanceof IOException)) {
            C22682.m50799(R.string.MT_Protector);
        } else {
            this.f39352.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f39354 = true;
        m22249();
    }
}
