package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16588 implements InterfaceC14577 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC14577 f48727;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f48728;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f48729;

    public C16588(InterfaceC14577 interfaceC14577, AbstractActivityC5549 abstractActivityC5549, String str) {
        this.f48727 = interfaceC14577;
        this.f48728 = abstractActivityC5549;
        this.f48729 = str;
    }

    @Override // p067l.InterfaceC14577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6049(C13457 c13457, boolean z) {
        this.f48727.mo6049(c13457, z);
    }

    @Override // p067l.InterfaceC14577
    public final void onCanceled() {
        this.f48727.onCanceled();
    }

    @Override // p067l.InterfaceC14577
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6050(Exception exc) {
        final AbstractActivityC5549 abstractActivityC5549;
        boolean z = exc instanceof C23021;
        final InterfaceC14577 interfaceC14577 = this.f48727;
        if (z && (abstractActivityC5549 = this.f48728) != null) {
            final String str = this.f48729;
            C7050.m16212(new Runnable() { // from class: l.۠ۗܳ
                @Override // java.lang.Runnable
                public final void run() {
                    final AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                    boolean zIsFinishing = abstractActivityC55410.isFinishing();
                    final InterfaceC14577 interfaceC14578 = interfaceC14577;
                    if (zIsFinishing || abstractActivityC55410.getLifecycle().mo21805() == EnumC15415.DESTROYED) {
                        interfaceC14578.onCanceled();
                        return;
                    }
                    View viewM12252 = abstractActivityC55410.m12252(R.layout.MT_Protector);
                    ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    final InterfaceC8780 interfaceC8780M24857 = C10792.m24857(abstractActivityC55410, viewM12252, str);
                    C20671 c20671BuildDialog = abstractActivityC55410.buildDialog();
                    c20671BuildDialog.m46715(viewM12252);
                    c20671BuildDialog.m46736(R.string.MT_Protector, null);
                    c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2506(0, interfaceC14578));
                    c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.ۚۗܳ
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            interfaceC14578.onCanceled();
                        }
                    });
                    final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
                    if (!dialogInterfaceC2564M46732.m3855()) {
                        interfaceC14578.onCanceled();
                        return;
                    }
                    final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
                    interfaceC8780M24857.mo30400(new Runnable() { // from class: l.֨ۗܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC8780 interfaceC8780 = interfaceC8780M24857;
                            C10792.m24863(textView, interfaceC8780.mo30402());
                            dialogInterfaceC2564M46732.m3860().setEnabled(!interfaceC8780.mo30403());
                        }
                    });
                    final C16155 c16155 = new C16155(viewM12252);
                    dialogInterfaceC2564M46732.m3861().setOnClickListener(new ViewOnClickListenerC10554(abstractActivityC55410, 0));
                    dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܺۗܳ
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
                                InterfaceC14577 interfaceC14579 = interfaceC14578;
                                if (zMo34294) {
                                    boolean z2 = c13457M24859.m30605() instanceof C23691;
                                    C16155 c16156 = c16155;
                                    if (!z2 || c16156.m36760(dialogInterfaceC2564)) {
                                        C10792.m24865(new C23295(z2, c16156, dialogInterfaceC2564, interfaceC14579, interfaceC8780, c18483Mo30399, c13457M24859, textView), c13457M24859.m30605(), abstractActivityC55410);
                                        return;
                                    }
                                    return;
                                }
                                interfaceC8780.mo20309(c18483Mo30399);
                                dialogInterfaceC2564.dismiss();
                                interfaceC14579.mo6049(c13457M24859, false);
                            }
                        }
                    });
                }
            });
            return true;
        }
        return interfaceC14577.mo6050(exc);
    }
}
