package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۘܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class C1044 {

    /* JADX INFO: renamed from: ۘܰ۫, reason: not valid java name and contains not printable characters */
    public static int f81959;

    /* JADX INFO: renamed from: ֨ */
    public View f15764;

    /* JADX INFO: renamed from: ֫ */
    public ListAdapter f15765;

    /* JADX INFO: renamed from: ֫֫ */
    public TextView f15766;

    /* JADX INFO: renamed from: ۖ */
    public Button f15767;

    /* JADX INFO: renamed from: ۗ */
    public int f15768;

    /* JADX INFO: renamed from: ۘ */
    public Drawable f15769;

    /* JADX INFO: renamed from: ۙ */
    public int f15770;

    /* JADX INFO: renamed from: ۚ */
    public final Context f15771;

    /* JADX INFO: renamed from: ۛ */
    public int f15772;

    /* JADX INFO: renamed from: ۜ */
    public CharSequence f15773;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f15774;

    /* JADX INFO: renamed from: ۟ */
    public CharSequence f15775;

    /* JADX INFO: renamed from: ۠ */
    public final DialogInterfaceC1814 f15776;

    /* JADX INFO: renamed from: ۡ */
    public Message f15777;

    /* JADX INFO: renamed from: ۢ */
    public Drawable f15778;

    /* JADX INFO: renamed from: ۤ */
    public TextView f15779;

    /* JADX INFO: renamed from: ۧ */
    public int f15780;

    /* JADX INFO: renamed from: ۧ֫ */
    public View f15781;

    /* JADX INFO: renamed from: ۨ */
    public C2458 f15782;

    /* JADX INFO: renamed from: ۫ */
    public CharSequence f15783;

    /* JADX INFO: renamed from: ۬ */
    public C0974 f15784;

    /* JADX INFO: renamed from: ܰ */
    public int f15785;

    /* JADX INFO: renamed from: ܳ */
    public Drawable f15786;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f15787;

    /* JADX INFO: renamed from: ܶ */
    public Handler f15788;

    /* JADX INFO: renamed from: ܺ */
    public CharSequence f15789;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f15791;

    /* JADX INFO: renamed from: ܿ */
    public Button f15792;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f15793;

    /* JADX INFO: renamed from: ᩳ */
    public final int f15794;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f15795;

    /* JADX INFO: renamed from: ᩴ */
    public Message f15796;

    /* JADX INFO: renamed from: ᩵ */
    public CharSequence f15797;

    /* JADX INFO: renamed from: ᩶ */
    public ImageView f15798;

    /* JADX INFO: renamed from: ᩷ */
    public Button f15799;

    /* JADX INFO: renamed from: ᩷֫ */
    public final Window f15800;

    /* JADX INFO: renamed from: ᩸ */
    public Drawable f15801;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f15803;

    /* JADX INFO: renamed from: ᩻ */
    public Message f15804;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f15805 = false;

    /* JADX INFO: renamed from: ᩹ */
    public int f15802 = 0;

    /* JADX INFO: renamed from: ֡ */
    public int f15763 = -1;

    /* JADX INFO: renamed from: ܽ */
    public final View.OnClickListener f15790 = new ViewOnClickListenerC0939(this);

    /* JADX INFO: renamed from: ֡֡ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m56271(Object obj, Object obj2) {
        return ((HashSet) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ֡ۘ᩹, reason: not valid java name and contains not printable characters */
    public static void m56272(Object obj, Object obj2, Object obj3) {
        ((AbstractActivityC5549) obj).m12259((Throwable) obj2, (DialogInterface.OnDismissListener) obj3);
    }

    /* JADX INFO: renamed from: ֡ܿܿ, reason: not valid java name and contains not printable characters */
    public static int m56273(Object obj) {
        return ((CharSequence) obj).length();
    }

    /* JADX INFO: renamed from: ֡᩷᩵, reason: not valid java name and contains not printable characters */
    public static boolean m56274(Object obj) {
        return ((AbstractC17043) obj).mo25087();
    }

    /* JADX INFO: renamed from: ۛ֫᩹, reason: not valid java name and contains not printable characters */
    public static String m56275(int i) {
        return C7050.m16224(i);
    }

    /* JADX INFO: renamed from: ۢۙۨ, reason: not valid java name and contains not printable characters */
    public static String m56276(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۨۙܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m56277(Object obj) {
        return C17384.m39540((AbstractC17043) obj);
    }

    /* JADX INFO: renamed from: ۨ᩹ܺ, reason: not valid java name and contains not printable characters */
    public static void m56278(Object obj, Object obj2, Object obj3) {
        ((C19179) obj).m43672((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۬ۖ᩶, reason: not valid java name and contains not printable characters */
    public static int m56279(Object obj, Object obj2) {
        return ((JSONObject) obj).getInt((String) obj2);
    }

    /* JADX INFO: renamed from: ܰۢۗ, reason: not valid java name and contains not printable characters */
    public static C5276 m56280(Object obj, Object obj2) {
        return C5276.m11410((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܳ۫۟, reason: not valid java name and contains not printable characters */
    public static boolean m56281(Object obj) {
        return ((C10748) obj).m24763();
    }

    /* JADX INFO: renamed from: ܺ۫ܶ, reason: not valid java name and contains not printable characters */
    public static int m56282(Object obj, int i) {
        return ((AbstractC6086) obj).mo13855(i);
    }

    /* JADX INFO: renamed from: ᩳۨ۠, reason: not valid java name and contains not printable characters */
    public static void m56283(Object obj) {
        ((Lock) obj).unlock();
    }

    /* JADX INFO: renamed from: ᩳ᩸֫, reason: not valid java name and contains not printable characters */
    public static void m56284(Object obj, Object obj2) {
        ((InterfaceC14936) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ᩵ܽۢ, reason: not valid java name and contains not printable characters */
    public static String m56285(Object obj, int i, Object obj2) {
        return ((Context) obj).getString(i, (Object[]) obj2);
    }

    /* JADX INFO: renamed from: ᩺᩸۠, reason: not valid java name and contains not printable characters */
    public static int m56286() {
        return 2064427834;
    }

    public C1044(Context context, DialogInterfaceC1814 dialogInterfaceC1814, Window window) {
        this.f15771 = context;
        this.f15776 = dialogInterfaceC1814;
        this.f15800 = window;
        this.f15788 = new HandlerC1289(dialogInterfaceC1814);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C1010.f13518, R.attr.MT_Protector, 0);
        this.f15780 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f15768 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f15772 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f15785 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f15770 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f15803 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f15794 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC1814.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m14168(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m14168(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void m14169() {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        Button button;
        this.f15776.setContentView(this.f15780);
        Window window = this.f15800;
        View viewFindViewById2 = window.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.MT_Protector);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewInflate = this.f15781;
        Context context = this.f15771;
        if (viewInflate == null) {
            viewInflate = this.f15791 != 0 ? LayoutInflater.from(context).inflate(this.f15791, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !m14168(viewInflate)) {
            window.setFlags(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.MT_Protector);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f15805) {
                frameLayout.setPadding(this.f15793, this.f15774, this.f15787, this.f15795);
            }
            if (this.f15784 != null) {
                ((LinearLayout.LayoutParams) ((C1217) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById7 = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById8 = viewGroup.findViewById(R.id.MT_Protector);
        ViewGroup viewGroupM14166 = m14166(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM14167 = m14166(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM14168 = m14166(viewFindViewById8, viewFindViewById5);
        C2458 c2458 = (C2458) window.findViewById(R.id.MT_Protector);
        this.f15782 = c2458;
        c2458.setFocusable(false);
        this.f15782.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM14167.findViewById(android.R.id.message);
        this.f15779 = textView;
        if (textView != null) {
            CharSequence charSequence = this.f15783;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f15782.removeView(this.f15779);
                if (this.f15784 != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f15782.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(this.f15782);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(this.f15784, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM14167.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupM14168.findViewById(android.R.id.button1);
        this.f15767 = button2;
        View.OnClickListener onClickListener = this.f15790;
        button2.setOnClickListener(onClickListener);
        boolean zIsEmpty = TextUtils.isEmpty(this.f15797);
        int i3 = this.f15794;
        if (zIsEmpty && this.f15769 == null) {
            this.f15767.setVisibility(8);
            i = 0;
        } else {
            this.f15767.setText(this.f15797);
            Drawable drawable = this.f15769;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                this.f15767.setCompoundDrawables(this.f15769, null, null, null);
            }
            this.f15767.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM14168.findViewById(android.R.id.button2);
        this.f15792 = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f15773) && this.f15786 == null) {
            this.f15792.setVisibility(8);
        } else {
            this.f15792.setText(this.f15773);
            Drawable drawable2 = this.f15786;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                this.f15792.setCompoundDrawables(this.f15786, null, null, null);
            }
            this.f15792.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) viewGroupM14168.findViewById(android.R.id.button3);
        this.f15799 = button4;
        button4.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f15789) && this.f15778 == null) {
            this.f15799.setVisibility(8);
            view = null;
        } else {
            this.f15799.setText(this.f15789);
            Drawable drawable3 = this.f15778;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                this.f15799.setCompoundDrawables(this.f15778, null, null, null);
                view = null;
            } else {
                view = null;
            }
            this.f15799.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                button = this.f15767;
            } else if (i == 2) {
                button = this.f15792;
            } else if (i == 4) {
                button = this.f15799;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button.setLayoutParams(layoutParams);
        }
        if (i == 0) {
            viewGroupM14168.setVisibility(8);
        }
        if (this.f15764 != null) {
            viewGroupM14166.addView(this.f15764, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.MT_Protector).setVisibility(8);
        } else {
            this.f15798 = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(this.f15775) && this.f15803) {
                TextView textView2 = (TextView) window.findViewById(R.id.MT_Protector);
                this.f15766 = textView2;
                textView2.setText(this.f15775);
                int i4 = this.f15802;
                if (i4 != 0) {
                    this.f15798.setImageResource(i4);
                } else {
                    Drawable drawable4 = this.f15801;
                    if (drawable4 != null) {
                        this.f15798.setImageDrawable(drawable4);
                    } else {
                        this.f15766.setPadding(this.f15798.getPaddingLeft(), this.f15798.getPaddingTop(), this.f15798.getPaddingRight(), this.f15798.getPaddingBottom());
                        this.f15798.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.MT_Protector).setVisibility(8);
                this.f15798.setVisibility(8);
                viewGroupM14166.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupM14166 == null || viewGroupM14166.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupM14168.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupM14167.findViewById(R.id.MT_Protector)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z3 != 0) {
            C2458 c2459 = this.f15782;
            if (c2459 != null) {
                c2459.setClipToPadding(true);
            }
            View viewFindViewById9 = (this.f15783 == null && this.f15784 == null) ? view : viewGroupM14166.findViewById(R.id.MT_Protector);
            i2 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i2 = 0;
            View viewFindViewById10 = viewGroupM14167.findViewById(R.id.MT_Protector);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        C0974 c0974 = this.f15784;
        if (c0974 != null) {
            c0974.m10394(z3, z4);
        }
        if (!z2) {
            ViewGroup viewGroup3 = this.f15784;
            if (viewGroup3 == null) {
                viewGroup3 = this.f15782;
            }
            if (viewGroup3 != null) {
                if (z4) {
                    i2 = 2;
                }
                int i5 = z3 | i2;
                View viewFindViewById11 = window.findViewById(R.id.MT_Protector);
                View viewFindViewById12 = window.findViewById(R.id.MT_Protector);
                if (Build.VERSION.SDK_INT >= 23) {
                    C1717.m43560(viewGroup3, i5, 3);
                    if (viewFindViewById11 != null) {
                        viewGroupM14167.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupM14167.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i5 & 1) == 0) {
                        viewGroupM14167.removeView(viewFindViewById11);
                        viewFindViewById11 = view;
                    }
                    if (viewFindViewById12 == null || (i5 & 2) != 0) {
                        view = viewFindViewById12;
                    } else {
                        viewGroupM14167.removeView(viewFindViewById12);
                    }
                    if (viewFindViewById11 != null || view != null) {
                        if (this.f15783 != null) {
                            this.f15782.m3462(new C1394(viewFindViewById11, view));
                            this.f15782.post(new RunnableC1674(this, viewFindViewById11, view));
                        } else {
                            C0974 c0975 = this.f15784;
                            if (c0975 != null) {
                                c0975.setOnScrollListener(new C1744(viewFindViewById11, view));
                                this.f15784.post(new RunnableC1709(this, viewFindViewById11, view));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupM14167.removeView(viewFindViewById11);
                                }
                                if (view != null) {
                                    viewGroupM14167.removeView(view);
                                }
                            }
                        }
                    }
                }
            }
        }
        C0974 c0976 = this.f15784;
        if (c0976 == null || (listAdapter = this.f15765) == null) {
            return;
        }
        c0976.setAdapter(listAdapter);
        int i6 = this.f15763;
        if (i6 > -1) {
            c0976.setItemChecked(i6, true);
            c0976.setSelection(i6);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14178(CharSequence charSequence) {
        this.f15775 = charSequence;
        TextView textView = this.f15766;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14173(View view) {
        this.f15764 = view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14175(CharSequence charSequence) {
        this.f15783 = charSequence;
        TextView textView = this.f15779;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14176(int i) {
        this.f15781 = null;
        this.f15791 = i;
        this.f15805 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14177(View view) {
        this.f15781 = view;
        this.f15791 = 0;
        this.f15805 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14174(View view, int i, int i2, int i3, int i4) {
        this.f15781 = view;
        this.f15791 = 0;
        this.f15805 = true;
        this.f15793 = i;
        this.f15774 = i2;
        this.f15787 = i3;
        this.f15795 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14171(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f15788.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f15789 = charSequence;
            this.f15777 = messageObtainMessage;
            this.f15778 = drawable;
        } else if (i == -2) {
            this.f15773 = charSequence;
            this.f15804 = messageObtainMessage;
            this.f15786 = drawable;
        } else {
            if (i == -1) {
                this.f15797 = charSequence;
                this.f15796 = messageObtainMessage;
                this.f15769 = drawable;
                return;
            }
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14170(int i) {
        this.f15801 = null;
        this.f15802 = i;
        ImageView imageView = this.f15798;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f15798.setImageResource(this.f15802);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14172(Drawable drawable) {
        this.f15801 = drawable;
        this.f15802 = 0;
        ImageView imageView = this.f15798;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f15798.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ViewGroup m14166(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14167(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
