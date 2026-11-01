package p067l;

import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7622 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Spinner f19943;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12096 f19944;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ TextView f19945;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Spinner f19946;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Main f19947;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ long f19948;

    public /* synthetic */ RunnableC7622(Main main, long j, Spinner spinner, C12096 c12096, Spinner spinner2, TextView textView) {
        this.f19947 = main;
        this.f19948 = j;
        this.f19946 = spinner;
        this.f19944 = c12096;
        this.f19943 = spinner2;
        this.f19945 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Spinner spinner = this.f19943;
        int selectedItemPosition = this.f19946.getSelectedItemPosition();
        TextView textView = this.f19945;
        if (selectedItemPosition == 2 || selectedItemPosition == 3) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Main main = this.f19947;
        long j = this.f19948;
        C12096 c12096 = this.f19944;
        long j2 = 1;
        try {
            if (selectedItemPosition == 0) {
                long j3 = ((long) Integer.parseInt(c12096.m32500().toString())) * (1 << (spinner.getSelectedItemPosition() * 10));
                if (j3 == 0) {
                    textView.setText("...");
                    return;
                }
                int i = (int) (j / j3);
                if (((long) i) * j3 != j || i == 0) {
                    i++;
                }
                textView.setText(main.getResources().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i)));
                return;
            }
            if (selectedItemPosition == 1) {
                int i2 = Integer.parseInt(c12096.m32500().toString());
                if (i2 == 0) {
                    textView.setText("...");
                    return;
                }
                long j4 = j / ((long) i2);
                if (j4 >= 1 || j4 >= j) {
                    j2 = j4;
                }
                textView.setText(main.getString(R.string.MT_Protector, C24158.m53419(j2)));
            }
        } catch (Exception e) {
            if (c12096.m32590() == 0) {
                textView.setText("...");
            } else {
                textView.setText(e.toString());
            }
        }
    }
}
