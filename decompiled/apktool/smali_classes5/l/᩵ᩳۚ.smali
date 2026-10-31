.class public final Ll/᩵ᩳۚ;
.super Ll/ۢᩳۚ;
.source "04RH"

# interfaces
.implements Ll/ۙ֫ۚ;
.implements Ll/֨֫ۚ;


# instance fields
.field public ᩶:Ll/۟ۢۚ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Ll/ۢᩳۚ;-><init>(I)V

    .line 22
    iput-object p2, p0, Ll/᩵ᩳۚ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩵ᩳۚ;->᩹:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ᩳۚ;->᩶:Ll/۟ۢۚ;

    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩵ᩳۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ll/ܶܽۚ;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/᩵ᩳۚ;->᩶:Ll/۟ۢۚ;

    if-eqz v0, :cond_0

    return-object v0

    .line 46
    :cond_0
    iget-object v0, p0, Ll/᩵ᩳۚ;->᩹:Ljava/lang/String;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v0, Ll/ᩴᩳۚ;

    invoke-direct {v0, p0}, Ll/ᩴᩳۚ;-><init>(Ll/᩵ᩳۚ;)V

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method
