.class public final synthetic Ll/֫ܶܽ;
.super Ljava/lang/Object;
.source "Q151"

# interfaces
.implements Ll/ܿܶܽ;
.implements Ll/֨۟ᩳ;
.implements Ll/ᩴܺܳ;
.implements Ll/ۖۛۡ;
.implements Ll/۠ۖ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫ܶܽ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(II)I
    .locals 2

    .line 2
    iget-object v0, p0, Ll/֫ܶܽ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܿܶܽ;

    const/16 v1, 0x1c

    if-lt p1, v1, :cond_0

    const/16 v1, 0x1f

    if-gt p1, v1, :cond_0

    .line 236
    invoke-interface {v0, p1, p2}, Ll/ܿܶܽ;->֫(II)I

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/֫ܶܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۬ܿ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public ֫(IIII)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/֫ܶܽ;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/۟۫ᩳ;

    invoke-static {p1, p2, p3, p4}, Ll/۟۫ᩳ;->ۧ(Ll/۟۫ᩳ;III)V

    return-void
.end method

.method public ֫(Ll/᩸ۖ;)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/֫ܶܽ;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ܰܰ᩷;

    invoke-static {p1}, Ll/ܰܰ᩷;->֫(Ll/ܰܰ᩷;)V

    return-void
.end method

.method public ֫(Ll/ۨ۟;ILandroid/os/Bundle;)Z
    .locals 6

    .line 2
    iget-object v0, p0, Ll/֫ܶܽ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩺ۢ;

    .line 364
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x19

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lt v1, v2, :cond_1

    and-int/2addr p2, v4

    if-eqz p2, :cond_1

    .line 367
    :try_start_0
    invoke-virtual {p1}, Ll/ۨ۟;->ᩳ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    invoke-virtual {p1}, Ll/ۨ۟;->ܿ()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Parcelable;

    if-nez p3, :cond_0

    .line 380
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p3, v1

    :goto_0
    const-string v1, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 381
    invoke-virtual {p3, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_1

    :catch_0
    return v3

    .line 383
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    invoke-virtual {p1}, Ll/ۨ۟;->ۧ()Landroid/content/ClipDescription;

    move-result-object v1

    new-instance v2, Landroid/content/ClipData$Item;

    .line 384
    invoke-virtual {p1}, Ll/ۨ۟;->֫()Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v2, v5}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-direct {p2, v1, v2}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 385
    new-instance v1, Ll/ܳۛ;

    const/4 v2, 0x2

    invoke-direct {v1, p2, v2}, Ll/ܳۛ;-><init>(Landroid/content/ClipData;I)V

    .line 386
    invoke-virtual {p1}, Ll/ۨ۟;->ܽ()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ܳۛ;->֫(Landroid/net/Uri;)V

    .line 387
    invoke-virtual {v1, p3}, Ll/ܳۛ;->֫(Landroid/os/Bundle;)V

    .line 388
    invoke-virtual {v1}, Ll/ܳۛ;->֫()Ll/ۘۛ;

    move-result-object p1

    .line 389
    invoke-static {v0, p1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ۘۛ;)Ll/ۘۛ;

    move-result-object p1

    if-nez p1, :cond_2

    return v4

    :cond_2
    return v3
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/֫ܶܽ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 791
    invoke-static {v0, p1}, Ll/᩵ܺܳ;->ܿ(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method
