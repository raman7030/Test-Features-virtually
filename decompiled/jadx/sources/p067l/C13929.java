package p067l;

import bin.p000mt.plugin.api.regex.Matcher;
import bin.p000mt.plugin.api.regex.MatcherSnapshot;
import bin.p000mt.plugin.api.regex.Pattern;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAYU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13929 implements Matcher, InterfaceC23987 {

    /* JADX INFO: renamed from: ֫ */
    public final C10023 f39292;

    public C13929(C13259 c13259, CharSequence charSequence) {
        this.f39292 = new C10023(c13259, c13259.m30306(), charSequence);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m31677() {
        this.f39292.m23398();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m31676() {
        return this.f39292.m23402();
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m31674() {
        return this.f39292.m23382();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31663(long j) {
        this.f39292.m23356(j);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final Pattern pattern() {
        return this.f39292.pattern();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final C13259 pattern() {
        return this.f39292.pattern();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31665(C13259 c13259) {
        this.f39292.m23360(c13259, c13259.m30306());
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher, p067l.InterfaceC23987
    public final CharSequence getText() {
        return this.f39292.getText();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final Matcher reset() {
        this.f39292.m23401();
        return this;
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final Matcher reset(CharSequence charSequence) {
        this.f39292.m23357(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: reset, reason: collision with other method in class */
    public final void m56473reset(CharSequence charSequence) {
        this.f39292.m23357(charSequence);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final int start() {
        return this.f39292.m23381();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher, p067l.InterfaceC23987
    public final int start(int i) {
        return this.f39292.start(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31671(String str) {
        return this.f39292.m23390(str);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final int end() {
        return this.f39292.m23386();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher, p067l.InterfaceC23987
    public final int end(int i) {
        return this.f39292.end(i);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final String group() {
        return this.f39292.group(0);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher, p067l.InterfaceC23987
    public final String group(int i) {
        return this.f39292.group(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m31662(String str) {
        return this.f39292.m23375(str);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher, p067l.InterfaceC23987
    public final int groupCount() {
        return this.f39292.groupCount();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final String expandReplacement(String str) {
        C10023 c10023 = this.f39292;
        c10023.getClass();
        StringBuilder sb = new StringBuilder();
        C15269.m34742(c10023, sb, str);
        return sb.toString();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final void expandReplacementInto(StringBuilder sb, String str) {
        C10023 c10023 = this.f39292;
        c10023.getClass();
        C15269.m34742(c10023, sb, str);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean matches() {
        return this.f39292.m23351();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean find() {
        return this.f39292.m23394();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean find(int i) {
        return this.f39292.m23379(i);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean lookingAt() {
        return this.f39292.m23397();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean lookingAt(int i) {
        return this.f39292.m23389(i);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final MatcherSnapshot toSnapshot() {
        return new C11918(this);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final C11918 toSnapshot() {
        return new C11918(this);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final Matcher appendReplacement(StringBuilder sb, String str) {
        this.f39292.m23359(sb, str);
        return this;
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final StringBuilder appendTail(StringBuilder sb) {
        this.f39292.m23354(sb);
        return sb;
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final String replaceAll(String str) {
        return this.f39292.m23387(str);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final String replaceFirst(String str) {
        return this.f39292.m23393(str);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final Matcher region(int i, int i2) {
        this.f39292.m23376(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: region, reason: collision with other method in class */
    public final void m56472region(int i, int i2) {
        this.f39292.m23376(i, i2);
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final int regionStart() {
        return this.f39292.m23384();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final int regionEnd() {
        return this.f39292.m23371();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean hasTransparentBounds() {
        return this.f39292.m23367();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final Matcher useTransparentBounds(boolean z) {
        this.f39292.m23388(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean hasAnchoringBounds() {
        return this.f39292.m23373();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final Matcher useAnchoringBounds(boolean z) {
        this.f39292.m23377(z);
        return this;
    }

    public final String toString() {
        return this.f39292.toString();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean hitEnd() {
        return this.f39292.m23396();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final boolean requireEnd() {
        return this.f39292.m23400();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final Matcher setTimeoutMillis(int i) {
        this.f39292.m23392(i);
        return this;
    }

    /* JADX INFO: renamed from: setTimeoutMillis, reason: collision with other method in class */
    public final void m56474setTimeoutMillis(int i) {
        this.f39292.m23392(i);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m31669() {
        this.f39292.m23366();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31664(Runnable runnable) {
        this.f39292.m23358(runnable);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Runnable m31672() {
        return this.f39292.m23391();
    }

    @Override // p067l.InterfaceC23987
    /* JADX INFO: renamed from: ֫ */
    public final void mo23355() {
        this.f39292.mo23355();
    }

    @Override // bin.p000mt.plugin.api.regex.Matcher
    public final int getTimeoutMillis() {
        return this.f39292.m23399();
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m31668() {
        return this.f39292.m23365();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m31678() {
        return this.f39292.m23385();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m31673() {
        return this.f39292.m23372();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m31670() {
        this.f39292.m23368();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31667(int i) {
        return this.f39292.m23362(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31666(boolean z) {
        this.f39292.m23361(z);
    }

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList m31675() {
        return this.f39292.m23370();
    }
}
