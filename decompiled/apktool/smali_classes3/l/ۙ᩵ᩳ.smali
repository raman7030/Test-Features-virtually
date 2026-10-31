.class public final synthetic Ll/ۙ᩵ᩳ;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ll/᩸ۜ᩵;


# instance fields
.field public final synthetic ᩸:Ll/ۨ᩵ᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ᩵ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ᩵ᩳ;->᩸:Ll/ۨ᩵ᩳ;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 510
    iget-object v0, p0, Ll/ۙ᩵ᩳ;->᩸:Ll/ۨ᩵ᩳ;

    iget-object v1, v0, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ܰۘᩳ;->ܳ()Ll/ۗ᩻᩵;

    move-result-object v1

    :goto_0
    new-instance v2, Ll/᩸᩵ᩳ;

    invoke-direct {v2, v0}, Ll/᩸᩵ᩳ;-><init>(Ll/ۨ᩵ᩳ;)V

    .line 511
    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/᩹᩵ᩳ;

    invoke-direct {v1, p1}, Ll/᩹᩵ᩳ;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/ܶۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1
.end method
