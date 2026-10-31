package l;

import android.content.DialogInterface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19841 extends AbstractC8255 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12079 f64099;

    public C19841(C12079 c12079) {
        this.f64099 = c12079;
    }

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫ */
    public final View mo8845(Main main) {
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText((CharSequence) null);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        viewM10216.setTag(editText);
        C4925.m14329(editText);
        return viewM10216;
    }

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8847(View view) {
        String string = ((EditText) view.getTag()).getText().toString();
        if (string.isEmpty()) {
            C21374.m48462(R.string.MT_Protector, 0).m48468();
            return false;
        }
        this.f64099.f36117.mo15503(string);
        return true;
    }

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫ */
    public final void mo8846(C19258 c19258) {
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
    }

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫ */
    public final void mo10817(DialogInterfaceC0206 dialogInterfaceC0206) {
        dialogInterfaceC0206.m1448().setOnClickListener(new ViewOnClickListenerC21957());
    }
}
