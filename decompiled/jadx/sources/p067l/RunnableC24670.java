package p067l;

import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24670 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractActivityC5549 f78044;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ TextView f78045;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19977 f78046;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7179 f78047;

    public /* synthetic */ RunnableC24670(C19977 c19977, C7179 c7179, TextView textView, AbstractActivityC5549 abstractActivityC5549) {
        this.f78046 = c19977;
        this.f78047 = c7179;
        this.f78045 = textView;
        this.f78044 = abstractActivityC5549;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.f78046.m45327(this.f78047.m16518().toString().trim()).m36212().size();
        AbstractActivityC5549 abstractActivityC5549 = this.f78044;
        this.f78045.setText(size == 0 ? abstractActivityC5549.getString(R.string.MT_Protector) : abstractActivityC5549.getString(R.string.MT_Protector, Integer.valueOf(size)));
    }
}
