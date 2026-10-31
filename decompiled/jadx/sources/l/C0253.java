package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0253 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1520(ActivityC6604 activityC6604) {
        boolean[] zArr = new boolean[activityC6604.f20336.f75574.mo2878()];
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = activityC6604.f20336.f75568.mo18746().iterator();
            while (it.hasNext()) {
                zArr[((C18906) it.next()).mo47883()] = true;
            }
            for (C2678 c2678 : activityC6604.f20336.f75574.mo2872()) {
                if (c2678 != activityC6604.f20336.f75568) {
                    C19305 c19305 = null;
                    for (C18906 c18906 : c2678.mo18746()) {
                        if (!zArr[c18906.mo47883()]) {
                            if (c19305 == null) {
                                c19305 = new C19305(c2678);
                                arrayList.add(c19305);
                            }
                            c19305.f60720.add(c18906);
                        }
                    }
                }
            }
            if (arrayList.size() == 0) {
                new ViewOnClickListenerC8015(activityC6604).m21334();
                return;
            }
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = ((C19305) arrayList.get(i)).toString();
            }
            m1521(activityC6604, strArr, arrayList);
        } catch (Throwable th) {
            activityC6604.m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1521(final ActivityC6604 activityC6604, final String[] strArr, final ArrayList arrayList) {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC6604);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44430(strArr, new DialogInterface.OnClickListener() { // from class: l.᩷ۜᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final ArrayList arrayList2 = arrayList;
                final C19305 c19305 = (C19305) arrayList2.get(i2);
                final boolean[] zArr = new boolean[c19305.f60720.size()];
                final ActivityC6604 activityC6605 = activityC6604;
                View viewM10216 = activityC6605.m10216(R.layout.MT_Protector);
                ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
                C4915.m14284(listView);
                listView.setDivider(null);
                C3782 c3782 = new C3782(c19305, activityC6605, zArr);
                listView.setAdapter((ListAdapter) c3782);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۡۜᩳ
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                        boolean[] zArr2 = zArr;
                        boolean z = zArr2[i3];
                        zArr2[i3] = !z;
                        view.setBackgroundColor(!z ? C21943.f70286 : 0);
                    }
                });
                final String[] strArr2 = strArr;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ܺۜᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i3) {
                        C0253.m1522(activityC6605, zArr, c19305, strArr2, arrayList2, i3);
                    }
                };
                int i3 = DialogInterfaceC0206.f1451;
                C19258 c19259 = new C19258(activityC6605);
                c19259.m44421(viewM10216);
                c19259.m44440(R.string.MT_Protector, onClickListener);
                c19259.m44442(R.string.MT_Protector, onClickListener);
                c19259.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19259.m44438().m1446().setOnClickListener(new ViewOnClickListenerC2371(0, zArr, c3782));
            }
        });
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۜᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new ViewOnClickListenerC8015(activityC6604).m21334();
            }
        });
        c19258.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1522(ActivityC6604 activityC6604, boolean[] zArr, C19305 c19305, String[] strArr, ArrayList arrayList, int i) {
        if (i == -1) {
            int size = activityC6604.f20336.f75579.size();
            boolean z = false;
            for (int i2 = 0; i2 < zArr.length; i2++) {
                if (zArr[i2]) {
                    C18906 c18906 = (C18906) c19305.f60720.get(i2);
                    try {
                        C18906 c18906M8392 = activityC6604.f20336.f75568.m8392(c18906.mo47883());
                        c18906M8392.m43645((InterfaceC21211) c18906);
                        activityC6604.f20336.f75579.add(c18906M8392);
                        z = true;
                    } catch (Exception e) {
                        activityC6604.m10223(e, (DialogInterface.OnDismissListener) null);
                        z = true;
                    }
                }
            }
            if (z) {
                activityC6604.f20336.f75587 = true;
                activityC6604.f20339.notifyDataSetChanged();
                activityC6604.f20337.setSelection(size);
                return;
            }
            return;
        }
        m1521(activityC6604, strArr, arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m1519(int i) {
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        String string = Float.toString(fIntBitsToFloat);
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return string;
        }
        BigDecimal bigDecimal = new BigDecimal(string);
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toString();
    }
}
