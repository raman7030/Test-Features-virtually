.class public final Ll/ۙܶܿ;
.super Ll/᩷᩵ܿ;
.source "49SV"


# instance fields
.field public final synthetic ܽ:Ll/۬ܶܿ;


# direct methods
.method public constructor <init>(Ll/۬ܶܿ;Ll/۬ܶܿ;Ll/ۜ᩵ܿ;)V
    .locals 0

    .line 202
    iput-object p1, p0, Ll/ۙܶܿ;->ܽ:Ll/۬ܶܿ;

    invoke-direct {p0, p2, p3}, Ll/᩷᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۜ᩵ܿ;)V

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 213
    iget-object v0, p0, Ll/ۙܶܿ;->ܽ:Ll/۬ܶܿ;

    invoke-virtual {v0, p1}, Ll/۬ܶܿ;->֫(I)Z

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 205
    iget-object v0, p0, Ll/ۙܶܿ;->ܽ:Ll/۬ܶܿ;

    invoke-virtual {v0}, Ll/۬ܶܿ;->ۡܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 208
    invoke-static {v0}, Ll/۬ܶܿ;->ܽ(Ll/۬ܶܿ;)Ll/ۗܶܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۗܶܿ;->ۧ(Ll/ۗܶܿ;)I

    move-result v0

    return v0

    .line 206
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "load mt extras failed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
