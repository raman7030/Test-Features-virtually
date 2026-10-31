package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC3099 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f9693;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5921 f9694;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ImageView f9695;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9696;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC3099(C5921 c5921, View view) {
        super(view);
        this.f9694 = c5921;
        this.f9695 = (ImageView) view.findViewById(R.id.icon);
        this.f9693 = (TextView) view.findViewById(R.id.MT_Protector);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C13876.f41361.m22793()) {
            return;
        }
        int i = this.f9696;
        C5921 c5921 = this.f9694;
        if (i == 0) {
            ((ActivityC17169) c5921.requireActivity()).m40363(new Runnable() { // from class: l.᩸۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC7788(this.f69028.f9694, null).m20816();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC17169) c5921.requireActivity()).m40363(new Runnable() { // from class: l.᩹۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C5921 c5922 = this.f71855.f9694;
                    ViewOnClickListenerC7788 viewOnClickListenerC7788 = new ViewOnClickListenerC7788(c5922, null);
                    viewOnClickListenerC7788.m20817((C0941) c5922.f18158.peek());
                    viewOnClickListenerC7788.m20816();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC17169) c5921.requireActivity()).m40363(new Runnable() { // from class: l.᩶۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C5921 c5922 = this.f64901.f9694;
                    ViewOnClickListenerC6377 viewOnClickListenerC6377 = new ViewOnClickListenerC6377((ActivityC17169) c5922.requireActivity(), c5922.f18162);
                    viewOnClickListenerC6377.m17696((C0941) c5922.f18158.peek());
                    viewOnClickListenerC6377.m17695();
                }
            });
            return;
        }
        if (i == 3) {
            c5921.f18158.pop();
            c5921.m16603();
            c5921.m16597();
        } else {
            if (i != 4) {
                return;
            }
            Context contextRequireContext = c5921.requireContext();
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(contextRequireContext);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ۟᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C5921.m16601(this.f14343.f9694);
                }
            });
            c19258.m44438();
        }
    }
}
