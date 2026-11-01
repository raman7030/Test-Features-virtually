package p067l;

import android.view.ViewGroup;
import android.widget.CheckBox;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3896 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f8443;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC17043 f8444;

    /* JADX INFO: renamed from: ܳ */
    public final C18107 f8445;

    /* JADX INFO: renamed from: ܽ */
    public final List f8446;

    /* JADX INFO: renamed from: ܿ */
    public final C12574 f8447;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f8448;

    public C3896(C18107 c18107, List list) {
        this.f8445 = c18107;
        this.f8447 = (C12574) c18107.m41270();
        this.f8446 = list;
        boolean z = false;
        this.f8448 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC19370.isDirectory() && !interfaceC19370.mo39144()) {
                z = true;
                break;
            }
        }
        this.f8443 = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX INFO: renamed from: ֫ */
    public final void m7703(RunnableC15965 runnableC15965) {
        List list = this.f8446;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C12574 c12574 = this.f8447;
        String strM28981 = c12574.m28981();
        AbstractC17043 abstractC17043M42109 = C18524.m42109(strM28981, new String[0]);
        this.f8444 = abstractC17043M42109;
        boolean zMo29985 = abstractC17043M42109.mo29985();
        C18107 c18107 = this.f8445;
        if (zMo29985) {
            AbstractC17043 abstractC17043M38694 = this.f8444.m38694();
            C12826.requireNonNull(abstractC17043M38694);
            if (!abstractC17043M38694.mo29985()) {
                if (!C11164.m25781()) {
                    c18107.m41282().m12257(C7050.m16203(R.string.MT_Protector, strM28981), false);
                    return;
                }
            }
        } else if (!C11164.m25781()) {
            c18107.m41282().m12257(C7050.m16203(R.string.MT_Protector, strM28981), false);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) c18107.m41282().m12252(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewGroup.findViewById(R.id.MT_Protector);
        checkBox.setChecked(true);
        checkBox2.setVisibility(8);
        boolean zM28980 = c12574.m28980();
        String strM42827 = C18794.m42827(this.f8448 ? System.currentTimeMillis() : ((C14387) list.get(0)).getTime());
        C8352 c8352 = new C8352(this, c18107.m41282(), zM28980, checkBox, viewGroup, zM28980 ? C23527.m52306(this.f8444) : null, runnableC15965);
        c8352.m33344(R.string.MT_Protector);
        c8352.m33336((CharSequence) strM42827);
        c8352.m33351(C18794.m42822());
        c8352.m33330();
        c8352.m33365(6);
        c8352.m33362(4);
        c8352.m33335(new C3817(true));
        c8352.m33352(true);
        c8352.m33368().setOnClickListener(new ViewOnClickListenerC11722(4, c8352));
        C10884.m25071(c8352.m33364());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7697(C3896 c3896, RunnableC15965 runnableC15965, long j, boolean z, C13457 c13457, boolean z2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (InterfaceC19370 interfaceC19370 : c3896.f8446) {
            String strSubstring = interfaceC19370.getPath().substring(1);
            if (interfaceC19370.isDirectory()) {
                arrayList.add(strSubstring + "/");
            } else {
                hashSet.add(strSubstring);
            }
        }
        new C9693(c3896, c13457, z2, hashSet, arrayList, z, j, hashSet2, runnableC15965).m22250();
    }
}
