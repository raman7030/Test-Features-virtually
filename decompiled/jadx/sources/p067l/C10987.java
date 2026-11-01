package p067l;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.Base64;
import bin.p000mt.plus.Main;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10987 {

    /* JADX INFO: renamed from: ֫ */
    public static final ArrayList f30432;

    /* JADX INFO: renamed from: ۧ */
    public static final C10987 f30433;

    /* JADX INFO: renamed from: ܳ */
    public static final ConcurrentMapC12768 f30434;

    /* JADX INFO: renamed from: ܽ */
    public static final SharedPreferences f30435;

    /* JADX INFO: renamed from: ܿ */
    public static final HandlerC11658 f30436;

    /* JADX INFO: renamed from: ᩳ */
    public static final C7350 f30437;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֡ */
    public final synchronized void m25340() {
        f30436.removeMessages(0);
        try {
            try {
                C11996 c11996 = new C11996();
                c11996.writeInt(1647457332);
                ArrayList<C8975> arrayList = f30432;
                c11996.mo15113(arrayList.size());
                for (C8975 c8975 : arrayList) {
                    c11996.m27444(c8975.m20746());
                    if (c8975.m20741()) {
                        c11996.mo15113(0);
                    } else {
                        c11996.mo15113(c8975.m20749().size());
                        Iterator it = c8975.m20749().iterator();
                        while (it.hasNext()) {
                            ((C18362) it.next()).m41817(c11996);
                        }
                    }
                }
                byte[] bArrM27464 = c11996.m27464();
                ApplicationC21448.f67649.edit().mo27877("bookmarks_data_new", bArrM27464).apply();
                C4081.m8187(C10987.class, 1000L, new RunnableC15902(1, bArrM27464));
            } catch (IOException e) {
                Main mainM38753 = C17127.m38753();
                if (mainM38753 != null) {
                    mainM38753.m12259(e, (DialogInterface.OnDismissListener) null);
                }
            }
        } catch (ConcurrentModificationException unused) {
            f30436.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private final synchronized void m25374() {
        try {
            Iterator it = f30432.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ArrayList arrayListM20749 = ((C8975) it.next()).m20749();
                ArrayList<C18362> arrayList = new ArrayList();
                for (Object obj : arrayListM20749) {
                    if (((C18362) obj).m41834() != null) {
                        arrayList.add(obj);
                    }
                }
                for (C18362 c18362 : arrayList) {
                    C19033 c19033M41834 = c18362.m41834();
                    C13045.m29861(c19033M41834);
                    AbstractC5769 abstractC5769M33131 = C14486.m33131(c19033M41834.m43234());
                    if (abstractC5769M33131 == null) {
                        abstractC5769M33131 = C14486.m33115(c19033M41834.m43232());
                    }
                    if (abstractC5769M33131 != null && (abstractC5769M33131.f14161 != c19033M41834.m43234() || !C13045.m29864((Object) abstractC5769M33131.mo8538(), (Object) c19033M41834.m43232()))) {
                        c18362.m41819(c19033M41834.m43233(abstractC5769M33131));
                        System.out.println((Object) ("fix " + c18362.m41824() + " > " + abstractC5769M33131.getName() + " " + abstractC5769M33131.mo8543()));
                        z = true;
                    }
                }
            }
            if (z) {
                m25340();
            }
        } catch (ConcurrentModificationException unused) {
            C7050.m16206(200L, new RunnableC14597());
        }
    }

    static {
        Object next;
        Object next2;
        C10987 c10987 = new C10987();
        f30433 = c10987;
        ArrayList arrayList = new ArrayList();
        f30432 = arrayList;
        SharedPreferences sharedPreferences = C7050.m16232().getSharedPreferences("bookmarks", 0);
        f30435 = sharedPreferences;
        f30437 = new C7350();
        f30434 = new ConcurrentMapC12768();
        f30436 = new HandlerC11658();
        C14486.m33120(new C6551());
        if (ApplicationC21448.f67649.contains("bookmarks_data_new") || sharedPreferences.contains("backup")) {
            if (!m25366(ApplicationC21448.f67649.mo20201("bookmarks_data_new", (byte[]) null))) {
                try {
                    byte[] bArrDecode = Base64.decode(sharedPreferences.getString("backup", ""), 0);
                    int i = C6054.f15203;
                    byte[] bArrM13644 = C6054.m13644(bArrDecode, bArrDecode.length);
                    if (m25366(bArrM13644)) {
                        ApplicationC21448.f67649.edit().mo27877("bookmarks_data_new", bArrM13644).apply();
                    }
                } catch (Exception e) {
                    Main mainM38753 = C17127.m38753();
                    if (mainM38753 != null) {
                        mainM38753.m12259(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            }
        } else if (ApplicationC21448.f67649.contains("bookmarks_data")) {
            C8975 c8975 = new C8975(null);
            arrayList.add(c8975);
            byte[] bArrMo20201 = ApplicationC21448.f67649.mo20201("bookmarks_data", (byte[]) null);
            if (bArrMo20201 != null && bArrMo20201.length >= 6) {
                C14677 c14677 = new C14677(bArrMo20201);
                if (c14677.readInt() == 1647457332) {
                    int iM33581 = c14677.m33581();
                    for (int i2 = 0; i2 < iM33581; i2++) {
                        c8975.m20749().add(new C18362(c14677.m33593(), c14677.m33593()));
                    }
                    ApplicationC21448.f67649.edit().remove("bookmarks_data");
                    c10987.m25340();
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C8975("\rH\rI\rS\r"));
            arrayList.add(new C8975(null));
        } else {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C8975) next).m20741());
            if (((C8975) next) == null) {
                arrayList.add(0, new C8975("\rH\rI\rS\r"));
                C10027 c10027 = C10027.f27775;
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((C8975) next2).m20751());
            if (((C8975) next2) == null) {
                arrayList.add(new C8975(null));
            }
        }
        String string = sharedPreferences.getString("history", null);
        if (string != null) {
            try {
                C8975 c8975M25355 = m25355();
                C14677 c14677M33572 = C14677.m33572(Base64.decode(string, 0));
                C23395.m52060((InterfaceC21384) c14677M33572, 1647457332);
                int iM33582 = c14677M33572.m33581();
                c8975M25355.m20749().clear();
                for (int i3 = 0; i3 < iM33582; i3++) {
                    c8975M25355.m20749().add(C4281.m8692(c14677M33572));
                }
            } catch (Exception unused) {
            }
        }
        f30437.mo4062(C10027.f27775);
        m25375();
    }

    /* JADX INFO: renamed from: ܳ */
    public static final void m25367() {
        synchronized (f30433) {
            f30436.removeMessages(1);
            try {
                C8975 c8975M25355 = m25355();
                C11996 c11996 = new C11996();
                c11996.writeInt(1647457332);
                c11996.mo15113(c8975M25355.m20749().size());
                Iterator it = c8975M25355.m20749().iterator();
                while (it.hasNext()) {
                    ((C18362) it.next()).m41817(c11996);
                }
                f30435.edit().putString("history", Base64.encodeToString(c11996.m27447(), 0)).apply();
            } catch (IOException e) {
                Main mainM38753 = C17127.m38753();
                if (mainM38753 != null) {
                    mainM38753.m12259(e, (DialogInterface.OnDismissListener) null);
                }
            } catch (ConcurrentModificationException unused) {
                f30436.sendEmptyMessage(1);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25348(String str, C19033 c19033) {
        C13045.m29867(str, MotionUtils.EASING_TYPE_PATH);
        if (ApplicationC21448.f67649.getBoolean("eph", true)) {
            if (str.length() > 1 && C5235.m11298(str, "/", false)) {
                str = str.substring(0, str.length() - 1);
                C13045.m29865(str, "substring(...)");
            }
            String strM26402 = C11419.m26402(str);
            C13045.m29865(strM26402, "getFriendlyName(...)");
            C18362 c18362 = new C18362(strM26402, str);
            c18362.m41819(c19033);
            C8975 c8975M25355 = m25355();
            synchronized (c8975M25355.m20749()) {
                ArrayList arrayListM20749 = c8975M25355.m20749();
                C13045.m29867(arrayListM20749, "<this>");
                if (c18362.equals(arrayListM20749.isEmpty() ? null : arrayListM20749.get(0))) {
                    return;
                }
                c8975M25355.m20749().remove(c18362);
                c8975M25355.m20749().add(0, c18362);
                while (c8975M25355.m20749().size() > 80) {
                    c8975M25355.m20749().remove(c8975M25355.m20749().size() - 1);
                }
                C10027 c10027 = C10027.f27775;
                f30437.mo4062(C10027.f27775);
                f30433.m25357();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25349(String str, C19033 c19033, int i) {
        C13045.m29867(str, MotionUtils.EASING_TYPE_PATH);
        if (str.length() > 1 && C5235.m11298(str, "/", false)) {
            str = str.substring(0, str.length() - 1);
            C13045.m29865(str, "substring(...)");
        }
        String strM26402 = C11419.m26402(str);
        C13045.m29865(strM26402, "getFriendlyName(...)");
        C18362 c18362 = new C18362(strM26402, str);
        c18362.m41819(c19033);
        m25346(i, C4187.m8475(c18362));
        f30437.mo4062(C10027.f27775);
        f30433.m25340();
    }

    /* JADX INFO: renamed from: ۧ */
    public static final C18362 m25362(String str, C19033 c19033) {
        C13045.m29867(str, MotionUtils.EASING_TYPE_PATH);
        if (str.length() > 1 && C5235.m11298(str, "/", false)) {
            str = str.substring(0, str.length() - 1);
            C13045.m29865(str, "substring(...)");
        }
        String strM26402 = C11419.m26402(str);
        C13045.m29865(strM26402, "getFriendlyName(...)");
        C18362 c18362 = new C18362(strM26402, str);
        c18362.m41819(c19033);
        return c18362;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25341() {
        f30433.m25374();
        m25375();
    }

    /* JADX INFO: renamed from: ܺ */
    public static final C8975 m25368() {
        for (C8975 c8975 : f30432) {
            if (c8975.m20751()) {
                return c8975;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۖ */
    public static final C8975 m25355() {
        for (C8975 c8975 : f30432) {
            if (c8975.m20741()) {
                return c8975;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۡ */
    public static final List m25359() {
        List listUnmodifiableList = C21562.unmodifiableList(f30432);
        C13045.m29865(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۢ */
    public static final C22387[] m25360() {
        ArrayList<C8975> arrayList = f30432;
        ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
        int i = 0;
        for (C8975 c8975 : arrayList) {
            int i2 = i + 1;
            if (!c8975.m20741()) {
                arrayList2.add(new C22387(c8975, i));
            }
            i = i2;
        }
        return (C22387[]) arrayList2.toArray(new C22387[0]);
    }

    /* JADX INFO: renamed from: ۘ */
    public static final int m25356() {
        return f30432.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public static final C8975 m25361(int i) {
        Object obj = f30432.get(i);
        C13045.m29865(obj, "get(...)");
        return (C8975) obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public static final boolean m25365(String str) {
        Iterator it = f30432.iterator();
        C13045.m29865(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            C13045.m29865(next, "next(...)");
            if (str.equals(((C8975) next).m20748())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25345(int i, String str) {
        ((C8975) f30432.get(i)).m20738(str);
        f30437.mo4062(C10027.f27775);
        f30433.m25340();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25347(String str) {
        f30432.add(new C8975(str));
        f30437.mo4062(C10027.f27775);
        f30433.m25340();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25343(int i, int i2) {
        Collections.swap(f30432, i, i2);
        f30437.mo4062(C10027.f27775);
        f30433.m25340();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25342(int i) {
        ArrayList arrayList = f30432;
        Object obj = arrayList.get(i);
        C13045.m29865(obj, "get(...)");
        C8975 c8975 = (C8975) obj;
        if (!c8975.m20751()) {
            c8975.m20741();
        }
        m25368().m20749().addAll(c8975.m20749());
        arrayList.remove(i);
        f30437.mo4062(C10027.f27775);
        f30433.m25340();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static final void m25375() {
        C4081.f8987.execute(new RunnableC5210());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25353(C8975 c8975, ArrayList arrayList) {
        synchronized (c8975.m20749()) {
            c8975.m20749().removeAll(arrayList);
        }
        f30437.mo4062(C10027.f27775);
        f30433.m25357();
    }

    /* JADX INFO: renamed from: ۜ */
    public static final void m25358() {
        C8975 c8975M25355 = m25355();
        synchronized (c8975M25355.m20749()) {
            c8975M25355.m20749().clear();
            C10027 c10027 = C10027.f27775;
        }
        f30437.mo4062(C10027.f27775);
        f30433.m25357();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX INFO: renamed from: ֫ */
    public static void m25346(int i, List list) {
        C8975 c8975M25368;
        if (i >= 0) {
            ArrayList arrayList = f30432;
            if (i < arrayList.size() && !((C8975) arrayList.get(i)).m20741()) {
                Object obj = arrayList.get(i);
                C13045.m29861(obj);
                c8975M25368 = (C8975) obj;
            } else {
                c8975M25368 = m25368();
            }
        } else {
            c8975M25368 = m25368();
        }
        if (ApplicationC21448.f67650.getBoolean("bookmark_add_to_top", true)) {
            c8975M25368.m20744(list);
        } else {
            c8975M25368.m20739(list);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25344(int i, int i2, int i3) {
        ArrayList arrayList = f30432;
        ((C8975) arrayList.get(i)).m20741();
        ((C8975) arrayList.get(i2)).m20741();
        Object objRemove = ((C8975) arrayList.get(i)).m20749().remove(i3);
        C13045.m29865(objRemove, "removeAt(...)");
        ((C8975) arrayList.get(i2)).m20749().add((C18362) objRemove);
        f30437.mo4062(C10027.f27775);
        f30433.m25340();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25351(ArrayList arrayList, int i) {
        m25346(i, arrayList);
        f30437.mo4062(C10027.f27775);
        f30433.m25340();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25363() {
        f30433.m25374();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25352(AbstractActivityC5549 abstractActivityC5549, InterfaceC3326 interfaceC3326) {
        f30437.m4066(abstractActivityC5549, interfaceC3326);
    }

    /* JADX INFO: renamed from: ᩵ */
    public static final void m25373() {
        try {
            Iterator it = f30432.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C8975) it.next()).m20749().iterator();
                while (it2.hasNext()) {
                    ((C18362) it2.next()).m41825();
                }
            }
        } catch (ConcurrentModificationException unused) {
            C7050.m16206(200L, new RunnableC13927());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m25366(byte[] bArr) {
        ArrayList arrayList = f30432;
        if (bArr != null && bArr.length >= 6) {
            C14677 c14677 = new C14677(bArr);
            try {
                C23395.m52060((InterfaceC21384) c14677, 1647457332);
                int iM33581 = c14677.m33581();
                for (int i = 0; i < iM33581; i++) {
                    String strM33590 = c14677.m33590();
                    int iM33582 = c14677.m33581();
                    C8975 c8975 = new C8975(strM33590);
                    arrayList.add(c8975);
                    for (int i2 = 0; i2 < iM33582; i2++) {
                        c8975.m20749().add(C4281.m8692(c14677));
                    }
                }
                return true;
            } catch (Throwable th) {
                arrayList.clear();
                Main mainM38753 = C17127.m38753();
                if (mainM38753 != null) {
                    mainM38753.m12259(th, (DialogInterface.OnDismissListener) null);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ */
    public static final void m25372() {
        HandlerC11658 handlerC11658 = f30436;
        handlerC11658.removeMessages(0);
        handlerC11658.sendEmptyMessageDelayed(0, 2000L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25354(byte[] bArr) {
        SharedPreferences.Editor editorEdit = f30435.edit();
        int i = C6054.f15203;
        editorEdit.putString("backup", Base64.encodeToString(C6054.m13640(0, bArr.length, bArr), 0)).apply();
    }

    /* JADX INFO: renamed from: ۚ */
    private final void m25357() {
        HandlerC11658 handlerC11658 = f30436;
        handlerC11658.removeMessages(1);
        handlerC11658.sendEmptyMessageDelayed(1, 1000L);
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m25364(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(C4187.m8472((Iterable) arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m25362((String) it.next(), (C19033) null));
        }
        m25346(i, arrayList2);
        f30437.mo4062(C10027.f27775);
        f30433.m25340();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25350(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && !((C8975) it.next()).m20751()) {
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && !((C8975) it2.next()).m20741()) {
            }
        }
        ArrayList arrayList2 = f30432;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        f30433.m25340();
        f30437.mo4062(C10027.f27775);
    }
}
