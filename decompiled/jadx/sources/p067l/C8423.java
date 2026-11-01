package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۛ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8BJ */
/* JADX INFO: loaded from: classes3.dex */
public class C8423 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final /* synthetic */ int f22578 = 0;

    /* JADX INFO: renamed from: ۘ֫ */
    public final C9330 f22579 = new C9330();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79706;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13467("targetPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
        }
        HashSet hashSetM21643 = this.f22579.m21643();
        if (hashSetM21643.isEmpty() || !m13461(c18108)) {
            return;
        }
        c18108.m41226((Collection) hashSetM21643);
        c18108.m41241();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("targetPath");
        this.f22579.m21644(m13462(), strArrM13494, strM13492, new C12447(this));
        return m13481();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
