.class public final Ll/ۗ۫֡;
.super Ll/ۛ۬֡;
.source "G5OY"

# interfaces
.implements Ll/ۙ֫ۚ;
.implements Ll/֨֫ۚ;


# instance fields
.field public ᩹:Ll/ܶܽۚ;


# direct methods
.method public constructor <init>(Ll/ܶܽۚ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ll/ۛ۬֡;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ۗ۫֡;->᩹:Ll/ܶܽۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ۗ۫֡;->᩹:Ll/ܶܽۚ;

    if-eqz v0, :cond_0

    .line 71
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->ۧ(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ۫֡;->᩹:Ll/ܶܽۚ;

    :cond_0
    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۗ۫֡;->᩹:Ll/ܶܽۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ܶܽۚ;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ۗ۫֡;->᩹:Ll/ܶܽۚ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method
