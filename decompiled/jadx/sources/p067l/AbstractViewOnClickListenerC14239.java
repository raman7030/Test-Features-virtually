package p067l;

import android.animation.ObjectAnimator;
import android.view.View;
import bin.p000mt.plus.Main;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4LW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC14239 extends AbstractC13374 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final String f40544;

    /* JADX INFO: renamed from: ۙ */
    public boolean f40545;

    /* JADX INFO: renamed from: ۫ */
    public final String f40546;

    /* JADX INFO: renamed from: ۬ */
    public C14909 f40547;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f40548;

    /* JADX INFO: renamed from: ᩹ */
    public final C5522 f40549;

    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5113(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250, int i);

    /* JADX INFO: renamed from: ᩳ */
    public void mo16193() {
    }

    public AbstractViewOnClickListenerC14239(Main main, String str, String str2, C5522 c5522) {
        super(main);
        this.f40548 = new ArrayList();
        this.f40546 = str;
        this.f40544 = str2;
        this.f40549 = c5522;
        this.f40545 = ApplicationC21448.f67649.getBoolean(str2, true);
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo17439() {
        ArrayList arrayList = this.f40548;
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (this.f40545) {
            return arrayList.size() + 1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo17438(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250) {
        C14909 c14909 = (C14909) abstractViewOnLongClickListenerC16250;
        this.f40547 = c14909;
        c14909.f42521 = this;
        c14909.f47809.setText(this.f40546);
        this.f40547.itemView.setOnClickListener(this);
        this.f40547.itemView.setOnLongClickListener(this);
        this.f40547.f42522.setRotationX(this.f40545 ? 0.0f : 180.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        boolean z = !this.f40545;
        this.f40545 = z;
        interfaceC14770Edit.putBoolean(this.f40544, z).apply();
        boolean z2 = this.f40545;
        ArrayList arrayList = this.f40548;
        C5522 c5522 = this.f40549;
        if (z2) {
            mo16193();
            ObjectAnimator.ofFloat(this.f40547.f42522, "rotationX", 180.0f, 0.0f).setDuration(200L).start();
            c5522.notifyItemRangeInserted(c5522.m12179(this) + 1, arrayList.size());
        } else {
            ObjectAnimator.ofFloat(this.f40547.f42522, "rotationX", 0.0f, 180.0f).setDuration(200L).start();
            c5522.notifyItemRangeRemoved(c5522.m12179(this) + 1, arrayList.size());
        }
    }
}
