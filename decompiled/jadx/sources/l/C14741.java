package l;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14741 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f45018;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bundle f45019;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4656 f45020;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f45021;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f45022;

    public C14741(C4656 c4656, SpannableStringBuilder spannableStringBuilder) {
        Bundle bundle = new Bundle();
        this.f45018 = true;
        this.f45022 = true;
        this.f45020 = c4656;
        this.f45021 = C21093.m47990(spannableStringBuilder);
        this.f45019 = bundle;
        this.f45018 = true;
        this.f45022 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23914 m35044() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        return new C23914(this.f45020, this.f45021, null, this.f45019, arrayList2.isEmpty() ? null : (C17815[]) arrayList2.toArray(new C17815[arrayList2.size()]), arrayList.isEmpty() ? null : (C17815[]) arrayList.toArray(new C17815[arrayList.size()]), this.f45018, this.f45022);
    }
}
