package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܺᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16125 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final WeakReference f49679;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final WeakReference f49680;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final WeakReference f49681;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final WeakReference f49682;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final WeakReference f49683;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f49684;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f49685;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f49686;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f49687;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f49688;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC13303 f49689;

    public C16125(InterfaceC13303 interfaceC13303, AtomicInteger atomicInteger, String str, AbstractActivityC3346 abstractActivityC3346, TextView textView, TextView textView2, TextView textView3, View view, Button button) {
        C11233.m27805(interfaceC13303, d.R);
        C11233.m27805(atomicInteger, "translateTaskMark");
        C11233.m27805(str, TextBundle.TEXT_ENTRY);
        C11233.m27805(abstractActivityC3346, "activity");
        C11233.m27805(textView, "srcTextView");
        C11233.m27805(textView2, "tarTextView");
        C11233.m27805(textView3, "fixTranslate");
        C11233.m27805(view, "progressBar");
        this.f49689 = interfaceC13303;
        this.f49687 = atomicInteger;
        this.f49686 = str;
        this.f49684 = new WeakReference(abstractActivityC3346);
        this.f49679 = new WeakReference(textView);
        this.f49680 = new WeakReference(textView2);
        this.f49681 = new WeakReference(textView3);
        this.f49683 = new WeakReference(view);
        this.f49682 = new WeakReference(button);
        view.setVisibility(0);
        button.setEnabled(false);
        this.f49688 = atomicInteger.incrementAndGet();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f49689.beforeStart();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        InterfaceC13303 interfaceC13303 = this.f49689;
        interfaceC13303.onStart();
        this.f49685 = interfaceC13303.mo19329(this.f49686);
        interfaceC13303.onFinish();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f49689.afterFinish();
        if (this.f49688 == this.f49687.get()) {
            TextView textView = (TextView) this.f49679.get();
            String str = this.f49686;
            if (textView != null) {
                textView.setText(str);
            }
            WeakReference weakReference = this.f49680;
            TextView textView2 = (TextView) weakReference.get();
            if (textView2 != null) {
                textView2.setText(this.f49685);
            }
            String str2 = this.f49685;
            if (str2 != null && str2.length() >= 100) {
                TextView textView3 = (TextView) weakReference.get();
                if (textView3 != null) {
                    textView3.setTextSize(16.0f);
                }
            } else {
                TextView textView4 = (TextView) weakReference.get();
                if (textView4 != null) {
                    textView4.setTextSize(18.0f);
                }
            }
            TextView textView5 = (TextView) this.f49681.get();
            if (textView5 != null) {
                String strM13148 = !new C4427("[a-zA-Z0-9_]+").m13149((CharSequence) str) ? str : new C4427("([0-9])([a-zA-Z])").m13148(new C4427("([a-zA-Z])([0-9])").m13148(new C4427("([a-z])([A-Z])").m13148(C3016.m9235(str, "_", " "))));
                if (!strM13148.equals(str)) {
                    textView5.setText(textView5.getContext().getString(R.string.MT_Protector, strM13148));
                    textView5.setTag(strM13148);
                    textView5.setVisibility(0);
                    return;
                }
                textView5.setVisibility(8);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346;
        if (this.f49688 != this.f49687.get() || this.f49689.onError(exc) || (abstractActivityC3346 = (AbstractActivityC3346) this.f49684.get()) == null) {
            return;
        }
        abstractActivityC3346.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        if (this.f49688 == this.f49687.get()) {
            View view = (View) this.f49682.get();
            if (view != null) {
                view.setEnabled(true);
            }
            View view2 = (View) this.f49683.get();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }
}
