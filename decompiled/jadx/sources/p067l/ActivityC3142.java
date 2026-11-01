package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3142 extends AbstractActivityC5549 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۖۧ */
    public static final AbstractC17043 f5741 = C17853.f53284.m38684("tran3");

    /* JADX INFO: renamed from: ܺۧ */
    public static final /* synthetic */ int f5742 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public AbstractC17043 f5743;

    /* JADX INFO: renamed from: ۢۧ */
    public View f5745;

    /* JADX INFO: renamed from: ܿۧ */
    public C1068 f5747;

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f5748;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C11400 f5749;

    /* JADX INFO: renamed from: ᩻ۧ */
    public String f5750;

    /* JADX INFO: renamed from: ܳۧ */
    public final ArrayList f5746 = new ArrayList();

    /* JADX INFO: renamed from: ۡۧ */
    public final HashMap f5744 = new HashMap();

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "ArscTranslationMain";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12250();
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC7140(2, this));
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C4484 c4484 = new C4484(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c4484);
        C11400 c11400 = (C11400) m12277(android.R.id.list);
        this.f5749 = c11400;
        c11400.setFastScrollEnabled(true);
        this.f5749.setOnItemClickListener(this);
        this.f5745 = m12277(R.id.MT_Protector);
        C1068 c1068 = (C1068) m12277(R.id.MT_Protector);
        this.f5747 = c1068;
        c1068.setChecked(ApplicationC21448.f67649.getBoolean("arsc_translation_keep", true));
        this.f5747.setOnCheckedChangeListener(new C15882());
        if (C18524.m42116((AbstractActivityC5549) this)) {
            return;
        }
        this.f5743 = C18524.m42105(getIntent());
        if (bundle != null && bundle.getBoolean("stateOK")) {
            try {
                this.f5750 = bundle.getString("digest");
                this.f5748 = bundle.getBoolean("changed");
                ArrayList<String> stringArrayList = bundle.getStringArrayList("filePaths");
                C12826.requireNonNull(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList = this.f5746;
                    if (zHasNext) {
                        C9848 c9848 = new C9848(C18524.m42109(it.next(), new String[0]));
                        String strM23120 = c9848.m23120();
                        arrayList.add(strM23120);
                        this.f5744.put(strM23120, c9848);
                    } else {
                        Collections.sort(arrayList);
                        this.f5749.setAdapter((ListAdapter) new C20578(this));
                        return;
                    }
                }
            } catch (Exception e) {
                m12260((Throwable) e, true);
            }
        } else {
            new C17223(this).m22250();
        }
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f5750;
        if (str == null) {
            return;
        }
        bundle.putString("digest", str);
        bundle.putBoolean("changed", this.f5748);
        HashMap map = this.f5744;
        ArrayList<String> arrayList = new ArrayList<>(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((C9848) it.next()).m23119().mo25505());
        }
        bundle.putStringArrayList("filePaths", arrayList);
        bundle.putBoolean("stateOK", true);
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f5750 == null) {
            return;
        }
        Iterator it = this.f5744.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                ((C9848) it.next()).m23117();
            } catch (IOException e) {
                m12259(e, (DialogInterface.OnDismissListener) null);
                z = true;
            }
        }
        if (z) {
            this.f5748 = false;
        } else {
            this.f5748 = this.f5748 || !this.f5750.equals(m5377());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ */
    public String m5377() {
        MessageDigest messageDigestM36660 = C16111.m36660();
        Iterator it = this.f5744.values().iterator();
        while (it.hasNext()) {
            ((C9848) it.next()).m23115(messageDigestM36660);
        }
        return C16111.m36665(messageDigestM36660.digest());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            new C5825(this, false).m22250();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m5371();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f5745.getVisibility() == 0) {
                this.f5745.setVisibility(8);
                return true;
            }
            this.f5745.setVisibility(0);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId != R.id.MT_Protector) {
                return false;
            }
            if (C24414.m53856()) {
                startActivity(new Intent(this, (Class<?>) ActivityC21758.class));
                return true;
            }
            C22682.m50793(R.string.MT_Protector);
            return true;
        }
        ArrayList arrayList = this.f5746;
        if (arrayList.size() < 2) {
            C22682.m50793(R.string.MT_Protector);
            return true;
        }
        C22682.m50793(R.string.MT_Protector);
        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
        final boolean[] zArr = new boolean[strArr.length];
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46725(strArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.᩻֫ᩳ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                int i2 = ActivityC3142.f5742;
                zArr[i] = z;
            }
        });
        final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۜ֫ᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC3142.m5367(this.f22844, zArr, strArr, dialogInterfaceC2564M21200);
            }
        });
        return true;
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        m5371();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ */
    public void m5371() {
        if (this.f5748) {
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ֫ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC3142.f5742;
                    new C5825(this.f55413, true).m22250();
                }
            });
            c20671.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2445(1, this));
            c20671.m46732();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        f5741.mo25503();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent(this, (Class<?>) ActivityC9332.class);
        C9848 c9848 = (C9848) this.f5744.get(this.f5746.get(i));
        C12826.requireNonNull(c9848);
        intent.setData(c9848.m23119().m38680());
        startActivity(intent);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5367(final ActivityC3142 activityC3142, boolean[] zArr, String[] strArr, DialogInterfaceC2564 dialogInterfaceC2564) {
        HashMap map = activityC3142.f5744;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            if (zArr[i3]) {
                if (i == -1) {
                    i = i3;
                } else {
                    if (i2 != -1) {
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    }
                    i2 = i3;
                }
            }
        }
        if (i == -1 || i2 == -1) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        final C9848<C16553> c9848 = (C9848) map.get(strArr[i]);
        C12826.requireNonNull(c9848);
        final C9848<C16553> c9849 = (C9848) map.get(strArr[i2]);
        C12826.requireNonNull(c9849);
        HashMap map2 = new HashMap();
        for (C16553 c16553 : c9848) {
            C12531 c12531 = new C12531(c16553.f48616, c16553.f48619);
            String str = c16553.f48620;
            if (str == null) {
                str = c16553.f48617;
            }
            map2.put(c12531, new C7166(str));
        }
        for (C16553 c16554 : c9849) {
            C7166 c7166 = (C7166) map2.get(new C12531(c16554.f48616, c16554.f48619));
            if (c7166 != null) {
                String str2 = c16554.f48620;
                if (str2 == null) {
                    str2 = c16554.f48617;
                }
                c7166.f18710 = str2;
            }
        }
        final C7166[] c7166Arr = (C7166[]) C7480.stream(map2.values()).filter(new C21919()).toArray(new C11190());
        if (c7166Arr.length == 0) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        dialogInterfaceC2564.dismiss();
        C20671 c20671BuildDialog = activityC3142.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(c9848.m23120() + " > " + c9849.m23120());
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        final DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final boolean[] zArr2 = {false};
        final int i4 = 1;
        dialogInterfaceC2564M18268.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.۟᩹᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                Serializable serializable = c9848;
                Object obj = c9849;
                Object obj2 = dialogInterfaceC2564M18268;
                Object obj3 = zArr2;
                switch (i5) {
                    case 0:
                        C13776 c13776 = (C13776) obj3;
                        C22551 c22551 = (C22551) serializable;
                        AbstractC22606 abstractC22606 = C21265.f66820;
                        c13776.f38942 = abstractC22606.mo9513();
                        c13776.f38944 = EnumC8411.m19595(abstractC22606);
                        ((ImageView) obj2).setImageBitmap(((InterfaceC16397) obj).mo34535(c13776));
                        if (c22551.mo50536()) {
                            c22551.m50537();
                            ((DialogInterfaceC2564) c22551.mo17723()).m3854(false);
                        }
                        break;
                    default:
                        boolean[] zArr3 = (boolean[]) obj3;
                        DialogInterfaceC2564 dialogInterfaceC2565 = (DialogInterfaceC2564) obj2;
                        C9848 c98410 = (C9848) obj;
                        C9848 c98411 = (C9848) serializable;
                        int i6 = ActivityC3142.f5742;
                        boolean z = zArr3[0];
                        zArr3[0] = !z;
                        if (!z) {
                            dialogInterfaceC2565.m3853(c98410.m23120() + " > " + c98411.m23120());
                        } else {
                            dialogInterfaceC2565.m3853(c98411.m23120() + " > " + c98410.m23120());
                        }
                        break;
                }
            }
        });
        dialogInterfaceC2564M18268.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۡ֫ᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = ActivityC3142.f5742;
                dialogInterfaceC2564M18268.dismiss();
                new C19907(this.f29113, c7166Arr, zArr2);
            }
        });
    }
}
