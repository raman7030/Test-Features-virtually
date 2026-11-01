package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20710 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final TextView f63933;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C16684 f63934;

    /* JADX INFO: renamed from: ᩶ */
    public int f63935;

    /* JADX INFO: renamed from: ᩸ */
    public final View f63936;

    /* JADX INFO: renamed from: ᩹ */
    public final ImageView f63937;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC20710(C16684 c16684, View view) {
        super(view);
        this.f63934 = c16684;
        this.f63937 = (ImageView) view.findViewById(R.id.icon);
        this.f63933 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f63936 = view.findViewById(R.id.MT_Protector);
        C21272.m48055(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C15556.f44442.m24763()) {
            return;
        }
        int i = this.f63935;
        final C16684 c16684 = this.f63934;
        if (i == 0) {
            Context contextRequireContext = c16684.requireContext();
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(contextRequireContext);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۜۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    new C8639(this.f14720.f63934, R.string.MT_Protector).m22250();
                }
            });
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732();
            return;
        }
        if (i == 1) {
            C16684.m37771(c16684);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((ActivityC18686) c16684.requireActivity()).m42608(new Runnable() { // from class: l.ᩴۜۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C16684.m37780(c16684);
                }
            });
        } else {
            ViewOnClickListenerC12286 viewOnClickListenerC12286 = new ViewOnClickListenerC12286((ActivityC18686) c16684.requireActivity(), c16684.f49110);
            viewOnClickListenerC12286.m28308(c16684);
            viewOnClickListenerC12286.m28306();
        }
    }
}
