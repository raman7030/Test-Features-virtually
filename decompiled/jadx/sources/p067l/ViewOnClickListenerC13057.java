package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC13057 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final TextView f36712;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C16408 f36713;

    /* JADX INFO: renamed from: ᩸ */
    public final ImageView f36714;

    /* JADX INFO: renamed from: ᩹ */
    public int f36715;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC13057(C16408 c16408, View view) {
        super(view);
        this.f36713 = c16408;
        this.f36714 = (ImageView) view.findViewById(R.id.icon);
        this.f36712 = (TextView) view.findViewById(R.id.MT_Protector);
        C21272.m48055(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C15556.f44442.m24763()) {
            return;
        }
        int i = this.f36715;
        C16408 c16408 = this.f36713;
        if (i == 0) {
            ((ActivityC18686) c16408.requireActivity()).m42608(new Runnable() { // from class: l.᩺ۜۢ
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC18240(this.f76426.f36713, null).m41499();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC18686) c16408.requireActivity()).m42608(new Runnable() { // from class: l.ܰۜۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C16408 c16409 = this.f43800.f36713;
                    ViewOnClickListenerC18240 viewOnClickListenerC18240 = new ViewOnClickListenerC18240(c16409, null);
                    viewOnClickListenerC18240.m41500((C3263) c16409.f48226.peek());
                    viewOnClickListenerC18240.m41499();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC18686) c16408.requireActivity()).m42608(new Runnable() { // from class: l.۟ۜۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C16408 c16409 = this.f25304.f36713;
                    ViewOnClickListenerC12286 viewOnClickListenerC12286 = new ViewOnClickListenerC12286((ActivityC18686) c16409.requireActivity(), c16409.f48224);
                    viewOnClickListenerC12286.m28307((C3263) c16409.f48226.peek());
                    viewOnClickListenerC12286.m28306();
                }
            });
            return;
        }
        if (i == 3) {
            c16408.f48226.pop();
            c16408.m37291();
            c16408.m37283();
        } else {
            if (i != 4) {
                return;
            }
            Context contextRequireContext = c16408.requireContext();
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(contextRequireContext);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫᩷ۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C16408.m37289(this.f9701.f36713);
                }
            });
            c20671.m46732();
        }
    }
}
