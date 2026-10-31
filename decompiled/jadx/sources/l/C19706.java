package l;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩵᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C5S0 */
/* JADX INFO: loaded from: classes5.dex */
public class C19706 extends ComponentCallbacksC9205 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f63658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public View f63659;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f63661;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ListView f63663;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f63664;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Handler f63665 = new Handler();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f63660 = new RunnableC4183(this);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AdapterView.OnItemClickListener f63662 = new C19000(this);

    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m45398();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        this.f63665.removeCallbacks(this.f63660);
        this.f63663 = null;
        this.f63658 = false;
        this.f63659 = null;
        this.f63661 = null;
        this.f63664 = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45398() {
        if (this.f63663 != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f63663 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f63664 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f63661 = view.findViewById(16711682);
            this.f63659 = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f63663 = listView;
            View view2 = this.f63664;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f63658 = true;
        this.f63663.setOnItemClickListener(this.f63662);
        if (this.f63661 != null) {
            m45398();
            View view3 = this.f63661;
            if (view3 == null) {
                throw new IllegalStateException("Can't be used with a custom content view");
            }
            if (this.f63658) {
                this.f63658 = false;
                view3.clearAnimation();
                this.f63659.clearAnimation();
                this.f63661.setVisibility(0);
                this.f63659.setVisibility(8);
            }
        }
        this.f63665.post(this.f63660);
    }
}
