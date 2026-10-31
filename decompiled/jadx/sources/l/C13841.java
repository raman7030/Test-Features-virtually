package l;

import android.view.View;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13841 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33200(final AbstractActivityC3346 abstractActivityC3346, TextInputLayout textInputLayout, final EditText editText, final RunnableC20884 runnableC20884) {
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.᩺۬ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13841.m33201(abstractActivityC3346, runnableC20884, editText);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33201(AbstractActivityC3346 abstractActivityC3346, Runnable runnable, EditText editText) {
        C9340 c9340M132;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if ((abstractActivityC3346 instanceof Main) && (c9340M132 = ((Main) abstractActivityC3346).m132()) != null) {
            m33199(arrayList, arrayList2, c9340M132.m24091(), R.string.MT_Protector);
            m33199(arrayList, arrayList2, c9340M132.m24072(), R.string.MT_Protector);
        }
        arrayList2.add(C4925.m14327(R.string.MT_Protector));
        arrayList.add(C16293.f50120);
        for (C4216 c4216 : (ArrayList) C19739.m45451()) {
            arrayList2.add(c4216.f13686);
            arrayList.add(C16999.m39864(c4216.f13687));
        }
        if (runnable != null) {
            arrayList2.add(C4925.m14327(R.string.MT_Protector));
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44430((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC23725(runnable, arrayList, editText, 1));
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33199(ArrayList arrayList, ArrayList arrayList2, C16560 c16560, int i) {
        if (c16560.m39035("local")) {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(c16560.m39020(), new String[0]);
            String name = abstractC15440M39866.getName();
            if (name.isEmpty()) {
                name = C4925.m14327(R.string.MT_Protector);
            }
            arrayList2.add(C4925.m14306(i, name));
            arrayList.add(abstractC15440M39866);
        }
    }
}
