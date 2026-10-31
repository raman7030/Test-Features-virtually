.class public final Ll/ۢۛ;
.super Ljava/lang/Object;
.source "JB1Y"

# interfaces
.implements Ll/᩷ۛ;


# instance fields
.field public ֫:Landroid/content/ClipData;

.field public ۧ:Landroid/os/Bundle;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:Landroid/net/Uri;


# virtual methods
.method public final build()Ll/ۘۛ;
    .locals 2

    .line 656
    new-instance v0, Ll/ۘۛ;

    new-instance v1, Ll/ۖۛ;

    invoke-direct {v1, p0}, Ll/ۖۛ;-><init>(Ll/ۢۛ;)V

    invoke-direct {v0, v1}, Ll/ۘۛ;-><init>(Ll/ܺۛ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 640
    iput p1, p0, Ll/ۢۛ;->ܽ:I

    return-void
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 0

    .line 645
    iput-object p1, p0, Ll/ۢۛ;->ᩳ:Landroid/net/Uri;

    return-void
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 0

    .line 650
    iput-object p1, p0, Ll/ۢۛ;->ۧ:Landroid/os/Bundle;

    return-void
.end method
