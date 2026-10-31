.class public final Ll/᩶ᩳۚ;
.super Ll/ܺ۬֡;
.source "V4KU"

# interfaces
.implements Ll/۫ᩳۚ;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩶ᩳۚ;->᩸:Ljava/lang/String;

    .line 51
    iput-object p2, p0, Ll/᩶ᩳۚ;->᩹:Ljava/lang/String;

    .line 52
    iput-object p3, p0, Ll/᩶ᩳۚ;->᩶:Ljava/lang/String;

    return-void
.end method

.method public static ۧ(Ll/ᩴܽۚ;)Ll/᩶ᩳۚ;
    .locals 3

    .line 57
    instance-of v0, p0, Ll/᩶ᩳۚ;

    if-eqz v0, :cond_0

    .line 58
    check-cast p0, Ll/᩶ᩳۚ;

    return-object p0

    .line 60
    :cond_0
    new-instance v0, Ll/᩶ᩳۚ;

    .line 61
    invoke-interface {p0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 62
    invoke-interface {p0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 63
    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Ll/᩶ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/᩶ᩳۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/᩶ᩳۚ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/᩶ᩳۚ;->᩸:Ljava/lang/String;

    return-object v0
.end method
