.class public final Ll/۬۠֡;
.super Ll/᩸۠֡;
.source "64JO"


# instance fields
.field public final ۙ:Ll/᩶֫ۚ;

.field public final ᩶:Ll/ܶܶ֡;


# direct methods
.method public constructor <init>(ILl/ܶܶ֡;Ll/᩶֫ۚ;)V
    .locals 1

    const/4 v0, -0x1

    .line 50
    invoke-direct {p0, p1, v0}, Ll/᩸۠֡;-><init>(II)V

    .line 51
    iput-object p3, p0, Ll/۬۠֡;->ۙ:Ll/᩶֫ۚ;

    .line 52
    iput-object p2, p0, Ll/۬۠֡;->᩶:Ll/ܶܶ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)Z
    .locals 6

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xf

    const-string v1, ".restart local "

    const/4 v2, 0x0

    .line 116
    invoke-virtual {p1, v1, v2, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 58
    iget-object v0, p0, Ll/۬۠֡;->ۙ:Ll/᩶֫ۚ;

    invoke-interface {v0}, Ll/᩶֫ۚ;->֫()I

    move-result v1

    iget-object v3, p0, Ll/۬۠֡;->᩶:Ll/ܶܶ֡;

    invoke-virtual {v3, p1, v1}, Ll/ܶܶ֡;->֫(Ll/ۗ᩵ۚ;I)V

    .line 60
    invoke-interface {v0}, Ll/᩹֫ۚ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-interface {v0}, Ll/᩹֫ۚ;->getType()Ljava/lang/String;

    move-result-object v3

    .line 62
    invoke-interface {v0}, Ll/᩹֫ۚ;->getSignature()Ljava/lang/String;

    move-result-object v0

    if-nez v1, :cond_0

    if-nez v3, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    const-string v4, "  # "

    const/4 v5, 0x4

    .line 116
    invoke-virtual {p1, v4, v2, v5}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 65
    invoke-static {p1, v1, v3, v0}, Ll/ۗ۠֡;->֫(Ll/ۗ᩵ۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
