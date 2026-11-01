package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC5314 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final TextView f12496;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C7996 f12497;

    /* JADX INFO: renamed from: ᩸ */
    public final ImageView f12498;

    /* JADX INFO: renamed from: ᩹ */
    public int f12499;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC5314(C7996 c7996, View view) {
        super(view);
        this.f12497 = c7996;
        this.f12498 = (ImageView) view.findViewById(R.id.icon);
        this.f12496 = (TextView) view.findViewById(R.id.MT_Protector);
        C21272.m48055(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C15556.f44442.m24763()) {
            return;
        }
        int i = this.f12499;
        C7996 c7996 = this.f12497;
        if (i == 0) {
            ((ActivityC18686) c7996.requireActivity()).m42608(new Runnable() { // from class: l.᩸۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC9771(this.f71726.f12497, null).m22797();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC18686) c7996.requireActivity()).m42608(new Runnable() { // from class: l.᩹۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C7996 c7997 = this.f74577.f12497;
                    ViewOnClickListenerC9771 viewOnClickListenerC9771 = new ViewOnClickListenerC9771(c7997, null);
                    viewOnClickListenerC9771.m22798((C3263) c7997.f21012.peek());
                    viewOnClickListenerC9771.m22797();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC18686) c7996.requireActivity()).m42608(new Runnable() { // from class: l.᩶۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C7996 c7997 = this.f67543.f12497;
                    ViewOnClickListenerC8430 viewOnClickListenerC8430 = new ViewOnClickListenerC8430((ActivityC18686) c7997.requireActivity(), c7997.f21016);
                    viewOnClickListenerC8430.m19643((C3263) c7997.f21012.peek());
                    viewOnClickListenerC8430.m19642();
                }
            });
            return;
        }
        if (i == 3) {
            c7996.f21012.pop();
            c7996.m18529();
            c7996.m18523();
        } else {
            if (i != 4) {
                return;
            }
            Context contextRequireContext = c7996.requireContext();
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(contextRequireContext);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ۟᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C7996.m18527(this.f17170.f12497);
                }
            });
            c20671.m46732();
        }
    }
}
