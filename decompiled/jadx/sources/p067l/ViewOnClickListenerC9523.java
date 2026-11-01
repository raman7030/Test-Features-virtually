package p067l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnClickListenerC9523 extends ComponentCallbacksC11117 implements View.OnClickListener, InterfaceC16897, InterfaceC10193, InterfaceC2787 {

    /* JADX INFO: renamed from: ۗ */
    public FloatingActionButton f26072;

    /* JADX INFO: renamed from: ۙ */
    public C15036 f26073;

    /* JADX INFO: renamed from: ۛ */
    public C8331 f26074;

    /* JADX INFO: renamed from: ۟ */
    public C5946 f26075;

    /* JADX INFO: renamed from: ۤ */
    public FloatingActionButton f26076;

    /* JADX INFO: renamed from: ۨ */
    public String f26077;

    /* JADX INFO: renamed from: ۫ */
    public FloatingActionButton f26078;

    /* JADX INFO: renamed from: ۬ */
    public FloatingActionButton f26079;

    /* JADX INFO: renamed from: ܰ */
    public C14849 f26080;

    /* JADX INFO: renamed from: ᩶ */
    public C14121 f26081;

    /* JADX INFO: renamed from: ᩸ */
    public C15556 f26082;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f26083;

    /* JADX INFO: renamed from: ᩺ */
    public int f26084;

    public ViewOnClickListenerC9523() {
        super(R.layout.MT_Protector);
        this.f26084 = -1;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        final byte[] byteArray;
        super.onCreate(bundle);
        C16898 c16898 = new C16898(this);
        this.f26082 = c16898;
        c16898.m35378((InterfaceC16897) this);
        this.f26082.m35377((InterfaceC10193) this);
        if (bundle != null) {
            this.f26077 = bundle.getString("importParent");
            byteArray = bundle.getByteArray("selection");
        } else {
            byteArray = null;
        }
        C5946 c5946 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f26075 = c5946;
        c5946.m13355().m4066(this, new InterfaceC3326() { // from class: l.ᩳܳۢ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                ViewOnClickListenerC9523.m22180((C14121) obj, this.f59583, byteArray);
            }
        });
        C8331 c8331M46367 = ViewOnClickListenerC20541.m46367(this, new C4975(4, this));
        c8331M46367.m38699("project_import_init_path");
        this.f26074 = c8331M46367;
        C15036 c15036M46373 = ViewOnClickListenerC20541.m46373(this, new C18191(6, this));
        c15036M46373.m38699("project_export_init_path");
        this.f26073 = c15036M46373;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22180(final C14121 c14121, final ViewOnClickListenerC9523 viewOnClickListenerC9523, final byte[] bArr) {
        viewOnClickListenerC9523.f26081 = c14121;
        C4081.f8987.execute(new Runnable() { // from class: l.ܿܳۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C14121 c14122 = c14121;
                final C18676 c18676M32114 = c14122.m32114();
                final ViewOnClickListenerC9523 viewOnClickListenerC9524 = viewOnClickListenerC9523;
                final byte[] bArr2 = bArr;
                C7050.m16212(new Runnable() { // from class: l.ܳܳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC9523.m22178(viewOnClickListenerC9524, c18676M32114, bArr2, c14122);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22178(ViewOnClickListenerC9523 viewOnClickListenerC9523, C18676 c18676, byte[] bArr, C14121 c14121) {
        viewOnClickListenerC9523.f26082.m35379(c18676);
        viewOnClickListenerC9523.f26084 = 0;
        C15556 c15556 = viewOnClickListenerC9523.f26082;
        HashSet hashSet = new HashSet();
        C14121 c14122 = viewOnClickListenerC9523.f26081;
        if (c14122 != null) {
            AbstractC17043 abstractC17043M29392 = c14122.m32105().m29392("explorer");
            if (abstractC17043M29392.mo25094()) {
                try {
                    C14677 c14677M38686 = abstractC17043M29392.m38686();
                    if (c14677M38686.readInt() == 305419897) {
                        viewOnClickListenerC9523.f26084 = c14677M38686.readInt();
                        int i = c14677M38686.readInt();
                        for (int i2 = 0; i2 < i; i2++) {
                            hashSet.add(c14677M38686.m33591());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        c15556.m35374(hashSet);
        C14849 c14849 = viewOnClickListenerC9523.f26080;
        if (c14849 != null) {
            c14849.scrollToPosition(viewOnClickListenerC9523.f26084);
            viewOnClickListenerC9523.f26084 = -1;
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                AbstractC17043 abstractC17043M29393 = c14121.m32108().m29392("selection");
                try {
                    viewOnClickListenerC9523.f26082.m35384(abstractC17043M29393.m38664());
                } catch (IOException unused2) {
                } finally {
                    abstractC17043M29393.mo29990();
                }
            } else {
                viewOnClickListenerC9523.f26082.m35384(bArr);
            }
        }
        viewOnClickListenerC9523.f26083 = true;
        ActivityC3069 activity = viewOnClickListenerC9523.getActivity();
        if (activity instanceof ActivityC18686) {
            ((ActivityC18686) activity).m42605();
        }
        if (viewOnClickListenerC9523.getView() != null) {
            viewOnClickListenerC9523.f26075.m13332(viewOnClickListenerC9523.getViewLifecycleOwner(), new C7512(viewOnClickListenerC9523));
            if (viewOnClickListenerC9523.f26082.m35386()) {
                viewOnClickListenerC9523.m22187();
            }
        }
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C14849 c14849 = (C14849) view.findViewById(R.id.MT_Protector);
        this.f26080 = c14849;
        c14849.setTag("RecyclerView0");
        this.f26072 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f26076 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f26078 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f26079 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f26080.setAdapter(this.f26082);
        int i = this.f26084;
        if (i != -1) {
            this.f26080.scrollToPosition(i);
            this.f26084 = -1;
        }
        if (this.f26083) {
            ActivityC3069 activity = getActivity();
            if (activity instanceof ActivityC18686) {
                ((ActivityC18686) activity).m42605();
            }
            this.f26075.m13332(getViewLifecycleOwner(), new C7512(this));
            if (this.f26082.m35386()) {
                m22187();
            }
        }
        this.f26080.addOnScrollListener(this.f26082.m35369(new C3488(0, this)));
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("importParent", this.f26077);
        byte[] bArrM35399 = this.f26082.m35399();
        if (bArrM35399 != null) {
            if (bArrM35399.length > 20480) {
                try {
                    AbstractC17043 abstractC17043M29392 = this.f26081.m32108().m29392("selection");
                    abstractC17043M29392.getClass();
                    abstractC17043M29392.m38661(bArrM35399, 0, bArrM35399.length);
                    bundle.putByteArray("selection", new byte[0]);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            bundle.putByteArray("selection", bArrM35399);
        }
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26080.setAdapter(null);
        this.f26080 = null;
        this.f26072 = null;
        this.f26076 = null;
        this.f26078 = null;
        this.f26079 = null;
    }

    @Override // p067l.InterfaceC2787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4372() {
        if (!this.f26082.m35386()) {
            return false;
        }
        this.f26082.mo35370();
        return true;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onPause() {
        super.onPause();
        C14121 c14121 = this.f26081;
        if (c14121 != null && c14121.m38427().m29398()) {
            C11996 c11996M45308 = C19965.m45308(305419897);
            HashSet hashSetM35392 = this.f26082.m35392();
            c11996M45308.writeInt(((C8541) this.f26080.getLayoutManager()).findFirstVisibleItemPosition());
            c11996M45308.writeInt(hashSetM35392.size());
            Iterator it = hashSetM35392.iterator();
            while (it.hasNext()) {
                c11996M45308.m27443((CharSequence) it.next());
            }
            try {
                this.f26081.m32105().m29392("explorer").m38654(c11996M45308);
            } catch (IOException e) {
                C5946 c5946 = this.f26075;
                if (c5946 != null) {
                    c5946.m13320((Throwable) e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22191() {
        if (this.f26081 != null) {
            HashSet hashSetM35392 = this.f26082.m35392();
            this.f26082.m35379(this.f26081.m32114());
            this.f26082.m35374(hashSetM35392);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22192(String str) {
        C15556 c15556 = this.f26082;
        c15556.getClass();
        c15556.m35373((Collection) Collections.singletonList(str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22190(Collection collection) {
        this.f26082.m35373(collection);
    }

    @Override // p067l.InterfaceC16897
    /* JADX INFO: renamed from: ۧ */
    public final void mo18532(C18498 c18498) {
        ((ActivityC18686) requireActivity()).m42588(c18498.m42048(), (C20699) null);
        this.f26081.m32087(c18498.m42048());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006b  */
    @Override // p067l.InterfaceC10193
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18531(final C18498 c18498) {
        final C24375 c24375;
        C1898 c1898 = new C1898(requireContext(), c18498.m42045(), 0);
        if (c18498.m42050()) {
            c24375 = new C24375(c1898, c18498.m42048(), true);
        } else {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c24375 = null;
        }
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        if (c18498.m42050()) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            if (!(c18498.m42048() + "/").startsWith("# TOO_LONG_NAME/")) {
                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            }
        }
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.۠ܳۢ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ViewOnClickListenerC9523.m22179(this.f28260, c24375, c18498, menuItem);
                return true;
            }
        });
        this.f26080.suppressLayout(true);
        c1898.m50635((InterfaceC1233) new C8072(6, this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22179(final ViewOnClickListenerC9523 viewOnClickListenerC9523, C24375 c24375, final C18498 c18498, MenuItem menuItem) {
        if (c24375 == null || !c24375.m53728(menuItem)) {
            int itemId = menuItem.getItemId();
            if (itemId == R.string.MT_Protector) {
                new ViewOnClickListenerC18240(viewOnClickListenerC9523, c18498.m42048()).m41499();
                return;
            }
            if (itemId == R.string.MT_Protector) {
                ((ActivityC18686) viewOnClickListenerC9523.requireActivity()).m42608(new Runnable() { // from class: l.᩻ܳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC9523 viewOnClickListenerC9524 = this.f79655;
                        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) viewOnClickListenerC9524.requireActivity();
                        C18498 c18499 = c18498;
                        C6841 c6841 = new C6841(viewOnClickListenerC9524, abstractActivityC5549, abstractActivityC5549, c18499);
                        c6841.m33344(R.string.MT_Protector);
                        c6841.m33336((CharSequence) c18499.m42048());
                        c6841.m33330();
                        c6841.m33328();
                        c6841.m33365(6);
                        c6841.m33352(true);
                    }
                });
                return;
            }
            if (itemId == R.string.MT_Protector) {
                if (c18498.m42050()) {
                    viewOnClickListenerC9523.f26077 = c18498.m42046();
                } else {
                    viewOnClickListenerC9523.f26077 = c18498.m42048();
                }
                C8331 c8331 = viewOnClickListenerC9523.f26074;
                c8331.getClass();
                C8331.m19221(c8331, R.string.MT_Protector, null, new String[]{"smali", "zip", "dex"}, 8);
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                if (c18498.m42050()) {
                    viewOnClickListenerC9523.m22166(R.string.MT_Protector, c18498.m42046(), "", false, new C22265());
                    return;
                } else {
                    viewOnClickListenerC9523.m22166(R.string.MT_Protector, c18498.m42048(), "", false, new C22265());
                    return;
                }
            }
            int i = 1;
            if (itemId == R.string.MT_Protector) {
                Context contextRequireContext = viewOnClickListenerC9523.requireContext();
                int i2 = DialogInterfaceC2564.f4230;
                C20671 c20671 = new C20671(contextRequireContext);
                c20671.m46727(R.string.MT_Protector);
                c20671.m46718(viewOnClickListenerC9523.getString(R.string.MT_Protector, c18498.m42044()));
                c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24226(i, viewOnClickListenerC9523, c18498));
                c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671.m46732();
                return;
            }
            if (itemId == R.string.MT_Protector) {
                c18498.m42049();
                FloatingActionButton floatingActionButton = viewOnClickListenerC9523.f26072;
                FloatingActionButton floatingActionButton2 = viewOnClickListenerC9523.f26079;
                FloatingActionButton floatingActionButton3 = viewOnClickListenerC9523.f26078;
                FloatingActionButton floatingActionButton4 = viewOnClickListenerC9523.f26076;
                floatingActionButton.setOnClickListener(viewOnClickListenerC9523);
                floatingActionButton2.setOnClickListener(viewOnClickListenerC9523);
                floatingActionButton3.setOnClickListener(viewOnClickListenerC9523);
                floatingActionButton4.setOnClickListener(viewOnClickListenerC9523);
                floatingActionButton.setVisibility(0);
                floatingActionButton2.setVisibility(0);
                floatingActionButton3.setVisibility(0);
                floatingActionButton4.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
                float height = floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                floatingActionButton.setTranslationY(height);
                floatingActionButton.setAlpha(0.8f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", height, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
                float height2 = floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                floatingActionButton2.setTranslationY(height2);
                floatingActionButton2.setAlpha(0.8f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", height2, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton4.getLayoutParams();
                float height3 = floatingActionButton4.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                floatingActionButton4.setTranslationY(height3);
                floatingActionButton4.setAlpha(0.8f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", height3, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
                float height4 = floatingActionButton3.getHeight() + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                floatingActionButton3.setTranslationY(height4);
                floatingActionButton3.setAlpha(0.8f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", height4, 0.0f);
                AnimatorSet duration = new AnimatorSet().setDuration(200L);
                duration.setInterpolator(new DecelerateInterpolator());
                duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                duration.start();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22177(ViewOnClickListenerC9523 viewOnClickListenerC9523, C18498 c18498) {
        c18498.m42043();
        if (c18498.m42050()) {
            C14121 c14121 = viewOnClickListenerC9523.f26081;
            String strM42048 = c18498.m42048();
            c14121.getClass();
            c14121.m32092(Collections.singleton(strM42048));
        } else {
            viewOnClickListenerC9523.f26081.m32129(c18498.m42048());
        }
        ((ActivityC18686) viewOnClickListenerC9523.requireActivity()).m42594();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m22182(ViewOnClickListenerC9523 viewOnClickListenerC9523) {
        C14849 c14849 = viewOnClickListenerC9523.f26080;
        if (c14849 != null) {
            c14849.suppressLayout(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            Context contextRequireContext = requireContext();
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(contextRequireContext);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46718(getString(R.string.MT_Protector, Integer.valueOf(this.f26082.m35387())));
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴܳۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC9523.m22168(this.f62602);
                }
            });
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732();
            return;
        }
        if (id == R.id.MT_Protector) {
            CharSequence[] charSequenceArr = {getString(R.string.MT_Protector, "Smali"), getString(R.string.MT_Protector, "Dex"), getString(R.string.MT_Protector, "Jar")};
            Context contextRequireContext2 = requireContext();
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20672 = new C20671(contextRequireContext2);
            c20672.m46724(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.᩵ܳۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ViewOnClickListenerC9523.m22169(this.f65713, i3);
                }
            });
            c20672.m46732();
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f26082.m35382(new C22934());
            return;
        }
        if (id == R.id.MT_Protector) {
            final Set<String> setM32130 = this.f26081.m32130();
            if (setM32130.isEmpty()) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            this.f26082.m35382(new InterfaceC24274() { // from class: l.֡ܳۢ
                @Override // p067l.InterfaceC24274
                /* JADX INFO: renamed from: ֫ */
                public final int mo4456(String str, boolean z) {
                    return setM32130.contains(str) ? 2 : 1;
                }
            });
            HashSet hashSet = new HashSet();
            for (String strSubstring : setM32130) {
                while (true) {
                    int iLastIndexOf = strSubstring.lastIndexOf(47);
                    if (iLastIndexOf != -1) {
                        strSubstring = strSubstring.substring(0, iLastIndexOf);
                        hashSet.add(strSubstring + "/");
                    }
                }
            }
            this.f26082.m35374(hashSet);
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22169(ViewOnClickListenerC9523 viewOnClickListenerC9523, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        if (i == 0) {
            C15036 c15036 = viewOnClickListenerC9523.f26073;
            c15036.getClass();
            C15036.m34410(c15036, R.string.MT_Protector, bundle, null, "smali.zip", new String[]{"zip"}, 32);
        } else if (i == 1) {
            C15036 c15037 = viewOnClickListenerC9523.f26073;
            c15037.getClass();
            C15036.m34410(c15037, R.string.MT_Protector, bundle, null, "classes.dex", new String[]{"dex"}, 32);
        } else {
            if (i != 2) {
                return;
            }
            C15036 c15038 = viewOnClickListenerC9523.f26073;
            c15038.getClass();
            C15036.m34410(c15038, R.string.MT_Protector, bundle, null, "classes.jar", new String[]{"jar"}, 32);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22187() {
        FloatingActionButton floatingActionButton = this.f26072;
        FloatingActionButton floatingActionButton2 = this.f26079;
        FloatingActionButton floatingActionButton3 = this.f26078;
        FloatingActionButton floatingActionButton4 = this.f26076;
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton4.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
        floatingActionButton4.setVisibility(0);
        floatingActionButton.setTranslationY(0.0f);
        floatingActionButton.setAlpha(0.8f);
        floatingActionButton2.setTranslationY(0.0f);
        floatingActionButton2.setAlpha(0.8f);
        floatingActionButton3.setTranslationY(0.0f);
        floatingActionButton3.setAlpha(0.8f);
        floatingActionButton4.setTranslationY(0.0f);
        floatingActionButton4.setAlpha(0.8f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m22181(boolean z) {
        FloatingActionButton floatingActionButton = this.f26072;
        FloatingActionButton floatingActionButton2 = this.f26079;
        FloatingActionButton floatingActionButton3 = this.f26078;
        FloatingActionButton floatingActionButton4 = this.f26076;
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton4, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton3, "alpha", 0.8f, 0.0f));
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton4.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", 0.0f, floatingActionButton4.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", 0.0f, floatingActionButton3.getHeight() + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin);
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        }
        duration.addListener(new C5500(floatingActionButton, floatingActionButton2, floatingActionButton4, floatingActionButton3));
        duration.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22168(ViewOnClickListenerC9523 viewOnClickListenerC9523) {
        if (viewOnClickListenerC9523.f26081 == null) {
            return;
        }
        viewOnClickListenerC9523.f26081.m32092(viewOnClickListenerC9523.f26082.m35388());
        viewOnClickListenerC9523.f26082.m35400();
        viewOnClickListenerC9523.m22181(true);
        ((ActivityC18686) viewOnClickListenerC9523.requireActivity()).m42594();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m22167(Runnable runnable) {
        if (this.f26083) {
            runnable.run();
        } else {
            C7050.m16213(new RunnableC11064(3, this, runnable), 100L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22171(ViewOnClickListenerC9523 viewOnClickListenerC9523, Runnable runnable) {
        if (viewOnClickListenerC9523.isResumed()) {
            viewOnClickListenerC9523.m22167(runnable);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m22184(ViewOnClickListenerC9523 viewOnClickListenerC9523, String str, Bundle bundle) {
        if (viewOnClickListenerC9523.f26081 == null) {
            return;
        }
        new C14887(viewOnClickListenerC9523, bundle.getInt("type"), viewOnClickListenerC9523.f26082.m35388(), str).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22175(final ViewOnClickListenerC9523 viewOnClickListenerC9523, final String str, final ArrayList arrayList, final boolean z) {
        final AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) viewOnClickListenerC9523.requireActivity();
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC10865 viewOnClickListenerC10865 = new ViewOnClickListenerC10865(radioButton, radioButton2, editText, 0);
        radioButton.setOnClickListener(viewOnClickListenerC10865);
        radioButton2.setOnClickListener(viewOnClickListenerC10865);
        final Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        editText.setText(viewOnClickListenerC9523.f26077);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = viewOnClickListenerC9523.f26081.m32128().iterator();
        while (it.hasNext()) {
            arrayList2.add(((String) it.next()) + ".dex");
        }
        if (arrayList2.size() > 1) {
            spinner.setAdapter((SpinnerAdapter) new C21438(viewOnClickListenerC9523.requireContext(), arrayList2));
        } else {
            viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        Context contextRequireContext = viewOnClickListenerC9523.requireContext();
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(contextRequireContext);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺܳۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (z) {
                    C18524.m42109(str, new String[0]).mo25503();
                }
            }
        });
        c20671.m46713(new DialogInterfaceOnCancelListenerC8559(z, str));
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۖܳۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strReplace;
                dialogInterfaceC2564M46732.dismiss();
                if (radioButton.isChecked()) {
                    strReplace = "";
                } else {
                    strReplace = editText.getText().toString().replace('.', '/');
                    if (strReplace.startsWith("/")) {
                        strReplace = strReplace.substring(1);
                    }
                    if (!strReplace.isEmpty() && !strReplace.endsWith("/")) {
                        strReplace = strReplace.concat("/");
                    }
                }
                new C13547(this.f10986, abstractActivityC5549, spinner, str, arrayList, strReplace, z).m22250();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m22166(int i, String str, String str2, final boolean z, final InterfaceC21152 interfaceC21152) {
        if (str == null) {
            str = "";
        }
        String strReplace = str.replace('/', '.');
        if (strReplace.endsWith(".")) {
            strReplace = C17073.m38720(1, 0, strReplace);
        }
        View viewM12252 = ((AbstractActivityC5549) requireActivity()).m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(i);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        editText.setText(strReplace);
        editText2.setText(str2);
        editText2.setSelection(editText2.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26081.m32128().iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()) + ".dex");
        }
        if (arrayList.size() > 1) {
            spinner.setAdapter((SpinnerAdapter) new C21438(requireContext(), arrayList));
        } else {
            viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        Context contextRequireContext = requireContext();
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(contextRequireContext);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۢܳۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC9523.m22170(this.f32178, editText2, editText, z, dialogInterfaceC2564M46732, interfaceC21152, spinner);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22170(final ViewOnClickListenerC9523 viewOnClickListenerC9523, EditText editText, EditText editText2, boolean z, final DialogInterfaceC2564 dialogInterfaceC2564, final InterfaceC21152 interfaceC21152, Spinner spinner) {
        if (editText.getText().toString().isEmpty()) {
            editText.requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        String strReplace = editText2.getText().toString().replace('.', '/');
        if (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        if (!strReplace.isEmpty() && !strReplace.endsWith("/")) {
            strReplace = strReplace.concat("/");
        }
        String string = editText.getText().toString();
        if (C13259.m30304("[./\\s]").matcher((CharSequence) string).find()) {
            editText.requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        final String strM40053 = C17588.m40053(strReplace, string);
        if (!viewOnClickListenerC9523.f26081.m32119(strM40053)) {
            String str = (String) viewOnClickListenerC9523.f26081.m32128().get(Math.max(0, spinner.getSelectedItemPosition()));
            try {
                viewOnClickListenerC9523.f26081.m32089(str, strM40053, (String) interfaceC21152.mo9100(str, strM40053));
                viewOnClickListenerC9523.m22191();
                viewOnClickListenerC9523.m22192(strM40053);
                dialogInterfaceC2564.dismiss();
                return;
            } catch (Exception e) {
                viewOnClickListenerC9523.f26075.m13320((Throwable) e);
                return;
            }
        }
        if (!z) {
            editText.requestFocus();
            C22682.m50795((CharSequence) viewOnClickListenerC9523.getString(R.string.MT_Protector, strM40053.replace('/', '.')));
            return;
        }
        Context contextRequireContext = viewOnClickListenerC9523.requireContext();
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(contextRequireContext);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46718(viewOnClickListenerC9523.getString(R.string.MT_Protector, strM40053.replace('/', '.')));
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘܳۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ViewOnClickListenerC9523.m22176(this.f15495, dialogInterfaceC2564, interfaceC21152, strM40053);
            }
        });
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22176(ViewOnClickListenerC9523 viewOnClickListenerC9523, DialogInterfaceC2564 dialogInterfaceC2564, InterfaceC21152 interfaceC21152, String str) {
        dialogInterfaceC2564.dismiss();
        try {
            viewOnClickListenerC9523.f26081.m32088(str, (String) interfaceC21152.mo9100(null, str));
            viewOnClickListenerC9523.m22191();
            viewOnClickListenerC9523.m22192(str);
        } catch (Exception e) {
            viewOnClickListenerC9523.f26075.m13320((Throwable) e);
        }
    }
}
