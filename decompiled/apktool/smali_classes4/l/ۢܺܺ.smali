.class public final Ll/ۢܺܺ;
.super Ll/ܶܺܺ;
.source "8BD9"


# instance fields
.field public ᩶:Ll/ۡܺܺ;


# direct methods
.method public constructor <init>(Ll/᩶ܺܺ;)V
    .locals 2

    .line 38
    new-instance v0, Ll/۫ܺܺ;

    invoke-virtual {p1}, Ll/᩶ܺܺ;->ᩴ()Ll/۟ܺܺ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۫ܺܺ;-><init>(Ll/۟ܺܺ;)V

    invoke-direct {p0, v0, p1}, Ll/ܶܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    const/4 p1, 0x0

    .line 40
    iput-object p1, p0, Ll/ۢܺܺ;->᩶:Ll/ۡܺܺ;

    return-void
.end method


# virtual methods
.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 58
    invoke-virtual {p0}, Ll/ܶܺܺ;->ܳ()Ll/۫ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ll/ۡܺܺ;
    .locals 3

    .line 67
    iget-object v0, p0, Ll/ۢܺܺ;->᩶:Ll/ۡܺܺ;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Ll/ۡܺܺ;

    invoke-virtual {p0}, Ll/ܶܺܺ;->ܳ()Ll/۫ܺܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v2

    .line 47
    invoke-direct {v0, v1, v2}, Ll/ܶܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    .line 68
    iput-object v0, p0, Ll/ۢܺܺ;->᩶:Ll/ۡܺܺ;

    .line 71
    :cond_0
    iget-object v0, p0, Ll/ۢܺܺ;->᩶:Ll/ۡܺܺ;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "enum"

    return-object v0
.end method
