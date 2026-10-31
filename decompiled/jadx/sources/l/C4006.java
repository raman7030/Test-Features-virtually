package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ۘܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4006 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2978 f12707;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f12708;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f12709;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f12710;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f12711;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2978 f12712;

    public C4006(ActivityC0477 activityC0477) {
        this.f12711 = activityC0477;
        View viewM10216 = activityC0477.m10216(R.layout.MT_Protector);
        this.f12709 = viewM10216;
        this.f12708 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        m12067();
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۜܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4006 c4006 = this.f21152;
                C2595 c2595 = new C2595(c4006, c4006.f12711);
                c2595.m36257(R.string.MT_Protector, R.string.MT_Protector);
                c2595.m36260(R.string.MT_Protector);
                c2595.m36262();
                C4925.m14316(new RunnableC7412(4, c2595), 200L);
                EditText editTextM36254 = c2595.m36254(0);
                EditText editTextM36255 = c2595.m36254(1);
                editTextM36254.setInputType(o.a.b);
                editTextM36255.setInputType(o.a.b);
                int i = C8239.f25366;
                editTextM36254.setText(String.valueOf(ApplicationC20075.f65008.getInt("text_function_min_line", 1)));
                editTextM36255.setText(String.valueOf(ApplicationC20075.f65008.getInt("text_function_max_line", 4)));
            }
        });
        this.f12710 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        m12070();
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩷ܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C4006 c4006 = this.f67700;
                C19258 c19258BuildDialog = c4006.f12711.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                int i = C8239.f25366;
                c19258BuildDialog.m44417(R.array.MT_Protector, ApplicationC20075.f65008.getInt("tfgi", 0), new DialogInterface.OnClickListener() { // from class: l.ܺܳܿ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C4006.m12069(c4006, dialogInterface, i2);
                    }
                });
                c19258BuildDialog.m44438();
            }
        });
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        this.f12712 = c2978;
        int i = C8239.f25366;
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("tfugh", true));
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۢܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2978 c2979 = this.f29238.f12712;
                c2979.toggle();
                boolean zIsChecked = c2979.isChecked();
                int i2 = C8239.f25366;
                ApplicationC20075.f65008.edit().putBoolean("tfugh", zIsChecked).apply();
                C8239.m21823();
            }
        });
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        this.f12707 = c2979;
        c2979.setChecked(C4301.m12886());
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۡܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2978 c29710 = this.f27189.f12707;
                c29710.toggle();
                C4301.m12885(c29710.isChecked());
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12069(C4006 c4006, DialogInterface dialogInterface, int i) {
        int i2 = C8239.f25366;
        ApplicationC20075.f65008.edit().mo25853(i, "tfgi").apply();
        C8239.m21823();
        c4006.m12070();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m12067() {
        StringBuilder sb = new StringBuilder();
        int i = C8239.f25366;
        sb.append(ApplicationC20075.f65008.getInt("text_function_min_line", 1));
        sb.append(" - ");
        sb.append(ApplicationC20075.f65008.getInt("text_function_max_line", 4));
        this.f12708.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m12070() {
        String strM14327;
        int i = C8239.f25366;
        int i2 = ApplicationC20075.f65008.getInt("tfgi", 0);
        if (i2 == 0) {
            strM14327 = C4925.m14327(R.string.MT_Protector);
        } else if (i2 == 1) {
            strM14327 = C4925.m14327(R.string.MT_Protector);
        } else {
            strM14327 = i2 != 2 ? null : C4925.m14327(R.string.MT_Protector);
        }
        this.f12710.setText(strM14327);
    }
}
