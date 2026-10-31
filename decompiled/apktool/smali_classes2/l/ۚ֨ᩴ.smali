.class public final synthetic Ll/ۚ֨ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static lines(Ljava/io/BufferedReader;)Ll/ܿ᩺ᩴ;
    .locals 1

    .line 566
    new-instance v0, Ll/᩸֨ᩴ;

    invoke-direct {v0, p0}, Ll/᩸֨ᩴ;-><init>(Ljava/io/BufferedReader;)V

    const/16 p0, 0x110

    .line 568
    invoke-static {v0, p0}, Ll/᩹۫ᩴ;->b(Ljava/util/Iterator;I)Ll/ܳۨᩴ;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method
