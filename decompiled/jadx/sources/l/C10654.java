package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10654 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f32047;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f32048;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f32049;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f32050;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f32051;

    public C10654(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        this.f32050 = viewOnClickListenerC19121;
        C11233.m27799(viewOnClickListenerC19121.f60252);
        C16773 c16773 = viewOnClickListenerC19121.f60252;
        C11233.m27799(c16773);
        this.f32049 = C20094.m46315("local:", c16773.m39742());
        View viewM10216 = viewOnClickListenerC19121.m10216(R.layout.MT_Protector);
        RadioButton[] radioButtonArr = new RadioButton[4];
        boolean z = false;
        int i = 0;
        while (i < 4) {
            RadioButton radioButton = (RadioButton) (i != 0 ? i != 1 ? i != 2 ? viewM10216.findViewById(R.id.MT_Protector) : viewM10216.findViewById(R.id.MT_Protector) : viewM10216.findViewById(R.id.MT_Protector) : viewM10216.findViewById(R.id.MT_Protector));
            C11233.m27799((Object) radioButton);
            radioButtonArr[i] = radioButton;
            i++;
        }
        this.f32048 = radioButtonArr;
        int i2 = 0;
        final int i3 = 0;
        while (i2 < 4) {
            radioButtonArr[i2].setOnClickListener(new View.OnClickListener() { // from class: l.ܰ᩵᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f42427.m26744(i3);
                }
            });
            i2++;
            i3++;
        }
        View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
        C11233.m27803(viewFindViewById, "findViewById(...)");
        CheckBox checkBox = (CheckBox) viewFindViewById;
        this.f32047 = checkBox;
        View viewFindViewById2 = viewM10216.findViewById(R.id.MT_Protector);
        C11233.m27803(viewFindViewById2, "findViewById(...)");
        CheckBox checkBox2 = (CheckBox) viewFindViewById2;
        this.f32051 = checkBox2;
        HashMap map = C19890.f64282;
        if (map.containsKey(this.f32049)) {
            checkBox2.setChecked(true);
            Object obj = map.get(this.f32049);
            C11233.m27799(obj);
            int iIntValue = ((Number) obj).intValue();
            m26744(C7489.m20112(iIntValue));
            checkBox.setChecked(C7489.m20122(iIntValue));
            z = true;
        } else {
            m26744(this.f32050.f60239);
            checkBox.setChecked(this.f32050.f60241);
        }
        C19258 c19258BuildDialog = this.f32050.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final ViewOnClickListenerC19121 viewOnClickListenerC19122 = this.f32050;
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟᩵᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C10654.m26742(this.f23728, viewOnClickListenerC19122);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (!z) {
            c19258BuildDialog.m44438();
            return;
        }
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        Button buttonM1448 = c19258BuildDialog.m44438().m1448();
        final ViewOnClickListenerC19121 viewOnClickListenerC19123 = this.f32050;
        buttonM1448.setOnClickListener(new View.OnClickListener() { // from class: l.֫֡᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10654.m26743(this.f5312, viewOnClickListenerC19123, view);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26742(C10654 c10654, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        RadioButton[] radioButtonArr = c10654.f32048;
        CheckBox checkBox = c10654.f32051;
        CheckBox checkBox2 = c10654.f32047;
        String str = c10654.f32049;
        int i = -1;
        if (!checkBox.isChecked()) {
            int length = radioButtonArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (radioButtonArr[i2].isChecked()) {
                    i = i2;
                    break;
                }
            }
            ViewOnClickListenerC19121.m44129(viewOnClickListenerC19121, i);
            ViewOnClickListenerC19121.m44097(viewOnClickListenerC19121, checkBox2.isChecked());
            HashMap map = C19890.f64282;
            if (map.containsKey(str)) {
                map.remove(str);
            }
            ViewOnClickListenerC19121.m44098(viewOnClickListenerC19121, false, (InterfaceC2123) null, 2);
        }
        HashMap map2 = C19890.f64282;
        C11233.m27803(map2, "sortOnlyInPathList");
        int length2 = radioButtonArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (radioButtonArr[i3].isChecked()) {
                i = i3;
                break;
            }
        }
        map2.put(str, Integer.valueOf(C7489.m20113(i, checkBox2.isChecked())));
        ApplicationC20075.f65008.edit().putString("sort_only_in_path_list", C19890.m45740(C19890.f64282)).apply();
        ViewOnClickListenerC19121.m44098(viewOnClickListenerC19121, false, (InterfaceC2123) null, 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26743(C10654 c10654, ViewOnClickListenerC19121 viewOnClickListenerC19121, View view) {
        C11233.m27799((Object) view);
        view.setVisibility(8);
        c10654.m26744(viewOnClickListenerC19121.f60239);
        c10654.f32047.setChecked(viewOnClickListenerC19121.f60241);
        c10654.f32051.setChecked(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26744(int i) {
        RadioButton[] radioButtonArr = this.f32048;
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
