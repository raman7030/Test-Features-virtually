package p067l;

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
public final class C17135 implements InterfaceC5421 {

    /* JADX INFO: renamed from: ֨ */
    public boolean f50980;

    /* JADX INFO: renamed from: ֫ */
    public long f50981;

    /* JADX INFO: renamed from: ֫֫ */
    public float f50982;

    /* JADX INFO: renamed from: ۖ */
    public volatile boolean f50983;

    /* JADX INFO: renamed from: ۗ */
    public boolean f50984;

    /* JADX INFO: renamed from: ۘ */
    public boolean f50985;

    /* JADX INFO: renamed from: ۙ */
    public final long f50986;

    /* JADX INFO: renamed from: ۚ */
    public final int f50987;

    /* JADX INFO: renamed from: ۠ */
    public C23369 f50991;

    /* JADX INFO: renamed from: ۤ */
    public boolean f50994;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f50995;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f50996;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C21831 f50997;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC24196 f50998;

    /* JADX INFO: renamed from: ۬ */
    public boolean f50999;

    /* JADX INFO: renamed from: ܰ */
    public boolean f51000;

    /* JADX INFO: renamed from: ܶ */
    public C23526 f51002;

    /* JADX INFO: renamed from: ܺ */
    public C16819 f51003;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f51008;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f51011;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f51012;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f51013;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f51014;

    /* JADX INFO: renamed from: ᩻ */
    public C15321 f51017;

    /* JADX INFO: renamed from: ۟ */
    public final RectF f50990 = new RectF();

    /* JADX INFO: renamed from: ܿ֫ */
    public final RectF f51007 = new RectF();

    /* JADX INFO: renamed from: ֡ */
    public final RunnableC3725 f50979 = new Runnable() { // from class: l.֨᩺ۜ
        @Override // java.lang.Runnable
        public final void run() {
            C17135.m38781(this.f7894);
        }
    };

    /* JADX INFO: renamed from: ᩹ */
    public final C9444 f51015 = new C9444();

    /* JADX INFO: renamed from: ۜ */
    public final RectF f50989 = new RectF();

    /* JADX INFO: renamed from: ᩺ */
    public final HashMap f51016 = new HashMap();

    /* JADX INFO: renamed from: ܳ */
    public final HashSet f51001 = new HashSet();

    /* JADX INFO: renamed from: ܽ֫ */
    public List f51005 = new ArrayList();

    /* JADX INFO: renamed from: ۛ */
    public final HashMap f50988 = new HashMap();

    /* JADX INFO: renamed from: ᩴ */
    public final HashMap f51010 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public final HashSet f51006 = new HashSet();

    /* JADX INFO: renamed from: ᩳ֫ */
    public volatile List f51009 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f51004 = new ArrayList();

    /* JADX INFO: renamed from: ۡ */
    public int f50992 = 2048;

    /* JADX INFO: renamed from: ۢ */
    public int f50993 = 2048;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.֨᩺ۜ] */
    public C17135(C21831 c21831, int i, long j, AbstractC24196 abstractC24196) {
        this.f50997 = c21831;
        this.f50981 = c21831.f68700;
        this.f50987 = i;
        this.f50986 = j;
        this.f50998 = abstractC24196;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38788(Canvas canvas, Paint paint) {
        if (this.f50995) {
            return;
        }
        int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
        int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
        if (this.f50992 != maximumBitmapWidth || this.f50993 != maximumBitmapHeight) {
            this.f50992 = maximumBitmapWidth;
            this.f50993 = maximumBitmapHeight;
            this.f51013 = false;
        }
        if (this.f51017 != null) {
            int iSave = canvas.save();
            Iterator it = this.f50988.keySet().iterator();
            while (it.hasNext()) {
                canvas.clipRect(((C24924) it.next()).f79596, Region.Op.DIFFERENCE);
            }
            this.f51017.m34873(canvas, paint);
            canvas.restoreToCount(iSave);
            for (Map.Entry entry : this.f50988.entrySet()) {
                C24924 c24924 = (C24924) entry.getKey();
                int iSave2 = canvas.save();
                canvas.clipRect(c24924.f79596);
                canvas.drawBitmap(((C23526) entry.getValue()).f74960, (Rect) null, c24924.f79599, paint);
                canvas.restoreToCount(iSave2);
            }
            return;
        }
        if (this.f51002 == null) {
            return;
        }
        boolean zIsFilterBitmap = paint.isFilterBitmap();
        if (this.f51003.f49785 != null) {
            paint.setFilterBitmap(false);
        }
        try {
            RectF rectF = this.f50989;
            C16819 c16819 = this.f51003;
            rectF.set(0.0f, 0.0f, c16819.f49783, c16819.f49784);
            int iSave3 = canvas.save();
            for (int i = 0; i < this.f51004.size(); i++) {
                C10843 c10843 = ((C23842) this.f51004.get(i)).f75756;
                canvas.clipRect(c10843.f30031, c10843.f30032, c10843.f30033, c10843.f30029, Region.Op.DIFFERENCE);
            }
            canvas.drawBitmap(this.f51002.f74960, (Rect) null, this.f50989, paint);
            canvas.restoreToCount(iSave3);
            for (int i2 = 0; i2 < this.f51004.size(); i2++) {
                C23842 c23842 = (C23842) this.f51004.get(i2);
                int iSave4 = canvas.save();
                C10843 c10844 = c23842.f75756;
                canvas.clipRect(c10844.f30031, c10844.f30032, c10844.f30033, c10844.f30029);
                canvas.drawBitmap(c23842.f75754.f74960, (Rect) null, c23842.f75755, paint);
                canvas.restoreToCount(iSave4);
            }
        } finally {
            paint.setFilterBitmap(zIsFilterBitmap);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38789(RectF rectF, float f, boolean z) {
        if (!this.f50995 && this.f50997.f68704 && z && this.f50997.m49222(this)) {
            if (!this.f50997.f68693 && m38792() && this.f50997.f68701 != null && this.f50997.f68701.mo16697()) {
                f = this.f50997.f68701.mo23687(this.f51007);
                if (f <= 0.0f) {
                    return;
                } else {
                    rectF = this.f51007;
                }
            }
            C15321 c15321 = this.f51017;
            if ((c15321 == null || !c15321.m34876()) && (this.f51012 || this.f51002 == null)) {
                return;
            }
            if (this.f51013 && this.f50990.equals(rectF) && this.f50982 == f) {
                return;
            }
            if (m38792()) {
                long jM21954 = this.f51015.m21954(SystemClock.uptimeMillis(), rectF, this.f50997.f68701 != null && this.f50997.f68701.mo16699());
                this.f50990.set(rectF);
                this.f50982 = f;
                this.f50997.f68690.removeCallbacks(this.f50979);
                this.f51011 = true;
                this.f50997.f68690.postDelayed(this.f50979, jM21954);
                return;
            }
            this.f50990.set(rectF);
            this.f50982 = f;
            if (this.f51011) {
                return;
            }
            this.f51011 = true;
            this.f50997.f68690.post(this.f50979);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38781(C17135 c17135) {
        List listM39924;
        boolean z = false;
        c17135.f51011 = false;
        c17135.f51015.m21955();
        long jM38791 = c17135.m38791();
        if (c17135.f50995 || !c17135.f50997.f68704 || !c17135.f50997.m49222(c17135) || c17135.f50982 <= 0.0f) {
            return;
        }
        C15321 c15321 = c17135.f51017;
        if (c15321 != null && c15321.m34876()) {
            C16819 c16819 = c17135.f51003;
            List listM20390 = C8831.m20390(c16819.f49783, c16819.f49784, c17135.f50990, c17135.f50982, c17135.f51017.m34879(), jM38791);
            if (!listM20390.isEmpty() && !c17135.f50988.isEmpty() && !c17135.m38782((C24924) listM20390.get(0))) {
                Iterator it = c17135.f50988.values().iterator();
                long allocationByteCount = 0;
                while (it.hasNext()) {
                    allocationByteCount += (long) ((C23526) it.next()).f74960.getAllocationByteCount();
                }
                C16819 c168110 = c17135.f51003;
                List listM20391 = C8831.m20390(c168110.f49783, c168110.f49784, c17135.f50990, c17135.f50982, c17135.f51017.m34879(), Math.max(0L, jM38791 - allocationByteCount));
                listM20390 = (listM20391.isEmpty() || ((C24924) listM20390.get(0)).f79601 <= ((C24924) c17135.f50988.keySet().iterator().next()).f79601 || ((C24924) listM20391.get(0)).f79601 >= ((C24924) c17135.f50988.keySet().iterator().next()).f79601) ? listM20391 : new ArrayList();
            }
            c17135.f51013 = true;
            if (listM20390.equals(c17135.f51009)) {
                c17135.m38784();
                if (c17135.f50997.f68701 != null) {
                    c17135.f50997.f68701.invalidate();
                    return;
                }
                return;
            }
            c17135.f51009 = listM20390;
            c17135.f51006.retainAll(listM20390);
            if (listM20390.isEmpty()) {
                c17135.m38786();
            } else {
                boolean z2 = (c17135.f50988.isEmpty() || c17135.m38782((C24924) listM20390.get(0))) ? false : true;
                c17135.f50994 = z2;
                if (!z2) {
                    for (Map.Entry entry : c17135.f51010.entrySet()) {
                        if (listM20390.contains(entry.getKey())) {
                            C23526 c23526 = (C23526) c17135.f50988.put((C24924) entry.getKey(), (C23526) entry.getValue());
                            if (c23526 != null) {
                                c23526.close();
                            }
                        } else {
                            ((C23526) entry.getValue()).close();
                        }
                    }
                    c17135.f51010.clear();
                }
                Iterator it2 = (c17135.f50994 ? c17135.f51010 : c17135.f50988).entrySet().iterator();
                boolean z3 = false;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!listM20390.contains(entry2.getKey())) {
                        ((C23526) entry2.getValue()).close();
                        it2.remove();
                        z3 = true;
                    }
                }
                if (z3) {
                    c17135.f51013 = false;
                }
                c17135.m38784();
            }
            if (c17135.f50997.f68701 != null) {
                c17135.f50997.f68701.invalidate();
            }
            c17135.f50997.m49238();
            return;
        }
        if (c17135.f51002 == null) {
            return;
        }
        if (c17135.m38792()) {
            C16819 c168111 = c17135.f51003;
            listM39924 = C4396.m9146(c168111.f49783, c168111.f49784, c17135.f50990, c17135.f50982, c17135.f51002.f74957, jM38791, c17135.f50992, c17135.f50993);
        } else {
            C16819 c168112 = c17135.f51003;
            listM39924 = C17547.m39924(c168112.f49783, c168112.f49784, c17135.f50990, c17135.f50982, c17135.f51002.f74957, jM38791);
        }
        if (c17135.m38792() && !listM39924.isEmpty()) {
            for (C10843 c10843 : c17135.f51016.keySet()) {
                RectF rectF = c17135.f50990;
                C16819 c168113 = c17135.f51003;
                if (C4396.m9149(c10843, rectF, c168113.f49783, c168113.f49784, ((C10843) listM39924.get(0)).f30028)) {
                    listM39924 = Collections.singletonList(c10843);
                    break;
                }
            }
        }
        if (listM39924.equals(c17135.f51005)) {
            c17135.f51013 = true;
            if (c17135.f50997.m49211() != null) {
                c17135.f50997.m49238();
                return;
            }
            return;
        }
        c17135.f51005 = listM39924;
        c17135.f51013 = true;
        c17135.f51001.retainAll(listM39924);
        if (c17135.m38792() && !listM39924.isEmpty()) {
            z = true;
        }
        Iterator it3 = c17135.f51016.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            if (!listM39924.contains(entry3.getKey()) && !z) {
                ((C23842) entry3.getValue()).f75754.close();
                it3.remove();
            }
        }
        ArrayList arrayList = c17135.f51004;
        arrayList.clear();
        arrayList.addAll(c17135.f51016.values());
        if (c17135.f50997.f68701 != null) {
            c17135.f50997.f68701.invalidate();
        }
        c17135.f50997.m49238();
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m38791() {
        int i = 0;
        if (this.f50997.f68693) {
            int i2 = 0;
            while (i < this.f50997.f68698.size()) {
                if (((C17135) this.f50997.f68698.valueAt(i)).f50983) {
                    i2++;
                }
                i++;
            }
            return Math.min(this.f50981, (this.f50997.f68702.m48381() / 2) / ((long) Math.max(1, i2))) / ((long) (m38792() ? 2 : 1));
        }
        long jMax = this.f50997.f68696;
        if (this.f50997.f68706 != null) {
            jMax += Math.max(0L, this.f50997.f68706.m52020() - this.f50997.f68688);
        }
        while (i < this.f50997.f68698.size()) {
            C17135 c17135 = (C17135) this.f50997.f68698.valueAt(i);
            C23526 c23526 = c17135.f51002;
            if (c23526 != null) {
                jMax += Math.max(0L, ((long) c23526.f74960.getAllocationByteCount()) - this.f50997.f68688);
            }
            C15321 c15321 = c17135.f51017;
            if (c15321 != null) {
                jMax = Math.max(0L, c15321.m34878() - this.f50997.f68688) + jMax;
            }
            i++;
        }
        long jMax2 = Math.max(0L, this.f50981 - jMax);
        if (m38792()) {
            return Math.min(jMax2, Math.max(0L, (this.f50997.f68700 + (this.f50997.f68688 * ((long) (3 - Math.min(3, this.f50997.f68682.size()))))) - jMax) / 2);
        }
        return jMax2;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m38792() {
        C16819 c16819 = this.f51003;
        if (c16819 != null) {
            return c16819.f49785 != null || "image/png".equals(c16819.f49786);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m38782(C24924 c24924) {
        C24924 c24925 = (C24924) this.f50988.keySet().iterator().next();
        return c24924.f79600 == c24925.f79600 && c24924.f79598 == c24925.f79598;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m38784() {
        if (this.f51011 || !this.f50994 || this.f51009.isEmpty()) {
            return;
        }
        boolean z = false;
        for (C24924 c24924 : this.f51009) {
            if (RectF.intersects(c24924.f79596, this.f50990)) {
                if (!this.f51010.containsKey(c24924)) {
                    return;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            Iterator it = this.f50988.values().iterator();
            while (it.hasNext()) {
                ((C23526) it.next()).close();
            }
            this.f50988.clear();
            this.f50988.putAll(this.f51010);
            this.f51010.clear();
            this.f50994 = false;
            this.f51013 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public void m38786() {
        HashMap map = this.f51010;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C23526) it.next()).close();
        }
        map.clear();
        this.f50994 = false;
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
    /* JADX INFO: renamed from: ᩳ */
    public final void m38793() {
        C15321 c15321 = this.f51017;
        if (c15321 != 0) {
            c15321.m34875(!this.f50995 && this.f50997.f68704 && this.f50997.f68692 == this && !this.f50985, (RunnableC10431) new Runnable() { // from class: l.۠᩺ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C17135 c17135 = this.f28839;
                    if (c17135.f50995 || c17135.f50997.f68701 == null || !c17135.f50997.f68704 || c17135.f50997.f68692 != c17135) {
                        return;
                    }
                    c17135.f50997.f68701.invalidate();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38787() {
        this.f51015.m21956();
        this.f50997.f68690.removeCallbacks(this.f50979);
        this.f51011 = false;
        m38786();
        this.f51009 = new ArrayList();
        Iterator it = this.f50988.values().iterator();
        while (it.hasNext()) {
            ((C23526) it.next()).close();
        }
        this.f50988.clear();
        this.f51006.clear();
        Iterator it2 = this.f51016.values().iterator();
        while (it2.hasNext()) {
            ((C23842) it2.next()).f75754.close();
        }
        this.f51016.clear();
        this.f51004.clear();
        this.f51013 = false;
        this.f51005 = new ArrayList();
        this.f51001.clear();
        this.f50982 = 0.0f;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38790() {
        if (this.f50995) {
            return;
        }
        this.f50995 = true;
        m38787();
        C23526 c23526 = this.f51002;
        if (c23526 != null) {
            c23526.close();
        }
        this.f51002 = null;
        C15321 c15321 = this.f51017;
        if (c15321 != null) {
            c15321.m34874(this.f50991);
        } else {
            C23369 c23369 = this.f50991;
            if (c23369 != null) {
                c23369.close();
            }
        }
        this.f51017 = null;
        this.f50991 = null;
    }
}
