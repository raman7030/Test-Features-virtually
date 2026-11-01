package p067l;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.GetChars;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۠֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public class C9842 extends AbstractC16003 implements InterfaceC2787, InterfaceC13322 {

    /* JADX INFO: renamed from: ֡֫ */
    public long f27279;

    /* JADX INFO: renamed from: ֫֫ */
    public String f27280;

    /* JADX INFO: renamed from: ۖ֫ */
    public String f27281;

    /* JADX INFO: renamed from: ۗ */
    public InterfaceMenuItemC1528 f27282;

    /* JADX INFO: renamed from: ۘ֫ */
    public InterfaceMenuItemC1528 f27283;

    /* JADX INFO: renamed from: ۙ */
    public C20856 f27284;

    /* JADX INFO: renamed from: ۛ */
    public C17143 f27285;

    /* JADX INFO: renamed from: ۜ֫ */
    public TextView f27286;

    /* JADX INFO: renamed from: ۟ */
    public TextView f27287;

    /* JADX INFO: renamed from: ۡ֫ */
    public C13992 f27288;

    /* JADX INFO: renamed from: ۢ֫ */
    public C6456 f27289;

    /* JADX INFO: renamed from: ۤ */
    public C14146 f27290;

    /* JADX INFO: renamed from: ۧ֫ */
    public volatile boolean f27291;

    /* JADX INFO: renamed from: ۨ */
    public boolean f27292;

    /* JADX INFO: renamed from: ۫ */
    public InterfaceMenuItemC1528 f27293;

    /* JADX INFO: renamed from: ۬ */
    public boolean f27294;

    /* JADX INFO: renamed from: ܰ */
    public InterfaceMenuItemC1528 f27295;

    /* JADX INFO: renamed from: ܳ֫ */
    public InterfaceMenuItemC1528 f27296;

    /* JADX INFO: renamed from: ܺ֫ */
    public String f27297;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f27298;

    /* JADX INFO: renamed from: ܿ֫ */
    public C20699 f27299;

    /* JADX INFO: renamed from: ᩳ֫ */
    public View f27300;

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean f27301;

    /* JADX INFO: renamed from: ᩵֫ */
    public C5946 f27302;

    /* JADX INFO: renamed from: ᩷֫ */
    public InterfaceMenuItemC1528 f27303;

    /* JADX INFO: renamed from: ᩺ */
    public C20223 f27304;

    /* JADX INFO: renamed from: ᩻֫ */
    public InterfaceMenuItemC1528 f27305;

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo16322() {
        return true;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ܳ */
    public final int mo16324() {
        return R.drawable.MT_Protector;
    }

    public C9842() {
        super(R.layout.MT_Protector);
        this.f27279 = 0L;
        setHasOptionsMenu(true);
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ܺ */
    public final String mo16325() {
        if (this.f27297 == null) {
            this.f27297 = C8597.m20011(80, C15993.m36343(m23088()));
        }
        return this.f27297;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ᩷ */
    public final String mo16326() {
        if (!this.f46351.getBoolean("changed", false)) {
            return mo16325();
        }
        return "*" + mo16325();
    }

    /* JADX INFO: renamed from: ֨ */
    public final String m23084() {
        if (this.f27280 == null) {
            String[] strArrSplit = m23088().split("/");
            if (strArrSplit.length == 3) {
                if (strArrSplit[2].equals("type-info")) {
                    this.f27280 = C8597.m20011(80, m23088()) + ".xml";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C8597.m20011(80, strArrSplit[0] + "/" + strArrSplit[2]));
                    sb.append(".xml");
                    this.f27280 = sb.toString();
                }
            } else {
                this.f27280 = C8597.m20011(80, m23088()) + ".xml";
            }
        }
        return this.f27280;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۜ */
    public final String mo16323() {
        return C8597.m20011(150, m23088());
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo19366() {
        return this.f46351.getBoolean("changed", false);
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֫ */
    public final void mo19363(C5946 c5946) {
        c5946.m13341(m23088());
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m23088() {
        String string = requireArguments().getString(MotionUtils.EASING_TYPE_PATH);
        C12826.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23090(String str) {
        m36367((String) null);
        requireArguments().putString(MotionUtils.EASING_TYPE_PATH, str);
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27302 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f27288 = (C13992) new C6874(requireActivity()).m15765(C13992.class);
        String[] strArrSplit = m23088().split("/");
        if (strArrSplit.length != 3 || strArrSplit[2].equals("type-info")) {
            this.f27281 = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(strArrSplit[0]);
            sb.append("/");
            this.f27281 = C10965.m25286(sb, strArrSplit[1], "/type-info");
        }
        this.f27304 = C20894.m47200(this, new C8618(this));
        if (bundle != null) {
            this.f27279 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f27294 = false;
        this.f27300 = view.findViewById(R.id.MT_Protector);
        this.f27290 = (C14146) view.findViewById(R.id.MT_Protector);
        this.f27287 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f27286 = (TextView) view.findViewById(R.id.MT_Protector);
        C17143 c17143 = new C17143((ActivityC18686) requireActivity(), this.f27290, view);
        this.f27285 = c17143;
        c17143.m38839("edit_word_wrap_xml", false);
        this.f27289 = new C6456(view, this.f27290);
        this.f27285.m38844(getViewLifecycleOwner(), this.f27289, ActivityC12551.class);
        this.f27290.m32398(new C19230(this));
        this.f27290.m32394(new InterfaceC10005() { // from class: l.ۨ۟᩷
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i, int i2) {
                this.f37506.m23080();
            }
        });
        this.f27290.m32392(new C18559(this));
        this.f27290.m32384((InterfaceC2746) new C2465(this));
        this.f27290.m32402(new C24594(this));
        if (this.f27281 != null) {
            this.f27290.m32397(new C15371(this));
        }
        this.f27287.setText(mo16326());
        if (this.f46351.getBoolean("changed", false)) {
            this.f27287.setTextColor(C23223.f72972);
        }
        this.f27287.setOnClickListener(new ViewOnClickListenerC14061(2, this));
        this.f27287.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۟۟᩷
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C9842 c9842 = this.f25441;
                C20671 c20671BuildDialog = ((ActivityC18686) c9842.requireActivity()).buildDialog();
                c20671BuildDialog.m46718(c9842.m23088().concat(".xml"));
                c20671BuildDialog.m46732();
                return true;
            }
        });
        this.f27286.setText("...");
        this.f27301 = true;
        this.f27289.m14752();
        this.f27302.m13347().m4066(getViewLifecycleOwner(), new C3807(0, this));
    }

    /* JADX INFO: renamed from: ᩸ */
    private void m23078() {
        new C11184(this, (ActivityC18686) requireActivity(), m36365(), C17853.f53284.m38684("xmlTrans")).m22250();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM42612 = ((ActivityC18686) requireActivity()).m42612(R.layout.MT_Protector);
        if (viewM42612 == null) {
            viewM42612 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C12826.requireNonNull(viewM42612);
        }
        C7050.m16213(new RunnableC20875(4, this), 600L);
        return viewM42612;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m23031(C9842 c9842) {
        int iM32508 = c9842.f27290.m32508();
        int iM32512 = c9842.f27290.m32512();
        if (iM32508 > iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        C9729 c9729Mo28589 = c9842.f27290.m32500().mo28589();
        try {
            int iM23029 = m23029(iM32508 - 1, (CharSequence) c9729Mo28589, true);
            int iM230210 = m23029(iM32512, (CharSequence) c9729Mo28589, false);
            if (iM23029 != -1 && iM230210 != -1 && m23041(iM23029 - 1, c9729Mo28589)) {
                int iM47137 = c9842.f27284.m47137(c9842.f27281, c9729Mo28589.subSequence(iM23029 + 1, iM230210));
                String str = iM47137 == -1 ? null : String.format("%08x", Integer.valueOf(iM47137));
                if (str != null) {
                    String strConcat = "@".concat(str);
                    c9729Mo28589.close();
                    return strConcat;
                }
            }
            c9729Mo28589.close();
            return c9842.f27290.m32442();
        } catch (Throwable th) {
            try {
                c9729Mo28589.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m23035(C9842 c9842, MenuItem menuItem) {
        if (menuItem.getGroupId() == R.string.MT_Protector) {
            if (menuItem.getItemId() == 0) {
                C7050.m16211((CharSequence) (C11419.m26414(c9842.m23088()) + ".xml"));
                return;
            }
            C7050.m16211((CharSequence) c9842.m23088().concat(".xml"));
            return;
        }
        c9842.f27302.m13341(c9842.m23088());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23038(C9842 c9842, C20856 c20856) {
        c9842.f27284 = c20856;
        if (!c9842.f27301) {
            c9842.f27291 = true;
        } else {
            new C21913(c9842, c9842.m23088()).m22250();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹ */
    public void m23080() {
        StringBuilder sb = new StringBuilder();
        C14146 c14146 = this.f27290;
        TextView textView = this.f27286;
        if (c14146 != null) {
            int iM32508 = c14146.m32508();
            int iM32512 = c14146.m32512();
            Point pointM32536 = c14146.m32536(iM32508);
            sb.append(pointM32536.x);
            sb.append(':');
            sb.append(pointM32536.y);
            if (iM32508 != iM32512) {
                sb.append(" (");
                sb.append(Math.abs(iM32512 - iM32508));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            textView.setText(sb.toString());
        }
    }

    @Override // p067l.InterfaceC13322
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23087(C20856 c20856) {
        return !c20856.m47134(m23088());
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۡ */
    public final C14146 mo19367() {
        if (this.f27298) {
            throw new IllegalStateException("Text storage is still loading");
        }
        if (this.f27301) {
            return this.f27290;
        }
        return null;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f27301 = false;
        C14146 c14146 = this.f27290;
        if (c14146 != null) {
            c14146.m32450();
        }
        C17143 c17143 = this.f27285;
        if (c17143 != null) {
            c17143.m38856();
        }
        this.f27300 = null;
        this.f27289 = null;
        this.f27290 = null;
        this.f27285 = null;
        this.f27287 = null;
        this.f27286 = null;
        this.f27295 = null;
        this.f27282 = null;
        this.f27296 = null;
        this.f27293 = null;
        this.f27303 = null;
        this.f27283 = null;
        this.f27305 = null;
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle((CharSequence) null);
        ((ActivityC18686) requireActivity()).m42585((CharSequence) null);
        ((ActivityC18686) requireActivity()).m12272(this.f27290);
        C17143 c17143 = this.f27285;
        if (c17143 != null && c17143.m38845() && this.f27301) {
            this.f27289.m14752();
        }
        m23064();
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onPause() {
        super.onPause();
        C14146 c14146 = this.f27290;
        if (c14146 != null) {
            c14146.m32507();
        }
        ((ActivityC18686) requireActivity()).m12270();
    }

    @Override // p067l.ComponentCallbacksC11117, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C14146 c14146 = this.f27290;
        if (c14146 != null) {
            c14146.m32507();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23086(C20699 c20699) {
        this.f27299 = c20699;
        if (c20699 != null && this.f27301 && this.f27294) {
            if (c20699.f63908) {
                this.f27290.m32580();
            }
            C1446.m31704(this.f27301);
            C20699 c206910 = this.f27299;
            if (c206910 == null) {
                return;
            }
            this.f27299 = null;
            c206910.m46768(this.f27290);
            this.f27290.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public static void m23079(C9842 c9842) {
        C1446.m31704(c9842.f27301);
        C20699 c20699 = c9842.f27299;
        if (c20699 == null) {
            return;
        }
        c9842.f27299 = null;
        c20699.m46768(c9842.f27290);
        c9842.f27290.requestFocus();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        InterfaceMenuC1983 interfaceMenuC1983 = (InterfaceMenuC1983) menu;
        interfaceMenuC1983.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC1983.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC1983.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC1983.findItem(R.id.MT_Protector).setVisible(false);
        this.f27305 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f27283 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f27303 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f27293 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f27296 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f27282 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f27295 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f27305.setEnabled(this.f27290.m32360());
        this.f27283.setEnabled(this.f27290.m32447());
        this.f27303.setEnabled(this.f27290.m32361());
        this.f27293.setEnabled(!this.f27290.m32505());
        this.f27296.setChecked(this.f27290.m32505());
        this.f27285.m38836(interfaceMenuC1983.findItem(R.id.MT_Protector));
    }

    @Override // p067l.ComponentCallbacksC11117
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f27292 || this.f27298) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f27290.m32501());
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C7991.m18505((GetChars) this.f27290.m32500()));
            this.f27282.setEnabled(this.f27290.m32438());
            this.f27295.setEnabled(this.f27290.m32578());
            return true;
        }
        boolean z = false;
        if (itemId == R.id.MT_Protector) {
            String strM36343 = C15993.m36343(m23088());
            if (strM36343.length() > 20) {
                strM36343 = strM36343.substring(0, 20);
            }
            this.f27304.m45709(strM36343 + ".xml");
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC18686 activityC18686 = (ActivityC18686) requireActivity();
            mo19364(activityC18686, true, (Runnable) new RunnableC12525(activityC18686, this, z));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C14146 c14146 = this.f27290;
            c14146.m32471(!c14146.m32505());
            menuItem.setChecked(this.f27290.m32505());
            this.f27285.m38854();
            if (this.f27301) {
                this.f27289.m14752();
            }
            this.f27293.setEnabled(!this.f27290.m32505());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo19368((ActivityC18686) requireActivity());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m23078();
            return true;
        }
        if (this.f27285.m38851(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ */
    public void m23064() {
        if (this.f27279 == 0 || !isVisible()) {
            return;
        }
        if (!this.f27301 || !this.f27294 || this.f27292) {
            C7050.m16213(new RunnableC17751(5, this), 100L);
            return;
        }
        AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("xmlTrans");
        if (!abstractC17043M38684.mo25094() || abstractC17043M38684.mo25091() == this.f27279) {
            this.f27279 = 0L;
            return;
        }
        try {
            C22739 c22739M16894 = AbstractC7316.m16894(abstractC17043M38684.m38647(), EnumC15361.OrderedField);
            if (m36365().equals(c22739M16894.m50890("<--id-c5skl23kjndf-->"))) {
                C7991.m18504(c22739M16894, this.f27290.m32500());
                this.f27290.m32409(false);
            }
        } catch (Exception unused) {
        } finally {
            this.f27279 = 0L;
        }
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC20028 interfaceC20028Mo19371 = mo19371();
        if (interfaceC20028Mo19371 != null) {
            C10513 c10513 = (C10513) interfaceC20028Mo19371;
            c10513.mo11541();
            c10513.mo11540();
        }
        bundle.putLong("xmlTransFileTime", this.f27279);
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC20028 mo19371() {
        C20856 c20856 = this.f27284;
        if (c20856 == null || this.f27298 || !this.f27301) {
            return null;
        }
        C12828 c12828M36366 = m36366(c20856.m38429());
        if (this.f27292) {
            c12828M36366.m29395();
            return null;
        }
        C14146 c14146 = this.f27290;
        C17143 c17143 = this.f27285;
        if (c14146 == null || c17143 == null) {
            throw new RuntimeException();
        }
        return new C10513(this, c14146, c17143, c12828M36366);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23043(C9842 c9842, C14677 c14677) {
        C23395.m52060((InterfaceC21384) c14677, 1382253410);
        if (c14677.readInt() != c9842.f27284.m47131(c9842.m23088())) {
            return false;
        }
        c9842.f27290.m32476(true);
        try {
            C23395.m52060((InterfaceC21384) c14677, 1382253410);
            c9842.f27290.mo27918(c14677);
            C23395.m52060((InterfaceC21384) c14677, 1382253410);
            c9842.f27285.m38850(c14677);
            C23395.m52060((InterfaceC21384) c14677, 1382253410);
            c9842.f27285.m38843(c14677);
            if (!c9842.f27290.m32500().mo4005()) {
                c9842.f27290.m32400(c9842.m36369(c9842.f27284.m38429()).m29402());
            }
            c9842.f27290.m32499();
            return true;
        } catch (Throwable th) {
            c9842.f27290.m32476(false);
            throw th;
        }
    }

    @Override // p067l.InterfaceC2787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4372() {
        C17143 c17143 = this.f27285;
        if (c17143 == null || !c17143.m38852()) {
            return false;
        }
        this.f27285.m38854();
        this.f27290.m32507();
        return true;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۧ */
    public final void mo19368(final ActivityC18686 activityC18686) {
        if (!this.f46351.getBoolean("changed", false)) {
            m36361(activityC18686);
            return;
        }
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC18686);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46710(R.string.MT_Protector);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ֫ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC18686 activityC18687 = activityC18686;
                C9842 c9842 = this.f53450;
                c9842.mo19364(activityC18687, false, (Runnable) new RunnableC12525(activityC18687, c9842, true));
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13339(4, this, activityC18686));
        c20671.m46732();
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֫ */
    public final void mo19364(ActivityC18686 activityC18686, boolean z, Runnable runnable) {
        C17217 c17217 = new C17217(runnable);
        if (!mo19366()) {
            c17217.onSuccess();
        } else {
            new C4478(activityC18686, new C3136(activityC18686, this, z), c17217).m22250();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m23040(ActivityC18686 activityC18686, C9842 c9842, boolean z) {
        if (z) {
            c9842.m36361(activityC18686);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7482 m23089(ActivityC18686 activityC18686) {
        C1446.m31704(this.f46351.getBoolean("changed", false));
        return new C3136(activityC18686, this, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m23085(C20856 c20856, C13992 c13992) {
        if (this.f27301 && !this.f27291 && !C12799.m29347()) {
            for (int i = 0; i < 50 && !this.f27291; i++) {
                SystemClock.sleep(100L);
            }
        }
        if (this.f27301 && this.f27291) {
            return this.f27290.m32500().toString();
        }
        c13992.m31796();
        C12828 c12828M36366 = m36366(c20856.m38429());
        if (!c12828M36366.m29398()) {
            return c20856.m47152(m23088());
        }
        C14677 c14677M33572 = C14677.m33572(c12828M36366.m29399());
        C23395.m52060((InterfaceC21384) c14677M33572, 1382253410);
        if (c14677M33572.readInt() == c20856.m47131(m23088())) {
            C23395.m52060((InterfaceC21384) c14677M33572, 1382253410);
            return C8782.m20318(c14677M33572, m36369(c20856.m38429()).m29402());
        }
        return c20856.m47152(m23088());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m23032(C9842 c9842, String str) {
        int iM47137 = c9842.f27284.m47137(c9842.f27281, str);
        if (iM47137 == -1) {
            return null;
        }
        return String.format("%08x", Integer.valueOf(iM47137));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m23030(C9729 c9729, int i, boolean z) {
        int iLastIndexOf = z ? TextUtils.lastIndexOf(c9729, '>', i) : TextUtils.indexOf((CharSequence) c9729, '<', i);
        if (iLastIndexOf != -1 && (!z ? TextUtils.indexOf((CharSequence) c9729, '\n', i, iLastIndexOf) != -1 : TextUtils.indexOf((CharSequence) c9729, '\n', iLastIndexOf, i) != -1)) {
            return iLastIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m23029(int i, CharSequence charSequence, boolean z) {
        int iLastIndexOf = z ? TextUtils.lastIndexOf(charSequence, '\"', i) : TextUtils.indexOf(charSequence, '\"', i);
        if (iLastIndexOf != -1 && (!z ? TextUtils.indexOf(charSequence, '\n', i, iLastIndexOf) != -1 : TextUtils.indexOf(charSequence, '\n', iLastIndexOf, i) != -1)) {
            return iLastIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23041(int i, CharSequence charSequence) {
        C7160 c7160 = new C7160(i, charSequence);
        String strM16466 = c7160.m16466();
        if (strM16466.equals("=")) {
            strM16466 = C10965.m25286(new StringBuilder(), c7160.m16466(), strM16466);
        }
        return strM16466.equals("name=") && !c7160.m16466().equals("<item");
    }

    /* JADX INFO: renamed from: ᩶ */
    public static void m23075(C9842 c9842) {
        if (c9842.f27301) {
            c9842.f27289.m14752();
        }
    }
}
