package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.search.SearchBar;

/* JADX INFO: renamed from: l.᩸ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC22707 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f71595;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f71596;

    public /* synthetic */ RunnableC22707(int i, Object obj) {
        this.f71595 = i;
        this.f71596 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f71595) {
            case 0:
                ((C14146) this.f71596).m32235();
                break;
            case 1:
                ((C9271) this.f71596).m21452(false);
                break;
            case 2:
                ((C15802) this.f71596).m35872();
                break;
            case 3:
                DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) this.f71596;
                if (dialogInterfaceC2564.m3855()) {
                    dialogInterfaceC2564.dismiss();
                }
                break;
            case 4:
                DialogInterfaceOnClickListenerC12648.m29081(R.string.MT_Protector, (AbstractActivityC5549) this.f71596, "def_sign_key_warn");
                break;
            default:
                ((SearchBar) this.f71596).lambda$startOnLoadAnimation$1();
                break;
        }
    }
}
