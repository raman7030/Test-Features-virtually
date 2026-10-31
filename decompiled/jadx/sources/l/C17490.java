package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17490 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53434;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53435;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53436;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53437;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53438;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f53439;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53440;

    public C17490(C2978 c2978, C2978 c2979, C2978 c29710, C2978 c29711, C2978 c29712, C2978 c29713) {
        this.f53436 = c2978;
        this.f53438 = c2979;
        this.f53434 = c29710;
        this.f53437 = c29711;
        this.f53435 = c29712;
        this.f53440 = c29713;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f53439) {
            return;
        }
        this.f53439 = true;
        int id = compoundButton.getId();
        C2978 c2978 = this.f53435;
        C2978 c2979 = this.f53437;
        C2978 c29710 = this.f53434;
        C2978 c29711 = this.f53438;
        C2978 c29712 = this.f53436;
        if (id == R.id.MT_Protector) {
            c29712.setChecked(z);
            c29711.setChecked(z);
            c29710.setChecked(z);
            c2979.setChecked(z);
            c2978.setChecked(z);
        } else {
            boolean z2 = c29712.isChecked() && c29711.isChecked() && c29710.isChecked() && c2979.isChecked() && c2978.isChecked();
            C2978 c29713 = this.f53440;
            if (c29713.isChecked() != z2) {
                c29713.setChecked(z2);
            }
        }
        this.f53439 = false;
    }
}
