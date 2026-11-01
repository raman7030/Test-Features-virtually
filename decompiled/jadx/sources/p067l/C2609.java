package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2609 {
    /* JADX INFO: renamed from: ֫ */
    public static void m3918(ActivityC8645 activityC8645) {
        boolean[] zArr = new boolean[activityC8645.f23213.f78320.mo5207()];
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = activityC8645.f23213.f78314.mo20696().iterator();
            while (it.hasNext()) {
                zArr[((C20337) it.next()).mo50213()] = true;
            }
            for (C4914 c4914 : activityC8645.f23213.f78320.mo5201()) {
                if (c4914 != activityC8645.f23213.f78314) {
                    C20716 c20716 = null;
                    for (C20337 c20337 : c4914.mo20696()) {
                        if (!zArr[c20337.mo50213()]) {
                            if (c20716 == null) {
                                c20716 = new C20716(c4914);
                                arrayList.add(c20716);
                            }
                            c20716.f63950.add(c20337);
                        }
                    }
                }
            }
            if (arrayList.size() == 0) {
                new ViewOnClickListenerC9986(activityC8645).m23300();
                return;
            }
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = ((C20716) arrayList.get(i)).toString();
            }
            m3919(activityC8645, strArr, arrayList);
        } catch (Throwable th) {
            activityC8645.m12259(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3919(final ActivityC8645 activityC8645, final String[] strArr, final ArrayList arrayList) {
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC8645);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46724(strArr, new DialogInterface.OnClickListener() { // from class: l.᩷ۜᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final ArrayList arrayList2 = arrayList;
                final C20716 c20716 = (C20716) arrayList2.get(i2);
                final boolean[] zArr = new boolean[c20716.f63950.size()];
                final ActivityC8645 activityC8646 = activityC8645;
                View viewM12252 = activityC8646.m12252(R.layout.MT_Protector);
                ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
                C7040.m16181(listView);
                listView.setDivider(null);
                C5963 c5963 = new C5963(c20716, activityC8646, zArr);
                listView.setAdapter((ListAdapter) c5963);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۡۜᩳ
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                        boolean[] zArr2 = zArr;
                        boolean z = zArr2[i3];
                        zArr2[i3] = !z;
                        view.setBackgroundColor(!z ? C23223.f72997 : 0);
                    }
                });
                final String[] strArr2 = strArr;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ܺۜᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i3) {
                        C2609.m3920(activityC8646, zArr, c20716, strArr2, arrayList2, i3);
                    }
                };
                int i3 = DialogInterfaceC2564.f4230;
                C20671 c20672 = new C20671(activityC8646);
                c20672.m46715(viewM12252);
                c20672.m46734(R.string.MT_Protector, onClickListener);
                c20672.m46736(R.string.MT_Protector, onClickListener);
                c20672.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20672.m46732().m3859().setOnClickListener(new ViewOnClickListenerC4622(0, zArr, c5963));
            }
        });
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۜᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new ViewOnClickListenerC9986(activityC8645).m23300();
            }
        });
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3920(ActivityC8645 activityC8645, boolean[] zArr, C20716 c20716, String[] strArr, ArrayList arrayList, int i) {
        if (i == -1) {
            int size = activityC8645.f23213.f78325.size();
            boolean z = false;
            for (int i2 = 0; i2 < zArr.length; i2++) {
                if (zArr[i2]) {
                    C20337 c20337 = (C20337) c20716.f63950.get(i2);
                    try {
                        C20337 c20337M10438 = activityC8645.f23213.f78314.m10438(c20337.mo50213());
                        c20337M10438.m45911((InterfaceC22528) c20337);
                        activityC8645.f23213.f78325.add(c20337M10438);
                        z = true;
                    } catch (Exception e) {
                        activityC8645.m12259(e, (DialogInterface.OnDismissListener) null);
                        z = true;
                    }
                }
            }
            if (z) {
                activityC8645.f23213.f78333 = true;
                activityC8645.f23216.notifyDataSetChanged();
                activityC8645.f23214.setSelection(size);
                return;
            }
            return;
        }
        m3919(activityC8645, strArr, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m3917(int i) {
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        String string = Float.toString(fIntBitsToFloat);
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return string;
        }
        BigDecimal bigDecimal = new BigDecimal(string);
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toString();
    }
}
