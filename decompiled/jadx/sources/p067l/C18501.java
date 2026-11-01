package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܽ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7QW */
/* JADX INFO: loaded from: classes4.dex */
public class C18501 extends C4420 {

    /* JADX INFO: renamed from: ۡ */
    public int f55265;

    /* JADX INFO: renamed from: ܺ */
    public final char[] f55266;

    public C18501(Writer writer, char[] cArr) {
        super(writer);
        this.f55266 = cArr;
    }

    @Override // p067l.C4420
    /* JADX INFO: renamed from: ۧ */
    public void mo9214() throws IOException {
        this.f55265++;
        this.f9934.write(91);
        m42051();
    }

    @Override // p067l.C4420
    /* JADX INFO: renamed from: ֫ */
    public void mo9212() throws IOException {
        this.f55265--;
        m42051();
        this.f9934.write(93);
    }

    @Override // p067l.C4420
    /* JADX INFO: renamed from: ܽ */
    public void mo9217() throws IOException {
        this.f9934.write(44);
        if (m42051()) {
            return;
        }
        this.f9934.write(32);
    }

    @Override // p067l.C4420
    /* JADX INFO: renamed from: ܳ */
    public void mo9216() throws IOException {
        this.f55265++;
        this.f9934.write(123);
        m42051();
    }

    @Override // p067l.C4420
    /* JADX INFO: renamed from: ܿ */
    public void mo9219() throws IOException {
        this.f55265--;
        m42051();
        this.f9934.write(C0254q.f1218h);
    }

    @Override // p067l.C4420
    /* JADX INFO: renamed from: ᩳ */
    public void mo9221() throws IOException {
        this.f9934.write(58);
        this.f9934.write(32);
    }

    @Override // p067l.C4420
    /* JADX INFO: renamed from: ᩻ */
    public void mo9223() throws IOException {
        this.f9934.write(44);
        if (m42051()) {
            return;
        }
        this.f9934.write(32);
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m42051() throws IOException {
        if (this.f55266 == null) {
            return false;
        }
        this.f9934.write(10);
        for (int i = 0; i < this.f55265; i++) {
            this.f9934.write(this.f55266);
        }
        return true;
    }
}
