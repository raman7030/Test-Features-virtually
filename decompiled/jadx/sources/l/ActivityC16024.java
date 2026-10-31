package l;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ܺܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16024 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49427 = 0;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f49428;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f49429;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f49430;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public String f49431;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public String f49432;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C8817 f49433 = C8817.m22788();

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C13670 f49434;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public boolean f49435;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public SpannableString f49436;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C4499 f49437;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public TextView f49438;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f49439;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C6273 f49440;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f49441;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "NinePatchEditor";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C8970 c8970 = new C8970(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c8970);
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC0775(2, this));
        this.f49434 = (C13670) m10241(R.id.MT_Protector);
        TabLayout tabLayout = (TabLayout) m10241(R.id.tabLayout);
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
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C7353(this, tabNewTab, tabNewTab2, tabNewTab3));
        this.f49438 = (TextView) m10241(R.id.textView2);
        this.f49434.m32869(new C1914(this, tabLayout, tabNewTab, tabNewTab2, tabNewTab3));
        this.f49440 = ViewOnClickListenerC19121.m44072(this, new C23374(this));
        if (bundle != null) {
            try {
                if (bundle.containsKey("tmpFile")) {
                    String string = bundle.getString("file");
                    this.f49441 = string.isEmpty() ? null : C16999.m39866(string, new String[0]);
                    this.f49431 = bundle.getString("filename");
                    AbstractC15440 abstractC15440M39866 = C16999.m39866(bundle.getString("tmpFile"), new String[0]);
                    this.f49439 = abstractC15440M39866;
                    C9285 c9285 = new C9285(abstractC15440M39866.m36506());
                    this.f49434.m32867(c9285);
                    this.f49434.m32870(C12951.m31485(bundle.getByteArray(e.m)));
                    this.f49435 = bundle.getBoolean("compiled");
                    m37873(c9285);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        AbstractC15440 abstractC15440M39862 = C16999.m39862(getIntent());
        this.f49441 = abstractC15440M39862;
        this.f49431 = abstractC15440M39862.getName();
        new C16730(this).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37874(ActivityC16024 activityC16024, String str) {
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        activityC16024.f49441 = abstractC15440M39866;
        activityC16024.f49431 = abstractC15440M39866.getName();
        activityC16024.m37879(false);
        activityC16024.m37885();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m37873(C9285 c9285) {
        Bitmap bitmapM23825 = c9285.m23825();
        ((TextView) m10241(R.id.textView1)).setText((bitmapM23825.getWidth() + 2) + " x " + (bitmapM23825.getHeight() + 2) + " px");
        m37885();
        m37892();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m37885() {
        this.f49432 = this.f49431;
        SpannableString spannableString = new SpannableString("*" + ((Object) this.f49432));
        this.f49436 = spannableString;
        spannableString.setSpan(new ForegroundColorSpan(C21943.f70260), 0, this.f49436.length(), 17);
        this.f10584.setSubtitle(this.f49434.m32872() ? this.f49436 : this.f49432);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m37892() {
        C4499 c4499 = this.f49437;
        if (c4499 == null) {
            TextView textView = this.f49438;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.MT_Protector));
            sb.append(" - ");
            sb.append(getString(this.f49435 ? R.string.MT_Protector : R.string.MT_Protector));
            textView.setText(sb.toString());
            return;
        }
        if (c4499.f14318 == c4499.f14317) {
            this.f49438.setText(R.string.MT_Protector);
            return;
        }
        this.f49438.setText((c4499.f14318 + 1) + " - " + (c4499.f14317 + 1) + " px");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f49430 = menu.findItem(R.id.MT_Protector);
        this.f49428 = menu.findItem(R.id.MT_Protector);
        this.f49429 = menu.findItem(R.id.MT_Protector);
        this.f49430.setEnabled(this.f49434.m32872());
        this.f49428.setEnabled(this.f49434.m32881());
        this.f49429.setEnabled(this.f49434.m32877());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f49434.m32879();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f49434.m32874();
            return true;
        }
        if (itemId == R.id.more) {
            SubMenu subMenu = menuItem.getSubMenu();
            C11003.requireNonNull(subMenu);
            int iM32882 = this.f49434.m32882();
            if (iM32882 == 0) {
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
            if (iM32882 == 1) {
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                if (this.f49434.m32885()) {
                    subMenu.findItem(R.id.MT_Protector).setVisible(false);
                    subMenu.findItem(R.id.MT_Protector).setVisible(true);
                    return true;
                }
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
            if (iM32882 == 2) {
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                C18142 c18142 = new C18142(this, this);
                c18142.m31258(R.string.MT_Protector);
                c18142.m31270();
                c18142.m31252(true);
                c18142.m31274(false);
                c18142.m31277("INTERNAL:NinePatchRegion");
                c18142.m31243();
                c18142.m31245(C11266.m27878(6.0f));
                c18142.m31287(Integer.MAX_VALUE);
                c18142.m31244();
                c18142.m31250((CharSequence) this.f49434.m32878());
                c18142.m31266(true);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                SubMenu subMenu2 = menuItem.getSubMenu();
                C11003.requireNonNull(subMenu2);
                if (this.f49435) {
                    subMenu2.findItem(R.id.MT_Protector).setChecked(true);
                    return true;
                }
                subMenu2.findItem(R.id.MT_Protector).setChecked(true);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                if (this.f49435) {
                    this.f49435 = false;
                    this.f49434.m32876(true);
                    menuItem.setChecked(true);
                    m37892();
                    return true;
                }
            } else if (itemId == R.id.MT_Protector) {
                if (!this.f49435) {
                    this.f49435 = true;
                    this.f49434.m32876(true);
                    menuItem.setChecked(true);
                    m37892();
                    return true;
                }
            } else {
                if (itemId == R.id.MT_Protector) {
                    this.f49434.m32871(false);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f49434.m32871(true);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f49434.m32864();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f49434.m32873();
                    return true;
                }
                if (itemId != R.id.MT_Protector) {
                    if (itemId != R.id.MT_Protector) {
                        if (itemId == R.id.MT_Protector) {
                            new C17436(this).m20274();
                            return true;
                        }
                        if (itemId != R.id.MT_Protector) {
                            return false;
                        }
                        getOnBackPressedDispatcher().m28892();
                        return true;
                    }
                    AbstractC15440 abstractC15440M39862 = this.f49441;
                    if (abstractC15440M39862 == null) {
                        abstractC15440M39862 = C16999.m39862(getIntent());
                    }
                    String strM36511 = abstractC15440M39862.m36511();
                    C6273 c6273 = this.f49440;
                    c6273.getClass();
                    C6273.m17282(c6273, R.string.MT_Protector, strM36511, this.f49431, new String[]{"9.png"}, 16);
                    return true;
                }
                if (this.f49433.m22791()) {
                    m37879(false);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m37879(boolean z) {
        if (this.f49441 == null) {
            C6273 c6273 = this.f49440;
            c6273.getClass();
            C6273.m17282(c6273, R.string.MT_Protector, C16999.m39862(getIntent()).m36511(), this.f49431, new String[]{"9.png"}, 16);
        } else if (this.f49435) {
            new C14613(this, z).m20274();
        } else {
            new C6853(this, z).m20274();
        }
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        getOnBackPressedDispatcher().m28892();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC15440 abstractC15440 = this.f49439;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AbstractC15440 abstractC15440 = this.f49439;
        if (abstractC15440 != null) {
            bundle.putString("tmpFile", abstractC15440.mo23554());
            C10130 c10130 = new C10130();
            this.f49434.m32868(c10130);
            bundle.putByteArray(e.m, c10130.m25427());
            bundle.putBoolean("compiled", this.f49435);
            AbstractC15440 abstractC15441 = this.f49441;
            bundle.putString("file", abstractC15441 == null ? "" : abstractC15441.mo23554());
            bundle.putString("filename", this.f49431);
        }
    }
}
