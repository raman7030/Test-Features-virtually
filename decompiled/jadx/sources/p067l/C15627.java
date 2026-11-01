package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15627 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C4697 f44709;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ View f44710;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ CheckBox f44711;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ TextInputLayout f44712;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ EditText f44713;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ Main f44714;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ String f44715;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ DialogInterfaceC2564 f44716;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C16338 f44717;

    public C15627(Main main, C4697 c4697, String str, DialogInterfaceC2564 dialogInterfaceC2564, C16338 c16338, CheckBox checkBox, View view, TextInputLayout textInputLayout, EditText editText) {
        this.f44714 = main;
        this.f44709 = c4697;
        this.f44715 = str;
        this.f44716 = dialogInterfaceC2564;
        this.f44717 = c16338;
        this.f44711 = checkBox;
        this.f44710 = view;
        this.f44712 = textInputLayout;
        this.f44713 = editText;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f44714, 250);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        List listM9957 = this.f44709.m9957();
        int i = 0;
        while (i < listM9957.size()) {
            final AbstractC17043 abstractC17043Mo26445 = ((InterfaceC19370) listM9957.get(i)).mo26445();
            final boolean z = i == 0;
            try {
                C2700.m4192(new C20903(abstractC17043Mo26445, this.f44715, new InterfaceC8205() { // from class: l.᩺ܽ᩻
                    @Override // p067l.InterfaceC8205
                    public final Object get() {
                        return z ? new C6150() : new C6150(abstractC17043Mo26445.getName());
                    }
                }));
                i++;
            } catch (IOException e) {
                if ("Bad magic".equals(e.getMessage())) {
                    if (listM9957.size() == 1) {
                        throw new C20807(R.string.MT_Protector);
                    }
                    throw new C20807(C7050.m16224(R.string.MT_Protector) + ": " + abstractC17043Mo26445.getName());
                }
                throw e;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f44716.dismiss();
        C16338 c16338 = this.f44717;
        boolean z = c16338.f48006;
        CheckBox checkBox = this.f44711;
        if (z != checkBox.isChecked()) {
            c16338.f48006 = checkBox.isChecked();
            c16338.m37138();
        }
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C12987.class);
        C4697 c4697 = this.f44709;
        c3313.m5789(c4697);
        c3313.m5781(c4697.m9957());
        c3313.m5777("password", this.f44715);
        c3313.m5778("removeSource", checkBox.isChecked());
        c3313.m5772();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f44710.setEnabled(true);
        if (exc instanceof C20807) {
            this.f44712.setError(exc.getMessage());
            this.f44713.requestFocus();
        } else {
            this.f44714.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
