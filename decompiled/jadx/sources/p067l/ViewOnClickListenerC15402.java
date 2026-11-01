package p067l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15402 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public C18280 f44000;

    /* JADX INFO: renamed from: ۙ */
    public TextView f44001;

    /* JADX INFO: renamed from: ۫ */
    public TextView f44002;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ ActivityC9368 f44003;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f44004;

    /* JADX INFO: renamed from: ᩸ */
    public TextView f44005;

    /* JADX INFO: renamed from: ᩹ */
    public ImageView f44006;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC15402(ActivityC9368 activityC9368, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC9368).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f44003 = activityC9368;
        this.f44006 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f44005 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f44004 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f44001 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f44002 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩸ۡۢ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final ViewOnClickListenerC15402 viewOnClickListenerC15402 = this.f71802;
                C20671 c20671BuildDialog = viewOnClickListenerC15402.f44003.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹ۡۢ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        new C24120(viewOnClickListenerC15402).m22250();
                    }
                });
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732();
                return true;
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C18280 c18280 = this.f44000;
        int i = c18280.f54575;
        ActivityC9368 activityC9368 = this.f44003;
        if (i == -4) {
            C20671 c20671BuildDialog = activityC9368.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    new C24120(this.f4460).m22250();
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        if (i == -3) {
            C20671 c20671BuildDialog2 = activityC9368.buildDialog();
            c20671BuildDialog2.m46727(R.string.MT_Protector);
            c20671BuildDialog2.m46710(R.string.MT_Protector);
            c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC15402 viewOnClickListenerC15402 = this.f27788;
                    ServiceC10905.m25160(viewOnClickListenerC15402.f44000);
                    C18280 c18281 = viewOnClickListenerC15402.f44000;
                    c18281.f54575 = -2;
                    ActivityC9368.m21772(viewOnClickListenerC15402.f44003, c18281, viewOnClickListenerC15402.f44001);
                }
            });
            c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog2.m46732();
            return;
        }
        if (i == 2) {
            m35082(c18280.f54576);
            return;
        }
        if (i != 3) {
            return;
        }
        C20671 c20671BuildDialog3 = activityC9368.buildDialog();
        c20671BuildDialog3.m46727(R.string.MT_Protector);
        c20671BuildDialog3.m46710(R.string.MT_Protector);
        c20671BuildDialog3.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶۡۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C13392(this.f49362).m22250();
            }
        });
        c20671BuildDialog3.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog3.m46732();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m35082(final String str) {
        final AbstractC17043 abstractC17043M43054 = C18951.m43054(this.f44000);
        boolean zMo25094 = abstractC17043M43054.mo25094();
        ActivityC9368 activityC9368 = this.f44003;
        if (zMo25094) {
            C20671 c20671BuildDialog = activityC9368.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46718(activityC9368.getString(R.string.MT_Protector, abstractC17043M43054.mo25505()));
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC15402 viewOnClickListenerC15402 = this.f67631;
                    C21898.m49403(viewOnClickListenerC15402.f44003, abstractC17043M43054, viewOnClickListenerC15402.f44000.f54576);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC9368 activityC9369 = this.f17328.f44003;
                    String strMo25505 = abstractC17043M43054.mo25505();
                    int i2 = ActivityC9368.f25528;
                    activityC9369.getClass();
                    Main.m61(activityC9369, strMo25505);
                }
            });
            c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC15402.m35084(this.f12597, abstractC17043M43054, str);
                }
            });
            c20671BuildDialog.m46732();
            return;
        }
        View viewM12252 = activityC9368.m12252(R.layout.MT_Protector);
        final InterfaceC8780 interfaceC8780M24857 = C10792.m24857(activityC9368, viewM12252, str);
        C20671 c20671BuildDialog2 = activityC9368.buildDialog();
        c20671BuildDialog2.m46715(viewM12252);
        c20671BuildDialog2.m46736(R.string.MT_Protector, null);
        c20671BuildDialog2.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ۡۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                interfaceC8780M24857.mo20311();
            }
        });
        c20671BuildDialog2.m46713(new DialogInterface.OnCancelListener() { // from class: l.۫ۡۢ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                interfaceC8780M24857.mo20311();
            }
        });
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog2.m46732();
        C10884.m25071(dialogInterfaceC2564M46732);
        final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        interfaceC8780M24857.mo30400(new Runnable() { // from class: l.ۚۡۢ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8780 interfaceC8780 = interfaceC8780M24857;
                C10792.m24863(textView, interfaceC8780.mo30402());
                dialogInterfaceC2564M46732.m3860().setEnabled(!interfaceC8780.mo30403());
            }
        });
        final C16155 c16155 = new C16155(viewM12252);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.֨ۡۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                if (dialogInterfaceC2564.m3855()) {
                    InterfaceC8780 interfaceC8780 = interfaceC8780M24857;
                    if (interfaceC8780.mo30401()) {
                        return;
                    }
                    C18483 c18483Mo30399 = interfaceC8780.mo30399();
                    C13457 c13457M24859 = C10792.m24859(c18483Mo30399);
                    boolean zMo34294 = c13457M24859.m30605().mo34294();
                    ViewOnClickListenerC15402 viewOnClickListenerC15402 = this.f6515;
                    String str2 = str;
                    if (zMo34294) {
                        boolean z = c13457M24859.m30605() instanceof C23691;
                        C16155 c16156 = c16155;
                        if (!z || c16156.m36760(dialogInterfaceC2564)) {
                            C10792.m24865(new C12051(viewOnClickListenerC15402, z, c16156, dialogInterfaceC2564, interfaceC8780, c18483Mo30399, str2, c13457M24859, textView), c13457M24859.m30605(), viewOnClickListenerC15402.f44003);
                            return;
                        }
                        return;
                    }
                    interfaceC8780.mo20309(c18483Mo30399);
                    dialogInterfaceC2564.dismiss();
                    new C8027(viewOnClickListenerC15402, c13457M24859, str2).m22250();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m35084(ViewOnClickListenerC15402 viewOnClickListenerC15402, AbstractC17043 abstractC17043, String str) {
        abstractC17043.mo25503();
        viewOnClickListenerC15402.m35082(str);
    }
}
