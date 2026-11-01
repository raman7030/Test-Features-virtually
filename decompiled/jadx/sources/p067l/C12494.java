package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.p000mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12494 {

    /* JADX INFO: renamed from: ֫ */
    public final CheckBox f35018;

    /* JADX INFO: renamed from: ۧ */
    public final RadioButton[] f35019;

    /* JADX INFO: renamed from: ܽ */
    public final String f35020;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ViewOnClickListenerC20541 f35021;

    /* JADX INFO: renamed from: ᩳ */
    public final CheckBox f35022;

    public C12494(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        this.f35021 = viewOnClickListenerC20541;
        C13045.m29861(viewOnClickListenerC20541.f63484);
        C18310 c18310 = viewOnClickListenerC20541.f63484;
        C13045.m29861(c18310);
        this.f35020 = C21466.m48631("local:", c18310.m41983());
        View viewM12252 = viewOnClickListenerC20541.m12252(R.layout.MT_Protector);
        RadioButton[] radioButtonArr = new RadioButton[4];
        boolean z = false;
        int i = 0;
        while (i < 4) {
            RadioButton radioButton = (RadioButton) (i != 0 ? i != 1 ? i != 2 ? viewM12252.findViewById(R.id.MT_Protector) : viewM12252.findViewById(R.id.MT_Protector) : viewM12252.findViewById(R.id.MT_Protector) : viewM12252.findViewById(R.id.MT_Protector));
            C13045.m29861((Object) radioButton);
            radioButtonArr[i] = radioButton;
            i++;
        }
        this.f35019 = radioButtonArr;
        int i2 = 0;
        final int i3 = 0;
        while (i2 < 4) {
            radioButtonArr[i2].setOnClickListener(new View.OnClickListener() { // from class: l.ܰ᩵᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45510.m28783(i3);
                }
            });
            i2++;
            i3++;
        }
        View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        C13045.m29865(viewFindViewById, "findViewById(...)");
        CheckBox checkBox = (CheckBox) viewFindViewById;
        this.f35018 = checkBox;
        View viewFindViewById2 = viewM12252.findViewById(R.id.MT_Protector);
        C13045.m29865(viewFindViewById2, "findViewById(...)");
        CheckBox checkBox2 = (CheckBox) viewFindViewById2;
        this.f35022 = checkBox2;
        HashMap map = C21272.f66918;
        if (map.containsKey(this.f35020)) {
            checkBox2.setChecked(true);
            Object obj = map.get(this.f35020);
            C13045.m29861(obj);
            int iIntValue = ((Number) obj).intValue();
            m28783(C9486.m22088(iIntValue));
            checkBox.setChecked(C9486.m22098(iIntValue));
            z = true;
        } else {
            m28783(this.f35021.f63471);
            checkBox.setChecked(this.f35021.f63473);
        }
        C20671 c20671BuildDialog = this.f35021.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final ViewOnClickListenerC20541 viewOnClickListenerC20542 = this.f35021;
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟᩵᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C12494.m28781(this.f26641, viewOnClickListenerC20542);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (!z) {
            c20671BuildDialog.m46732();
            return;
        }
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        Button buttonM3861 = c20671BuildDialog.m46732().m3861();
        final ViewOnClickListenerC20541 viewOnClickListenerC20543 = this.f35021;
        buttonM3861.setOnClickListener(new View.OnClickListener() { // from class: l.֫֡᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12494.m28782(this.f8085, viewOnClickListenerC20543, view);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28781(C12494 c12494, ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        RadioButton[] radioButtonArr = c12494.f35019;
        CheckBox checkBox = c12494.f35022;
        CheckBox checkBox2 = c12494.f35018;
        String str = c12494.f35020;
        int i = -1;
        if (!checkBox.isChecked()) {
            int length = radioButtonArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (radioButtonArr[i2].isChecked()) {
                    i = i2;
                    break;
                }
            }
            ViewOnClickListenerC20541.m46423(viewOnClickListenerC20541, i);
            ViewOnClickListenerC20541.m46391(viewOnClickListenerC20541, checkBox2.isChecked());
            HashMap map = C21272.f66918;
            if (map.containsKey(str)) {
                map.remove(str);
            }
            ViewOnClickListenerC20541.m46392(viewOnClickListenerC20541, false, (InterfaceC4387) null, 2);
        }
        HashMap map2 = C21272.f66918;
        C13045.m29865(map2, "sortOnlyInPathList");
        int length2 = radioButtonArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (radioButtonArr[i3].isChecked()) {
                i = i3;
                break;
            }
        }
        map2.put(str, Integer.valueOf(C9486.m22089(i, checkBox2.isChecked())));
        ApplicationC21448.f67649.edit().putString("sort_only_in_path_list", C21272.m48051(C21272.f66918)).apply();
        ViewOnClickListenerC20541.m46392(viewOnClickListenerC20541, false, (InterfaceC4387) null, 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28782(C12494 c12494, ViewOnClickListenerC20541 viewOnClickListenerC20541, View view) {
        C13045.m29861((Object) view);
        view.setVisibility(8);
        c12494.m28783(viewOnClickListenerC20541.f63471);
        c12494.f35018.setChecked(viewOnClickListenerC20541.f63473);
        c12494.f35022.setChecked(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28783(int i) {
        RadioButton[] radioButtonArr = this.f35019;
        int length = radioButtonArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            radioButtonArr[i2].setChecked(i3 == i);
            i2++;
            i3 = i4;
        }
    }
}
