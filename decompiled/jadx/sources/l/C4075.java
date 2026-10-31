package l;

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
import bin.mt.plus.R;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class C4075 {

    /* JADX INFO: renamed from: ۘܰ۫, reason: not valid java name and contains not printable characters */
    public static int f12947;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public View f12949;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ListAdapter f12950;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public TextView f12951;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Button f12952;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f12953;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Drawable f12954;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12955;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Context f12956;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f12957;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CharSequence f12958;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f12959;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CharSequence f12960;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19598 f12961;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Message f12962;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Drawable f12963;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f12964;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f12965;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public View f12966;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0095 f12967;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f12968;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2664 f12969;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f12970;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Drawable f12971;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f12972;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Handler f12973;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public CharSequence f12974;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f12976;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Button f12977;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f12978;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f12979;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f12980;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Message f12981;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public CharSequence f12982;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f12983;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Button f12984;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Window f12985;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Drawable f12986;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f12988;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Message f12989;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f12990 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12987 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f12948 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f12975 = new ViewOnClickListenerC1958(this);

    /* JADX INFO: renamed from: ֡֡ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m12245(Object obj, Object obj2) {
        return ((HashSet) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ֡ۘ᩹, reason: not valid java name and contains not printable characters */
    public static void m12246(Object obj, Object obj2, Object obj3) {
        ((AbstractActivityC3346) obj).m10223((Throwable) obj2, (DialogInterface.OnDismissListener) obj3);
    }

    /* JADX INFO: renamed from: ֡ܿܿ, reason: not valid java name and contains not printable characters */
    public static int m12247(Object obj) {
        return ((CharSequence) obj).length();
    }

    /* JADX INFO: renamed from: ֡᩷᩵, reason: not valid java name and contains not printable characters */
    public static boolean m12248(Object obj) {
        return ((AbstractC15440) obj).mo23113();
    }

    /* JADX INFO: renamed from: ۛ֫᩹, reason: not valid java name and contains not printable characters */
    public static String m12251(int i) {
        return C4925.m14327(i);
    }

    /* JADX INFO: renamed from: ۢۙۨ, reason: not valid java name and contains not printable characters */
    public static String m12252(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۨۙܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m12253(Object obj) {
        return C15799.m37369((AbstractC15440) obj);
    }

    /* JADX INFO: renamed from: ۨ᩹ܺ, reason: not valid java name and contains not printable characters */
    public static void m12254(Object obj, Object obj2, Object obj3) {
        ((C17687) obj).m41426((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۬ۖ᩶, reason: not valid java name and contains not printable characters */
    public static int m12255(Object obj, Object obj2) {
        return ((JSONObject) obj).getInt((String) obj2);
    }

    /* JADX INFO: renamed from: ܰۢۗ, reason: not valid java name and contains not printable characters */
    public static C3059 m12256(Object obj, Object obj2) {
        return C3059.m9368((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܳ۫۟, reason: not valid java name and contains not printable characters */
    public static boolean m12257(Object obj) {
        return ((C8817) obj).m22793();
    }

    /* JADX INFO: renamed from: ܺ۫ܶ, reason: not valid java name and contains not printable characters */
    public static int m12258(Object obj, int i) {
        return ((AbstractC3912) obj).mo11935(i);
    }

    /* JADX INFO: renamed from: ᩳۨ۠, reason: not valid java name and contains not printable characters */
    public static void m12260(Object obj) {
        ((Lock) obj).unlock();
    }

    /* JADX INFO: renamed from: ᩳ᩸֫, reason: not valid java name and contains not printable characters */
    public static void m12261(Object obj, Object obj2) {
        ((InterfaceC13223) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ᩵ܽۢ, reason: not valid java name and contains not printable characters */
    public static String m12262(Object obj, int i, Object obj2) {
        return ((Context) obj).getString(i, (Object[]) obj2);
    }

    /* JADX INFO: renamed from: ᩺᩸۠, reason: not valid java name and contains not printable characters */
    public static int m12263() {
        return 2064427834;
    }

    public C4075(Context context, DialogInterfaceC19598 dialogInterfaceC19598, Window window) {
        this.f12956 = context;
        this.f12961 = dialogInterfaceC19598;
        this.f12985 = window;
        this.f12973 = new HandlerC9014(dialogInterfaceC19598);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C3390.f10711, R.attr.MT_Protector, 0);
        this.f12965 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f12953 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f12957 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f12970 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f12955 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f12988 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f12979 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC19598.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m12259(View view) {
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
            if (m12259(viewGroup.getChildAt(childCount))) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12264() {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        Button button;
        this.f12961.setContentView(this.f12965);
        Window window = this.f12985;
        View viewFindViewById2 = window.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.MT_Protector);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.MT_Protector);
        View viewInflate = this.f12966;
        Context context = this.f12956;
        if (viewInflate == null) {
            viewInflate = this.f12976 != 0 ? LayoutInflater.from(context).inflate(this.f12976, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !m12259(viewInflate)) {
            window.setFlags(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.MT_Protector);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f12990) {
                frameLayout.setPadding(this.f12978, this.f12959, this.f12972, this.f12980);
            }
            if (this.f12969 != null) {
                ((LinearLayout.LayoutParams) ((C7560) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById7 = viewGroup.findViewById(R.id.MT_Protector);
        View viewFindViewById8 = viewGroup.findViewById(R.id.MT_Protector);
        ViewGroup viewGroupM12249 = m12249(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM122410 = m12249(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM122411 = m12249(viewFindViewById8, viewFindViewById5);
        C0095 c0095 = (C0095) window.findViewById(R.id.MT_Protector);
        this.f12967 = c0095;
        c0095.setFocusable(false);
        this.f12967.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM122410.findViewById(android.R.id.message);
        this.f12964 = textView;
        if (textView != null) {
            CharSequence charSequence = this.f12968;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f12967.removeView(this.f12964);
                if (this.f12969 != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f12967.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(this.f12967);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(this.f12969, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM122410.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupM122411.findViewById(android.R.id.button1);
        this.f12952 = button2;
        View.OnClickListener onClickListener = this.f12975;
        button2.setOnClickListener(onClickListener);
        boolean zIsEmpty = TextUtils.isEmpty(this.f12982);
        int i3 = this.f12979;
        if (zIsEmpty && this.f12954 == null) {
            this.f12952.setVisibility(8);
            i = 0;
        } else {
            this.f12952.setText(this.f12982);
            Drawable drawable = this.f12954;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                this.f12952.setCompoundDrawables(this.f12954, null, null, null);
            }
            this.f12952.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM122411.findViewById(android.R.id.button2);
        this.f12977 = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f12958) && this.f12971 == null) {
            this.f12977.setVisibility(8);
        } else {
            this.f12977.setText(this.f12958);
            Drawable drawable2 = this.f12971;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                this.f12977.setCompoundDrawables(this.f12971, null, null, null);
            }
            this.f12977.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) viewGroupM122411.findViewById(android.R.id.button3);
        this.f12984 = button4;
        button4.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f12974) && this.f12963 == null) {
            this.f12984.setVisibility(8);
            view = null;
        } else {
            this.f12984.setText(this.f12974);
            Drawable drawable3 = this.f12963;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                this.f12984.setCompoundDrawables(this.f12963, null, null, null);
                view = null;
            } else {
                view = null;
            }
            this.f12984.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                button = this.f12952;
            } else if (i == 2) {
                button = this.f12977;
            } else if (i == 4) {
                button = this.f12984;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button.setLayoutParams(layoutParams);
        }
        if (i == 0) {
            viewGroupM122411.setVisibility(8);
        }
        if (this.f12949 != null) {
            viewGroupM12249.addView(this.f12949, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.MT_Protector).setVisibility(8);
        } else {
            this.f12983 = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(this.f12960) && this.f12988) {
                TextView textView2 = (TextView) window.findViewById(R.id.MT_Protector);
                this.f12951 = textView2;
                textView2.setText(this.f12960);
                int i4 = this.f12987;
                if (i4 != 0) {
                    this.f12983.setImageResource(i4);
                } else {
                    Drawable drawable4 = this.f12986;
                    if (drawable4 != null) {
                        this.f12983.setImageDrawable(drawable4);
                    } else {
                        this.f12951.setPadding(this.f12983.getPaddingLeft(), this.f12983.getPaddingTop(), this.f12983.getPaddingRight(), this.f12983.getPaddingBottom());
                        this.f12983.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.MT_Protector).setVisibility(8);
                this.f12983.setVisibility(8);
                viewGroupM12249.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupM12249 == null || viewGroupM12249.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupM122411.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupM122410.findViewById(R.id.MT_Protector)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z3 != 0) {
            C0095 c0096 = this.f12967;
            if (c0096 != null) {
                c0096.setClipToPadding(true);
            }
            View viewFindViewById9 = (this.f12968 == null && this.f12969 == null) ? view : viewGroupM12249.findViewById(R.id.MT_Protector);
            i2 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i2 = 0;
            View viewFindViewById10 = viewGroupM122410.findViewById(R.id.MT_Protector);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        C2664 c2664 = this.f12969;
        if (c2664 != null) {
            c2664.m8348(z3, z4);
        }
        if (!z2) {
            ViewGroup viewGroup3 = this.f12969;
            if (viewGroup3 == null) {
                viewGroup3 = this.f12967;
            }
            if (viewGroup3 != null) {
                if (z4) {
                    i2 = 2;
                }
                int i5 = z3 | i2;
                View viewFindViewById11 = window.findViewById(R.id.MT_Protector);
                View viewFindViewById12 = window.findViewById(R.id.MT_Protector);
                if (Build.VERSION.SDK_INT >= 23) {
                    C17648.m41314(viewGroup3, i5, 3);
                    if (viewFindViewById11 != null) {
                        viewGroupM122410.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupM122410.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i5 & 1) == 0) {
                        viewGroupM122410.removeView(viewFindViewById11);
                        viewFindViewById11 = view;
                    }
                    if (viewFindViewById12 == null || (i5 & 2) != 0) {
                        view = viewFindViewById12;
                    } else {
                        viewGroupM122410.removeView(viewFindViewById12);
                    }
                    if (viewFindViewById11 != null || view != null) {
                        if (this.f12968 != null) {
                            this.f12967.m1066(new C11131(viewFindViewById11, view));
                            this.f12967.post(new RunnableC16774(this, viewFindViewById11, view));
                        } else {
                            C2664 c2665 = this.f12969;
                            if (c2665 != null) {
                                c2665.setOnScrollListener(new C18186(viewFindViewById11, view));
                                this.f12969.post(new RunnableC17480(this, viewFindViewById11, view));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupM122410.removeView(viewFindViewById11);
                                }
                                if (view != null) {
                                    viewGroupM122410.removeView(view);
                                }
                            }
                        }
                    }
                }
            }
        }
        C2664 c2666 = this.f12969;
        if (c2666 == null || (listAdapter = this.f12950) == null) {
            return;
        }
        c2666.setAdapter(listAdapter);
        int i6 = this.f12948;
        if (i6 > -1) {
            c2666.setItemChecked(i6, true);
            c2666.setSelection(i6);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12273(CharSequence charSequence) {
        this.f12960 = charSequence;
        TextView textView = this.f12951;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12268(View view) {
        this.f12949 = view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12270(CharSequence charSequence) {
        this.f12968 = charSequence;
        TextView textView = this.f12964;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12271(int i) {
        this.f12966 = null;
        this.f12976 = i;
        this.f12990 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12272(View view) {
        this.f12966 = view;
        this.f12976 = 0;
        this.f12990 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12269(View view, int i, int i2, int i3, int i4) {
        this.f12966 = view;
        this.f12976 = 0;
        this.f12990 = true;
        this.f12978 = i;
        this.f12959 = i2;
        this.f12972 = i3;
        this.f12980 = i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12266(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f12973.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f12974 = charSequence;
            this.f12962 = messageObtainMessage;
            this.f12963 = drawable;
        } else if (i == -2) {
            this.f12958 = charSequence;
            this.f12989 = messageObtainMessage;
            this.f12971 = drawable;
        } else {
            if (i == -1) {
                this.f12982 = charSequence;
                this.f12981 = messageObtainMessage;
                this.f12954 = drawable;
                return;
            }
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12265(int i) {
        this.f12986 = null;
        this.f12987 = i;
        ImageView imageView = this.f12983;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f12983.setImageResource(this.f12987);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12267(Drawable drawable) {
        this.f12986 = drawable;
        this.f12987 = 0;
        ImageView imageView = this.f12983;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f12983.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ViewGroup m12249(View view, View view2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12250(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
