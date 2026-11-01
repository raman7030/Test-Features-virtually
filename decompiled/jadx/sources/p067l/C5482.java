package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes3.dex */
public class C5482 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final /* synthetic */ int f13117 = 0;

    /* JADX INFO: renamed from: ۘ֫ */
    public HashSet f13118 = new HashSet();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79711;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        m13491(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        AbstractC17043[] abstractC17043Arr = (AbstractC17043[]) C23573.stream(m13494("ARG_PATHS")).map(new C15868(2)).toArray(new C21576());
        int iM13484 = m13484("dexVersion");
        boolean zM13488 = m13488("onlyFixHeader");
        boolean z = !zM13488 && m13488("replaceWithNop");
        int length = abstractC17043Arr.length;
        int i = 0;
        while (i < length) {
            AbstractC17043 abstractC17043 = abstractC17043Arr[i];
            AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(".tmp");
            int i2 = i + 1;
            mo13456(abstractC17043.getName());
            m52469(0);
            mo13474((i2 * 100) / length);
            try {
                C10828.m24948(abstractC17043, abstractC17043M38678, iM13484, zM13488, z, new C6823(this));
                if (mo3924()) {
                    abstractC17043M38678.mo25503();
                    return C18736.m42768();
                }
                if (ApplicationC21448.f67649.getBoolean("dfb", true)) {
                    abstractC17043.m38687();
                } else {
                    abstractC17043.mo29990();
                }
                abstractC17043M38678.m38656(abstractC17043, (Runnable) null);
                this.f13118.add(abstractC17043.getName());
                i = i2;
            } catch (Exception e) {
                abstractC17043M38678.mo25503();
                throw new Exception(e.getMessage() + " (" + abstractC17043.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
            }
        }
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (m13478(c18107)) {
            if (!c18736.m42772()) {
                c18107.m41267();
            }
            HashSet hashSet = this.f13118;
            if (hashSet.isEmpty()) {
                return;
            }
            c18107.m41226((Collection) hashSet);
            c18107.m41241();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16224(R.string.MT_Protector);
    }
}
