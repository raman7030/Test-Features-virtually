package p067l;

import android.animation.ObjectAnimator;
import android.view.MenuItem;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܺۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes4.dex */
public class C17440 extends AbstractC7545 {

    /* JADX INFO: renamed from: ֫֫ */
    public final C7350 f52140;

    /* JADX INFO: renamed from: ۗ */
    public final C7350 f52141;

    /* JADX INFO: renamed from: ۙ */
    public final C7350 f52142;

    /* JADX INFO: renamed from: ۛ */
    public final C7350 f52143;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C7350 f52144;

    /* JADX INFO: renamed from: ۟ */
    public final C7350 f52145;

    /* JADX INFO: renamed from: ۤ */
    public final C7350 f52146;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C7350 f52147;

    /* JADX INFO: renamed from: ۨ */
    public final C7350 f52148;

    /* JADX INFO: renamed from: ۫ */
    public final C7350 f52149;

    /* JADX INFO: renamed from: ۬ */
    public final C7350 f52150;

    /* JADX INFO: renamed from: ܰ */
    public final C7350 f52151;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C7350 f52152;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C7350 f52153;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C7350 f52154;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C7350 f52155;

    /* JADX INFO: renamed from: ᩺ */
    public final C7350 f52156;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C7350 f52157;

    public C17440() {
        Boolean bool = Boolean.FALSE;
        this.f52146 = new C7350(bool);
        this.f52144 = new C7350(bool);
        this.f52157 = new C7350(bool);
        this.f52140 = new C7350(bool);
        this.f52154 = new C7350(bool);
        this.f52152 = new C7350(bool);
        this.f52149 = new C7350(bool);
        this.f52145 = new C7350(bool);
        this.f52151 = new C7350(bool);
        this.f52142 = new C7350(bool);
        this.f52150 = new C7350(bool);
        this.f52156 = new C7350();
        this.f52148 = new C7350(0);
        this.f52143 = new C7350(-1);
        this.f52155 = new C7350();
        this.f52153 = new C7350(0);
        this.f52147 = new C7350(-1);
        this.f52141 = new C7350();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39740(ActivityC4030 activityC4030, C19097 c19097) {
        this.f52146.m4066(activityC4030, c19097);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39760(boolean z) {
        this.f52146.mo4067(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39737(ActivityC4030 activityC4030, final MenuItem menuItem, final MenuItem menuItem2, final C18583 c18583, final C18583 c18584) {
        int defaultColor = C23223.f73009.getDefaultColor();
        c18583.m42283(defaultColor);
        c18584.m42283(defaultColor);
        menuItem.setIcon(c18583);
        menuItem2.setIcon(c18584);
        this.f52157.m4066(activityC4030, new InterfaceC3326() { // from class: l.ᩳۢᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C17440.m39732(this.f59270, c18583, menuItem, (Boolean) obj);
            }
        });
        this.f52140.m4066(activityC4030, new InterfaceC3326() { // from class: l.ܿۢᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C17440.m39731(this.f56120, c18584, menuItem2, (Boolean) obj);
            }
        });
        this.f52144.m4066(activityC4030, new InterfaceC3326() { // from class: l.ܳۢᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C17440.m39730(this.f47379, menuItem, menuItem2, c18583, c18584, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m39732(C17440 c17440, C18583 c18583, MenuItem menuItem, Boolean bool) {
        c18583.m42282(bool.booleanValue() ? 1.0f : 0.45f);
        if (Boolean.TRUE.equals(c17440.f52144.m4060())) {
            menuItem.setEnabled(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m39731(C17440 c17440, C18583 c18583, MenuItem menuItem, Boolean bool) {
        c18583.m42282(bool.booleanValue() ? 1.0f : 0.45f);
        if (Boolean.TRUE.equals(c17440.f52144.m4060())) {
            menuItem.setEnabled(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m39730(C17440 c17440, MenuItem menuItem, MenuItem menuItem2, C18583 c18583, C18583 c18584, Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            menuItem.setTitle(R.string.MT_Protector);
            menuItem2.setTitle(R.string.MT_Protector);
            menuItem.setEnabled(bool2.equals(c17440.f52157.m4060()));
            menuItem2.setEnabled(bool2.equals(c17440.f52140.m4060()));
            c18583.m42289(300);
            c18584.m42289(300);
            return;
        }
        menuItem.setTitle(R.string.MT_Protector);
        menuItem2.setTitle(R.string.MT_Protector);
        menuItem.setEnabled(true);
        menuItem2.setEnabled(true);
        c18583.m42281();
        c18584.m42281();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m39755() {
        Boolean bool = Boolean.FALSE;
        C7350 c7350 = this.f52144;
        c7350.mo4067(Boolean.valueOf(bool.equals(c7350.m4060())));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m39761() {
        return Boolean.TRUE.equals(this.f52144.m4060());
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m39743(boolean z) {
        C7350 c7350 = this.f52157;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m39764(boolean z) {
        C7350 c7350 = this.f52140;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m39763(ActivityC4030 activityC4030, MenuItem menuItem) {
        C24817 c24817 = new C24817(0, this, menuItem);
        this.f52154.m4066(activityC4030, c24817);
        this.f52152.m4066(activityC4030, c24817);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m39742(boolean z) {
        C7350 c7350 = this.f52154;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m39762(boolean z) {
        C7350 c7350 = this.f52152;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39754(boolean z) {
        C7350 c7350 = this.f52149;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39736(ActivityC4030 activityC4030, final MenuItem menuItem, final MenuItem menuItem2) {
        this.f52145.m4066(activityC4030, new InterfaceC3326() { // from class: l.ۜۢᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                Boolean bool = (Boolean) obj;
                menuItem.setChecked(bool.booleanValue());
                menuItem2.setEnabled(!bool.booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m39750(boolean z) {
        C7350 c7350 = this.f52145;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m39757(boolean z) {
        C7350 c7350 = this.f52151;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39741(boolean z) {
        C7350 c7350 = this.f52142;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39748(boolean z) {
        C7350 c7350 = this.f52150;
        if (((Boolean) c7350.m4060()).booleanValue() != z) {
            c7350.mo4067(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39739(ActivityC4030 activityC4030, TextView textView, C6042 c6042) {
        C12826.requireNonNull(textView);
        this.f52156.m4066(activityC4030, new C16179(1, textView));
        this.f52148.m4066(activityC4030, new C22136(textView));
        this.f52143.m4066(activityC4030, new C11407(c6042));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39745(String str) {
        C7350 c7350 = this.f52156;
        if (C12826.equals(c7350.m4060(), str)) {
            return;
        }
        c7350.mo4067(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39744(int i) {
        C7350 c7350 = this.f52148;
        if (((Integer) c7350.m4060()).intValue() != i) {
            c7350.mo4067(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39733(int i) {
        C7350 c7350 = this.f52143;
        if (((Integer) c7350.m4060()).intValue() != i) {
            c7350.mo4067(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39747(ActivityC4030 activityC4030, TextView textView, C6042 c6042) {
        C12826.requireNonNull(textView);
        this.f52155.m4066(activityC4030, new C16179(1, textView));
        this.f52153.m4066(activityC4030, new C22136(textView));
        this.f52147.m4066(activityC4030, new C11407(c6042));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39752(String str) {
        C7350 c7350 = this.f52155;
        if (C12826.equals(c7350.m4060(), str)) {
            return;
        }
        c7350.mo4067(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39758(int i) {
        C7350 c7350 = this.f52153;
        if (((Integer) c7350.m4060()).intValue() != i) {
            c7350.mo4067(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39751(int i) {
        C7350 c7350 = this.f52147;
        if (((Integer) c7350.m4060()).intValue() != i) {
            c7350.mo4067(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39738(ActivityC4030 activityC4030, final TextView textView) {
        this.f52141.m4066(activityC4030, new InterfaceC3326(this) { // from class: l.ۧۢᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                String str = (String) obj;
                TextView textView2 = textView;
                Object tag = textView2.getTag();
                if (tag instanceof ObjectAnimator) {
                    ((ObjectAnimator) tag).cancel();
                }
                if (str != null && !str.isEmpty()) {
                    if (textView2.getAlpha() != 1.0f) {
                        textView2.setAlpha(1.0f);
                    }
                    textView2.setText(str);
                } else {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(textView2, "alpha", 1.0f, 0.1f).setDuration(200L);
                    duration.addListener(new C10736(textView2));
                    duration.start();
                    textView2.setTag(duration);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39734(String str) {
        C7350 c7350 = this.f52141;
        if (C12826.equals(c7350.m4060(), str)) {
            return;
        }
        c7350.mo4067(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39735(ActivityC4030 activityC4030, MenuItem menuItem) {
        C12826.requireNonNull(menuItem);
        this.f52142.m4066(activityC4030, new C18111(0, menuItem));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39746(ActivityC4030 activityC4030, MenuItem menuItem) {
        C12826.requireNonNull(menuItem);
        this.f52150.m4066(activityC4030, new C18111(0, menuItem));
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m39749(ActivityC4030 activityC4030, MenuItem menuItem) {
        C12826.requireNonNull(menuItem);
        this.f52152.m4066(activityC4030, new C18111(0, menuItem));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m39756(ActivityC4030 activityC4030, MenuItem menuItem) {
        C12826.requireNonNull(menuItem);
        this.f52154.m4066(activityC4030, new C18111(0, menuItem));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39753(ActivityC4030 activityC4030, MenuItem menuItem) {
        C12826.requireNonNull(menuItem);
        this.f52149.m4066(activityC4030, new C23488(1, menuItem));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39759(ActivityC4030 activityC4030, MenuItem menuItem) {
        C12826.requireNonNull(menuItem);
        this.f52151.m4066(activityC4030, new C23488(1, menuItem));
    }
}
