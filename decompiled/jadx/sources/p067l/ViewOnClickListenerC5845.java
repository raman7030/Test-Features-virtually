package p067l;

import android.R;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۘۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5845 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f14340;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ KeyEvent.Callback f14341;

    public /* synthetic */ ViewOnClickListenerC5845(KeyEvent.Callback callback, int i) {
        this.f14340 = i;
        this.f14341 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f14340;
        KeyEvent.Callback callback = this.f14341;
        switch (i) {
            case 0:
                ActivityC16573 activityC16573 = (ActivityC16573) callback;
                int i2 = ActivityC16573.f48667;
                C20671 c20671BuildDialog = activityC16573.buildDialog();
                c20671BuildDialog.m46718(activityC16573.getTitle());
                TextView textView = (TextView) c20671BuildDialog.m46732().m3846(R.id.message);
                C21272.m48055(textView);
                textView.setOnClickListener(new ViewOnClickListenerC22284());
                break;
            default:
                ((SearchView) callback).lambda$setupWithSearchBar$7(view);
                break;
        }
    }
}
