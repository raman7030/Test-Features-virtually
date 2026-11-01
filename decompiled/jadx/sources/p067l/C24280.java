package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes.dex */
public final class C24280 extends AbstractC22529 {

    /* JADX INFO: renamed from: ֫ */
    public ImageView f76909;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ActivityC11800 f76910;

    /* JADX INFO: renamed from: ܽ */
    public TextView f76911;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24280(ActivityC11800 activityC11800, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC11800).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f76910 = activityC11800;
        this.itemView.findViewById(R.id.MT_Protector).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.drag)).setImageResource(R.drawable.MT_Protector);
        this.itemView.setFocusable(false);
        this.itemView.setClickable(false);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f76911 = textView;
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.MT_Protector);
        this.f76909 = imageView;
        imageView.setImageResource(R.drawable.MT_Protector);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۨܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20671 c20671BuildDialog = this.f38119.f76910.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                c20671BuildDialog.m46732();
            }
        });
    }

    @Override // p067l.AbstractC22529
    /* JADX INFO: renamed from: ֫ */
    public final void mo21060(AbstractC15562 abstractC15562) {
        abstractC15562.getClass();
        if (abstractC15562 instanceof C8187) {
            C8187 c8187Mo18966 = abstractC15562.mo18966();
            this.f76911.setText(c8187Mo18966.f21614);
            int i = c8187Mo18966.f21613;
            ImageView imageView = this.f76909;
            if (i == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }
}
