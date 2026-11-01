package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19882 extends AbstractC7141 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C9823 f60404;

    @Override // p067l.AbstractC7141
    /* JADX INFO: renamed from: ۧ */
    public final void mo16421(String str) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19882(C9823 c9823) {
        super(c9823);
        this.f60404 = c9823;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45119(List list) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            C20553 c20553 = (C20553) list.get(i);
            if (c20553.f63549.m53837(c20553.f63550)) {
                z = true;
                break;
            }
        }
        C9823 c9823 = this.f60404;
        if (c9823.f27170 != null) {
            c9823.f27170.setImageDrawable(z ? c9823.f27237 : c9823.f27193);
            c9823.f27170.setContentDescription(z ? c9823.f27240 : c9823.f27217);
        }
        this.f18647 = list;
    }

    @Override // p067l.AbstractC7141
    /* JADX INFO: renamed from: ֫ */
    public final void mo16419(C4459 c4459) {
        boolean z;
        c4459.f10014.setText(R.string.MT_Protector);
        int i = 0;
        while (true) {
            if (i >= this.f18647.size()) {
                z = true;
                break;
            }
            C20553 c20553 = (C20553) this.f18647.get(i);
            if (c20553.f63549.m53837(c20553.f63550)) {
                z = false;
                break;
            }
            i++;
        }
        c4459.f10013.setVisibility(z ? 0 : 4);
        c4459.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ۘ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9823 c9823 = this.f14248.f60404;
                if (c9823.f27181 == null || !c9823.f27181.mo6821(29)) {
                    return;
                }
                c9823.f27181.mo6801(c9823.f27181.mo6812().mo31081().mo19199(3).mo19206().mo19207().mo19208().mo19204());
                c9823.f27197.dismiss();
            }
        });
    }

    @Override // p067l.AbstractC7141, p067l.AbstractC21283
    /* JADX INFO: renamed from: ֫ */
    public final void onBindViewHolder(C4459 c4459, int i) {
        super.onBindViewHolder(c4459, i);
        if (i > 0) {
            C20553 c20553 = (C20553) this.f18647.get(i - 1);
            c4459.f10013.setVisibility(c20553.f63549.m53837(c20553.f63550) ? 0 : 4);
        }
    }
}
