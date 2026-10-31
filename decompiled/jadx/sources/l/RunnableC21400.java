package l;

import bin.mt.plus.R;
import com.google.android.material.search.SearchBar;

/* JADX INFO: renamed from: l.᩸ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21400 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68900;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f68901;

    public /* synthetic */ RunnableC21400(int i, Object obj) {
        this.f68900 = i;
        this.f68901 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68900) {
            case 0:
                ((C12392) this.f68901).m30171();
                break;
            case 1:
                ((C7263) this.f68901).m19486(false);
                break;
            case 2:
                ((C14134) this.f68901).m33740();
                break;
            case 3:
                DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) this.f68901;
                if (dialogInterfaceC0206.m1442()) {
                    dialogInterfaceC0206.dismiss();
                }
                break;
            case 4:
                DialogInterfaceOnClickListenerC10816.m27036(R.string.MT_Protector, (AbstractActivityC3346) this.f68901, "def_sign_key_warn");
                break;
            default:
                ((SearchBar) this.f68901).lambda$startOnLoadAnimation$1();
                break;
        }
    }
}
