package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܺᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes4.dex */
public final class C17694 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final WeakReference f52845;

    /* JADX INFO: renamed from: ۘ */
    public final WeakReference f52846;

    /* JADX INFO: renamed from: ۜ */
    public final WeakReference f52847;

    /* JADX INFO: renamed from: ۡ */
    public final WeakReference f52848;

    /* JADX INFO: renamed from: ۢ */
    public final WeakReference f52849;

    /* JADX INFO: renamed from: ܳ */
    public final WeakReference f52850;

    /* JADX INFO: renamed from: ܺ */
    public String f52851;

    /* JADX INFO: renamed from: ᩴ */
    public final String f52852;

    /* JADX INFO: renamed from: ᩵ */
    public final AtomicInteger f52853;

    /* JADX INFO: renamed from: ᩷ */
    public final int f52854;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15012 f52855;

    public C17694(InterfaceC15012 interfaceC15012, AtomicInteger atomicInteger, String str, AbstractActivityC5549 abstractActivityC5549, TextView textView, TextView textView2, TextView textView3, View view, Button button) {
        C13045.m29867(interfaceC15012, C0708d.f2602R);
        C13045.m29867(atomicInteger, "translateTaskMark");
        C13045.m29867(str, TextBundle.TEXT_ENTRY);
        C13045.m29867(abstractActivityC5549, "activity");
        C13045.m29867(textView, "srcTextView");
        C13045.m29867(textView2, "tarTextView");
        C13045.m29867(textView3, "fixTranslate");
        C13045.m29867(view, "progressBar");
        this.f52855 = interfaceC15012;
        this.f52853 = atomicInteger;
        this.f52852 = str;
        this.f52850 = new WeakReference(abstractActivityC5549);
        this.f52845 = new WeakReference(textView);
        this.f52846 = new WeakReference(textView2);
        this.f52847 = new WeakReference(textView3);
        this.f52849 = new WeakReference(view);
        this.f52848 = new WeakReference(button);
        view.setVisibility(0);
        button.setEnabled(false);
        this.f52854 = atomicInteger.incrementAndGet();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f52855.beforeStart();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        InterfaceC15012 interfaceC15012 = this.f52855;
        interfaceC15012.onStart();
        this.f52851 = interfaceC15012.mo21278(this.f52852);
        interfaceC15012.onFinish();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f52855.afterFinish();
        if (this.f52854 == this.f52853.get()) {
            TextView textView = (TextView) this.f52845.get();
            String str = this.f52852;
            if (textView != null) {
                textView.setText(str);
            }
            WeakReference weakReference = this.f52846;
            TextView textView2 = (TextView) weakReference.get();
            if (textView2 != null) {
                textView2.setText(this.f52851);
            }
            String str2 = this.f52851;
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
            TextView textView5 = (TextView) this.f52847.get();
            if (textView5 != null) {
                String strM15029 = !new C6576("[a-zA-Z0-9_]+").m15030((CharSequence) str) ? str : new C6576("([0-9])([a-zA-Z])").m15029(new C6576("([a-zA-Z])([0-9])").m15029(new C6576("([a-z])([A-Z])").m15029(C5235.m11293(str, "_", " "))));
                if (!strM15029.equals(str)) {
                    textView5.setText(textView5.getContext().getString(R.string.MT_Protector, strM15029));
                    textView5.setTag(strM15029);
                    textView5.setVisibility(0);
                    return;
                }
                textView5.setVisibility(8);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        AbstractActivityC5549 abstractActivityC5549;
        if (this.f52854 != this.f52853.get() || this.f52855.onError(exc) || (abstractActivityC5549 = (AbstractActivityC5549) this.f52850.get()) == null) {
            return;
        }
        abstractActivityC5549.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f52854 == this.f52853.get()) {
            View view = (View) this.f52848.get();
            if (view != null) {
                view.setEnabled(true);
            }
            View view2 = (View) this.f52849.get();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }
}
