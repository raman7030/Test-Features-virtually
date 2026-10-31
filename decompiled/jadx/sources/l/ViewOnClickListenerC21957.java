package l;

import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: l.᩹֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC21957 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) ActivityC3339.class));
    }
}
