package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10008 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C7996 f27690;

    /* JADX INFO: renamed from: ۙ */
    public TextView f27691;

    /* JADX INFO: renamed from: ᩶ */
    public C20699 f27692;

    /* JADX INFO: renamed from: ᩸ */
    public int f27693;

    /* JADX INFO: renamed from: ᩹ */
    public C7287 f27694;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10008(C7996 c7996, View view) {
        super(view);
        this.f27690 = c7996;
        this.f27691 = (TextView) view.findViewById(R.id.textView);
        C21272.m48055(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7996 c7996 = this.f27690;
        if ((c7996.f21016 == null || c7996.f21016.m47134(this.f27694.f19021)) && !C15556.f44442.m24763()) {
            ((ActivityC18686) c7996.requireActivity()).m42599(this.f27694.f19021, this.f27692);
            c7996.f21016.m47114(this.f27694.f19021);
            if (((C3263) c7996.f21012.peek()).f6342.add(this.f27694.f19021 + " " + this.f27693)) {
                C7050.m16213(new Runnable() { // from class: l.֨۟᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC10008 viewOnClickListenerC10008 = this.f6454;
                        C7996 c7997 = viewOnClickListenerC10008.f27690;
                        c7997.f21015.notifyItemChanged(viewOnClickListenerC10008.getAdapterPosition());
                        c7997.m18526();
                    }
                }, 200L);
            }
        }
    }
}
