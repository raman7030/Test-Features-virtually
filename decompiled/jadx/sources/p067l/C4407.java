package p067l;

import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4407 implements InterfaceC3986, InterfaceC18738, InterfaceC11201, InterfaceC9544, InterfaceC4595, InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f9897;

    public /* synthetic */ C4407(Object obj) {
        this.f9897 = obj;
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo9169() {
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((InterfaceC6616) this.f9897).mo5694(i);
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public void mo9171(AbstractC7783 abstractC7783) {
        ((C22004) this.f9897).f69154.mo9171(abstractC7783);
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public void mo9172(C16564 c16564, BufferedOutputStream bufferedOutputStream) {
        C4947.m10486(c16564, bufferedOutputStream, (ArrayList) this.f9897);
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo9173() {
        return false;
    }

    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo9168(C4360 c4360) {
        C21961 c21961 = (C21961) this.f9897;
        return c21961.m13265().getInt(c21961.m9037(), 12) + " dp";
    }

    @Override // p067l.InterfaceC18738
    /* JADX INFO: renamed from: ֫ */
    public void mo9170(TextView textView, Button button) {
        ViewOnClickListenerC16447.m37364(textView, ((C18028) this.f9897).m41067());
        button.setVisibility(4);
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        ViewOnClickListenerC16447.m37364(textView, (CharSequence) this.f9897);
    }
}
