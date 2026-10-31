package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes.dex */
public final class C22622 extends AbstractC10628 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public TextView f73071;

    public C22622(ActivityC6394 activityC6394, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC6394).inflate(R.layout.MT_Protector, viewGroup, false));
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.drag)).setImageResource(R.drawable.MT_Protector);
        this.itemView.setFocusable(false);
        this.itemView.setClickable(false);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f73071 = textView;
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
    }

    @Override // l.AbstractC10628
    /* JADX INFO: renamed from: ֫ */
    public final void mo26658(AbstractC20506 abstractC20506) {
        abstractC20506.getClass();
        if (abstractC20506 instanceof C21917) {
            this.f73071.setText(abstractC20506.mo46980().f70171);
        }
    }
}
