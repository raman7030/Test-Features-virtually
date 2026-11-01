package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0719o;

/* JADX INFO: renamed from: l.ۘܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6176 {

    /* JADX INFO: renamed from: ֫ */
    public final C0990 f15523;

    /* JADX INFO: renamed from: ۧ */
    public final TextView f15524;

    /* JADX INFO: renamed from: ܳ */
    public final View f15525;

    /* JADX INFO: renamed from: ܽ */
    public final TextView f15526;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ActivityC2822 f15527;

    /* JADX INFO: renamed from: ᩳ */
    public final C0990 f15528;

    public C6176(ActivityC2822 activityC2822) {
        this.f15527 = activityC2822;
        View viewM12252 = activityC2822.m12252(R.layout.MT_Protector);
        this.f15525 = viewM12252;
        this.f15524 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        m13987();
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۜܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6176 c6176 = this.f24029;
                C4835 c4835 = new C4835(c6176, c6176.f15527);
                c4835.m38418(R.string.MT_Protector, R.string.MT_Protector);
                c4835.m38421(R.string.MT_Protector);
                c4835.m38423();
                C7050.m16213(new RunnableC9413(4, c4835), 200L);
                EditText editTextM38415 = c4835.m38415(0);
                EditText editTextM38416 = c4835.m38415(1);
                editTextM38415.setInputType(C0719o.a.f2896b);
                editTextM38416.setInputType(C0719o.a.f2896b);
                int i = C10199.f28276;
                editTextM38415.setText(String.valueOf(ApplicationC21448.f67649.getInt("text_function_min_line", 1)));
                editTextM38416.setText(String.valueOf(ApplicationC21448.f67649.getInt("text_function_max_line", 4)));
            }
        });
        this.f15526 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        m13990();
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩷ܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C6176 c6176 = this.f70385;
                C20671 c20671BuildDialog = c6176.f15527.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                int i = C10199.f28276;
                c20671BuildDialog.m46711(R.array.MT_Protector, ApplicationC21448.f67649.getInt("tfgi", 0), new DialogInterface.OnClickListener() { // from class: l.ܺܳܿ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C6176.m13989(c6176, dialogInterface, i2);
                    }
                });
                c20671BuildDialog.m46732();
            }
        });
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        this.f15528 = c0990;
        int i = C10199.f28276;
        c0990.setChecked(ApplicationC21448.f67649.getBoolean("tfugh", true));
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۢܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0990 c0991 = this.f32187.f15528;
                c0991.toggle();
                boolean zIsChecked = c0991.isChecked();
                int i2 = C10199.f28276;
                ApplicationC21448.f67649.edit().putBoolean("tfugh", zIsChecked).apply();
                C10199.m23792();
            }
        });
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        this.f15523 = c0991;
        c0991.setChecked(C6456.m14750());
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۡܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0990 c0992 = this.f30124.f15523;
                c0992.toggle();
                C6456.m14749(c0992.isChecked());
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13989(C6176 c6176, DialogInterface dialogInterface, int i) {
        int i2 = C10199.f28276;
        ApplicationC21448.f67649.edit().mo27875(i, "tfgi").apply();
        C10199.m23792();
        c6176.m13990();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m13987() {
        StringBuilder sb = new StringBuilder();
        int i = C10199.f28276;
        sb.append(ApplicationC21448.f67649.getInt("text_function_min_line", 1));
        sb.append(" - ");
        sb.append(ApplicationC21448.f67649.getInt("text_function_max_line", 4));
        this.f15524.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ۧ */
    private void m13990() {
        String strM16224;
        int i = C10199.f28276;
        int i2 = ApplicationC21448.f67649.getInt("tfgi", 0);
        if (i2 == 0) {
            strM16224 = C7050.m16224(R.string.MT_Protector);
        } else if (i2 == 1) {
            strM16224 = C7050.m16224(R.string.MT_Protector);
        } else {
            strM16224 = i2 != 2 ? null : C7050.m16224(R.string.MT_Protector);
        }
        this.f15526.setText(strM16224);
    }
}
