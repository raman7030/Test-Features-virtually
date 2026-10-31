package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.᩺֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC22687 implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener, View.OnClickListener, Runnable {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static String f73301;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f73302;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C19866 f73303;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f73304;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f73306;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f73307;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f73308;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Thread f73309;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f73313;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BaseAdapter f73314;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f73311 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f73312 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f73315 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f73305 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f73310 = C1789.m5956();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo3443();

    public AbstractDialogInterfaceOnClickListenerC22687(AbstractActivityC3346 abstractActivityC3346) {
        this.f73308 = 0;
        this.f73313 = abstractActivityC3346;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
        C4915.m14284(listView);
        listView.setOnItemClickListener(this);
        listView.setDivider(null);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, this);
        DialogInterfaceC0206 dialogInterfaceC0206M16343 = C5834.m16343(c19258, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f73304 = dialogInterfaceC0206M16343;
        C8960.m23097(dialogInterfaceC0206M16343);
        View viewM1433 = dialogInterfaceC0206M16343.m1433(R.id.MT_Protector);
        viewM1433.setPadding(viewM1433.getPaddingLeft(), viewM1433.getPaddingTop(), viewM1433.getPaddingRight(), viewM1433.getPaddingTop() / 3);
        dialogInterfaceC0206M16343.m1448().setOnClickListener(this);
        if (this.f73310.isEmpty()) {
            onClick(null);
        }
        if (f73301 != null) {
            for (int i2 = 0; i2 < this.f73310.size(); i2++) {
                if (f73301.equals(((C19866) this.f73310.get(i2)).m45696())) {
                    this.f73308 = i2;
                    break;
                }
            }
        }
        C5754 c5754 = new C5754(this);
        this.f73314 = c5754;
        listView.setAdapter((ListAdapter) c5754);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50703(String str, String str2) {
        if (this.f73312 || !this.f73303.m45692(str)) {
            this.f73303.m45690(str, str2);
            return;
        }
        if (this.f73311) {
            return;
        }
        C2932 c2932M45688 = this.f73303.m45688(str);
        if (str2.equals(c2932M45688.f9328)) {
            return;
        }
        C10975.m27286();
        this.f73302 = true;
        this.f73313.runOnUiThread(new RunnableC9988(this, c2932M45688, str2));
        while (this.f73302) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
        if (this.f73315) {
            return;
        }
        this.f73303.m45690(str, str2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        if (this.f73308 < this.f73310.size()) {
            this.f73309 = Thread.currentThread();
            C19866 c19866 = (C19866) this.f73310.get(this.f73308);
            this.f73303 = c19866;
            try {
                c19866.m45695();
                new Thread(this).start();
            } catch (Exception e) {
                this.f73313.m10223(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Thread.currentThread() != this.f73309) {
            while (mo3443()) {
            }
            this.f73313.runOnUiThread(this);
        } else {
            try {
                this.f73303.m45693();
                C21374.m48457(R.string.MT_Protector);
            } catch (IOException unused) {
                C21374.m48457(R.string.MT_Protector);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f73308 = i;
        f73301 = ((C19866) this.f73310.get(i)).m45696();
        this.f73314.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C12104 c12104 = new C12104(this, this.f73313);
        c12104.m31258(R.string.MT_Protector);
        c12104.m31244();
        c12104.m31279(6);
        c12104.m31266(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m50701(final AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687) {
        AbstractActivityC3346 abstractActivityC3346 = abstractDialogInterfaceOnClickListenerC22687.f73313;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        abstractDialogInterfaceOnClickListenerC22687.f73306 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        abstractDialogInterfaceOnClickListenerC22687.f73307 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        abstractDialogInterfaceOnClickListenerC22687.f73306.setTextIsSelectable(true);
        abstractDialogInterfaceOnClickListenerC22687.f73307.setTextIsSelectable(true);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.radioButton3), (RadioButton) viewM10216.findViewById(R.id.radioButton4)};
        ViewOnClickListenerC11416 viewOnClickListenerC11416 = new ViewOnClickListenerC11416(2, radioButtonArr);
        for (int i = 0; i < 4; i++) {
            radioButtonArr[i].setOnClickListener(viewOnClickListenerC11416);
        }
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬֫ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AbstractDialogInterfaceOnClickListenerC22687.m50694(this.f38452, radioButtonArr);
            }
        });
        abstractDialogInterfaceOnClickListenerC22687.f73305 = c19258.m44415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50694(AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687, RadioButton[] radioButtonArr) {
        abstractDialogInterfaceOnClickListenerC22687.f73302 = false;
        if (radioButtonArr[0].isChecked()) {
            abstractDialogInterfaceOnClickListenerC22687.f73315 = true;
            return;
        }
        if (radioButtonArr[1].isChecked()) {
            abstractDialogInterfaceOnClickListenerC22687.f73315 = false;
            return;
        }
        if (radioButtonArr[2].isChecked()) {
            abstractDialogInterfaceOnClickListenerC22687.f73315 = true;
            abstractDialogInterfaceOnClickListenerC22687.f73311 = true;
        } else if (radioButtonArr[3].isChecked()) {
            abstractDialogInterfaceOnClickListenerC22687.f73315 = false;
            abstractDialogInterfaceOnClickListenerC22687.f73312 = true;
        }
    }
}
