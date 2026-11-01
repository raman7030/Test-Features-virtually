package p067l;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes.dex */
public class C20318 extends AbstractC23000 {

    /* JADX INFO: renamed from: ֡ */
    public C17674 f62757;

    /* JADX INFO: renamed from: ۖ */
    public C16963 f62758;

    /* JADX INFO: renamed from: ۘ */
    public int f62759;

    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC4935 f62760;

    /* JADX INFO: renamed from: ۜ */
    public C4895 f62761;

    /* JADX INFO: renamed from: ۡ */
    public ForegroundColorSpan f62762;

    /* JADX INFO: renamed from: ۢ */
    public ForegroundColorSpan f62763;

    /* JADX INFO: renamed from: ܺ */
    public Map f62764;

    /* JADX INFO: renamed from: ᩴ */
    public int f62765;

    /* JADX INFO: renamed from: ᩵ */
    public int f62766;

    /* JADX INFO: renamed from: ᩷ */
    public C6236 f62767;

    /* JADX INFO: renamed from: ᩻ */
    public C14281 f62768;

    static {
        ApplicationC14266.m56479(140);
    }

    public native C20318(Context context, C14281 c14281, Map map);

    @Override // p067l.AbstractC23000
    /* JADX INFO: renamed from: ֫ */
    public final void mo12318(C14146 c14146, CharSequence charSequence) {
        Runnable runnable;
        String string = ((SpannableString) charSequence).toString();
        int i = this.f62766;
        if (i == 1) {
            c14146.m32500().replace(this.f62765, this.f62759, string);
            c14146.mo27941(string.length() + this.f62765);
            int i2 = this.f62767.f15745;
            if (i2 != 1 && i2 != 2) {
                return;
            }
            m51384();
            runnable = new Runnable() { // from class: l.֨ܽܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7205.m51387();
                }
            };
        } else {
            if (i != 2) {
                return;
            }
            if (string.endsWith(":")) {
                c14146.m32500().replace(this.f62765, this.f62759, string);
                c14146.mo27941(string.length() + this.f62765);
            } else {
                c14146.m32500().replace(this.f62765, this.f62759, string.concat("=\"\""));
                c14146.mo27941(string.length() + this.f62765 + 2);
            }
            m51384();
            runnable = new Runnable() { // from class: l.֨ܽܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7205.m51387();
                }
            };
        }
        C7050.m16212(runnable);
    }

    @Override // p067l.AbstractC23000
    /* JADX INFO: renamed from: ֫ */
    public final C16963 mo12315(int i, CharSequence charSequence) {
        C20358.m45950(charSequence, i, this.f62760);
        C16963 c16963 = this.f62758;
        if (c16963.isEmpty()) {
            return null;
        }
        c16963.m38551(this.f62765);
        return c16963;
    }
}
