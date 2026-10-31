package l;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.Base64;
import bin.mt.plus.Main;
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
public final class C9068 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f27495;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C9068 f27496;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f27497;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final SharedPreferences f27498;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final HandlerC9774 f27499;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C5242 f27500;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final synchronized void m23394() {
        try {
            f27499.removeMessages(0);
            try {
                try {
                    C10130 c10130 = new C10130();
                    c10130.writeInt(1647457332);
                    ArrayList<C6951> arrayList = f27495;
                    c10130.mo13231(arrayList.size());
                    for (C6951 c6951 : arrayList) {
                        c10130.m25424(c6951.m18792());
                        if (c6951.m18787()) {
                            c10130.mo13231(0);
                        } else {
                            c10130.mo13231(c6951.m18795().size());
                            Iterator it = c6951.m18795().iterator();
                            while (it.hasNext()) {
                                ((C16828) it.next()).m39581(c10130);
                            }
                        }
                    }
                    byte[] bArrM25444 = c10130.m25444();
                    ApplicationC20075.f65008.edit().mo25855("bookmarks_data_new", bArrM25444).apply();
                    C1802.m5990(C9068.class, 1000L, new RunnableC14240(1, bArrM25444));
                } catch (IOException e) {
                    Main mainM36593 = C15528.m36593();
                    if (mainM36593 != null) {
                        mainM36593.m10223(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            } catch (ConcurrentModificationException unused) {
                f27499.sendEmptyMessage(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final synchronized void m23428() {
        try {
            Iterator it = f27495.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ArrayList arrayListM18795 = ((C6951) it.next()).m18795();
                ArrayList<C16828> arrayList = new ArrayList();
                for (Object obj : arrayListM18795) {
                    if (((C16828) obj).m39598() != null) {
                        arrayList.add(obj);
                    }
                }
                for (C16828 c16828 : arrayList) {
                    C17534 c17534M39598 = c16828.m39598();
                    C11233.m27799(c17534M39598);
                    AbstractC3577 abstractC3577M31047 = C12749.m31047(c17534M39598.m40974());
                    if (abstractC3577M31047 == null) {
                        abstractC3577M31047 = C12749.m31031(c17534M39598.m40972());
                    }
                    if (abstractC3577M31047 != null && (abstractC3577M31047.f11356 != c17534M39598.m40974() || !C11233.m27802((Object) abstractC3577M31047.mo6365(), (Object) c17534M39598.m40972()))) {
                        c16828.m39583(c17534M39598.m40973(abstractC3577M31047));
                        System.out.println((Object) ("fix " + c16828.m39588() + " > " + abstractC3577M31047.getName() + " " + abstractC3577M31047.mo6370()));
                        z = true;
                    }
                }
            }
            if (z) {
                m23394();
            }
        } catch (ConcurrentModificationException unused) {
            C4925.m14309(200L, new RunnableC12867());
        }
    }

    static {
        Object next;
        Object next2;
        C9068 c9068 = new C9068();
        f27496 = c9068;
        ArrayList arrayList = new ArrayList();
        f27495 = arrayList;
        SharedPreferences sharedPreferences = C4925.m14335().getSharedPreferences("bookmarks", 0);
        f27498 = sharedPreferences;
        f27500 = new C5242();
        f27497 = new ConcurrentMapC10942();
        f27499 = new HandlerC9774();
        C12749.m31036(new C4401());
        if (ApplicationC20075.f65008.contains("bookmarks_data_new") || sharedPreferences.contains("backup")) {
            if (!m23420(ApplicationC20075.f65008.mo18253("bookmarks_data_new", (byte[]) null))) {
                try {
                    byte[] bArrDecode = Base64.decode(sharedPreferences.getString("backup", ""), 0);
                    int i = C3878.f12396;
                    byte[] bArrM11708 = C3878.m11708(bArrDecode, bArrDecode.length);
                    if (m23420(bArrM11708)) {
                        ApplicationC20075.f65008.edit().mo25855("bookmarks_data_new", bArrM11708).apply();
                    }
                } catch (Exception e) {
                    Main mainM36593 = C15528.m36593();
                    if (mainM36593 != null) {
                        mainM36593.m10223(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            }
        } else if (ApplicationC20075.f65008.contains("bookmarks_data")) {
            C6951 c6951 = new C6951(null);
            arrayList.add(c6951);
            byte[] bArrMo18253 = ApplicationC20075.f65008.mo18253("bookmarks_data", (byte[]) null);
            if (bArrMo18253 != null && bArrMo18253.length >= 6) {
                C12951 c12951 = new C12951(bArrMo18253);
                if (c12951.readInt() == 1647457332) {
                    int iM31494 = c12951.m31494();
                    for (int i2 = 0; i2 < iM31494; i2++) {
                        c6951.m18795().add(new C16828(c12951.m31506(), c12951.m31506()));
                    }
                    ApplicationC20075.f65008.edit().remove("bookmarks_data");
                    c9068.m23394();
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C6951("\rH\rI\rS\r"));
            arrayList.add(new C6951(null));
        } else {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C6951) next).m18787());
            if (((C6951) next) == null) {
                arrayList.add(0, new C6951("\rH\rI\rS\r"));
                C8058 c8058 = C8058.f24861;
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((C6951) next2).m18797());
            if (((C6951) next2) == null) {
                arrayList.add(new C6951(null));
            }
        }
        String string = sharedPreferences.getString("history", null);
        if (string != null) {
            try {
                C6951 c6951M23409 = m23409();
                C12951 c12951M31485 = C12951.m31485(Base64.decode(string, 0));
                C22124.m49722((InterfaceC20008) c12951M31485, 1647457332);
                int iM31495 = c12951M31485.m31494();
                c6951M23409.m18795().clear();
                for (int i3 = 0; i3 < iM31495; i3++) {
                    c6951M23409.m18795().add(C2012.m6550(c12951M31485));
                }
            } catch (Exception unused) {
            }
        }
        f27500.mo1664(C8058.f24861);
        m23429();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final void m23421() {
        synchronized (f27496) {
            try {
                f27499.removeMessages(1);
                try {
                    C6951 c6951M23409 = m23409();
                    C10130 c10130 = new C10130();
                    c10130.writeInt(1647457332);
                    c10130.mo13231(c6951M23409.m18795().size());
                    Iterator it = c6951M23409.m18795().iterator();
                    while (it.hasNext()) {
                        ((C16828) it.next()).m39581(c10130);
                    }
                    f27498.edit().putString("history", Base64.encodeToString(c10130.m25427(), 0)).apply();
                } catch (IOException e) {
                    Main mainM36593 = C15528.m36593();
                    if (mainM36593 != null) {
                        mainM36593.m10223(e, (DialogInterface.OnDismissListener) null);
                    }
                } catch (ConcurrentModificationException unused) {
                    f27499.sendEmptyMessage(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23402(String str, C17534 c17534) {
        C11233.m27805(str, MotionUtils.EASING_TYPE_PATH);
        if (ApplicationC20075.f65008.getBoolean("eph", true)) {
            if (str.length() > 1 && C3016.m9240(str, "/", false)) {
                str = str.substring(0, str.length() - 1);
                C11233.m27803(str, "substring(...)");
            }
            String strM24392 = C9523.m24392(str);
            C11233.m27803(strM24392, "getFriendlyName(...)");
            C16828 c16828 = new C16828(strM24392, str);
            c16828.m39583(c17534);
            C6951 c6951M23409 = m23409();
            synchronized (c6951M23409.m18795()) {
                ArrayList arrayListM18795 = c6951M23409.m18795();
                C11233.m27805(arrayListM18795, "<this>");
                if (c16828.equals(arrayListM18795.isEmpty() ? null : arrayListM18795.get(0))) {
                    return;
                }
                c6951M23409.m18795().remove(c16828);
                c6951M23409.m18795().add(0, c16828);
                while (c6951M23409.m18795().size() > 80) {
                    c6951M23409.m18795().remove(c6951M23409.m18795().size() - 1);
                }
                C8058 c8058 = C8058.f24861;
                f27500.mo1664(C8058.f24861);
                f27496.m23411();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23403(String str, C17534 c17534, int i) {
        C11233.m27805(str, MotionUtils.EASING_TYPE_PATH);
        if (str.length() > 1 && C3016.m9240(str, "/", false)) {
            str = str.substring(0, str.length() - 1);
            C11233.m27803(str, "substring(...)");
        }
        String strM24392 = C9523.m24392(str);
        C11233.m27803(strM24392, "getFriendlyName(...)");
        C16828 c16828 = new C16828(strM24392, str);
        c16828.m39583(c17534);
        m23400(i, C1913.m6273(c16828));
        f27500.mo1664(C8058.f24861);
        f27496.m23394();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C16828 m23416(String str, C17534 c17534) {
        C11233.m27805(str, MotionUtils.EASING_TYPE_PATH);
        if (str.length() > 1 && C3016.m9240(str, "/", false)) {
            str = str.substring(0, str.length() - 1);
            C11233.m27803(str, "substring(...)");
        }
        String strM24392 = C9523.m24392(str);
        C11233.m27803(strM24392, "getFriendlyName(...)");
        C16828 c16828 = new C16828(strM24392, str);
        c16828.m39583(c17534);
        return c16828;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23395() {
        f27496.m23428();
        m23429();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C6951 m23422() {
        for (C6951 c6951 : f27495) {
            if (c6951.m18797()) {
                return c6951;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C6951 m23409() {
        for (C6951 c6951 : f27495) {
            if (c6951.m18787()) {
                return c6951;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final List m23413() {
        List listUnmodifiableList = C20195.unmodifiableList(f27495);
        C11233.m27803(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C21063[] m23414() {
        ArrayList<C6951> arrayList = f27495;
        ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
        int i = 0;
        for (C6951 c6951 : arrayList) {
            int i2 = i + 1;
            if (!c6951.m18787()) {
                arrayList2.add(new C21063(c6951, i));
            }
            i = i2;
        }
        return (C21063[]) arrayList2.toArray(new C21063[0]);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int m23410() {
        return f27495.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C6951 m23415(int i) {
        Object obj = f27495.get(i);
        C11233.m27803(obj, "get(...)");
        return (C6951) obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final boolean m23419(String str) {
        Iterator it = f27495.iterator();
        C11233.m27803(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            C11233.m27803(next, "next(...)");
            if (str.equals(((C6951) next).m18794())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23399(int i, String str) {
        ((C6951) f27495.get(i)).m18784(str);
        f27500.mo1664(C8058.f24861);
        f27496.m23394();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23401(String str) {
        f27495.add(new C6951(str));
        f27500.mo1664(C8058.f24861);
        f27496.m23394();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23397(int i, int i2) {
        Collections.swap(f27495, i, i2);
        f27500.mo1664(C8058.f24861);
        f27496.m23394();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23396(int i) {
        ArrayList arrayList = f27495;
        Object obj = arrayList.get(i);
        C11233.m27803(obj, "get(...)");
        C6951 c6951 = (C6951) obj;
        if (!c6951.m18797()) {
            c6951.m18787();
        }
        m23422().m18795().addAll(c6951.m18795());
        arrayList.remove(i);
        f27500.mo1664(C8058.f24861);
        f27496.m23394();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final void m23429() {
        C1802.f6208.execute(new RunnableC2990());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23407(C6951 c6951, ArrayList arrayList) {
        synchronized (c6951.m18795()) {
            c6951.m18795().removeAll(arrayList);
        }
        f27500.mo1664(C8058.f24861);
        f27496.m23411();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final void m23412() {
        C6951 c6951M23409 = m23409();
        synchronized (c6951M23409.m18795()) {
            c6951M23409.m18795().clear();
            C8058 c8058 = C8058.f24861;
        }
        f27500.mo1664(C8058.f24861);
        f27496.m23411();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23400(int i, List list) {
        C6951 c6951M23422;
        if (i >= 0) {
            ArrayList arrayList = f27495;
            if (i < arrayList.size() && !((C6951) arrayList.get(i)).m18787()) {
                Object obj = arrayList.get(i);
                C11233.m27799(obj);
                c6951M23422 = (C6951) obj;
            } else {
                c6951M23422 = m23422();
            }
        } else {
            c6951M23422 = m23422();
        }
        if (ApplicationC20075.f65010.getBoolean("bookmark_add_to_top", true)) {
            c6951M23422.m18790(list);
        } else {
            c6951M23422.m18785(list);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23398(int i, int i2, int i3) {
        ArrayList arrayList = f27495;
        ((C6951) arrayList.get(i)).m18787();
        ((C6951) arrayList.get(i2)).m18787();
        Object objRemove = ((C6951) arrayList.get(i)).m18795().remove(i3);
        C11233.m27803(objRemove, "removeAt(...)");
        ((C6951) arrayList.get(i2)).m18795().add((C16828) objRemove);
        f27500.mo1664(C8058.f24861);
        f27496.m23394();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23405(ArrayList arrayList, int i) {
        m23400(i, arrayList);
        f27500.mo1664(C8058.f24861);
        f27496.m23394();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23417() {
        f27496.m23428();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23406(AbstractActivityC3346 abstractActivityC3346, InterfaceC1008 interfaceC1008) {
        f27500.m1668(abstractActivityC3346, interfaceC1008);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final void m23427() {
        try {
            Iterator it = f27495.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C6951) it.next()).m18795().iterator();
                while (it2.hasNext()) {
                    ((C16828) it2.next()).m39589();
                }
            }
        } catch (ConcurrentModificationException unused) {
            C4925.m14309(200L, new RunnableC12162());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m23420(byte[] bArr) {
        ArrayList arrayList = f27495;
        if (bArr != null && bArr.length >= 6) {
            C12951 c12951 = new C12951(bArr);
            try {
                C22124.m49722((InterfaceC20008) c12951, 1647457332);
                int iM31494 = c12951.m31494();
                for (int i = 0; i < iM31494; i++) {
                    String strM31503 = c12951.m31503();
                    int iM31495 = c12951.m31494();
                    C6951 c6951 = new C6951(strM31503);
                    arrayList.add(c6951);
                    for (int i2 = 0; i2 < iM31495; i2++) {
                        c6951.m18795().add(C2012.m6550(c12951));
                    }
                }
                return true;
            } catch (Throwable th) {
                arrayList.clear();
                Main mainM36593 = C15528.m36593();
                if (mainM36593 != null) {
                    mainM36593.m10223(th, (DialogInterface.OnDismissListener) null);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final void m23426() {
        HandlerC9774 handlerC9774 = f27499;
        handlerC9774.removeMessages(0);
        handlerC9774.sendEmptyMessageDelayed(0, 2000L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23408(byte[] bArr) {
        SharedPreferences.Editor editorEdit = f27498.edit();
        int i = C3878.f12396;
        editorEdit.putString("backup", Base64.encodeToString(C3878.m11704(0, bArr.length, bArr), 0)).apply();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private final void m23411() {
        HandlerC9774 handlerC9774 = f27499;
        handlerC9774.removeMessages(1);
        handlerC9774.sendEmptyMessageDelayed(1, 1000L);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m23418(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(C1913.m6270((Iterable) arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m23416((String) it.next(), (C17534) null));
        }
        m23400(i, arrayList2);
        f27500.mo1664(C8058.f24861);
        f27496.m23394();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23404(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && !((C6951) it.next()).m18797()) {
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && !((C6951) it2.next()).m18787()) {
            }
        }
        ArrayList arrayList2 = f27495;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        f27496.m23394();
        f27500.mo1664(C8058.f24861);
    }
}
