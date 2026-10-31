package l;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.umeng.analytics.pro.d;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩵ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19655 extends C3426 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f63437;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23932 f63438;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f63439;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18949 f63440;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f63441;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f63442;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23932 f63443;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f63444;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ProgressBar f63445;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0603 f63446;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19655(Spinner spinner, C18949 c18949, Spinner spinner2, C20065 c20065, Spinner spinner3, C20065 c20066, View view, TextView textView, C23932 c23932, C0603 c0603, C23932 c23933, TextView textView2, TextView textView3, TextView textView4, ProgressBar progressBar, DialogInterfaceC0206 dialogInterfaceC0206) {
        super(spinner, c18949, spinner2, c20065, spinner3, c20066, view);
        this.f63440 = c18949;
        this.f63442 = textView;
        this.f63443 = c23932;
        this.f63446 = c0603;
        this.f63438 = c23933;
        this.f63437 = textView2;
        this.f63441 = textView3;
        this.f63444 = textView4;
        this.f63445 = progressBar;
        this.f63439 = dialogInterfaceC0206;
    }

    @Override // l.C3426
    /* JADX INFO: renamed from: ֫ */
    public final void mo10423(InterfaceC13303 interfaceC13303) {
        C11233.m27805(interfaceC13303, d.R);
        String id = interfaceC13303.getId();
        C23932 c23932 = this.f63443;
        if (C11233.m27802(c23932.f77612, (Object) id)) {
            return;
        }
        C11233.m27799((Object) id);
        c23932.f77612 = id;
        C0603 c0603 = this.f63446;
        AtomicInteger atomicInteger = c0603.f2341;
        String str = (String) this.f63438.f77612;
        AbstractActivityC3346 abstractActivityC3346 = c0603.f2339;
        TextView textView = this.f63437;
        C11233.m27799((Object) textView);
        TextView textView2 = this.f63441;
        C11233.m27799((Object) textView2);
        TextView textView3 = this.f63444;
        C11233.m27799((Object) textView3);
        ProgressBar progressBar = this.f63445;
        C11233.m27799((Object) progressBar);
        Button buttonM1446 = this.f63439.m1446();
        C11233.m27803(buttonM1446, "getNegativeButton(...)");
        new C16125(interfaceC13303, atomicInteger, str, abstractActivityC3346, textView, textView2, textView3, progressBar, buttonM1446).m20274();
    }

    @Override // l.C3426
    /* JADX INFO: renamed from: ֫ */
    public final void mo10422(int i) {
        InterfaceC8365 interfaceC8365 = i == -1 ? null : (InterfaceC8365) this.f63440.getItem(i);
        TextView textView = this.f63442;
        if (interfaceC8365 == null) {
            textView.setText("-- NULL --");
            return;
        }
        SpannableString spannableString = new SpannableString(interfaceC8365.toString());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }
}
