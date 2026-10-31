package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23705 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76768;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76769;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23586 f76770;

    public /* synthetic */ ViewOnClickListenerC23705(EditText editText, AbstractActivityC3346 abstractActivityC3346) {
        this.f76769 = 2;
        this.f76768 = editText;
        this.f76770 = abstractActivityC3346;
    }

    public /* synthetic */ ViewOnClickListenerC23705(InterfaceC23586 interfaceC23586, Object obj, int i) {
        this.f76769 = i;
        this.f76770 = interfaceC23586;
        this.f76768 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f76769) {
            case 0:
                final AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f76770;
                final RunnableC14532 runnableC14532 = (RunnableC14532) this.f76768;
                View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
                ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                final InterfaceC23679 interfaceC23679M22890 = C8863.m22890(abstractActivityC3346, viewM10216, C19911.m45806());
                C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
                c19258BuildDialog.m44421(viewM10216);
                c19258BuildDialog.m44442(R.string.MT_Protector, null);
                final DialogInterfaceC0206 dialogInterfaceC0206M16343 = C5834.m16343(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
                interfaceC23679M22890.mo28354(new Runnable() { // from class: l.ۚ۫᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC23679 interfaceC23679 = interfaceC23679M22890;
                        C8863.m22892(textView, interfaceC23679.mo28356());
                        dialogInterfaceC0206M16343.m1447().setEnabled(!interfaceC23679.mo28357());
                    }
                });
                final C14506 c14506 = new C14506(viewM10216);
                dialogInterfaceC0206M16343.m1448().setOnClickListener(new ViewOnClickListenerC3619(abstractActivityC3346, 1));
                dialogInterfaceC0206M16343.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M16343;
                        if (dialogInterfaceC0206.m1442()) {
                            InterfaceC23679 interfaceC23679 = interfaceC23679M22890;
                            if (interfaceC23679.mo28355()) {
                                return;
                            }
                            C16955 c16955Mo28353 = interfaceC23679.mo28353();
                            AbstractC13262 abstractC13262M22889 = C8863.m22889(c16955Mo28353.m39780());
                            if (abstractC13262M22889 == null) {
                                abstractC13262M22889 = (AbstractC13262) C8863.f26982.get(0);
                            }
                            boolean z = abstractC13262M22889 instanceof C22435;
                            C14506 c14507 = c14506;
                            if (!z || c14507.m34619(dialogInterfaceC0206)) {
                                RunnableC14532 runnableC14533 = runnableC14532;
                                TextView textView2 = textView;
                                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                                C10025.m25196(abstractActivityC3347, c16955Mo28353, true, (InterfaceC12846) new C10945(z, c14507, dialogInterfaceC0206, c16955Mo28353, runnableC14533, textView2, abstractActivityC3347));
                            }
                        }
                    }
                });
                break;
            case 1:
                ActivityC14946.m35403((ActivityC14946) this.f76770, (DialogInterfaceC0206) this.f76768);
                break;
            case 2:
                EditText editText = (EditText) this.f76768;
                AbstractActivityC3346 abstractActivityC3347 = (AbstractActivityC3346) this.f76770;
                String string = editText.getText().toString();
                ArrayList arrayList = new ArrayList(C14776.f45125 - 1);
                int size = -1;
                for (int i = 0; i < C14776.f45125; i++) {
                    String strM35153 = C14776.m35153(i);
                    if (!strM35153.equals("UTF-8-BOM")) {
                        if (strM35153.equalsIgnoreCase(string)) {
                            size = arrayList.size();
                        }
                        arrayList.add(strM35153);
                    }
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C19258 c19258BuildDialog2 = abstractActivityC3347.buildDialog();
                c19258BuildDialog2.m44433(R.string.MT_Protector);
                c19258BuildDialog2.m44429(strArr, size, new DialogInterfaceOnClickListenerC14086(2, editText, strArr));
                c19258BuildDialog2.m44442(R.string.MT_Protector, null);
                c19258BuildDialog2.m44438();
                break;
            default:
                C21100.m48035((DialogInterfaceC0206) this.f76770, (C8817) this.f76768);
                break;
        }
    }
}
