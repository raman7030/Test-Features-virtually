.class public final synthetic Ll/ۜۛۡ;
.super Ljava/lang/Object;
.source "91U1"

# interfaces
.implements Ll/۬֨ܳ;
.implements Ll/ۙ۫ۡ;
.implements Ll/۟ܶۧ;
.implements Ll/ۘ۬᩷;
.implements Ll/ۖۛۡ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜۛۡ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۜۛۡ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۧܺۡ;

    .line 90
    invoke-static {v0}, Ll/ܿܺۡ;->֫(Ll/ۧܺۡ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/֫᩸ۧ;)Ljava/lang/CharSequence;
    .locals 3

    .line 2
    iget-object p1, p0, Ll/ۜۛۡ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast p1, Ll/᩸ۙ᩷;

    .line 41
    invoke-virtual {p1}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    .line 45
    invoke-virtual {p1}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    const-string v2, "10MB"

    invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f120470

    .line 41
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫(I)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۜۛۡ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۖۛۡ;

    .line 31
    new-instance v1, Ll/᩷ۛۡ;

    invoke-direct {v1, p1, v0}, Ll/᩷ۛۡ;-><init>(ILl/ۖۛۡ;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۜۛۡ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ᩳܰۡ;

    invoke-virtual {v0, p1}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public ۧ()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۜۛۡ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ᩳ(Ll/۠֫ۢ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
