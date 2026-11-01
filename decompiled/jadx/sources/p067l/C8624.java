package p067l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8624 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ int f23166;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C22036 f23167;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ int f23168;

    public C8624(C22036 c22036, int i, int i2) {
        this.f23167 = c22036;
        this.f23166 = i;
        this.f23168 = i2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f23167.f69348.f31496.m41282(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.f23166;
        int i2 = this.f23168;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(4, 131));
        C22036 c22036 = this.f23167;
        canvas.scale(i / c22036.f69347, i2 / c22036.f69346);
        C11307 c11307 = c22036.f69348;
        c11307.f31497.m40616(canvas);
        OutputStream outputStreamMo25506 = c11307.f31495.mo25506(false);
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
        C11307 c11307 = this.f23167.f69348;
        c11307.f31496.m41231(c11307.f31495);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f23167.f69348.f31496.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        C17127.m38756();
    }
}
