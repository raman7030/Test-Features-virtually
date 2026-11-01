package p067l;

import android.content.DialogInterface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩶֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21225 extends AbstractC10214 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C13848 f66736;

    public C21225(C13848 c13848) {
        this.f66736 = c13848;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final View mo10912(Main main) {
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText((CharSequence) null);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        viewM12252.setTag(editText);
        C7050.m16226(editText);
        return viewM12252;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10914(View view) {
        String string = ((EditText) view.getTag()).getText().toString();
        if (string.isEmpty()) {
            C22682.m50798(R.string.MT_Protector, 0).m50804();
            return false;
        }
        this.f66736.f39128.mo17414(string);
        return true;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final void mo10913(C20671 c20671) {
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final void mo12797(DialogInterfaceC2564 dialogInterfaceC2564) {
        dialogInterfaceC2564.m3861().setOnClickListener(new ViewOnClickListenerC23236());
    }
}
