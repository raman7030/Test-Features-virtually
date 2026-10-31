.class public Ll/ۜ᩶ܳ;
.super Ll/ۤۜܳ;
.source "9B3J"


# instance fields
.field public ᩳ:Ll/᩶ۙܳ;


# direct methods
.method public constructor <init>(Ll/᩶ۙܳ;)V
    .locals 2

    const v0, 0x7f120900

    const v1, 0x7f080252

    .line 11
    invoke-direct {p0, v0, v1}, Ll/ۤۜܳ;-><init>(II)V

    .line 12
    iput-object p1, p0, Ll/ۜ᩶ܳ;->ᩳ:Ll/᩶ۙܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 2

    .line 17
    iget-object v0, p0, Ll/ۜ᩶ܳ;->ᩳ:Ll/᩶ۙܳ;

    invoke-interface {v0}, Ll/᩶ۙܳ;->֫()Ll/ܽۙܳ;

    move-result-object v1

    invoke-static {p1, v0, v1}, Ll/ܳۙܳ;->֫(Ll/ܽۢܳ;Ll/᩶ۙܳ;Ll/ܽۙܳ;)V

    return-void
.end method

.method public ܳ()Z
    .locals 2

    .line 22
    iget-object v0, p0, Ll/ۜ᩶ܳ;->ᩳ:Ll/᩶ۙܳ;

    invoke-interface {v0}, Ll/᩶ۙܳ;->֫()Ll/ܽۙܳ;

    move-result-object v0

    .line 880
    iget-object v1, v0, Ll/ܽۙܳ;->ᩳ:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v0, v0, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
