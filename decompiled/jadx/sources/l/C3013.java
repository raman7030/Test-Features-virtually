package l;

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
public final class C3013 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Interpolator f9489;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Size f9490;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HandlerC7952 f9491;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public EnumC12890 f9494;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f9495;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f9496;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AnimationSet f9497;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f9498;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19947 f9499;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f9501;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final PopupWindow f9502;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f9503;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9504;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public EnumC12890 f9505;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Interpolator f9506;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Size f9508;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f9509;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Size f9511;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ImageButton f9512;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Drawable f9513;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f9514;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final AnimatedVectorDrawable f9516;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f9517;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f9518;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C6290 f9519;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AnimationSet f9520;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9521;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ContextThemeWrapper f9522;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final AnimatedVectorDrawable f9523;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f9524;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f9526;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Interpolator f9527;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public MenuItemOnMenuItemClickListenerC10524 f9528;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Interpolator f9529;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C4424 f9533;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9534;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Rect f9530 = new Rect();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Point f9515 = new Point();

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int[] f9525 = new int[2];

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final Region f9535 = new Region();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f9493 = C8192.m21695(new C16418(this));

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Runnable f9492 = new RunnableC8658(this);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f9500 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f9532 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f9531 = new ViewOnClickListenerC15712(this);

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Rect f9510 = new Rect();

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f9507 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9200(C3013 c3013, C5370 c5370) {
        c5370.m15343().setEmpty();
        c5370.m15345().setEmpty();
        c5370.m15344().set(c3013.f9535);
        c5370.m15346();
    }

    public C3013(Context context, View view) {
        boolean z;
        EnumC12890 enumC12890 = EnumC12890.PREFER_SHOW_ALL;
        this.f9505 = enumC12890;
        this.f9494 = enumC12890;
        HandlerC7952 handlerC7952 = new HandlerC7952(this);
        this.f9491 = handlerC7952;
        this.f9514 = view;
        if (Build.VERSION.SDK_INT >= 29) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.isLightTheme});
            z = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            z = true;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, z ? R.style.Theme.DeviceDefault.Light : R.style.Theme.DeviceDefault);
        this.f9522 = contextThemeWrapper;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.setTag("floating_toolbar");
        viewGroup.setContentDescription("floating_toolbar");
        viewGroup.setClipToOutline(true);
        this.f9524 = viewGroup;
        C15006 c15006 = new C15006(viewGroup.getContext(), handlerC7952);
        PopupWindow popupWindow = new PopupWindow(c15006);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c15006.addView(viewGroup);
        this.f9502 = popupWindow;
        this.f9503 = view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f9517 = view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f9526 = context.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector);
        this.f9518 = dimensionPixelSize;
        this.f9489 = new InterpolatorC21358();
        this.f9506 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_slow_in);
        this.f9527 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.linear_out_slow_in);
        this.f9529 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_linear_in);
        Drawable drawable = contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f9509 = drawable;
        drawable.setAutoMirrored(true);
        Drawable drawable2 = contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f9513 = drawable2;
        drawable2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f9523 = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector, contextThemeWrapper.getTheme());
        this.f9516 = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        final ImageButton imageButton = (ImageButton) LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        imageButton.setImageDrawable(drawable2);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.ܿۙܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3013.m9199(this.f52472, imageButton);
            }
        });
        imageButton.setOnTouchListener(new ViewOnTouchListenerC10775(this));
        this.f9512 = imageButton;
        if (!(imageButton.getParent() == null)) {
            throw new IllegalStateException((String) null);
        }
        imageButton.measure(0, 0);
        this.f9508 = new Size(imageButton.getMeasuredWidth(), imageButton.getMeasuredHeight());
        this.f9498 = new C23474(this, contextThemeWrapper);
        this.f9533 = new C4424(this, contextThemeWrapper, dimensionPixelSize);
        final C19947 c19947 = new C19947(this);
        c19947.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c19947.setDivider(null);
        c19947.setDividerHeight(0);
        c19947.setAdapter((ListAdapter) new C6541(this, contextThemeWrapper));
        c19947.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳۙܿ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                C3013.m9201(this.f54476, c19947, i);
            }
        });
        this.f9499 = c19947;
        AnimationAnimationListenerC9364 animationAnimationListenerC9364 = new AnimationAnimationListenerC9364(this);
        AnimationSet animationSet = new AnimationSet(true);
        this.f9497 = animationSet;
        animationSet.setAnimationListener(animationAnimationListenerC9364);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f9520 = animationSet2;
        animationSet2.setAnimationListener(animationAnimationListenerC9364);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.f9521 = animatorSet;
        this.f9534 = m9188(viewGroup, 150, new C2308(this));
        this.f9504 = m9188(viewGroup, 0, new C3719(this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m9233() {
        int i = this.f9526;
        int i2 = this.f9517;
        return i + i2 + i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9196(ArrayList arrayList, MenuItemOnMenuItemClickListenerC10524 menuItemOnMenuItemClickListenerC10524) {
        LinkedHashMap linkedHashMap = this.f9532;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            linkedHashMap.put(C22063.m49644(menuItem), menuItem);
        }
        this.f9528 = menuItemOnMenuItemClickListenerC10524;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m9234() {
        this.f9507 = true;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9230(ArrayList arrayList, MenuItemOnMenuItemClickListenerC10524 menuItemOnMenuItemClickListenerC10524, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C19947 c19947;
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
        C19947 c19948;
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
        this.f9491.m21258();
        Collection collectionValues = this.f9532.values();
        int size3 = arrayList.size();
        int size4 = collectionValues.size();
        View view = this.f9514;
        boolean z6 = true;
        if (size3 != size4) {
            m9227();
            m9220();
            viewGroup = null;
            this.f9511 = null;
            this.f9490 = null;
            this.f9496 = false;
            viewGroup2 = this.f9498;
            viewGroup2.removeAllViews();
            c19947 = this.f9499;
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) c19947.getAdapter();
            arrayAdapter2.clear();
            c19947.setAdapter((ListAdapter) arrayAdapter2);
            this.f9524.removeAllViews();
            m9196(arrayList, menuItemOnMenuItemClickListenerC10524);
            Rect rect2 = this.f9530;
            view.getWindowVisibleDisplayFrame(rect2);
            iMin = Math.min(view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), rect2.width() - (view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector) * 2));
            linkedList = new LinkedList();
            linkedList2 = new LinkedList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                menuItem2 = (MenuItem) it.next();
                if (((InterfaceMenuItemC13827) menuItem2).mo16461()) {
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
                size = this.f9508;
                if (!zIsEmpty) {
                    menuItem = (MenuItem) linkedList.peek();
                    C11003.requireNonNull(menuItem);
                    if (!z || !((InterfaceMenuItemC13827) menuItem).mo16461()) {
                        viewInflate = LayoutInflater.from(this.f9522).inflate(bin.mt.plus.R.layout.MT_Protector, viewGroup);
                        m9194(viewInflate, menuItem, this.f9518, z6);
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
                        viewInflate.setTag(C22063.m49644(menuItem));
                        viewInflate.setOnClickListener(this.f9531);
                        tooltipText = ((InterfaceMenuItemC13827) menuItem).getTooltipText();
                        if (!TextUtils.isEmpty(tooltipText)) {
                            C17648.m41327(viewInflate, tooltipText);
                        }
                        viewGroup2.addView(viewInflate);
                        viewInflate.setOnTouchListener(new ViewOnTouchListenerC10775(this));
                        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                        layoutParams.width = iMin2;
                        viewInflate.setLayoutParams(layoutParams);
                        i -= iMin2;
                        linkedList.pop();
                        viewGroup = null;
                        z6 = true;
                        z = false;
                        view = view;
                        c19947 = c19947;
                    }
                }
                c19947 = c19947;
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
            this.f9490 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
            if (!linkedList.isEmpty()) {
                arrayAdapter = (ArrayAdapter) c19947.getAdapter();
                arrayAdapter.clear();
                size2 = linkedList.size();
                for (i3 = 0; i3 < size2; i3++) {
                    arrayAdapter.add((MenuItem) linkedList.get(i3));
                }
                c19948 = c19947;
                c19948.setAdapter((ListAdapter) arrayAdapter);
                if (this.f9495) {
                    c19948.setY(0.0f);
                } else {
                    c19948.setY(size.getHeight());
                }
                count = c19948.getAdapter().getCount();
                iMax = 0;
                for (i4 = 0; i4 < count; i4++) {
                    iMax = Math.max(this.f9533.m13145((MenuItem) c19948.getAdapter().getItem(i4)), iMax);
                }
                Size size5 = new Size(Math.max(iMax, size.getWidth()), m9187(10));
                this.f9511 = size5;
                m9193(c19948, size5);
            }
            m9209();
        } else {
            Iterator it2 = collectionValues.iterator();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    if (!this.f9507) {
                        view = view;
                        m9196(arrayList, menuItemOnMenuItemClickListenerC10524);
                    }
                } else if (!C22063.m49644((MenuItem) it3.next()).equals(C22063.m49644((MenuItem) it2.next()))) {
                }
                m9227();
                m9220();
                viewGroup = null;
                this.f9511 = null;
                this.f9490 = null;
                this.f9496 = false;
                viewGroup2 = this.f9498;
                viewGroup2.removeAllViews();
                c19947 = this.f9499;
                ArrayAdapter arrayAdapter3 = (ArrayAdapter) c19947.getAdapter();
                arrayAdapter3.clear();
                c19947.setAdapter((ListAdapter) arrayAdapter3);
                this.f9524.removeAllViews();
                m9196(arrayList, menuItemOnMenuItemClickListenerC10524);
                Rect rect3 = this.f9530;
                view.getWindowVisibleDisplayFrame(rect3);
                iMin = Math.min(view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), rect3.width() - (view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector) * 2));
                linkedList = new LinkedList();
                linkedList2 = new LinkedList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    menuItem2 = (MenuItem) it.next();
                    if (((InterfaceMenuItemC13827) menuItem2).mo16461()) {
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
                    size = this.f9508;
                    if (!zIsEmpty) {
                        menuItem = (MenuItem) linkedList.peek();
                        C11003.requireNonNull(menuItem);
                        if (!z) {
                        }
                        viewInflate = LayoutInflater.from(this.f9522).inflate(bin.mt.plus.R.layout.MT_Protector, viewGroup);
                        m9194(viewInflate, menuItem, this.f9518, z6);
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
                        viewInflate.setTag(C22063.m49644(menuItem));
                        viewInflate.setOnClickListener(this.f9531);
                        tooltipText = ((InterfaceMenuItemC13827) menuItem).getTooltipText();
                        if (!TextUtils.isEmpty(tooltipText)) {
                            C17648.m41327(viewInflate, tooltipText);
                        }
                        viewGroup2.addView(viewInflate);
                        viewInflate.setOnTouchListener(new ViewOnTouchListenerC10775(this));
                        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
                        layoutParams2.width = iMin2;
                        viewInflate.setLayoutParams(layoutParams2);
                        i -= iMin2;
                        linkedList.pop();
                        viewGroup = null;
                        z6 = true;
                        z = false;
                        view = view;
                        c19947 = c19947;
                    }
                    c19947 = c19947;
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
                this.f9490 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
                if (!linkedList.isEmpty()) {
                    arrayAdapter = (ArrayAdapter) c19947.getAdapter();
                    arrayAdapter.clear();
                    size2 = linkedList.size();
                    while (i3 < size2) {
                        arrayAdapter.add((MenuItem) linkedList.get(i3));
                    }
                    c19948 = c19947;
                    c19948.setAdapter((ListAdapter) arrayAdapter);
                    if (this.f9495) {
                        c19948.setY(0.0f);
                    } else {
                        c19948.setY(size.getHeight());
                    }
                    count = c19948.getAdapter().getCount();
                    iMax = 0;
                    while (i4 < count) {
                        iMax = Math.max(this.f9533.m13145((MenuItem) c19948.getAdapter().getItem(i4)), iMax);
                    }
                    Size size6 = new Size(Math.max(iMax, size.getWidth()), m9187(10));
                    this.f9511 = size6;
                    m9193(c19948, size6);
                }
                m9209();
            }
        }
        boolean z7 = this.f9500;
        Rect rect4 = this.f9510;
        Point point = this.f9515;
        PopupWindow popupWindow = this.f9502;
        if (!z7) {
            if (!rect4.equals(rect)) {
                C11003.requireNonNull(rect);
                if (!this.f9500 && popupWindow.isShowing()) {
                    m9220();
                    m9191(rect);
                    m9225();
                    popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
                }
            }
        } else {
            C11003.requireNonNull(rect);
            if (this.f9500) {
                this.f9500 = false;
                this.f9534.cancel();
                this.f9504.cancel();
                m9220();
                m9191(rect);
                m9225();
                popupWindow.setClippingEnabled(false);
                popupWindow.showAtLocation(view, 0, point.x, point.y);
                ViewTreeObserver viewTreeObserver = popupWindow.getContentView().getRootView().getViewTreeObserver();
                Object obj = this.f9493;
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
                this.f9521.start();
            }
        }
        this.f9507 = false;
        rect4.set(rect);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9227() {
        if (this.f9500) {
            return;
        }
        this.f9500 = true;
        this.f9504.cancel();
        this.f9491.m21258();
        this.f9534.start();
        C6290 c6290 = this.f9519;
        if (c6290 != null) {
            C19846.forEach((ArrayList) ((C6001) ((InterfaceC23223) c6290.f19454)).f18441, new C15754());
        }
        this.f9535.setEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9229(long j) {
        if (this.f9500) {
            return;
        }
        this.f9491.m21259(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9197(C3013 c3013, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            c3013.f9491.m21261();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9228(float f) {
        this.f9524.getBackground().setAlpha((int) (f * 255.0f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9231(C6290 c6290) {
        this.f9519 = c6290;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m9220() {
        this.f9524.clearAnimation();
        this.f9498.animate().cancel();
        this.f9499.animate().cancel();
        this.f9523.stop();
        this.f9516.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m9224() {
        ImageButton imageButton = this.f9512;
        imageButton.setEnabled(true);
        C19947 c19947 = this.f9499;
        c19947.awakenScrollBars();
        boolean z = this.f9496;
        PopupWindow popupWindow = this.f9502;
        int i = this.f9517;
        Size size = this.f9508;
        int i2 = this.f9503;
        ViewGroup viewGroup = this.f9498;
        ViewGroup viewGroup2 = this.f9524;
        if (z) {
            Size size2 = this.f9511;
            m9193(viewGroup2, size2);
            viewGroup.setAlpha(0.0f);
            viewGroup.setVisibility(4);
            c19947.setAlpha(1.0f);
            c19947.setVisibility(0);
            imageButton.setImageDrawable(this.f9509);
            if (m9214()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(size2.getWidth() - size.getWidth());
                c19947.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - size2.getWidth()) - i2);
                viewGroup.setX(-viewGroup2.getX());
                imageButton.setX(0.0f);
                c19947.setX(0.0f);
            }
            if (this.f9495) {
                viewGroup2.setY(i);
                viewGroup.setY(size2.getHeight() - viewGroup2.getHeight());
                imageButton.setY(size2.getHeight() - size.getHeight());
                c19947.setY(0.0f);
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c19947.setY(size.getHeight());
            return;
        }
        Size size3 = this.f9490;
        m9193(viewGroup2, size3);
        viewGroup.setAlpha(1.0f);
        viewGroup.setVisibility(0);
        c19947.setAlpha(0.0f);
        c19947.setVisibility(4);
        imageButton.setImageDrawable(this.f9513);
        if (this.f9511 != null) {
            if (m9214()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(0.0f);
                c19947.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - size3.getWidth()) - i2);
                viewGroup.setX(0.0f);
                imageButton.setX(size3.getWidth() - size.getWidth());
                c19947.setX(size3.getWidth() - this.f9511.getWidth());
            }
            if (this.f9495) {
                viewGroup2.setY((this.f9511.getHeight() + i) - size3.getHeight());
                viewGroup.setY(0.0f);
                imageButton.setY(0.0f);
                c19947.setY(size3.getHeight() - this.f9511.getHeight());
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c19947.setY(size.getHeight());
            return;
        }
        viewGroup2.setX(i2);
        viewGroup2.setY(i);
        viewGroup.setX(0.0f);
        viewGroup.setY(0.0f);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m9209() {
        int iMax;
        Size size = this.f9490;
        int iMax2 = 0;
        if (size != null) {
            iMax2 = Math.max(0, size.getWidth());
            iMax = Math.max(0, this.f9490.getHeight());
        } else {
            iMax = 0;
        }
        Size size2 = this.f9511;
        if (size2 != null) {
            iMax2 = Math.max(iMax2, size2.getWidth());
            iMax = Math.max(iMax, this.f9511.getHeight());
        }
        int i = (this.f9503 * 2) + iMax2;
        PopupWindow popupWindow = this.f9502;
        popupWindow.setWidth(i);
        popupWindow.setHeight((this.f9517 * 2) + iMax);
        Size size3 = this.f9490;
        if (size3 == null || this.f9511 == null) {
            return;
        }
        int width = size3.getWidth() - this.f9511.getWidth();
        int height = this.f9511.getHeight() - this.f9490.getHeight();
        this.f9501 = (int) (Math.sqrt((height * height) + (width * width)) / ((double) this.f9524.getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9191(Rect rect) {
        View view = this.f9514;
        Rect rect2 = this.f9530;
        view.getWindowVisibleDisplayFrame(rect2);
        int i = rect2.left;
        int i2 = rect2.right;
        PopupWindow popupWindow = this.f9502;
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
        int i8 = this.f9517;
        int i9 = i8 * 2;
        int i10 = this.f9526;
        int i11 = i10 + i9;
        int i12 = i;
        if (this.f9511 != null) {
            int iM9187 = m9187(2) + i9;
            int iM9188 = m9187(5) + i9;
            int i13 = (rect2.bottom - rect.top) + i11;
            int i14 = (rect.bottom - rect2.top) + i11;
            if (i5 >= iM9187) {
                if (i5 >= iM9188 || i14 >= i13) {
                    m9211(i5 - i9);
                    iMax = rect.top - popupWindow.getHeight();
                    this.f9495 = true;
                } else {
                    m9211(i13 - i9);
                    iMax = rect.top - i11;
                    this.f9495 = false;
                }
            } else if (i5 >= i11 && i13 >= iM9187) {
                m9211(i13 - i9);
                iMax = rect.top - i11;
                this.f9495 = false;
            } else if (i7 >= iM9187) {
                m9211(i7 - i9);
                iMax = rect.bottom;
                this.f9495 = false;
            } else if (i7 >= i11 && rect2.height() >= iM9187) {
                m9211(i14 - i9);
                iMax = (rect.bottom + i11) - popupWindow.getHeight();
                this.f9495 = true;
            } else {
                m9211(rect2.height() - i9);
                iMax = rect2.top;
                this.f9495 = false;
            }
        } else if (i5 >= i11) {
            iMax = i3 - i11;
        } else if (i7 < i11) {
            iMax = i7 >= i10 ? iMax - i8 : Math.max(i4, i3 - i11);
        }
        View rootView = view.getRootView();
        int[] iArr = this.f9525;
        rootView.getLocationOnScreen(iArr);
        int i15 = iArr[0];
        int i16 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.f9515.set(i12 - (i15 - iArr[0]), iMax - (i16 - iArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void m9206() {
        int width;
        int height;
        C11003.requireNonNull(this.f9490);
        if (this.f9496) {
            C11003.requireNonNull(this.f9511);
            width = this.f9511.getWidth();
            height = this.f9511.getHeight();
        } else {
            width = this.f9490.getWidth();
            height = this.f9490.getHeight();
        }
        ViewGroup viewGroup = this.f9524;
        this.f9535.set((int) viewGroup.getX(), (int) viewGroup.getY(), ((int) viewGroup.getX()) + width, ((int) viewGroup.getY()) + height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean m9214() {
        ContextThemeWrapper contextThemeWrapper = this.f9522;
        return (contextThemeWrapper.getApplicationInfo().flags & 4194304) == 4194304 && contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9211(int i) {
        if (this.f9511 != null) {
            int height = i - this.f9508.getHeight();
            int i2 = this.f9526;
            int iM9187 = m9187((height - (i2 / 2)) / i2);
            if (this.f9511.getHeight() != iM9187) {
                this.f9511 = new Size(this.f9511.getWidth(), iM9187);
            }
            m9193(this.f9499, this.f9511);
            boolean z = this.f9496;
            ViewGroup viewGroup = this.f9524;
            if (z) {
                m9193(viewGroup, this.f9511);
                if (this.f9495) {
                    float height2 = this.f9511.getHeight() - iM9187;
                    viewGroup.setY(viewGroup.getY() + height2);
                    ImageButton imageButton = this.f9512;
                    imageButton.setY(imageButton.getY() - height2);
                }
            } else {
                m9193(viewGroup, this.f9490);
            }
            m9209();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m9225() {
        ViewGroup viewGroup = this.f9524;
        viewGroup.removeAllViews();
        if (this.f9511 != null) {
            viewGroup.addView(this.f9499);
        }
        viewGroup.addView(this.f9498);
        if (this.f9511 != null) {
            viewGroup.addView(this.f9512);
        }
        m9224();
        m9206();
        if (m9214()) {
            viewGroup.setAlpha(0.0f);
            viewGroup.post(this.f9492);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m9222(C3013 c3013) {
        ImageButton imageButton = c3013.f9512;
        ViewGroup viewGroup = c3013.f9524;
        if (c3013.f9495) {
            c3013.f9498.setY(viewGroup.getHeight() - c3013.f9490.getHeight());
            imageButton.setY(viewGroup.getHeight() - imageButton.getHeight());
            c3013.f9499.setY(viewGroup.getHeight() - c3013.f9511.getHeight());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m9187(int i) {
        int iMax = Math.max(2, i);
        C19947 c19947 = this.f9499;
        int iMin = Math.min(10, Math.min(iMax, c19947.getCount()));
        int count = c19947.getCount();
        int i2 = this.f9526;
        return this.f9508.getHeight() + (iMin * i2) + (iMin < count ? (int) (i2 * 0.5f) : 0);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m9217() {
        int i = this.f9501;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9199(C3013 c3013, ImageButton imageButton) {
        AnimatedVectorDrawable animatedVectorDrawable = c3013.f9523;
        Interpolator interpolator = c3013.f9527;
        C19947 c19947 = c3013.f9499;
        ViewGroup viewGroup = c3013.f9498;
        Interpolator interpolator2 = c3013.f9489;
        ImageButton imageButton2 = c3013.f9512;
        ViewGroup viewGroup2 = c3013.f9524;
        Interpolator interpolator3 = c3013.f9506;
        AnimatedVectorDrawable animatedVectorDrawable2 = c3013.f9516;
        if (c3013.f9496) {
            imageButton.setImageDrawable(animatedVectorDrawable2);
            animatedVectorDrawable2.start();
            AnimationSet animationSet = c3013.f9520;
            int width = c3013.f9490.getWidth();
            int width2 = viewGroup2.getWidth();
            float x = viewGroup2.getX();
            C5130 c5130 = new C5130(c3013, width, width2, x, x + viewGroup2.getWidth());
            C0896 c0896 = new C0896(c3013, c3013.f9490.getHeight(), viewGroup2.getHeight(), viewGroup2.getY() + viewGroup2.getHeight());
            float x2 = imageButton2.getX();
            C14301 c14301 = new C14301(c3013, x2, c3013.m9214() ? (x2 - width2) + imageButton2.getWidth() : (width2 + x2) - imageButton2.getWidth(), width2);
            c5130.setInterpolator(interpolator3);
            c5130.setDuration(c3013.m9217());
            c0896.setInterpolator(interpolator2);
            c0896.setDuration(c3013.m9217());
            c14301.setInterpolator(interpolator3);
            c14301.setDuration(c3013.m9217());
            animationSet.getAnimations().clear();
            animationSet.addAnimation(c5130);
            animationSet.addAnimation(c0896);
            animationSet.addAnimation(c14301);
            viewGroup2.startAnimation(animationSet);
            c3013.f9496 = false;
            viewGroup.animate().alpha(1.0f).withLayer().setInterpolator(c3013.f9529).setDuration(100L).start();
            c19947.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        imageButton.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
        AnimationSet animationSet2 = c3013.f9497;
        int width3 = c3013.f9511.getWidth();
        int height = c3013.f9511.getHeight();
        int width4 = viewGroup2.getWidth();
        int height2 = viewGroup2.getHeight();
        float y = viewGroup2.getY();
        float x3 = viewGroup2.getX();
        C18536 c18536 = new C18536(c3013, width3, width4, x3, viewGroup2.getWidth() + x3);
        C19242 c19242 = new C19242(c3013, height, height2, y);
        float x4 = imageButton2.getX();
        C0190 c0190 = new C0190(c3013, x4, c3013.m9214() ? (width3 + x4) - imageButton2.getWidth() : (x4 - width3) + imageButton2.getWidth(), width4);
        c18536.setInterpolator(interpolator2);
        c18536.setDuration(c3013.m9217());
        c19242.setInterpolator(interpolator3);
        c19242.setDuration(c3013.m9217());
        c0190.setInterpolator(interpolator3);
        c0190.setDuration(c3013.m9217());
        animationSet2.getAnimations().clear();
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(c18536);
        animationSet2.addAnimation(c19242);
        animationSet2.addAnimation(c0190);
        viewGroup2.startAnimation(animationSet2);
        c3013.f9496 = true;
        viewGroup.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        c19947.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9201(C3013 c3013, C19947 c19947, int i) {
        MenuItem menuItem = (MenuItem) c19947.getAdapter().getItem(i);
        MenuItemOnMenuItemClickListenerC10524 menuItemOnMenuItemClickListenerC10524 = c3013.f9528;
        if (menuItemOnMenuItemClickListenerC10524 != null) {
            menuItemOnMenuItemClickListenerC10524.onMenuItemClick(menuItem);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m9221(C3013 c3013) {
        AnimationSet animationSet = c3013.f9520;
        AnimationSet animationSet2 = c3013.f9497;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9192(View view, int i, int i2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9193(View view, Size size) {
        m9192(view, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9212(ViewGroup viewGroup, int i) {
        m9192(viewGroup, i, viewGroup.getLayoutParams().height);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9195(ViewGroup viewGroup, int i) {
        m9192(viewGroup, viewGroup.getLayoutParams().width, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m9189(C3013 c3013, ContextThemeWrapper contextThemeWrapper, MenuItem menuItem, int i) {
        View viewInflate = LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        if (menuItem != null) {
            c3013.m9194(viewInflate, menuItem, i, false);
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m9194(View view, MenuItem menuItem, int i, boolean z) {
        EnumC12890 enumC12890 = z ? this.f9505 : this.f9494;
        boolean zIsEmpty = TextUtils.isEmpty(menuItem.getTitle());
        boolean z2 = true;
        boolean z3 = menuItem.getIcon() != null;
        boolean z4 = enumC12890.f38693 && !zIsEmpty;
        boolean z5 = enumC12890.f38695 && z3;
        if (z5 || z4) {
            z2 = z4;
        } else if (zIsEmpty) {
            if (z3) {
                z5 = true;
            }
            z2 = z4;
        }
        TextView textView = (TextView) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        textView.setEllipsize(null);
        if (z2) {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        } else {
            textView.setVisibility(8);
        }
        ImageView imageView = (ImageView) view.findViewById(bin.mt.plus.R.id.MT_Protector);
        if (z5) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(menuItem.getIcon());
            textView.setPaddingRelative(i, 0, 0, 0);
        } else {
            imageView.setVisibility(8);
            textView.setPaddingRelative(0, 0, 0, 0);
        }
        CharSequence contentDescription = ((InterfaceMenuItemC13827) menuItem).getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            view.setContentDescription(menuItem.getTitle());
        } else {
            view.setContentDescription(contentDescription);
        }
        if (!z || zIsEmpty || z2) {
            return;
        }
        C17648.m41327(view, String.valueOf(menuItem.getTitle()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9232(EnumC12890 enumC12890, EnumC12890 enumC12891) {
        C11003.requireNonNull(enumC12890);
        this.f9505 = enumC12890;
        C11003.requireNonNull(enumC12891);
        this.f9494 = enumC12891;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m9188(ViewGroup viewGroup, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }
}
