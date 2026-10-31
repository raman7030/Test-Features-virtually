package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import bin.mt.plus.R;
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
public class ActivityC0814 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f2970 = C16293.f50117.m36526("tran3");

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2971 = 0;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f2972;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public View f2974;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C4554 f2976;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f2977;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C9503 f2978;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public String f2979;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2975 = new ArrayList();

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f2973 = new HashMap();

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "ArscTranslationMain";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10214();
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC5021(2, this));
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C2226 c2226 = new C2226(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c2226);
        C9503 c9503 = (C9503) m10241(android.R.id.list);
        this.f2978 = c9503;
        c9503.setFastScrollEnabled(true);
        this.f2978.setOnItemClickListener(this);
        this.f2974 = m10241(R.id.MT_Protector);
        C4554 c4554 = (C4554) m10241(R.id.MT_Protector);
        this.f2976 = c4554;
        c4554.setChecked(ApplicationC20075.f65008.getBoolean("arsc_translation_keep", true));
        this.f2976.setOnCheckedChangeListener(new C14219());
        if (C16999.m39873((AbstractActivityC3346) this)) {
            return;
        }
        this.f2972 = C16999.m39862(getIntent());
        if (bundle != null && bundle.getBoolean("stateOK")) {
            try {
                this.f2979 = bundle.getString("digest");
                this.f2977 = bundle.getBoolean("changed");
                ArrayList<String> stringArrayList = bundle.getStringArrayList("filePaths");
                C11003.requireNonNull(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList = this.f2975;
                    if (zHasNext) {
                        C7870 c7870 = new C7870(C16999.m39866(it.next(), new String[0]));
                        String strM21155 = c7870.m21155();
                        arrayList.add(strM21155);
                        this.f2973.put(strM21155, c7870);
                    } else {
                        Collections.sort(arrayList);
                        this.f2978.setAdapter((ListAdapter) new C19160(this));
                        return;
                    }
                }
            } catch (Exception e) {
                m10224((Throwable) e, true);
            }
        } else {
            new C15630(this).m20274();
        }
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f2979;
        if (str == null) {
            return;
        }
        bundle.putString("digest", str);
        bundle.putBoolean("changed", this.f2977);
        HashMap map = this.f2973;
        ArrayList<String> arrayList = new ArrayList<>(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((C7870) it.next()).m21154().mo23554());
        }
        bundle.putStringArrayList("filePaths", arrayList);
        bundle.putBoolean("stateOK", true);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f2979 == null) {
            return;
        }
        Iterator it = this.f2973.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                ((C7870) it.next()).m21152();
            } catch (IOException e) {
                m10223(e, (DialogInterface.OnDismissListener) null);
                z = true;
            }
        }
        if (z) {
            this.f2977 = false;
        } else {
            this.f2977 = this.f2977 || !this.f2979.equals(m3064());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String m3064() {
        MessageDigest messageDigestM34526 = C14460.m34526();
        Iterator it = this.f2973.values().iterator();
        while (it.hasNext()) {
            ((C7870) it.next()).m21150(messageDigestM34526);
        }
        return C14460.m34531(messageDigestM34526.digest());
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
            new C3637(this, false).m20274();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m3058();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f2974.getVisibility() == 0) {
                this.f2974.setVisibility(8);
                return true;
            }
            this.f2974.setVisibility(0);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId != R.id.MT_Protector) {
                return false;
            }
            if (C23196.m51460()) {
                startActivity(new Intent(this, (Class<?>) ActivityC20401.class));
                return true;
            }
            C21374.m48457(R.string.MT_Protector);
            return true;
        }
        ArrayList arrayList = this.f2975;
        if (arrayList.size() < 2) {
            C21374.m48457(R.string.MT_Protector);
            return true;
        }
        C21374.m48457(R.string.MT_Protector);
        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
        final boolean[] zArr = new boolean[strArr.length];
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44431(strArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.᩻֫ᩳ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                int i2 = ActivityC0814.f2971;
                zArr[i] = z;
            }
        });
        final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۜ֫ᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC0814.m3054(this.f19971, zArr, strArr, dialogInterfaceC0206M19253);
            }
        });
        return true;
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        m3058();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m3058() {
        if (this.f2977) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ֫ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC0814.f2971;
                    new C3637(this.f52231, true).m20274();
                }
            });
            c19258.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0081(1, this));
            c19258.m44438();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        f2970.mo23552();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent(this, (Class<?>) ActivityC7327.class);
        C7870 c7870 = (C7870) this.f2973.get(this.f2975.get(i));
        C11003.requireNonNull(c7870);
        intent.setData(c7870.m21154().m36522());
        startActivity(intent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3054(final ActivityC0814 activityC0814, boolean[] zArr, String[] strArr, DialogInterfaceC0206 dialogInterfaceC0206) {
        HashMap map = activityC0814.f2973;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            if (zArr[i3]) {
                if (i == -1) {
                    i = i3;
                } else {
                    if (i2 != -1) {
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    }
                    i2 = i3;
                }
            }
        }
        if (i == -1 || i2 == -1) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        final C7870<C14925> c7870 = (C7870) map.get(strArr[i]);
        C11003.requireNonNull(c7870);
        final C7870<C14925> c7871 = (C7870) map.get(strArr[i2]);
        C11003.requireNonNull(c7871);
        HashMap map2 = new HashMap();
        for (C14925 c14925 : c7870) {
            C10693 c10693 = new C10693(c14925.f45501, c14925.f45504);
            String str = c14925.f45505;
            if (str == null) {
                str = c14925.f45502;
            }
            map2.put(c10693, new C5048(str));
        }
        for (C14925 c14926 : c7871) {
            C5048 c5048 = (C5048) map2.get(new C10693(c14926.f45501, c14926.f45504));
            if (c5048 != null) {
                String str2 = c14926.f45505;
                if (str2 == null) {
                    str2 = c14926.f45502;
                }
                c5048.f15878 = str2;
            }
        }
        final C5048[] c5048Arr = (C5048[]) C5378.stream(map2.values()).filter(new C20571()).toArray(new C9282());
        if (c5048Arr.length == 0) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        dialogInterfaceC0206.dismiss();
        C19258 c19258BuildDialog = activityC0814.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(c7870.m21155() + " > " + c7871.m21155());
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        final DialogInterfaceC0206 dialogInterfaceC0206M16343 = C5834.m16343(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final boolean[] zArr2 = {false};
        final int i4 = 1;
        dialogInterfaceC0206M16343.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.۟᩹᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                Serializable serializable = c7870;
                Object obj = c7871;
                Object obj2 = dialogInterfaceC0206M16343;
                Object obj3 = zArr2;
                switch (i5) {
                    case 0:
                        C12002 c12002 = (C12002) obj3;
                        C21236 c21236 = (C21236) serializable;
                        AbstractC21294 abstractC21294 = C19883.f64184;
                        c12002.f35932 = abstractC21294.mo7431();
                        c12002.f35934 = EnumC6357.m17652(abstractC21294);
                        ((ImageView) obj2).setImageBitmap(((InterfaceC14760) obj).mo32433(c12002));
                        if (c21236.mo48205()) {
                            c21236.m48206();
                            ((DialogInterfaceC0206) c21236.mo15808()).m1441(false);
                        }
                        break;
                    default:
                        boolean[] zArr3 = (boolean[]) obj3;
                        DialogInterfaceC0206 dialogInterfaceC0207 = (DialogInterfaceC0206) obj2;
                        C7870 c7872 = (C7870) obj;
                        C7870 c7873 = (C7870) serializable;
                        int i6 = ActivityC0814.f2971;
                        boolean z = zArr3[0];
                        zArr3[0] = !z;
                        if (!z) {
                            dialogInterfaceC0207.m1440(c7872.m21155() + " > " + c7873.m21155());
                        } else {
                            dialogInterfaceC0207.m1440(c7873.m21155() + " > " + c7872.m21155());
                        }
                        break;
                }
            }
        });
        dialogInterfaceC0206M16343.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۡ֫ᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = ActivityC0814.f2971;
                dialogInterfaceC0206M16343.dismiss();
                new C18454(this.f26197, c5048Arr, zArr2);
            }
        });
    }
}
