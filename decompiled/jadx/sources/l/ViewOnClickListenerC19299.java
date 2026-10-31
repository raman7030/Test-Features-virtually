package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC19299 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f60703;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f60704;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60705;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f60706;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f60707;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC19299(C15063 c15063, View view) {
        super(view);
        this.f60704 = c15063;
        this.f60707 = (ImageView) view.findViewById(R.id.icon);
        this.f60703 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f60706 = view.findViewById(R.id.MT_Protector);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C13876.f41361.m22793()) {
            return;
        }
        int i = this.f60705;
        final C15063 c15063 = this.f60704;
        if (i == 0) {
            Context contextRequireContext = c15063.requireContext();
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(contextRequireContext);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۜۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    new C6598(this.f11914.f60704, R.string.MT_Protector).m20274();
                }
            });
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        if (i == 1) {
            C15063.m35613(c15063);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((ActivityC17169) c15063.requireActivity()).m40363(new Runnable() { // from class: l.ᩴۜۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C15063.m35622(c15063);
                }
            });
        } else {
            ViewOnClickListenerC10435 viewOnClickListenerC10435 = new ViewOnClickListenerC10435((ActivityC17169) c15063.requireActivity(), c15063.f45992);
            viewOnClickListenerC10435.m26279(c15063);
            viewOnClickListenerC10435.m26277();
        }
    }
}
