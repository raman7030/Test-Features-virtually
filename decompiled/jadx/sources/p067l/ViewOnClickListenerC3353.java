package p067l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC3353 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ ActivityC10059 f6553;

    /* JADX INFO: renamed from: ۙ */
    public TextView f6554;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f6555;

    /* JADX INFO: renamed from: ᩸ */
    public C17434 f6556;

    /* JADX INFO: renamed from: ᩹ */
    public ImageView f6557;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC3353(ActivityC10059 activityC10059, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC10059).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f6553 = activityC10059;
        this.f6557 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f6554 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f6555 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C17434 c17434 = this.f6556;
        boolean z = c17434.f52109;
        ActivityC10059 activityC10059 = this.f6553;
        if (z) {
            if (c17434.f52107.equals("..")) {
                activityC10059.f27836.f10614.m17101();
                return;
            }
            activityC10059.f27836.f10614.f19320 = this.f6556.f52106.mo25505();
            activityC10059.f27836.f10614.m17102(null);
            return;
        }
        ApplicationC21448.f67649.edit().putString("apk_selector_path", this.f6556.f52106.getParent()).apply();
        String strMo25505 = this.f6556.f52106.mo25505();
        int i = ActivityC10059.f27834;
        Intent intent = new Intent();
        intent.putExtra("apkPath", strMo25505);
        activityC10059.setResult(-1, intent);
        activityC10059.finish();
    }
}
