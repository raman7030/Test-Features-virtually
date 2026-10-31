package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13153 extends AbstractC1661 {
    public C13153() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return (c2450.m7916("local") || c2450.m7916("zip")) && C13858.m33214(c2450);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        if (c2450.m7916("zip")) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        Main mainM7917 = c2450.m7917();
        View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
        final Spinner spinnerM22974 = C8901.m22974(mainM7917, viewM10216);
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.switch1);
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("dfb", true));
        c2978.setOnCheckedChangeListener(new C15269());
        final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.switch2);
        final C2978 c29710 = (C2978) viewM10216.findViewById(R.id.switch3);
        c2979.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩸ܰܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                textView.setText(!z ? R.string.MT_Protector : R.string.MT_Protector);
                textView2.setVisibility(!z ? 0 : 8);
                c29710.setVisibility(z ? 8 : 0);
                spinnerM22974.setEnabled(!z);
                C22870.m50970(ApplicationC20075.f65008, "dfoh", z);
            }
        });
        c2979.setChecked(ApplicationC20075.f65008.getBoolean("dfoh", false));
        c29710.setChecked(ApplicationC20075.f65008.getBoolean("dfrwn", true));
        c29710.setOnCheckedChangeListener(new C22552(2));
        C19258 c19258BuildDialog = c2450.m7917().buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22326(spinnerM22974, c2450, c2979, c29710));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
