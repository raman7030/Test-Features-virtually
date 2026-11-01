package p067l;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1X6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18514 extends C13151 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final HashMap f55299;

    /* JADX INFO: renamed from: ۘ֫ */
    public AbstractC9127 f55300;

    /* JADX INFO: renamed from: ᩴ֫ */
    public String f55301;

    /* JADX INFO: renamed from: ᩵֫ */
    public Object f55302;

    @Override // p067l.C13151
    /* JADX INFO: renamed from: ۧ */
    public final C13151 mo30121(long j) {
        throw null;
    }

    static {
        HashMap map = new HashMap();
        f55299 = map;
        map.put("alpha", C9797.f27087);
        map.put("pivotX", C9797.f27093);
        map.put("pivotY", C9797.f27096);
        map.put("translationX", C9797.f27091);
        map.put("translationY", C9797.f27095);
        map.put("rotation", C9797.f27098);
        map.put("rotationX", C9797.f27097);
        map.put("rotationY", C9797.f27094);
        map.put("scaleX", C9797.f27100);
        map.put("scaleY", C9797.f27090);
        map.put("scrollX", C9797.f27099);
        map.put("scrollY", C9797.f27092);
        map.put("x", C9797.f27088);
        map.put("y", C9797.f27089);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18514 m42063(Object obj, float... fArr) {
        C18514 c18514 = new C18514();
        c18514.f55302 = obj;
        C22539[] c22539Arr = c18514.f36962;
        if (c22539Arr != null) {
            C22539 c22539 = c22539Arr[0];
            String str = c22539.f71093;
            c22539.f71093 = "alpha";
            c18514.f36961.remove(str);
            c18514.f36961.put("alpha", c22539);
        }
        c18514.f55301 = "alpha";
        c18514.f36950 = false;
        c18514.mo30118(fArr);
        return c18514;
    }

    @Override // p067l.C13151
    /* JADX INFO: renamed from: ֫ */
    public final void mo30118(float... fArr) {
        C22539[] c22539Arr = this.f36962;
        if (c22539Arr == null || c22539Arr.length == 0) {
            AbstractC9127 abstractC9127 = this.f55300;
            if (abstractC9127 != null) {
                int i = C22539.f71087;
                m30119(new C16502(abstractC9127, fArr));
                return;
            }
            String str = this.f55301;
            int i2 = C22539.f71087;
            C16502 c16502 = new C16502(str);
            c16502.mo37460(fArr);
            m30119(c16502);
            return;
        }
        super.mo30118(fArr);
    }

    @Override // p067l.C13151
    /* JADX INFO: renamed from: ᩳ */
    public final void mo30126() {
        Object obj = this.f55302;
        if (this.f36950) {
            return;
        }
        if (this.f55300 == null && C9658.f26591 && (obj instanceof View)) {
            String str = this.f55301;
            HashMap map = f55299;
            if (map.containsKey(str)) {
                AbstractC9127 abstractC9127 = (AbstractC9127) map.get(this.f55301);
                C22539[] c22539Arr = this.f36962;
                if (c22539Arr != null) {
                    C22539 c22539 = c22539Arr[0];
                    String str2 = c22539.f71093;
                    c22539.f71088 = abstractC9127;
                    this.f36961.remove(str2);
                    this.f36961.put(this.f55301, c22539);
                }
                if (this.f55300 != null) {
                    this.f55301 = abstractC9127.m21072();
                }
                this.f55300 = abstractC9127;
                this.f36950 = false;
            }
        }
        int length = this.f36962.length;
        for (int i = 0; i < length; i++) {
            this.f36962[i].m50513(obj);
        }
        super.mo30126();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42064(long j) {
        super.mo30121(j);
    }

    @Override // p067l.C13151
    /* JADX INFO: renamed from: ֫ */
    public final void mo30114(float f) {
        super.mo30114(f);
        int length = this.f36962.length;
        for (int i = 0; i < length; i++) {
            this.f36962[i].mo37459(this.f55302);
        }
    }

    @Override // p067l.C13151, p067l.AbstractC24410
    /* JADX INFO: renamed from: clone */
    public final Object mo56469clone() {
        return (C18514) super.mo56469clone();
    }

    @Override // p067l.C13151, p067l.AbstractC24410
    /* JADX INFO: renamed from: clone */
    public final C13151 mo56469clone() {
        return (C18514) super.mo56469clone();
    }

    @Override // p067l.C13151, p067l.AbstractC24410
    /* JADX INFO: renamed from: clone */
    public final AbstractC24410 mo56469clone() {
        return (C18514) super.mo56469clone();
    }

    @Override // p067l.C13151
    public final String toString() {
        String string = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f55302;
        if (this.f36962 != null) {
            for (int i = 0; i < this.f36962.length; i++) {
                StringBuilder sbM21133 = C9179.m21133(string, "\n    ");
                sbM21133.append(this.f36962[i].toString());
                string = sbM21133.toString();
            }
        }
        return string;
    }
}
