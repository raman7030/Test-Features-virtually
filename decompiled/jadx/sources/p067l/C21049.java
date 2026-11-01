package p067l;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.umeng.analytics.pro.C0708d;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩵ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes5.dex */
public final class C21049 extends C5625 {

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ TextView f66060;

    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ C25114 f66061;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ DialogInterfaceC2564 f66062;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C20378 f66063;

    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ TextView f66064;

    /* JADX INFO: renamed from: ۠ */
    public final /* synthetic */ TextView f66065;

    /* JADX INFO: renamed from: ܶ */
    public final /* synthetic */ C25114 f66066;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ TextView f66067;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ ProgressBar f66068;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2942 f66069;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21049(Spinner spinner, C20378 c20378, Spinner spinner2, C21438 c21438, Spinner spinner3, C21438 c21439, View view, TextView textView, C25114 c25114, C2942 c2942, C25114 c25115, TextView textView2, TextView textView3, TextView textView4, ProgressBar progressBar, DialogInterfaceC2564 dialogInterfaceC2564) {
        super(spinner, c20378, spinner2, c21438, spinner3, c21439, view);
        this.f66063 = c20378;
        this.f66065 = textView;
        this.f66066 = c25114;
        this.f66069 = c2942;
        this.f66061 = c25115;
        this.f66060 = textView2;
        this.f66064 = textView3;
        this.f66067 = textView4;
        this.f66068 = progressBar;
        this.f66062 = dialogInterfaceC2564;
    }

    @Override // p067l.C5625
    /* JADX INFO: renamed from: ֫ */
    public final void mo12462(InterfaceC15012 interfaceC15012) {
        C13045.m29867(interfaceC15012, C0708d.f2602R);
        String id = interfaceC15012.getId();
        C25114 c25114 = this.f66066;
        if (C13045.m29864(c25114.f80364, (Object) id)) {
            return;
        }
        C13045.m29861((Object) id);
        c25114.f80364 = id;
        C2942 c2942 = this.f66069;
        AtomicInteger atomicInteger = c2942.f5115;
        String str = (String) this.f66061.f80364;
        AbstractActivityC5549 abstractActivityC5549 = c2942.f5113;
        TextView textView = this.f66060;
        C13045.m29861((Object) textView);
        TextView textView2 = this.f66064;
        C13045.m29861((Object) textView2);
        TextView textView3 = this.f66067;
        C13045.m29861((Object) textView3);
        ProgressBar progressBar = this.f66068;
        C13045.m29861((Object) progressBar);
        Button buttonM3859 = this.f66062.m3859();
        C13045.m29865(buttonM3859, "getNegativeButton(...)");
        new C17694(interfaceC15012, atomicInteger, str, abstractActivityC5549, textView, textView2, textView3, progressBar, buttonM3859).m22250();
    }

    @Override // p067l.C5625
    /* JADX INFO: renamed from: ֫ */
    public final void mo12461(int i) {
        InterfaceC10319 interfaceC10319 = i == -1 ? null : (InterfaceC10319) this.f66063.getItem(i);
        TextView textView = this.f66065;
        if (interfaceC10319 == null) {
            textView.setText("-- NULL --");
            return;
        }
        SpannableString spannableString = new SpannableString(interfaceC10319.toString());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }
}
