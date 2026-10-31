package com.google.android.material.tabs;

import java.lang.ref.WeakReference;
import l.AbstractC16496;
import l.AbstractC19902;
import l.AbstractC2968;
import l.C2386;

/* JADX INFO: loaded from: classes.dex */
public final class TabLayoutMediator {
    public AbstractC19902 adapter;
    public boolean attached;
    public final boolean autoRefresh;
    public TabLayoutOnPageChangeCallback onPageChangeCallback;
    public TabLayout.OnTabSelectedListener onTabSelectedListener;
    public AbstractC2968 pagerAdapterObserver;
    public final boolean smoothScroll;
    public final TabConfigurationStrategy tabConfigurationStrategy;
    public final TabLayout tabLayout;
    public final C2386 viewPager;

    public interface TabConfigurationStrategy {
        void onConfigureTab(TabLayout.Tab tab, int i);
    }

    public TabLayoutMediator(TabLayout tabLayout, C2386 c2386, TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, c2386, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(TabLayout tabLayout, C2386 c2386, boolean z, TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, c2386, z, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(TabLayout tabLayout, C2386 c2386, boolean z, boolean z2, TabConfigurationStrategy tabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.viewPager = c2386;
        this.autoRefresh = z;
        this.smoothScroll = z2;
        this.tabConfigurationStrategy = tabConfigurationStrategy;
    }

    public void attach() {
        if (this.attached) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        AbstractC19902 abstractC19902M7715 = this.viewPager.m7715();
        this.adapter = abstractC19902M7715;
        if (abstractC19902M7715 == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.attached = true;
        TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new TabLayoutOnPageChangeCallback(this.tabLayout);
        this.onPageChangeCallback = tabLayoutOnPageChangeCallback;
        this.viewPager.m7717(tabLayoutOnPageChangeCallback);
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(this.viewPager, this.smoothScroll);
        this.onTabSelectedListener = viewPagerOnTabSelectedListener;
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) viewPagerOnTabSelectedListener);
        if (this.autoRefresh) {
            PagerAdapterObserver pagerAdapterObserver = new PagerAdapterObserver();
            this.pagerAdapterObserver = pagerAdapterObserver;
            this.adapter.registerAdapterDataObserver(pagerAdapterObserver);
        }
        populateTabsFromPagerAdapter();
        this.tabLayout.setScrollPosition(this.viewPager.m7718(), 0.0f, true);
    }

    public void detach() {
        AbstractC19902 abstractC19902;
        if (this.autoRefresh && (abstractC19902 = this.adapter) != null) {
            abstractC19902.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.m7720(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    public void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        AbstractC19902 abstractC19902 = this.adapter;
        if (abstractC19902 != null) {
            int itemCount = abstractC19902.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(tabNewTab, i);
                this.tabLayout.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.viewPager.m7718(), this.tabLayout.getTabCount() - 1);
                if (iMin != this.tabLayout.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.tabLayout;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    public class TabLayoutOnPageChangeCallback extends AbstractC16496 {
        public int previousScrollState;
        public int scrollState;
        public final WeakReference tabLayoutRef;

        public TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference(tabLayout);
            reset();
        }

        @Override // l.AbstractC16496
        public void onPageScrollStateChanged(int i) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i;
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // l.AbstractC16496
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i3 = this.scrollState;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.previousScrollState == 1, (i3 == 2 && this.previousScrollState == 0) ? false : true, false);
            }
        }

        @Override // l.AbstractC16496
        public void onPageSelected(int i) {
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.scrollState;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.previousScrollState == 0));
        }

        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    public class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        public final boolean smoothScroll;
        public final C2386 viewPager;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ViewPagerOnTabSelectedListener(C2386 c2386, boolean z) {
            this.viewPager = c2386;
            this.smoothScroll = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            this.viewPager.m7716(tab.getPosition(), this.smoothScroll);
        }
    }

    public class PagerAdapterObserver extends AbstractC2968 {
        public PagerAdapterObserver() {
        }

        @Override // l.AbstractC2968
        public void onChanged() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC2968
        public void onItemRangeChanged(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC2968
        public void onItemRangeChanged(int i, int i2, Object obj) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC2968
        public void onItemRangeInserted(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC2968
        public void onItemRangeRemoved(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // l.AbstractC2968
        public void onItemRangeMoved(int i, int i2, int i3) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }
}
