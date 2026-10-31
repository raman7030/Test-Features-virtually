package l;

import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5527 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f17101;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10235 f17102;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f17103;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f17104;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f17105;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f17106;

    public /* synthetic */ RunnableC5527(Main main, long j, Spinner spinner, C10235 c10235, Spinner spinner2, TextView textView) {
        this.f17105 = main;
        this.f17106 = j;
        this.f17104 = spinner;
        this.f17102 = c10235;
        this.f17101 = spinner2;
        this.f17103 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Spinner spinner = this.f17101;
        int selectedItemPosition = this.f17104.getSelectedItemPosition();
        TextView textView = this.f17103;
        if (selectedItemPosition == 2 || selectedItemPosition == 3) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Main main = this.f17105;
        long j = this.f17106;
        C10235 c10235 = this.f17102;
        long j2 = 1;
        try {
            if (selectedItemPosition == 0) {
                long j3 = ((long) Integer.parseInt(c10235.m30436().toString())) * (1 << (spinner.getSelectedItemPosition() * 10));
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
                int i2 = Integer.parseInt(c10235.m30436().toString());
                if (i2 == 0) {
                    textView.setText("...");
                    return;
                }
                long j4 = j / ((long) i2);
                if (j4 >= 1 || j4 >= j) {
                    j2 = j4;
                }
                textView.setText(main.getString(R.string.MT_Protector, C22927.m51028(j2)));
            }
        } catch (Exception e) {
            if (c10235.m30526() == 0) {
                textView.setText("...");
            } else {
                textView.setText(e.toString());
            }
        }
    }
}
