package l;

import bin.mt.plugin.api.regex.Matcher;
import bin.mt.plugin.api.regex.MatcherSnapshot;
import bin.mt.plugin.api.regex.Pattern;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAYU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12164 implements Matcher, InterfaceC22747 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8054 f36281;

    public C12164(C11459 c11459, CharSequence charSequence) {
        this.f36281 = new C8054(c11459, c11459.m28262(), charSequence);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29612() {
        this.f36281.m21431();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m29611() {
        return this.f36281.m21435();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m29609() {
        return this.f36281.m21415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29598(long j) {
        this.f36281.m21389(j);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Pattern pattern() {
        return this.f36281.pattern();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final C11459 pattern() {
        return this.f36281.pattern();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29600(C11459 c11459) {
        this.f36281.m21393(c11459, c11459.m28262());
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC22747
    public final CharSequence getText() {
        return this.f36281.getText();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher reset() {
        this.f36281.m21434();
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher reset(CharSequence charSequence) {
        this.f36281.m21390(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: reset, reason: collision with other method in class */
    public final void m29615reset(CharSequence charSequence) {
        this.f36281.m21390(charSequence);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int start() {
        return this.f36281.m21414();
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC22747
    public final int start(int i) {
        return this.f36281.start(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29606(String str) {
        return this.f36281.m21423(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int end() {
        return this.f36281.m21419();
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC22747
    public final int end(int i) {
        return this.f36281.end(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String group() {
        return this.f36281.group(0);
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC22747
    public final String group(int i) {
        return this.f36281.group(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m29597(String str) {
        return this.f36281.m21408(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC22747
    public final int groupCount() {
        return this.f36281.groupCount();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String expandReplacement(String str) {
        C8054 c8054 = this.f36281;
        c8054.getClass();
        StringBuilder sb = new StringBuilder();
        C13574.m32630(c8054, sb, str);
        return sb.toString();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final void expandReplacementInto(StringBuilder sb, String str) {
        C8054 c8054 = this.f36281;
        c8054.getClass();
        C13574.m32630(c8054, sb, str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean matches() {
        return this.f36281.m21384();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean find() {
        return this.f36281.m21427();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean find(int i) {
        return this.f36281.m21412(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean lookingAt() {
        return this.f36281.m21430();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean lookingAt(int i) {
        return this.f36281.m21422(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final MatcherSnapshot toSnapshot() {
        return new C10048(this);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final C10048 toSnapshot() {
        return new C10048(this);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher appendReplacement(StringBuilder sb, String str) {
        this.f36281.m21392(sb, str);
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final StringBuilder appendTail(StringBuilder sb) {
        this.f36281.m21387(sb);
        return sb;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String replaceAll(String str) {
        return this.f36281.m21420(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String replaceFirst(String str) {
        return this.f36281.m21426(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher region(int i, int i2) {
        this.f36281.m21409(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: region, reason: collision with other method in class */
    public final void m29614region(int i, int i2) {
        this.f36281.m21409(i, i2);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int regionStart() {
        return this.f36281.m21417();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int regionEnd() {
        return this.f36281.m21404();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hasTransparentBounds() {
        return this.f36281.m21400();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher useTransparentBounds(boolean z) {
        this.f36281.m21421(z);
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hasAnchoringBounds() {
        return this.f36281.m21406();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher useAnchoringBounds(boolean z) {
        this.f36281.m21410(z);
        return this;
    }

    public final String toString() {
        return this.f36281.toString();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hitEnd() {
        return this.f36281.m21429();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean requireEnd() {
        return this.f36281.m21433();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher setTimeoutMillis(int i) {
        this.f36281.m21425(i);
        return this;
    }

    /* JADX INFO: renamed from: setTimeoutMillis, reason: collision with other method in class */
    public final void m29616setTimeoutMillis(int i) {
        this.f36281.m21425(i);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m29604() {
        this.f36281.m21399();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29599(Runnable runnable) {
        this.f36281.m21391(runnable);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable m29607() {
        return this.f36281.m21424();
    }

    @Override // l.InterfaceC22747
    /* JADX INFO: renamed from: ֫ */
    public final void mo21388() {
        this.f36281.mo21388();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int getTimeoutMillis() {
        return this.f36281.m21432();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m29603() {
        return this.f36281.m21398();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m29613() {
        return this.f36281.m21418();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m29608() {
        return this.f36281.m21405();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m29605() {
        this.f36281.m21401();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29602(int i) {
        return this.f36281.m21395(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29601(boolean z) {
        this.f36281.m21394(z);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList m29610() {
        return this.f36281.m21403();
    }
}
