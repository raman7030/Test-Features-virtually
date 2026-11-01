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
import bin.p000mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.᩸ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnClickListenerC22924 extends ComponentCallbacksC11117 implements View.OnClickListener, InterfaceC16897, InterfaceC10193, InterfaceC2787 {

    /* JADX INFO: renamed from: ֫֫ */
    public C14849 f72124;

    /* JADX INFO: renamed from: ۗ */
    public C8331 f72125;

    /* JADX INFO: renamed from: ۙ */
    public boolean f72126;

    /* JADX INFO: renamed from: ۛ */
    public FloatingActionButton f72127;

    /* JADX INFO: renamed from: ۟ */
    public int f72128;

    /* JADX INFO: renamed from: ۤ */
    public FloatingActionButton f72129;

    /* JADX INFO: renamed from: ۧ֫ */
    public C5946 f72130;

    /* JADX INFO: renamed from: ۨ */
    public C15036 f72131;

    /* JADX INFO: renamed from: ۫ */
    public FloatingActionButton f72132;

    /* JADX INFO: renamed from: ۬ */
    public FloatingActionButton f72133;

    /* JADX INFO: renamed from: ܰ */
    public AnimatorSet f72134;

    /* JADX INFO: renamed from: ᩶ */
    public C20856 f72135;

    /* JADX INFO: renamed from: ᩸ */
    public C15556 f72136;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f72137;

    /* JADX INFO: renamed from: ᩺ */
    public C8331 f72138;

    public ViewOnClickListenerC22924() {
        super(R.layout.MT_Protector);
        this.f72128 = -1;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        final byte[] byteArray;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f72126 = bundle.getBoolean("batchExportMode", false);
            byteArray = bundle.getByteArray("selection");
        } else {
            byteArray = null;
        }
        C17558 c17558 = new C17558(this, C15556.m35366("<>"));
        this.f72136 = c17558;
        c17558.m35390(!this.f72126);
        this.f72136.m35378((InterfaceC16897) this);
        this.f72136.m35377((InterfaceC10193) this);
        C5946 c5946 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f72130 = c5946;
        c5946.m13347().m4066(this, new InterfaceC3326() { // from class: l.ۢܰ᩷
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                ViewOnClickListenerC22924.m51226(this.f32141, byteArray, (C20856) obj);
            }
        });
        C15036 c15036M46373 = ViewOnClickListenerC20541.m46373((ComponentCallbacksC11117) this, (InterfaceC13696) new C18758(3, this));
        c15036M46373.m38699("project_import_init_path");
        this.f72131 = c15036M46373;
        C8331 c8331M46367 = ViewOnClickListenerC20541.m46367(this, new C8047(2, this));
        c8331M46367.m38699("project_import_init_path");
        this.f72138 = c8331M46367;
        C8331 c8331M46368 = ViewOnClickListenerC20541.m46367(this, new C16075(this));
        c8331M46368.m38699("project_export_init_path");
        this.f72125 = c8331M46368;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51226(ViewOnClickListenerC22924 viewOnClickListenerC22924, byte[] bArr, C20856 c20856) {
        viewOnClickListenerC22924.f72135 = c20856;
        C4081.f8987.execute(new RunnableC10854(viewOnClickListenerC22924, c20856, bArr, 0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51225(ViewOnClickListenerC22924 viewOnClickListenerC22924, C18676 c18676, byte[] bArr, C20856 c20856) {
        viewOnClickListenerC22924.f72136.m35379(c18676);
        viewOnClickListenerC22924.f72128 = 0;
        C15556 c15556 = viewOnClickListenerC22924.f72136;
        HashSet hashSet = new HashSet();
        C20856 c20857 = viewOnClickListenerC22924.f72135;
        if (c20857 != null) {
            AbstractC17043 abstractC17043M29392 = c20857.m47150().m29392("explorer");
            if (!abstractC17043M29392.mo25094()) {
                Iterator it = c18676.m42496().iterator();
                while (it.hasNext()) {
                    hashSet.add(((C18676) it.next()).m42501() + "/");
                }
            } else {
                try {
                    C14677 c14677M38686 = abstractC17043M29392.m38686();
                    if (c14677M38686.readInt() == 305419897) {
                        viewOnClickListenerC22924.f72128 = c14677M38686.readInt();
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
        C14849 c14849 = viewOnClickListenerC22924.f72124;
        if (c14849 != null) {
            c14849.scrollToPosition(viewOnClickListenerC22924.f72128);
            viewOnClickListenerC22924.f72128 = -1;
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                AbstractC17043 abstractC17043M29393 = c20856.m47135().m29392("selection");
                try {
                    viewOnClickListenerC22924.f72136.m35384(abstractC17043M29393.m38664());
                } catch (IOException unused2) {
                } finally {
                    abstractC17043M29393.mo29990();
                }
            } else {
                viewOnClickListenerC22924.f72136.m35384(bArr);
            }
        }
        viewOnClickListenerC22924.f72137 = true;
        ActivityC3069 activity = viewOnClickListenerC22924.getActivity();
        if (activity instanceof ActivityC18686) {
            ((ActivityC18686) activity).m42605();
        }
        if (viewOnClickListenerC22924.getView() != null) {
            viewOnClickListenerC22924.f72130.m13346(viewOnClickListenerC22924.getViewLifecycleOwner(), new C19571(viewOnClickListenerC22924));
            if (viewOnClickListenerC22924.f72136.m35386()) {
                viewOnClickListenerC22924.m51236();
            }
        }
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C14849 c14849 = (C14849) view.findViewById(R.id.MT_Protector);
        this.f72124 = c14849;
        c14849.setTag("RecyclerView0");
        this.f72133 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f72132 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f72127 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f72129 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f72124.setAdapter(this.f72136);
        int i = this.f72128;
        if (i != -1) {
            this.f72124.scrollToPosition(i);
            this.f72128 = -1;
        }
        if (this.f72137) {
            ActivityC3069 activity = getActivity();
            if (activity instanceof ActivityC18686) {
                ((ActivityC18686) activity).m42605();
            }
            this.f72130.m13346(getViewLifecycleOwner(), new C19571(this));
            if (this.f72136.m35386()) {
                m51236();
            }
        }
        C5946 c5946 = this.f72130;
        InterfaceC24784 viewLifecycleOwner = getViewLifecycleOwner();
        C15556 c15556 = this.f72136;
        C12826.requireNonNull(c15556);
        c5946.m13334(viewLifecycleOwner, new RunnableC22041(6, c15556));
        this.f72130.m13329(getViewLifecycleOwner(), new C8072(5, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51218(ViewOnClickListenerC22924 viewOnClickListenerC22924, Integer num) {
        if (num.intValue() != R.id.MT_Protector) {
            if (num.intValue() == R.id.MT_Protector) {
                if (viewOnClickListenerC22924.f72136.m35386()) {
                    viewOnClickListenerC22924.f72136.mo35370();
                }
                C8331 c8331 = viewOnClickListenerC22924.f72138;
                c8331.getClass();
                C8331.m19221(c8331, R.string.MT_Protector, null, new String[]{"zip"}, 8);
                return;
            }
            return;
        }
        if (viewOnClickListenerC22924.f72136.m35386()) {
            if (viewOnClickListenerC22924.f72126) {
                return;
            } else {
                viewOnClickListenerC22924.f72136.mo35370();
            }
        }
        viewOnClickListenerC22924.f72126 = true;
        viewOnClickListenerC22924.f72136.m35390(false);
        viewOnClickListenerC22924.f72136.m35367();
        viewOnClickListenerC22924.m51232();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("batchExportMode", this.f72126);
        byte[] bArrM35399 = this.f72136.m35399();
        if (bArrM35399 != null) {
            if (bArrM35399.length > 20480) {
                try {
                    AbstractC17043 abstractC17043M29392 = this.f72135.m47135().m29392("selection");
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
        this.f72124.setAdapter(null);
        this.f72124 = null;
        this.f72133 = null;
        this.f72132 = null;
        this.f72127 = null;
        this.f72129 = null;
    }

    @Override // p067l.InterfaceC2787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4372() {
        if (!this.f72136.m35386()) {
            return false;
        }
        this.f72136.mo35370();
        return true;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onPause() {
        super.onPause();
        C20856 c20856 = this.f72135;
        if (c20856 != null && c20856.m38427().m29398()) {
            C11996 c11996M45308 = C19965.m45308(305419897);
            HashSet hashSetM35392 = this.f72136.m35392();
            c11996M45308.writeInt(((C8541) this.f72124.getLayoutManager()).findFirstVisibleItemPosition());
            c11996M45308.writeInt(hashSetM35392.size());
            Iterator it = hashSetM35392.iterator();
            while (it.hasNext()) {
                c11996M45308.m27443((CharSequence) it.next());
            }
            try {
                this.f72135.m47150().m29392("explorer").m38654(c11996M45308);
            } catch (IOException e) {
                C5946 c5946 = this.f72130;
                if (c5946 != null) {
                    c5946.m13320((Throwable) e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51238() {
        if (this.f72135 != null) {
            HashSet hashSetM35392 = this.f72136.m35392();
            this.f72136.m35379(this.f72135.m47130());
            this.f72136.m35374(hashSetM35392);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51239(String str) {
        C15556 c15556 = this.f72136;
        c15556.getClass();
        c15556.m35373((Collection) Collections.singletonList(str));
    }

    @Override // p067l.InterfaceC16897
    /* JADX INFO: renamed from: ۧ */
    public final void mo18532(C18498 c18498) {
        ((ActivityC18686) requireActivity()).m42599(c18498.m42048(), (C20699) null);
        this.f72135.m47114(c18498.m42048());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    @Override // p067l.InterfaceC10193
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18531(C18498 c18498) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C1898 c1898 = new C1898(requireContext(), c18498.m42045(), 0);
        if (!c18498.m42050()) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (c18498.m42050()) {
            if (c18498.m42042() == 1 && c18498.m42048().endsWith("/package-info")) {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            } else if (c18498.m42042() != 2) {
                z = false;
                z2 = true;
                z3 = false;
                z4 = false;
                z5 = false;
            } else if (c18498.m42048().endsWith("/type-info")) {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            } else {
                z = false;
                z2 = true;
                z3 = false;
                z4 = true;
                z5 = true;
            }
            z6 = false;
        } else {
            z = c18498.m42042() == 1;
            z2 = c18498.m42047() != 0 || this.f72136.m35402().m30048().size() > 1;
            z3 = true;
            z4 = false;
            z5 = false;
            z6 = true;
        }
        if (z3) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z4) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z2) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z5) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z6) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c1898.m50636(new C6293(this, c18498));
        if (c1898.m50638().size() > 0) {
            this.f72124.suppressLayout(true);
            c1898.m50635(new InterfaceC1233() { // from class: l.ܿܰ᩷
                @Override // p067l.InterfaceC1233
                /* JADX INFO: renamed from: ֫ */
                public final void mo8467(C1898 c1899) {
                    ViewOnClickListenerC22924.m51228(this.f56423);
                }
            });
            c1898.m50639();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51224(ViewOnClickListenerC22924 viewOnClickListenerC22924, C18498 c18498, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            new ViewOnClickListenerC9771(viewOnClickListenerC22924, c18498.m42048()).m22797();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strM42048 = c18498.m42048();
            String strM26414 = C11419.m26414(strM42048);
            String strM26416 = C11419.m26416(strM42048);
            C12826.requireNonNull(strM26416);
            String strM26415 = C11419.m26414(strM26416);
            C10183 c10183 = new C10183(viewOnClickListenerC22924, (AbstractActivityC5549) viewOnClickListenerC22924.requireActivity(), strM26414, strM26415, strM42048, strM26416);
            c10183.m33344(R.string.MT_Protector);
            c10183.m33336((CharSequence) strM26414);
            c10183.m33330();
            c10183.m33365(6);
            c10183.m33332(strM26415.length(), strM26414.length());
            c10183.m33352(true);
            c10183.m33335(new C16887(strM26415, c10183));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strM42049 = c18498.m42048();
            String strM26417 = C11419.m26414(strM42049);
            String strM26418 = C11419.m26416(strM42049);
            C12826.requireNonNull(strM26418);
            String strM26419 = C11419.m26414(strM26418);
            C3477 c3477 = new C3477(viewOnClickListenerC22924, (AbstractActivityC5549) viewOnClickListenerC22924.requireActivity(), strM26417, strM26419, strM42049, strM26418);
            c3477.m33344(R.string.MT_Protector);
            c3477.m33336((CharSequence) strM26417);
            c3477.m33330();
            c3477.m33328();
            c3477.m33365(6);
            c3477.m33352(true);
            c3477.m33335(new C16887(strM26419, c3477));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int iM42042 = c18498.m42042();
            if (iM42042 != 0) {
                if (iM42042 != 1) {
                    return;
                }
                viewOnClickListenerC22924.m51215(R.string.MT_Protector, c18498.m42048(), "<?xml version='1.0' encoding='utf-8' ?>\n<resources>\n    \n</resources>\n");
                return;
            } else {
                C6160 c6160 = new C6160(viewOnClickListenerC22924, (AbstractActivityC5549) viewOnClickListenerC22924.requireActivity(), c18498.m42048());
                c6160.m33344(R.string.MT_Protector);
                c6160.m33351("attr, string, style...");
                c6160.m33330();
                c6160.m33365(6);
                c6160.m33352(true);
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            Bundle bundle = new Bundle();
            bundle.putString(MotionUtils.EASING_TYPE_PATH, c18498.m42048());
            viewOnClickListenerC22924.f72131.m38698(1, R.string.MT_Protector, null, null, new String[]{DocumentReader.RESERVED}, bundle);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            Context contextRequireContext = viewOnClickListenerC22924.requireContext();
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(contextRequireContext);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46718(viewOnClickListenerC22924.getString(R.string.MT_Protector, c18498.m42044()));
            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5966(1, viewOnClickListenerC22924, c18498));
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC22924.f72126 = false;
            viewOnClickListenerC22924.f72136.m35390(true);
            c18498.m42049();
            viewOnClickListenerC22924.m51232();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC22924.f72126 = true;
            viewOnClickListenerC22924.f72136.m35390(false);
            c18498.m42049();
            viewOnClickListenerC22924.m51232();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51223(ViewOnClickListenerC22924 viewOnClickListenerC22924, C18498 c18498) {
        c18498.m42043();
        if (c18498.m42050()) {
            C20856 c20856 = viewOnClickListenerC22924.f72135;
            String strM42048 = c18498.m42048();
            c20856.getClass();
            c20856.m47116(Collections.singleton(strM42048));
        } else {
            viewOnClickListenerC22924.f72135.m47151(c18498.m42048());
        }
        ((ActivityC18686) viewOnClickListenerC22924.requireActivity()).m42615();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m51228(ViewOnClickListenerC22924 viewOnClickListenerC22924) {
        C14849 c14849 = viewOnClickListenerC22924.f72124;
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
            c20671.m46718(getString(R.string.MT_Protector, Integer.valueOf(this.f72136.m35387())));
            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11487(3, this));
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732();
            return;
        }
        if (id == R.id.MT_Protector) {
            C8331 c8331 = this.f72125;
            c8331.getClass();
            C8331.m19220(c8331, R.string.MT_Protector, (String) null, "arsc.zip", new String[]{"zip"}, 16);
        } else if (id == R.id.MT_Protector) {
            this.f72136.mo35370();
        } else if (id == R.id.MT_Protector) {
            this.f72136.m35382(new C22934());
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m51236() {
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2 = this.f72129;
        FloatingActionButton floatingActionButton3 = this.f72127;
        if (this.f72126) {
            floatingActionButton = this.f72132;
            this.f72133.setVisibility(4);
        } else {
            floatingActionButton = this.f72133;
            this.f72132.setVisibility(4);
        }
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
        floatingActionButton.setTranslationY(0.0f);
        floatingActionButton.setAlpha(0.8f);
        floatingActionButton2.setTranslationY(0.0f);
        floatingActionButton2.setAlpha(0.8f);
        floatingActionButton3.setTranslationY(0.0f);
        floatingActionButton3.setAlpha(0.8f);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m51232() {
        FloatingActionButton floatingActionButton;
        AnimatorSet animatorSet = this.f72134;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        FloatingActionButton floatingActionButton2 = this.f72129;
        FloatingActionButton floatingActionButton3 = this.f72127;
        if (this.f72126) {
            floatingActionButton = this.f72132;
            this.f72133.setVisibility(4);
        } else {
            floatingActionButton = this.f72133;
            this.f72132.setVisibility(4);
        }
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
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
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
        float height3 = floatingActionButton3.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
        floatingActionButton3.setTranslationY(height3);
        floatingActionButton3.setAlpha(0.8f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", height3, 0.0f);
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        duration.start();
        this.f72134 = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m51227(boolean z) {
        FloatingActionButton floatingActionButton;
        AnimatorSet animatorSet = this.f72134;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        FloatingActionButton floatingActionButton2 = this.f72129;
        FloatingActionButton floatingActionButton3 = this.f72127;
        if (this.f72126) {
            floatingActionButton = this.f72132;
            this.f72133.setVisibility(4);
        } else {
            floatingActionButton = this.f72133;
            this.f72132.setVisibility(4);
        }
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton3, "alpha", 0.8f, 0.0f));
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", 0.0f, floatingActionButton3.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        }
        duration.addListener(new C4819(floatingActionButton, floatingActionButton2, floatingActionButton3));
        duration.start();
        this.f72134 = duration;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51217(ViewOnClickListenerC22924 viewOnClickListenerC22924) {
        if (viewOnClickListenerC22924.f72135 == null) {
            return;
        }
        if (!C24414.m53850()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        viewOnClickListenerC22924.f72135.m47116(viewOnClickListenerC22924.f72136.m35388());
        viewOnClickListenerC22924.f72136.m35400();
        viewOnClickListenerC22924.m51227(true);
        ((ActivityC18686) viewOnClickListenerC22924.requireActivity()).m42615();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m51233(ViewOnClickListenerC22924 viewOnClickListenerC22924, String str) {
        if (viewOnClickListenerC22924.f72135 == null) {
            return;
        }
        new C20913(viewOnClickListenerC22924, str, viewOnClickListenerC22924.f72136.m35388()).m22250();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m51216(Runnable runnable) {
        if (this.f72137) {
            runnable.run();
        } else {
            C7050.m16213(new RunnableC22254(0, this, runnable), 100L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51219(ViewOnClickListenerC22924 viewOnClickListenerC22924, Runnable runnable) {
        if (viewOnClickListenerC22924.isResumed()) {
            viewOnClickListenerC22924.m51216(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m51215(int i, String str, String str2) {
        String strM26414 = C11419.m26414(str);
        C7501 c7501 = new C7501(this, (AbstractActivityC5549) requireActivity(), strM26414, str, str2);
        c7501.m33344(i);
        c7501.m33336((CharSequence) (strM26414 + "-"));
        c7501.m33330();
        c7501.m33328();
        c7501.m33365(6);
        c7501.m33352(true);
        c7501.m33335(new C16887(strM26414, c7501));
    }
}
