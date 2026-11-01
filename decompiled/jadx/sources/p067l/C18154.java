package p067l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q98G */
/* JADX INFO: loaded from: classes4.dex */
public final class C18154 {

    /* JADX INFO: renamed from: ֫ */
    public final TextView f54193;

    /* JADX INFO: renamed from: ۖ */
    public final TextView f54194;

    /* JADX INFO: renamed from: ۘ */
    public final TextView f54195;

    /* JADX INFO: renamed from: ۜ */
    public final View f54196;

    /* JADX INFO: renamed from: ۡ */
    public final CheckBox f54197;

    /* JADX INFO: renamed from: ۢ */
    public final TextView f54198;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f54199;

    /* JADX INFO: renamed from: ܺ */
    public final TextView f54201;

    /* JADX INFO: renamed from: ܽ */
    public boolean f54202;

    /* JADX INFO: renamed from: ᩴ */
    public final TextView f54205;

    /* JADX INFO: renamed from: ᩵ */
    public final View f54206;

    /* JADX INFO: renamed from: ᩷ */
    public final CheckBox f54207;

    /* JADX INFO: renamed from: ᩻ */
    public final View f54208;

    /* JADX INFO: renamed from: ܳ */
    public long f54200 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f54204 = 0;

    /* JADX INFO: renamed from: ܿ */
    public int f54203 = 0;

    public C18154(Main main) {
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        this.f54206 = viewM12252;
        this.f54205 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f54198 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f54208 = viewM12252.findViewById(R.id.MT_Protector);
        this.f54196 = viewM12252.findViewById(R.id.MT_Protector);
        this.f54195 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f54201 = (TextView) viewM12252.findViewById(R.id.textFileCount);
        this.f54194 = (TextView) viewM12252.findViewById(R.id.textFolderCount);
        this.f54207 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        this.f54197 = checkBox;
        TextView textView = (TextView) viewM12252.findViewById(R.id.textView);
        this.f54193 = textView;
        viewM12252.findViewById(R.id.speedModeHelp).setOnClickListener(new ViewOnClickListenerC10850(1, main));
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("dfsmd", false));
        boolean z = ApplicationC21448.f67650.getBoolean("deletion_warning", true);
        this.f54199 = z;
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m41347() {
        CheckBox checkBox = this.f54207;
        return checkBox.getVisibility() == 0 && checkBox.isChecked();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41346(final String str, final String str2) {
        CheckBox checkBox = this.f54207;
        checkBox.setVisibility(0);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧۧ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C18154.m41344(this.f35996, str2, str, z);
            }
        };
        int i = C23219.f72959;
        checkBox.setChecked(C7050.f18355.getBoolean("def_mov_recycle_bin", true));
        onCheckedChangeListener.onCheckedChanged(checkBox, checkBox.isChecked());
        checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41344(C18154 c18154, String str, String str2, boolean z) {
        if (c18154.f54199) {
            c18154.f54193.setVisibility(z ? 8 : 0);
        }
        TextView textView = c18154.f54198;
        if (!z) {
            str = str2;
        }
        textView.setText(str);
        if (c18154.f54202) {
            c18154.f54196.setVisibility(z ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41345() {
        if (this.f54196.getVisibility() == 8) {
            this.f54202 = true;
            if (m41347()) {
                return;
            }
            C7050.m16212(new RunnableC20791(1, this));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m41348() {
        if (this.f54196.getVisibility() != 0) {
            return false;
        }
        boolean zIsChecked = this.f54197.isChecked();
        C24104.m53360(ApplicationC21448.f67649, "dfsmd", zIsChecked);
        return zIsChecked;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41343(C18154 c18154) {
        c18154.f54195.setText(C24158.m53411(c18154.f54200));
        c18154.f54201.setText(String.valueOf(c18154.f54204));
        c18154.f54194.setText(String.valueOf(c18154.f54203));
    }
}
