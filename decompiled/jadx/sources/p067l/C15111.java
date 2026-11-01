package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.۬᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15111 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f43139;

    /* JADX INFO: renamed from: ܳ */
    public int f43140;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC22429 f43141;

    public C15111(ActivityC22429 activityC22429, boolean z) {
        this.f43141 = activityC22429;
        this.f43139 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f43141, R.string.MT_Protector);
        this.f26234.m33952((Runnable) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ActivityC22429 activityC22429 = this.f43141;
        Runnable runnable = new Runnable() { // from class: l.ۗ᩹ܽ
            @Override // java.lang.Runnable
            public final void run() {
                C15111.m34520(this.f14016);
            }
        };
        this.f43140 = 0;
        try {
            C5651 c5651 = new C5651();
            int size = activityC22429.f70775.f60049.size();
            Iterator it = activityC22429.f70775.f60049.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C13068) it.next()).m29921(c5651);
                i += 100;
                int i2 = i / size;
                if (i2 != this.f43140) {
                    this.f43140 = i2;
                    activityC22429.runOnUiThread(runnable);
                }
                if (this.f26234.m33960()) {
                    return;
                }
            }
            c5651.m12586();
            this.f43140 = -1;
            activityC22429.runOnUiThread(runnable);
            int iM12587 = c5651.m12587();
            byte[] bArr = new byte[iM12587];
            c5651.m12584(new C3838(bArr));
            C5651.m12582(bArr);
            Adler32 adler32 = new Adler32();
            adler32.update(bArr, 12, iM12587 - 12);
            int value = (int) adler32.getValue();
            bArr[8] = (byte) value;
            bArr[9] = (byte) (value >> 8);
            bArr[10] = (byte) (value >> 16);
            bArr[11] = (byte) (value >> 24);
            AbstractC17043 abstractC17043 = activityC22429.f70775.f60059;
            abstractC17043.getClass();
            abstractC17043.m38655(new C4975(0, bArr));
            ActivityC22429.f70770 = false;
        } finally {
            System.gc();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m34520(C15111 c15111) {
        if (c15111.f43140 == -1) {
            c15111.f26234.m33959();
            return;
        }
        c15111.f26234.m33951((CharSequence) (c15111.f43141.getString(R.string.MT_Protector) + ' ' + c15111.f43140 + '%'));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f43139) {
            this.f43141.finish();
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f43141.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
