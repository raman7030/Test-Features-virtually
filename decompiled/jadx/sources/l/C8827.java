package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8827 implements InterfaceC10956 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2477 f26899;

    public C8827(C2477 c2477) {
        this.f26899 = c2477;
    }

    @Override // l.InterfaceC10956
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo22798(String str) {
        this.f26899.f7893.m51040(str);
    }

    @Override // l.InterfaceC10956
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22797(final int i, final int i2, final String str) {
        C4925.m14315(new Runnable() { // from class: l.ۢۤ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C2477 c2477 = this.f28930.f26899;
                C22933 c22933 = c2477.f7893;
                Locale locale = Locale.ENGLISH;
                c22933.m51046(str + " (" + i + "/" + i2 + MotionUtils.EASING_TYPE_FORMAT_END);
                c2477.f7893.m51038(R.string.MT_Protector);
                c2477.f7893.m51045(0);
            }
        });
    }

    @Override // l.InterfaceC10956
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo22800(int i) {
        this.f26899.f7893.m51045(i);
    }

    @Override // l.InterfaceC10956
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo22799() {
        this.f26899.f7893.m51038(R.string.MT_Protector);
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f26899.f7893.m51053();
    }
}
