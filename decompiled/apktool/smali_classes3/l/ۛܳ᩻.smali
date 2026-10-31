.class public final Ll/ۛܳ᩻;
.super Ll/֡ۘ֡;
.source "FAG9"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 11
    invoke-direct {p0}, Ll/֡ۘ֡;-><init>()V

    .line 13
    invoke-virtual {p0}, Ll/֡ۘ֡;->᩶()V

    .line 16
    sget v0, Ll/ܿ᩸ۡ;->֫:I

    invoke-virtual {p0, v0}, Ll/֡ۘ֡;->ܽ(I)V

    .line 22
    invoke-virtual {p0, v0}, Ll/֡ۘ֡;->֫(I)V

    const-wide/16 v0, 0x2

    .line 26
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofMinutes(J)Ll/ۖ᩹ᩴ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֡ۘ֡;->֫(Ll/ۖ᩹ᩴ;)V

    const-wide/16 v0, 0x1

    .line 30
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofMinutes(J)Ll/ۖ᩹ᩴ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֡ۘ֡;->ۧ(Ll/ۖ᩹ᩴ;)V

    const-wide/16 v0, 0x1e

    .line 33
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofSeconds(J)Ll/ۖ᩹ᩴ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֡ۘ֡;->ܽ(Ll/ۖ᩹ᩴ;)V

    .line 34
    invoke-virtual {p0}, Ll/֡ۘ֡;->ۤ()V

    .line 37
    invoke-virtual {p0}, Ll/֡ۘ֡;->ۗ()V

    return-void
.end method
