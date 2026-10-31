package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10962 extends AbstractC1083 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3432 f32997;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean f32998;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4554 f32999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19866 f33000;

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ֫ */
    public final String mo3731(String str, String str2) {
        return str;
    }

    public C10962(AbstractActivityC3346 abstractActivityC3346, C19866 c19866) {
        this.f33000 = c19866;
        C4554 c4554 = new C4554(abstractActivityC3346);
        this.f32999 = c4554;
        c4554.setText(R.string.MT_Protector);
        c4554.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C19866 m27274() {
        return this.f33000;
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ܿ */
    public final String mo3742() {
        return "#" + this.f33000.m45696();
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ֫ */
    public final void mo3733(C10856 c10856) {
        boolean z = f32998;
        C4554 c4554 = this.f32999;
        c4554.setChecked(z);
        c10856.addView(c4554);
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ۜ */
    public final void mo3736() throws Throwable {
        C19866 c19866 = this.f33000;
        c19866.m45695();
        List<C2932> listM45694 = c19866.m45694();
        f32997 = new C3432(listM45694.size());
        for (C2932 c2932 : listM45694) {
            if (f32998) {
                f32997.put(c2932.f9328, c2932.f9329);
            } else {
                f32997.put(c2932.f9329, c2932.f9328);
            }
        }
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ۧ */
    public final String mo3738(String str, String str2) {
        return (String) f32997.getOrDefault(str, null);
    }

    @Override // l.AbstractC1083
    /* JADX INFO: renamed from: ܳ */
    public final void mo3740() {
        f32997 = null;
        this.f33000.m45689();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        f32998 = z;
    }
}
