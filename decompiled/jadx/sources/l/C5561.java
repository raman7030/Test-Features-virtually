package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final class C5561 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ImageView f17214;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f17215;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f17216;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f17217;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C6659 f17218;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f17219;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TabLayout f17220;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Drawable f17221;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f17222;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f17223;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f17224;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6245 f17225;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14771 f17226;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ImageView f17227;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f17228;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f17229;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View f17230;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f17231;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f17232;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HorizontalScrollView f17233;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f17234;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f17235;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8817 f17236;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f17237;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23592 f17238;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Drawable f17239;

    public C5561(final C9340 c9340, final Main main) {
        this(main, new C4129(c9340, main), true);
        c9340.m24057(new RunnableC16185(3, this));
        this.f17226.m35117(new InterfaceC23944() { // from class: l.ᩴᩴܳ
            @Override // l.InterfaceC23944
            /* JADX INFO: renamed from: ֫ */
            public final void mo18946(float f) {
                if (ApplicationC20075.f65010.getBoolean("bookmark_swipe_pos_aware", false)) {
                    c9340.m24063(main.m122().m45426(), f);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m15793() {
        AbstractActivityC3346 abstractActivityC3346 = this.f17216;
        PorterDuffColorFilter porterDuffColorFilterM33704 = C14096.m33704(C4369.m13089(abstractActivityC3346.getResources(), R.color.MT_Protector, abstractActivityC3346.getTheme()));
        this.f17222 = porterDuffColorFilterM33704;
        this.f17221.setColorFilter(porterDuffColorFilterM33704);
        this.f17239.setColorFilter(C14096.m33704(C21943.f70284));
        this.f17232.setBackgroundColor(C21943.f70283);
        Drawable drawableM3234 = C0881.m3234(abstractActivityC3346, R.drawable.MT_Protector);
        drawableM3234.setColorFilter(C14096.m33704(C21943.f70259));
        this.f17230.setBackground(drawableM3234);
        this.f17214.setBackground(C19890.m45742(abstractActivityC3346));
        this.f17227.setBackground(C19890.m45742(abstractActivityC3346));
        Drawable drawableM45738 = C19890.m45738(abstractActivityC3346);
        LinearLayout linearLayout = this.f17224;
        linearLayout.setBackground(drawableM45738);
        Drawable drawableM45739 = C19890.m45738(abstractActivityC3346);
        LinearLayout linearLayout2 = this.f17219;
        linearLayout2.setBackground(drawableM45739);
        Drawable drawableM457310 = C19890.m45738(abstractActivityC3346);
        LinearLayout linearLayout3 = this.f17229;
        linearLayout3.setBackground(drawableM457310);
        ((ImageView) linearLayout.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((ImageView) linearLayout2.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((ImageView) linearLayout3.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((TextView) linearLayout.getChildAt(1)).setTextColor(C21943.f70275);
        ((TextView) linearLayout2.getChildAt(1)).setTextColor(C21943.f70275);
        ((TextView) linearLayout3.getChildAt(1)).setTextColor(C21943.f70275);
        this.f17235.setBackgroundColor(C21943.f70283);
        this.f17238.m52053();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15792(C5561 c5561) {
        C9068.m23427();
        Iterator it = c5561.f17223.iterator();
        while (it.hasNext()) {
            ((C23178) it.next()).f74504.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15775(AbstractC16891 abstractC16891, AbstractC3577 abstractC3577) {
        return (abstractC16891 instanceof C5259) && ((C5259) abstractC16891).m15168() == abstractC3577.f11356;
    }

    public C5561(ViewOnClickListenerC19121 viewOnClickListenerC19121, C21091 c21091) {
        this(viewOnClickListenerC19121, c21091, false);
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [l.۠ᩴܳ] */
    public C5561(AbstractActivityC3346 abstractActivityC3346, InterfaceC6245 interfaceC6245, boolean z) {
        this.f17223 = new ArrayList();
        this.f17236 = C8817.m22788();
        this.f17215 = new ArrayList();
        this.f17237 = "";
        this.f17216 = abstractActivityC3346;
        this.f17225 = interfaceC6245;
        this.f17217 = z;
        C14771 c14771 = (C14771) abstractActivityC3346.m10241(R.id.MT_Protector);
        this.f17226 = c14771;
        TabLayout tabLayout = (TabLayout) c14771.findViewById(R.id.tabLayout);
        this.f17220 = tabLayout;
        C6659 c6659 = (C6659) c14771.findViewById(R.id.MT_Protector);
        this.f17218 = c6659;
        View viewFindViewById = c14771.findViewById(R.id.more);
        this.f17234 = viewFindViewById;
        ImageView imageView = (ImageView) c14771.findViewById(R.id.MT_Protector);
        this.f17214 = imageView;
        View viewFindViewById2 = c14771.findViewById(R.id.done);
        this.f17231 = viewFindViewById2;
        ImageView imageView2 = (ImageView) c14771.findViewById(R.id.MT_Protector);
        this.f17227 = imageView2;
        C23592 c23592 = (C23592) c14771.findViewById(R.id.searchView);
        this.f17238 = c23592;
        this.f17230 = c14771.findViewById(R.id.MT_Protector);
        this.f17232 = c14771.findViewById(R.id.MT_Protector);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) c14771.findViewById(R.id.menuScrollView);
        this.f17233 = horizontalScrollView;
        this.f17224 = (LinearLayout) c14771.findViewById(R.id.MT_Protector);
        this.f17219 = (LinearLayout) c14771.findViewById(R.id.MT_Protector);
        this.f17229 = (LinearLayout) c14771.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = c14771.findViewById(R.id.MT_Protector);
        this.f17235 = viewFindViewById3;
        c14771.m35117(new InterfaceC23944() { // from class: l.ܺᩴܳ
            @Override // l.InterfaceC23944
            /* JADX INFO: renamed from: ֫ */
            public final void mo18946(float f) {
                C5561.m15765(this.f49667, f);
            }
        });
        if (c14771.m35121() == 0.0f) {
            c6659.setVisibility(4);
        }
        Drawable drawableMutate = C0881.m3234(abstractActivityC3346, R.drawable.MT_Protector).mutate();
        this.f17221 = drawableMutate;
        drawableMutate.setAlpha(153);
        imageView.setImageDrawable(drawableMutate);
        Drawable drawableMutate2 = C0881.m3234(abstractActivityC3346, R.drawable.MT_Protector).mutate();
        this.f17239 = drawableMutate2;
        drawableMutate.setAlpha(153);
        imageView2.setImageDrawable(drawableMutate2);
        c23592.m52055(new C20357(this));
        m15773(false);
        tabLayout.setVisibility(0);
        viewFindViewById.setVisibility(z ? 0 : 8);
        if (z) {
            c23592.setVisibility(8);
            c23592.m52056(true);
        } else {
            c23592.setVisibility(0);
            c23592.m52056(false);
        }
        horizontalScrollView.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        viewFindViewById3.setVisibility(8);
        c14771.m35113(ApplicationC20075.f65008.getInt("bottom_content_view_ratio_int", 50) / 100.0f);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1306(0, this, c14771));
        c14771.m35116(new C15416(this, new View.OnLongClickListener() { // from class: l.۠ᩴܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C5561.m15774(this.f25671, view);
            }
        }));
        c6659.m2029(new C22473(this));
        tabLayout.setupWithViewPager(c6659);
        m15789();
        C9068.m23406(abstractActivityC3346, new InterfaceC1008() { // from class: l.֡ᩴܳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                this.f2337.m15789();
            }
        });
        C19547.f63205.m1668(abstractActivityC3346, new C17104(1, this));
        C12749.m31038(abstractActivityC3346, new C14281(1, this));
        abstractActivityC3346.getLifecycle().mo19833(new InterfaceC17236() { // from class: l.ۚᩴܳ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                C5561.m15771(this.f17141, enumC22901);
            }
        });
        m15793();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15765(C5561 c5561, float f) {
        C6659 c6659 = c5561.f17218;
        int i = f == 0.0f ? 4 : 0;
        if (c6659.getVisibility() != i) {
            c6659.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15796(C5561 c5561) {
        for (C23178 c23178 : c5561.f17223) {
            if (c23178.m51416()) {
                c23178.f74504.m23466();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15764(C5561 c5561) {
        for (C23178 c23178 : c5561.f17223) {
            if (c23178.m51416()) {
                c23178.f74504.m23466();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15771(C5561 c5561, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_PAUSE) {
            ApplicationC20075.f65008.edit().mo25853(c5561.f17218.m2038(), "bottom_selected_tab_index").apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m15789() {
        int i;
        ArrayList arrayList = this.f17223;
        boolean zIsEmpty = arrayList.isEmpty();
        int iM23410 = C9068.m23410();
        while (iM23410 > arrayList.size()) {
            arrayList.add(new C23178(this, arrayList.size()));
        }
        while (iM23410 < arrayList.size()) {
            C18473.m42953(arrayList, 1);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C23178) it.next()).m51414());
        }
        ArrayList arrayList3 = this.f17215;
        boolean zEquals = arrayList3.equals(arrayList2);
        if (!zEquals) {
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C23178) it2.next()).f74504.m23466();
        }
        C6659 c6659 = this.f17218;
        if (!zEquals) {
            AbstractC12014 abstractC12014M2032 = c6659.m2032();
            if (abstractC12014M2032 != null) {
                abstractC12014M2032.m29381();
            }
            InterfaceC16233 interfaceC16233M35123 = this.f17226.m35123();
            if (interfaceC16233M35123 != null) {
                ((C15416) interfaceC16233M35123).invoke(Boolean.TRUE);
            }
        }
        if (!zIsEmpty || (i = ApplicationC20075.f65008.getInt("bottom_selected_tab_index", 0)) >= arrayList.size()) {
            return;
        }
        c6659.m2043(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15768(C5561 c5561, String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(c5561.f17237)) {
            return;
        }
        c5561.f17237 = str;
        Iterator it = c5561.f17223.iterator();
        while (it.hasNext()) {
            ((C23178) it.next()).f74504.m23465();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m15773(boolean z) {
        if (this.f17228 != z) {
            C14771 c14771 = this.f17226;
            if (z) {
                View view = this.f17230;
                int height = view.getHeight();
                if (height <= 0) {
                    height = view.getMeasuredHeight();
                }
                if (height > 0) {
                    c14771.m35114(height);
                }
            } else {
                c14771.m35119();
            }
            this.f17228 = z;
        }
        C23592 c23592 = this.f17238;
        C16900 c16900 = (C16900) c23592.getLayoutParams();
        if (z) {
            ((ViewGroup.MarginLayoutParams) c16900).width = 0;
            c16900.f51945 = 0;
            c16900.f51943 = -1;
            c16900.f51895 = 0;
            c16900.f51934 = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) c16900).width = -2;
            c16900.f51945 = -1;
            c16900.f51943 = R.id.tabLayout;
            c16900.f51895 = -1;
            c16900.f51934 = R.id.more;
        }
        c23592.setLayoutParams(c16900);
        this.f17220.setVisibility(z ? 4 : 0);
        int i = 8;
        if (!z) {
            i = this.f17217 ? 0 : 8;
        }
        this.f17234.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m15795() {
        C23592 c23592 = this.f17238;
        if (c23592.m52061() || c23592.m52060().length() > 0) {
            c23592.m52054((String) null);
            c23592.m52057();
        }
        this.f17226.m35112();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m15787(C5561 c5561) {
        return c5561.f17238.m52061();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static C0621 m15799(C5561 c5561) {
        View view = c5561.f17234;
        C23592 c23592 = c5561.f17238;
        TabLayout tabLayout = c5561.f17220;
        if (c5561.f17217) {
            if (!c23592.m52059()) {
                return new C0621(tabLayout, c23592, view);
            }
            return new C0621(tabLayout, view);
        }
        if (!c23592.m52059()) {
            return new C0621(tabLayout, c23592);
        }
        return new C0621(tabLayout);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m15805() {
        C23592 c23592 = this.f17238;
        if (!c23592.m52061() && c23592.m52060().length() <= 0) {
            return false;
        }
        m15795();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15772(C5561 c5561, boolean z) {
        LinearLayout linearLayout = c5561.f17229;
        LinearLayout linearLayout2 = c5561.f17219;
        LinearLayout linearLayout3 = c5561.f17224;
        if (z) {
            if (linearLayout3.isClickable() && linearLayout3.getAlpha() == 1.0f) {
                return;
            }
            linearLayout3.setClickable(true);
            linearLayout2.setClickable(true);
            linearLayout.setClickable(true);
            linearLayout3.setAlpha(1.0f);
            linearLayout2.setAlpha(1.0f);
            linearLayout.setAlpha(1.0f);
            return;
        }
        if (linearLayout3.isClickable() || linearLayout3.getAlpha() == 1.0f) {
            linearLayout3.setClickable(false);
            linearLayout2.setClickable(false);
            linearLayout.setClickable(false);
            linearLayout3.setAlpha(0.5f);
            linearLayout2.setAlpha(0.5f);
            linearLayout.setAlpha(0.5f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15804() {
        return this.f17218.m2038();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15770(C5561 c5561, C14771 c14771, View view) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        c21282.m48306();
        C3060 c3060M48304 = c21282.m48304();
        c3060M48304.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        if (C9523.m24405()) {
            c3060M48304.add(R.id.MT_Protector, R.string.MT_Protector, 0, "手势说明").setIcon(R.drawable.MT_Protector);
        }
        if (C9068.m23415(c5561.f17220.getSelectedTabPosition()).m18787()) {
            c3060M48304.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setCheckable(true).setChecked(ApplicationC20075.f65008.getBoolean("eph", true));
            c3060M48304.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        } else {
            c3060M48304.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c3060M48304.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        C22090.m49677(c3060M48304);
        c21282.m48302(new C2429(c5561, c14771));
        c21282.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15769(C5561 c5561, C14771 c14771, MenuItem menuItem) {
        AbstractActivityC3346 abstractActivityC3346 = c5561.f17216;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C4925.m14315(new RunnableC1126(2, c5561));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C9068.m23412();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            menuItem.setChecked(!menuItem.isChecked());
            boolean zIsChecked = menuItem.isChecked();
            C9068 c9068 = C9068.f27496;
            C22870.m50970(ApplicationC20075.f65008, "eph", zIsChecked);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            ((C23178) c5561.f17223.get(c5561.f17218.m2038())).f74504.m23464(-1);
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                C3423 c3423 = new C3423(abstractActivityC3346, -1);
                c3423.m31258(R.string.MT_Protector);
                c3423.m31244();
                c3423.m31279(6);
                c3423.m31266(true);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                ((Main) abstractActivityC3346).m130("cloudBackup");
                return;
            } else {
                if (itemId == R.string.MT_Protector) {
                    ActivityC10717.m26893((Context) abstractActivityC3346, C23986.m52805(), false);
                    return;
                }
                return;
            }
        }
        C15821 c15821 = new C15821(abstractActivityC3346, null);
        c15821.setPadding(c15821.getPaddingLeft(), C11266.m27878(20.0f) + c15821.getPaddingTop(), c15821.getPaddingRight(), c15821.getPaddingBottom());
        c15821.setMax(100);
        c15821.setProgress((int) (c14771.m35124() * 100.0f));
        String str = abstractActivityC3346.getString(R.string.MT_Protector) + " (";
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(c15821.getProgress());
        sbM15339.append("%)");
        c19258BuildDialog.m44436(sbM15339.toString());
        c19258BuildDialog.m44421(c15821);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c15821.setOnSeekBarChangeListener(new C4834(c19258BuildDialog.m44438(), str, c14771));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15767(final C5561 c5561, final int i, C6951 c6951, MenuItem menuItem) {
        AbstractActivityC3346 abstractActivityC3346 = c5561.f17216;
        TabLayout tabLayout = c5561.f17220;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            int i2 = i - 1;
            C9068.m23397(i, i2);
            if (tabLayout.getSelectedTabPosition() == i) {
                tabLayout.selectTab(tabLayout.getTabAt(i2));
                return;
            } else {
                if (tabLayout.getSelectedTabPosition() == i2) {
                    tabLayout.selectTab(tabLayout.getTabAt(i));
                    return;
                }
                return;
            }
        }
        if (itemId == 2) {
            int i3 = i + 1;
            C9068.m23397(i, i3);
            if (tabLayout.getSelectedTabPosition() == i) {
                tabLayout.selectTab(tabLayout.getTabAt(i3));
                return;
            } else {
                if (tabLayout.getSelectedTabPosition() == i3) {
                    tabLayout.selectTab(tabLayout.getTabAt(i));
                    return;
                }
                return;
            }
        }
        if (itemId == 3) {
            C13300 c13300 = new C13300(abstractActivityC3346, c6951, i);
            c13300.m31258(R.string.MT_Protector);
            c13300.m31250((CharSequence) c6951.m18794());
            c13300.m31244();
            c13300.m31279(6);
            c13300.m31281();
            c13300.m31266(true);
            return;
        }
        if (itemId != 4) {
            return;
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(abstractActivityC3346.getString(R.string.MT_Protector, c6951.m18794()));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖᩴܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C5561.m15766(this.f8487, i);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15766(C5561 c5561, int i) {
        TabLayout tabLayout = c5561.f17220;
        C9068.m23396(i);
        if (i == 0 || tabLayout.getSelectedTabPosition() != i) {
            return;
        }
        tabLayout.selectTab(tabLayout.getTabAt(i - 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C8058 m15763(C5561 c5561, ViewOnLongClickListenerC8362 viewOnLongClickListenerC8362, Boolean bool) {
        TabLayout tabLayout = c5561.f17220;
        if (bool.booleanValue()) {
            for (int i = 0; i < tabLayout.getTabCount(); i++) {
                TabLayout.Tab tabAt = tabLayout.getTabAt(i);
                if (tabAt != null) {
                    TabLayout.TabView tabView = tabAt.view;
                    tabView.setTag(R.id.tabLayout, Integer.valueOf(i));
                    tabView.setOnLongClickListener(viewOnLongClickListenerC8362);
                }
            }
        } else {
            c5561.m15795();
            Iterator it = c5561.f17223.iterator();
            while (it.hasNext()) {
                ((C23178) it.next()).f74504.m23463();
            }
        }
        return C8058.f24861;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15806() {
        InterfaceC16233 interfaceC16233M35123;
        m15793();
        TabLayout tabLayout = new TabLayout(this.f17216);
        ColorStateList tabRippleColor = tabLayout.getTabRippleColor();
        TabLayout tabLayout2 = this.f17220;
        tabLayout2.setTabRippleColor(tabRippleColor);
        tabLayout2.setTabTextColors(tabLayout.getTabTextColors());
        tabLayout2.setSelectedTabIndicator(tabLayout.getTabSelectedIndicator());
        Iterator it = this.f17223.iterator();
        while (it.hasNext()) {
            C23178.m51406((C23178) it.next());
        }
        C14771 c14771 = this.f17226;
        if (c14771.m35125() || (interfaceC16233M35123 = c14771.m35123()) == null) {
            return;
        }
        ((C15416) interfaceC16233M35123).invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15774(final C5561 c5561, View view) {
        if (!c5561.f17217) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int iIntValue = ((Integer) view.getTag(R.id.tabLayout)).intValue();
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        c21282.m48306();
        C3060 c3060M48304 = c21282.m48304();
        final C6951 c6951M23415 = C9068.m23415(iIntValue);
        boolean z = iIntValue > 0;
        boolean z2 = iIntValue < C9068.m23410() - 1;
        boolean z3 = (c6951M23415.m18797() || c6951M23415.m18787()) ? false : true;
        c3060M48304.add(0, 1, 0, R.string.MT_Protector).setEnabled(z).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, 2, 0, R.string.MT_Protector).setEnabled(z2).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, 3, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, 4, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.᩸ᩴܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C5561.m15767(this.f69749, iIntValue, c6951M23415, menuItem);
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int m15777(C5561 c5561) {
        return c5561.f17217 ? 0 : 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15779(C5561 c5561) {
        return c5561.f17217;
    }
}
