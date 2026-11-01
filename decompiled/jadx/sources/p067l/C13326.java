package p067l;

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
public final class C13326 {

    /* JADX INFO: renamed from: ܽ */
    public C23384 f37425;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f37424 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f37423 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f37426 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m30428(C23384 c23384) {
        this.f37425 = c23384;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C23384 m30439() {
        return this.f37425;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m30430() {
        this.f37423.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30425(ArrayList arrayList) {
        this.f37424.clear();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC11117 componentCallbacksC11117M30435 = m30435(str);
                if (componentCallbacksC11117M30435 == null) {
                    throw new IllegalStateException(C6988.m16053("No instantiated fragment for (", str, MotionUtils.EASING_TYPE_FORMAT_END));
                }
                if (AbstractC7291.m16763(2)) {
                    componentCallbacksC11117M30435.toString();
                }
                m30427(componentCallbacksC11117M30435);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30426(C7961 c7961) {
        ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
        if (m30429(componentCallbacksC11117M18414.mWho)) {
            return;
        }
        this.f37423.put(componentCallbacksC11117M18414.mWho, c7961);
        if (componentCallbacksC11117M18414.mRetainInstanceChangedWhileDetached) {
            if (componentCallbacksC11117M18414.mRetainInstance) {
                this.f37425.m52031(componentCallbacksC11117M18414);
            } else {
                this.f37425.m52037(componentCallbacksC11117M18414);
            }
            componentCallbacksC11117M18414.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC7291.m16763(2)) {
            componentCallbacksC11117M18414.toString();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30427(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (this.f37424.contains(componentCallbacksC11117)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC11117);
        }
        synchronized (this.f37424) {
            this.f37424.add(componentCallbacksC11117);
        }
        componentCallbacksC11117.mAdded = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30423(int i) {
        for (C7961 c7961 : this.f37423.values()) {
            if (c7961 != null) {
                c7961.m18402(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m30448() {
        HashMap map;
        Iterator it = this.f37424.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f37423;
            if (!zHasNext) {
                break;
            }
            C7961 c7961 = (C7961) map.get(((ComponentCallbacksC11117) it.next()).mWho);
            if (c7961 != null) {
                c7961.m18407();
            }
        }
        for (C7961 c7962 : map.values()) {
            if (c7962 != null) {
                c7962.m18407();
                ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7962.m18414();
                if (componentCallbacksC11117M18414.mRemoving && !componentCallbacksC11117M18414.isInBackStack()) {
                    if (componentCallbacksC11117M18414.mBeingSaved && !this.f37426.containsKey(componentCallbacksC11117M18414.mWho)) {
                        c7962.m18410();
                    }
                    m30437(c7962);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30442(ComponentCallbacksC11117 componentCallbacksC11117) {
        synchronized (this.f37424) {
            this.f37424.remove(componentCallbacksC11117);
        }
        componentCallbacksC11117.mAdded = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30437(C7961 c7961) {
        ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
        if (componentCallbacksC11117M18414.mRetainInstance) {
            this.f37425.m52037(componentCallbacksC11117M18414);
        }
        if (((C7961) this.f37423.put(componentCallbacksC11117M18414.mWho, null)) != null && AbstractC7291.m16763(2)) {
            componentCallbacksC11117M18414.toString();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30422() {
        this.f37423.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: ܳ */
    public final C14666 m30438(String str) {
        return (C14666) this.f37426.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14666 m30421(String str, C14666 c14666) {
        HashMap map = this.f37426;
        if (c14666 != null) {
            return (C14666) map.put(str, c14666);
        }
        return (C14666) map.remove(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30436(ArrayList arrayList) {
        HashMap map = this.f37426;
        map.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14666 c14666 = (C14666) it.next();
            map.put(c14666.f41855, c14666);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList m30445() {
        return new ArrayList(this.f37426.values());
    }

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList m30447() {
        HashMap map = this.f37423;
        ArrayList arrayList = new ArrayList(map.size());
        for (C7961 c7961 : map.values()) {
            if (c7961 != null) {
                ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
                c7961.m18410();
                arrayList.add(componentCallbacksC11117M18414.mWho);
                if (AbstractC7291.m16763(2)) {
                    componentCallbacksC11117M18414.toString();
                    C12826.toString(componentCallbacksC11117M18414.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList m30431() {
        synchronized (this.f37424) {
            if (this.f37424.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f37424.size());
            for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f37424) {
                arrayList.add(componentCallbacksC11117.mWho);
                if (AbstractC7291.m16763(2)) {
                    componentCallbacksC11117.toString();
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m30433() {
        ArrayList arrayList = new ArrayList();
        for (C7961 c7961 : this.f37423.values()) {
            if (c7961 != null) {
                arrayList.add(c7961);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m30443() {
        ArrayList arrayList;
        if (this.f37424.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f37424) {
            arrayList = new ArrayList(this.f37424);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m30440() {
        ArrayList arrayList = new ArrayList();
        for (C7961 c7961 : this.f37423.values()) {
            if (c7961 != null) {
                arrayList.add(c7961.m18414());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ComponentCallbacksC11117 m30434(int i) {
        ArrayList arrayList = this.f37424;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ComponentCallbacksC11117 componentCallbacksC11117 = (ComponentCallbacksC11117) arrayList.get(size);
                if (componentCallbacksC11117 != null && componentCallbacksC11117.mFragmentId == i) {
                    return componentCallbacksC11117;
                }
            } else {
                for (C7961 c7961 : this.f37423.values()) {
                    if (c7961 != null) {
                        ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
                        if (componentCallbacksC11117M18414.mFragmentId == i) {
                            return componentCallbacksC11117M18414;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final ComponentCallbacksC11117 m30441(String str) {
        if (str != null) {
            ArrayList arrayList = this.f37424;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ComponentCallbacksC11117 componentCallbacksC11117 = (ComponentCallbacksC11117) arrayList.get(size);
                if (componentCallbacksC11117 != null && str.equals(componentCallbacksC11117.mTag)) {
                    return componentCallbacksC11117;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C7961 c7961 : this.f37423.values()) {
            if (c7961 != null) {
                ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
                if (str.equals(componentCallbacksC11117M18414.mTag)) {
                    return componentCallbacksC11117M18414;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30429(String str) {
        return this.f37423.get(str) != null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C7961 m30444(String str) {
        return (C7961) this.f37423.get(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ComponentCallbacksC11117 m30446(String str) {
        ComponentCallbacksC11117 componentCallbacksC11117FindFragmentByWho;
        for (C7961 c7961 : this.f37423.values()) {
            if (c7961 != null && (componentCallbacksC11117FindFragmentByWho = c7961.m18414().findFragmentByWho(str)) != null) {
                return componentCallbacksC11117FindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ComponentCallbacksC11117 m30435(String str) {
        C7961 c7961 = (C7961) this.f37423.get(str);
        if (c7961 != null) {
            return c7961.m18414();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m30432(ComponentCallbacksC11117 componentCallbacksC11117) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC11117.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList arrayList = this.f37424;
        int iIndexOf = arrayList.indexOf(componentCallbacksC11117);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            ComponentCallbacksC11117 componentCallbacksC11118 = (ComponentCallbacksC11117) arrayList.get(i);
            if (componentCallbacksC11118.mContainer == viewGroup && (view2 = componentCallbacksC11118.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= arrayList.size()) {
                return -1;
            }
            ComponentCallbacksC11117 componentCallbacksC11119 = (ComponentCallbacksC11117) arrayList.get(iIndexOf);
            if (componentCallbacksC11119.mContainer == viewGroup && (view = componentCallbacksC11119.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30424(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strM40053 = C17588.m40053(str, ASN1Dump.TAB);
        HashMap map = this.f37423;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C7961 c7961 : map.values()) {
                printWriter.print(str);
                if (c7961 != null) {
                    ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
                    printWriter.println(componentCallbacksC11117M18414);
                    componentCallbacksC11117M18414.dump(strM40053, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = this.f37424;
        int size = arrayList.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC11117 componentCallbacksC11117 = (ComponentCallbacksC11117) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC11117.toString());
            }
        }
    }
}
