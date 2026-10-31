package l;

import android.view.ViewGroup;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes.dex */
public final class C23676 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11641 f76701 = new C11641();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f76703 = new ThreadLocal();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList f76702 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2727 m52223() {
        C2727 c2727;
        ThreadLocal threadLocal = f76703;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c2727 = (C2727) weakReference.get()) != null) {
            return c2727;
        }
        C2727 c2728 = new C2727();
        threadLocal.set(new WeakReference(c2728));
        return c2728;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52224(ViewGroup viewGroup, AbstractC16620 abstractC16620) {
        ArrayList arrayList = f76702;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC16620 == null) {
            abstractC16620 = f76701;
        }
        AbstractC16620 abstractC16620Clone = abstractC16620.clone();
        ArrayList arrayList2 = (ArrayList) m52223().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC16620) it.next()).pause(viewGroup);
            }
        }
        if (abstractC16620Clone != null) {
            abstractC16620Clone.captureValues(viewGroup, true);
        }
        if (((C7989) viewGroup.getTag(R.id.MT_Protector)) == null) {
            viewGroup.setTag(R.id.MT_Protector, null);
            if (abstractC16620Clone != null) {
                ViewTreeObserverOnPreDrawListenerC14503 viewTreeObserverOnPreDrawListenerC14503 = new ViewTreeObserverOnPreDrawListenerC14503();
                viewTreeObserverOnPreDrawListenerC14503.f44471 = abstractC16620Clone;
                viewTreeObserverOnPreDrawListenerC14503.f44470 = viewGroup;
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC14503);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC14503);
                return;
            }
            return;
        }
        throw null;
    }
}
