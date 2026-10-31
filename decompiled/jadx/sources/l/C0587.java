package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֡ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195D */
/* JADX INFO: loaded from: classes2.dex */
public final class C0587 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && !c2450.m7923() && c2450.m7911() && c2450.m7918() >= 2;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        final Main mainM7917 = c2450.m7917();
        final ArrayList arrayList = new ArrayList(c2450.m7909());
        Iterator it = arrayList.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((InterfaceC17889) it.next()).getSize();
        }
        View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final C10235 c10235 = (C10235) viewM10216.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۖᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextView textView3 = textView;
                ArrayList arrayList2 = arrayList;
                C6764.m18413(mainM7917, arrayList2, new RunnableC18457(2, textView3, arrayList2));
            }
        });
        final C20344 c20344 = new C20344();
        c20344.m46668();
        checkBox.setText(mainM7917.getResources().getQuantityString(R.plurals.MT_Protector, arrayList.size()));
        checkBox.setChecked(c20344.f65676);
        textView.setText(m2424(arrayList));
        textView2.setText(mainM7917.getString(R.string.MT_Protector, Integer.valueOf(arrayList.size())) + EnumC0121.f1143 + C22927.m51028(size));
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) arrayList.get(0);
        Matcher matcher = Pattern.compile("(.+)\\.\\d+").matcher(interfaceC17889.getName());
        if (matcher.matches()) {
            c10235.mo25910((CharSequence) matcher.group(1));
        } else {
            c10235.mo25910((CharSequence) ("merged_" + interfaceC17889.getName()));
        }
        C19258 c19258BuildDialog = mainM7917.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۘᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0587.m2428(c10235, c20344, checkBox, c2450, mainM7917, dialogInterfaceC0206M44438, arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2428(C10235 c10235, C20344 c20344, final CheckBox checkBox, final C2450 c2450, Main main, final DialogInterfaceC0206 dialogInterfaceC0206, final ArrayList arrayList) {
        if (c10235.m30526() == 0) {
            c10235.requestFocus();
            return;
        }
        if (c20344.f65676 != checkBox.isChecked()) {
            c20344.f65676 = checkBox.isChecked();
            c20344.m46669();
        }
        String string = c10235.m30436().toString();
        final AbstractC15440 abstractC15440M39866 = C16999.m39866(c2450.m7926(), string);
        if (abstractC15440M39866.mo23120()) {
            C19258 c19258BuildDialog = main.buildDialog();
            c19258BuildDialog.m44436(string);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴᩳ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C0587.m2426(dialogInterfaceC0206, c2450, arrayList, abstractC15440M39866, checkBox);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        dialogInterfaceC0206.dismiss();
        m2427(c2450, arrayList, abstractC15440M39866, checkBox.isChecked());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2426(DialogInterfaceC0206 dialogInterfaceC0206, C2450 c2450, ArrayList arrayList, AbstractC15440 abstractC15440, CheckBox checkBox) {
        dialogInterfaceC0206.dismiss();
        m2427(c2450, arrayList, abstractC15440, checkBox.isChecked());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2427(C2450 c2450, ArrayList arrayList, AbstractC15440 abstractC15440, boolean z) {
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C19639.class);
        c0994.m3486(c2450);
        c0994.m3474("file", abstractC15440.mo23554());
        c0994.m3478(arrayList);
        c0994.m3475("removeSources", z);
        c0994.m3469();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m2424(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (sb.length() >= 200) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(interfaceC17889.getName());
        }
        return sb.toString();
    }
}
