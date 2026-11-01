package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10758 implements InterfaceC12781 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C4723 f29823;

    public C10758(C4723 c4723) {
        this.f29823 = c4723;
    }

    @Override // p067l.InterfaceC12781
    /* JADX INFO: renamed from: ܳ */
    public final void mo24768(String str) {
        this.f29823.f10681.m53431(str);
    }

    @Override // p067l.InterfaceC12781
    /* JADX INFO: renamed from: ֫ */
    public final void mo24767(final int i, final int i2, final String str) {
        C7050.m16212(new Runnable() { // from class: l.ۢۤ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C4723 c4723 = this.f31876.f29823;
                C24164 c24164 = c4723.f10681;
                Locale locale = Locale.ENGLISH;
                c24164.m53437(str + " (" + i + "/" + i2 + MotionUtils.EASING_TYPE_FORMAT_END);
                c4723.f10681.m53429(R.string.MT_Protector);
                c4723.f10681.m53436(0);
            }
        });
    }

    @Override // p067l.InterfaceC12781
    /* JADX INFO: renamed from: ᩻ */
    public final void mo24770(int i) {
        this.f29823.f10681.m53436(i);
    }

    @Override // p067l.InterfaceC12781
    /* JADX INFO: renamed from: ᩳ */
    public final void mo24769() {
        this.f29823.f10681.m53429(R.string.MT_Protector);
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f29823.f10681.m53444();
    }
}
