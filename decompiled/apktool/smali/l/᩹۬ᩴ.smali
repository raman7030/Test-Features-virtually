.class public final synthetic Ll/᩹۬ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static a([Ljava/lang/Object;II)Ll/᩺۫ᩴ;
    .locals 2

    .line 177
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    array-length v0, v0

    invoke-static {v0, p1, p2}, Ll/᩹۫ᩴ;->a(III)V

    .line 178
    new-instance v0, Ll/᩺۫ᩴ;

    const/16 v1, 0x410

    invoke-direct {v0, p0, p1, p2, v1}, Ll/᩺۫ᩴ;-><init>([Ljava/lang/Object;III)V

    return-object v0
.end method

.method public static stream([I)Ll/ۧ᩺ᩴ;
    .locals 3

    .line 5671
    array-length v0, p0

    const/16 v1, 0x410

    const/4 v2, 0x0

    .line 5540
    invoke-static {p0, v2, v0, v1}, Ll/᩹۫ᩴ;->spliterator([IIII)Ll/ᩴ۫ᩴ;

    move-result-object p0

    .line 5690
    invoke-static {p0}, Ll/ܳ᩺ᩴ;->a(Ll/ᩴ۫ᩴ;)Ll/ۢܳ᩵;

    move-result-object p0

    return-object p0
.end method

.method public static stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;
    .locals 2

    const/4 v0, 0x0

    .line 5638
    array-length v1, p0

    invoke-static {p0, v0, v1}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;II)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static stream([Ljava/lang/Object;II)Ll/ܿ᩺ᩴ;
    .locals 0

    .line 5658
    invoke-static {p0, p1, p2}, Ll/᩹۬ᩴ;->a([Ljava/lang/Object;II)Ll/᩺۫ᩴ;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method
