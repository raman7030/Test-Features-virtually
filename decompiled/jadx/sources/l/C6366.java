package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6366 extends AbstractC22967 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f19696;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f19697;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12011 f19698;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f19699;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC22967 f19700;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f19701;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11679 f19702;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10600 f19703;

    public C6366(C12011 c12011, AbstractC22967 abstractC22967, C11679 c11679, File file, C10600 c10600) {
        this.f19698 = c12011;
        this.f19700 = abstractC22967;
        this.f19702 = c11679;
        this.f19701 = file;
        this.f19703 = c10600;
        this.f19697 = abstractC22967.mo6180();
        this.f19696 = abstractC22967.mo6177();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩻ */
    public final String mo6180() {
        return this.f19697;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6177() {
        return this.f19696;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final File mo17660() {
        return this.f19701;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo6178() throws IOException {
        C12011 c12011 = this.f19698;
        c12011.m29376();
        if (!this.f19699 && !c12011.f35964) {
            File file = this.f19701;
            return file == null ? this.f19700.mo6178() : new FileInputStream(file);
        }
        throw new IOException("Prepared image source is closed");
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩵ */
    public final C11679 mo6179() throws IOException {
        C12011 c12011 = this.f19698;
        c12011.m29376();
        if (!this.f19699 && !c12011.f35964) {
            C10600 c10600 = this.f19703;
            C11679 c11679 = this.f19702;
            if (c10600 == null) {
                this.f19700.m51108(c11679);
            }
            return c11679;
        }
        throw new IOException("Prepared image source is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C12011 c12011 = this.f19698;
        c12011.m29376();
        if (this.f19699) {
            return;
        }
        this.f19699 = true;
        C10600 c10600 = this.f19703;
        if (c10600 != null) {
            c10600.f31814 = true;
            c12011.m29372();
        }
    }
}
