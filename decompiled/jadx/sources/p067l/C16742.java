package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.ܶۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7F1 */
/* JADX INFO: loaded from: classes5.dex */
public class C16742 extends C12096 {

    /* JADX INFO: renamed from: ܶܿ */
    public C9387 f49361;

    @Override // p067l.C12096, p067l.C14146
    /* JADX INFO: renamed from: ۬ۧ */
    public final boolean mo27936() {
        return false;
    }

    public C16742(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C23929 c23929 = this.f40262;
        c23929.m53016();
        c23929.m53017(1728053247 & C23223.f72969);
    }

    public C16742(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C23929 c23929 = this.f40262;
        c23929.m53016();
        c23929.m53017(1728053247 & C23223.f72969);
    }

    @Override // p067l.C12096, p067l.C14146
    /* JADX INFO: renamed from: ܽ */
    public final void mo27940() {
        super.mo27940();
        this.f40262.m53017(1728053247 & C23223.f72969);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37986(C9387 c9387) {
        this.f49361 = c9387;
    }

    @Override // p067l.C14146, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new C3332(this, inputConnectionOnCreateInputConnection);
    }
}
