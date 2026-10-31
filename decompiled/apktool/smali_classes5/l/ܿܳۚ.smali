.class public final Ll/ܿܳۚ;
.super Ll/۠۬֡;
.source "P2S7"


# instance fields
.field public ᩸:Ll/᩶ܽۚ;

.field public final synthetic ᩹:Ll/ۢܳۚ;


# direct methods
.method public constructor <init>(Ll/ۢܳۚ;Ll/᩶ܽۚ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    iput-object p1, p0, Ll/ܿܳۚ;->᩹:Ll/ۢܳۚ;

    .line 151
    iput-object p2, p0, Ll/ܿܳۚ;->᩸:Ll/᩶ܽۚ;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/util/List;
    .locals 3

    .line 157
    iget-object v0, p0, Ll/ܿܳۚ;->᩹:Ll/ۢܳۚ;

    iget-object v0, v0, Ll/ۢܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ܳ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ܿܳۚ;->᩸:Ll/᩶ܽۚ;

    invoke-interface {v1}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object v1

    .line 110
    new-instance v2, Ll/ܺ᩻ۚ;

    invoke-direct {v2, v0, v1}, Ll/ܺ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ljava/util/List;)V

    return-object v2
.end method
