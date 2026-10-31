package l;

import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2144 implements InterfaceC1702, InterfaceC17224, InterfaceC9294, InterfaceC7550, InterfaceC2343, InterfaceC6403 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7111;

    public /* synthetic */ C2144(Object obj) {
        this.f7111 = obj;
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public /* synthetic */ void mo7074() {
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        ((InterfaceC4469) this.f7111).mo3375(i);
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7076(AbstractC5698 abstractC5698) {
        ((C20661) this.f7111).f66472.mo7076(abstractC5698);
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7077(C14937 c14937, BufferedOutputStream bufferedOutputStream) {
        C2713.m8440(c14937, bufferedOutputStream, (ArrayList) this.f7111);
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ boolean mo7078() {
        return false;
    }

    @Override // l.InterfaceC7550
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence mo7073(C2095 c2095) {
        C20615 c20615 = (C20615) this.f7111;
        return c20615.m11313().getInt(c20615.m6911(), 12) + " dp";
    }

    @Override // l.InterfaceC17224
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7075(TextView textView, Button button) {
        ViewOnClickListenerC14813.m35216(textView, ((C16477) this.f7111).m38841());
        button.setVisibility(4);
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        ViewOnClickListenerC14813.m35216(textView, (CharSequence) this.f7111);
    }
}
