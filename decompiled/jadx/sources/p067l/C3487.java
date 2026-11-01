package p067l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1JK */
/* JADX INFO: loaded from: classes3.dex */
public final class C3487 extends AbstractViewOnClickListenerC19169 implements InterfaceC12050 {

    /* JADX INFO: renamed from: ۗ */
    public ImageView f6997;

    /* JADX INFO: renamed from: ۙ */
    public ImageView f6998;

    /* JADX INFO: renamed from: ۬ */
    public TextView f6999;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = this.f6998;
        if (C15556.f44442.m24763()) {
            return;
        }
        boolean zM22157 = this.f57270.m22157();
        C15556 c15556 = this.f57271;
        if (zM22157) {
            c15556.m35395(this.f57270);
            ObjectAnimator.ofFloat(imageView, "rotation", 135.0f, 90.0f).setDuration(100L).start();
        } else {
            c15556.m35376(this.f57270);
            ObjectAnimator.ofFloat(imageView, "rotation", 90.0f, 135.0f).setDuration(100L).start();
        }
    }

    @Override // p067l.InterfaceC12050
    /* JADX INFO: renamed from: ֫ */
    public final void mo6230(int i) {
        C15556 c15556 = this.f57271;
        c15556.f44459 = null;
        if (i == 0) {
            this.f57270.m22147();
            m6228(this.f57270.f26067);
        } else {
            this.f57270.m22154();
            m6229(this.f57270.f26067);
        }
        this.f57270.m22150(true);
        c15556.m35389();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6228(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9522 c9522 = (C9522) it.next();
            c9522.m22147();
            c9522.m22152();
            if (!c9522.m22165()) {
                m6228(c9522.f26067);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m6229(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9522 c9522 = (C9522) it.next();
            c9522.m22154();
            c9522.m22152();
            if (!c9522.m22165()) {
                m6229(c9522.f26067);
            }
        }
    }
}
