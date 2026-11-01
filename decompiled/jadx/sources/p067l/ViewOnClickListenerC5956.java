package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8WR */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC5956 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public TextView f14715;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17724 f14716;

    /* JADX INFO: renamed from: ᩶ */
    public C4615 f14717;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f14718;

    /* JADX INFO: renamed from: ᩹ */
    public TextView[] f14719;

    public ViewOnClickListenerC5956(AbstractActivityC5549 abstractActivityC5549, AbstractC17724 abstractC17724, View view) {
        super(view);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.MT_Protector), (TextView) view.findViewById(R.id.button1), (TextView) view.findViewById(R.id.button2), (TextView) view.findViewById(R.id.MT_Protector)};
        this.f14719 = textViewArr;
        this.f14718 = abstractActivityC5549;
        this.f14716 = abstractC17724;
        this.f14715 = (TextView) view.findViewById(R.id.text);
        textViewArr[0].setOnClickListener(this);
        textViewArr[1].setOnClickListener(this);
        textViewArr[2].setOnClickListener(this);
        textViewArr[3].setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13367(C4615 c4615) {
        this.f14717 = c4615;
        String strM9742 = c4615.m9742();
        AbstractC17724 abstractC17724 = this.f14716;
        TextView textView = this.f14715;
        abstractC17724.mo40282(textView, strM9742);
        int iM9740 = c4615.m9740();
        TextView[] textViewArr = this.f14719;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView2 = textViewArr[i];
            if (i < iM9740) {
                textView2.setVisibility(0);
                textView2.setText(c4615.m9743(i));
                if (c4615.m9741(i).m39350() != 0) {
                    textView2.setTextColor(C23223.f72969);
                    textView2.setEnabled(true);
                } else {
                    textView2.setTextColor(C23223.f72984);
                    textView2.setEnabled(false);
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        textView.setTextIsSelectable(false);
        C7050.m16206(200L, new RunnableC18012(2, this, c4615));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13366(ViewOnClickListenerC5956 viewOnClickListenerC5956, C4615 c4615) {
        TextView textView = viewOnClickListenerC5956.f14715;
        if (viewOnClickListenerC5956.f14717 != c4615 || textView.isTextSelectable()) {
            return;
        }
        textView.setTextIsSelectable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM9740 = this.f14717.m9740();
        TextView[] textViewArr = this.f14719;
        int iMin = Math.min(iM9740, textViewArr.length);
        for (int i = 0; i < iMin; i++) {
            if (view == textViewArr[i]) {
                this.f14717.m9741(i).mo7829(this.f14718);
            }
        }
    }
}
