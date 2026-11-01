package p067l;

import android.view.View;
import android.widget.EditText;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15523 {
    /* JADX INFO: renamed from: ֫ */
    public static void m35318(final AbstractActivityC5549 abstractActivityC5549, TextInputLayout textInputLayout, final EditText editText, final RunnableC22217 runnableC22217) {
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.᩺۬ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15523.m35319(abstractActivityC5549, runnableC22217, editText);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35319(AbstractActivityC5549 abstractActivityC5549, Runnable runnable, EditText editText) {
        C11245 c11245M130;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if ((abstractActivityC5549 instanceof Main) && (c11245M130 = ((Main) abstractActivityC5549).m130()) != null) {
            m35317(arrayList, arrayList2, c11245M130.m26100(), R.string.MT_Protector);
            m35317(arrayList, arrayList2, c11245M130.m26081(), R.string.MT_Protector);
        }
        arrayList2.add(C7050.m16224(R.string.MT_Protector));
        arrayList.add(C17853.f53287);
        for (C6376 c6376 : (ArrayList) C21129.m47755()) {
            arrayList2.add(c6376.f16499);
            arrayList.add(C18524.m42107(c6376.f16500));
        }
        if (runnable != null) {
            arrayList2.add(C7050.m16224(R.string.MT_Protector));
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46724((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC24917(runnable, arrayList, editText, 1));
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35317(ArrayList arrayList, ArrayList arrayList2, C18107 c18107, int i) {
        if (c18107.m41261("local")) {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(c18107.m41246(), new String[0]);
            String name = abstractC17043M42109.getName();
            if (name.isEmpty()) {
                name = C7050.m16224(R.string.MT_Protector);
            }
            arrayList2.add(C7050.m16203(i, name));
            arrayList.add(abstractC17043M42109);
        }
    }
}
