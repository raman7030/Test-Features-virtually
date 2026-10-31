package l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8798 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f26796;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f26797;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8092 f26798;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f26799;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17970 f26800;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f26801;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8798(ActivityC8092 activityC8092, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC8092).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f26798 = activityC8092;
        this.f26799 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f26801 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f26796 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f26797 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.f26800.f56045.applicationInfo.sourceDir;
        int i = ActivityC8092.f24923;
        Intent intent = new Intent();
        intent.putExtra("apkPath", str);
        ActivityC8092 activityC8092 = this.f26798;
        activityC8092.setResult(-1, intent);
        activityC8092.finish();
    }
}
