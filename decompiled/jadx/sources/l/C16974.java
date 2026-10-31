package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܽ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7QW */
/* JADX INFO: loaded from: classes4.dex */
public class C16974 extends C2158 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f52085;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f52086;

    public C16974(Writer writer, char[] cArr) {
        super(writer);
        this.f52086 = cArr;
    }

    @Override // l.C2158
    /* JADX INFO: renamed from: ۧ */
    public void mo7119() throws IOException {
        this.f52085++;
        this.f7148.write(91);
        m39808();
    }

    @Override // l.C2158
    /* JADX INFO: renamed from: ֫ */
    public void mo7117() throws IOException {
        this.f52085--;
        m39808();
        this.f7148.write(93);
    }

    @Override // l.C2158
    /* JADX INFO: renamed from: ܽ */
    public void mo7122() throws IOException {
        this.f7148.write(44);
        if (m39808()) {
            return;
        }
        this.f7148.write(32);
    }

    @Override // l.C2158
    /* JADX INFO: renamed from: ܳ */
    public void mo7121() throws IOException {
        this.f52085++;
        this.f7148.write(123);
        m39808();
    }

    @Override // l.C2158
    /* JADX INFO: renamed from: ܿ */
    public void mo7124() throws IOException {
        this.f52085--;
        m39808();
        this.f7148.write(q.h);
    }

    @Override // l.C2158
    /* JADX INFO: renamed from: ᩳ */
    public void mo7126() throws IOException {
        this.f7148.write(58);
        this.f7148.write(32);
    }

    @Override // l.C2158
    /* JADX INFO: renamed from: ᩻ */
    public void mo7128() throws IOException {
        this.f7148.write(44);
        if (m39808()) {
            return;
        }
        this.f7148.write(32);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m39808() throws IOException {
        if (this.f52086 == null) {
            return false;
        }
        this.f7148.write(10);
        for (int i = 0; i < this.f52085; i++) {
            this.f7148.write(this.f52086);
        }
        return true;
    }
}
