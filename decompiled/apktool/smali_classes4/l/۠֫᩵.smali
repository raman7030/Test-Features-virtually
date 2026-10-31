.class public abstract Ll/۠֫᩵;
.super Ll/ۨ֫᩵;
.source "N673"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 683
    const-class v0, Ll/ۨ֫᩵;

    return-void
.end method


# virtual methods
.method public final p0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final unordered()Ll/۫ۨᩴ;
    .locals 2

    .line 513
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    iget v1, p0, Ll/۫᩺ᩴ;->m:I

    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 153
    :cond_0
    new-instance v0, Ll/᩸ܰᩴ;

    sget v1, Ll/۟۟ᩴ;->r:I

    .line 94
    invoke-direct {v0, p0, v1}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-object v0
.end method
