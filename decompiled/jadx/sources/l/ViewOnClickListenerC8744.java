package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8744 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f26644;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f26645;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26646;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f26647;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f26648;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8744(C19328 c19328, View view) {
        super(view);
        this.f26645 = c19328;
        this.f26648 = (ImageView) view.findViewById(R.id.icon);
        this.f26644 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f26647 = view.findViewById(R.id.MT_Protector);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C13876.f41361.m22793()) {
            return;
        }
        int i = this.f26646;
        final C19328 c19328 = this.f26645;
        if (i != 0) {
            if (i == 1) {
                C19328.m44530(c19328);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((ActivityC17169) c19328.requireActivity()).m40363(new Runnable() { // from class: l.ۢ۟᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19328.m44538(c19328);
                    }
                });
                return;
            } else {
                ViewOnClickListenerC6377 viewOnClickListenerC6377 = new ViewOnClickListenerC6377((ActivityC17169) c19328.requireActivity(), c19328.f60766);
                viewOnClickListenerC6377.m17697(c19328);
                viewOnClickListenerC6377.m17695();
                return;
            }
        }
        if (((ActivityC17169) c19328.requireActivity()).m40366()) {
            c19328.m44544(R.string.MT_Protector);
            return;
        }
        Context contextRequireContext = c19328.requireContext();
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(contextRequireContext);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44416(R.string.MT_Protector);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷۟᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f66767.f26645.m44544(R.string.MT_Protector);
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }
}
