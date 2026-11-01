package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14869 extends AbstractC3947 {
    public C14869() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return (c4697.m9964("local") || c4697.m9964("zip")) && C15539.m35333(c4697);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        if (c4697.m9964("zip")) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        Main mainM9965 = c4697.m9965();
        View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
        final Spinner spinnerM24945 = C10828.m24945(mainM9965, viewM12252);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.switch1);
        c0990.setChecked(ApplicationC21448.f67649.getBoolean("dfb", true));
        c0990.setOnCheckedChangeListener(new C16880());
        final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.switch2);
        final C0990 c0992 = (C0990) viewM12252.findViewById(R.id.switch3);
        c0991.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩸ܰܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                textView.setText(!z ? R.string.MT_Protector : R.string.MT_Protector);
                textView2.setVisibility(!z ? 0 : 8);
                c0992.setVisibility(z ? 8 : 0);
                spinnerM24945.setEnabled(!z);
                C24104.m53360(ApplicationC21448.f67649, "dfoh", z);
            }
        });
        c0991.setChecked(ApplicationC21448.f67649.getBoolean("dfoh", false));
        c0992.setChecked(ApplicationC21448.f67649.getBoolean("dfrwn", true));
        c0992.setOnCheckedChangeListener(new C23802(2));
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23587(spinnerM24945, c4697, c0991, c0992));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
