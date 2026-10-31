.class public Ll/᩺ۗۡ;
.super Ll/ܺ۬֡;
.source "V1UK"


# instance fields
.field public ᩸:Ll/ᩴܽۚ;

.field public final ᩹:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;Ll/ᩴܽۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/᩺ۗۡ;->᩹:Ll/ܽܳۚ;

    .line 18
    iput-object p2, p0, Ll/᩺ۗۡ;->᩸:Ll/ᩴܽۚ;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩺ۗۡ;->᩸:Ll/ᩴܽۚ;

    invoke-interface {v0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 36
    iget-object v0, p0, Ll/᩺ۗۡ;->᩹:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ۗۡ;->᩸:Ll/ᩴܽۚ;

    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 24
    iget-object v0, p0, Ll/᩺ۗۡ;->᩹:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ۗۡ;->᩸:Ll/ᩴܽۚ;

    invoke-interface {v1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
