package p067l;

import android.widget.CompoundButton;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12787 extends AbstractC3398 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۙ */
    public static C1012 f35989;

    /* JADX INFO: renamed from: ᩶ */
    public static boolean f35990;

    /* JADX INFO: renamed from: ᩸ */
    public final C1068 f35991;

    /* JADX INFO: renamed from: ᩹ */
    public final C21249 f35992;

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ֫ */
    public final String mo6002(String str, String str2) {
        return str;
    }

    public C12787(AbstractActivityC5549 abstractActivityC5549, C21249 c21249) {
        this.f35992 = c21249;
        C1068 c1068 = new C1068(abstractActivityC5549);
        this.f35991 = c1068;
        c1068.setText(R.string.MT_Protector);
        c1068.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: renamed from: ۡ */
    public final C21249 m29335() {
        return this.f35992;
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ܿ */
    public final String mo6013() {
        return "#" + this.f35992.m48007();
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ֫ */
    public final void mo6004(C12686 c12686) {
        boolean z = f35990;
        C1068 c1068 = this.f35991;
        c1068.setChecked(z);
        c12686.addView(c1068);
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ۜ */
    public final void mo6007() throws Throwable {
        C21249 c21249 = this.f35992;
        c21249.m48006();
        List<C5155> listM48005 = c21249.m48005();
        f35989 = new C1012(listM48005.size());
        for (C5155 c5155 : listM48005) {
            if (f35990) {
                f35989.put(c5155.f12127, c5155.f12128);
            } else {
                f35989.put(c5155.f12128, c5155.f12127);
            }
        }
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ۧ */
    public final String mo6009(String str, String str2) {
        return (String) f35989.getOrDefault(str, null);
    }

    @Override // p067l.AbstractC3398
    /* JADX INFO: renamed from: ܳ */
    public final void mo6011() {
        f35989 = null;
        this.f35992.m48000();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        f35990 = z;
    }
}
