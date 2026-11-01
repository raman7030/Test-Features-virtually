package p067l;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ᩳ᩺ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C1752 {

    /* JADX INFO: renamed from: ܿ */
    public static final ArrayList f60252 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public static final /* synthetic */ int f60253 = 0;

    /* JADX INFO: renamed from: ܽ */
    public WeakHashMap f60256 = null;

    /* JADX INFO: renamed from: ֫ */
    public SparseArray f60254 = null;

    /* JADX INFO: renamed from: ۧ */
    public WeakReference f60255 = null;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45049(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.f60256;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f60252;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f60256 == null) {
                        this.f60256 = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f60252;
                        View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view2 == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f60256.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f60256.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewM45046 = m45046(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM45046 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (this.f60254 == null) {
                    this.f60254 = new SparseArray();
                }
                this.f60254.put(keyCode, new WeakReference(viewM45046));
            }
        }
        return viewM45046 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    private View m45046(View view, KeyEvent keyEvent) {
        View viewM45046;
        WeakHashMap weakHashMap = this.f60256;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    viewM45046 = m45046(viewGroup.getChildAt(childCount), keyEvent);
                }
            } while (viewM45046 == null);
            return viewM45046;
        }
        if (m45047(view, keyEvent)) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45048(KeyEvent keyEvent) {
        WeakReference weakReference;
        int iIndexOfKey;
        WeakReference weakReference2 = this.f60255;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        this.f60255 = new WeakReference(keyEvent);
        if (this.f60254 == null) {
            this.f60254 = new SparseArray();
        }
        SparseArray sparseArray = this.f60254;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view = (View) weakReference.get();
        if (view != null && view.isAttachedToWindow()) {
            m45047(view, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m45047(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Protector);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((InterfaceC1682) arrayList.get(size)).m42017()) {
                return true;
            }
        }
        return false;
    }
}
