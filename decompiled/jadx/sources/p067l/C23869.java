package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes.dex */
public final class C23869 extends AbstractC12470 {

    /* JADX INFO: renamed from: ֫ */
    public TextView f75799;

    public C23869(ActivityC8446 activityC8446, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC8446).inflate(R.layout.MT_Protector, viewGroup, false));
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.drag)).setImageResource(R.drawable.MT_Protector);
        this.itemView.setFocusable(false);
        this.itemView.setClickable(false);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f75799 = textView;
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
    }

    @Override // p067l.AbstractC12470
    /* JADX INFO: renamed from: ֫ */
    public final void mo28698(AbstractC21858 abstractC21858) {
        abstractC21858.getClass();
        if (abstractC21858 instanceof C23199) {
            this.f75799.setText(abstractC21858.mo49303().f72885);
        }
    }
}
