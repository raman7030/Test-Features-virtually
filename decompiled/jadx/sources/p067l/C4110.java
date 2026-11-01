package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C4110 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f9052;

    /* JADX INFO: renamed from: ۙ */
    public DialogInterfaceC2564 f9053;

    /* JADX INFO: renamed from: ᩶ */
    public final C21564 f9054;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC18686 f9055;

    /* JADX INFO: renamed from: ᩹ */
    public BaseAdapter f9056;

    public C4110(final ActivityC18686 activityC18686, C21564 c21564) {
        this.f9055 = activityC18686;
        this.f9054 = c21564;
        this.f9052 = c21564.m48752();
        C13517 c13517 = new C13517(this, activityC18686);
        this.f9056 = c13517;
        View viewM12252 = activityC18686.m12252(R.layout.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        C7040.m16181(listView);
        listView.setAdapter((ListAdapter) c13517);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC18686);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫۬᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final C4110 c4110 = this.f40445;
                activityC18686.m42608(new Runnable() { // from class: l.ۛ۬᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        c4110.m8270(true);
                    }
                });
            }
        });
        this.f9053 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8278() {
        if (this.f9052.isEmpty()) {
            this.f9055.m42608(new Runnable() { // from class: l.ۙ۬᩷
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17686.m8270(false);
                }
            });
        } else {
            DialogInterfaceC2564 dialogInterfaceC2564 = this.f9053;
            dialogInterfaceC2564.m3862();
            C10884.m25071(dialogInterfaceC2564);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m8270(boolean z) {
        C15527 c15527 = new C15527(this, this.f9055, z);
        c15527.m33336((CharSequence) ApplicationC21448.f67649.getString("dex_backup_name", "backup"));
        c15527.m33344(R.string.MT_Protector);
        c15527.m33365(6);
        c15527.m33342(R.string.MT_Protector);
        c15527.m33367();
        c15527.m33352(true);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(final AdapterView adapterView, final View view, final int i, final long j) {
        C1898 c1898 = new C1898(this.f9055, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ۗ۬᩷
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C4110.m8267(this.f13042, adapterView, view, i, j, menuItem);
                return true;
            }
        });
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8267(final C4110 c4110, AdapterView adapterView, View view, int i, long j, MenuItem menuItem) {
        ActivityC18686 activityC18686 = c4110.f9055;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c4110.onItemClick(adapterView, view, i, j);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C23575 c23575 = (C23575) c4110.f9052.get(i);
            C9493 c9493 = new C9493(c4110, activityC18686, c23575);
            c9493.m33344(R.string.MT_Protector);
            c9493.m33336((CharSequence) c23575.f75056);
            c9493.m33367();
            c9493.m33352(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final C23575 c23576 = (C23575) c4110.f9052.get(i);
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(activityC18686);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46718(activityC18686.getString(R.string.MT_Protector, c23576.f75056));
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤ۬᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C4110.m8269(this.f34024, c23576);
                }
            });
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m8269(C4110 c4110, C23575 c23575) {
        c23575.f75055.mo25503();
        c23575.f75054.mo25503();
        c4110.f9052.remove(c23575);
        c4110.f9056.notifyDataSetChanged();
        if (c4110.f9052.isEmpty()) {
            c4110.f9053.dismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        final C23575 c23575 = (C23575) this.f9052.get(i);
        int i2 = DialogInterfaceC2564.f4230;
        ActivityC18686 activityC18686 = this.f9055;
        C20671 c20671 = new C20671(activityC18686);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46718(activityC18686.getString(R.string.MT_Protector, c23575.f75056));
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬۬᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C4110.m8272(this.f42355, c23575);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m8272(C4110 c4110, C23575 c23575) {
        ActivityC18686 activityC18686 = c4110.f9055;
        try {
            c4110.f9054.m48754(c23575.f75055);
            c4110.f9053.dismiss();
            activityC18686.m42600(true);
        } catch (IOException e) {
            activityC18686.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
