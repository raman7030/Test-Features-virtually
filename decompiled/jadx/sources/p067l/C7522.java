package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۚܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes3.dex */
public class C7522 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC5375 f19752;

    /* JADX INFO: renamed from: ۘ֫ */
    public ArrayList f19753 = new ArrayList();

    /* JADX INFO: renamed from: ܺ֫ */
    public ArrayList f19754 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo5459() {
        return false;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79709;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        String[] strArrM13494 = m13494("oldNames");
        String[] strArrM13495 = m13494("newNames");
        String strM13492 = m13492(MotionUtils.EASING_TYPE_PATH);
        this.f19752 = (AbstractC5375) m13462();
        C20689 c20689 = new C20689(strArrM13494.length);
        c20689.m46753(new C17714(5, this));
        for (int i = 0; i < strArrM13494.length; i++) {
            C8739 c8739 = new C8739(strArrM13494[i], strArrM13495[i]);
            c20689.m46754(1);
            mo13456(c8739.m20211());
            if (c8739.m20209(this.f19752, strM13492)) {
                this.f19753.add(c8739.m20210());
            } else {
                this.f19754.add(c8739.m20211());
            }
            if (mo3924()) {
                return C18736.m42768();
            }
        }
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5589(AbstractActivityC5549 abstractActivityC5549, C18736 c18736, boolean z) {
        ArrayList arrayList = this.f19754;
        if (arrayList.isEmpty()) {
            return;
        }
        C22151.m49963(abstractActivityC5549, arrayList);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (m13478(c18107)) {
            if (c18736.m42773()) {
                c18107.m41267();
                if (this.f19754.isEmpty()) {
                    C22682.m50793(R.string.MT_Protector);
                }
            }
            ArrayList arrayList = this.f19753;
            if (arrayList.isEmpty()) {
                return;
            }
            c18107.m41226((Collection) arrayList);
            c18107.m41241();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38755(this.f19752.mo11732());
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16224(R.string.MT_Protector);
    }
}
