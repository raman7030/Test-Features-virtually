package p067l;

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
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩷᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final class C22422 {

    /* JADX INFO: renamed from: ֡ */
    public static final C7350 f70726;

    /* JADX INFO: renamed from: ֨ */
    public static final C7350 f70727;

    /* JADX INFO: renamed from: ۖ */
    public static final C7350 f70728;

    /* JADX INFO: renamed from: ۘ */
    public static final C7350 f70729;

    /* JADX INFO: renamed from: ۚ */
    public static final C7350 f70730;

    /* JADX INFO: renamed from: ۜ */
    public static final C7350 f70731;

    /* JADX INFO: renamed from: ۠ */
    public static C9010 f70732;

    /* JADX INFO: renamed from: ۡ */
    public static final C7350 f70733;

    /* JADX INFO: renamed from: ۢ */
    public static final C7350 f70734;

    /* JADX INFO: renamed from: ܳ */
    public static final AtomicLong f70735 = new AtomicLong();

    /* JADX INFO: renamed from: ܺ */
    public static final C7350 f70736;

    /* JADX INFO: renamed from: ᩴ */
    public static final C7350 f70737;

    /* JADX INFO: renamed from: ᩵ */
    public static final C7350 f70738;

    /* JADX INFO: renamed from: ᩷ */
    public static final C7350 f70739;

    /* JADX INFO: renamed from: ᩻ */
    public static boolean f70740;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f70741;

    /* JADX INFO: renamed from: ۧ */
    public ImageView f70742;

    /* JADX INFO: renamed from: ܽ */
    public PopupWindow f70743;

    /* JADX INFO: renamed from: ܿ */
    public boolean f70744;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f70745;

    static {
        C7350 c7350 = new C7350("");
        f70730 = c7350;
        C7350 c7351 = new C7350("");
        f70739 = c7351;
        f70734 = new C7350("");
        f70728 = new C7350(null);
        C7350 c7352 = new C7350(null);
        f70731 = c7352;
        f70729 = new C7350(null);
        C7350 c7353 = new C7350(Boolean.FALSE);
        f70726 = c7353;
        C7350 c7354 = new C7350(0);
        f70736 = c7354;
        C7350 c7355 = new C7350(0);
        f70727 = c7355;
        f70733 = new C7350(0);
        C7350 c7356 = new C7350(0);
        f70737 = c7356;
        C7350 c7357 = new C7350(Integer.valueOf(C19799.m45020()));
        f70738 = c7357;
        c7350.m4063((InterfaceC3326) new C17786());
        c7351.m4063((InterfaceC3326) new C5047());
        c7352.m4063((InterfaceC3326) new C6388());
        c7353.m4063((InterfaceC3326) new C20470());
        c7354.m4063((InterfaceC3326) new C3034());
        c7355.m4063((InterfaceC3326) new C7729());
        c7356.m4063((InterfaceC3326) new C3705());
        c7357.m4063((InterfaceC3326) new C10411());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50350(AbstractActivityC5549 abstractActivityC5549) {
        if (abstractActivityC5549 instanceof ActivityC11693) {
            abstractActivityC5549.finish();
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
    public C22422(final AbstractActivityC5549 abstractActivityC5549) {
        ImageView imageView;
        C16445 c16445;
        this.f70741 = abstractActivityC5549;
        final DialogInterfaceC2564 dialogInterfaceC2564M46709 = abstractActivityC5549.buildDialog().m46709();
        final C1715 c1715 = (C1715) abstractActivityC5549.m12252(R.layout.MT_Protector);
        final C1050 c1050 = new C1050();
        final C1050 c1051 = new C1050();
        c1050.m14561(c1715);
        c1051.m14561((C1715) LayoutInflater.from(abstractActivityC5549).inflate(R.layout.MT_Protector, (ViewGroup) null));
        if (abstractActivityC5549.getResources().getConfiguration().orientation == 2) {
            c1051.m14552(c1715);
        }
        final ?? r2 = new InterfaceC1489() { // from class: l.ۛ᩷ۡ
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                int i = ((Configuration) obj).orientation;
                C1715 c1716 = c1715;
                if (i == 2) {
                    c1051.m14552(c1716);
                } else {
                    c1050.m14552(c1716);
                }
            }
        };
        InterfaceC18749 interfaceC18749 = new InterfaceC18749() { // from class: l.ۨ᩷ۡ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                EnumC24133 enumC24134 = EnumC24133.ON_START;
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                C8361 c8361 = r2;
                if (enumC24133 == enumC24134) {
                    abstractActivityC55410.mo11195(c8361);
                    abstractActivityC55410.mo11194(c8361);
                } else if (enumC24133 == EnumC24133.ON_STOP) {
                    abstractActivityC55410.mo11195(c8361);
                }
            }
        };
        AbstractC9381 lifecycle = dialogInterfaceC2564M46709.getLifecycle();
        lifecycle.mo21806(interfaceC18749);
        if (lifecycle.mo21805().m35142(EnumC15415.STARTED)) {
            abstractActivityC5549.mo11194((InterfaceC1489) r2);
        }
        dialogInterfaceC2564M46709.m3852((ViewGroup) c1715);
        TextView textView = (TextView) c1715.findViewById(R.id.textView1);
        TextView textView2 = (TextView) c1715.findViewById(R.id.textView2);
        final C23114 c23114 = (C23114) c1715.findViewById(R.id.MT_Protector);
        final SeekBar seekBar = (SeekBar) c1715.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) c1715.findViewById(R.id.textView3);
        final TextView textView4 = (TextView) c1715.findViewById(R.id.textView4);
        final ImageView imageView2 = (ImageView) c1715.findViewById(R.id.MT_Protector);
        ImageView imageView3 = (ImageView) c1715.findViewById(R.id.MT_Protector);
        ImageView imageView4 = (ImageView) c1715.findViewById(R.id.MT_Protector);
        final ImageView imageView5 = (ImageView) c1715.findViewById(R.id.MT_Protector);
        ImageView imageView6 = (ImageView) c1715.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC16447.m37363(textView);
        ViewOnClickListenerC16447.m37363(textView2);
        c23114.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܿ᩹ۜ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final C11245 c11245M130;
                final Main mainM38753 = C17127.m38753();
                if (mainM38753 == null || (c11245M130 = mainM38753.m130()) == null || !mainM38753.getLifecycle().mo21805().m35142(EnumC15415.STARTED)) {
                    return false;
                }
                Drawable drawable = (Drawable) C22422.f70728.m4060();
                if (drawable instanceof C3685) {
                    final C3685 c3685 = (C3685) drawable;
                    C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                    c20671BuildDialog.m46730((CharSequence) C22422.f70730.m4060());
                    c20671BuildDialog.m46710(R.string.MT_Protector);
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ᩹ۜ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C22422.m50352(c11245M130, c3685, mainM38753);
                        }
                    });
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46732();
                    return true;
                }
                if (drawable instanceof C7709) {
                    return false;
                }
                C22682.m50793(R.string.MT_Protector);
                return true;
            }
        });
        ImageView imageView7 = (ImageView) c1715.findViewById(R.id.MT_Protector);
        this.f70742 = imageView7;
        imageView7.setOnClickListener(new View.OnClickListener() { // from class: l.ۛ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22422.m50344(view, abstractActivityC5549, dialogInterfaceC2564M46709);
            }
        });
        final boolean zM51768 = C23223.m51768();
        if ((abstractActivityC5549 instanceof Main) || (abstractActivityC5549 instanceof ActivityC11693)) {
            imageView = imageView4;
            c16445 = new InterfaceC1489() { // from class: l.ܳ᩹ۜ
                @Override // p067l.InterfaceC1489
                public final void accept(Object obj) {
                    boolean zM51769 = C23223.m51768();
                    final boolean z = zM51768;
                    if (z == zM51769) {
                        return;
                    }
                    final C22422 c22422 = this.f48322;
                    final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46709;
                    final AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                    c1715.post(new Runnable() { // from class: l.᩸᩹ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22422.m50356(c22422, dialogInterfaceC2564, z, abstractActivityC55410);
                        }
                    });
                }
            };
        } else {
            imageView = imageView4;
            c16445 = 0;
        }
        int i = 1;
        f70730.m4066(dialogInterfaceC2564M46709, new C16179(i, textView));
        f70734.m4066(dialogInterfaceC2564M46709, new C16179(i, textView2));
        f70728.m4066(dialogInterfaceC2564M46709, new InterfaceC3326() { // from class: l.᩻᩹ۜ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                Drawable drawable = (Drawable) obj;
                C23114 c23115 = c23114;
                if (c23115.getDrawable() != drawable) {
                    c23115.setImageDrawable(drawable);
                }
                c23115.m51547();
            }
        });
        f70726.m4066(dialogInterfaceC2564M46709, new InterfaceC3326() { // from class: l.ۜ᩹ۜ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                Boolean bool = (Boolean) obj;
                int i2 = bool.booleanValue() ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                ImageView imageView8 = imageView2;
                imageView8.setImageResource(i2);
                imageView8.setContentDescription(C7050.m16224(bool.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector));
                c23114.m51546(bool.booleanValue());
            }
        });
        f70727.m4066(dialogInterfaceC2564M46709, new InterfaceC3326() { // from class: l.᩷᩹ۜ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                textView4.setText(C22422.m50361(((Integer) obj).intValue()));
            }
        });
        int i2 = 0;
        f70736.m4066(dialogInterfaceC2564M46709, new C11753(i2, textView3));
        f70737.m4066(dialogInterfaceC2564M46709, new InterfaceC3326() { // from class: l.ۡ᩹ۜ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                SeekBar seekBar2 = seekBar;
                seekBar2.setMax(iIntValue);
                Integer num = (Integer) C22422.f70733.m4060();
                C12826.requireNonNull(num);
                seekBar2.setProgress(num.intValue());
            }
        });
        C12826.requireNonNull(seekBar);
        f70733.m4066(dialogInterfaceC2564M46709, new InterfaceC3326() { // from class: l.᩵᩹ۜ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                seekBar.setProgress(((Integer) obj).intValue());
            }
        });
        f70738.m4066(dialogInterfaceC2564M46709, new InterfaceC3326() { // from class: l.᩶᩹ۜ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                int i3;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                float[] fArr = C19799.f60214;
                if (iIntValue == 1) {
                    i3 = R.drawable.MT_Protector;
                } else if (iIntValue != 2) {
                    i3 = iIntValue != 3 ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                } else {
                    i3 = R.drawable.MT_Protector;
                }
                ImageView imageView8 = imageView5;
                imageView8.setImageResource(i3);
                imageView8.setContentDescription(C7050.m16224(C19799.m45025(num.intValue())));
            }
        });
        seekBar.setOnSeekBarChangeListener(new C24492(textView3));
        final C10748 c10748M24758 = C10748.m24758();
        imageView2.setOnClickListener(new ViewOnClickListenerC24898(dialogInterfaceC2564M46709, c10748M24758, 3));
        imageView3.setOnClickListener(new ViewOnClickListenerC7058(i2, dialogInterfaceC2564M46709, c10748M24758));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22422.m50348(dialogInterfaceC2564M46709, c10748M24758);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: l.۬᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22422.m50347(dialogInterfaceC2564M46709, abstractActivityC5549, imageView2);
            }
        });
        imageView5.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۫᩹ۜ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int iM45020 = C19799.m45020();
                C0988 c0988 = new C0988(abstractActivityC5549);
                c0988.m11025(C19799.m45025(iM45020), imageView2);
                C7050.m16213(new RunnableC24165(2, c0988), SnackbarManager.SHORT_DURATION_MS);
                return true;
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() { // from class: l.ۤ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22422.m50355(this.f34726, dialogInterfaceC2564M46709, abstractActivityC5549, c1715);
            }
        });
        c1715.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4316(this, abstractActivityC5549, c16445, C4491.m9493(abstractActivityC5549), new C15774(dialogInterfaceC2564M46709), new C9740(this)));
        c1715.setAlpha(0.0f);
        ObjectAnimator.ofFloat(c1715, "alpha", 0.0f, 1.0f).setDuration(400L).start();
        dialogInterfaceC2564M46709.m3862();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50352(C11245 c11245, C3685 c3685, Main main) {
        C18107 c18107M26079 = c11245.m26079();
        AbstractC17043 abstractC17043M41219 = c18107M26079.m41219(f70732.f24456.mo18259().mo26445().m38675() + ".png", false);
        try {
            try {
                OutputStream outputStreamMo25506 = abstractC17043M41219.mo25506(false);
                try {
                    c3685.getBitmap().compress(Bitmap.CompressFormat.PNG, 90, outputStreamMo25506);
                    c18107M26079.m41231(abstractC17043M41219);
                    if (outputStreamMo25506 != null) {
                        outputStreamMo25506.close();
                    }
                    C17127.m38756();
                } catch (Throwable th) {
                    if (outputStreamMo25506 != null) {
                        try {
                            outputStreamMo25506.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                C17127.m38756();
                throw th3;
            }
        } catch (IOException e) {
            main.m12259(e, (DialogInterface.OnDismissListener) null);
            abstractC17043M41219.mo25503();
            C17127.m38756();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50356(C22422 c22422, DialogInterfaceC2564 dialogInterfaceC2564, boolean z, AbstractActivityC5549 abstractActivityC5549) {
        if (!dialogInterfaceC2564.m3855() || z == C23223.m51768()) {
            return;
        }
        c22422.f70744 = true;
        boolean z2 = c22422.f70742.getVisibility() == 0;
        dialogInterfaceC2564.dismiss();
        C22422 c22423 = new C22422(abstractActivityC5549);
        c22423.f70745 = c22422.f70745;
        if (z2) {
            c22423.m50375();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50365(DialogInterfaceC2564 dialogInterfaceC2564, C10748 c10748) {
        C9010 c9010 = f70732;
        if (c9010 == null || c9010.f24458.mo17768()) {
            dialogInterfaceC2564.dismiss();
        } else if (c10748.m24761()) {
            f70732.m20870();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m50369(DialogInterfaceC2564 dialogInterfaceC2564, C10748 c10748) {
        C9010 c9010 = f70732;
        if (c9010 == null || c9010.f24458.mo17768()) {
            dialogInterfaceC2564.dismiss();
        } else if (c10748.m24761()) {
            f70732.m20869();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50348(DialogInterfaceC2564 dialogInterfaceC2564, C10748 c10748) {
        C9010 c9010 = f70732;
        if (c9010 == null || c9010.f24458.mo17768()) {
            dialogInterfaceC2564.dismiss();
        } else if (c10748.m24761()) {
            f70732.m20871();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50347(DialogInterfaceC2564 dialogInterfaceC2564, AbstractActivityC5549 abstractActivityC5549, ImageView imageView) {
        C9010 c9010 = f70732;
        if (c9010 == null || c9010.f24458.mo17768()) {
            dialogInterfaceC2564.dismiss();
            return;
        }
        int iM45019 = C19799.m45019();
        C0988 c0988 = new C0988(abstractActivityC5549);
        c0988.m11025(C19799.m45025(iM45019), imageView);
        C7050.m16213(new RunnableC24165(2, c0988), SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50355(final C22422 c22422, DialogInterfaceC2564 dialogInterfaceC2564, AbstractActivityC5549 abstractActivityC5549, C1715 c1715) {
        C9010 c9010 = f70732;
        if (c9010 == null || c9010.f24458.mo17768()) {
            dialogInterfaceC2564.dismiss();
            return;
        }
        View viewM45026 = f70732.f24456.m45026(abstractActivityC5549);
        int width = c1715.getWidth();
        int height = c1715.getHeight();
        viewM45026.measure(View.MeasureSpec.makeMeasureSpec(width < height ? (width * 2) / 3 : width / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
        Drawable drawableM50680 = C22622.m50680(abstractActivityC5549, R.drawable.MT_Protector);
        Rect rect = new Rect();
        drawableM50680.getPadding(rect);
        final PopupWindow popupWindow = new PopupWindow(viewM45026, viewM45026.getMeasuredWidth() + rect.left + rect.right, viewM45026.getMeasuredHeight() + rect.top + rect.bottom, true);
        c22422.f70743 = popupWindow;
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.᩹᩹ۜ
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C22422.m50354(this.f75709, popupWindow);
            }
        });
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.setBackgroundDrawable(drawableM50680);
        int[] iArr = new int[2];
        c1715.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - rect.right;
        iArr[1] = iArr[1] - rect.bottom;
        popupWindow.setInputMethodMode(2);
        popupWindow.showAtLocation(c1715, 85, iArr[0], iArr[1]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50354(C22422 c22422, PopupWindow popupWindow) {
        if (c22422.f70743 == popupWindow) {
            c22422.f70743 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50353(AbstractC15599 abstractC15599, List list, int i) {
        C23092.m51503();
        C9010 c9010 = f70732;
        if (c9010 != null) {
            c9010.m20866(false);
        }
        m50364(((InterfaceC19370) list.get(i)).getName());
        C9010 c9011 = new C9010(abstractC15599, list, i, C10351.m23978(abstractC15599, list, i));
        f70732 = c9011;
        c9011.m20872();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50349(C4847 c4847, int i) {
        C23092.m51503();
        C9010 c9010 = f70732;
        if (c9010 != null) {
            c9010.m20866(false);
        }
        String name = ((InterfaceC19370) c4847.m10274().get(c4847.m10273())).getName();
        int iMax = Math.max(i, 0);
        f70730.mo4067(C17095.m38730(name));
        f70739.mo4067("");
        f70734.mo4067("");
        f70728.mo4067(C7709.m17845());
        f70731.mo4067((Object) null);
        f70729.mo4067((Object) null);
        f70726.mo4067(Boolean.FALSE);
        int i2 = (int) (((long) iMax) / 1000);
        f70736.mo4067(Integer.valueOf((i2 % 60) | ((i2 / 60) << 16)));
        f70727.mo4067((Object) 0);
        f70737.mo4067((Object) 0);
        f70733.mo4067(Integer.valueOf(iMax / 50));
        C9010 c9011 = new C9010(c4847.m10275(), c4847.m10274(), c4847.m10273(), true);
        f70732 = c9011;
        int iMax2 = Math.max(i, 0);
        c9011.f24450 = iMax2;
        c9011.f24452 = iMax2 > 0;
        c9011.f24453 = false;
        final C9010 c9012 = f70732;
        final int i3 = c9012.f24447 + 1;
        c9012.f24447 = i3;
        final C13010 c13010Mo18258 = c9012.f24456.mo18258();
        final InterfaceC19370 interfaceC19370M44058 = C19326.m44058(c13010Mo18258);
        C4081.f8987.execute(new Runnable() { // from class: l.ᩳ᩶ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C10391 c10391;
                C13010 c13010 = c13010Mo18258;
                try {
                    c10391 = C17095.m38731(c13010, interfaceC19370M44058);
                } catch (Exception unused) {
                    c10391 = new C10391(new C17095(c13010, null, null, null), 0L);
                }
                C7050.m16212(new RunnableC19068(c9012, i3, c13010, c10391, 0));
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50375() {
        this.f70742.setVisibility(0);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50364(String str) {
        f70730.mo4067(C17095.m38730(str));
        f70739.mo4067(C7050.m16224(R.string.MT_Protector));
        f70734.mo4067(C7050.m16224(R.string.MT_Protector));
        f70728.mo4067(C7709.m17845());
        f70726.mo4067(Boolean.FALSE);
        f70736.mo4067((Object) 0);
        f70727.mo4067((Object) 0);
        f70737.mo4067((Object) 0);
        f70733.mo4067((Object) 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m50341(long j) {
        int i = (int) (j / 1000);
        return ((i / 60) << 16) | (i % 60);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m50361(int i) {
        int i2 = i >>> 16;
        int i3 = i & 255;
        if (i3 < 10) {
            return i2 + ":0" + i3;
        }
        return i2 + ":" + i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50344(View view, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564) {
        C9010 c9010 = f70732;
        if (c9010 != null) {
            InterfaceC19370 interfaceC19370Mo18259 = c9010.f24456.mo18259();
            if (interfaceC19370Mo18259 instanceof C11450) {
                dialogInterfaceC2564.dismiss();
                Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC13973.class);
                intent.setData(((C11450) interfaceC19370Mo18259).mo26445().m38680());
                abstractActivityC5549.startActivity(intent);
                return;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m50359(InterfaceC19370 interfaceC19370, AbstractC15599 abstractC15599) {
        C9010 c9010 = f70732;
        if (c9010 == null) {
            return false;
        }
        InterfaceC7669 interfaceC7669 = c9010.f24458;
        if (interfaceC7669.mo17768() || !interfaceC7669.isPlaying()) {
            return false;
        }
        C19799 c19799 = c9010.f24456;
        return C19326.m44058((C13010) c19799.get(c19799.mo18261())).equals(interfaceC19370) && c9010.f24448 == abstractC15599;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50366(AbstractActivityC5549 abstractActivityC5549) {
        C9010 c9010 = f70732;
        if (c9010 != null && !c9010.f24458.mo17768()) {
            new C22422(abstractActivityC5549);
            return;
        }
        if (ApplicationC21448.f67649.contains("mpl")) {
            new C13764(abstractActivityC5549).m22250();
            return;
        }
        C22682.m50799(R.string.MT_Protector);
        if (abstractActivityC5549 instanceof ActivityC11693) {
            abstractActivityC5549.finish();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static C9010 m50371() {
        return f70732;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50351(C9010 c9010) {
        if (f70732 == c9010) {
            f70732 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m50367() {
        return f70740;
    }
}
