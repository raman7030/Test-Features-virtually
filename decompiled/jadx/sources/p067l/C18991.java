package p067l;

import android.widget.CompoundButton;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18991 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C0990 f56622;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C0990 f56623;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C0990 f56624;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C0990 f56625;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C0990 f56626;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f56627;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C0990 f56628;

    public C18991(C0990 c0990, C0990 c0991, C0990 c0992, C0990 c0993, C0990 c0994, C0990 c0995) {
        this.f56624 = c0990;
        this.f56626 = c0991;
        this.f56622 = c0992;
        this.f56625 = c0993;
        this.f56623 = c0994;
        this.f56628 = c0995;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f56627) {
            return;
        }
        this.f56627 = true;
        int id = compoundButton.getId();
        C0990 c0990 = this.f56623;
        C0990 c0991 = this.f56625;
        C0990 c0992 = this.f56622;
        C0990 c0993 = this.f56626;
        C0990 c0994 = this.f56624;
        if (id == R.id.MT_Protector) {
            c0994.setChecked(z);
            c0993.setChecked(z);
            c0992.setChecked(z);
            c0991.setChecked(z);
            c0990.setChecked(z);
        } else {
            boolean z2 = c0994.isChecked() && c0993.isChecked() && c0992.isChecked() && c0991.isChecked() && c0990.isChecked();
            C0990 c0995 = this.f56628;
            if (c0995.isChecked() != z2) {
                c0995.setChecked(z2);
            }
        }
        this.f56627 = false;
    }
}
