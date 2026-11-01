package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.᩺֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC23930 implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener, View.OnClickListener, Runnable {

    /* JADX INFO: renamed from: ۧ֫ */
    public static String f76026;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f76027;

    /* JADX INFO: renamed from: ۗ */
    public C21249 f76028;

    /* JADX INFO: renamed from: ۙ */
    public DialogInterfaceC2564 f76029;

    /* JADX INFO: renamed from: ۟ */
    public TextView f76031;

    /* JADX INFO: renamed from: ۤ */
    public TextView f76032;

    /* JADX INFO: renamed from: ۨ */
    public int f76033;

    /* JADX INFO: renamed from: ۫ */
    public Thread f76034;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractActivityC5549 f76038;

    /* JADX INFO: renamed from: ᩹ */
    public BaseAdapter f76039;

    /* JADX INFO: renamed from: ܰ */
    public boolean f76036 = false;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f76037 = false;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f76040 = true;

    /* JADX INFO: renamed from: ۛ */
    public DialogInterfaceC2564 f76030 = null;

    /* JADX INFO: renamed from: ۬ */
    public List f76035 = C4069.m8151();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo5746();

    public AbstractDialogInterfaceOnClickListenerC23930(AbstractActivityC5549 abstractActivityC5549) {
        this.f76033 = 0;
        this.f76038 = abstractActivityC5549;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        C7040.m16181(listView);
        listView.setOnItemClickListener(this);
        listView.setDivider(null);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, this);
        DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f76029 = dialogInterfaceC2564M18268;
        C10884.m25071(dialogInterfaceC2564M18268);
        View viewM3846 = dialogInterfaceC2564M18268.m3846(R.id.MT_Protector);
        viewM3846.setPadding(viewM3846.getPaddingLeft(), viewM3846.getPaddingTop(), viewM3846.getPaddingRight(), viewM3846.getPaddingTop() / 3);
        dialogInterfaceC2564M18268.m3861().setOnClickListener(this);
        if (this.f76035.isEmpty()) {
            onClick(null);
        }
        if (f76026 != null) {
            for (int i2 = 0; i2 < this.f76035.size(); i2++) {
                if (f76026.equals(((C21249) this.f76035.get(i2)).m48007())) {
                    this.f76033 = i2;
                    break;
                }
            }
        }
        C7837 c7837 = new C7837(this);
        this.f76039 = c7837;
        listView.setAdapter((ListAdapter) c7837);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53029(String str, String str2) {
        if (this.f76037 || !this.f76028.m48003(str)) {
            this.f76028.m48001(str, str2);
            return;
        }
        if (this.f76036) {
            return;
        }
        C5155 c5155M47999 = this.f76028.m47999(str);
        if (str2.equals(c5155M47999.f12127)) {
            return;
        }
        C12799.m29348();
        this.f76027 = true;
        this.f76038.runOnUiThread(new RunnableC11861(this, c5155M47999, str2));
        while (this.f76027) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
        if (this.f76040) {
            return;
        }
        this.f76028.m48001(str, str2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        if (this.f76033 < this.f76035.size()) {
            this.f76034 = Thread.currentThread();
            C21249 c21249 = (C21249) this.f76035.get(this.f76033);
            this.f76028 = c21249;
            try {
                c21249.m48006();
                new Thread(this).start();
            } catch (Exception e) {
                this.f76038.m12259(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Thread.currentThread() != this.f76034) {
            while (mo5746()) {
            }
            this.f76038.runOnUiThread(this);
        } else {
            try {
                this.f76028.m48004();
                C22682.m50793(R.string.MT_Protector);
            } catch (IOException unused) {
                C22682.m50793(R.string.MT_Protector);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f76033 = i;
        f76026 = ((C21249) this.f76035.get(i)).m48007();
        this.f76039.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C13872 c13872 = new C13872(this, this.f76038);
        c13872.m33344(R.string.MT_Protector);
        c13872.m33330();
        c13872.m33365(6);
        c13872.m33352(true);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m53027(final AbstractDialogInterfaceOnClickListenerC23930 abstractDialogInterfaceOnClickListenerC23930) {
        AbstractActivityC5549 abstractActivityC5549 = abstractDialogInterfaceOnClickListenerC23930.f76038;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        abstractDialogInterfaceOnClickListenerC23930.f76031 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        abstractDialogInterfaceOnClickListenerC23930.f76032 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        abstractDialogInterfaceOnClickListenerC23930.f76031.setTextIsSelectable(true);
        abstractDialogInterfaceOnClickListenerC23930.f76032.setTextIsSelectable(true);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.radioButton3), (RadioButton) viewM12252.findViewById(R.id.radioButton4)};
        ViewOnClickListenerC13218 viewOnClickListenerC13218 = new ViewOnClickListenerC13218(2, radioButtonArr);
        for (int i = 0; i < 4; i++) {
            radioButtonArr[i].setOnClickListener(viewOnClickListenerC13218);
        }
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬֫ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AbstractDialogInterfaceOnClickListenerC23930.m53020(this.f41494, radioButtonArr);
            }
        });
        abstractDialogInterfaceOnClickListenerC23930.f76030 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53020(AbstractDialogInterfaceOnClickListenerC23930 abstractDialogInterfaceOnClickListenerC23930, RadioButton[] radioButtonArr) {
        abstractDialogInterfaceOnClickListenerC23930.f76027 = false;
        if (radioButtonArr[0].isChecked()) {
            abstractDialogInterfaceOnClickListenerC23930.f76040 = true;
            return;
        }
        if (radioButtonArr[1].isChecked()) {
            abstractDialogInterfaceOnClickListenerC23930.f76040 = false;
            return;
        }
        if (radioButtonArr[2].isChecked()) {
            abstractDialogInterfaceOnClickListenerC23930.f76040 = true;
            abstractDialogInterfaceOnClickListenerC23930.f76036 = true;
        } else if (radioButtonArr[3].isChecked()) {
            abstractDialogInterfaceOnClickListenerC23930.f76040 = false;
            abstractDialogInterfaceOnClickListenerC23930.f76037 = true;
        }
    }
}
