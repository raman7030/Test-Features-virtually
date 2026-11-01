package p067l;

import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes.dex */
public final class C25116 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964("zip") && !c4697.m9971();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        int iLastIndexOf;
        c4697.m9955("zip");
        C12574 c12574 = (C12574) c4697.m9970();
        String strM28981 = c12574.m28981();
        AbstractC17043 abstractC17043M42109 = C18524.m42109(strM28981, new String[0]);
        if (c12574.m28983()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (abstractC17043M42109.mo29985()) {
            AbstractC17043 abstractC17043M38694 = abstractC17043M42109.m38694();
            C12826.requireNonNull(abstractC17043M38694);
            if (!abstractC17043M38694.mo29985()) {
                if (!C11164.m25781()) {
                    c4697.m9965().m12257(C7050.m16203(R.string.MT_Protector, strM28981), false);
                    return;
                }
            }
        } else if (!C11164.m25781()) {
            c4697.m9965().m12257(C7050.m16203(R.string.MT_Protector, strM28981), false);
            return;
        }
        if (c4697.m9966() != 1) {
            ArrayList arrayList = new ArrayList(c4697.m9957());
            Main mainM9965 = c4697.m9965();
            C12574 c12575 = (C12574) c4697.m9970();
            AbstractC17043 abstractC17043M421010 = C18524.m42109(c12575.m28981(), new String[0]);
            boolean zM28980 = c12575.m28980();
            String strM52306 = zM28980 ? C23527.m52306(abstractC17043M421010) : null;
            C18410 c18410 = new C18410(this, mainM9965, arrayList, c4697, arrayList, mainM9965, c12575, zM28980, strM52306, abstractC17043M421010);
            c18410.m16937();
            if (zM28980) {
                C11896.m27211(c4697.m9965(), c18410.m16939(), strM52306);
                C10884.m25071(c18410.m16941());
                return;
            }
            return;
        }
        C12574 c12576 = (C12574) c4697.m9970();
        AbstractC17043 abstractC17043M421011 = C18524.m42109(c12576.m28981(), new String[0]);
        InterfaceC19370 interfaceC19370M9961 = c4697.m9961();
        boolean zIsDirectory = interfaceC19370M9961.isDirectory();
        boolean zM28981 = c12576.m28980();
        String strM52307 = zM28981 ? C23527.m52306(abstractC17043M421011) : null;
        String strSubstring = interfaceC19370M9961.getPath().substring(1);
        int length = interfaceC19370M9961.getParent().length() - 1;
        int length2 = (zIsDirectory || (iLastIndexOf = interfaceC19370M9961.getName().lastIndexOf(46)) == -1) ? strSubstring.length() : iLastIndexOf + length;
        int i = length2;
        C9753 c9753 = new C9753(this, c4697.m9965(), strSubstring, interfaceC19370M9961, c12576.mo8217().m46687(), c4697, zM28981, strM52307, abstractC17043M421011, zIsDirectory);
        c9753.m33344(R.string.MT_Protector);
        c9753.m33336((CharSequence) strSubstring);
        c9753.m33365(6);
        c9753.m33330();
        c9753.m33332(length, i);
        c9753.m33333(android.R.string.paste, new ViewOnClickListenerC9910(2, c9753), new ViewOnLongClickListenerC24753(c9753));
        c9753.m33352(true);
        if (zM28981) {
            FrameLayout frameLayoutM33372 = c9753.m33372();
            frameLayoutM33372.setVisibility(0);
            frameLayoutM33372.setPadding(0, C13076.m29939(4.0f), 0, 0);
            Main mainM41282 = c4697.m9969().m41282();
            CheckBox checkBox = (CheckBox) mainM41282.m12252(R.layout.MT_Protector);
            frameLayoutM33372.addView(checkBox);
            C11896.m27211(mainM41282, checkBox, strM52307);
            C10884.m25071(c9753.m33364());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55121(final C25116 c25116, RadioButton[] radioButtonArr, int i, String str, String str2, List list, boolean z, Main main, String str3, final AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580, final C4697 c4697, final AbstractC17043 abstractC17043) {
        String str4;
        int i2 = 0;
        while (true) {
            if (i2 >= radioButtonArr.length) {
                i2 = 0;
                break;
            } else if (radioButtonArr[i2].isChecked()) {
                break;
            } else {
                i2++;
            }
        }
        if (i != i2) {
            ApplicationC21448.f67649.edit().mo27874((byte) i2, "rcoz").apply();
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (i2 == 0) {
            arrayList.add(new C19752(str, str2, false, false));
            arrayList.add(new C19752(str2, str, false, true));
        } else if (i2 == 1) {
            arrayList2.add(str);
            arrayList.add(new C19752(str2, str, false, true));
        } else if (i2 == 2) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((C5738) it.next()).getName());
            }
            String strConcat = str.concat(".bak");
            if (hashSet.contains(strConcat)) {
                int i3 = 1;
                while (true) {
                    str4 = str + " (" + i3 + ").bak";
                    if (!hashSet.contains(str4)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                strConcat = str4;
            }
            arrayList.add(new C19752(str, strConcat, false, false));
            arrayList.add(new C19752(str2, str, false, true));
        }
        if (z) {
            C11896.m27214(new InterfaceC14577() { // from class: l.᩺᩹᩻
                @Override // p067l.InterfaceC14577
                public final /* synthetic */ void onCanceled() {
                }

                @Override // p067l.InterfaceC14577
                /* JADX INFO: renamed from: ֫ */
                public final void mo6049(C13457 c13457, boolean z2) {
                    C25116.m55120(this.f77528, abstractDialogInterfaceOnClickListenerC14580, c4697, abstractC17043, arrayList, arrayList2, c13457, z2);
                }

                @Override // p067l.InterfaceC14577
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ boolean mo6050(Exception exc) {
                    return false;
                }
            }, main, str3);
        } else {
            abstractDialogInterfaceOnClickListenerC14580.m33348();
            m55118(c4697, abstractC17043, "", arrayList, arrayList2, null, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m55120(C25116 c25116, AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580, C4697 c4697, AbstractC17043 abstractC17043, ArrayList arrayList, ArrayList arrayList2, C13457 c13457, boolean z) {
        abstractDialogInterfaceOnClickListenerC14580.m33348();
        m55118(c4697, abstractC17043, "", arrayList, arrayList2, c13457, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55118(C4697 c4697, AbstractC17043 abstractC17043, String str, List list, List list2, C13457 c13457, boolean z) {
        C11996 c11996 = new C11996();
        c11996.m27459(str);
        c11996.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19752 c19752 = (C19752) it.next();
            c11996.m27459(c19752.f60085);
            c11996.m27459(c19752.f60084);
            byte b = c19752.f60082 ? (byte) 1 : (byte) 0;
            if (c19752.f60083) {
                b = (byte) (b | 2);
            }
            c11996.writeByte(b);
        }
        c11996.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c11996.m27459((String) it2.next());
        }
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C16398.class);
        c3313.m5777("zipPath", abstractC17043.mo25505());
        c3313.m5779(AbstractC0213e.f989m, c11996.m27447());
        c3313.m5789(c4697);
        c3313.m5775(c4697.m9965(), c13457);
        c3313.m5778("keepApkSigBlock", z);
        c3313.m5772();
    }
}
