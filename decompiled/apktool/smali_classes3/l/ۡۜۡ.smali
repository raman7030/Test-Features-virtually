.class public final Ll/ۡۜۡ;
.super Ll/ܺۜۡ;
.source "98W2"


# instance fields
.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 1

    const/16 v0, 0x8

    .line 344
    invoke-direct {p0, v0}, Ll/ܺۜۡ;-><init>(I)V

    .line 345
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۜۡ;->ᩳ:Ljava/lang/String;

    .line 346
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۜۡ;->ܽ:I

    .line 347
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۡۜۡ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡۜۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۡۜۡ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۡۜۡ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡۜۡ;->ᩳ:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 4

    .line 352
    iget v0, p0, Ll/ۡۜۡ;->ܽ:I

    iget-object v1, p0, Ll/ۡۜۡ;->ۧ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܰۜۡ;->֫(ILjava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 354
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/᩸ۜۡ;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "title"

    .line 355
    iget-object v3, p0, Ll/ۡۜۡ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "markdown"

    .line 356
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 357
    invoke-virtual {p1, v1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 360
    :cond_0
    new-instance v0, Ll/ۢۜۡ;

    invoke-direct {v0, p0, p1}, Ll/ۢۜۡ;-><init>(Ll/ۡۜۡ;Ll/ۗܺ᩷;)V

    .line 390
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
