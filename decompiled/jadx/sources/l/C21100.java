package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩷᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final class C21100 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C5242 f68044;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C5242 f68045;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68046;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68047;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68048;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68049;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static C6988 f68050;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68051;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68052;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f68053 = new AtomicLong();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68054;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68055;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C5242 f68056;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C5242 f68057;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean f68058;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f68059;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ImageView f68060;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PopupWindow f68061;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f68062;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f68063;

    static {
        C5242 c5242 = new C5242("");
        f68048 = c5242;
        C5242 c5243 = new C5242("");
        f68057 = c5243;
        f68052 = new C5242("");
        f68046 = new C5242(null);
        C5242 c5244 = new C5242(null);
        f68049 = c5244;
        f68047 = new C5242(null);
        C5242 c5245 = new C5242(Boolean.FALSE);
        f68044 = c5245;
        C5242 c5246 = new C5242(0);
        f68054 = c5246;
        C5242 c5247 = new C5242(0);
        f68045 = c5247;
        f68051 = new C5242(0);
        C5242 c5248 = new C5242(0);
        f68055 = c5248;
        C5242 c5249 = new C5242(Integer.valueOf(C18340.m42758()));
        f68056 = c5249;
        c5242.m1665((InterfaceC1008) new C16222());
        c5243.m1665((InterfaceC1008) new C2818());
        c5244.m1665((InterfaceC1008) new C4229());
        c5245.m1665((InterfaceC1008) new C19046());
        c5246.m1665((InterfaceC1008) new C0700());
        c5247.m1665((InterfaceC1008) new C5640());
        c5248.m1665((InterfaceC1008) new C1406());
        c5249.m1665((InterfaceC1008) new C8462());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48020(AbstractActivityC3346 abstractActivityC3346) {
        if (abstractActivityC3346 instanceof ActivityC9811) {
            abstractActivityC3346.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [l.ۛ᩷ۡ, l.۬ۤ] */
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
    public C21100(final AbstractActivityC3346 abstractActivityC3346) {
        ImageView imageView;
        C14811 c14811;
        this.f68059 = abstractActivityC3346;
        final DialogInterfaceC0206 dialogInterfaceC0206M44415 = abstractActivityC3346.buildDialog().m44415();
        final C17606 c17606 = (C17606) abstractActivityC3346.m10216(R.layout.MT_Protector);
        final C4201 c4201 = new C4201();
        final C4201 c4202 = new C4201();
        c4201.m12685(c17606);
        c4202.m12685((C17606) LayoutInflater.from(abstractActivityC3346).inflate(R.layout.MT_Protector, (ViewGroup) null));
        if (abstractActivityC3346.getResources().getConfiguration().orientation == 2) {
            c4202.m12676(c17606);
        }
        final ?? r2 = new InterfaceC13041() { // from class: l.ۛ᩷ۡ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                int i = ((Configuration) obj).orientation;
                C17606 c17607 = c17606;
                if (i == 2) {
                    c4202.m12676(c17607);
                } else {
                    c4201.m12676(c17607);
                }
            }
        };
        InterfaceC17236 interfaceC17236 = new InterfaceC17236() { // from class: l.ۨ᩷ۡ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                EnumC22901 enumC22902 = EnumC22901.ON_START;
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                C6305 c6305 = r2;
                if (enumC22901 == enumC22902) {
                    abstractActivityC3347.mo9144(c6305);
                    abstractActivityC3347.mo9143(c6305);
                } else if (enumC22901 == EnumC22901.ON_STOP) {
                    abstractActivityC3347.mo9144(c6305);
                }
            }
        };
        AbstractC7379 lifecycle = dialogInterfaceC0206M44415.getLifecycle();
        lifecycle.mo19833(interfaceC17236);
        if (lifecycle.mo19832().m33028(EnumC13728.STARTED)) {
            abstractActivityC3346.mo9143((InterfaceC13041) r2);
        }
        dialogInterfaceC0206M44415.m1439((ViewGroup) c17606);
        TextView textView = (TextView) c17606.findViewById(R.id.textView1);
        TextView textView2 = (TextView) c17606.findViewById(R.id.textView2);
        final C21828 c21828 = (C21828) c17606.findViewById(R.id.MT_Protector);
        final SeekBar seekBar = (SeekBar) c17606.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) c17606.findViewById(R.id.textView3);
        final TextView textView4 = (TextView) c17606.findViewById(R.id.textView4);
        final ImageView imageView2 = (ImageView) c17606.findViewById(R.id.MT_Protector);
        ImageView imageView3 = (ImageView) c17606.findViewById(R.id.MT_Protector);
        ImageView imageView4 = (ImageView) c17606.findViewById(R.id.MT_Protector);
        final ImageView imageView5 = (ImageView) c17606.findViewById(R.id.MT_Protector);
        ImageView imageView6 = (ImageView) c17606.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC14813.m35215(textView);
        ViewOnClickListenerC14813.m35215(textView2);
        c21828.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܿ᩹ۜ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final C9340 c9340M132;
                final Main mainM36593 = C15528.m36593();
                if (mainM36593 == null || (c9340M132 = mainM36593.m132()) == null || !mainM36593.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
                    return false;
                }
                Drawable drawable = (Drawable) C21100.f68046.m1662();
                if (drawable instanceof C1385) {
                    final C1385 c1385 = (C1385) drawable;
                    C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
                    c19258BuildDialog.m44436((CharSequence) C21100.f68048.m1662());
                    c19258BuildDialog.m44416(R.string.MT_Protector);
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ᩹ۜ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C21100.m48022(c9340M132, c1385, mainM36593);
                        }
                    });
                    c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44438();
                    return true;
                }
                if (drawable instanceof C5619) {
                    return false;
                }
                C21374.m48457(R.string.MT_Protector);
                return true;
            }
        });
        ImageView imageView7 = (ImageView) c17606.findViewById(R.id.MT_Protector);
        this.f68060 = imageView7;
        imageView7.setOnClickListener(new View.OnClickListener() { // from class: l.ۛ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21100.m48014(view, abstractActivityC3346, dialogInterfaceC0206M44415);
            }
        });
        final boolean zM49431 = C21943.m49431();
        if ((abstractActivityC3346 instanceof Main) || (abstractActivityC3346 instanceof ActivityC9811)) {
            imageView = imageView4;
            c14811 = new InterfaceC13041() { // from class: l.ܳ᩹ۜ
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    boolean zM49432 = C21943.m49431();
                    final boolean z = zM49431;
                    if (z == zM49432) {
                        return;
                    }
                    final C21100 c21100 = this.f45206;
                    final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44415;
                    final AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                    c17606.post(new Runnable() { // from class: l.᩸᩹ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21100.m48026(c21100, dialogInterfaceC0206, z, abstractActivityC3347);
                        }
                    });
                }
            };
        } else {
            imageView = imageView4;
            c14811 = 0;
        }
        int i = 1;
        f68048.m1668(dialogInterfaceC0206M44415, new C14531(i, textView));
        f68052.m1668(dialogInterfaceC0206M44415, new C14531(i, textView2));
        f68046.m1668(dialogInterfaceC0206M44415, new InterfaceC1008() { // from class: l.᩻᩹ۜ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                Drawable drawable = (Drawable) obj;
                C21828 c21829 = c21828;
                if (c21829.getDrawable() != drawable) {
                    c21829.setImageDrawable(drawable);
                }
                c21829.m49197();
            }
        });
        f68044.m1668(dialogInterfaceC0206M44415, new InterfaceC1008() { // from class: l.ۜ᩹ۜ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                Boolean bool = (Boolean) obj;
                int i2 = bool.booleanValue() ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                ImageView imageView8 = imageView2;
                imageView8.setImageResource(i2);
                imageView8.setContentDescription(C4925.m14327(bool.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector));
                c21828.m49196(bool.booleanValue());
            }
        });
        f68045.m1668(dialogInterfaceC0206M44415, new InterfaceC1008() { // from class: l.᩷᩹ۜ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                textView4.setText(C21100.m48031(((Integer) obj).intValue()));
            }
        });
        int i2 = 0;
        f68054.m1668(dialogInterfaceC0206M44415, new C9874(i2, textView3));
        f68055.m1668(dialogInterfaceC0206M44415, new InterfaceC1008() { // from class: l.ۡ᩹ۜ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                SeekBar seekBar2 = seekBar;
                seekBar2.setMax(iIntValue);
                Integer num = (Integer) C21100.f68051.m1662();
                C11003.requireNonNull(num);
                seekBar2.setProgress(num.intValue());
            }
        });
        C11003.requireNonNull(seekBar);
        f68051.m1668(dialogInterfaceC0206M44415, new InterfaceC1008() { // from class: l.᩵᩹ۜ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                seekBar.setProgress(((Integer) obj).intValue());
            }
        });
        f68056.m1668(dialogInterfaceC0206M44415, new InterfaceC1008() { // from class: l.᩶᩹ۜ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                int i3;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                float[] fArr = C18340.f56996;
                if (iIntValue == 1) {
                    i3 = R.drawable.MT_Protector;
                } else if (iIntValue != 2) {
                    i3 = iIntValue != 3 ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                } else {
                    i3 = R.drawable.MT_Protector;
                }
                ImageView imageView8 = imageView5;
                imageView8.setImageResource(i3);
                imageView8.setContentDescription(C4925.m14327(C18340.m42763(num.intValue())));
            }
        });
        seekBar.setOnSeekBarChangeListener(new C23278(textView3));
        final C8817 c8817M22788 = C8817.m22788();
        imageView2.setOnClickListener(new ViewOnClickListenerC23705(dialogInterfaceC0206M44415, c8817M22788, 3));
        imageView3.setOnClickListener(new ViewOnClickListenerC4934(i2, dialogInterfaceC0206M44415, c8817M22788));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21100.m48018(dialogInterfaceC0206M44415, c8817M22788);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: l.۬᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21100.m48017(dialogInterfaceC0206M44415, abstractActivityC3346, imageView2);
            }
        });
        imageView5.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۫᩹ۜ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int iM42758 = C18340.m42758();
                C2937 c2937 = new C2937(abstractActivityC3346);
                c2937.m8957(C18340.m42763(iM42758), imageView2);
                C4925.m14316(new RunnableC22934(2, c2937), SnackbarManager.SHORT_DURATION_MS);
                return true;
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() { // from class: l.ۤ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21100.m48025(this.f31756, dialogInterfaceC0206M44415, abstractActivityC3346, c17606);
            }
        });
        c17606.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2049(this, abstractActivityC3346, c14811, C2234.m7411(abstractActivityC3346), new C14105(dialogInterfaceC0206M44415), new C7756(this)));
        c17606.setAlpha(0.0f);
        ObjectAnimator.ofFloat(c17606, "alpha", 0.0f, 1.0f).setDuration(400L).start();
        dialogInterfaceC0206M44415.m1449();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48022(C9340 c9340, C1385 c1385, Main main) {
        C16560 c16560M24070 = c9340.m24070();
        AbstractC15440 abstractC15440M38993 = c16560M24070.m38993(f68050.f21576.mo16334().mo24433().m36517() + ".png", false);
        try {
            try {
                OutputStream outputStreamMo23555 = abstractC15440M38993.mo23555(false);
                try {
                    c1385.getBitmap().compress(Bitmap.CompressFormat.PNG, 90, outputStreamMo23555);
                    c16560M24070.m39005(abstractC15440M38993);
                    if (outputStreamMo23555 != null) {
                        outputStreamMo23555.close();
                    }
                    C15528.m36596();
                } catch (Throwable th) {
                    if (outputStreamMo23555 != null) {
                        try {
                            outputStreamMo23555.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                C15528.m36596();
                throw th3;
            }
        } catch (IOException e) {
            main.m10223(e, (DialogInterface.OnDismissListener) null);
            abstractC15440M38993.mo23552();
            C15528.m36596();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48026(C21100 c21100, DialogInterfaceC0206 dialogInterfaceC0206, boolean z, AbstractActivityC3346 abstractActivityC3346) {
        if (!dialogInterfaceC0206.m1442() || z == C21943.m49431()) {
            return;
        }
        c21100.f68062 = true;
        boolean z2 = c21100.f68060.getVisibility() == 0;
        dialogInterfaceC0206.dismiss();
        C21100 c21101 = new C21100(abstractActivityC3346);
        c21101.f68063 = c21100.f68063;
        if (z2) {
            c21101.m48045();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48035(DialogInterfaceC0206 dialogInterfaceC0206, C8817 c8817) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
        } else if (c8817.m22791()) {
            f68050.m18916();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48039(DialogInterfaceC0206 dialogInterfaceC0206, C8817 c8817) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
        } else if (c8817.m22791()) {
            f68050.m18915();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48018(DialogInterfaceC0206 dialogInterfaceC0206, C8817 c8817) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
        } else if (c8817.m22791()) {
            f68050.m18917();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48017(DialogInterfaceC0206 dialogInterfaceC0206, AbstractActivityC3346 abstractActivityC3346, ImageView imageView) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
            return;
        }
        int iM42757 = C18340.m42757();
        C2937 c2937 = new C2937(abstractActivityC3346);
        c2937.m8957(C18340.m42763(iM42757), imageView);
        C4925.m14316(new RunnableC22934(2, c2937), SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48025(final C21100 c21100, DialogInterfaceC0206 dialogInterfaceC0206, AbstractActivityC3346 abstractActivityC3346, C17606 c17606) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
            return;
        }
        View viewM42764 = f68050.f21576.m42764(abstractActivityC3346);
        int width = c17606.getWidth();
        int height = c17606.getHeight();
        viewM42764.measure(View.MeasureSpec.makeMeasureSpec(width < height ? (width * 2) / 3 : width / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
        Drawable drawableM48345 = C21311.m48345(abstractActivityC3346, R.drawable.MT_Protector);
        Rect rect = new Rect();
        drawableM48345.getPadding(rect);
        final PopupWindow popupWindow = new PopupWindow(viewM42764, viewM42764.getMeasuredWidth() + rect.left + rect.right, viewM42764.getMeasuredHeight() + rect.top + rect.bottom, true);
        c21100.f68061 = popupWindow;
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.᩹᩹ۜ
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C21100.m48024(this.f72982, popupWindow);
            }
        });
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.setBackgroundDrawable(drawableM48345);
        int[] iArr = new int[2];
        c17606.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - rect.right;
        iArr[1] = iArr[1] - rect.bottom;
        popupWindow.setInputMethodMode(2);
        popupWindow.showAtLocation(c17606, 85, iArr[0], iArr[1]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48024(C21100 c21100, PopupWindow popupWindow) {
        if (c21100.f68061 == popupWindow) {
            c21100.f68061 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48023(AbstractC13921 abstractC13921, List list, int i) {
        C21805.m49152();
        C6988 c6988 = f68050;
        if (c6988 != null) {
            c6988.m18912(false);
        }
        m48034(((InterfaceC17889) list.get(i)).getName());
        C6988 c6989 = new C6988(abstractC13921, list, i, C8399.m22008(abstractC13921, list, i));
        f68050 = c6989;
        c6989.m18918();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48019(C2608 c2608, int i) {
        C21805.m49152();
        C6988 c6988 = f68050;
        if (c6988 != null) {
            c6988.m18912(false);
        }
        String name = ((InterfaceC17889) c2608.m8233().get(c2608.m8232())).getName();
        int iMax = Math.max(i, 0);
        f68048.mo1669(C15495.m36571(name));
        f68057.mo1669("");
        f68052.mo1669("");
        f68046.mo1669(C5619.m15924());
        f68049.mo1669((Object) null);
        f68047.mo1669((Object) null);
        f68044.mo1669(Boolean.FALSE);
        int i2 = (int) (((long) iMax) / 1000);
        f68054.mo1669(Integer.valueOf((i2 % 60) | ((i2 / 60) << 16)));
        f68045.mo1669((Object) 0);
        f68055.mo1669((Object) 0);
        f68051.mo1669(Integer.valueOf(iMax / 50));
        C6988 c6989 = new C6988(c2608.m8234(), c2608.m8233(), c2608.m8232(), true);
        f68050 = c6989;
        int iMax2 = Math.max(i, 0);
        c6989.f21570 = iMax2;
        c6989.f21572 = iMax2 > 0;
        c6989.f21573 = false;
        final C6988 c69810 = f68050;
        final int i3 = c69810.f21567 + 1;
        c69810.f21567 = i3;
        final C11197 c11197Mo16333 = c69810.f21576.mo16333();
        final InterfaceC17889 interfaceC17889M41812 = C17843.m41812(c11197Mo16333);
        C1802.f6208.execute(new Runnable() { // from class: l.ᩳ᩶ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C8441 c8441;
                C11197 c11197 = c11197Mo16333;
                try {
                    c8441 = C15495.m36572(c11197, interfaceC17889M41812);
                } catch (Exception unused) {
                    c8441 = new C8441(new C15495(c11197, null, null, null), 0L);
                }
                C4925.m14315(new RunnableC17571(c69810, i3, c11197, c8441, 0));
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48045() {
        this.f68060.setVisibility(0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48034(String str) {
        f68048.mo1669(C15495.m36571(str));
        f68057.mo1669(C4925.m14327(R.string.MT_Protector));
        f68052.mo1669(C4925.m14327(R.string.MT_Protector));
        f68046.mo1669(C5619.m15924());
        f68044.mo1669(Boolean.FALSE);
        f68054.mo1669((Object) 0);
        f68045.mo1669((Object) 0);
        f68055.mo1669((Object) 0);
        f68051.mo1669((Object) 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48011(long j) {
        int i = (int) (j / 1000);
        return ((i / 60) << 16) | (i % 60);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m48031(int i) {
        int i2 = i >>> 16;
        int i3 = i & 255;
        if (i3 < 10) {
            return i2 + ":0" + i3;
        }
        return i2 + ":" + i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48014(View view, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        C6988 c6988 = f68050;
        if (c6988 != null) {
            InterfaceC17889 interfaceC17889Mo16334 = c6988.f21576.mo16334();
            if (interfaceC17889Mo16334 instanceof C9555) {
                dialogInterfaceC0206.dismiss();
                Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC12210.class);
                intent.setData(((C9555) interfaceC17889Mo16334).mo24433().m36522());
                abstractActivityC3346.startActivity(intent);
                return;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48029(InterfaceC17889 interfaceC17889, AbstractC13921 abstractC13921) {
        C6988 c6988 = f68050;
        if (c6988 == null) {
            return false;
        }
        InterfaceC5577 interfaceC5577 = c6988.f21578;
        if (interfaceC5577.mo15853() || !interfaceC5577.isPlaying()) {
            return false;
        }
        C18340 c18340 = c6988.f21576;
        return C17843.m41812((C11197) c18340.get(c18340.mo16336())).equals(interfaceC17889) && c6988.f21568 == abstractC13921;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48036(AbstractActivityC3346 abstractActivityC3346) {
        C6988 c6988 = f68050;
        if (c6988 != null && !c6988.f21578.mo15853()) {
            new C21100(abstractActivityC3346);
            return;
        }
        if (ApplicationC20075.f65008.contains("mpl")) {
            new C11990(abstractActivityC3346).m20274();
            return;
        }
        C21374.m48463(R.string.MT_Protector);
        if (abstractActivityC3346 instanceof ActivityC9811) {
            abstractActivityC3346.finish();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C6988 m48041() {
        return f68050;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48021(C6988 c6988) {
        if (f68050 == c6988) {
            f68050 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m48037() {
        return f68058;
    }
}
