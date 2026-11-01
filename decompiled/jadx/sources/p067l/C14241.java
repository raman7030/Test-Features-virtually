package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes3.dex */
public final class C14241 {
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m32723(AbstractC17043 abstractC17043) {
        if (!abstractC17043.getName().toLowerCase().endsWith(".arsc")) {
            try {
                C19561 c19561 = new C19561(abstractC17043);
                try {
                    C5738 entry = c19561.getEntry("resources.arsc");
                    if (entry == null) {
                        c19561.close();
                        return abstractC17043;
                    }
                    AbstractC17043 abstractC17043M38693 = C17853.f53286.m38693(".arsc");
                    abstractC17043M38693.m38651(c19561.m44448(entry));
                    c19561.close();
                    return abstractC17043M38693;
                } catch (Throwable th) {
                    try {
                        c19561.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        return abstractC17043;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32724(C18107 c18107, C9315 c9315) {
        Main mainM41282 = c18107.m41282();
        View viewM12252 = mainM41282.m12252(R.layout.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4345.m8962(c9315.f25331, c9315.f25329, editText, editText2);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(mainM41282);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23629(0, c9315, c18107));
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732().m3861().setOnClickListener(new ViewOnClickListenerC21618(c9315, editText, editText2, 0));
    }
}
