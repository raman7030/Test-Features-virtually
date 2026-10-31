package l;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6546 implements InterfaceC20419, InterfaceC1702 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20193;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20194;

    public /* synthetic */ C6546(Object obj, Object obj2) {
        this.f20193 = obj;
        this.f20194 = obj2;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20419 mo18048() {
        return this;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20419 mo18049(C10045 c10045) {
        return this;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20419 mo18050(boolean z) {
        return this;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f20193;
        C3545 c3545 = (C3545) this.f20194;
        textView.setText(spannableStringBuilder);
        C19890.m45741(textView);
        textView.setOnClickListener(new ViewOnClickListenerC17806(4, c3545));
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1368[] mo18051(Uri uri, Map map) {
        return C22682.m50667((C22682) this.f20193, (C8353) this.f20194);
    }
}
