package l;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10797 extends C0452 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C13472 f32470;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final int[] f32471;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1973 f32472;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public C10235 f32473;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C10235 f32474;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final RunnableC8301 f32475;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f32476;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public final int f32477;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public float f32478;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f32479;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public float f32480;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f32481;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f32482;

    public C10797(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32481 = new ArrayList();
        this.f32471 = new int[2];
        this.f32475 = new RunnableC8301(2, this);
        this.f32477 = ViewConfiguration.get(context).getScaledTouchSlop();
        m2029(new C7123(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26992(C10797 c10797) {
        c10797.f32476 = true;
        C13472 c13472 = c10797.f32470;
        if (c13472 != null && c13472.isAttachedToWindow() && c13472.isPressed()) {
            c13472.performLongClick();
        }
    }

    @Override // l.C0452, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        RunnableC8301 runnableC8301 = this.f32475;
        if (actionMasked == 0) {
            View viewM47672 = C20853.m47672(this, motionEvent.getX(), motionEvent.getY());
            if (viewM47672 instanceof C13472) {
                C13472 c13472 = (C13472) viewM47672;
                this.f32478 = motionEvent.getX();
                this.f32480 = motionEvent.getY();
                this.f32470 = c13472;
                int[] iArr = this.f32471;
                getLocationInWindow(iArr);
                int i = (int) (iArr[0] + this.f32478);
                int i2 = (int) (iArr[1] + this.f32480);
                c13472.getLocationInWindow(iArr);
                this.f32470.drawableHotspotChanged(i - iArr[0], i2 - iArr[1]);
                this.f32470.setPressed(true);
                this.f32476 = false;
                this.f32482 = false;
                Handler handlerM14324 = C4925.m14324();
                handlerM14324.removeCallbacks(runnableC8301);
                handlerM14324.postDelayed(runnableC8301, ViewConfiguration.getLongPressTimeout());
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.f32482 && this.f32470 != null) {
                    float fAbs = Math.abs(this.f32478 - motionEvent.getX());
                    float f = this.f32477;
                    if (fAbs > f || Math.abs(this.f32480 - motionEvent.getY()) > f) {
                        this.f32482 = true;
                        if (!this.f32476) {
                            C4925.m14324().removeCallbacks(runnableC8301);
                        }
                        this.f32470.setPressed(false);
                        this.f32470 = null;
                    }
                }
            } else if (actionMasked == 3 && this.f32470 != null) {
                if (!this.f32476) {
                    C4925.m14324().removeCallbacks(runnableC8301);
                }
                this.f32470.setPressed(false);
                this.f32470 = null;
            }
        } else if (this.f32470 != null) {
            if (!this.f32476) {
                C4925.m14324().removeCallbacks(runnableC8301);
                this.f32470.performClick();
            }
            this.f32470.setPressed(false);
            this.f32470 = null;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // l.C0452, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        for (C1624 c1624 : this.f32481) {
            int i4 = c1624.f5714;
            C11357 c11357 = c1624.f5717;
            if (i4 != i) {
                c11357.measure(i, 0);
                c1624.f5718 = c11357.getMeasuredHeight();
                c1624.f5716 = c11357.m28111();
                c1624.f5714 = i;
            }
            int i5 = c1624.f5718;
            if (i5 > i3) {
                i3 = i5;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        } else if (View.MeasureSpec.getSize(i2) > i3) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26996(ArrayList arrayList, InterfaceC1973 interfaceC1973, C10235 c10235, C10235 c10236) {
        this.f32472 = interfaceC1973;
        this.f32473 = c10235;
        this.f32474 = c10236;
        m26995(arrayList);
    }

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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26995(ArrayList arrayList) {
        ArrayList<C1624> arrayList2;
        int i;
        C13472 c13472;
        if (this.f32472 == null || this.f32473 == null || this.f32474 == null) {
            return;
        }
        this.f32479 = arrayList;
        int size = arrayList.size();
        while (true) {
            arrayList2 = this.f32481;
            if (size <= arrayList2.size()) {
                break;
            } else {
                arrayList2.add(new C1624(this, arrayList2.size()));
            }
        }
        while (size < arrayList2.size()) {
            C18473.m42953(arrayList2, 1);
        }
        for (C1624 c1624 : arrayList2) {
            int i2 = c1624.f5713;
            C11357 c11357 = c1624.f5717;
            List listM15500 = ((C5417) arrayList.get(i2)).m15500();
            C10797 c10797 = c1624.f5715;
            InterfaceC1973 interfaceC1973 = c10797.f32472;
            C10235 c10235 = c10797.f32473;
            C10235 c10236 = c10797.f32474;
            int childCount = c11357.getChildCount();
            ArrayList arrayList3 = new ArrayList(childCount);
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = c11357.getChildAt(i3);
                if (childAt instanceof C13472) {
                    arrayList3.add((C13472) childAt);
                }
            }
            c11357.removeAllViews();
            int i4 = 0;
            for (C15293 c15293 : (ArrayList) listM15500) {
                if (i4 < arrayList3.size()) {
                    i = i4 + 1;
                    c13472 = (C13472) arrayList3.get(i4);
                } else {
                    i = i4;
                    c13472 = new C13472(c11357.getContext());
                }
                c13472.getClass();
                c13472.setText(c15293.m36306());
                C12392 c12392Mo6482 = interfaceC1973.mo6482();
                if (c12392Mo6482 != null) {
                    c13472.setTextColor(c12392Mo6482.m30504());
                }
                ViewOnClickListenerC22645 viewOnClickListenerC22645 = new ViewOnClickListenerC22645(c15293, c10235, c10236, interfaceC1973);
                c13472.setOnClickListener(viewOnClickListenerC22645);
                c13472.setOnLongClickListener(viewOnClickListenerC22645);
                c13472.setClickable(false);
                c13472.setLongClickable(false);
                c11357.addView(c13472);
                i4 = i;
            }
            c1624.f5714 = 0;
            c11357.setScrollY(0);
            c11357.m28108();
            c11357.m28113();
        }
        int iM2038 = m2038();
        m2029(new C7123(this));
        if (iM2038 >= 0 && iM2038 < size) {
            m2043(iM2038);
        } else if (iM2038 == size) {
            m2043(iM2038 - 1);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m26997() {
        Iterator it = this.f32481.iterator();
        while (it.hasNext()) {
            int i = ((C1624) it.next()).f5716;
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1624 m26999() {
        int iM2038 = m2038();
        if (iM2038 < 0) {
            return null;
        }
        ArrayList arrayList = this.f32481;
        if (iM2038 < arrayList.size()) {
            return (C1624) arrayList.get(iM2038);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26998() {
        Iterator it = this.f32481.iterator();
        while (it.hasNext()) {
            C11357 c11357 = ((C1624) it.next()).f5717;
            c11357.setScrollY(0);
            c11357.m28108();
            c11357.m28113();
        }
    }
}
