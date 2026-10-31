.class public final synthetic Ll/᩺ܶۡ;
.super Ljava/lang/Object;
.source "V4WQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Runnable;

.field public final synthetic ᩶:Ll/ۗܺ᩷;

.field public final synthetic ᩸:Ll/۟ܶۡ;

.field public final synthetic ᩹:Ll/ۡ᩹ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܶۡ;Ll/ۡ᩹ۡ;Ll/ۗܺ᩷;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ܶۡ;->᩸:Ll/۟ܶۡ;

    iput-object p2, p0, Ll/᩺ܶۡ;->᩹:Ll/ۡ᩹ۡ;

    iput-object p3, p0, Ll/᩺ܶۡ;->᩶:Ll/ۗܺ᩷;

    iput-object p4, p0, Ll/᩺ܶۡ;->ۙ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 79
    iget-object v0, p0, Ll/᩺ܶۡ;->᩸:Ll/۟ܶۡ;

    iget-boolean v1, v0, Ll/۟ܶۡ;->ܿ:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/᩺ܶۡ;->᩹:Ll/ۡ᩹ۡ;

    invoke-virtual {v1}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 80
    new-instance v1, Ll/۬۬ܿ;

    iget-object v2, p0, Ll/᩺ܶۡ;->᩶:Ll/ۗܺ᩷;

    const v3, 0x7f120528

    invoke-direct {v1, v2, v3}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v1}, Ll/۬۬ܿ;->ܳ()V

    iput-object v1, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    .line 81
    iget-object v0, p0, Ll/᩺ܶۡ;->ۙ:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
