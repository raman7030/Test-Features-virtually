package l;

import android.R;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۘۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3658 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11534;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f11535;

    public /* synthetic */ ViewOnClickListenerC3658(KeyEvent.Callback callback, int i) {
        this.f11534 = i;
        this.f11535 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f11534;
        KeyEvent.Callback callback = this.f11535;
        switch (i) {
            case 0:
                ActivityC14946 activityC14946 = (ActivityC14946) callback;
                int i2 = ActivityC14946.f45553;
                C19258 c19258BuildDialog = activityC14946.buildDialog();
                c19258BuildDialog.m44424(activityC14946.getTitle());
                TextView textView = (TextView) c19258BuildDialog.m44438().m1433(R.id.message);
                C19890.m45744(textView);
                textView.setOnClickListener(new ViewOnClickListenerC20955());
                break;
            default:
                ((SearchView) callback).lambda$setupWithSearchBar$7(view);
                break;
        }
    }
}
