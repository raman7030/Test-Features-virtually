.class public final Ll/ܶ᩻ۚ;
.super Ll/ۙ۬֡;
.source "C2RY"


# instance fields
.field public final synthetic ᩸:Ll/ۤܽۚ;

.field public final synthetic ᩹:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;Ll/ۤܽۚ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 255
    iput-object p1, p0, Ll/ܶ᩻ۚ;->᩹:Ll/ܽܳۚ;

    iput-object p2, p0, Ll/ܶ᩻ۚ;->᩸:Ll/ۤܽۚ;

    return-void
.end method


# virtual methods
.method public final getValue()Ll/᩵ܽۚ;
    .locals 2

    .line 259
    iget-object v0, p0, Ll/ܶ᩻ۚ;->᩸:Ll/ۤܽۚ;

    check-cast v0, Ll/ۧᩳۚ;

    .line 261
    invoke-interface {v0}, Ll/ۧᩳۚ;->getValue()Ll/᩵ܽۚ;

    move-result-object v0

    .line 259
    iget-object v1, p0, Ll/ܶ᩻ۚ;->᩹:Ll/ܽܳۚ;

    invoke-static {v0, v1}, Ll/᩸᩻ۚ;->֫(Ll/᩵ܽۚ;Ll/ܽܳۚ;)Ll/ۖ۬֡;

    move-result-object v0

    return-object v0
.end method
