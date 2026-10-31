.class public final Ll/ᩳܶ᩷;
.super Ll/۬ۗܿ;
.source "09LR"


# instance fields
.field public final synthetic ۟:Ll/ܺܶ᩷;


# direct methods
.method public constructor <init>(Ll/ܺܶ᩷;Ll/ܺܶ᩷;)V
    .locals 0

    .line 384
    iput-object p1, p0, Ll/ᩳܶ᩷;->۟:Ll/ܺܶ᩷;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 388
    :try_start_0
    iget-object v0, p0, Ll/ᩳܶ᩷;->۟:Ll/ܺܶ᩷;

    invoke-static {v0}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object v0

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܰ۟ۜ;->֫(Ljava/lang/String;)V

    .line 389
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const v0, 0x7f120a85

    .line 391
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
