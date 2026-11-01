package p067l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10730 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public TextView f29721;

    /* JADX INFO: renamed from: ۙ */
    public TextView f29722;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ ActivityC10059 f29723;

    /* JADX INFO: renamed from: ᩶ */
    public ImageView f29724;

    /* JADX INFO: renamed from: ᩸ */
    public C19447 f29725;

    /* JADX INFO: renamed from: ᩹ */
    public TextView f29726;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10730(ActivityC10059 activityC10059, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC10059).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f29723 = activityC10059;
        this.f29724 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f29726 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f29721 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f29722 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.f29725.f59242.applicationInfo.sourceDir;
        int i = ActivityC10059.f27834;
        Intent intent = new Intent();
        intent.putExtra("apkPath", str);
        ActivityC10059 activityC10059 = this.f29723;
        activityC10059.setResult(-1, intent);
        activityC10059.finish();
    }
}
