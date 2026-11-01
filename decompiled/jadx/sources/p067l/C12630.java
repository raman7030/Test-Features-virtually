package p067l;

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
public class C12630 extends C2798 {

    /* JADX INFO: renamed from: ֫ۧ */
    public C15172 f35446;

    /* JADX INFO: renamed from: ۜۧ */
    public final int[] f35447;

    /* JADX INFO: renamed from: ۟֫ */
    public InterfaceC4244 f35448;

    /* JADX INFO: renamed from: ۡۧ */
    public C12096 f35449;

    /* JADX INFO: renamed from: ۢۧ */
    public C12096 f35450;

    /* JADX INFO: renamed from: ۧۧ */
    public final RunnableC10258 f35451;

    /* JADX INFO: renamed from: ܳۧ */
    public boolean f35452;

    /* JADX INFO: renamed from: ܺۧ */
    public final int f35453;

    /* JADX INFO: renamed from: ܽۧ */
    public float f35454;

    /* JADX INFO: renamed from: ܿۧ */
    public ArrayList f35455;

    /* JADX INFO: renamed from: ᩳۧ */
    public float f35456;

    /* JADX INFO: renamed from: ᩷ۧ */
    public ArrayList f35457;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f35458;

    public C12630(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35457 = new ArrayList();
        this.f35447 = new int[2];
        this.f35451 = new RunnableC10258(2, this);
        this.f35453 = ViewConfiguration.get(context).getScaledTouchSlop();
        m4406(new C9138(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m29037(C12630 c12630) {
        c12630.f35452 = true;
        C15172 c15172 = c12630.f35446;
        if (c15172 != null && c15172.isAttachedToWindow() && c15172.isPressed()) {
            c15172.performLongClick();
        }
    }

    @Override // p067l.C2798, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        RunnableC10258 runnableC10258 = this.f35451;
        if (actionMasked == 0) {
            View viewM50000 = C22187.m50000(this, motionEvent.getX(), motionEvent.getY());
            if (viewM50000 instanceof C15172) {
                C15172 c15172 = (C15172) viewM50000;
                this.f35454 = motionEvent.getX();
                this.f35456 = motionEvent.getY();
                this.f35446 = c15172;
                int[] iArr = this.f35447;
                getLocationInWindow(iArr);
                int i = (int) (iArr[0] + this.f35454);
                int i2 = (int) (iArr[1] + this.f35456);
                c15172.getLocationInWindow(iArr);
                this.f35446.drawableHotspotChanged(i - iArr[0], i2 - iArr[1]);
                this.f35446.setPressed(true);
                this.f35452 = false;
                this.f35458 = false;
                Handler handlerM16221 = C7050.m16221();
                handlerM16221.removeCallbacks(runnableC10258);
                handlerM16221.postDelayed(runnableC10258, ViewConfiguration.getLongPressTimeout());
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.f35458 && this.f35446 != null) {
                    float fAbs = Math.abs(this.f35454 - motionEvent.getX());
                    float f = this.f35453;
                    if (fAbs > f || Math.abs(this.f35456 - motionEvent.getY()) > f) {
                        this.f35458 = true;
                        if (!this.f35452) {
                            C7050.m16221().removeCallbacks(runnableC10258);
                        }
                        this.f35446.setPressed(false);
                        this.f35446 = null;
                    }
                }
            } else if (actionMasked == 3 && this.f35446 != null) {
                if (!this.f35452) {
                    C7050.m16221().removeCallbacks(runnableC10258);
                }
                this.f35446.setPressed(false);
                this.f35446 = null;
            }
        } else if (this.f35446 != null) {
            if (!this.f35452) {
                C7050.m16221().removeCallbacks(runnableC10258);
                this.f35446.performClick();
            }
            this.f35446.setPressed(false);
            this.f35446 = null;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // p067l.C2798, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        for (C3912 c3912 : this.f35457) {
            int i4 = c3912.f8494;
            C13162 c13162 = c3912.f8497;
            if (i4 != i) {
                c13162.measure(i, 0);
                c3912.f8498 = c13162.getMeasuredHeight();
                c3912.f8496 = c13162.m30155();
                c3912.f8494 = i;
            }
            int i5 = c3912.f8498;
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

    /* JADX INFO: renamed from: ֫ */
    public final void m29041(ArrayList arrayList, InterfaceC4244 interfaceC4244, C12096 c12096, C12096 c12097) {
        this.f35448 = interfaceC4244;
        this.f35449 = c12096;
        this.f35450 = c12097;
        m29040(arrayList);
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
    /* JADX INFO: renamed from: ֫ */
    public final void m29040(ArrayList arrayList) {
        ArrayList<C3912> arrayList2;
        int i;
        C15172 c15172;
        if (this.f35448 == null || this.f35449 == null || this.f35450 == null) {
            return;
        }
        this.f35455 = arrayList;
        int size = arrayList.size();
        while (true) {
            arrayList2 = this.f35457;
            if (size <= arrayList2.size()) {
                break;
            } else {
                arrayList2.add(new C3912(this, arrayList2.size()));
            }
        }
        while (size < arrayList2.size()) {
            C19925.m45229(arrayList2, 1);
        }
        for (C3912 c3912 : arrayList2) {
            int i2 = c3912.f8493;
            C13162 c13162 = c3912.f8497;
            List listM17411 = ((C7517) arrayList.get(i2)).m17411();
            C12630 c12630 = c3912.f8495;
            InterfaceC4244 interfaceC4244 = c12630.f35448;
            C12096 c12096 = c12630.f35449;
            C12096 c12097 = c12630.f35450;
            int childCount = c13162.getChildCount();
            ArrayList arrayList3 = new ArrayList(childCount);
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = c13162.getChildAt(i3);
                if (childAt instanceof C15172) {
                    arrayList3.add((C15172) childAt);
                }
            }
            c13162.removeAllViews();
            int i4 = 0;
            for (C16903 c16903 : (ArrayList) listM17411) {
                if (i4 < arrayList3.size()) {
                    i = i4 + 1;
                    c15172 = (C15172) arrayList3.get(i4);
                } else {
                    i = i4;
                    c15172 = new C15172(c13162.getContext());
                }
                c15172.getClass();
                c15172.setText(c16903.m38467());
                C14146 c14146Mo8623 = interfaceC4244.mo8623();
                if (c14146Mo8623 != null) {
                    c15172.setTextColor(c14146Mo8623.m32568());
                }
                ViewOnClickListenerC23890 viewOnClickListenerC23890 = new ViewOnClickListenerC23890(c16903, c12096, c12097, interfaceC4244);
                c15172.setOnClickListener(viewOnClickListenerC23890);
                c15172.setOnLongClickListener(viewOnClickListenerC23890);
                c15172.setClickable(false);
                c15172.setLongClickable(false);
                c13162.addView(c15172);
                i4 = i;
            }
            c3912.f8494 = 0;
            c13162.setScrollY(0);
            c13162.m30152();
            c13162.m30157();
        }
        int iM4415 = m4415();
        m4406(new C9138(this));
        if (iM4415 >= 0 && iM4415 < size) {
            m4420(iM4415);
        } else if (iM4415 == size) {
            m4420(iM4415 - 1);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m29042() {
        Iterator it = this.f35457.iterator();
        while (it.hasNext()) {
            int i = ((C3912) it.next()).f8496;
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C3912 m29044() {
        int iM4415 = m4415();
        if (iM4415 < 0) {
            return null;
        }
        ArrayList arrayList = this.f35457;
        if (iM4415 < arrayList.size()) {
            return (C3912) arrayList.get(iM4415);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m29043() {
        Iterator it = this.f35457.iterator();
        while (it.hasNext()) {
            C13162 c13162 = ((C3912) it.next()).f8497;
            c13162.setScrollY(0);
            c13162.m30152();
            c13162.m30157();
        }
    }
}
