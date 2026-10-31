.class public final Ll/ۘܺܺ;
.super Ll/ܽܺܺ;
.source "WBB1"


# instance fields
.field public ۗ:Ll/᩹ܺܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Ll/ܽܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Ll/ۘܺܺ;->ۗ:Ll/᩹ܺܺ;

    return-void
.end method


# virtual methods
.method public final ۚ()Ll/᩹ܺܺ;
    .locals 3

    .line 56
    iget-object v0, p0, Ll/ۘܺܺ;->ۗ:Ll/᩹ܺܺ;

    if-nez v0, :cond_0

    .line 57
    new-instance v0, Ll/᩹ܺܺ;

    invoke-virtual {p0}, Ll/ܶܺܺ;->ܳ()Ll/۫ܺܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v2

    .line 31
    invoke-direct {v0, v1, v2}, Ll/ܽܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    .line 57
    iput-object v0, p0, Ll/ۘܺܺ;->ۗ:Ll/᩹ܺܺ;

    .line 60
    :cond_0
    iget-object v0, p0, Ll/ۘܺܺ;->ۗ:Ll/᩹ܺܺ;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "ifaceMethod"

    return-object v0
.end method
