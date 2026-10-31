package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes3.dex */
public final class C12492 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m30658(AbstractC15440 abstractC15440) {
        if (!abstractC15440.getName().toLowerCase().endsWith(".arsc")) {
            try {
                C18090 c18090 = new C18090(abstractC15440);
                try {
                    C3545 entry = c18090.getEntry("resources.arsc");
                    if (entry == null) {
                        c18090.close();
                        return abstractC15440;
                    }
                    AbstractC15440 abstractC15440M36535 = C16293.f50119.m36535(".arsc");
                    abstractC15440M36535.m36493(c18090.m42189(entry));
                    c18090.close();
                    return abstractC15440M36535;
                } catch (Throwable th) {
                    try {
                        c18090.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        return abstractC15440;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30659(C16560 c16560, C7309 c7309) {
        Main mainM39056 = c16560.m39056();
        View viewM10216 = mainM39056.m10216(R.layout.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText2);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c7309.f22440, c7309.f22438, editText, editText2);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(mainM39056);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22370(0, c7309, c16560));
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new ViewOnClickListenerC20254(c7309, editText, editText2, 0));
    }
}
