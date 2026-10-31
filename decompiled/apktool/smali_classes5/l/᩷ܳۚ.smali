.class public final Ll/᩷ܳۚ;
.super Ll/ۤ۬֡;
.source "P2S7"


# instance fields
.field public final synthetic ᩸:Ll/ۢܳۚ;

.field public ᩹:Ll/ܳᩳۚ;


# direct methods
.method public constructor <init>(Ll/ۢܳۚ;Ll/ܳᩳۚ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Ll/᩷ܳۚ;->᩸:Ll/ۢܳۚ;

    .line 91
    iput-object p2, p0, Ll/᩷ܳۚ;->᩹:Ll/ܳᩳۚ;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 2

    .line 97
    iget-object v0, p0, Ll/᩷ܳۚ;->᩸:Ll/ۢܳۚ;

    iget-object v0, v0, Ll/ۢܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/᩷ܳۚ;->᩹:Ll/ܳᩳۚ;

    invoke-interface {v1}, Ll/ܳᩳۚ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
