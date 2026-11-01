package p067l;

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
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final class C7654 {

    /* JADX INFO: renamed from: ֡ */
    public final ImageView f20054;

    /* JADX INFO: renamed from: ֨ */
    public final ArrayList f20055;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f20056;

    /* JADX INFO: renamed from: ۖ */
    public final boolean f20057;

    /* JADX INFO: renamed from: ۗ */
    public final C8697 f20058;

    /* JADX INFO: renamed from: ۘ */
    public final LinearLayout f20059;

    /* JADX INFO: renamed from: ۙ */
    public final TabLayout f20060;

    /* JADX INFO: renamed from: ۚ */
    public final Drawable f20061;

    /* JADX INFO: renamed from: ۜ */
    public PorterDuffColorFilter f20062;

    /* JADX INFO: renamed from: ۠ */
    public final ArrayList f20063;

    /* JADX INFO: renamed from: ۡ */
    public final LinearLayout f20064;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC8304 f20065;

    /* JADX INFO: renamed from: ۧ */
    public final C16407 f20066;

    /* JADX INFO: renamed from: ܳ */
    public final ImageView f20067;

    /* JADX INFO: renamed from: ܶ */
    public boolean f20068;

    /* JADX INFO: renamed from: ܺ */
    public final LinearLayout f20069;

    /* JADX INFO: renamed from: ܽ */
    public final View f20070;

    /* JADX INFO: renamed from: ܿ */
    public final View f20071;

    /* JADX INFO: renamed from: ᩳ */
    public final View f20072;

    /* JADX INFO: renamed from: ᩴ */
    public final HorizontalScrollView f20073;

    /* JADX INFO: renamed from: ᩵ */
    public final View f20074;

    /* JADX INFO: renamed from: ᩶ */
    public final View f20075;

    /* JADX INFO: renamed from: ᩷ */
    public final C10748 f20076;

    /* JADX INFO: renamed from: ᩸ */
    public String f20077;

    /* JADX INFO: renamed from: ᩹ */
    public final C24790 f20078;

    /* JADX INFO: renamed from: ᩻ */
    public final Drawable f20079;

    public C7654(final C11245 c11245, final Main main) {
        this(main, new C6293(c11245, main), true);
        c11245.m26066(new RunnableC17751(3, this));
        this.f20066.m37264(new InterfaceC25125() { // from class: l.ᩴᩴܳ
            @Override // p067l.InterfaceC25125
            /* JADX INFO: renamed from: ֫ */
            public final void mo20903(float f) {
                if (ApplicationC21448.f67650.getBoolean("bookmark_swipe_pos_aware", false)) {
                    c11245.m26072(main.m120().m47730(), f);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ܿ */
    private void m17708() {
        AbstractActivityC5549 abstractActivityC5549 = this.f20056;
        PorterDuffColorFilter porterDuffColorFilterM35830 = C15766.m35830(C1059.m14953(abstractActivityC5549.getResources(), R.color.MT_Protector, abstractActivityC5549.getTheme()));
        this.f20062 = porterDuffColorFilterM35830;
        this.f20061.setColorFilter(porterDuffColorFilterM35830);
        this.f20079.setColorFilter(C15766.m35830(C23223.f72995));
        this.f20072.setBackgroundColor(C23223.f72994);
        Drawable drawableM5548 = C0886.m5548(abstractActivityC5549, R.drawable.MT_Protector);
        drawableM5548.setColorFilter(C15766.m35830(C23223.f72971));
        this.f20070.setBackground(drawableM5548);
        this.f20054.setBackground(C21272.m48053(abstractActivityC5549));
        this.f20067.setBackground(C21272.m48053(abstractActivityC5549));
        Drawable drawableM48049 = C21272.m48049(abstractActivityC5549);
        LinearLayout linearLayout = this.f20064;
        linearLayout.setBackground(drawableM48049);
        Drawable drawableM480410 = C21272.m48049(abstractActivityC5549);
        LinearLayout linearLayout2 = this.f20059;
        linearLayout2.setBackground(drawableM480410);
        Drawable drawableM480411 = C21272.m48049(abstractActivityC5549);
        LinearLayout linearLayout3 = this.f20069;
        linearLayout3.setBackground(drawableM480411);
        ((ImageView) linearLayout.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((ImageView) linearLayout2.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((ImageView) linearLayout3.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((TextView) linearLayout.getChildAt(1)).setTextColor(C23223.f72986);
        ((TextView) linearLayout2.getChildAt(1)).setTextColor(C23223.f72986);
        ((TextView) linearLayout3.getChildAt(1)).setTextColor(C23223.f72986);
        this.f20075.setBackgroundColor(C23223.f72994);
        this.f20078.m54456();
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m17707(C7654 c7654) {
        C10987.m25373();
        Iterator it = c7654.f20063.iterator();
        while (it.hasNext()) {
            ((C24397) it.next()).f77248.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17690(AbstractC18422 abstractC18422, AbstractC5769 abstractC5769) {
        return (abstractC18422 instanceof C7367) && ((C7367) abstractC18422).m17071() == abstractC5769.f14161;
    }

    public C7654(ViewOnClickListenerC20541 viewOnClickListenerC20541, C22414 c22414) {
        this(viewOnClickListenerC20541, c22414, false);
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [l.۠ᩴܳ] */
    public C7654(AbstractActivityC5549 abstractActivityC5549, InterfaceC8304 interfaceC8304, boolean z) {
        this.f20063 = new ArrayList();
        this.f20076 = C10748.m24758();
        this.f20055 = new ArrayList();
        this.f20077 = "";
        this.f20056 = abstractActivityC5549;
        this.f20065 = interfaceC8304;
        this.f20057 = z;
        C16407 c16407 = (C16407) abstractActivityC5549.m12277(R.id.MT_Protector);
        this.f20066 = c16407;
        TabLayout tabLayout = (TabLayout) c16407.findViewById(R.id.tabLayout);
        this.f20060 = tabLayout;
        C8697 c8697 = (C8697) c16407.findViewById(R.id.MT_Protector);
        this.f20058 = c8697;
        View viewFindViewById = c16407.findViewById(R.id.more);
        this.f20074 = viewFindViewById;
        ImageView imageView = (ImageView) c16407.findViewById(R.id.MT_Protector);
        this.f20054 = imageView;
        View viewFindViewById2 = c16407.findViewById(R.id.done);
        this.f20071 = viewFindViewById2;
        ImageView imageView2 = (ImageView) c16407.findViewById(R.id.MT_Protector);
        this.f20067 = imageView2;
        C24790 c24790 = (C24790) c16407.findViewById(R.id.searchView);
        this.f20078 = c24790;
        this.f20070 = c16407.findViewById(R.id.MT_Protector);
        this.f20072 = c16407.findViewById(R.id.MT_Protector);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) c16407.findViewById(R.id.menuScrollView);
        this.f20073 = horizontalScrollView;
        this.f20064 = (LinearLayout) c16407.findViewById(R.id.MT_Protector);
        this.f20059 = (LinearLayout) c16407.findViewById(R.id.MT_Protector);
        this.f20069 = (LinearLayout) c16407.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = c16407.findViewById(R.id.MT_Protector);
        this.f20075 = viewFindViewById3;
        c16407.m37264(new InterfaceC25125() { // from class: l.ܺᩴܳ
            @Override // p067l.InterfaceC25125
            /* JADX INFO: renamed from: ֫ */
            public final void mo20903(float f) {
                C7654.m17680(this.f52833, f);
            }
        });
        if (c16407.m37268() == 0.0f) {
            c8697.setVisibility(4);
        }
        Drawable drawableMutate = C0886.m5548(abstractActivityC5549, R.drawable.MT_Protector).mutate();
        this.f20061 = drawableMutate;
        drawableMutate.setAlpha(153);
        imageView.setImageDrawable(drawableMutate);
        Drawable drawableMutate2 = C0886.m5548(abstractActivityC5549, R.drawable.MT_Protector).mutate();
        this.f20079 = drawableMutate2;
        drawableMutate.setAlpha(153);
        imageView2.setImageDrawable(drawableMutate2);
        c24790.m54458(new C21716(this));
        m17688(false);
        tabLayout.setVisibility(0);
        viewFindViewById.setVisibility(z ? 0 : 8);
        if (z) {
            c24790.setVisibility(8);
            c24790.m54459(true);
        } else {
            c24790.setVisibility(0);
            c24790.m54459(false);
        }
        horizontalScrollView.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        viewFindViewById3.setVisibility(8);
        c16407.m37260(ApplicationC21448.f67649.getInt("bottom_content_view_ratio_int", 50) / 100.0f);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC3610(0, this, c16407));
        c16407.m37263(new C17020(this, new View.OnLongClickListener() { // from class: l.۠ᩴܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C7654.m17689(this.f28584, view);
            }
        }));
        c8697.m4406(new C23727(this));
        tabLayout.setupWithViewPager(c8697);
        m17704();
        C10987.m25352(abstractActivityC5549, new InterfaceC3326() { // from class: l.֡ᩴܳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                this.f5111.m17704();
            }
        });
        C20946.f65825.m4066(abstractActivityC5549, new C18624(1, this));
        C14486.m33122(abstractActivityC5549, new C15941(1, this));
        abstractActivityC5549.getLifecycle().mo21806(new InterfaceC18749() { // from class: l.ۚᩴܳ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                C7654.m17686(this.f19982, enumC24133);
            }
        });
        m17708();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17680(C7654 c7654, float f) {
        C8697 c8697 = c7654.f20058;
        int i = f == 0.0f ? 4 : 0;
        if (c8697.getVisibility() != i) {
            c8697.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m17711(C7654 c7654) {
        for (C24397 c24397 : c7654.f20063) {
            if (c24397.m53812()) {
                c24397.f77248.m25413();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17679(C7654 c7654) {
        for (C24397 c24397 : c7654.f20063) {
            if (c24397.m53812()) {
                c24397.f77248.m25413();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17686(C7654 c7654, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_PAUSE) {
            ApplicationC21448.f67649.edit().mo27875(c7654.f20058.m4415(), "bottom_selected_tab_index").apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m17704() {
        int i;
        ArrayList arrayList = this.f20063;
        boolean zIsEmpty = arrayList.isEmpty();
        int iM25356 = C10987.m25356();
        while (iM25356 > arrayList.size()) {
            arrayList.add(new C24397(this, arrayList.size()));
        }
        while (iM25356 < arrayList.size()) {
            C19925.m45229(arrayList, 1);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C24397) it.next()).m53810());
        }
        ArrayList arrayList3 = this.f20055;
        boolean zEquals = arrayList3.equals(arrayList2);
        if (!zEquals) {
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C24397) it2.next()).f77248.m25413();
        }
        C8697 c8697 = this.f20058;
        if (!zEquals) {
            AbstractC13787 abstractC13787M4409 = c8697.m4409();
            if (abstractC13787M4409 != null) {
                abstractC13787M4409.m31441();
            }
            InterfaceC17797 interfaceC17797M37270 = this.f20066.m37270();
            if (interfaceC17797M37270 != null) {
                ((C17020) interfaceC17797M37270).invoke(Boolean.TRUE);
            }
        }
        if (!zIsEmpty || (i = ApplicationC21448.f67649.getInt("bottom_selected_tab_index", 0)) >= arrayList.size()) {
            return;
        }
        c8697.m4420(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17683(C7654 c7654, String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(c7654.f20077)) {
            return;
        }
        c7654.f20077 = str;
        Iterator it = c7654.f20063.iterator();
        while (it.hasNext()) {
            ((C24397) it.next()).f77248.m25412();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m17688(boolean z) {
        if (this.f20068 != z) {
            C16407 c16407 = this.f20066;
            if (z) {
                View view = this.f20070;
                int height = view.getHeight();
                if (height <= 0) {
                    height = view.getMeasuredHeight();
                }
                if (height > 0) {
                    c16407.m37261(height);
                }
            } else {
                c16407.m37266();
            }
            this.f20068 = z;
        }
        C24790 c24790 = this.f20078;
        C1680 c1680 = (C1680) c24790.getLayoutParams();
        if (z) {
            ((ViewGroup.MarginLayoutParams) c1680).width = 0;
            c1680.f55125 = 0;
            c1680.f55123 = -1;
            c1680.f55075 = 0;
            c1680.f55114 = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) c1680).width = -2;
            c1680.f55125 = -1;
            c1680.f55123 = R.id.tabLayout;
            c1680.f55075 = -1;
            c1680.f55114 = R.id.more;
        }
        c24790.setLayoutParams(c1680);
        this.f20060.setVisibility(z ? 4 : 0);
        int i = 8;
        if (!z) {
            i = this.f20057 ? 0 : 8;
        }
        this.f20074.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m17710() {
        C24790 c24790 = this.f20078;
        if (c24790.m54464() || c24790.m54463().length() > 0) {
            c24790.m54457((String) null);
            c24790.m54460();
        }
        this.f20066.m37259();
    }

    /* JADX INFO: renamed from: ۬ */
    public static boolean m17702(C7654 c7654) {
        return c7654.f20078.m54464();
    }

    /* JADX INFO: renamed from: ᩶ */
    public static C2959 m17714(C7654 c7654) {
        View view = c7654.f20074;
        C24790 c24790 = c7654.f20078;
        TabLayout tabLayout = c7654.f20060;
        if (c7654.f20057) {
            if (!c24790.m54462()) {
                return new C2959(tabLayout, c24790, view);
            }
            return new C2959(tabLayout, view);
        }
        if (!c24790.m54462()) {
            return new C2959(tabLayout, c24790);
        }
        return new C2959(tabLayout);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m17720() {
        C24790 c24790 = this.f20078;
        if (!c24790.m54464() && c24790.m54463().length() <= 0) {
            return false;
        }
        m17710();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17687(C7654 c7654, boolean z) {
        LinearLayout linearLayout = c7654.f20069;
        LinearLayout linearLayout2 = c7654.f20059;
        LinearLayout linearLayout3 = c7654.f20064;
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

    /* JADX INFO: renamed from: ֫ */
    public final int m17719() {
        return this.f20058.m4415();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17685(C7654 c7654, C16407 c16407, View view) {
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        c1898.m50640();
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        if (C11419.m26415()) {
            c0994M50638.add(R.id.MT_Protector, R.string.MT_Protector, 0, "手势说明").setIcon(R.drawable.MT_Protector);
        }
        if (C10987.m25361(c7654.f20060.getSelectedTabPosition()).m20741()) {
            c0994M50638.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setCheckable(true).setChecked(ApplicationC21448.f67649.getBoolean("eph", true));
            c0994M50638.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        } else {
            c0994M50638.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c0994M50638.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        C1938.m52015(c0994M50638);
        c1898.m50636(new C4677(c7654, c16407));
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17684(C7654 c7654, C16407 c16407, MenuItem menuItem) {
        AbstractActivityC5549 abstractActivityC5549 = c7654.f20056;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C7050.m16212(new RunnableC3439(2, c7654));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C10987.m25358();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            menuItem.setChecked(!menuItem.isChecked());
            boolean zIsChecked = menuItem.isChecked();
            C10987 c10987 = C10987.f30433;
            C24104.m53360(ApplicationC21448.f67649, "eph", zIsChecked);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            ((C24397) c7654.f20063.get(c7654.f20058.m4415())).f77248.m25411(-1);
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                C5622 c5622 = new C5622(abstractActivityC5549, -1);
                c5622.m33344(R.string.MT_Protector);
                c5622.m33330();
                c5622.m33365(6);
                c5622.m33352(true);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                ((Main) abstractActivityC5549).m128("cloudBackup");
                return;
            } else {
                if (itemId == R.string.MT_Protector) {
                    ActivityC12554.m28933((Context) abstractActivityC5549, C25165.m55211(), false);
                    return;
                }
                return;
            }
        }
        C1627 c1627 = new C1627(abstractActivityC5549, null);
        c1627.setPadding(c1627.getPaddingLeft(), C13076.m29939(20.0f) + c1627.getPaddingTop(), c1627.getPaddingRight(), c1627.getPaddingBottom());
        c1627.setMax(100);
        c1627.setProgress((int) (c16407.m37271() * 100.0f));
        String str = abstractActivityC5549.getString(R.string.MT_Protector) + " (";
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(c1627.getProgress());
        sbM17248.append("%)");
        c20671BuildDialog.m46730(sbM17248.toString());
        c20671BuildDialog.m46715(c1627);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c1627.setOnSeekBarChangeListener(new C6963(c20671BuildDialog.m46732(), str, c16407));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17682(final C7654 c7654, final int i, C8975 c8975, MenuItem menuItem) {
        AbstractActivityC5549 abstractActivityC5549 = c7654.f20056;
        TabLayout tabLayout = c7654.f20060;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            int i2 = i - 1;
            C10987.m25343(i, i2);
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
            C10987.m25343(i, i3);
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
            C15009 c15009 = new C15009(abstractActivityC5549, c8975, i);
            c15009.m33344(R.string.MT_Protector);
            c15009.m33336((CharSequence) c8975.m20748());
            c15009.m33330();
            c15009.m33365(6);
            c15009.m33367();
            c15009.m33352(true);
            return;
        }
        if (itemId != 4) {
            return;
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(abstractActivityC5549.getString(R.string.MT_Protector, c8975.m20748()));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖᩴܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C7654.m17681(this.f11282, i);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17681(C7654 c7654, int i) {
        TabLayout tabLayout = c7654.f20060;
        C10987.m25342(i);
        if (i == 0 || tabLayout.getSelectedTabPosition() != i) {
            return;
        }
        tabLayout.selectTab(tabLayout.getTabAt(i - 1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C10027 m17678(C7654 c7654, ViewOnLongClickListenerC10316 viewOnLongClickListenerC10316, Boolean bool) {
        TabLayout tabLayout = c7654.f20060;
        if (bool.booleanValue()) {
            for (int i = 0; i < tabLayout.getTabCount(); i++) {
                TabLayout.Tab tabAt = tabLayout.getTabAt(i);
                if (tabAt != null) {
                    TabLayout.TabView tabView = tabAt.view;
                    tabView.setTag(R.id.tabLayout, Integer.valueOf(i));
                    tabView.setOnLongClickListener(viewOnLongClickListenerC10316);
                }
            }
        } else {
            c7654.m17710();
            Iterator it = c7654.f20063.iterator();
            while (it.hasNext()) {
                ((C24397) it.next()).f77248.m25410();
            }
        }
        return C10027.f27775;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17721() {
        InterfaceC17797 interfaceC17797M37270;
        m17708();
        TabLayout tabLayout = new TabLayout(this.f20056);
        ColorStateList tabRippleColor = tabLayout.getTabRippleColor();
        TabLayout tabLayout2 = this.f20060;
        tabLayout2.setTabRippleColor(tabRippleColor);
        tabLayout2.setTabTextColors(tabLayout.getTabTextColors());
        tabLayout2.setSelectedTabIndicator(tabLayout.getTabSelectedIndicator());
        Iterator it = this.f20063.iterator();
        while (it.hasNext()) {
            C24397.m53802((C24397) it.next());
        }
        C16407 c16407 = this.f20066;
        if (c16407.m37272() || (interfaceC17797M37270 = c16407.m37270()) == null) {
            return;
        }
        ((C17020) interfaceC17797M37270).invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17689(final C7654 c7654, View view) {
        if (!c7654.f20057) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int iIntValue = ((Integer) view.getTag(R.id.tabLayout)).intValue();
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        c1898.m50640();
        C0994 c0994M50638 = c1898.m50638();
        final C8975 c8975M25361 = C10987.m25361(iIntValue);
        boolean z = iIntValue > 0;
        boolean z2 = iIntValue < C10987.m25356() - 1;
        boolean z3 = (c8975M25361.m20751() || c8975M25361.m20741()) ? false : true;
        c0994M50638.add(0, 1, 0, R.string.MT_Protector).setEnabled(z).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, 2, 0, R.string.MT_Protector).setEnabled(z2).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, 3, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, 4, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.᩸ᩴܳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C7654.m17682(this.f72457, iIntValue, c8975M25361, menuItem);
                return true;
            }
        });
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ۗ */
    public static int m17692(C7654 c7654) {
        return c7654.f20057 ? 0 : 8;
    }

    /* JADX INFO: renamed from: ۙ */
    public static boolean m17694(C7654 c7654) {
        return c7654.f20057;
    }
}
