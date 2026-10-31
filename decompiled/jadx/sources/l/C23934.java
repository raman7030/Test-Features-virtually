package l;

import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes.dex */
public final class C23934 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("zip") && !c2450.m7923();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        int iLastIndexOf;
        c2450.m7907("zip");
        C10738 c10738 = (C10738) c2450.m7922();
        String strM26937 = c10738.m26937();
        AbstractC15440 abstractC15440M39866 = C16999.m39866(strM26937, new String[0]);
        if (c10738.m26939()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (abstractC15440M39866.mo27924()) {
            AbstractC15440 abstractC15440M36536 = abstractC15440M39866.m36536();
            C11003.requireNonNull(abstractC15440M36536);
            if (!abstractC15440M36536.mo27924()) {
                if (!C9255.m23780()) {
                    c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
                    return;
                }
            }
        } else if (!C9255.m23780()) {
            c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
            return;
        }
        if (c2450.m7918() != 1) {
            ArrayList arrayList = new ArrayList(c2450.m7909());
            Main mainM7917 = c2450.m7917();
            C10738 c10739 = (C10738) c2450.m7922();
            AbstractC15440 abstractC15440M39867 = C16999.m39866(c10739.m26937(), new String[0]);
            boolean zM26936 = c10739.m26936();
            String strM49978 = zM26936 ? C22263.m49978(abstractC15440M39867) : null;
            C16878 c16878 = new C16878(this, mainM7917, arrayList, c2450, arrayList, mainM7917, c10739, zM26936, strM49978, abstractC15440M39867);
            c16878.m15027();
            if (zM26936) {
                C10025.m25194(c2450.m7917(), c16878.m15029(), strM49978);
                C8960.m23097(c16878.m15031());
                return;
            }
            return;
        }
        C10738 c107310 = (C10738) c2450.m7922();
        AbstractC15440 abstractC15440M39868 = C16999.m39866(c107310.m26937(), new String[0]);
        InterfaceC17889 interfaceC17889M7913 = c2450.m7913();
        boolean zIsDirectory = interfaceC17889M7913.isDirectory();
        boolean zM26937 = c107310.m26936();
        String strM49979 = zM26937 ? C22263.m49978(abstractC15440M39868) : null;
        String strSubstring = interfaceC17889M7913.getPath().substring(1);
        int length = interfaceC17889M7913.getParent().length() - 1;
        int length2 = (zIsDirectory || (iLastIndexOf = interfaceC17889M7913.getName().lastIndexOf(46)) == -1) ? strSubstring.length() : iLastIndexOf + length;
        int i = length2;
        C7769 c7769 = new C7769(this, c2450.m7917(), strSubstring, interfaceC17889M7913, c107310.mo6020().m44393(), c2450, zM26937, strM49979, abstractC15440M39868, zIsDirectory);
        c7769.m31258(R.string.MT_Protector);
        c7769.m31250((CharSequence) strSubstring);
        c7769.m31279(6);
        c7769.m31244();
        c7769.m31246(length, i);
        c7769.m31247(android.R.string.paste, new ViewOnClickListenerC7935(2, c7769), new ViewOnLongClickListenerC23553(c7769));
        c7769.m31266(true);
        if (zM26937) {
            FrameLayout frameLayoutM31286 = c7769.m31286();
            frameLayoutM31286.setVisibility(0);
            frameLayoutM31286.setPadding(0, C11266.m27878(4.0f), 0, 0);
            Main mainM39056 = c2450.m7921().m39056();
            CheckBox checkBox = (CheckBox) mainM39056.m10216(R.layout.MT_Protector);
            frameLayoutM31286.addView(checkBox);
            C10025.m25194(mainM39056, checkBox, strM49979);
            C8960.m23097(c7769.m31278());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52715(final C23934 c23934, RadioButton[] radioButtonArr, int i, String str, String str2, List list, boolean z, Main main, String str3, final AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849, final C2450 c2450, final AbstractC15440 abstractC15440) {
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
            ApplicationC20075.f65008.edit().mo25852((byte) i2, "rcoz").apply();
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (i2 == 0) {
            arrayList.add(new C18290(str, str2, false, false));
            arrayList.add(new C18290(str2, str, false, true));
        } else if (i2 == 1) {
            arrayList2.add(str);
            arrayList.add(new C18290(str2, str, false, true));
        } else if (i2 == 2) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((C3545) it.next()).getName());
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
            arrayList.add(new C18290(str, strConcat, false, false));
            arrayList.add(new C18290(str2, str, false, true));
        }
        if (z) {
            C10025.m25197(new InterfaceC12846() { // from class: l.᩺᩹᩻
                @Override // l.InterfaceC12846
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC12846
                /* JADX INFO: renamed from: ֫ */
                public final void mo3776(C11667 c11667, boolean z2) {
                    C23934.m52714(this.f74783, abstractDialogInterfaceOnClickListenerC12849, c2450, abstractC15440, arrayList, arrayList2, c11667, z2);
                }

                @Override // l.InterfaceC12846
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ boolean mo3777(Exception exc) {
                    return false;
                }
            }, main, str3);
        } else {
            abstractDialogInterfaceOnClickListenerC12849.m31262();
            m52712(c2450, abstractC15440, "", arrayList, arrayList2, null, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52714(C23934 c23934, AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849, C2450 c2450, AbstractC15440 abstractC15440, ArrayList arrayList, ArrayList arrayList2, C11667 c11667, boolean z) {
        abstractDialogInterfaceOnClickListenerC12849.m31262();
        m52712(c2450, abstractC15440, "", arrayList, arrayList2, c11667, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52712(C2450 c2450, AbstractC15440 abstractC15440, String str, List list, List list2, C11667 c11667, boolean z) {
        C10130 c10130 = new C10130();
        c10130.m25439(str);
        c10130.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18290 c18290 = (C18290) it.next();
            c10130.m25439(c18290.f56867);
            c10130.m25439(c18290.f56866);
            byte b = c18290.f56864 ? (byte) 1 : (byte) 0;
            if (c18290.f56865) {
                b = (byte) (b | 2);
            }
            c10130.writeByte(b);
        }
        c10130.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c10130.m25439((String) it2.next());
        }
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C14761.class);
        c0994.m3474("zipPath", abstractC15440.mo23554());
        c0994.m3476(e.m, c10130.m25427());
        c0994.m3486(c2450);
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z);
        c0994.m3469();
    }
}
