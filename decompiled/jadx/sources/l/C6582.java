package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6582 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20289;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20694 f20290;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20291;

    public C6582(C20694 c20694, int i, int i2) {
        this.f20290 = c20694;
        this.f20289 = i;
        this.f20291 = i2;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f20290.f66667.f28549.m39056(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.f20289;
        int i2 = this.f20291;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(4, 131));
        C20694 c20694 = this.f20290;
        canvas.scale(i / c20694.f66666, i2 / c20694.f66665);
        C9405 c9405 = c20694.f66667;
        c9405.f28550.m38401(canvas);
        OutputStream outputStreamMo23555 = c9405.f28548.mo23555(false);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamMo23555);
            if (outputStreamMo23555 != null) {
                outputStreamMo23555.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo23555 != null) {
                try {
                    outputStreamMo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C9405 c9405 = this.f20290.f66667;
        c9405.f28549.m39005(c9405.f28548);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f20290.f66667.f28549.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36596();
    }
}
