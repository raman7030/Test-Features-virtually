package l;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܳ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08E1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14807 extends AbstractC13810 {

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final Context f45200;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "MidiRenderer";
    }

    @Override // l.AbstractC13810
    /* JADX INFO: renamed from: ֫ */
    public final C8353 mo17567(InterfaceC1381 interfaceC1381) {
        int i = C11281.f33798;
        return C3603.m11049(4, 2, 44100);
    }

    public C14807(Context context, Handler handler, InterfaceC5345 interfaceC5345, InterfaceC4639 interfaceC4639) {
        super(handler, interfaceC5345, interfaceC4639);
        this.f45200 = context.getApplicationContext();
    }

    @Override // l.AbstractC13810
    /* JADX INFO: renamed from: ܿ */
    public final int mo17569(C8353 c8353) {
        if (!"audio/x-exoplayer-midi".equals(c8353.f25614)) {
            return 0;
        }
        int i = C11281.f33798;
        return !m33142(C3603.m11049(4, 2, 44100)) ? 1 : 4;
    }

    @Override // l.AbstractC13810
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1381 mo17568(C8353 c8353) {
        return new C11281(this.f45200);
    }
}
