package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes3.dex */
public class C3276 extends AbstractC22366 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10309 = 0;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public HashSet f10310 = new HashSet();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76959;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        m11555(R.string.MT_Protector);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        AbstractC15440[] abstractC15440Arr = (AbstractC15440[]) C22311.stream(m11558("ARG_PATHS")).map(new C14205(2)).toArray(new C20210());
        int iM11548 = m11548("dexVersion");
        boolean zM11552 = m11552("onlyFixHeader");
        boolean z = !zM11552 && m11552("replaceWithNop");
        int length = abstractC15440Arr.length;
        int i = 0;
        while (i < length) {
            AbstractC15440 abstractC15440 = abstractC15440Arr[i];
            AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(".tmp");
            int i2 = i + 1;
            mo11520(abstractC15440.getName());
            m50129(0);
            mo11538((i2 * 100) / length);
            try {
                C8901.m22977(abstractC15440, abstractC15440M36520, iM11548, zM11552, z, new C4687(this));
                if (mo1526()) {
                    abstractC15440M36520.mo23552();
                    return C17222.m40521();
                }
                if (ApplicationC20075.f65008.getBoolean("dfb", true)) {
                    abstractC15440.m36529();
                } else {
                    abstractC15440.mo27929();
                }
                abstractC15440M36520.m36498(abstractC15440, (Runnable) null);
                this.f10310.add(abstractC15440.getName());
                i = i2;
            } catch (Exception e) {
                abstractC15440M36520.mo23552();
                throw new Exception(e.getMessage() + " (" + abstractC15440.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
            }
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (m11542(c16560)) {
            if (!c17222.m40525()) {
                c16560.m39041();
            }
            HashSet hashSet = this.f10310;
            if (hashSet.isEmpty()) {
                return;
            }
            c16560.m39000((Collection) hashSet);
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14327(R.string.MT_Protector);
    }
}
