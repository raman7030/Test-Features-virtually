package p067l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8683 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public String f23491;

    /* JADX INFO: renamed from: ۧ */
    public List f23492;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C6001 f23493;

    public C8683(C6001 c6001) {
        this.f23493 = c6001;
        this.f23492 = c6001.f15046;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        Drawable drawable;
        ViewOnClickListenerC4660 viewOnClickListenerC4660 = (ViewOnClickListenerC4660) abstractC5462;
        C10695 c10695 = (C10695) this.f23492.get(i);
        viewOnClickListenerC4660.f10476 = c10695;
        viewOnClickListenerC4660.f10474.setText(c10695.f29640);
        ImageView imageView = viewOnClickListenerC4660.f10477;
        Drawable drawable2 = c10695.f29638;
        if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
            return;
        }
        String strM10965 = c10695.f29635.m10965();
        synchronized (C6001.f15039) {
            drawable = (Drawable) C6001.f15039.m6785(strM10965);
            c10695.f29638 = drawable;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        imageView.setTag(c10695.f29635);
        RunnableC11366 runnableC11366 = c10695.f29637;
        if (runnableC11366.f31738) {
            return;
        }
        runnableC11366.f31738 = true;
        runnableC11366.f31739 = imageView;
        C4081.f8987.execute(runnableC11366);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20114(String str) {
        this.f23491 = str;
        m20113();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20113() {
        String str = this.f23491;
        C6001 c6001 = this.f23493;
        if (str == null || str.isEmpty()) {
            this.f23492 = c6001.f15046;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C10695 c10695 : (ArrayList) c6001.f15046) {
            if (C11567.m26630((CharSequence) c10695.f29640, (CharSequence) str)) {
                arrayList.add(c10695);
            } else {
                C5134 c5134 = c10695.f29635;
                if (c5134 != null && C11567.m26630((CharSequence) c5134.m10964(), (CharSequence) str)) {
                    arrayList.add(c10695);
                }
            }
        }
        this.f23492 = arrayList;
        notifyDataSetChanged();
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C6001 c6001 = this.f23493;
        return new ViewOnClickListenerC4660(c6001, LayoutInflater.from(c6001.f15040).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f23492.size();
    }
}
