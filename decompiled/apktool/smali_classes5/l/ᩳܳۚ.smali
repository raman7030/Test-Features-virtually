.class public final Ll/ᩳܳۚ;
.super Ll/֨۬֡;
.source "P2S7"


# instance fields
.field public ᩸:Ll/᩹ܽۚ;

.field public final synthetic ᩹:Ll/ۢܳۚ;


# direct methods
.method public constructor <init>(Ll/ۢܳۚ;Ll/᩹ܽۚ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    iput-object p1, p0, Ll/ᩳܳۚ;->᩹:Ll/ۢܳۚ;

    .line 166
    iput-object p2, p0, Ll/ᩳܳۚ;->᩸:Ll/᩹ܽۚ;

    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 3

    .line 178
    iget-object v0, p0, Ll/ᩳܳۚ;->᩹:Ll/ۢܳۚ;

    iget-object v0, v0, Ll/ۢܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֫()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳܳۚ;->᩸:Ll/᩹ܽۚ;

    .line 179
    invoke-interface {v1}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object v1

    .line 78
    new-instance v2, Ll/ۡ᩻ۚ;

    invoke-direct {v2, v1, v0}, Ll/ۡ᩻ۚ;-><init>(Ljava/util/Set;Ll/ᩳ᩻ۚ;)V

    return-object v2
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 172
    iget-object v0, p0, Ll/ᩳܳۚ;->᩹:Ll/ۢܳۚ;

    iget-object v0, v0, Ll/ۢܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳܳۚ;->᩸:Ll/᩹ܽۚ;

    invoke-interface {v1}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
