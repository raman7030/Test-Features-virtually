package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes4.dex */
public final class C14962 implements InterfaceC12846 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12846 f45615;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f45616;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f45617;

    public C14962(InterfaceC12846 interfaceC12846, AbstractActivityC3346 abstractActivityC3346, String str) {
        this.f45615 = interfaceC12846;
        this.f45616 = abstractActivityC3346;
        this.f45617 = str;
    }

    @Override // l.InterfaceC12846
    /* JADX INFO: renamed from: ֫ */
    public final void mo3776(C11667 c11667, boolean z) {
        this.f45615.mo3776(c11667, z);
    }

    @Override // l.InterfaceC12846
    public final void onCanceled() {
        this.f45615.onCanceled();
    }

    @Override // l.InterfaceC12846
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3777(Exception exc) {
        final AbstractActivityC3346 abstractActivityC3346;
        boolean z = exc instanceof C21730;
        final InterfaceC12846 interfaceC12846 = this.f45615;
        if (z && (abstractActivityC3346 = this.f45616) != null) {
            final String str = this.f45617;
            C4925.m14315(new Runnable() { // from class: l.۠ۗܳ
                @Override // java.lang.Runnable
                public final void run() {
                    final AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                    boolean zIsFinishing = abstractActivityC3347.isFinishing();
                    final InterfaceC12846 interfaceC12847 = interfaceC12846;
                    if (zIsFinishing || abstractActivityC3347.getLifecycle().mo19832() == EnumC13728.DESTROYED) {
                        interfaceC12847.onCanceled();
                        return;
                    }
                    View viewM10216 = abstractActivityC3347.m10216(R.layout.MT_Protector);
                    ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    final InterfaceC6746 interfaceC6746M22886 = C8863.m22886(abstractActivityC3347, viewM10216, str);
                    C19258 c19258BuildDialog = abstractActivityC3347.buildDialog();
                    c19258BuildDialog.m44421(viewM10216);
                    c19258BuildDialog.m44442(R.string.MT_Protector, null);
                    c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0145(0, interfaceC12847));
                    c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ۚۗܳ
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            interfaceC12847.onCanceled();
                        }
                    });
                    final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
                    if (!dialogInterfaceC0206M44438.m1442()) {
                        interfaceC12847.onCanceled();
                        return;
                    }
                    final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
                    interfaceC6746M22886.mo28354(new Runnable() { // from class: l.֨ۗܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC6746 interfaceC6746 = interfaceC6746M22886;
                            C8863.m22892(textView, interfaceC6746.mo28356());
                            dialogInterfaceC0206M44438.m1447().setEnabled(!interfaceC6746.mo28357());
                        }
                    });
                    final C14506 c14506 = new C14506(viewM10216);
                    dialogInterfaceC0206M44438.m1448().setOnClickListener(new ViewOnClickListenerC8613(abstractActivityC3347, 0));
                    dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܺۗܳ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                            if (dialogInterfaceC0206.m1442()) {
                                InterfaceC6746 interfaceC6746 = interfaceC6746M22886;
                                if (interfaceC6746.mo28355()) {
                                    return;
                                }
                                C16955 c16955Mo28353 = interfaceC6746.mo28353();
                                C11667 c11667M22888 = C8863.m22888(c16955Mo28353);
                                boolean zMo32195 = c11667M22888.m28557().mo32195();
                                InterfaceC12846 interfaceC12848 = interfaceC12847;
                                if (zMo32195) {
                                    boolean z2 = c11667M22888.m28557() instanceof C22435;
                                    C14506 c14507 = c14506;
                                    if (!z2 || c14507.m34619(dialogInterfaceC0206)) {
                                        C8863.m22894(new C22019(z2, c14507, dialogInterfaceC0206, interfaceC12848, interfaceC6746, c16955Mo28353, c11667M22888, textView), c11667M22888.m28557(), abstractActivityC3347);
                                        return;
                                    }
                                    return;
                                }
                                interfaceC6746.mo18361(c16955Mo28353);
                                dialogInterfaceC0206.dismiss();
                                interfaceC12848.mo3776(c11667M22888, false);
                            }
                        }
                    });
                }
            });
            return true;
        }
        return interfaceC12846.mo3777(exc);
    }
}
