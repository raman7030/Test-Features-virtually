package p067l;

import android.R;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۗۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5232 {

    /* JADX INFO: renamed from: ֡ */
    public final Interpolator f12287;

    /* JADX INFO: renamed from: ֨ */
    public Size f12288;

    /* JADX INFO: renamed from: ֫ */
    public final HandlerC9926 f12289;

    /* JADX INFO: renamed from: ۖ֫ */
    public EnumC14619 f12292;

    /* JADX INFO: renamed from: ۗ */
    public boolean f12293;

    /* JADX INFO: renamed from: ۘ */
    public boolean f12294;

    /* JADX INFO: renamed from: ۙ */
    public final AnimationSet f12295;

    /* JADX INFO: renamed from: ۚ */
    public final ViewGroup f12296;

    /* JADX INFO: renamed from: ۛ */
    public final C21326 f12297;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f12299;

    /* JADX INFO: renamed from: ۟ */
    public final PopupWindow f12300;

    /* JADX INFO: renamed from: ۠ */
    public final int f12301;

    /* JADX INFO: renamed from: ۡ */
    public final AnimatorSet f12302;

    /* JADX INFO: renamed from: ۡ֫ */
    public EnumC14619 f12303;

    /* JADX INFO: renamed from: ۢ */
    public final Interpolator f12304;

    /* JADX INFO: renamed from: ۤ */
    public final Size f12306;

    /* JADX INFO: renamed from: ۧ */
    public final Drawable f12307;

    /* JADX INFO: renamed from: ۨ */
    public Size f12309;

    /* JADX INFO: renamed from: ۫ */
    public final ImageButton f12310;

    /* JADX INFO: renamed from: ۬ */
    public final Drawable f12311;

    /* JADX INFO: renamed from: ܰ */
    public final View f12312;

    /* JADX INFO: renamed from: ܳ֫ */
    public final AnimatedVectorDrawable f12314;

    /* JADX INFO: renamed from: ܶ */
    public final int f12315;

    /* JADX INFO: renamed from: ܺ */
    public final int f12316;

    /* JADX INFO: renamed from: ܺ֫ */
    public C8347 f12317;

    /* JADX INFO: renamed from: ܽ */
    public final AnimationSet f12318;

    /* JADX INFO: renamed from: ܽ֫ */
    public final AnimatorSet f12319;

    /* JADX INFO: renamed from: ܿ */
    public final ContextThemeWrapper f12320;

    /* JADX INFO: renamed from: ܿ֫ */
    public final AnimatedVectorDrawable f12321;

    /* JADX INFO: renamed from: ᩳ */
    public final ViewGroup f12322;

    /* JADX INFO: renamed from: ᩴ */
    public final int f12324;

    /* JADX INFO: renamed from: ᩵ */
    public final Interpolator f12325;

    /* JADX INFO: renamed from: ᩶ */
    public MenuItemOnMenuItemClickListenerC12371 f12326;

    /* JADX INFO: renamed from: ᩷ */
    public final Interpolator f12327;

    /* JADX INFO: renamed from: ᩺ */
    public final C6573 f12331;

    /* JADX INFO: renamed from: ᩻ */
    public final AnimatorSet f12332;

    /* JADX INFO: renamed from: ᩷֫ */
    public final Rect f12328 = new Rect();

    /* JADX INFO: renamed from: ܳ */
    public final Point f12313 = new Point();

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int[] f12323 = new int[2];

    /* JADX INFO: renamed from: ᩻֫ */
    public final Region f12333 = new Region();

    /* JADX INFO: renamed from: ۖ */
    public final Object f12291 = C10154.m23664(new C17972(this));

    /* JADX INFO: renamed from: ֫֫ */
    public final Runnable f12290 = new RunnableC10597(this);

    /* JADX INFO: renamed from: ۜ */
    public boolean f12298 = true;

    /* JADX INFO: renamed from: ᩹ */
    public final LinkedHashMap f12330 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩸ */
    public final View.OnClickListener f12329 = new ViewOnClickListenerC17301(this);

    /* JADX INFO: renamed from: ۧ֫ */
    public final Rect f12308 = new Rect();

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f12305 = true;

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m11251(C5232 c5232, C7472 c7472) {
        c7472.m17252().setEmpty();
        c7472.m17254().setEmpty();
        c7472.m17253().set(c5232.f12333);
        c7472.m17255();
    }

    public C5232(Context context, View view) {
        boolean z;
        EnumC14619 enumC14619 = EnumC14619.PREFER_SHOW_ALL;
        this.f12303 = enumC14619;
        this.f12292 = enumC14619;
        HandlerC9926 handlerC9926 = new HandlerC9926(this);
        this.f12289 = handlerC9926;
        this.f12312 = view;
        if (Build.VERSION.SDK_INT >= 29) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.isLightTheme});
            z = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            z = true;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, z ? R.style.Theme.DeviceDefault.Light : R.style.Theme.DeviceDefault);
        this.f12320 = contextThemeWrapper;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(bin.p000mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.setTag("floating_toolbar");
        viewGroup.setContentDescription("floating_toolbar");
        viewGroup.setClipToOutline(true);
        this.f12322 = viewGroup;
        C16630 c16630 = new C16630(viewGroup.getContext(), handlerC9926);
        PopupWindow popupWindow = new PopupWindow(c16630);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c16630.addView(viewGroup);
        this.f12300 = popupWindow;
        this.f12301 = view.getResources().getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector);
        this.f12315 = view.getResources().getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector);
        this.f12324 = context.getResources().getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector);
        this.f12316 = dimensionPixelSize;
        this.f12287 = new InterpolatorC22667();
        this.f12304 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_slow_in);
        this.f12325 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.linear_out_slow_in);
        this.f12327 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_linear_in);
        Drawable drawable = contextThemeWrapper.getResources().getDrawable(bin.p000mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f12307 = drawable;
        drawable.setAutoMirrored(true);
        Drawable drawable2 = contextThemeWrapper.getResources().getDrawable(bin.p000mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f12311 = drawable2;
        drawable2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.p000mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f12321 = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.p000mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f12314 = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        final ImageButton imageButton = (ImageButton) LayoutInflater.from(contextThemeWrapper).inflate(bin.p000mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        imageButton.setImageDrawable(drawable2);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.ܿۙܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5232.m11250(this.f55654, imageButton);
            }
        });
        imageButton.setOnTouchListener(new ViewOnTouchListenerC12609(this));
        this.f12310 = imageButton;
        if (!(imageButton.getParent() == null)) {
            throw new IllegalStateException((String) null);
        }
        imageButton.measure(0, 0);
        this.f12306 = new Size(imageButton.getMeasuredWidth(), imageButton.getMeasuredHeight());
        this.f12296 = new C24678(this, contextThemeWrapper);
        this.f12331 = new C6573(this, contextThemeWrapper, dimensionPixelSize);
        final C21326 c21326 = new C21326(this);
        c21326.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c21326.setDivider(null);
        c21326.setDividerHeight(0);
        c21326.setAdapter((ListAdapter) new C8585(this, contextThemeWrapper));
        c21326.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳۙܿ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                C5232.m11252(this.f57672, c21326, i);
            }
        });
        this.f12297 = c21326;
        AnimationAnimationListenerC11268 animationAnimationListenerC11268 = new AnimationAnimationListenerC11268(this);
        AnimationSet animationSet = new AnimationSet(true);
        this.f12295 = animationSet;
        animationSet.setAnimationListener(animationAnimationListenerC11268);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f12318 = animationSet2;
        animationSet2.setAnimationListener(animationAnimationListenerC11268);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.f12319 = animatorSet;
        this.f12332 = m11239(viewGroup, 150, new C4562(this));
        this.f12302 = m11239(viewGroup, 0, new C5903(this));
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m11284() {
        int i = this.f12324;
        int i2 = this.f12315;
        return i + i2 + i2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11247(ArrayList arrayList, MenuItemOnMenuItemClickListenerC12371 menuItemOnMenuItemClickListenerC12371) {
        LinkedHashMap linkedHashMap = this.f12330;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            linkedHashMap.put(C23337.m51980(menuItem), menuItem);
        }
        this.f12326 = menuItemOnMenuItemClickListenerC12371;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m11285() {
        this.f12305 = true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0103  */
    /* JADX WARN: Code duplicated, block: B:31:0x011e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x0129  */
    /* JADX WARN: Code duplicated, block: B:37:0x012c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0159  */
    /* JADX WARN: Code duplicated, block: B:41:0x015b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0162  */
    /* JADX WARN: Code duplicated, block: B:50:0x017f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8 A[LOOP:3: B:65:0x01e6->B:66:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0202  */
    /* JADX WARN: Code duplicated, block: B:73:0x0216 A[LOOP:4: B:72:0x0214->B:73:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0249  */
    /* JADX INFO: renamed from: ֫ */
    public final void m11281(ArrayList arrayList, MenuItemOnMenuItemClickListenerC12371 menuItemOnMenuItemClickListenerC12371, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C21326 c21326;
        int iMin;
        LinkedList linkedList;
        LinkedList linkedList2;
        Iterator it;
        boolean z;
        int i;
        boolean zIsEmpty;
        Size size;
        int i2;
        boolean z2;
        ArrayAdapter arrayAdapter;
        int size2;
        int i3;
        C21326 c21327;
        int count;
        int i4;
        int iMax;
        MenuItem menuItem;
        View viewInflate;
        boolean z3;
        int iMin2;
        boolean z4;
        boolean z5;
        CharSequence tooltipText;
        MenuItem menuItem2;
        this.f12289.m23224();
        Collection collectionValues = this.f12330.values();
        int size3 = arrayList.size();
        int size4 = collectionValues.size();
        View view = this.f12312;
        boolean z6 = true;
        if (size3 != size4) {
            m11278();
            m11271();
            viewGroup = null;
            this.f12309 = null;
            this.f12288 = null;
            this.f12294 = false;
            viewGroup2 = this.f12296;
            viewGroup2.removeAllViews();
            c21326 = this.f12297;
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) c21326.getAdapter();
            arrayAdapter2.clear();
            c21326.setAdapter((ListAdapter) arrayAdapter2);
            this.f12322.removeAllViews();
            m11247(arrayList, menuItemOnMenuItemClickListenerC12371);
            Rect rect2 = this.f12328;
            view.getWindowVisibleDisplayFrame(rect2);
            iMin = Math.min(view.getResources().getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector), rect2.width() - (view.getResources().getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector) * 2));
            linkedList = new LinkedList();
            linkedList2 = new LinkedList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                menuItem2 = (MenuItem) it.next();
                if (((InterfaceMenuItemC1528) menuItem2).mo18387()) {
                    linkedList2.add(menuItem2);
                } else {
                    linkedList.add(menuItem2);
                }
            }
            linkedList.addAll(linkedList2);
            viewGroup2.removeAllViews();
            viewGroup2.setPaddingRelative(0, 0, 0, 0);
            z = true;
            i = iMin;
            while (true) {
                zIsEmpty = linkedList.isEmpty();
                size = this.f12306;
                if (!zIsEmpty) {
                    menuItem = (MenuItem) linkedList.peek();
                    C12826.requireNonNull(menuItem);
                    if (!z || !((InterfaceMenuItemC1528) menuItem).mo18387()) {
                        viewInflate = LayoutInflater.from(this.f12320).inflate(bin.p000mt.plus.R.layout.MT_Protector, viewGroup);
                        m11245(viewInflate, menuItem, this.f12316, z6);
                        if (z) {
                            viewInflate.setPaddingRelative((int) (((double) viewInflate.getPaddingStart()) * 1.5d), viewInflate.getPaddingTop(), viewInflate.getPaddingEnd(), viewInflate.getPaddingBottom());
                        }
                        if (linkedList.size() == z6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            viewInflate.setPaddingRelative(viewInflate.getPaddingStart(), viewInflate.getPaddingTop(), (int) (((double) viewInflate.getPaddingEnd()) * 1.5d), viewInflate.getPaddingBottom());
                        }
                        viewInflate.measure(0, 0);
                        iMin2 = Math.min(viewInflate.getMeasuredWidth(), iMin);
                        if (iMin2 <= i - size.getWidth()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3 || iMin2 > i) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z4 && !z5) {
                            break;
                        }
                        viewInflate.setTag(C23337.m51980(menuItem));
                        viewInflate.setOnClickListener(this.f12329);
                        tooltipText = ((InterfaceMenuItemC1528) menuItem).getTooltipText();
                        if (!TextUtils.isEmpty(tooltipText)) {
                            C1717.m43573(viewInflate, tooltipText);
                        }
                        viewGroup2.addView(viewInflate);
                        viewInflate.setOnTouchListener(new ViewOnTouchListenerC12609(this));
                        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                        layoutParams.width = iMin2;
                        viewInflate.setLayoutParams(layoutParams);
                        i -= iMin2;
                        linkedList.pop();
                        viewGroup = null;
                        z6 = true;
                        z = false;
                        view = view;
                        c21326 = c21326;
                    }
                }
                c21326 = c21326;
                view = view;
                break;
            }
            if (linkedList.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                viewGroup2.setPaddingRelative(0, 0, size.getWidth(), 0);
            }
            if (viewGroup2.getParent() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                throw new IllegalStateException((String) null);
            }
            viewGroup2.measure(i2, i2);
            this.f12288 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
            if (!linkedList.isEmpty()) {
                arrayAdapter = (ArrayAdapter) c21326.getAdapter();
                arrayAdapter.clear();
                size2 = linkedList.size();
                for (i3 = 0; i3 < size2; i3++) {
                    arrayAdapter.add((MenuItem) linkedList.get(i3));
                }
                c21327 = c21326;
                c21327.setAdapter((ListAdapter) arrayAdapter);
                if (this.f12293) {
                    c21327.setY(0.0f);
                } else {
                    c21327.setY(size.getHeight());
                }
                count = c21327.getAdapter().getCount();
                iMax = 0;
                for (i4 = 0; i4 < count; i4++) {
                    iMax = Math.max(this.f12331.m15009((MenuItem) c21327.getAdapter().getItem(i4)), iMax);
                }
                Size size5 = new Size(Math.max(iMax, size.getWidth()), m11238(10));
                this.f12309 = size5;
                m11244(c21327, size5);
            }
            m11260();
        } else {
            Iterator it2 = collectionValues.iterator();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    if (!this.f12305) {
                        view = view;
                        m11247(arrayList, menuItemOnMenuItemClickListenerC12371);
                    }
                } else if (!C23337.m51980((MenuItem) it3.next()).equals(C23337.m51980((MenuItem) it2.next()))) {
                }
                m11278();
                m11271();
                viewGroup = null;
                this.f12309 = null;
                this.f12288 = null;
                this.f12294 = false;
                viewGroup2 = this.f12296;
                viewGroup2.removeAllViews();
                c21326 = this.f12297;
                ArrayAdapter arrayAdapter3 = (ArrayAdapter) c21326.getAdapter();
                arrayAdapter3.clear();
                c21326.setAdapter((ListAdapter) arrayAdapter3);
                this.f12322.removeAllViews();
                m11247(arrayList, menuItemOnMenuItemClickListenerC12371);
                Rect rect3 = this.f12328;
                view.getWindowVisibleDisplayFrame(rect3);
                iMin = Math.min(view.getResources().getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector), rect3.width() - (view.getResources().getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector) * 2));
                linkedList = new LinkedList();
                linkedList2 = new LinkedList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    menuItem2 = (MenuItem) it.next();
                    if (((InterfaceMenuItemC1528) menuItem2).mo18387()) {
                        linkedList2.add(menuItem2);
                    } else {
                        linkedList.add(menuItem2);
                    }
                }
                linkedList.addAll(linkedList2);
                viewGroup2.removeAllViews();
                viewGroup2.setPaddingRelative(0, 0, 0, 0);
                z = true;
                i = iMin;
                while (true) {
                    zIsEmpty = linkedList.isEmpty();
                    size = this.f12306;
                    if (!zIsEmpty) {
                        menuItem = (MenuItem) linkedList.peek();
                        C12826.requireNonNull(menuItem);
                        if (!z) {
                        }
                        viewInflate = LayoutInflater.from(this.f12320).inflate(bin.p000mt.plus.R.layout.MT_Protector, viewGroup);
                        m11245(viewInflate, menuItem, this.f12316, z6);
                        if (z) {
                            viewInflate.setPaddingRelative((int) (((double) viewInflate.getPaddingStart()) * 1.5d), viewInflate.getPaddingTop(), viewInflate.getPaddingEnd(), viewInflate.getPaddingBottom());
                        }
                        if (linkedList.size() == z6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            viewInflate.setPaddingRelative(viewInflate.getPaddingStart(), viewInflate.getPaddingTop(), (int) (((double) viewInflate.getPaddingEnd()) * 1.5d), viewInflate.getPaddingBottom());
                        }
                        viewInflate.measure(0, 0);
                        iMin2 = Math.min(viewInflate.getMeasuredWidth(), iMin);
                        if (iMin2 <= i - size.getWidth()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (z4) {
                        }
                        viewInflate.setTag(C23337.m51980(menuItem));
                        viewInflate.setOnClickListener(this.f12329);
                        tooltipText = ((InterfaceMenuItemC1528) menuItem).getTooltipText();
                        if (!TextUtils.isEmpty(tooltipText)) {
                            C1717.m43573(viewInflate, tooltipText);
                        }
                        viewGroup2.addView(viewInflate);
                        viewInflate.setOnTouchListener(new ViewOnTouchListenerC12609(this));
                        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
                        layoutParams2.width = iMin2;
                        viewInflate.setLayoutParams(layoutParams2);
                        i -= iMin2;
                        linkedList.pop();
                        viewGroup = null;
                        z6 = true;
                        z = false;
                        view = view;
                        c21326 = c21326;
                    }
                    c21326 = c21326;
                    view = view;
                    break;
                }
                if (linkedList.isEmpty()) {
                    i2 = 0;
                    viewGroup2.setPaddingRelative(0, 0, size.getWidth(), 0);
                } else {
                    i2 = 0;
                }
                if (viewGroup2.getParent() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    throw new IllegalStateException((String) null);
                }
                viewGroup2.measure(i2, i2);
                this.f12288 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
                if (!linkedList.isEmpty()) {
                    arrayAdapter = (ArrayAdapter) c21326.getAdapter();
                    arrayAdapter.clear();
                    size2 = linkedList.size();
                    while (i3 < size2) {
                        arrayAdapter.add((MenuItem) linkedList.get(i3));
                    }
                    c21327 = c21326;
                    c21327.setAdapter((ListAdapter) arrayAdapter);
                    if (this.f12293) {
                        c21327.setY(0.0f);
                    } else {
                        c21327.setY(size.getHeight());
                    }
                    count = c21327.getAdapter().getCount();
                    iMax = 0;
                    while (i4 < count) {
                        iMax = Math.max(this.f12331.m15009((MenuItem) c21327.getAdapter().getItem(i4)), iMax);
                    }
                    Size size6 = new Size(Math.max(iMax, size.getWidth()), m11238(10));
                    this.f12309 = size6;
                    m11244(c21327, size6);
                }
                m11260();
            }
        }
        boolean z7 = this.f12298;
        Rect rect4 = this.f12308;
        Point point = this.f12313;
        PopupWindow popupWindow = this.f12300;
        if (!z7) {
            if (!rect4.equals(rect)) {
                C12826.requireNonNull(rect);
                if (!this.f12298 && popupWindow.isShowing()) {
                    m11271();
                    m11242(rect);
                    m11276();
                    popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
                }
            }
        } else {
            C12826.requireNonNull(rect);
            if (this.f12298) {
                this.f12298 = false;
                this.f12332.cancel();
                this.f12302.cancel();
                m11271();
                m11242(rect);
                m11276();
                popupWindow.setClippingEnabled(false);
                popupWindow.showAtLocation(view, 0, point.x, point.y);
                ViewTreeObserver viewTreeObserver = popupWindow.getContentView().getRootView().getViewTreeObserver();
                Object obj = this.f12291;
                if (viewTreeObserver != null) {
                    try {
                        viewTreeObserver.getClass().getDeclaredMethod("removeOnComputeInternalInsetsListener", Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener")).invoke(viewTreeObserver, obj);
                    } catch (Exception unused) {
                    }
                }
                if (viewTreeObserver != null) {
                    try {
                        viewTreeObserver.getClass().getDeclaredMethod("addOnComputeInternalInsetsListener", Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener")).invoke(viewTreeObserver, obj);
                    } catch (Exception unused2) {
                    }
                }
                this.f12319.start();
            }
        }
        this.f12305 = false;
        rect4.set(rect);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11278() {
        if (this.f12298) {
            return;
        }
        this.f12298 = true;
        this.f12302.cancel();
        this.f12289.m23224();
        this.f12332.start();
        C8347 c8347 = this.f12317;
        if (c8347 != null) {
            C21230.forEach((ArrayList) ((C8072) ((InterfaceC24440) c8347.f22317)).f21292, new C17341());
        }
        this.f12333.setEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11280(long j) {
        if (this.f12298) {
            return;
        }
        this.f12289.m23225(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m11248(C5232 c5232, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            c5232.f12289.m23227();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11279(float f) {
        this.f12322.getBackground().setAlpha((int) (f * 255.0f));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11282(C8347 c8347) {
        this.f12317 = c8347;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m11271() {
        this.f12322.clearAnimation();
        this.f12296.animate().cancel();
        this.f12297.animate().cancel();
        this.f12321.stop();
        this.f12314.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ */
    public void m11275() {
        ImageButton imageButton = this.f12310;
        imageButton.setEnabled(true);
        C21326 c21326 = this.f12297;
        c21326.awakenScrollBars();
        boolean z = this.f12294;
        PopupWindow popupWindow = this.f12300;
        int i = this.f12315;
        Size size = this.f12306;
        int i2 = this.f12301;
        ViewGroup viewGroup = this.f12296;
        ViewGroup viewGroup2 = this.f12322;
        if (z) {
            Size size2 = this.f12309;
            m11244(viewGroup2, size2);
            viewGroup.setAlpha(0.0f);
            viewGroup.setVisibility(4);
            c21326.setAlpha(1.0f);
            c21326.setVisibility(0);
            imageButton.setImageDrawable(this.f12307);
            if (m11265()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(size2.getWidth() - size.getWidth());
                c21326.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - size2.getWidth()) - i2);
                viewGroup.setX(-viewGroup2.getX());
                imageButton.setX(0.0f);
                c21326.setX(0.0f);
            }
            if (this.f12293) {
                viewGroup2.setY(i);
                viewGroup.setY(size2.getHeight() - viewGroup2.getHeight());
                imageButton.setY(size2.getHeight() - size.getHeight());
                c21326.setY(0.0f);
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c21326.setY(size.getHeight());
            return;
        }
        Size size3 = this.f12288;
        m11244(viewGroup2, size3);
        viewGroup.setAlpha(1.0f);
        viewGroup.setVisibility(0);
        c21326.setAlpha(0.0f);
        c21326.setVisibility(4);
        imageButton.setImageDrawable(this.f12311);
        if (this.f12309 != null) {
            if (m11265()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(0.0f);
                c21326.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - size3.getWidth()) - i2);
                viewGroup.setX(0.0f);
                imageButton.setX(size3.getWidth() - size.getWidth());
                c21326.setX(size3.getWidth() - this.f12309.getWidth());
            }
            if (this.f12293) {
                viewGroup2.setY((this.f12309.getHeight() + i) - size3.getHeight());
                viewGroup.setY(0.0f);
                imageButton.setY(0.0f);
                c21326.setY(size3.getHeight() - this.f12309.getHeight());
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c21326.setY(size.getHeight());
            return;
        }
        viewGroup2.setX(i2);
        viewGroup2.setY(i);
        viewGroup.setX(0.0f);
        viewGroup.setY(0.0f);
    }

    /* JADX INFO: renamed from: ۢ */
    private void m11260() {
        int iMax;
        Size size = this.f12288;
        int iMax2 = 0;
        if (size != null) {
            iMax2 = Math.max(0, size.getWidth());
            iMax = Math.max(0, this.f12288.getHeight());
        } else {
            iMax = 0;
        }
        Size size2 = this.f12309;
        if (size2 != null) {
            iMax2 = Math.max(iMax2, size2.getWidth());
            iMax = Math.max(iMax, this.f12309.getHeight());
        }
        int i = (this.f12301 * 2) + iMax2;
        PopupWindow popupWindow = this.f12300;
        popupWindow.setWidth(i);
        popupWindow.setHeight((this.f12315 * 2) + iMax);
        Size size3 = this.f12288;
        if (size3 == null || this.f12309 == null) {
            return;
        }
        int width = size3.getWidth() - this.f12309.getWidth();
        int height = this.f12309.getHeight() - this.f12288.getHeight();
        this.f12299 = (int) (Math.sqrt((height * height) + (width * width)) / ((double) this.f12322.getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11242(Rect rect) {
        View view = this.f12312;
        Rect rect2 = this.f12328;
        view.getWindowVisibleDisplayFrame(rect2);
        int i = rect2.left;
        int i2 = rect2.right;
        PopupWindow popupWindow = this.f12300;
        int width = i2 - popupWindow.getWidth();
        int iCenterX = rect.centerX() - (popupWindow.getWidth() / 2);
        if (iCenterX >= i) {
            i = iCenterX > width ? width : iCenterX;
        }
        int i3 = rect.top;
        int i4 = rect2.top;
        int i5 = i3 - i4;
        int i6 = rect2.bottom;
        int iMax = rect.bottom;
        int i7 = i6 - iMax;
        int i8 = this.f12315;
        int i9 = i8 * 2;
        int i10 = this.f12324;
        int i11 = i10 + i9;
        int i12 = i;
        if (this.f12309 != null) {
            int iM11238 = m11238(2) + i9;
            int iM11239 = m11238(5) + i9;
            int i13 = (rect2.bottom - rect.top) + i11;
            int i14 = (rect.bottom - rect2.top) + i11;
            if (i5 >= iM11238) {
                if (i5 >= iM11239 || i14 >= i13) {
                    m11262(i5 - i9);
                    iMax = rect.top - popupWindow.getHeight();
                    this.f12293 = true;
                } else {
                    m11262(i13 - i9);
                    iMax = rect.top - i11;
                    this.f12293 = false;
                }
            } else if (i5 >= i11 && i13 >= iM11238) {
                m11262(i13 - i9);
                iMax = rect.top - i11;
                this.f12293 = false;
            } else if (i7 >= iM11238) {
                m11262(i7 - i9);
                iMax = rect.bottom;
                this.f12293 = false;
            } else if (i7 >= i11 && rect2.height() >= iM11238) {
                m11262(i14 - i9);
                iMax = (rect.bottom + i11) - popupWindow.getHeight();
                this.f12293 = true;
            } else {
                m11262(rect2.height() - i9);
                iMax = rect2.top;
                this.f12293 = false;
            }
        } else if (i5 >= i11) {
            iMax = i3 - i11;
        } else if (i7 < i11) {
            iMax = i7 >= i10 ? iMax - i8 : Math.max(i4, i3 - i11);
        }
        View rootView = view.getRootView();
        int[] iArr = this.f12323;
        rootView.getLocationOnScreen(iArr);
        int i15 = iArr[0];
        int i16 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.f12313.set(i12 - (i15 - iArr[0]), iMax - (i16 - iArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public void m11257() {
        int width;
        int height;
        C12826.requireNonNull(this.f12288);
        if (this.f12294) {
            C12826.requireNonNull(this.f12309);
            width = this.f12309.getWidth();
            height = this.f12309.getHeight();
        } else {
            width = this.f12288.getWidth();
            height = this.f12288.getHeight();
        }
        ViewGroup viewGroup = this.f12322;
        this.f12333.set((int) viewGroup.getX(), (int) viewGroup.getY(), ((int) viewGroup.getX()) + width, ((int) viewGroup.getY()) + height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public boolean m11265() {
        ContextThemeWrapper contextThemeWrapper = this.f12320;
        return (contextThemeWrapper.getApplicationInfo().flags & 4194304) == 4194304 && contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m11262(int i) {
        if (this.f12309 != null) {
            int height = i - this.f12306.getHeight();
            int i2 = this.f12324;
            int iM11238 = m11238((height - (i2 / 2)) / i2);
            if (this.f12309.getHeight() != iM11238) {
                this.f12309 = new Size(this.f12309.getWidth(), iM11238);
            }
            m11244(this.f12297, this.f12309);
            boolean z = this.f12294;
            ViewGroup viewGroup = this.f12322;
            if (z) {
                m11244(viewGroup, this.f12309);
                if (this.f12293) {
                    float height2 = this.f12309.getHeight() - iM11238;
                    viewGroup.setY(viewGroup.getY() + height2);
                    ImageButton imageButton = this.f12310;
                    imageButton.setY(imageButton.getY() - height2);
                }
            } else {
                m11244(viewGroup, this.f12288);
            }
            m11260();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m11276() {
        ViewGroup viewGroup = this.f12322;
        viewGroup.removeAllViews();
        if (this.f12309 != null) {
            viewGroup.addView(this.f12297);
        }
        viewGroup.addView(this.f12296);
        if (this.f12309 != null) {
            viewGroup.addView(this.f12310);
        }
        m11275();
        m11257();
        if (m11265()) {
            viewGroup.setAlpha(0.0f);
            viewGroup.post(this.f12290);
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public static void m11273(C5232 c5232) {
        ImageButton imageButton = c5232.f12310;
        ViewGroup viewGroup = c5232.f12322;
        if (c5232.f12293) {
            c5232.f12296.setY(viewGroup.getHeight() - c5232.f12288.getHeight());
            imageButton.setY(viewGroup.getHeight() - imageButton.getHeight());
            c5232.f12297.setY(viewGroup.getHeight() - c5232.f12309.getHeight());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m11238(int i) {
        int iMax = Math.max(2, i);
        C21326 c21326 = this.f12297;
        int iMin = Math.min(10, Math.min(iMax, c21326.getCount()));
        int count = c21326.getCount();
        int i2 = this.f12324;
        return this.f12306.getHeight() + (iMin * i2) + (iMin < count ? (int) (i2 * 0.5f) : 0);
    }

    /* JADX INFO: renamed from: ܿ */
    private int m11268() {
        int i = this.f12299;
        if (i < 150) {
            return Math.max(200, 0);
        }
        if (i > 300) {
            return 300;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return 250;
        }
        return (int) (ValueAnimator.getDurationScale() * 250);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11250(C5232 c5232, ImageButton imageButton) {
        AnimatedVectorDrawable animatedVectorDrawable = c5232.f12321;
        Interpolator interpolator = c5232.f12325;
        C21326 c21326 = c5232.f12297;
        ViewGroup viewGroup = c5232.f12296;
        Interpolator interpolator2 = c5232.f12287;
        ImageButton imageButton2 = c5232.f12310;
        ViewGroup viewGroup2 = c5232.f12322;
        Interpolator interpolator3 = c5232.f12304;
        AnimatedVectorDrawable animatedVectorDrawable2 = c5232.f12314;
        if (c5232.f12294) {
            imageButton.setImageDrawable(animatedVectorDrawable2);
            animatedVectorDrawable2.start();
            AnimationSet animationSet = c5232.f12318;
            int width = c5232.f12288.getWidth();
            int width2 = viewGroup2.getWidth();
            float x = viewGroup2.getX();
            C7244 c7244 = new C7244(c5232, width, width2, x, x + viewGroup2.getWidth());
            C3220 c3220 = new C3220(c5232, c5232.f12288.getHeight(), viewGroup2.getHeight(), viewGroup2.getY() + viewGroup2.getHeight());
            float x2 = imageButton2.getX();
            C15960 c15960 = new C15960(c5232, x2, c5232.m11265() ? (x2 - width2) + imageButton2.getWidth() : (width2 + x2) - imageButton2.getWidth(), width2);
            c7244.setInterpolator(interpolator3);
            c7244.setDuration(c5232.m11268());
            c3220.setInterpolator(interpolator2);
            c3220.setDuration(c5232.m11268());
            c15960.setInterpolator(interpolator3);
            c15960.setDuration(c5232.m11268());
            animationSet.getAnimations().clear();
            animationSet.addAnimation(c7244);
            animationSet.addAnimation(c3220);
            animationSet.addAnimation(c15960);
            viewGroup2.startAnimation(animationSet);
            c5232.f12294 = false;
            viewGroup.animate().alpha(1.0f).withLayer().setInterpolator(c5232.f12327).setDuration(100L).start();
            c21326.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        imageButton.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
        AnimationSet animationSet2 = c5232.f12295;
        int width3 = c5232.f12309.getWidth();
        int height = c5232.f12309.getHeight();
        int width4 = viewGroup2.getWidth();
        int height2 = viewGroup2.getHeight();
        float y = viewGroup2.getY();
        float x3 = viewGroup2.getX();
        C19985 c19985 = new C19985(c5232, width3, width4, x3, viewGroup2.getWidth() + x3);
        C20656 c20656 = new C20656(c5232, height, height2, y);
        float x4 = imageButton2.getX();
        C2549 c2549 = new C2549(c5232, x4, c5232.m11265() ? (width3 + x4) - imageButton2.getWidth() : (x4 - width3) + imageButton2.getWidth(), width4);
        c19985.setInterpolator(interpolator2);
        c19985.setDuration(c5232.m11268());
        c20656.setInterpolator(interpolator3);
        c20656.setDuration(c5232.m11268());
        c2549.setInterpolator(interpolator3);
        c2549.setDuration(c5232.m11268());
        animationSet2.getAnimations().clear();
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(c19985);
        animationSet2.addAnimation(c20656);
        animationSet2.addAnimation(c2549);
        viewGroup2.startAnimation(animationSet2);
        c5232.f12294 = true;
        viewGroup.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        c21326.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m11252(C5232 c5232, C21326 c21326, int i) {
        MenuItem menuItem = (MenuItem) c21326.getAdapter().getItem(i);
        MenuItemOnMenuItemClickListenerC12371 menuItemOnMenuItemClickListenerC12371 = c5232.f12326;
        if (menuItemOnMenuItemClickListenerC12371 != null) {
            menuItemOnMenuItemClickListenerC12371.onMenuItemClick(menuItem);
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public static boolean m11272(C5232 c5232) {
        AnimationSet animationSet = c5232.f12318;
        AnimationSet animationSet2 = c5232.f12295;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11243(View view, int i, int i2) {
        view.setMinimumWidth(i);
        view.setMinimumHeight(i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11244(View view, Size size) {
        m11243(view, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m11263(ViewGroup viewGroup, int i) {
        m11243(viewGroup, i, viewGroup.getLayoutParams().height);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11246(ViewGroup viewGroup, int i) {
        m11243(viewGroup, viewGroup.getLayoutParams().width, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static View m11240(C5232 c5232, ContextThemeWrapper contextThemeWrapper, MenuItem menuItem, int i) {
        View viewInflate = LayoutInflater.from(contextThemeWrapper).inflate(bin.p000mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        if (menuItem != null) {
            c5232.m11245(viewInflate, menuItem, i, false);
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m11245(View view, MenuItem menuItem, int i, boolean z) {
        EnumC14619 enumC14619 = z ? this.f12303 : this.f12292;
        boolean zIsEmpty = TextUtils.isEmpty(menuItem.getTitle());
        boolean z2 = true;
        boolean z3 = menuItem.getIcon() != null;
        boolean z4 = enumC14619.f41736 && !zIsEmpty;
        boolean z5 = enumC14619.f41738 && z3;
        if (z5 || z4) {
            z2 = z4;
        } else if (zIsEmpty) {
            if (z3) {
                z5 = true;
            }
            z2 = z4;
        }
        TextView textView = (TextView) view.findViewById(bin.p000mt.plus.R.id.MT_Protector);
        textView.setEllipsize(null);
        if (z2) {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        } else {
            textView.setVisibility(8);
        }
        ImageView imageView = (ImageView) view.findViewById(bin.p000mt.plus.R.id.MT_Protector);
        if (z5) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(menuItem.getIcon());
            textView.setPaddingRelative(i, 0, 0, 0);
        } else {
            imageView.setVisibility(8);
            textView.setPaddingRelative(0, 0, 0, 0);
        }
        CharSequence contentDescription = ((InterfaceMenuItemC1528) menuItem).getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            view.setContentDescription(menuItem.getTitle());
        } else {
            view.setContentDescription(contentDescription);
        }
        if (!z || zIsEmpty || z2) {
            return;
        }
        C1717.m43573(view, String.valueOf(menuItem.getTitle()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11283(EnumC14619 enumC14619, EnumC14619 enumC146110) {
        C12826.requireNonNull(enumC14619);
        this.f12303 = enumC14619;
        C12826.requireNonNull(enumC146110);
        this.f12292 = enumC146110;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AnimatorSet m11239(ViewGroup viewGroup, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }
}
