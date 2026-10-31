.class public final synthetic Ll/ۛܶۡ;
.super Ljava/lang/Object;
.source "V4WQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Runnable;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/۟ܶۡ;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܶۡ;Ll/ۗܺ᩷;ILjava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛܶۡ;->᩸:Ll/۟ܶۡ;

    iput-object p2, p0, Ll/ۛܶۡ;->᩹:Ll/ۗܺ᩷;

    iput p3, p0, Ll/ۛܶۡ;->᩶:I

    iput-object p4, p0, Ll/ۛܶۡ;->ۙ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 93
    iget-object v0, p0, Ll/ۛܶۡ;->᩸:Ll/۟ܶۡ;

    iget-boolean v1, v0, Ll/۟ܶۡ;->ܿ:Z

    if-eqz v1, :cond_0

    .line 94
    new-instance v1, Ll/۬۬ܿ;

    iget-object v2, p0, Ll/ۛܶۡ;->᩹:Ll/ۗܺ᩷;

    iget v3, p0, Ll/ۛܶۡ;->᩶:I

    invoke-direct {v1, v2, v3}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v1}, Ll/۬۬ܿ;->ܳ()V

    iput-object v1, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    .line 95
    iget-object v0, p0, Ll/ۛܶۡ;->ۙ:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 96
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
