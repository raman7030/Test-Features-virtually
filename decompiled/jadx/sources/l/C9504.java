package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9504 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f28874 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8092 f28875;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ViewOnClickListenerC8798 viewOnClickListenerC8798 = (ViewOnClickListenerC8798) abstractC3255;
        C17970 c17970 = (C17970) this.f28874.get(i);
        viewOnClickListenerC8798.f26800 = c17970;
        viewOnClickListenerC8798.f26799.setImageDrawable(c17970.f56044);
        c17970.f56042 = true;
        viewOnClickListenerC8798.f26801.setText(c17970.f56041);
        viewOnClickListenerC8798.f26796.setText(c17970.f56043);
        viewOnClickListenerC8798.f26797.setText(c17970.f56046);
    }

    public C9504(ActivityC8092 activityC8092) {
        this.f28875 = activityC8092;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC8798(this.f28875, viewGroup);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f28874.size();
    }
}
