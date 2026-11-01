package p067l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bin.p000mt.plus.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18269 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ActivityC17598 f54547;

    /* JADX INFO: renamed from: ܳ */
    public boolean f54548 = false;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC17043 f54549;

    /* JADX INFO: renamed from: ᩻ */
    public C11193 f54550;

    public C18269(ActivityC17598 activityC17598) {
        this.f54547 = activityC17598;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f54547, 100);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        C11193 c11193;
        ActivityC17598 activityC17598 = this.f54547;
        AbstractC17043 abstractC17043 = activityC17598.f52605;
        if (abstractC17043.mo25101() > 20971520) {
            throw new IOException("File too large");
        }
        byte[] bArrM38664 = abstractC17043.m38664();
        try {
            c11193 = new C11193(bArrM38664);
        } catch (IOException e) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM38664, 0, bArrM38664.length);
            if (bitmapDecodeByteArray == null) {
                throw e;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c11193 = new C11193(byteArrayOutputStream.toByteArray());
        }
        this.f54550 = c11193;
        if (c11193.m25833()) {
            activityC17598.f52599 = true;
        } else if (activityC17598.f52595.toLowerCase().endsWith(".9.png") && this.f54550.m25831()) {
            activityC17598.f52599 = false;
        } else {
            activityC17598.f52599 = false;
            this.f54548 = true;
        }
        AbstractC17043 abstractC17043M38685 = C17853.f53280.m38685();
        this.f54549 = abstractC17043M38685;
        abstractC17043M38685.m38660(this.f54550.m25832());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        boolean z = this.f54548;
        ActivityC17598 activityC17598 = this.f54547;
        if (!z) {
            activityC17598.f52598.m34982(this.f54550);
            activityC17598.m40060(this.f54550);
            activityC17598.f52603 = this.f54549;
            return;
        }
        C20671 c20671BuildDialog = activityC17598.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19140(1, this));
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧܶ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f36282.f54547.finish();
            }
        });
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46732();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f54547.m12260((Throwable) exc, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
