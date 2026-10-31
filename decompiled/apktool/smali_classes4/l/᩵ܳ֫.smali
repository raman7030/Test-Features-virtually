.class public final Ll/᩵ܳ֫;
.super Ljava/lang/Object;
.source "RB93"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/ۙ᩷֫;

.field public final synthetic ᩸:Ll/ۙ᩷֫;

.field public final synthetic ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۙ᩷֫;Ll/ۙ᩷֫;ZLl/ۖ᩵;)V
    .locals 0

    .line 530
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܳ֫;->᩶:Ll/ۙ᩷֫;

    iput-object p2, p0, Ll/᩵ܳ֫;->᩸:Ll/ۙ᩷֫;

    iput-boolean p3, p0, Ll/᩵ܳ֫;->᩹:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 533
    iget-object v0, p0, Ll/᩵ܳ֫;->᩶:Ll/ۙ᩷֫;

    .line 534
    invoke-virtual {v0}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v0

    iget-object v1, p0, Ll/᩵ܳ֫;->᩸:Ll/ۙ᩷֫;

    invoke-virtual {v1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v1

    .line 533
    sget-object v2, Ll/ᩳ᩷֫;->֫:Ll/ܺ᩷֫;

    .line 93
    iget-boolean v2, p0, Ll/᩵ܳ֫;->᩹:Z

    if-eqz v2, :cond_0

    .line 94
    invoke-virtual {v1}, Ll/ۡ᩻֫;->getEnterTransitionCallback()Ll/᩻ۙ;

    return-void

    .line 95
    :cond_0
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getEnterTransitionCallback()Ll/᩻ۙ;

    return-void
.end method
