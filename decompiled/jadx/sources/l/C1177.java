package l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1JK */
/* JADX INFO: loaded from: classes3.dex */
public final class C1177 extends AbstractViewOnClickListenerC17677 implements InterfaceC10187 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ImageView f4228;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ImageView f4229;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f4230;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = this.f4229;
        if (C13876.f41361.m22793()) {
            return;
        }
        boolean zM20181 = this.f54077.m20181();
        C13876 c13876 = this.f54078;
        if (zM20181) {
            c13876.m33276(this.f54077);
            ObjectAnimator.ofFloat(imageView, "rotation", 135.0f, 90.0f).setDuration(100L).start();
        } else {
            c13876.m33257(this.f54077);
            ObjectAnimator.ofFloat(imageView, "rotation", 90.0f, 135.0f).setDuration(100L).start();
        }
    }

    @Override // l.InterfaceC10187
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3988(int i) {
        C13876 c13876 = this.f54078;
        c13876.f41378 = null;
        if (i == 0) {
            this.f54077.m20171();
            m3986(this.f54077.f23154);
        } else {
            this.f54077.m20178();
            m3987(this.f54077.f23154);
        }
        this.f54077.m20174(true);
        c13876.m33270();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3986(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            c7527.m20171();
            c7527.m20176();
            if (!c7527.m20189()) {
                m3986(c7527.f23154);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m3987(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            c7527.m20178();
            c7527.m20176();
            if (!c7527.m20189()) {
                m3987(c7527.f23154);
            }
        }
    }
}
