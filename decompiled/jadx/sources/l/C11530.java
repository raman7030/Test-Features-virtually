package l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.motion.MotionUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۨۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 41GJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11530 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22113 f34428;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34427 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f34426 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f34429 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28382(C22113 c22113) {
        this.f34428 = c22113;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22113 m28393() {
        return this.f34428;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m28384() {
        this.f34426.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28379(ArrayList arrayList) {
        this.f34427.clear();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC9205 componentCallbacksC9205M28389 = m28389(str);
                if (componentCallbacksC9205M28389 == null) {
                    throw new IllegalStateException(C4860.m14172("No instantiated fragment for (", str, MotionUtils.EASING_TYPE_FORMAT_END));
                }
                if (AbstractC5180.m14853(2)) {
                    componentCallbacksC9205M28389.toString();
                }
                m28381(componentCallbacksC9205M28389);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28380(C5885 c5885) {
        ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
        if (m28383(componentCallbacksC9205M16488.mWho)) {
            return;
        }
        this.f34426.put(componentCallbacksC9205M16488.mWho, c5885);
        if (componentCallbacksC9205M16488.mRetainInstanceChangedWhileDetached) {
            if (componentCallbacksC9205M16488.mRetainInstance) {
                this.f34428.m49693(componentCallbacksC9205M16488);
            } else {
                this.f34428.m49699(componentCallbacksC9205M16488);
            }
            componentCallbacksC9205M16488.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC5180.m14853(2)) {
            componentCallbacksC9205M16488.toString();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28381(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (this.f34427.contains(componentCallbacksC9205)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC9205);
        }
        synchronized (this.f34427) {
            this.f34427.add(componentCallbacksC9205);
        }
        componentCallbacksC9205.mAdded = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28377(int i) {
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null) {
                c5885.m16476(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m28402() {
        HashMap map;
        Iterator it = this.f34427.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f34426;
            if (!zHasNext) {
                break;
            }
            C5885 c5885 = (C5885) map.get(((ComponentCallbacksC9205) it.next()).mWho);
            if (c5885 != null) {
                c5885.m16481();
            }
        }
        for (C5885 c5886 : map.values()) {
            if (c5886 != null) {
                c5886.m16481();
                ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5886.m16488();
                if (componentCallbacksC9205M16488.mRemoving && !componentCallbacksC9205M16488.isInBackStack()) {
                    if (componentCallbacksC9205M16488.mBeingSaved && !this.f34429.containsKey(componentCallbacksC9205M16488.mWho)) {
                        c5886.m16484();
                    }
                    m28391(c5886);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28396(ComponentCallbacksC9205 componentCallbacksC9205) {
        synchronized (this.f34427) {
            this.f34427.remove(componentCallbacksC9205);
        }
        componentCallbacksC9205.mAdded = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28391(C5885 c5885) {
        ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
        if (componentCallbacksC9205M16488.mRetainInstance) {
            this.f34428.m49699(componentCallbacksC9205M16488);
        }
        if (((C5885) this.f34426.put(componentCallbacksC9205M16488.mWho, null)) != null && AbstractC5180.m14853(2)) {
            componentCallbacksC9205M16488.toString();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28376() {
        this.f34426.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12940 m28392(String str) {
        return (C12940) this.f34429.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12940 m28375(String str, C12940 c12940) {
        HashMap map = this.f34429;
        if (c12940 != null) {
            return (C12940) map.put(str, c12940);
        }
        return (C12940) map.remove(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28390(ArrayList arrayList) {
        HashMap map = this.f34429;
        map.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12940 c12940 = (C12940) it.next();
            map.put(c12940.f38811, c12940);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28399() {
        return new ArrayList(this.f34429.values());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m28401() {
        HashMap map = this.f34426;
        ArrayList arrayList = new ArrayList(map.size());
        for (C5885 c5885 : map.values()) {
            if (c5885 != null) {
                ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
                c5885.m16484();
                arrayList.add(componentCallbacksC9205M16488.mWho);
                if (AbstractC5180.m14853(2)) {
                    componentCallbacksC9205M16488.toString();
                    C11003.toString(componentCallbacksC9205M16488.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28385() {
        synchronized (this.f34427) {
            if (this.f34427.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f34427.size());
            for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f34427) {
                arrayList.add(componentCallbacksC9205.mWho);
                if (AbstractC5180.m14853(2)) {
                    componentCallbacksC9205.toString();
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28387() {
        ArrayList arrayList = new ArrayList();
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null) {
                arrayList.add(c5885);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m28397() {
        ArrayList arrayList;
        if (this.f34427.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f34427) {
            arrayList = new ArrayList(this.f34427);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28394() {
        ArrayList arrayList = new ArrayList();
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null) {
                arrayList.add(c5885.m16488());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m28388(int i) {
        ArrayList arrayList = this.f34427;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) arrayList.get(size);
                if (componentCallbacksC9205 != null && componentCallbacksC9205.mFragmentId == i) {
                    return componentCallbacksC9205;
                }
            } else {
                for (C5885 c5885 : this.f34426.values()) {
                    if (c5885 != null) {
                        ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
                        if (componentCallbacksC9205M16488.mFragmentId == i) {
                            return componentCallbacksC9205M16488;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m28395(String str) {
        if (str != null) {
            ArrayList arrayList = this.f34427;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) arrayList.get(size);
                if (componentCallbacksC9205 != null && str.equals(componentCallbacksC9205.mTag)) {
                    return componentCallbacksC9205;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null) {
                ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
                if (str.equals(componentCallbacksC9205M16488.mTag)) {
                    return componentCallbacksC9205M16488;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28383(String str) {
        return this.f34426.get(str) != null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5885 m28398(String str) {
        return (C5885) this.f34426.get(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m28400(String str) {
        ComponentCallbacksC9205 componentCallbacksC9205FindFragmentByWho;
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null && (componentCallbacksC9205FindFragmentByWho = c5885.m16488().findFragmentByWho(str)) != null) {
                return componentCallbacksC9205FindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m28389(String str) {
        C5885 c5885 = (C5885) this.f34426.get(str);
        if (c5885 != null) {
            return c5885.m16488();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m28386(ComponentCallbacksC9205 componentCallbacksC9205) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList arrayList = this.f34427;
        int iIndexOf = arrayList.indexOf(componentCallbacksC9205);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            ComponentCallbacksC9205 componentCallbacksC9206 = (ComponentCallbacksC9205) arrayList.get(i);
            if (componentCallbacksC9206.mContainer == viewGroup && (view2 = componentCallbacksC9206.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= arrayList.size()) {
                return -1;
            }
            ComponentCallbacksC9205 componentCallbacksC9207 = (ComponentCallbacksC9205) arrayList.get(iIndexOf);
            if (componentCallbacksC9207.mContainer == viewGroup && (view = componentCallbacksC9207.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28378(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strM37867 = C16014.m37867(str, ASN1Dump.TAB);
        HashMap map = this.f34426;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C5885 c5885 : map.values()) {
                printWriter.print(str);
                if (c5885 != null) {
                    ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
                    printWriter.println(componentCallbacksC9205M16488);
                    componentCallbacksC9205M16488.dump(strM37867, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = this.f34427;
        int size = arrayList.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC9205.toString());
            }
        }
    }
}
