package p067l;

import android.net.Uri;

/* JADX INFO: renamed from: l.᩺֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8RT */
/* JADX INFO: loaded from: classes.dex */
public final class C23925 implements InterfaceC10770 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC16716 f75932;

    /* JADX INFO: renamed from: ۜ */
    public long f75933;

    /* JADX INFO: renamed from: ۡ */
    public C11915 f75934;

    /* JADX INFO: renamed from: ۢ */
    public boolean f75935;

    /* JADX INFO: renamed from: ۧ */
    public final C7832 f75936;

    /* JADX INFO: renamed from: ܳ */
    public long f75937;

    /* JADX INFO: renamed from: ܽ */
    public C12123 f75938;

    /* JADX INFO: renamed from: ܿ */
    public float f75939;

    /* JADX INFO: renamed from: ᩳ */
    public long f75940;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC12878 f75941;

    /* JADX INFO: renamed from: ᩻ */
    public float f75942;

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC10770 mo24809(InterfaceC12878 interfaceC12878) {
        m52995(interfaceC12878);
        return this;
    }

    public C23925(InterfaceC16716 interfaceC16716, InterfaceC21775 interfaceC21775) {
        this.f75932 = interfaceC16716;
        C11915 c11915 = new C11915();
        this.f75934 = c11915;
        C7832 c7832 = new C7832(interfaceC21775, c11915);
        this.f75936 = c7832;
        c7832.m18096(interfaceC16716);
        this.f75933 = -9223372036854775807L;
        this.f75937 = -9223372036854775807L;
        this.f75940 = -9223372036854775807L;
        this.f75942 = -3.4028235E38f;
        this.f75939 = -3.4028235E38f;
        this.f75935 = true;
    }

    @Override // p067l.InterfaceC10770
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24810(boolean z) {
        this.f75935 = z;
        this.f75936.m18097(z);
        return this;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24808(C11915 c11915) {
        this.f75934 = c11915;
        this.f75936.m18094(c11915);
        return this;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24807() {
        this.f75936.m18093();
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52995(InterfaceC12878 interfaceC12878) {
        C23877.m52955(interfaceC12878, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f75941 = interfaceC12878;
        this.f75936.m18095(interfaceC12878);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52994(C12123 c12123) {
        this.f75938 = c12123;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6076 mo24806(C13010 c13010) {
        InterfaceC10770 interfaceC10770M18092;
        C12123 c12123;
        C13660 c13660 = c13010.f36611;
        C8295 c8295 = c13010.f36609;
        c13660.getClass();
        C13660 c13661 = c13010.f36611;
        Uri uri = c13661.f38436;
        String str = c13661.f38433;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (C12826.equals(str, "application/x-image-uri")) {
            String str2 = C5792.f14228;
            throw null;
        }
        int iM12982 = C5792.m12982(c13661.f38436, str);
        long j = c13661.f38431;
        C7832 c7832 = this.f75936;
        if (j != -9223372036854775807L) {
            c7832.m18098();
        }
        if (iM12982 == 2 && (c12123 = this.f75938) != null) {
            InterfaceC12878 interfaceC12878 = this.f75941;
            if (interfaceC12878 != null) {
                interfaceC10770M18092 = c12123;
                c12123.m28020(interfaceC12878);
                interfaceC10770M18092 = c12123;
            }
        } else {
            try {
                interfaceC10770M18092 = c7832.m18092(iM12982);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        interfaceC10770M18092 = c12123;
        C12319 c12319M19111 = c8295.m19111();
        if (c8295.f21968 == -9223372036854775807L) {
            c12319M19111.m28394(this.f75933);
        }
        if (c8295.f21969 == -3.4028235E38f) {
            c12319M19111.m28392(this.f75942);
        }
        if (c8295.f21966 == -3.4028235E38f) {
            c12319M19111.m28390(this.f75939);
        }
        if (c8295.f21967 == -9223372036854775807L) {
            c12319M19111.m28393(this.f75937);
        }
        if (c8295.f21965 == -9223372036854775807L) {
            c12319M19111.m28391(this.f75940);
        }
        C8295 c8295M28389 = c12319M19111.m28389();
        if (!c8295M28389.equals(c8295)) {
            C23718 c23718M29828 = c13010.m29828();
            c23718M29828.m52740(c8295M28389);
            c13010 = c23718M29828.m52735();
        }
        C13660 c13662 = c13010.f36611;
        InterfaceC6076 interfaceC6076Mo24806 = interfaceC10770M18092.mo24806(c13010);
        AbstractC16192 abstractC16192 = c13662.f38434;
        if (!abstractC16192.isEmpty()) {
            InterfaceC6076[] interfaceC6076Arr = new InterfaceC6076[abstractC16192.size() + 1];
            interfaceC6076Arr[0] = interfaceC6076Mo24806;
            for (int i = 0; i < abstractC16192.size(); i++) {
                boolean z = this.f75935;
                InterfaceC16716 interfaceC16716 = this.f75932;
                if (z) {
                    C3601 c3601 = new C3601();
                    c3601.m6697(((C4292) abstractC16192.get(i)).f9538);
                    c3601.m6703(((C4292) abstractC16192.get(i)).f9536);
                    c3601.m6698(((C4292) abstractC16192.get(i)).f9535);
                    c3601.m6686(((C4292) abstractC16192.get(i)).f9537);
                    c3601.m6705(((C4292) abstractC16192.get(i)).f9534);
                    c3601.m6701(((C4292) abstractC16192.get(i)).f9533);
                    C10307 c10307M6672 = c3601.m6672();
                    C16289 c16289 = new C16289(interfaceC16716, new C8590(this, c10307M6672));
                    if (this.f75934.mo20731(c10307M6672)) {
                        C3601 c3601M23918 = c10307M6672.m23918();
                        c3601M23918.m6697("application/x-media3-cues");
                        c3601M23918.m6677(c10307M6672.f28528);
                        c3601M23918.m6696(this.f75934.mo20732(c10307M6672));
                        c10307M6672 = c3601M23918.m6672();
                    }
                    c16289.m37082(c10307M6672);
                    InterfaceC12878 interfaceC12879 = this.f75941;
                    if (interfaceC12879 != null) {
                        c16289.m37083(interfaceC12879);
                    }
                    String string = ((C4292) abstractC16192.get(i)).f9539.toString();
                    C23718 c23718 = new C23718();
                    c23718.m52742(string);
                    interfaceC6076Arr[i + 1] = c16289.mo24806(c23718.m52735());
                } else {
                    C21655 c21655 = new C21655(interfaceC16716);
                    InterfaceC12878 interfaceC128710 = this.f75941;
                    if (interfaceC128710 != null) {
                        c21655.m48867(interfaceC128710);
                    }
                    interfaceC6076Arr[i + 1] = c21655.m48866((C4292) abstractC16192.get(i));
                }
            }
            interfaceC6076Mo24806 = new C5405(interfaceC6076Arr);
        }
        C5613 c5613 = c13010.f36608;
        boolean z2 = c5613.f18088;
        long j2 = c5613.f18086;
        long j3 = c5613.f18089;
        if (j3 == 0 && j2 == Long.MIN_VALUE && !z2) {
            return interfaceC6076Mo24806;
        }
        C19902 c19902 = new C19902(interfaceC6076Mo24806);
        c19902.m45206(j3);
        c19902.m45204(j2);
        c19902.m45208(!c5613.f18087);
        c19902.m45205(c5613.f18090);
        c19902.m45209(z2);
        c19902.m45207(c5613.f18085);
        return c19902.m45203();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ InterfaceC3669[] m52993(C23925 c23925, C10307 c10307) {
        InterfaceC3669 c13197;
        if (c23925.f75934.mo20731(c10307)) {
            c13197 = new C18361(c23925.f75934.mo20733(c10307));
        } else {
            c13197 = new C13197(c10307);
        }
        return new InterfaceC3669[]{c13197};
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC10770 m52992(Class cls, InterfaceC16716 interfaceC16716) {
        try {
            return (InterfaceC10770) cls.getConstructor(InterfaceC16716.class).newInstance(interfaceC16716);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
