package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10679 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final TextView f29570;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C20738 f29571;

    /* JADX INFO: renamed from: ᩶ */
    public int f29572;

    /* JADX INFO: renamed from: ᩸ */
    public final View f29573;

    /* JADX INFO: renamed from: ᩹ */
    public final ImageView f29574;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10679(C20738 c20738, View view) {
        super(view);
        this.f29571 = c20738;
        this.f29574 = (ImageView) view.findViewById(R.id.icon);
        this.f29570 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f29573 = view.findViewById(R.id.MT_Protector);
        C21272.m48055(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C15556.f44442.m24763()) {
            return;
        }
        int i = this.f29572;
        final C20738 c20738 = this.f29571;
        if (i != 0) {
            if (i == 1) {
                C20738.m46824(c20738);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((ActivityC18686) c20738.requireActivity()).m42608(new Runnable() { // from class: l.ۢ۟᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20738.m46832(c20738);
                    }
                });
                return;
            } else {
                ViewOnClickListenerC8430 viewOnClickListenerC8430 = new ViewOnClickListenerC8430((ActivityC18686) c20738.requireActivity(), c20738.f63998);
                viewOnClickListenerC8430.m19644(c20738);
                viewOnClickListenerC8430.m19642();
                return;
            }
        }
        if (((ActivityC18686) c20738.requireActivity()).m42611()) {
            c20738.m46838(R.string.MT_Protector);
            return;
        }
        Context contextRequireContext = c20738.requireContext();
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(contextRequireContext);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46710(R.string.MT_Protector);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷۟᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f69451.f29571.m46838(R.string.MT_Protector);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }
}
