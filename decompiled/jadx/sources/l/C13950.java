package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13950 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f41628;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f41629;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f41630;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f41631;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f41632;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f41633;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41634;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f41635;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14698 f41636;

    public C13950(Main main, C2450 c2450, String str, DialogInterfaceC0206 dialogInterfaceC0206, C14698 c14698, CheckBox checkBox, View view, TextInputLayout textInputLayout, EditText editText) {
        this.f41633 = main;
        this.f41628 = c2450;
        this.f41634 = str;
        this.f41635 = dialogInterfaceC0206;
        this.f41636 = c14698;
        this.f41630 = checkBox;
        this.f41629 = view;
        this.f41631 = textInputLayout;
        this.f41632 = editText;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f41633, 250);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        List listM7909 = this.f41628.m7909();
        int i = 0;
        while (i < listM7909.size()) {
            final AbstractC15440 abstractC15440Mo24433 = ((InterfaceC17889) listM7909.get(i)).mo24433();
            final boolean z = i == 0;
            try {
                C0349.m1793(new C19502(abstractC15440Mo24433, this.f41634, new InterfaceC6141() { // from class: l.᩺ܽ᩻
                    @Override // l.InterfaceC6141
                    public final Object get() {
                        return z ? new C3979() : new C3979(abstractC15440Mo24433.getName());
                    }
                }));
                i++;
            } catch (IOException e) {
                if ("Bad magic".equals(e.getMessage())) {
                    if (listM7909.size() == 1) {
                        throw new C19401(R.string.MT_Protector);
                    }
                    throw new C19401(C4925.m14327(R.string.MT_Protector) + ": " + abstractC15440Mo24433.getName());
                }
                throw e;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f41635.dismiss();
        C14698 c14698 = this.f41636;
        boolean z = c14698.f44892;
        CheckBox checkBox = this.f41630;
        if (z != checkBox.isChecked()) {
            c14698.f44892 = checkBox.isChecked();
            c14698.m34991();
        }
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C11172.class);
        C2450 c2450 = this.f41628;
        c0994.m3486(c2450);
        c0994.m3478(c2450.m7909());
        c0994.m3474("password", this.f41634);
        c0994.m3475("removeSource", checkBox.isChecked());
        c0994.m3469();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f41629.setEnabled(true);
        if (exc instanceof C19401) {
            this.f41631.setError(exc.getMessage());
            this.f41632.requestFocus();
        } else {
            this.f41633.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
