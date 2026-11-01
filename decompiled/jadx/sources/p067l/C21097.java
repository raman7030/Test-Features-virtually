package p067l;

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
public class C21097 extends ComponentCallbacksC11117 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f66289;

    /* JADX INFO: renamed from: ۙ */
    public View f66290;

    /* JADX INFO: renamed from: ۫ */
    public View f66292;

    /* JADX INFO: renamed from: ᩶ */
    public ListView f66294;

    /* JADX INFO: renamed from: ᩸ */
    public View f66295;

    /* JADX INFO: renamed from: ᩹ */
    public final Handler f66296 = new Handler();

    /* JADX INFO: renamed from: ۤ */
    public final Runnable f66291 = new RunnableC6344(this);

    /* JADX INFO: renamed from: ۬ */
    public final AdapterView.OnItemClickListener f66293 = new C20426(this);

    @Override // p067l.ComponentCallbacksC11117
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

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m47702();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        this.f66296.removeCallbacks(this.f66291);
        this.f66294 = null;
        this.f66289 = false;
        this.f66290 = null;
        this.f66292 = null;
        this.f66295 = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m47702() {
        if (this.f66294 != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f66294 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f66295 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f66292 = view.findViewById(16711682);
            this.f66290 = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f66294 = listView;
            View view2 = this.f66295;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f66289 = true;
        this.f66294.setOnItemClickListener(this.f66293);
        if (this.f66292 != null) {
            m47702();
            View view3 = this.f66292;
            if (view3 == null) {
                throw new IllegalStateException("Can't be used with a custom content view");
            }
            if (this.f66289) {
                this.f66289 = false;
                view3.clearAnimation();
                this.f66290.clearAnimation();
                this.f66292.setVisibility(0);
                this.f66290.setVisibility(8);
            }
        }
        this.f66296.post(this.f66291);
    }
}
