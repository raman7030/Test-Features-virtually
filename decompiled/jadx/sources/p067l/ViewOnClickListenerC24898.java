package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC24898 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f79518;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f79519;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC24784 f79520;

    public /* synthetic */ ViewOnClickListenerC24898(EditText editText, AbstractActivityC5549 abstractActivityC5549) {
        this.f79519 = 2;
        this.f79518 = editText;
        this.f79520 = abstractActivityC5549;
    }

    public /* synthetic */ ViewOnClickListenerC24898(InterfaceC24784 interfaceC24784, Object obj, int i) {
        this.f79519 = i;
        this.f79520 = interfaceC24784;
        this.f79518 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f79519) {
            case 0:
                final AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f79520;
                final RunnableC16180 runnableC16180 = (RunnableC16180) this.f79518;
                View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
                ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                final InterfaceC24873 interfaceC24873M24861 = C10792.m24861(abstractActivityC5549, viewM12252, C21292.m48118());
                C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                c20671BuildDialog.m46715(viewM12252);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                final DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
                interfaceC24873M24861.mo30400(new Runnable() { // from class: l.ۚ۫᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC24873 interfaceC24873 = interfaceC24873M24861;
                        C10792.m24863(textView, interfaceC24873.mo30402());
                        dialogInterfaceC2564M18268.m3860().setEnabled(!interfaceC24873.mo30403());
                    }
                });
                final C16155 c16155 = new C16155(viewM12252);
                dialogInterfaceC2564M18268.m3861().setOnClickListener(new ViewOnClickListenerC5808(abstractActivityC5549, 1));
                dialogInterfaceC2564M18268.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.֨۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M18268;
                        if (dialogInterfaceC2564.m3855()) {
                            InterfaceC24873 interfaceC24873 = interfaceC24873M24861;
                            if (interfaceC24873.mo30401()) {
                                return;
                            }
                            C18483 c18483Mo30399 = interfaceC24873.mo30399();
                            AbstractC14973 abstractC14973M24860 = C10792.m24860(c18483Mo30399.m42021());
                            if (abstractC14973M24860 == null) {
                                abstractC14973M24860 = (AbstractC14973) C10792.f29905.get(0);
                            }
                            boolean z = abstractC14973M24860 instanceof C23691;
                            C16155 c16156 = c16155;
                            if (!z || c16156.m36760(dialogInterfaceC2564)) {
                                RunnableC16180 runnableC16181 = runnableC16180;
                                TextView textView2 = textView;
                                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                                C11896.m27213(abstractActivityC55410, c18483Mo30399, true, (InterfaceC14577) new C12771(z, c16156, dialogInterfaceC2564, c18483Mo30399, runnableC16181, textView2, abstractActivityC55410));
                            }
                        }
                    }
                });
                break;
            case 1:
                ActivityC16573.m37555((ActivityC16573) this.f79520, (DialogInterfaceC2564) this.f79518);
                break;
            case 2:
                EditText editText = (EditText) this.f79518;
                AbstractActivityC5549 abstractActivityC55410 = (AbstractActivityC5549) this.f79520;
                String string = editText.getText().toString();
                ArrayList arrayList = new ArrayList(C16412.f48239 - 1);
                int size = -1;
                for (int i = 0; i < C16412.f48239; i++) {
                    String strM37300 = C16412.m37300(i);
                    if (!strM37300.equals("UTF-8-BOM")) {
                        if (strM37300.equalsIgnoreCase(string)) {
                            size = arrayList.size();
                        }
                        arrayList.add(strM37300);
                    }
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C20671 c20671BuildDialog2 = abstractActivityC55410.buildDialog();
                c20671BuildDialog2.m46727(R.string.MT_Protector);
                c20671BuildDialog2.m46723(strArr, size, new DialogInterfaceOnClickListenerC15756(2, editText, strArr));
                c20671BuildDialog2.m46736(R.string.MT_Protector, null);
                c20671BuildDialog2.m46732();
                break;
            default:
                C22422.m50365((DialogInterfaceC2564) this.f79520, (C10748) this.f79518);
                break;
        }
    }
}
