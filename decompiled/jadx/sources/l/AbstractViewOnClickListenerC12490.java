package l;

import android.animation.ObjectAnimator;
import android.view.View;
import bin.mt.plus.Main;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4LW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC12490 extends AbstractC11580 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f37521;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37522;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f37523;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13195 f37524;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f37525;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3318 f37526;

    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i);

    /* JADX INFO: renamed from: ᩳ */
    public void mo14296() {
    }

    public AbstractViewOnClickListenerC12490(Main main, String str, String str2, C3318 c3318) {
        super(main);
        this.f37525 = new ArrayList();
        this.f37523 = str;
        this.f37521 = str2;
        this.f37526 = c3318;
        this.f37522 = ApplicationC20075.f65008.getBoolean(str2, true);
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo15528() {
        ArrayList arrayList = this.f37525;
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (this.f37522) {
            return arrayList.size() + 1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15527(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606) {
        C13195 c13195 = (C13195) abstractViewOnLongClickListenerC14606;
        this.f37524 = c13195;
        c13195.f39457 = this;
        c13195.f44703.setText(this.f37523);
        this.f37524.itemView.setOnClickListener(this);
        this.f37524.itemView.setOnLongClickListener(this);
        this.f37524.f39458.setRotationX(this.f37522 ? 0.0f : 180.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        boolean z = !this.f37522;
        this.f37522 = z;
        interfaceC13049Edit.putBoolean(this.f37521, z).apply();
        boolean z2 = this.f37522;
        ArrayList arrayList = this.f37525;
        C3318 c3318 = this.f37526;
        if (z2) {
            mo14296();
            ObjectAnimator.ofFloat(this.f37524.f39458, "rotationX", 180.0f, 0.0f).setDuration(200L).start();
            c3318.notifyItemRangeInserted(c3318.m10143(this) + 1, arrayList.size());
        } else {
            ObjectAnimator.ofFloat(this.f37524.f39458, "rotationX", 0.0f, 180.0f).setDuration(200L).start();
            c3318.notifyItemRangeRemoved(c3318.m10143(this) + 1, arrayList.size());
        }
    }
}
