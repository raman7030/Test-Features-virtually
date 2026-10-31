.class public final synthetic Ll/᩻ۙۜ;
.super Ljava/lang/Object;
.source "M74S"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ۗܺ᩷;

.field public final synthetic ᩶:Landroid/widget/TextView;

.field public final synthetic ᩸:Ll/ᩴۙۜ;

.field public final synthetic ᩹:Ll/ۚۖۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۙۜ;Ll/ۚۖۡ;Landroid/widget/TextView;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۙۜ;->᩸:Ll/ᩴۙۜ;

    iput-object p2, p0, Ll/᩻ۙۜ;->᩹:Ll/ۚۖۡ;

    iput-object p3, p0, Ll/᩻ۙۜ;->᩶:Landroid/widget/TextView;

    iput-object p4, p0, Ll/᩻ۙۜ;->ۙ:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 82
    iget-object v0, p0, Ll/᩻ۙۜ;->᩹:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ۙۜ;->᩸:Ll/ᩴۙۜ;

    invoke-virtual {v1, v0}, Ll/ᩴۙۜ;->ۧ(Ljava/lang/String;)Ll/ܳۙۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۙۜ;->ܽ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    .line 83
    iget-object v1, p0, Ll/᩻ۙۜ;->ۙ:Ll/ۗܺ᩷;

    if-nez v0, :cond_0

    const v0, 0x7f1206aa

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 84
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const v0, 0x7f1209ee

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 83
    :goto_0
    iget-object v1, p0, Ll/᩻ۙۜ;->᩶:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
