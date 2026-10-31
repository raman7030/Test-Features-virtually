package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15537 implements InterfaceC3212 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f47848;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f47849;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f47850;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f47851;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f47852;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f47853;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f47854;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f47855;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C22097 f47859;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f47862;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f47863;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f47864;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20478 f47865;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22967 f47866;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f47867;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f47868;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22262 f47870;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15205 f47871;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f47876;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f47879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f47880;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f47881;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f47882;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13629 f47885;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final RectF f47858 = new RectF();

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final RectF f47875 = new RectF();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final RunnableC1427 f47847 = new Runnable() { // from class: l.֨᩺ۜ
        @Override // java.lang.Runnable
        public final void run() {
            C15537.m36620(this.f5121);
        }
    };

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7445 f47883 = new C7445();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final RectF f47857 = new RectF();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final HashMap f47884 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f47869 = new HashSet();

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public List f47873 = new ArrayList();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashMap f47856 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f47878 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f47874 = new HashSet();

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public volatile List f47877 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f47872 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f47860 = 2048;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f47861 = 2048;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.֨᩺ۜ] */
    public C15537(C20478 c20478, int i, long j, AbstractC22967 abstractC22967) {
        this.f47865 = c20478;
        this.f47849 = c20478.f66023;
        this.f47855 = i;
        this.f47854 = j;
        this.f47866 = abstractC22967;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36627(Canvas canvas, Paint paint) {
        if (this.f47863) {
            return;
        }
        int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
        int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
        if (this.f47860 != maximumBitmapWidth || this.f47861 != maximumBitmapHeight) {
            this.f47860 = maximumBitmapWidth;
            this.f47861 = maximumBitmapHeight;
            this.f47881 = false;
        }
        if (this.f47885 != null) {
            int iSave = canvas.save();
            Iterator it = this.f47856.keySet().iterator();
            while (it.hasNext()) {
                canvas.clipRect(((C23733) it.next()).f76845, Region.Op.DIFFERENCE);
            }
            this.f47885.m32758(canvas, paint);
            canvas.restoreToCount(iSave);
            for (Map.Entry entry : this.f47856.entrySet()) {
                C23733 c23733 = (C23733) entry.getKey();
                int iSave2 = canvas.save();
                canvas.clipRect(c23733.f76845);
                canvas.drawBitmap(((C22262) entry.getValue()).f72236, (Rect) null, c23733.f76848, paint);
                canvas.restoreToCount(iSave2);
            }
            return;
        }
        if (this.f47870 == null) {
            return;
        }
        boolean zIsFilterBitmap = paint.isFilterBitmap();
        if (this.f47871.f46660 != null) {
            paint.setFilterBitmap(false);
        }
        try {
            RectF rectF = this.f47857;
            C15205 c15205 = this.f47871;
            rectF.set(0.0f, 0.0f, c15205.f46658, c15205.f46659);
            int iSave3 = canvas.save();
            for (int i = 0; i < this.f47872.size(); i++) {
                C8917 c8917 = ((C22594) this.f47872.get(i)).f73029;
                canvas.clipRect(c8917.f27099, c8917.f27100, c8917.f27101, c8917.f27097, Region.Op.DIFFERENCE);
            }
            canvas.drawBitmap(this.f47870.f72236, (Rect) null, this.f47857, paint);
            canvas.restoreToCount(iSave3);
            for (int i2 = 0; i2 < this.f47872.size(); i2++) {
                C22594 c22594 = (C22594) this.f47872.get(i2);
                int iSave4 = canvas.save();
                C8917 c8918 = c22594.f73029;
                canvas.clipRect(c8918.f27099, c8918.f27100, c8918.f27101, c8918.f27097);
                canvas.drawBitmap(c22594.f73027.f72236, (Rect) null, c22594.f73028, paint);
                canvas.restoreToCount(iSave4);
            }
        } finally {
            paint.setFilterBitmap(zIsFilterBitmap);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36628(RectF rectF, float f, boolean z) {
        if (!this.f47863 && this.f47865.f66027 && z && this.f47865.m46899(this)) {
            if (!this.f47865.f66016 && m36631() && this.f47865.f66024 != null && this.f47865.f66024.mo14789()) {
                f = this.f47865.f66024.mo21718(this.f47875);
                if (f <= 0.0f) {
                    return;
                } else {
                    rectF = this.f47875;
                }
            }
            C13629 c13629 = this.f47885;
            if ((c13629 == null || !c13629.m32761()) && (this.f47880 || this.f47870 == null)) {
                return;
            }
            if (this.f47881 && this.f47858.equals(rectF) && this.f47850 == f) {
                return;
            }
            if (m36631()) {
                long jM19979 = this.f47883.m19979(SystemClock.uptimeMillis(), rectF, this.f47865.f66024 != null && this.f47865.f66024.mo14791());
                this.f47858.set(rectF);
                this.f47850 = f;
                this.f47865.f66013.removeCallbacks(this.f47847);
                this.f47879 = true;
                this.f47865.f66013.postDelayed(this.f47847, jM19979);
                return;
            }
            this.f47858.set(rectF);
            this.f47850 = f;
            if (this.f47879) {
                return;
            }
            this.f47879 = true;
            this.f47865.f66013.post(this.f47847);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36620(C15537 c15537) {
        List listM37740;
        boolean z = false;
        c15537.f47879 = false;
        c15537.f47883.m19980();
        long jM36630 = c15537.m36630();
        if (c15537.f47863 || !c15537.f47865.f66027 || !c15537.f47865.m46899(c15537) || c15537.f47850 <= 0.0f) {
            return;
        }
        C13629 c13629 = c15537.f47885;
        if (c13629 != null && c13629.m32761()) {
            C15205 c15205 = c15537.f47871;
            List listM18441 = C6800.m18441(c15205.f46658, c15205.f46659, c15537.f47858, c15537.f47850, c15537.f47885.m32764(), jM36630);
            if (!listM18441.isEmpty() && !c15537.f47856.isEmpty() && !c15537.m36621((C23733) listM18441.get(0))) {
                Iterator it = c15537.f47856.values().iterator();
                long allocationByteCount = 0;
                while (it.hasNext()) {
                    allocationByteCount += (long) ((C22262) it.next()).f72236.getAllocationByteCount();
                }
                C15205 c15206 = c15537.f47871;
                List listM18442 = C6800.m18441(c15206.f46658, c15206.f46659, c15537.f47858, c15537.f47850, c15537.f47885.m32764(), Math.max(0L, jM36630 - allocationByteCount));
                listM18441 = (listM18442.isEmpty() || ((C23733) listM18441.get(0)).f76850 <= ((C23733) c15537.f47856.keySet().iterator().next()).f76850 || ((C23733) listM18442.get(0)).f76850 >= ((C23733) c15537.f47856.keySet().iterator().next()).f76850) ? listM18442 : new ArrayList();
            }
            c15537.f47881 = true;
            if (listM18441.equals(c15537.f47877)) {
                c15537.m36623();
                if (c15537.f47865.f66024 != null) {
                    c15537.f47865.f66024.invalidate();
                    return;
                }
                return;
            }
            c15537.f47877 = listM18441;
            c15537.f47874.retainAll(listM18441);
            if (listM18441.isEmpty()) {
                c15537.m36625();
            } else {
                boolean z2 = (c15537.f47856.isEmpty() || c15537.m36621((C23733) listM18441.get(0))) ? false : true;
                c15537.f47862 = z2;
                if (!z2) {
                    for (Map.Entry entry : c15537.f47878.entrySet()) {
                        if (listM18441.contains(entry.getKey())) {
                            C22262 c22262 = (C22262) c15537.f47856.put((C23733) entry.getKey(), (C22262) entry.getValue());
                            if (c22262 != null) {
                                c22262.close();
                            }
                        } else {
                            ((C22262) entry.getValue()).close();
                        }
                    }
                    c15537.f47878.clear();
                }
                Iterator it2 = (c15537.f47862 ? c15537.f47878 : c15537.f47856).entrySet().iterator();
                boolean z3 = false;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!listM18441.contains(entry2.getKey())) {
                        ((C22262) entry2.getValue()).close();
                        it2.remove();
                        z3 = true;
                    }
                }
                if (z3) {
                    c15537.f47881 = false;
                }
                c15537.m36623();
            }
            if (c15537.f47865.f66024 != null) {
                c15537.f47865.f66024.invalidate();
            }
            c15537.f47865.m46915();
            return;
        }
        if (c15537.f47870 == null) {
            return;
        }
        if (c15537.m36631()) {
            C15205 c15207 = c15537.f47871;
            listM37740 = C2133.m7051(c15207.f46658, c15207.f46659, c15537.f47858, c15537.f47850, c15537.f47870.f72233, jM36630, c15537.f47860, c15537.f47861);
        } else {
            C15205 c15208 = c15537.f47871;
            listM37740 = C15971.m37740(c15208.f46658, c15208.f46659, c15537.f47858, c15537.f47850, c15537.f47870.f72233, jM36630);
        }
        if (c15537.m36631() && !listM37740.isEmpty()) {
            for (C8917 c8917 : c15537.f47884.keySet()) {
                RectF rectF = c15537.f47858;
                C15205 c15209 = c15537.f47871;
                if (C2133.m7054(c8917, rectF, c15209.f46658, c15209.f46659, ((C8917) listM37740.get(0)).f27096)) {
                    listM37740 = Collections.singletonList(c8917);
                    break;
                }
            }
        }
        if (listM37740.equals(c15537.f47873)) {
            c15537.f47881 = true;
            if (c15537.f47865.m46888() != null) {
                c15537.f47865.m46915();
                return;
            }
            return;
        }
        c15537.f47873 = listM37740;
        c15537.f47881 = true;
        c15537.f47869.retainAll(listM37740);
        if (c15537.m36631() && !listM37740.isEmpty()) {
            z = true;
        }
        Iterator it3 = c15537.f47884.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            if (!listM37740.contains(entry3.getKey()) && !z) {
                ((C22594) entry3.getValue()).f73027.close();
                it3.remove();
            }
        }
        ArrayList arrayList = c15537.f47872;
        arrayList.clear();
        arrayList.addAll(c15537.f47884.values());
        if (c15537.f47865.f66024 != null) {
            c15537.f47865.f66024.invalidate();
        }
        c15537.f47865.m46915();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m36630() {
        int i = 0;
        if (this.f47865.f66016) {
            int i2 = 0;
            while (i < this.f47865.f66021.size()) {
                if (((C15537) this.f47865.f66021.valueAt(i)).f47851) {
                    i2++;
                }
                i++;
            }
            return Math.min(this.f47849, (this.f47865.f66025.m46067() / 2) / ((long) Math.max(1, i2))) / ((long) (m36631() ? 2 : 1));
        }
        long jMax = this.f47865.f66019;
        if (this.f47865.f66029 != null) {
            jMax += Math.max(0L, this.f47865.f66029.m49682() - this.f47865.f66011);
        }
        while (i < this.f47865.f66021.size()) {
            C15537 c15537 = (C15537) this.f47865.f66021.valueAt(i);
            C22262 c22262 = c15537.f47870;
            if (c22262 != null) {
                jMax += Math.max(0L, ((long) c22262.f72236.getAllocationByteCount()) - this.f47865.f66011);
            }
            C13629 c13629 = c15537.f47885;
            if (c13629 != null) {
                jMax = Math.max(0L, c13629.m32763() - this.f47865.f66011) + jMax;
            }
            i++;
        }
        long jMax2 = Math.max(0L, this.f47849 - jMax);
        if (m36631()) {
            return Math.min(jMax2, Math.max(0L, (this.f47865.f66023 + (this.f47865.f66011 * ((long) (3 - Math.min(3, this.f47865.f66005.size()))))) - jMax) / 2);
        }
        return jMax2;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m36631() {
        C15205 c15205 = this.f47871;
        if (c15205 != null) {
            return c15205.f46660 != null || "image/png".equals(c15205.f46661);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m36621(C23733 c23733) {
        C23733 c23734 = (C23733) this.f47856.keySet().iterator().next();
        return c23733.f76849 == c23734.f76849 && c23733.f76847 == c23734.f76847;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m36623() {
        if (this.f47879 || !this.f47862 || this.f47877.isEmpty()) {
            return;
        }
        boolean z = false;
        for (C23733 c23733 : this.f47877) {
            if (RectF.intersects(c23733.f76845, this.f47858)) {
                if (!this.f47878.containsKey(c23733)) {
                    return;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            Iterator it = this.f47856.values().iterator();
            while (it.hasNext()) {
                ((C22262) it.next()).close();
            }
            this.f47856.clear();
            this.f47856.putAll(this.f47878);
            this.f47878.clear();
            this.f47862 = false;
            this.f47881 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m36625() {
        HashMap map = this.f47878;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C22262) it.next()).close();
        }
        map.clear();
        this.f47862 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.۠᩺ۜ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36632() {
        C13629 c13629 = this.f47885;
        if (c13629 != 0) {
            c13629.m32760(!this.f47863 && this.f47865.f66027 && this.f47865.f66015 == this && !this.f47853, (RunnableC8483) new Runnable() { // from class: l.۠᩺ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C15537 c15537 = this.f25924;
                    if (c15537.f47863 || c15537.f47865.f66024 == null || !c15537.f47865.f66027 || c15537.f47865.f66015 != c15537) {
                        return;
                    }
                    c15537.f47865.f66024.invalidate();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36626() {
        this.f47883.m19981();
        this.f47865.f66013.removeCallbacks(this.f47847);
        this.f47879 = false;
        m36625();
        this.f47877 = new ArrayList();
        Iterator it = this.f47856.values().iterator();
        while (it.hasNext()) {
            ((C22262) it.next()).close();
        }
        this.f47856.clear();
        this.f47874.clear();
        Iterator it2 = this.f47884.values().iterator();
        while (it2.hasNext()) {
            ((C22594) it2.next()).f73027.close();
        }
        this.f47884.clear();
        this.f47872.clear();
        this.f47881 = false;
        this.f47873 = new ArrayList();
        this.f47869.clear();
        this.f47850 = 0.0f;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36629() {
        if (this.f47863) {
            return;
        }
        this.f47863 = true;
        m36626();
        C22262 c22262 = this.f47870;
        if (c22262 != null) {
            c22262.close();
        }
        this.f47870 = null;
        C13629 c13629 = this.f47885;
        if (c13629 != null) {
            c13629.m32759(this.f47859);
        } else {
            C22097 c22097 = this.f47859;
            if (c22097 != null) {
                c22097.close();
            }
        }
        this.f47885 = null;
        this.f47859 = null;
    }
}
