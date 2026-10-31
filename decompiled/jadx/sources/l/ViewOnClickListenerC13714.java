package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC13714 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C16742 f40919;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f40920;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f40921;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f40922;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f40923;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextView f40924;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f40925;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC13714(ActivityC7365 activityC7365, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC7365).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f40922 = activityC7365;
        this.f40925 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f40924 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f40923 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f40920 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f40921 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩸ۡۢ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f69104;
                C19258 c19258BuildDialog = viewOnClickListenerC13714.f40922.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹ۡۢ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        new C22887(viewOnClickListenerC13714).m20274();
                    }
                });
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog.m44438();
                return true;
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C16742 c16742 = this.f40919;
        int i = c16742.f51392;
        ActivityC7365 activityC7365 = this.f40922;
        if (i == -4) {
            C19258 c19258BuildDialog = activityC7365.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    new C22887(this.f1683).m20274();
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        if (i == -3) {
            C19258 c19258BuildDialog2 = activityC7365.buildDialog();
            c19258BuildDialog2.m44433(R.string.MT_Protector);
            c19258BuildDialog2.m44416(R.string.MT_Protector);
            c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f24875;
                    ServiceC8982.m23216(viewOnClickListenerC13714.f40919);
                    C16742 c16743 = viewOnClickListenerC13714.f40919;
                    c16743.f51392 = -2;
                    ActivityC7365.m19799(viewOnClickListenerC13714.f40922, c16743, viewOnClickListenerC13714.f40920);
                }
            });
            c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog2.m44438();
            return;
        }
        if (i == 2) {
            m32968(c16742.f51393);
            return;
        }
        if (i != 3) {
            return;
        }
        C19258 c19258BuildDialog3 = activityC7365.buildDialog();
        c19258BuildDialog3.m44433(R.string.MT_Protector);
        c19258BuildDialog3.m44416(R.string.MT_Protector);
        c19258BuildDialog3.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶۡۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C11599(this.f46242).m20274();
            }
        });
        c19258BuildDialog3.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog3.m44438();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m32968(final String str) {
        final AbstractC15440 abstractC15440M40796 = C17448.m40796(this.f40919);
        boolean zMo23120 = abstractC15440M40796.mo23120();
        ActivityC7365 activityC7365 = this.f40922;
        if (zMo23120) {
            C19258 c19258BuildDialog = activityC7365.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44424(activityC7365.getString(R.string.MT_Protector, abstractC15440M40796.mo23554()));
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f64990;
                    C20549.m47080(viewOnClickListenerC13714.f40922, abstractC15440M40796, viewOnClickListenerC13714.f40919.f51393);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC7365 activityC7366 = this.f14497.f40922;
                    String strMo23554 = abstractC15440M40796.mo23554();
                    int i2 = ActivityC7365.f22615;
                    activityC7366.getClass();
                    Main.m63(activityC7366, strMo23554);
                }
            });
            c19258BuildDialog.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC13714.m32970(this.f9794, abstractC15440M40796, str);
                }
            });
            c19258BuildDialog.m44438();
            return;
        }
        View viewM10216 = activityC7365.m10216(R.layout.MT_Protector);
        final InterfaceC6746 interfaceC6746M22886 = C8863.m22886(activityC7365, viewM10216, str);
        C19258 c19258BuildDialog2 = activityC7365.buildDialog();
        c19258BuildDialog2.m44421(viewM10216);
        c19258BuildDialog2.m44442(R.string.MT_Protector, null);
        c19258BuildDialog2.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ۡۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                interfaceC6746M22886.mo18363();
            }
        });
        c19258BuildDialog2.m44419(new DialogInterface.OnCancelListener() { // from class: l.۫ۡۢ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                interfaceC6746M22886.mo18363();
            }
        });
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog2.m44438();
        C8960.m23097(dialogInterfaceC0206M44438);
        final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        interfaceC6746M22886.mo28354(new Runnable() { // from class: l.ۚۡۢ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC6746 interfaceC6746 = interfaceC6746M22886;
                C8863.m22892(textView, interfaceC6746.mo28356());
                dialogInterfaceC0206M44438.m1447().setEnabled(!interfaceC6746.mo28357());
            }
        });
        final C14506 c14506 = new C14506(viewM10216);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨ۡۢ
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
                    ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f3741;
                    String str2 = str;
                    if (zMo32195) {
                        boolean z = c11667M22888.m28557() instanceof C22435;
                        C14506 c14507 = c14506;
                        if (!z || c14507.m34619(dialogInterfaceC0206)) {
                            C8863.m22894(new C10188(viewOnClickListenerC13714, z, c14507, dialogInterfaceC0206, interfaceC6746, c16955Mo28353, str2, c11667M22888, textView), c11667M22888.m28557(), viewOnClickListenerC13714.f40922);
                            return;
                        }
                        return;
                    }
                    interfaceC6746.mo18361(c16955Mo28353);
                    dialogInterfaceC0206.dismiss();
                    new C5954(viewOnClickListenerC13714, c11667M22888, str2).m20274();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32970(ViewOnClickListenerC13714 viewOnClickListenerC13714, AbstractC15440 abstractC15440, String str) {
        abstractC15440.mo23552();
        viewOnClickListenerC13714.m32968(str);
    }
}
