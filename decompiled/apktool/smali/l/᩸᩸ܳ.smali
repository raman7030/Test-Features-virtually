.class public final Ll/᩸᩸ܳ;
.super Ll/۬ۗܿ;
.source "Y4ZV"


# instance fields
.field public final synthetic ۟:Ll/ۘܶܿ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ۘܶܿ;)V
    .locals 0

    .line 304
    iput-object p2, p0, Ll/᩸᩸ܳ;->۟:Ll/ۘܶܿ;

    const/4 p2, -0x1

    .line 40
    invoke-direct {p0, p1, p2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 307
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 308
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩸᩸ܳ;->۟:Ll/ۘܶܿ;

    iget-object v2, v1, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 309
    iput-object v0, v1, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    .line 310
    invoke-static {}, Ll/ᩴܶܿ;->ۧ()V

    .line 312
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
