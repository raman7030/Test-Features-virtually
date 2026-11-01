package p067l;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ܺܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC17598 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۚۧ */
    public static final /* synthetic */ int f52591 = 0;

    /* JADX INFO: renamed from: ֡ۧ */
    public MenuItem f52592;

    /* JADX INFO: renamed from: ۖۧ */
    public MenuItem f52593;

    /* JADX INFO: renamed from: ۘۧ */
    public MenuItem f52594;

    /* JADX INFO: renamed from: ۜۧ */
    public String f52595;

    /* JADX INFO: renamed from: ۡۧ */
    public String f52596;

    /* JADX INFO: renamed from: ۢۧ */
    public C10748 f52597 = C10748.m24758();

    /* JADX INFO: renamed from: ܳۧ */
    public C15360 f52598;

    /* JADX INFO: renamed from: ܺۧ */
    public boolean f52599;

    /* JADX INFO: renamed from: ܿۧ */
    public SpannableString f52600;

    /* JADX INFO: renamed from: ᩳۧ */
    public C6644 f52601;

    /* JADX INFO: renamed from: ᩴۧ */
    public TextView f52602;

    /* JADX INFO: renamed from: ᩵ۧ */
    public AbstractC17043 f52603;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C8331 f52604;

    /* JADX INFO: renamed from: ᩻ۧ */
    public AbstractC17043 f52605;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "NinePatchEditor";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C10894 c10894 = new C10894(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c10894);
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC3105(2, this));
        this.f52598 = (C15360) m12277(R.id.MT_Protector);
        TabLayout tabLayout = (TabLayout) m12277(R.id.tabLayout);
        TabLayout.Tab tabNewTab = tabLayout.newTab();
        TabLayout.Tab tabNewTab2 = tabLayout.newTab();
        TabLayout.Tab tabNewTab3 = tabLayout.newTab();
        tabNewTab.setText(R.string.MT_Protector);
        tabNewTab2.setText(R.string.MT_Protector);
        tabNewTab3.setText(R.string.MT_Protector);
        tabLayout.addTab(tabNewTab);
        tabLayout.addTab(tabNewTab2);
        tabLayout.addTab(tabNewTab3);
        tabLayout.setSelectedTabIndicatorGravity(2);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C9357(this, tabNewTab, tabNewTab2, tabNewTab3));
        this.f52602 = (TextView) m12277(R.id.textView2);
        this.f52598.m34984(new C4188(this, tabLayout, tabNewTab, tabNewTab2, tabNewTab3));
        this.f52604 = ViewOnClickListenerC20541.m46366(this, new C24583(this));
        if (bundle != null) {
            try {
                if (bundle.containsKey("tmpFile")) {
                    String string = bundle.getString("file");
                    this.f52605 = string.isEmpty() ? null : C18524.m42109(string, new String[0]);
                    this.f52595 = bundle.getString("filename");
                    AbstractC17043 abstractC17043M42109 = C18524.m42109(bundle.getString("tmpFile"), new String[0]);
                    this.f52603 = abstractC17043M42109;
                    C11193 c11193 = new C11193(abstractC17043M42109.m38664());
                    this.f52598.m34982(c11193);
                    this.f52598.m34985(C14677.m33572(bundle.getByteArray(AbstractC0213e.f989m)));
                    this.f52599 = bundle.getBoolean("compiled");
                    m40060(c11193);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        AbstractC17043 abstractC17043M42105 = C18524.m42105(getIntent());
        this.f52605 = abstractC17043M42105;
        this.f52595 = abstractC17043M42105.getName();
        new C18269(this).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40061(ActivityC17598 activityC17598, String str) {
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        activityC17598.f52605 = abstractC17043M42109;
        activityC17598.f52595 = abstractC17043M42109.getName();
        activityC17598.m40066(false);
        activityC17598.m40072();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m40060(C11193 c11193) {
        Bitmap bitmapM25834 = c11193.m25834();
        ((TextView) m12277(R.id.textView1)).setText((bitmapM25834.getWidth() + 2) + " x " + (bitmapM25834.getHeight() + 2) + " px");
        m40072();
        m40079();
    }

    /* JADX INFO: renamed from: ۨ */
    private void m40072() {
        this.f52596 = this.f52595;
        SpannableString spannableString = new SpannableString("*" + ((Object) this.f52596));
        this.f52600 = spannableString;
        spannableString.setSpan(new ForegroundColorSpan(C23223.f72972), 0, this.f52600.length(), 17);
        this.f13392.setSubtitle(this.f52598.m34987() ? this.f52600 : this.f52596);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ */
    public void m40079() {
        C6644 c6644 = this.f52601;
        if (c6644 == null) {
            TextView textView = this.f52602;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.MT_Protector));
            sb.append(" - ");
            sb.append(getString(this.f52599 ? R.string.MT_Protector : R.string.MT_Protector));
            textView.setText(sb.toString());
            return;
        }
        if (c6644.f17145 == c6644.f17144) {
            this.f52602.setText(R.string.MT_Protector);
            return;
        }
        this.f52602.setText((c6644.f17145 + 1) + " - " + (c6644.f17144 + 1) + " px");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f52594 = menu.findItem(R.id.MT_Protector);
        this.f52592 = menu.findItem(R.id.MT_Protector);
        this.f52593 = menu.findItem(R.id.MT_Protector);
        this.f52594.setEnabled(this.f52598.m34987());
        this.f52592.setEnabled(this.f52598.m34996());
        this.f52593.setEnabled(this.f52598.m34992());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f52598.m34994();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f52598.m34989();
            return true;
        }
        if (itemId == R.id.more) {
            SubMenu subMenu = menuItem.getSubMenu();
            C12826.requireNonNull(subMenu);
            int iM34997 = this.f52598.m34997();
            if (iM34997 == 0) {
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
            if (iM34997 == 1) {
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                if (this.f52598.m35000()) {
                    subMenu.findItem(R.id.MT_Protector).setVisible(false);
                    subMenu.findItem(R.id.MT_Protector).setVisible(true);
                    return true;
                }
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
            if (iM34997 == 2) {
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                C19611 c19611 = new C19611(this, this);
                c19611.m33344(R.string.MT_Protector);
                c19611.m33356();
                c19611.m33338(true);
                c19611.m33360(false);
                c19611.m33363("INTERNAL:NinePatchRegion");
                c19611.m33329();
                c19611.m33331(C13076.m29939(6.0f));
                c19611.m33373(Integer.MAX_VALUE);
                c19611.m33330();
                c19611.m33336((CharSequence) this.f52598.m34993());
                c19611.m33352(true);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                SubMenu subMenu2 = menuItem.getSubMenu();
                C12826.requireNonNull(subMenu2);
                if (this.f52599) {
                    subMenu2.findItem(R.id.MT_Protector).setChecked(true);
                    return true;
                }
                subMenu2.findItem(R.id.MT_Protector).setChecked(true);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                if (this.f52599) {
                    this.f52599 = false;
                    this.f52598.m34991(true);
                    menuItem.setChecked(true);
                    m40079();
                    return true;
                }
            } else if (itemId == R.id.MT_Protector) {
                if (!this.f52599) {
                    this.f52599 = true;
                    this.f52598.m34991(true);
                    menuItem.setChecked(true);
                    m40079();
                    return true;
                }
            } else {
                if (itemId == R.id.MT_Protector) {
                    this.f52598.m34986(false);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f52598.m34986(true);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f52598.m34979();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f52598.m34988();
                    return true;
                }
                if (itemId != R.id.MT_Protector) {
                    if (itemId != R.id.MT_Protector) {
                        if (itemId == R.id.MT_Protector) {
                            new C18940(this).m22250();
                            return true;
                        }
                        if (itemId != R.id.MT_Protector) {
                            return false;
                        }
                        getOnBackPressedDispatcher().m30941();
                        return true;
                    }
                    AbstractC17043 abstractC17043M42105 = this.f52605;
                    if (abstractC17043M42105 == null) {
                        abstractC17043M42105 = C18524.m42105(getIntent());
                    }
                    String strM38669 = abstractC17043M42105.m38669();
                    C8331 c8331 = this.f52604;
                    c8331.getClass();
                    C8331.m19220(c8331, R.string.MT_Protector, strM38669, this.f52595, new String[]{"9.png"}, 16);
                    return true;
                }
                if (this.f52597.m24761()) {
                    m40066(false);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m40066(boolean z) {
        if (this.f52605 == null) {
            C8331 c8331 = this.f52604;
            c8331.getClass();
            C8331.m19220(c8331, R.string.MT_Protector, C18524.m42105(getIntent()).m38669(), this.f52595, new String[]{"9.png"}, 16);
        } else if (this.f52599) {
            new C16257(this, z).m22250();
        } else {
            new C8882(this, z).m22250();
        }
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        getOnBackPressedDispatcher().m30941();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC17043 abstractC17043 = this.f52603;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AbstractC17043 abstractC17043 = this.f52603;
        if (abstractC17043 != null) {
            bundle.putString("tmpFile", abstractC17043.mo25505());
            C11996 c11996 = new C11996();
            this.f52598.m34983(c11996);
            bundle.putByteArray(AbstractC0213e.f989m, c11996.m27447());
            bundle.putBoolean("compiled", this.f52599);
            AbstractC17043 abstractC17044 = this.f52605;
            bundle.putString("file", abstractC17044 == null ? "" : abstractC17044.mo25505());
            bundle.putString("filename", this.f52595);
        }
    }
}
