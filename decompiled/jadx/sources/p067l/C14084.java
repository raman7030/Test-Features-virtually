package p067l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final class C14084 {

    /* JADX INFO: renamed from: ᩶ */
    public static long f39909;

    /* JADX INFO: renamed from: ᩹ */
    public static int f39910;

    /* JADX INFO: renamed from: ֡ */
    public AbstractC18422 f39911;

    /* JADX INFO: renamed from: ֨ */
    public final C11400 f39912;

    /* JADX INFO: renamed from: ֫ */
    public final C14352 f39913;

    /* JADX INFO: renamed from: ۖ */
    public String f39914;

    /* JADX INFO: renamed from: ۘ */
    public final ViewTreeObserverOnPreDrawListenerC2684 f39915;

    /* JADX INFO: renamed from: ۚ */
    public boolean f39916;

    /* JADX INFO: renamed from: ۜ */
    public int f39917;

    /* JADX INFO: renamed from: ۠ */
    public ViewTreeObserverOnPreDrawListenerC6708 f39918;

    /* JADX INFO: renamed from: ۡ */
    public int f39919;

    /* JADX INFO: renamed from: ۢ */
    public long f39920;

    /* JADX INFO: renamed from: ۧ */
    public int f39921;

    /* JADX INFO: renamed from: ܳ */
    public List f39922;

    /* JADX INFO: renamed from: ܶ */
    public final ViewOnTouchListenerC6685 f39923;

    /* JADX INFO: renamed from: ܺ */
    public int f39924;

    /* JADX INFO: renamed from: ܽ */
    public int[] f39925;

    /* JADX INFO: renamed from: ܿ */
    public long f39926;

    /* JADX INFO: renamed from: ᩳ */
    public String f39927;

    /* JADX INFO: renamed from: ᩴ */
    public final C24536 f39928;

    /* JADX INFO: renamed from: ᩵ */
    public final C15818 f39929;

    /* JADX INFO: renamed from: ᩷ */
    public final RunnableC20791 f39930;

    /* JADX INFO: renamed from: ᩸ */
    public final C18107 f39931;

    /* JADX INFO: renamed from: ᩻ */
    public int f39932;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.ViewTreeObserver$OnPreDrawListener, l.֡ۢܳ] */
    public C14084(C18107 c18107, final C11400 c11400) {
        C14352 c14352 = new C14352(new C21461(this));
        this.f39913 = c14352;
        this.f39929 = new C15818();
        this.f39922 = Collections.EMPTY_LIST;
        this.f39917 = -1;
        this.f39919 = -1;
        this.f39924 = -1;
        this.f39921 = -1;
        this.f39925 = new int[0];
        this.f39916 = true;
        this.f39920 = C14849.FOREVER_NS;
        this.f39930 = new RunnableC20791(0, this);
        ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.֡ۢܳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C14084.m31960(this.f4505);
                return true;
            }
        };
        this.f39915 = r1;
        this.f39931 = c18107;
        this.f39912 = c11400;
        this.f39923 = new ViewOnTouchListenerC6685(this, c11400);
        c14352.m15992(c11400);
        c11400.setAdapter((ListAdapter) c14352);
        this.f39928 = new C24536(new C7379(this), new C3355(0, this));
        c11400.getViewTreeObserver().addOnPreDrawListener(r1);
        c11400.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC22802(this));
        c18107.m41282().getLifecycle().mo21806(new InterfaceC18749() { // from class: l.۠ۢܳ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                C14084.m31964(this.f27839, c11400, interfaceC24784, enumC24133);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m31964(C14084 c14084, C11400 c11400, InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_DESTROY) {
            c14084.m31974();
            c11400.getViewTreeObserver().removeOnPreDrawListener(c14084.f39915);
        } else if (interfaceC24784.getLifecycle().mo21805().m35142(EnumC15415.STARTED)) {
            c14084.m31958(0L);
        } else {
            c14084.m31974();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31981(String str) {
        this.f39927 = str;
        this.f39926 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31985(String str) {
        m31959(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m31959(String str, boolean z) {
        C14754 c14754;
        InterfaceC19370 interfaceC19370;
        int iM51761;
        C11400 c11400 = this.f39912;
        int childCount = c11400.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            Object tag = c11400.getChildAt(i2).getTag();
            if ((tag instanceof C14754) && (interfaceC19370 = (c14754 = (C14754) tag).f42071) != null && interfaceC19370.isDirectory() == z && interfaceC19370.getPath().equals(str)) {
                if (z) {
                    iM51761 = C23223.m51761(553648127, 620756991);
                } else {
                    iM51761 = C23223.m51761(889192447, 822083583);
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(iM51761 & C23223.f72995), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                c14754.f42066.setBackground(transitionDrawable);
                if (z) {
                    transitionDrawable.startTransition(EnumC5674.f13824);
                    return;
                } else {
                    C7050.m16213(new RunnableC6038(i, transitionDrawable), 250L);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31979(int i, String str, String str2, List list) {
        ViewTreeObserverOnPreDrawListenerC6708 viewTreeObserverOnPreDrawListenerC6708 = this.f39918;
        if (viewTreeObserverOnPreDrawListenerC6708 != null) {
            viewTreeObserverOnPreDrawListenerC6708.m15305();
        }
        this.f39918 = new ViewTreeObserverOnPreDrawListenerC6708(this, i, str, str2, list);
        this.f39931.m41282().getLifecycle().mo21806(this.f39918);
        C11400 c11400 = this.f39912;
        c11400.getViewTreeObserver().addOnPreDrawListener(this.f39918);
        c11400.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31976() {
        return this.f39912.getFirstVisiblePosition();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31984(int i) {
        this.f39912.setSelection(i);
        C7050.m16213(new RunnableC20120(i, 0, this), 100L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m31961(C14084 c14084, int i) {
        C11400 c11400 = c14084.f39912;
        int firstVisiblePosition = c11400.getFirstVisiblePosition();
        int lastVisiblePosition = c11400.getLastVisiblePosition();
        if (i < firstVisiblePosition || lastVisiblePosition < i) {
            c11400.setSelection(i);
        }
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
    public final void m31977(int i, int i2, String str, C25128 c25128) {
        m31981((String) null);
        C11400 c11400 = this.f39912;
        c11400.setSelection(i);
        ViewTreeObserverOnPreDrawListenerC23472 viewTreeObserverOnPreDrawListenerC23472 = new ViewTreeObserverOnPreDrawListenerC23472(this, c25128, i2, new RunnableC16765(0, this, str));
        c11400.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC23472);
        c11400.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC23472);
        c11400.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31980(int i, C3670 c3670) {
        ViewTreeObserverOnPreDrawListenerC23472 viewTreeObserverOnPreDrawListenerC23472 = new ViewTreeObserverOnPreDrawListenerC23472(this, c3670, i, null);
        C11400 c11400 = this.f39912;
        c11400.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC23472);
        c11400.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC23472);
        c11400.invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public static C18699 m31957(C14084 c14084, int i, View view, ViewGroup viewGroup) {
        C18699 c18699;
        View view2;
        C18107 c18107 = c14084.f39931;
        C14754 c14754 = view != null ? (C14754) view.getTag() : null;
        boolean z = false;
        if (view instanceof C18699) {
            C18699 c186910 = (C18699) view;
            c186910.m42659();
            view2 = view;
            c18699 = c186910;
        } else {
            C18699 c186911 = new C18699(viewGroup.getContext());
            c14754 = new C14754(z ? 1 : 0);
            c14754.f42066 = c186911.m42662();
            c14754.f42074 = c186911.m42668();
            c14754.f42068 = c186911.m42661();
            c14754.f42070 = c186911.m42663();
            c14754.f42069 = c186911.m42664();
            c14754.f42072 = c186911.m42665();
            c14754.f42073 = c186911.m42666();
            c186911.setTag(c14754);
            c18699 = c186911;
            view2 = c186911;
        }
        String str = c14084.f39927;
        if (str != null && System.currentTimeMillis() - c14084.f39926 > 800) {
            str = null;
        }
        try {
            InterfaceC19370 interfaceC19370M41220 = c18107.m41220(i);
            c14754.f42071 = interfaceC19370M41220;
            if (!c18107.m41265() || interfaceC19370M41220.isDirectory() || interfaceC19370M41220.mo39148()) {
                view2.setAlpha(1.0f);
            } else {
                view2.setAlpha(0.4f);
            }
            if (c18107.f54069.m39714()) {
                view2.setBackgroundColor(interfaceC19370M41220.isChecked() ? C23223.f72997 : 0);
            } else {
                view2.setBackgroundColor(0);
            }
            if (interfaceC19370M41220.mo39134()) {
                c18699.m42660(true);
                c14754.f42073.setText(interfaceC19370M41220.getName());
            } else {
                c18699.m42660(false);
                if (interfaceC19370M41220.mo39149()) {
                    c14754.f42074.setTextColor(C23223.f73002);
                } else {
                    c14754.f42074.setTextColor(C23223.f72986);
                }
                c14754.f42074.setText(interfaceC19370M41220.mo39151());
                if (str != null && str.equals(interfaceC19370M41220.getPath())) {
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C23223.f72995 & C23223.m51761(553648127, 620756991)), new ColorDrawable(0)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    c14754.f42066.setBackground(transitionDrawable);
                    transitionDrawable.startTransition(EnumC5674.f13824);
                    c14084.f39927 = null;
                } else if (c14754.f42066.getBackground() != null) {
                    c14754.f42066.setBackground(null);
                }
                CharSequence charSequenceMo31782 = interfaceC19370M41220.mo31782();
                if (charSequenceMo31782 != null) {
                    c14754.f42068.setText(charSequenceMo31782);
                } else if (interfaceC19370M41220.mo26449()) {
                    long jMo39145 = interfaceC19370M41220.mo39145();
                    if (jMo39145 == -1) {
                        jMo39145 = interfaceC19370M41220.getSize();
                    }
                    c14754.f42068.setText(C24158.m53411(jMo39145));
                } else {
                    c14754.f42068.setText((CharSequence) null);
                }
                if (interfaceC19370M41220.mo39148()) {
                    c14754.f42070.setVisibility(4);
                    c14754.f42070.setText((CharSequence) null);
                    c14754.f42069.setText((CharSequence) null);
                    if (c14754.f42069.getVisibility() != 0) {
                        c14754.f42069.setVisibility(0);
                    }
                } else if (interfaceC19370M41220.mo39138()) {
                    c14754.f42070.setVisibility(4);
                    c14754.f42070.setText((CharSequence) null);
                    c14754.f42069.setVisibility(8);
                } else {
                    if (interfaceC19370M41220.mo39144()) {
                        c14754.f42070.setVisibility(0);
                        c14754.f42070.setText("->");
                    } else if (interfaceC19370M41220.mo27882()) {
                        c14754.f42070.setVisibility(0);
                        c14754.f42070.setText("* ");
                    } else {
                        c14754.f42070.setVisibility(4);
                        c14754.f42070.setText(" ");
                    }
                    CharSequence charSequenceMo23149 = interfaceC19370M41220.mo23149();
                    if (charSequenceMo23149 == null) {
                        int i2 = C21272.f66923;
                        charSequenceMo23149 = C18794.m42824(interfaceC19370M41220.getTime(), (i2 & 1) != 0, (i2 & 2) != 0);
                    }
                    c14754.f42069.setText(charSequenceMo23149);
                    if (c14754.f42069.getVisibility() != 0) {
                        c14754.f42069.setVisibility(0);
                    }
                }
                C13596 icon = interfaceC19370M41220.getIcon();
                if (icon != null) {
                    c14754.f42072.setImageDrawable(icon.m30927());
                }
            }
            int i3 = c14754.f42067;
            int i4 = C21272.f66922;
            if (i3 != i4) {
                c14754.f42067 = i4;
                c14754.f42074.setSingleLine(i4 == 1);
                c14754.f42074.setMaxLines(c14754.f42067);
            }
            int i5 = c14754.f42075;
            int i6 = C21272.f66913;
            if (i5 != i6) {
                c14754.f42075 = i6;
                if (i6 == 1) {
                    c14754.f42073.setTextSize(2, 15.0f);
                    c14754.f42074.setTextSize(2, 13.0f);
                    c14754.f42068.setTextSize(2, 10.0f);
                    c14754.f42070.setTextSize(2, 10.0f);
                    c14754.f42069.setTextSize(2, 10.0f);
                } else if (i6 == 2) {
                    c14754.f42073.setTextSize(2, 17.0f);
                    c14754.f42074.setTextSize(2, 15.0f);
                    c14754.f42068.setTextSize(2, 11.0f);
                    c14754.f42070.setTextSize(2, 11.0f);
                    c14754.f42069.setTextSize(2, 11.0f);
                } else if (i6 == 3) {
                    c14754.f42073.setTextSize(2, 19.0f);
                    c14754.f42074.setTextSize(2, 17.0f);
                    c14754.f42068.setTextSize(2, 12.0f);
                    c14754.f42070.setTextSize(2, 12.0f);
                    c14754.f42069.setTextSize(2, 12.0f);
                }
            }
        } catch (Exception unused) {
        }
        return (C18699) view2;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m31971(int i) {
        f39910 = i;
        f39909 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31983() {
        m31968();
        C18107 c18107 = this.f39931;
        InterfaceC12665 interfaceC12665Mo16735 = c18107.m41270().mo16735();
        for (InterfaceC19370 interfaceC19370 : c18107.m41254()) {
            if (interfaceC19370.getIcon() == null) {
                interfaceC19370.mo39133(interfaceC12665Mo16735.mo13204(interfaceC19370));
                int iMo11393 = interfaceC12665Mo16735.mo11393(interfaceC19370);
                if (iMo11393 != 0) {
                    interfaceC19370.mo39140(iMo11393);
                }
            }
        }
        long j = f39909 + ((long) f39910);
        long jUptimeMillis = SystemClock.uptimeMillis();
        C14352 c14352 = this.f39913;
        if (j > jUptimeMillis) {
            c14352.m12528(false);
        } else {
            c14352.m12528(true);
            c14352.m12530();
        }
        c14352.notifyDataSetChanged();
        m31958(0L);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m31988() {
        m31968();
        C18107 c18107 = this.f39931;
        InterfaceC12665 interfaceC12665Mo16735 = c18107.m41270().mo16735();
        for (InterfaceC19370 interfaceC19370 : c18107.m41254()) {
            interfaceC19370.mo39133(interfaceC12665Mo16735.mo13204(interfaceC19370));
            int iMo11393 = interfaceC12665Mo16735.mo11393(interfaceC19370);
            if (iMo11393 != 0) {
                interfaceC19370.mo39140(iMo11393);
            }
        }
        this.f39913.notifyDataSetChanged();
        m31958(0L);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m31987() {
        m31968();
        C14352 c14352 = this.f39913;
        c14352.m12528(false);
        c14352.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m31967(C14084 c14084) {
        c14084.f39920 = C14849.FOREVER_NS;
        c14084.f39912.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m31958(long j) {
        if (this.f39931.m41282().getLifecycle().mo21805() == EnumC15415.DESTROYED) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + j;
        if (jUptimeMillis >= this.f39920) {
            return;
        }
        C11400 c11400 = this.f39912;
        RunnableC20791 runnableC20791 = this.f39930;
        c11400.removeCallbacks(runnableC20791);
        this.f39920 = jUptimeMillis;
        c11400.postOnAnimationDelayed(runnableC20791, j);
    }

    /* JADX INFO: renamed from: ܳ */
    private void m31968() {
        this.f39928.m54114();
        this.f39929.m35895();
        this.f39922 = Collections.EMPTY_LIST;
        this.f39921 = -1;
        this.f39924 = -1;
        this.f39919 = -1;
        this.f39917 = -1;
        this.f39925 = new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public void m31974() {
        if (!this.f39916) {
            m31968();
        }
        this.f39916 = true;
        this.f39912.removeCallbacks(this.f39930);
        this.f39920 = C14849.FOREVER_NS;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX INFO: renamed from: ֫ */
    public static void m31960(C14084 c14084) {
        int i;
        int i2;
        int iCompare;
        int i3;
        int i4;
        int top;
        C11400 c11400 = c14084.f39912;
        C18107 c18107 = c14084.f39931;
        if (!c18107.m41282().getLifecycle().mo21805().m35142(EnumC15415.STARTED) || !c11400.isShown() || !c11400.isAttachedToWindow()) {
            c14084.m31974();
            return;
        }
        if (c18107.m41266()) {
            c14084.m31974();
            c14084.m31958(80L);
            return;
        }
        c14084.f39916 = false;
        AbstractC18422 abstractC18422M41270 = c18107.m41270();
        if (abstractC18422M41270 != c14084.f39911 || !C12826.equals(abstractC18422M41270.m41982(), c14084.f39914)) {
            c14084.m31968();
            c14084.f39911 = abstractC18422M41270;
            c14084.f39914 = abstractC18422M41270.m41982();
        }
        int firstVisiblePosition = c11400.getFirstVisiblePosition();
        int childCount = c11400.getChildCount();
        int i5 = (firstVisiblePosition + childCount) - 1;
        if (childCount <= 0 || (i2 = c14084.f39921) < 0) {
            i = 0;
        } else {
            if (firstVisiblePosition >= i2) {
                int i6 = firstVisiblePosition - i2;
                int[] iArr = c14084.f39925;
                if (i6 < iArr.length) {
                    i4 = iArr[i6];
                    top = c11400.getChildAt(0).getTop();
                } else if (i2 < firstVisiblePosition && (i3 = i2 - firstVisiblePosition) < childCount) {
                    i4 = c14084.f39925[0];
                    top = c11400.getChildAt(i3).getTop();
                } else {
                    iCompare = Integer.compare(firstVisiblePosition, i2) * c11400.getHeight();
                }
                iCompare = i4 - top;
            } else {
                if (i2 < firstVisiblePosition) {
                }
                iCompare = Integer.compare(firstVisiblePosition, i2) * c11400.getHeight();
            }
            i = iCompare;
        }
        if (c14084.f39925.length != childCount) {
            c14084.f39925 = new int[childCount];
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            c14084.f39925[i7] = c11400.getChildAt(i7).getTop();
        }
        c14084.f39921 = childCount == 0 ? -1 : firstVisiblePosition;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int iM35894 = c14084.f39929.m35894(jUptimeMillis, i, c11400.getHeight(), c11400.m26368(), c11400.m26367());
        int iM35893 = c14084.f39929.m35893();
        if (firstVisiblePosition != c14084.f39917 || i5 != c14084.f39919 || iM35894 != c14084.f39924 || iM35893 != c14084.f39932) {
            c14084.f39922 = C15818.m35891(c18107.m41240(), firstVisiblePosition, i5, iM35894, iM35893);
            c14084.f39917 = firstVisiblePosition;
            c14084.f39919 = i5;
            c14084.f39924 = iM35894;
            c14084.f39932 = iM35893;
        }
        c14084.f39928.m54115(c14084.f39922, childCount, abstractC18422M41270, abstractC18422M41270.mo16735(), iM35894, jUptimeMillis);
        if (c11400.m26368()) {
            c14084.m31958(80L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31965(C14084 c14084, InterfaceC19370 interfaceC19370) {
        C11400 c11400 = c14084.f39912;
        int childCount = c11400.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = c11400.getChildAt(i).getTag();
            if (tag instanceof C14754) {
                C14754 c14754 = (C14754) tag;
                C13596 icon = interfaceC19370.getIcon();
                if (c14754.f42071 == interfaceC19370 && icon != null) {
                    C1732 c1732 = c14754.f42072;
                    if (c11400.m26368()) {
                        c1732.setImageDrawable(icon.m30927());
                        return;
                    }
                    Drawable drawable = c1732.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m30927()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    c1732.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31978(int i, View view) {
        view.setBackgroundColor(C23223.f72997);
        C17436 c17436 = this.f39931.f54069;
        if (!c17436.m39714()) {
            c17436.m39712(i);
        } else if (c17436.m39709(i)) {
            m31987();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31986() {
        ApplicationC21448.m48581(this.f39931.f54069.m39710());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31982(int i) {
        List listM41240;
        C18107 c18107 = this.f39931;
        if (!c18107.m41265() && (listM41240 = c18107.m41240()) != null && i >= 0 && i < listM41240.size()) {
            return !((InterfaceC19370) listM41240.get(i)).mo39147();
        }
        return false;
    }
}
