package l;

import android.view.ViewGroup;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1607 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f5663;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f5664;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16560 f5665;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f5666;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10738 f5667;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f5668;

    public C1607(C16560 c16560, List list) {
        this.f5665 = c16560;
        this.f5667 = (C10738) c16560.m39044();
        this.f5666 = list;
        boolean z = false;
        this.f5668 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory() && !interfaceC17889.mo36978()) {
                z = true;
                break;
            }
        }
        this.f5663 = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5473(RunnableC14306 runnableC14306) {
        List list = this.f5666;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C10738 c10738 = this.f5667;
        String strM26937 = c10738.m26937();
        AbstractC15440 abstractC15440M39866 = C16999.m39866(strM26937, new String[0]);
        this.f5664 = abstractC15440M39866;
        boolean zMo27924 = abstractC15440M39866.mo27924();
        C16560 c16560 = this.f5665;
        if (zMo27924) {
            AbstractC15440 abstractC15440M36536 = this.f5664.m36536();
            C11003.requireNonNull(abstractC15440M36536);
            if (!abstractC15440M36536.mo27924()) {
                if (!C9255.m23780()) {
                    c16560.m39056().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
                    return;
                }
            }
        } else if (!C9255.m23780()) {
            c16560.m39056().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) c16560.m39056().m10216(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewGroup.findViewById(R.id.MT_Protector);
        checkBox.setChecked(true);
        checkBox2.setVisibility(8);
        boolean zM26936 = c10738.m26936();
        String strM40576 = C17283.m40576(this.f5668 ? System.currentTimeMillis() : ((C12645) list.get(0)).getTime());
        C6295 c6295 = new C6295(this, c16560.m39056(), zM26936, checkBox, viewGroup, zM26936 ? C22263.m49978(this.f5664) : null, runnableC14306);
        c6295.m31258(R.string.MT_Protector);
        c6295.m31250((CharSequence) strM40576);
        c6295.m31265(C17283.m40571());
        c6295.m31244();
        c6295.m31279(6);
        c6295.m31276(4);
        c6295.m31249(new C1524(true));
        c6295.m31266(true);
        c6295.m31282().setOnClickListener(new ViewOnClickListenerC9841(4, c6295));
        C8960.m23097(c6295.m31278());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5467(C1607 c1607, RunnableC14306 runnableC14306, long j, boolean z, C11667 c11667, boolean z2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (InterfaceC17889 interfaceC17889 : c1607.f5666) {
            String strSubstring = interfaceC17889.getPath().substring(1);
            if (interfaceC17889.isDirectory()) {
                arrayList.add(strSubstring + "/");
            } else {
                hashSet.add(strSubstring);
            }
        }
        new C7706(c1607, c11667, z2, hashSet, arrayList, z, j, hashSet2, runnableC14306).m20274();
    }
}
