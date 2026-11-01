package p067l;

import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes.dex */
public final class C24870 {

    /* JADX INFO: renamed from: ֫ */
    public static C13432 f79451 = new C13432();

    /* JADX INFO: renamed from: ܽ */
    public static ThreadLocal f79453 = new ThreadLocal();

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList f79452 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public static C0977 m54626() {
        C0977 c0977;
        ThreadLocal threadLocal = f79453;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0977 = (C0977) weakReference.get()) != null) {
            return c0977;
        }
        C0977 c0978 = new C0977();
        threadLocal.set(new WeakReference(c0978));
        return c0978;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54627(ViewGroup viewGroup, AbstractC18164 abstractC18164) {
        ArrayList arrayList = f79452;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC18164 == null) {
            abstractC18164 = f79451;
        }
        AbstractC18164 abstractC18164Clone = abstractC18164.clone();
        ArrayList arrayList2 = (ArrayList) m54626().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC18164) it.next()).pause(viewGroup);
            }
        }
        if (abstractC18164Clone != null) {
            abstractC18164Clone.captureValues(viewGroup, true);
        }
        if (((C9961) viewGroup.getTag(R.id.MT_Protector)) == null) {
            viewGroup.setTag(R.id.MT_Protector, null);
            if (abstractC18164Clone != null) {
                ViewTreeObserverOnPreDrawListenerC16152 viewTreeObserverOnPreDrawListenerC16152 = new ViewTreeObserverOnPreDrawListenerC16152();
                viewTreeObserverOnPreDrawListenerC16152.f47572 = abstractC18164Clone;
                viewTreeObserverOnPreDrawListenerC16152.f47571 = viewGroup;
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC16152);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC16152);
                return;
            }
            return;
        }
        throw null;
    }
}
