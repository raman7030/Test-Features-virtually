package l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC1036 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8092 f3781;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f3782;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f3783;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15852 f3784;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f3785;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC1036(ActivityC8092 activityC8092, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC8092).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f3781 = activityC8092;
        this.f3785 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f3782 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f3783 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C15852 c15852 = this.f3784;
        boolean z = c15852.f48971;
        ActivityC8092 activityC8092 = this.f3781;
        if (z) {
            if (c15852.f48969.equals("..")) {
                activityC8092.f24925.f7825.m15198();
                return;
            }
            activityC8092.f24925.f7825.f16483 = this.f3784.f48968.mo23554();
            activityC8092.f24925.f7825.m15199(null);
            return;
        }
        ApplicationC20075.f65008.edit().putString("apk_selector_path", this.f3784.f48968.getParent()).apply();
        String strMo23554 = this.f3784.f48968.mo23554();
        int i = ActivityC8092.f24923;
        Intent intent = new Intent();
        intent.putExtra("apkPath", strMo23554);
        activityC8092.setResult(-1, intent);
        activityC8092.finish();
    }
}
