package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۘ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes3.dex */
public class C3798 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f11980 = new ArrayList();

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f11981 = new ArrayList();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo3145() {
        return false;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76957;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() {
        String[] strArrM11558 = m11558("oldNames");
        String[] strArrM11559 = m11558("newNames");
        String strM11556 = m11556(MotionUtils.EASING_TYPE_PATH);
        C17721.m41503(strM11556, EnumC16309.MODIFY_DIRECTORY);
        SystemClock.sleep(200L);
        C19277 c19277 = new C19277(strArrM11558.length);
        c19277.m44459(new C23684(1, this));
        int length = 1000 / strArrM11558.length;
        if (length > 150) {
            length = 150;
        }
        for (int i = 0; i < strArrM11558.length; i++) {
            C6703 c6703 = new C6703(strArrM11558[i], strArrM11559[i]);
            c19277.m44460(1);
            mo11520(c6703.m18263());
            if (length > 0) {
                SystemClock.sleep(length);
            }
            if (c6703.m18260(strM11556)) {
                this.f11980.add(c6703.m18262());
            } else {
                this.f11981.add(c6703.m18263());
            }
            if (mo1526()) {
                return C17222.m40521();
            }
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo3270(AbstractActivityC3346 abstractActivityC3346, C17222 c17222, boolean z) {
        ArrayList arrayList = this.f11981;
        if (arrayList.isEmpty()) {
            return;
        }
        C20815.m47635(abstractActivityC3346, arrayList);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (m11542(c16560)) {
            if (c17222.m40526()) {
                c16560.m39041();
                if (this.f11981.isEmpty()) {
                    C21374.m48457(R.string.MT_Protector);
                }
            }
            ArrayList arrayList = this.f11980;
            if (arrayList.isEmpty()) {
                return;
            }
            c16560.m39000((Collection) arrayList);
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
        C9068.m23429();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14327(R.string.MT_Protector);
    }
}
