package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11246 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f33712;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14772 f33713;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ImageView f33714;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f33715;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC11246(C14772 c14772, View view) {
        super(view);
        this.f33713 = c14772;
        this.f33714 = (ImageView) view.findViewById(R.id.icon);
        this.f33712 = (TextView) view.findViewById(R.id.MT_Protector);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C13876.f41361.m22793()) {
            return;
        }
        int i = this.f33715;
        C14772 c14772 = this.f33713;
        if (i == 0) {
            ((ActivityC17169) c14772.requireActivity()).m40363(new Runnable() { // from class: l.᩺ۜۢ
                @Override // java.lang.Runnable
                public final void run() {
                    new ViewOnClickListenerC16700(this.f73694.f33713, null).m39263();
                }
            });
            return;
        }
        if (i == 1) {
            ((ActivityC17169) c14772.requireActivity()).m40363(new Runnable() { // from class: l.ܰۜۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C14772 c14773 = this.f40719.f33713;
                    ViewOnClickListenerC16700 viewOnClickListenerC16700 = new ViewOnClickListenerC16700(c14773, null);
                    viewOnClickListenerC16700.m39264((C0941) c14773.f45112.peek());
                    viewOnClickListenerC16700.m39263();
                }
            });
            return;
        }
        if (i == 2) {
            ((ActivityC17169) c14772.requireActivity()).m40363(new Runnable() { // from class: l.۟ۜۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C14772 c14773 = this.f22413.f33713;
                    ViewOnClickListenerC10435 viewOnClickListenerC10435 = new ViewOnClickListenerC10435((ActivityC17169) c14773.requireActivity(), c14773.f45110);
                    viewOnClickListenerC10435.m26278((C0941) c14773.f45112.peek());
                    viewOnClickListenerC10435.m26277();
                }
            });
            return;
        }
        if (i == 3) {
            c14772.f45112.pop();
            c14772.m35144();
            c14772.m35136();
        } else {
            if (i != 4) {
                return;
            }
            Context contextRequireContext = c14772.requireContext();
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(contextRequireContext);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫᩷ۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C14772.m35142(this.f6917.f33713);
                }
            });
            c19258.m44438();
        }
    }
}
