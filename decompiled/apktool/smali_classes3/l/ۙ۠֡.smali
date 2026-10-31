.class public final Ll/ۙ۠֡;
.super Ll/᩸۠֡;
.source "A4J0"


# static fields
.field public static ۙ:Ll/֡ۛۡ;


# instance fields
.field public ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 45
    new-instance v0, Ll/֡ۛۡ;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/ۙ۠֡;->ۙ:Ll/֡ۛۡ;

    return-void
.end method

.method public static ֫(ILl/᩸֫ۚ;)Ll/ۙ۠֡;
    .locals 2

    .line 48
    sget-object v0, Ll/ۙ۠֡;->ۙ:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ۠֡;

    if-eqz v0, :cond_0

    .line 50
    iput p0, v0, Ll/۠ܶ֡;->᩸:I

    .line 51
    invoke-interface {p1}, Ll/᩸֫ۚ;->getLineNumber()I

    move-result p0

    iput p0, v0, Ll/ۙ۠֡;->᩶:I

    goto :goto_0

    .line 53
    :cond_0
    new-instance v0, Ll/ۙ۠֡;

    const/4 v1, -0x2

    .line 69
    invoke-direct {v0, p0, v1}, Ll/᩸۠֡;-><init>(II)V

    .line 70
    invoke-interface {p1}, Ll/᩸֫ۚ;->getLineNumber()I

    move-result p0

    iput p0, v0, Ll/ۙ۠֡;->᩶:I

    .line 55
    :goto_0
    instance-of p0, p1, Ll/ۚ۟֡;

    if-eqz p0, :cond_1

    .line 56
    check-cast p1, Ll/ۚ۟֡;

    invoke-virtual {p1}, Ll/ۚ۟֡;->ܿ()V

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)Z
    .locals 3

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    const-string v2, ".line "

    .line 116
    invoke-virtual {p1, v2, v0, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 76
    iget v0, p0, Ll/ۙ۠֡;->᩶:I

    invoke-virtual {p1, v0}, Ll/ۗ᩵ۚ;->ܽ(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ܿ()V
    .locals 1

    .line 63
    sget-object v0, Ll/ۙ۠֡;->ۙ:Ll/֡ۛۡ;

    invoke-virtual {v0, p0}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method
