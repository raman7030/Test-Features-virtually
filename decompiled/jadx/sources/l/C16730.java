package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bin.mt.plus.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16730 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f51364;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51365 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f51366;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9285 f51367;

    public C16730(ActivityC16024 activityC16024) {
        this.f51364 = activityC16024;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f51364, 100);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        C9285 c9285;
        ActivityC16024 activityC16024 = this.f51364;
        AbstractC15440 abstractC15440 = activityC16024.f49441;
        if (abstractC15440.mo23127() > 20971520) {
            throw new IOException("File too large");
        }
        byte[] bArrM36506 = abstractC15440.m36506();
        try {
            c9285 = new C9285(bArrM36506);
        } catch (IOException e) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM36506, 0, bArrM36506.length);
            if (bitmapDecodeByteArray == null) {
                throw e;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c9285 = new C9285(byteArrayOutputStream.toByteArray());
        }
        this.f51367 = c9285;
        if (c9285.m23824()) {
            activityC16024.f49435 = true;
        } else if (activityC16024.f49431.toLowerCase().endsWith(".9.png") && this.f51367.m23822()) {
            activityC16024.f49435 = false;
        } else {
            activityC16024.f49435 = false;
            this.f51365 = true;
        }
        AbstractC15440 abstractC15440M36527 = C16293.f50113.m36527();
        this.f51366 = abstractC15440M36527;
        abstractC15440M36527.m36502(this.f51367.m23823());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        boolean z = this.f51365;
        ActivityC16024 activityC16024 = this.f51364;
        if (!z) {
            activityC16024.f49434.m32867(this.f51367);
            activityC16024.m37873(this.f51367);
            activityC16024.f49439 = this.f51366;
            return;
        }
        C19258 c19258BuildDialog = activityC16024.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC17646(1, this));
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧܶ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f33280.f51364.finish();
            }
        });
        c19258BuildDialog.m44428(false);
        c19258BuildDialog.m44438();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f51364.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
