package p067l;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8590 implements InterfaceC21775, InterfaceC3986 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f23072;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f23073;

    public /* synthetic */ C8590(Object obj, Object obj2) {
        this.f23072 = obj;
        this.f23073 = obj2;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21775 mo19998() {
        return this;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21775 mo19999(C11915 c11915) {
        return this;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21775 mo20000(boolean z) {
        return this;
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f23072;
        C5738 c5738 = (C5738) this.f23073;
        textView.setText(spannableStringBuilder);
        C21272.m48052(textView);
        textView.setOnClickListener(new ViewOnClickListenerC19291(4, c5738));
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC3669[] mo20001(Uri uri, Map map) {
        return C23925.m52993((C23925) this.f23072, (C10307) this.f23073);
    }
}
