package p067l;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16385 implements InterfaceC21081 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9010 f48144;

    public C16385(C9010 c9010) {
        this.f48144 = c9010;
    }

    @Override // p067l.InterfaceC21081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4934(C13010 c13010, C17095 c17095, long j) {
        int iM20860;
        int i = 0;
        C9010 c9010 = this.f48144;
        c9010.f24451 = c13010;
        C7050.m16221().removeCallbacksAndMessages(C9010.f24446);
        C9010.m20856(c17095);
        C9010.m20854(j);
        C25103 c25103 = c9010.f24455;
        if (c25103 != null) {
            c9010.f24455 = null;
        }
        if (c25103 != null) {
            iM20860 = C9010.m20860(c25103.position());
        } else {
            int i2 = c9010.f24450;
            if (i2 > 0) {
                if (j <= 0 || i2 < j) {
                    i = i2;
                } else {
                    c9010.f24450 = 0;
                    if (c9010.f24457) {
                        C10351.m23974(c9010.f24448);
                    }
                }
            }
            iM20860 = i;
        }
        if (!c9010.f24452) {
            c9010.f24450 = -1;
        }
        if (iM20860 > 0) {
            C9010.m20857(iM20860);
            C25103 c25104 = new C25103(c13010, iM20860);
            c9010.f24455 = c25104;
            c9010.f24458.mo17762(iM20860, new RunnableC18397(c9010, c25104, c13010));
            return;
        }
        C22422.f70733.mo4067((Object) 0);
        C22422.f70736.mo4067((Object) 0);
        if (c9010.f24453) {
            C9010.m20859(c9010);
        }
    }

    @Override // p067l.InterfaceC21081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4932(long j) {
        C9010.m20854(j);
    }

    @Override // p067l.InterfaceC21081
    /* JADX INFO: renamed from: ۧ */
    public final void mo4937(C13010 c13010, Exception exc) {
        exc.getClass();
        C7050.m16221().removeCallbacksAndMessages(C9010.f24446);
        boolean zM9270 = C4435.m9270(exc);
        C9010 c9010 = this.f48144;
        if (zM9270) {
            long j = c9010.f24449;
            c9010.m20866(true);
            Application applicationM16232 = C7050.m16232();
            int i = ServiceC6328.f16400;
            applicationM16232.startService(new Intent(applicationM16232, (Class<?>) ServiceC6328.class).setAction("bin.mt.media.MusicPlayerService.ACTION_EXIT").putExtra("playbackSessionId", j));
            return;
        }
        C22422.f70730.mo4067(c13010.f36613);
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = exc.toString();
        }
        C22422.f70739.mo4067(message);
        C22422.f70734.mo4067(message);
        C22422.f70737.mo4067((Object) 0);
        C22422.f70727.mo4067((Object) 0);
        C22422.f70733.mo4067((Object) 0);
        C22422.f70736.mo4067((Object) 0);
        C22422.f70726.mo4067(Boolean.FALSE);
        c9010.f24453 = false;
        Drawable drawableM17844 = C7709.m17844();
        C22422.f70728.mo4067(drawableM17844);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, config);
        drawableM17844.setBounds(0, 0, 256, 256);
        drawableM17844.draw(new Canvas(bitmapCreateBitmap));
        C22422.f70729.mo4067(bitmapCreateBitmap);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(256, 256, config);
        new Canvas(bitmapCreateBitmap2).drawColor(C21265.f66836.mo3598());
        C22422.f70731.mo4067(bitmapCreateBitmap2);
    }

    @Override // p067l.InterfaceC21081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4933(C13010 c13010, Exception exc) {
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = exc.toString();
        }
        C22422.f70739.mo4067(message);
        C22422.f70734.mo4067(message);
        C22422.f70726.mo4067(Boolean.FALSE);
        this.f48144.f24453 = false;
    }

    @Override // p067l.InterfaceC21081
    /* JADX INFO: renamed from: ۧ */
    public final void mo4936(int i) {
        if (this.f48144.f24454) {
            return;
        }
        int i2 = i / 50;
        C7350 c7350 = C22422.f70733;
        Integer num = (Integer) c7350.m4060();
        C12826.requireNonNull(num);
        if (i2 != num.intValue()) {
            c7350.mo4067(Integer.valueOf(i2));
        }
        int iM50341 = C22422.m50341(i);
        C7350 c7351 = C22422.f70736;
        Integer num2 = (Integer) c7351.m4060();
        C12826.requireNonNull(num2);
        if (iM50341 != num2.intValue()) {
            c7351.mo4067(Integer.valueOf(iM50341));
        }
    }

    @Override // p067l.InterfaceC21081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4931(int i) {
        C22422.f70734.mo4067(C7050.m16224(R.string.MT_Protector) + " " + i + "%");
    }

    @Override // p067l.InterfaceC21081
    /* JADX INFO: renamed from: ۧ */
    public final void mo4938(boolean z) {
        if (z) {
            C9010 c9010 = this.f48144;
            if (c9010.f24452) {
                c9010.f24450 = -1;
                c9010.f24452 = false;
                if (c9010.f24457) {
                    C10351.m23974(c9010.f24448);
                }
            }
        }
        C22422.f70726.mo4067(Boolean.valueOf(z));
    }

    @Override // p067l.InterfaceC21081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4930() {
        C9010 c9010 = this.f48144;
        C19799 c19799 = c9010.f24456;
        InterfaceC7669 interfaceC7669 = c9010.f24458;
        if (c9010.f24454) {
            return;
        }
        int iM45020 = C19799.m45020();
        if (iM45020 == 1) {
            interfaceC7669.mo17764();
            return;
        }
        if (iM45020 == 3) {
            interfaceC7669.mo17767();
            c9010.f24453 = false;
            C22422.f70726.mo4067(Boolean.FALSE);
            C22422.f70736.mo4067((Object) 0);
            C22422.f70733.mo4067((Object) 0);
            C7350 c7350 = C22422.f70728;
            c7350.mo4067((Drawable) c7350.m4060());
            return;
        }
        if (c19799.size() == 1) {
            interfaceC7669.mo17764();
        } else {
            c19799.mo18257();
            c9010.m20853();
        }
    }
}
