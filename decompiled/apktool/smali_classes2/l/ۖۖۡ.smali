.class public final synthetic Ll/ۖۖۡ;
.super Ljava/lang/Object;
.source "W5L3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ᩴۖۡ;

.field public final synthetic ᩹:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۖۡ;Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۖۡ;->᩸:Ll/ᩴۖۡ;

    iput-object p2, p0, Ll/ۖۖۡ;->᩹:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 526
    iget-object v0, p0, Ll/ۖۖۡ;->᩸:Ll/ᩴۖۡ;

    iget-object v1, v0, Ll/ᩴۖۡ;->۟:Ll/᩵ۖۡ;

    iget-object v1, v1, Ll/᩵ۖۡ;->ۤ:Ll/ۚۖۡ;

    invoke-virtual {v1}, Ll/ۚۖۡ;->ᩳ()I

    move-result v1

    iget-object v2, p0, Ll/ۖۖۡ;->᩹:Landroid/widget/TextView;

    if-lez v1, :cond_0

    .line 528
    :try_start_0
    invoke-virtual {v0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xa

    if-gt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 530
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    const/16 v0, 0x8

    .line 537
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
