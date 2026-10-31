.class public final Ll/ۢ᩻ۚ;
.super Ll/᩶۬֡;
.source "C2RY"


# instance fields
.field public final synthetic ᩸:Ll/ۤܽۚ;

.field public final synthetic ᩹:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;Ll/ۤܽۚ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 284
    iput-object p1, p0, Ll/ۢ᩻ۚ;->᩹:Ll/ܽܳۚ;

    iput-object p2, p0, Ll/ۢ᩻ۚ;->᩸:Ll/ۤܽۚ;

    return-void
.end method


# virtual methods
.method public final getValue()Ll/ۚܽۚ;
    .locals 2

    .line 288
    iget-object v0, p0, Ll/ۢ᩻ۚ;->᩹:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۖ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۢ᩻ۚ;->᩸:Ll/ۤܽۚ;

    check-cast v1, Ll/֫ᩳۚ;

    invoke-interface {v1}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܽۚ;

    return-object v0
.end method
