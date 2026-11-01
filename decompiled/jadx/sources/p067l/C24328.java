package p067l;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes.dex */
public final class C24328 extends C15610 {

    /* JADX INFO: renamed from: ۧ */
    public volatile C24368 f77085;

    /* JADX INFO: renamed from: ܽ */
    public volatile C23028 f77086;

    /* JADX INFO: renamed from: ֫ */
    public final void m53688(C24368 c24368) {
        Set setM4709;
        this.f77085 = c24368;
        C24368 c24369 = this.f77085;
        C4252 c4252 = this.f44690.f24253;
        InterfaceC12970 interfaceC12970 = this.f44690.f24246;
        if (Build.VERSION.SDK_INT >= 34) {
            setM4709 = C21017.m47377();
        } else {
            setM4709 = C2910.m4709();
        }
        this.f77086 = new C23028(c24369, c4252, interfaceC12970, setM4709);
        this.f44690.m20674();
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m53686(CharSequence charSequence, int i, int i2, boolean z) {
        return this.f77086.m51414(charSequence, i, i2, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53687(EditorInfo editorInfo) {
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f77085.m53721());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
