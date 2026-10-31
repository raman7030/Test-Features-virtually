.class public abstract Ll/֡ᩴۖ;
.super Ll/᩸ᩴۖ;
.source "D9PY"

# interfaces
.implements Ll/ܺ֡ۖ;


# instance fields
.field public ۙ:Ll/᩵ۘۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 591
    invoke-direct {p0}, Ll/᩸ᩴۖ;-><init>()V

    .line 598
    invoke-static {}, Ll/᩵ۘۖ;->ۢ()Ll/᩵ۘۖ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ᩴۖ;->ۙ:Ll/᩵ۘۖ;

    return-void
.end method


# virtual methods
.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 96
    sget-object v0, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 96
    check-cast v0, Ll/᩸ᩴۖ;

    return-object v0
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 102
    sget-object v0, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 102
    check-cast v0, Ll/᩵ᩴۖ;

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 591
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->toBuilder()Ll/᩵ᩴۖ;

    const/4 v0, 0x0

    throw v0
.end method
