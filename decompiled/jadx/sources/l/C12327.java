package l;

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
public final class C12327 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static long f36895;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f36896;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f36897;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9503 f36898;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12609 f36899;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f36900;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnPreDrawListenerC0332 f36901;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f36902;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f36903;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC4566 f36904;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f36905;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f36906;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f36907;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f36908;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ViewOnTouchListenerC4542 f36909;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f36910;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f36911;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f36912;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f36913;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23324 f36914;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C14151 f36915;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RunnableC19384 f36916;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16560 f36917;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f36918;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.ViewTreeObserver$OnPreDrawListener, l.֡ۢܳ] */
    public C12327(C16560 c16560, final C9503 c9503) {
        C12609 c12609 = new C12609(new C20089(this));
        this.f36899 = c12609;
        this.f36915 = new C14151();
        this.f36908 = Collections.EMPTY_LIST;
        this.f36903 = -1;
        this.f36905 = -1;
        this.f36910 = -1;
        this.f36907 = -1;
        this.f36911 = new int[0];
        this.f36902 = true;
        this.f36906 = C13132.FOREVER_NS;
        this.f36916 = new RunnableC19384(0, this);
        ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.֡ۢܳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C12327.m29900(this.f1729);
                return true;
            }
        };
        this.f36901 = r1;
        this.f36917 = c16560;
        this.f36898 = c9503;
        this.f36909 = new ViewOnTouchListenerC4542(this, c9503);
        c12609.m14112(c9503);
        c9503.setAdapter((ListAdapter) c12609);
        this.f36914 = new C23324(new C5272(this), new C1038(0, this));
        c9503.getViewTreeObserver().addOnPreDrawListener(r1);
        c9503.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC21500(this));
        c16560.m39056().getLifecycle().mo19833(new InterfaceC17236() { // from class: l.۠ۢܳ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                C12327.m29904(this.f24928, c9503, interfaceC23586, enumC22901);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29904(C12327 c12327, C9503 c9503, InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            c12327.m29914();
            c9503.getViewTreeObserver().removeOnPreDrawListener(c12327.f36901);
        } else if (interfaceC23586.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
            c12327.m29898(0L);
        } else {
            c12327.m29914();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29921(String str) {
        this.f36913 = str;
        this.f36912 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29925(String str) {
        m29899(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m29899(String str, boolean z) {
        C13032 c13032;
        InterfaceC17889 interfaceC17889;
        int iM49424;
        C9503 c9503 = this.f36898;
        int childCount = c9503.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            Object tag = c9503.getChildAt(i2).getTag();
            if ((tag instanceof C13032) && (interfaceC17889 = (c13032 = (C13032) tag).f39025) != null && interfaceC17889.isDirectory() == z && interfaceC17889.getPath().equals(str)) {
                if (z) {
                    iM49424 = C21943.m49424(553648127, 620756991);
                } else {
                    iM49424 = C21943.m49424(889192447, 822083583);
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(iM49424 & C21943.f70284), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                c13032.f39020.setBackground(transitionDrawable);
                if (z) {
                    transitionDrawable.startTransition(EnumC3478.f11019);
                    return;
                } else {
                    C4925.m14316(new RunnableC3861(i, transitionDrawable), 250L);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29919(int i, String str, String str2, List list) {
        ViewTreeObserverOnPreDrawListenerC4566 viewTreeObserverOnPreDrawListenerC4566 = this.f36904;
        if (viewTreeObserverOnPreDrawListenerC4566 != null) {
            viewTreeObserverOnPreDrawListenerC4566.m13417();
        }
        this.f36904 = new ViewTreeObserverOnPreDrawListenerC4566(this, i, str, str2, list);
        this.f36917.m39056().getLifecycle().mo19833(this.f36904);
        C9503 c9503 = this.f36898;
        c9503.getViewTreeObserver().addOnPreDrawListener(this.f36904);
        c9503.invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29916() {
        return this.f36898.getFirstVisiblePosition();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29924(int i) {
        this.f36898.setSelection(i);
        C4925.m14316(new RunnableC18678(i, 0, this), 100L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29901(C12327 c12327, int i) {
        C9503 c9503 = c12327.f36898;
        int firstVisiblePosition = c9503.getFirstVisiblePosition();
        int lastVisiblePosition = c9503.getLastVisiblePosition();
        if (i < firstVisiblePosition || lastVisiblePosition < i) {
            c9503.setSelection(i);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29917(int i, int i2, String str, C23947 c23947) {
        m29921((String) null);
        C9503 c9503 = this.f36898;
        c9503.setSelection(i);
        ViewTreeObserverOnPreDrawListenerC22205 viewTreeObserverOnPreDrawListenerC22205 = new ViewTreeObserverOnPreDrawListenerC22205(this, c23947, i2, new RunnableC15148(0, this, str));
        c9503.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC22205);
        c9503.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC22205);
        c9503.invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29920(int i, C1369 c1369) {
        ViewTreeObserverOnPreDrawListenerC22205 viewTreeObserverOnPreDrawListenerC22205 = new ViewTreeObserverOnPreDrawListenerC22205(this, c1369, i, null);
        C9503 c9503 = this.f36898;
        c9503.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC22205);
        c9503.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC22205);
        c9503.invalidate();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17183 m29897(C12327 c12327, int i, View view, ViewGroup viewGroup) {
        C17183 c17183;
        View view2;
        C16560 c16560 = c12327.f36917;
        C13032 c13032 = view != null ? (C13032) view.getTag() : null;
        boolean z = false;
        if (view instanceof C17183) {
            C17183 c17184 = (C17183) view;
            c17184.m40414();
            view2 = view;
            c17183 = c17184;
        } else {
            C17183 c17185 = new C17183(viewGroup.getContext());
            c13032 = new C13032(z ? 1 : 0);
            c13032.f39020 = c17185.m40417();
            c13032.f39028 = c17185.m40423();
            c13032.f39022 = c17185.m40416();
            c13032.f39024 = c17185.m40418();
            c13032.f39023 = c17185.m40419();
            c13032.f39026 = c17185.m40420();
            c13032.f39027 = c17185.m40421();
            c17185.setTag(c13032);
            c17183 = c17185;
            view2 = c17185;
        }
        String str = c12327.f36913;
        if (str != null && System.currentTimeMillis() - c12327.f36912 > 800) {
            str = null;
        }
        try {
            InterfaceC17889 interfaceC17889M38994 = c16560.m38994(i);
            c13032.f39025 = interfaceC17889M38994;
            if (!c16560.m39039() || interfaceC17889M38994.isDirectory() || interfaceC17889M38994.mo36982()) {
                view2.setAlpha(1.0f);
            } else {
                view2.setAlpha(0.4f);
            }
            if (c16560.f50892.m37542()) {
                view2.setBackgroundColor(interfaceC17889M38994.isChecked() ? C21943.f70286 : 0);
            } else {
                view2.setBackgroundColor(0);
            }
            if (interfaceC17889M38994.mo36968()) {
                c17183.m40415(true);
                c13032.f39027.setText(interfaceC17889M38994.getName());
            } else {
                c17183.m40415(false);
                if (interfaceC17889M38994.mo36983()) {
                    c13032.f39028.setTextColor(C21943.f70291);
                } else {
                    c13032.f39028.setTextColor(C21943.f70275);
                }
                c13032.f39028.setText(interfaceC17889M38994.mo36985());
                if (str != null && str.equals(interfaceC17889M38994.getPath())) {
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C21943.f70284 & C21943.m49424(553648127, 620756991)), new ColorDrawable(0)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    c13032.f39020.setBackground(transitionDrawable);
                    transitionDrawable.startTransition(EnumC3478.f11019);
                    c12327.f36913 = null;
                } else if (c13032.f39020.getBackground() != null) {
                    c13032.f39020.setBackground(null);
                }
                CharSequence charSequenceMo29720 = interfaceC17889M38994.mo29720();
                if (charSequenceMo29720 != null) {
                    c13032.f39022.setText(charSequenceMo29720);
                } else if (interfaceC17889M38994.mo24437()) {
                    long jMo36979 = interfaceC17889M38994.mo36979();
                    if (jMo36979 == -1) {
                        jMo36979 = interfaceC17889M38994.getSize();
                    }
                    c13032.f39022.setText(C22927.m51020(jMo36979));
                } else {
                    c13032.f39022.setText((CharSequence) null);
                }
                if (interfaceC17889M38994.mo36982()) {
                    c13032.f39024.setVisibility(4);
                    c13032.f39024.setText((CharSequence) null);
                    c13032.f39023.setText((CharSequence) null);
                    if (c13032.f39023.getVisibility() != 0) {
                        c13032.f39023.setVisibility(0);
                    }
                } else if (interfaceC17889M38994.mo36972()) {
                    c13032.f39024.setVisibility(4);
                    c13032.f39024.setText((CharSequence) null);
                    c13032.f39023.setVisibility(8);
                } else {
                    if (interfaceC17889M38994.mo36978()) {
                        c13032.f39024.setVisibility(0);
                        c13032.f39024.setText("->");
                    } else if (interfaceC17889M38994.mo25860()) {
                        c13032.f39024.setVisibility(0);
                        c13032.f39024.setText("* ");
                    } else {
                        c13032.f39024.setVisibility(4);
                        c13032.f39024.setText(" ");
                    }
                    CharSequence charSequenceMo21183 = interfaceC17889M38994.mo21183();
                    if (charSequenceMo21183 == null) {
                        int i2 = C19890.f64288;
                        charSequenceMo21183 = C17283.m40573(interfaceC17889M38994.getTime(), (i2 & 1) != 0, (i2 & 2) != 0);
                    }
                    c13032.f39023.setText(charSequenceMo21183);
                    if (c13032.f39023.getVisibility() != 0) {
                        c13032.f39023.setVisibility(0);
                    }
                }
                C11813 icon = interfaceC17889M38994.getIcon();
                if (icon != null) {
                    c13032.f39026.setImageDrawable(icon.m28878());
                }
            }
            int i3 = c13032.f39021;
            int i4 = C19890.f64287;
            if (i3 != i4) {
                c13032.f39021 = i4;
                c13032.f39028.setSingleLine(i4 == 1);
                c13032.f39028.setMaxLines(c13032.f39021);
            }
            int i5 = c13032.f39029;
            int i6 = C19890.f64277;
            if (i5 != i6) {
                c13032.f39029 = i6;
                if (i6 == 1) {
                    c13032.f39027.setTextSize(2, 15.0f);
                    c13032.f39028.setTextSize(2, 13.0f);
                    c13032.f39022.setTextSize(2, 10.0f);
                    c13032.f39024.setTextSize(2, 10.0f);
                    c13032.f39023.setTextSize(2, 10.0f);
                } else if (i6 == 2) {
                    c13032.f39027.setTextSize(2, 17.0f);
                    c13032.f39028.setTextSize(2, 15.0f);
                    c13032.f39022.setTextSize(2, 11.0f);
                    c13032.f39024.setTextSize(2, 11.0f);
                    c13032.f39023.setTextSize(2, 11.0f);
                } else if (i6 == 3) {
                    c13032.f39027.setTextSize(2, 19.0f);
                    c13032.f39028.setTextSize(2, 17.0f);
                    c13032.f39022.setTextSize(2, 12.0f);
                    c13032.f39024.setTextSize(2, 12.0f);
                    c13032.f39023.setTextSize(2, 12.0f);
                }
            }
        } catch (Exception unused) {
        }
        return (C17183) view2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m29911(int i) {
        f36896 = i;
        f36895 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29923() {
        m29908();
        C16560 c16560 = this.f36917;
        InterfaceC10834 interfaceC10834Mo14827 = c16560.m39044().mo14827();
        for (InterfaceC17889 interfaceC17889 : c16560.m39028()) {
            if (interfaceC17889.getIcon() == null) {
                interfaceC17889.mo36967(interfaceC10834Mo14827.mo11258(interfaceC17889));
                int iMo9351 = interfaceC10834Mo14827.mo9351(interfaceC17889);
                if (iMo9351 != 0) {
                    interfaceC17889.mo36974(iMo9351);
                }
            }
        }
        long j = f36895 + ((long) f36896);
        long jUptimeMillis = SystemClock.uptimeMillis();
        C12609 c12609 = this.f36899;
        if (j > jUptimeMillis) {
            c12609.m10504(false);
        } else {
            c12609.m10504(true);
            c12609.m10506();
        }
        c12609.notifyDataSetChanged();
        m29898(0L);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m29928() {
        m29908();
        C16560 c16560 = this.f36917;
        InterfaceC10834 interfaceC10834Mo14827 = c16560.m39044().mo14827();
        for (InterfaceC17889 interfaceC17889 : c16560.m39028()) {
            interfaceC17889.mo36967(interfaceC10834Mo14827.mo11258(interfaceC17889));
            int iMo9351 = interfaceC10834Mo14827.mo9351(interfaceC17889);
            if (iMo9351 != 0) {
                interfaceC17889.mo36974(iMo9351);
            }
        }
        this.f36899.notifyDataSetChanged();
        m29898(0L);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m29927() {
        m29908();
        C12609 c12609 = this.f36899;
        c12609.m10504(false);
        c12609.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29907(C12327 c12327) {
        c12327.f36906 = C13132.FOREVER_NS;
        c12327.f36898.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m29898(long j) {
        if (this.f36917.m39056().getLifecycle().mo19832() == EnumC13728.DESTROYED) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + j;
        if (jUptimeMillis >= this.f36906) {
            return;
        }
        C9503 c9503 = this.f36898;
        RunnableC19384 runnableC19384 = this.f36916;
        c9503.removeCallbacks(runnableC19384);
        this.f36906 = jUptimeMillis;
        c9503.postOnAnimationDelayed(runnableC19384, j);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m29908() {
        this.f36914.m51717();
        this.f36915.m33762();
        this.f36908 = Collections.EMPTY_LIST;
        this.f36907 = -1;
        this.f36910 = -1;
        this.f36905 = -1;
        this.f36903 = -1;
        this.f36911 = new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m29914() {
        if (!this.f36902) {
            m29908();
        }
        this.f36902 = true;
        this.f36898.removeCallbacks(this.f36916);
        this.f36906 = C13132.FOREVER_NS;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29900(C12327 c12327) {
        int i;
        int i2;
        int iCompare;
        int i3;
        int i4;
        int top;
        C9503 c9503 = c12327.f36898;
        C16560 c16560 = c12327.f36917;
        if (!c16560.m39056().getLifecycle().mo19832().m33028(EnumC13728.STARTED) || !c9503.isShown() || !c9503.isAttachedToWindow()) {
            c12327.m29914();
            return;
        }
        if (c16560.m39040()) {
            c12327.m29914();
            c12327.m29898(80L);
            return;
        }
        c12327.f36902 = false;
        AbstractC16891 abstractC16891M39044 = c16560.m39044();
        if (abstractC16891M39044 != c12327.f36897 || !C11003.equals(abstractC16891M39044.m39741(), c12327.f36900)) {
            c12327.m29908();
            c12327.f36897 = abstractC16891M39044;
            c12327.f36900 = abstractC16891M39044.m39741();
        }
        int firstVisiblePosition = c9503.getFirstVisiblePosition();
        int childCount = c9503.getChildCount();
        int i5 = (firstVisiblePosition + childCount) - 1;
        if (childCount <= 0 || (i2 = c12327.f36907) < 0) {
            i = 0;
        } else {
            if (firstVisiblePosition >= i2) {
                int i6 = firstVisiblePosition - i2;
                int[] iArr = c12327.f36911;
                if (i6 < iArr.length) {
                    i4 = iArr[i6];
                    top = c9503.getChildAt(0).getTop();
                } else if (i2 < firstVisiblePosition && (i3 = i2 - firstVisiblePosition) < childCount) {
                    i4 = c12327.f36911[0];
                    top = c9503.getChildAt(i3).getTop();
                } else {
                    iCompare = Integer.compare(firstVisiblePosition, i2) * c9503.getHeight();
                }
                iCompare = i4 - top;
            } else {
                if (i2 < firstVisiblePosition) {
                }
                iCompare = Integer.compare(firstVisiblePosition, i2) * c9503.getHeight();
            }
            i = iCompare;
        }
        if (c12327.f36911.length != childCount) {
            c12327.f36911 = new int[childCount];
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            c12327.f36911[i7] = c9503.getChildAt(i7).getTop();
        }
        c12327.f36907 = childCount == 0 ? -1 : firstVisiblePosition;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int iM33761 = c12327.f36915.m33761(jUptimeMillis, i, c9503.getHeight(), c9503.m24358(), c9503.m24357());
        int iM33760 = c12327.f36915.m33760();
        if (firstVisiblePosition != c12327.f36903 || i5 != c12327.f36905 || iM33761 != c12327.f36910 || iM33760 != c12327.f36918) {
            c12327.f36908 = C14151.m33758(c16560.m39014(), firstVisiblePosition, i5, iM33761, iM33760);
            c12327.f36903 = firstVisiblePosition;
            c12327.f36905 = i5;
            c12327.f36910 = iM33761;
            c12327.f36918 = iM33760;
        }
        c12327.f36914.m51718(c12327.f36908, childCount, abstractC16891M39044, abstractC16891M39044.mo14827(), iM33761, jUptimeMillis);
        if (c9503.m24358()) {
            c12327.m29898(80L);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29905(C12327 c12327, InterfaceC17889 interfaceC17889) {
        C9503 c9503 = c12327.f36898;
        int childCount = c9503.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = c9503.getChildAt(i).getTag();
            if (tag instanceof C13032) {
                C13032 c13032 = (C13032) tag;
                C11813 icon = interfaceC17889.getIcon();
                if (c13032.f39025 == interfaceC17889 && icon != null) {
                    C17939 c17939 = c13032.f39026;
                    if (c9503.m24358()) {
                        c17939.setImageDrawable(icon.m28878());
                        return;
                    }
                    Drawable drawable = c17939.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m28878()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    c17939.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29918(int i, View view) {
        view.setBackgroundColor(C21943.f70286);
        C15854 c15854 = this.f36917.f50892;
        if (!c15854.m37542()) {
            c15854.m37540(i);
        } else if (c15854.m37537(i)) {
            m29927();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29926() {
        ApplicationC20075.m46265(this.f36917.f50892.m37538());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29922(int i) {
        List listM39014;
        C16560 c16560 = this.f36917;
        if (!c16560.m39039() && (listM39014 = c16560.m39014()) != null && i >= 0 && i < listM39014.size()) {
            return !((InterfaceC17889) listM39014.get(i)).mo36981();
        }
        return false;
    }
}
