.class public final Ll/۟ܿ;
.super Ljava/lang/Object;
.source "422Y"

# interfaces
.implements Ll/ۨᩳ;


# instance fields
.field public final synthetic ֫:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;)V
    .locals 0

    .line 3727
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܿ;->֫:Ll/ۚܳ;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/content/Context;
    .locals 1

    .line 3741
    iget-object v0, p0, Ll/۟ܿ;->֫:Ll/ۚܳ;

    invoke-virtual {v0}, Ll/ۚܳ;->ܶ()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 3761
    iget-object p1, p0, Ll/۟ܿ;->֫:Ll/ۚܳ;

    invoke-virtual {p1}, Ll/ۚܳ;->ܳ()Ll/ۤᩳ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 3763
    invoke-virtual {p1, v0}, Ll/ۤᩳ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .line 3752
    iget-object v0, p0, Ll/۟ܿ;->֫:Ll/ۚܳ;

    invoke-virtual {v0}, Ll/ۚܳ;->ܳ()Ll/ۤᩳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3754
    invoke-virtual {v0, p1}, Ll/ۤᩳ;->֫(Landroid/graphics/drawable/Drawable;)V

    .line 3755
    invoke-virtual {v0, p2}, Ll/ۤᩳ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 3746
    iget-object v0, p0, Ll/۟ܿ;->֫:Ll/ۚܳ;

    invoke-virtual {v0}, Ll/ۚܳ;->ܳ()Ll/ۤᩳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3747
    invoke-virtual {v0}, Ll/ۤᩳ;->ܽ()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 3741
    iget-object v0, p0, Ll/۟ܿ;->֫:Ll/ۚܳ;

    invoke-virtual {v0}, Ll/ۚܳ;->ܶ()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f04024e

    .line 3733
    filled-new-array {v1}, [I

    move-result-object v1

    const/4 v2, 0x0

    .line 3732
    invoke-static {v0, v2, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/᩺ۘ;

    move-result-object v0

    const/4 v1, 0x0

    .line 3734
    invoke-virtual {v0, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 3735
    invoke-virtual {v0}, Ll/᩺ۘ;->ܿ()V

    return-object v1
.end method
