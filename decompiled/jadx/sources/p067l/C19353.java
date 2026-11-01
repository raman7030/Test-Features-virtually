package p067l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19353 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ int f57778;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C18682 f57779;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ int f57780;

    public C19353(C18682 c18682, int i, int i2) {
        this.f57779 = c18682;
        this.f57778 = i;
        this.f57780 = i2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f57779.f55774.f46339, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.f57778;
        int i2 = this.f57780;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(4, 131));
        C15999 c15999 = this.f57779.f55774;
        c15999.f46341.setBounds(0, 0, i, i2);
        c15999.f46341.draw(canvas);
        OutputStream outputStreamMo25506 = c15999.f46343.mo25506(false);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamMo25506);
            if (outputStreamMo25506 != null) {
                outputStreamMo25506.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo25506 != null) {
                try {
                    outputStreamMo25506.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C15999 c15999 = this.f57779.f55774;
        c15999.f46340.m41231(c15999.f46343);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f57779.f55774.f46339.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        C17127.m38756();
    }
}
