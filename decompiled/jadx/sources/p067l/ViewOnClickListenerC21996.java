package p067l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21996 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f69107;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ActivityC23336 f69108;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC21996(ActivityC23336 activityC23336, View view, boolean z) {
        super(view);
        this.f69108 = activityC23336;
        this.f69107 = z;
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.MT_Protector);
        if (z) {
            textView.setText(activityC23336.getString(R.string.MT_Protector) + " (MT2/keys)");
            imageView2.setVisibility(8);
            C1781.m45965(imageView, C7050.m16224(R.string.MT_Protector));
            imageView.setOnClickListener(this);
            return;
        }
        textView.setText(activityC23336.getString(R.string.MT_Protector) + " (MT2/keystore)");
        C1781.m45965(imageView, C7050.m16224(R.string.MT_Protector));
        C1781.m45965(imageView2, C7050.m16224(R.string.MT_Protector));
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        ActivityC23336 activityC23336 = this.f69108;
        if (id == R.id.MT_Protector) {
            Main.m62(activityC23336, C17853.m40542().m38684(this.f69107 ? "keys" : "keystore").mo25505(), activityC23336.f73415);
        } else {
            new C15998(activityC23336, new InterfaceC1489() { // from class: l.ۜۙܽ
                @Override // p067l.InterfaceC1489
                public final void accept(Object obj) {
                    ActivityC23336 activityC23337 = this.f23066.f69108;
                    activityC23337.f73412 = ((AbstractC17043) obj).getName();
                    ActivityC23336.m51973(activityC23337);
                }
            }).m36356();
        }
    }
}
