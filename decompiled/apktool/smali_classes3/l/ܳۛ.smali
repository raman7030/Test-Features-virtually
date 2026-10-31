.class public final Ll/ܳۛ;
.super Ljava/lang/Object;
.source "JB1Y"


# instance fields
.field public final ֫:Ll/᩷ۛ;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 2

    .line 514
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 515
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 516
    new-instance v0, Ll/ۜۛ;

    invoke-direct {v0, p1, p2}, Ll/ۜۛ;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, Ll/ܳۛ;->֫:Ll/᩷ۛ;

    return-void

    .line 518
    :cond_0
    new-instance v0, Ll/ۢۛ;

    .line 615
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 616
    iput-object p1, v0, Ll/ۢۛ;->֫:Landroid/content/ClipData;

    .line 617
    iput p2, v0, Ll/ۢۛ;->ܿ:I

    .line 518
    iput-object v0, p0, Ll/ܳۛ;->֫:Ll/᩷ۛ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۘۛ;
    .locals 1

    .line 589
    iget-object v0, p0, Ll/ܳۛ;->֫:Ll/᩷ۛ;

    invoke-interface {v0}, Ll/᩷ۛ;->build()Ll/ۘۛ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 555
    iget-object v0, p0, Ll/ܳۛ;->֫:Ll/᩷ۛ;

    invoke-interface {v0, p1}, Ll/᩷ۛ;->֫(I)V

    return-void
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 1

    .line 568
    iget-object v0, p0, Ll/ܳۛ;->֫:Ll/᩷ۛ;

    invoke-interface {v0, p1}, Ll/᩷ۛ;->֫(Landroid/net/Uri;)V

    return-void
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 1

    .line 580
    iget-object v0, p0, Ll/ܳۛ;->֫:Ll/᩷ۛ;

    invoke-interface {v0, p1}, Ll/᩷ۛ;->֫(Landroid/os/Bundle;)V

    return-void
.end method
