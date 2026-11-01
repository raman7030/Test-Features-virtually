package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֡ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195D */
/* JADX INFO: loaded from: classes2.dex */
public final class C2927 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964("local") && !c4697.m9971() && c4697.m9959() && c4697.m9966() >= 2;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        final Main mainM9965 = c4697.m9965();
        final ArrayList arrayList = new ArrayList(c4697.m9957());
        Iterator it = arrayList.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((InterfaceC19370) it.next()).getSize();
        }
        View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final C12096 c12096 = (C12096) viewM12252.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۖᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextView textView3 = textView;
                ArrayList arrayList2 = arrayList;
                C8797.m20361(mainM9965, arrayList2, new RunnableC19910(2, textView3, arrayList2));
            }
        });
        final C21704 c21704 = new C21704();
        c21704.m48991();
        checkBox.setText(mainM9965.getResources().getQuantityString(R.plurals.MT_Protector, arrayList.size()));
        checkBox.setChecked(c21704.f68352);
        textView.setText(m4795(arrayList));
        textView2.setText(mainM9965.getString(R.string.MT_Protector, Integer.valueOf(arrayList.size())) + EnumC2483.f3919 + C24158.m53419(size));
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) arrayList.get(0);
        Matcher matcher = Pattern.compile("(.+)\\.\\d+").matcher(interfaceC19370.getName());
        if (matcher.matches()) {
            c12096.mo27932((CharSequence) matcher.group(1));
        } else {
            c12096.mo27932((CharSequence) ("merged_" + interfaceC19370.getName()));
        }
        C20671 c20671BuildDialog = mainM9965.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۘᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2927.m4799(c12096, c21704, checkBox, c4697, mainM9965, dialogInterfaceC2564M46732, arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4799(C12096 c12096, C21704 c21704, final CheckBox checkBox, final C4697 c4697, Main main, final DialogInterfaceC2564 dialogInterfaceC2564, final ArrayList arrayList) {
        if (c12096.m32590() == 0) {
            c12096.requestFocus();
            return;
        }
        if (c21704.f68352 != checkBox.isChecked()) {
            c21704.f68352 = checkBox.isChecked();
            c21704.m48992();
        }
        String string = c12096.m32500().toString();
        final AbstractC17043 abstractC17043M42109 = C18524.m42109(c4697.m9974(), string);
        if (abstractC17043M42109.mo25094()) {
            C20671 c20671BuildDialog = main.buildDialog();
            c20671BuildDialog.m46730(string);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴᩳ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2927.m4797(dialogInterfaceC2564, c4697, arrayList, abstractC17043M42109, checkBox);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        dialogInterfaceC2564.dismiss();
        m4798(c4697, arrayList, abstractC17043M42109, checkBox.isChecked());
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4797(DialogInterfaceC2564 dialogInterfaceC2564, C4697 c4697, ArrayList arrayList, AbstractC17043 abstractC17043, CheckBox checkBox) {
        dialogInterfaceC2564.dismiss();
        m4798(c4697, arrayList, abstractC17043, checkBox.isChecked());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4798(C4697 c4697, ArrayList arrayList, AbstractC17043 abstractC17043, boolean z) {
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C21034.class);
        c3313.m5789(c4697);
        c3313.m5777("file", abstractC17043.mo25505());
        c3313.m5781(arrayList);
        c3313.m5778("removeSources", z);
        c3313.m5772();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m4795(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (sb.length() >= 200) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(interfaceC19370.getName());
        }
        return sb.toString();
    }
}
