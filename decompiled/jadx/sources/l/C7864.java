package l;

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
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۠֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public class C7864 extends AbstractC14346 implements InterfaceC0440, InterfaceC11525 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public long f24363;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f24364;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f24365;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f24366;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f24367;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19452 f24368;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15545 f24369;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public TextView f24370;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f24371;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public C12230 f24372;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C4301 f24373;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C12392 f24374;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f24375;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24376;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f24377;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f24378;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f24379;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f24380;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public String f24381;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f24382;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C19287 f24383;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public View f24384;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f24385;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C3764 f24386;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f24387;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C18786 f24388;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f24389;

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo14418() {
        return true;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܳ */
    public final int mo14420() {
        return R.drawable.MT_Protector;
    }

    public C7864() {
        super(R.layout.MT_Protector);
        this.f24363 = 0L;
        setHasOptionsMenu(true);
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܺ */
    public final String mo14421() {
        if (this.f24381 == null) {
            this.f24381 = C6554.m18061(80, C14336.m34210(m21123()));
        }
        return this.f24381;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩷ */
    public final String mo14422() {
        if (!this.f43260.getBoolean("changed", false)) {
            return mo14421();
        }
        return "*" + mo14421();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m21119() {
        if (this.f24364 == null) {
            String[] strArrSplit = m21123().split("/");
            if (strArrSplit.length == 3) {
                if (strArrSplit[2].equals("type-info")) {
                    this.f24364 = C6554.m18061(80, m21123()) + ".xml";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C6554.m18061(80, strArrSplit[0] + "/" + strArrSplit[2]));
                    sb.append(".xml");
                    this.f24364 = sb.toString();
                }
            } else {
                this.f24364 = C6554.m18061(80, m21123()) + ".xml";
            }
        }
        return this.f24364;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۜ */
    public final String mo14419() {
        return C6554.m18061(150, m21123());
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo17426() {
        return this.f43260.getBoolean("changed", false);
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֫ */
    public final void mo17423(C3764 c3764) {
        c3764.m11405(m21123());
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m21123() {
        String string = requireArguments().getString(MotionUtils.EASING_TYPE_PATH);
        C11003.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21125(String str) {
        m34234((String) null);
        requireArguments().putString(MotionUtils.EASING_TYPE_PATH, str);
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24386 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f24372 = (C12230) new C4741(requireActivity()).m13885(C12230.class);
        String[] strArrSplit = m21123().split("/");
        if (strArrSplit.length != 3 || strArrSplit[2].equals("type-info")) {
            this.f24365 = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(strArrSplit[0]);
            sb.append("/");
            this.f24365 = C9045.m23341(sb, strArrSplit[1], "/type-info");
        }
        this.f24388 = C19492.m44903(this, new C6576(this));
        if (bundle != null) {
            this.f24363 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f24378 = false;
        this.f24384 = view.findViewById(R.id.MT_Protector);
        this.f24374 = (C12392) view.findViewById(R.id.MT_Protector);
        this.f24371 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f24370 = (TextView) view.findViewById(R.id.MT_Protector);
        C15545 c15545 = new C15545((ActivityC17169) requireActivity(), this.f24374, view);
        this.f24369 = c15545;
        c15545.m36678("edit_word_wrap_xml", false);
        this.f24373 = new C4301(view, this.f24374);
        this.f24369.m36683(getViewLifecycleOwner(), this.f24373, ActivityC10714.class);
        this.f24374.m30334(new C17742(this));
        this.f24374.m30330(new InterfaceC8035() { // from class: l.ۨ۟᩷
            @Override // l.InterfaceC8035
            /* JADX INFO: renamed from: ֫ */
            public final void mo1646(int i, int i2) {
                this.f34507.m21115();
            }
        });
        this.f24374.m30328(new C17036(this));
        this.f24374.m30320((InterfaceC0397) new C0102(this));
        this.f24374.m30338(new C23386(this));
        if (this.f24365 != null) {
            this.f24374.m30333(new C13681(this));
        }
        this.f24371.setText(mo14422());
        if (this.f43260.getBoolean("changed", false)) {
            this.f24371.setTextColor(C21943.f70260);
        }
        this.f24371.setOnClickListener(new ViewOnClickListenerC12303(2, this));
        this.f24371.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۟۟᩷
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C7864 c7864 = this.f22528;
                C19258 c19258BuildDialog = ((ActivityC17169) c7864.requireActivity()).buildDialog();
                c19258BuildDialog.m44424(c7864.m21123().concat(".xml"));
                c19258BuildDialog.m44438();
                return true;
            }
        });
        this.f24370.setText("...");
        this.f24385 = true;
        this.f24373.m12888();
        this.f24386.m11411().m1668(getViewLifecycleOwner(), new C1514(0, this));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m21113() {
        new C9276(this, (ActivityC17169) requireActivity(), m34232(), C16293.f50117.m36526("xmlTrans")).m20274();
    }

    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM40367 = ((ActivityC17169) requireActivity()).m40367(R.layout.MT_Protector);
        if (viewM40367 == null) {
            viewM40367 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C11003.requireNonNull(viewM40367);
        }
        C4925.m14316(new RunnableC19472(4, this), 600L);
        return viewM40367;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21066(C7864 c7864) {
        int iM30444 = c7864.f24374.m30444();
        int iM30448 = c7864.f24374.m30448();
        if (iM30444 > iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        C7744 c7744Mo26556 = c7864.f24374.m30436().mo26556();
        try {
            int iM21064 = m21064(iM30444 - 1, (CharSequence) c7744Mo26556, true);
            int iM21065 = m21064(iM30448, (CharSequence) c7744Mo26556, false);
            if (iM21064 != -1 && iM21065 != -1 && m21076(iM21064 - 1, c7744Mo26556)) {
                int iM44841 = c7864.f24368.m44841(c7864.f24365, c7744Mo26556.subSequence(iM21064 + 1, iM21065));
                String str = iM44841 == -1 ? null : String.format("%08x", Integer.valueOf(iM44841));
                if (str != null) {
                    String strConcat = "@".concat(str);
                    c7744Mo26556.close();
                    return strConcat;
                }
            }
            c7744Mo26556.close();
            return c7864.f24374.m30378();
        } catch (Throwable th) {
            try {
                c7744Mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21070(C7864 c7864, MenuItem menuItem) {
        if (menuItem.getGroupId() == R.string.MT_Protector) {
            if (menuItem.getItemId() == 0) {
                C4925.m14314((CharSequence) (C9523.m24404(c7864.m21123()) + ".xml"));
                return;
            }
            C4925.m14314((CharSequence) c7864.m21123().concat(".xml"));
            return;
        }
        c7864.f24386.m11405(c7864.m21123());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21073(C7864 c7864, C19452 c19452) {
        c7864.f24368 = c19452;
        if (!c7864.f24385) {
            c7864.f24375 = true;
        } else {
            new C20565(c7864, c7864.m21123()).m20274();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m21115() {
        StringBuilder sb = new StringBuilder();
        C12392 c12392 = this.f24374;
        TextView textView = this.f24370;
        if (c12392 != null) {
            int iM30444 = c12392.m30444();
            int iM30448 = c12392.m30448();
            Point pointM30472 = c12392.m30472(iM30444);
            sb.append(pointM30472.x);
            sb.append(':');
            sb.append(pointM30472.y);
            if (iM30444 != iM30448) {
                sb.append(" (");
                sb.append(Math.abs(iM30448 - iM30444));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            textView.setText(sb.toString());
        }
    }

    @Override // l.InterfaceC11525
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo21122(C19452 c19452) {
        return !c19452.m44838(m21123());
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۡ */
    public final C12392 mo17427() {
        if (this.f24382) {
            throw new IllegalStateException("Text storage is still loading");
        }
        if (this.f24385) {
            return this.f24374;
        }
        return null;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f24385 = false;
        C12392 c12392 = this.f24374;
        if (c12392 != null) {
            c12392.m30386();
        }
        C15545 c15545 = this.f24369;
        if (c15545 != null) {
            c15545.m36695();
        }
        this.f24384 = null;
        this.f24373 = null;
        this.f24374 = null;
        this.f24369 = null;
        this.f24371 = null;
        this.f24370 = null;
        this.f24379 = null;
        this.f24366 = null;
        this.f24380 = null;
        this.f24377 = null;
        this.f24387 = null;
        this.f24367 = null;
        this.f24389 = null;
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle((CharSequence) null);
        ((ActivityC17169) requireActivity()).m40340((CharSequence) null);
        ((ActivityC17169) requireActivity()).m10236(this.f24374);
        C15545 c15545 = this.f24369;
        if (c15545 != null && c15545.m36684() && this.f24385) {
            this.f24373.m12888();
        }
        m21099();
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onPause() {
        super.onPause();
        C12392 c12392 = this.f24374;
        if (c12392 != null) {
            c12392.m30443();
        }
        ((ActivityC17169) requireActivity()).m10234();
    }

    @Override // l.ComponentCallbacksC9205, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C12392 c12392 = this.f24374;
        if (c12392 != null) {
            c12392.m30443();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21121(C19287 c19287) {
        this.f24383 = c19287;
        if (c19287 != null && this.f24385 && this.f24378) {
            if (c19287.f60678) {
                this.f24374.m30516();
            }
            C12171.m29642(this.f24385);
            C19287 c19288 = this.f24383;
            if (c19288 == null) {
                return;
            }
            this.f24383 = null;
            c19288.m44474(this.f24374);
            this.f24374.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m21114(C7864 c7864) {
        C12171.m29642(c7864.f24385);
        C19287 c19287 = c7864.f24383;
        if (c19287 == null) {
            return;
        }
        c7864.f24383 = null;
        c19287.m44474(c7864.f24374);
        c7864.f24374.requestFocus();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        InterfaceMenuC23000 interfaceMenuC23000 = (InterfaceMenuC23000) menu;
        interfaceMenuC23000.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC23000.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC23000.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC23000.findItem(R.id.MT_Protector).setVisible(false);
        this.f24389 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f24367 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f24387 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f24377 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f24380 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f24366 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f24379 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f24389.setEnabled(this.f24374.m30296());
        this.f24367.setEnabled(this.f24374.m30383());
        this.f24387.setEnabled(this.f24374.m30297());
        this.f24377.setEnabled(!this.f24374.m30441());
        this.f24380.setChecked(this.f24374.m30441());
        this.f24369.m36675(interfaceMenuC23000.findItem(R.id.MT_Protector));
    }

    @Override // l.ComponentCallbacksC9205
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f24376 || this.f24382) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f24374.m30437());
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C5916.m16579((GetChars) this.f24374.m30436()));
            this.f24366.setEnabled(this.f24374.m30374());
            this.f24379.setEnabled(this.f24374.m30514());
            return true;
        }
        boolean z = false;
        if (itemId == R.id.MT_Protector) {
            String strM34210 = C14336.m34210(m21123());
            if (strM34210.length() > 20) {
                strM34210 = strM34210.substring(0, 20);
            }
            this.f24388.m43440(strM34210 + ".xml");
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC17169 activityC17169 = (ActivityC17169) requireActivity();
            mo17424(activityC17169, true, (Runnable) new RunnableC10687(activityC17169, this, z));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C12392 c12392 = this.f24374;
            c12392.m30407(!c12392.m30441());
            menuItem.setChecked(this.f24374.m30441());
            this.f24369.m36693();
            if (this.f24385) {
                this.f24373.m12888();
            }
            this.f24377.setEnabled(!this.f24374.m30441());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo17428((ActivityC17169) requireActivity());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m21113();
            return true;
        }
        if (this.f24369.m36690(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m21099() {
        if (this.f24363 == 0 || !isVisible()) {
            return;
        }
        if (!this.f24385 || !this.f24378 || this.f24376) {
            C4925.m14316(new RunnableC16185(5, this), 100L);
            return;
        }
        AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526("xmlTrans");
        if (!abstractC15440M36526.mo23120() || abstractC15440M36526.mo23117() == this.f24363) {
            this.f24363 = 0L;
            return;
        }
        try {
            C21434 c21434M14984 = AbstractC5206.m14984(abstractC15440M36526.m36489(), EnumC13671.OrderedField);
            if (m34232().equals(c21434M14984.m48553("<--id-c5skl23kjndf-->"))) {
                C5916.m16578(c21434M14984, this.f24374.m30436());
                this.f24374.m30345(false);
            }
        } catch (Exception unused) {
        } finally {
            this.f24363 = 0L;
        }
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC18581 interfaceC18581Mo17431 = mo17431();
        if (interfaceC18581Mo17431 != null) {
            C8570 c8570 = (C8570) interfaceC18581Mo17431;
            c8570.mo9498();
            c8570.mo9497();
        }
        bundle.putLong("xmlTransFileTime", this.f24363);
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC18581 mo17431() {
        C19452 c19452 = this.f24368;
        if (c19452 == null || this.f24382 || !this.f24385) {
            return null;
        }
        C11005 c11005M34233 = m34233(c19452.m36268());
        if (this.f24376) {
            c11005M34233.m27333();
            return null;
        }
        C12392 c12392 = this.f24374;
        C15545 c15545 = this.f24369;
        if (c12392 == null || c15545 == null) {
            throw new RuntimeException();
        }
        return new C8570(this, c12392, c15545, c11005M34233);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21078(C7864 c7864, C12951 c12951) {
        C22124.m49722((InterfaceC20008) c12951, 1382253410);
        if (c12951.readInt() != c7864.f24368.m44835(c7864.m21123())) {
            return false;
        }
        c7864.f24374.m30412(true);
        try {
            C22124.m49722((InterfaceC20008) c12951, 1382253410);
            c7864.f24374.mo25896(c12951);
            C22124.m49722((InterfaceC20008) c12951, 1382253410);
            c7864.f24369.m36689(c12951);
            C22124.m49722((InterfaceC20008) c12951, 1382253410);
            c7864.f24369.m36682(c12951);
            if (!c7864.f24374.m30436().mo1607()) {
                c7864.f24374.m30336(c7864.m34236(c7864.f24368.m36268()).m27340());
            }
            c7864.f24374.m30435();
            return true;
        } catch (Throwable th) {
            c7864.f24374.m30412(false);
            throw th;
        }
    }

    @Override // l.InterfaceC0440
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1996() {
        C15545 c15545 = this.f24369;
        if (c15545 == null || !c15545.m36691()) {
            return false;
        }
        this.f24369.m36693();
        this.f24374.m30443();
        return true;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۧ */
    public final void mo17428(final ActivityC17169 activityC17169) {
        if (!this.f43260.getBoolean("changed", false)) {
            m34228(activityC17169);
            return;
        }
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC17169);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44416(R.string.MT_Protector);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ֫ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17169 activityC171610 = activityC17169;
                C7864 c7864 = this.f50278;
                c7864.mo17424(activityC171610, false, (Runnable) new RunnableC10687(activityC171610, c7864, true));
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11543(4, this, activityC17169));
        c19258.m44438();
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֫ */
    public final void mo17424(ActivityC17169 activityC17169, boolean z, Runnable runnable) {
        C15624 c15624 = new C15624(runnable);
        if (!mo17426()) {
            c15624.onSuccess();
        } else {
            new C2220(activityC17169, new C0808(activityC17169, this, z), c15624).m20274();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21075(ActivityC17169 activityC17169, C7864 c7864, boolean z) {
        if (z) {
            c7864.m34228(activityC17169);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5380 m21124(ActivityC17169 activityC17169) {
        C12171.m29642(this.f43260.getBoolean("changed", false));
        return new C0808(activityC17169, this, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m21120(C19452 c19452, C12230 c12230) {
        if (this.f24385 && !this.f24375 && !C10975.m27285()) {
            for (int i = 0; i < 50 && !this.f24375; i++) {
                SystemClock.sleep(100L);
            }
        }
        if (this.f24385 && this.f24375) {
            return this.f24374.m30436().toString();
        }
        c12230.m29734();
        C11005 c11005M34233 = m34233(c19452.m36268());
        if (!c11005M34233.m27336()) {
            return c19452.m44856(m21123());
        }
        C12951 c12951M31485 = C12951.m31485(c11005M34233.m27337());
        C22124.m49722((InterfaceC20008) c12951M31485, 1382253410);
        if (c12951M31485.readInt() == c19452.m44835(m21123())) {
            C22124.m49722((InterfaceC20008) c12951M31485, 1382253410);
            return C6748.m18370(c12951M31485, m34236(c19452.m36268()).m27340());
        }
        return c19452.m44856(m21123());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21067(C7864 c7864, String str) {
        int iM44841 = c7864.f24368.m44841(c7864.f24365, str);
        if (iM44841 == -1) {
            return null;
        }
        return String.format("%08x", Integer.valueOf(iM44841));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21065(C7744 c7744, int i, boolean z) {
        int iLastIndexOf = z ? TextUtils.lastIndexOf(c7744, '>', i) : TextUtils.indexOf((CharSequence) c7744, '<', i);
        if (iLastIndexOf != -1 && (!z ? TextUtils.indexOf((CharSequence) c7744, '\n', i, iLastIndexOf) != -1 : TextUtils.indexOf((CharSequence) c7744, '\n', iLastIndexOf, i) != -1)) {
            return iLastIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21064(int i, CharSequence charSequence, boolean z) {
        int iLastIndexOf = z ? TextUtils.lastIndexOf(charSequence, '\"', i) : TextUtils.indexOf(charSequence, '\"', i);
        if (iLastIndexOf != -1 && (!z ? TextUtils.indexOf(charSequence, '\n', i, iLastIndexOf) != -1 : TextUtils.indexOf(charSequence, '\n', iLastIndexOf, i) != -1)) {
            return iLastIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21076(int i, CharSequence charSequence) {
        C5042 c5042 = new C5042(i, charSequence);
        String strM14562 = c5042.m14562();
        if (strM14562.equals("=")) {
            strM14562 = C9045.m23341(new StringBuilder(), c5042.m14562(), strM14562);
        }
        return strM14562.equals("name=") && !c5042.m14562().equals("<item");
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static void m21110(C7864 c7864) {
        if (c7864.f24385) {
            c7864.f24373.m12888();
        }
    }
}
