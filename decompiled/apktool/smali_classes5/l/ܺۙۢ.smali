.class public final Ll/ܺۙۢ;
.super Ll/֫ܳ֡;
.source "K6OY"


# instance fields
.field public ܿ:I


# virtual methods
.method public final ᩳ(I)Ll/֡ܳ֡;
    .locals 1

    .line 66
    iget v0, p0, Ll/ܺۙۢ;->ܿ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܺۙۢ;->ܿ:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 67
    :cond_0
    invoke-super {p0, p1}, Ll/֫ܳ֡;->ᩳ(I)Ll/֡ܳ֡;

    move-result-object p1

    return-object p1
.end method
