.class public final Ll/۫۠֡;
.super Ll/᩸۠֡;
.source "865M"


# instance fields
.field public final ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILl/ۙ֫ۚ;)V
    .locals 1

    const/4 v0, -0x3

    .line 48
    invoke-direct {p0, p1, v0}, Ll/᩸۠֡;-><init>(II)V

    .line 49
    invoke-interface {p2}, Ll/ۙ֫ۚ;->ۜ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۫۠֡;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)Z
    .locals 4

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x7

    const-string v1, ".source"

    const/4 v2, 0x0

    .line 116
    invoke-virtual {p1, v1, v2, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 56
    iget-object v0, p0, Ll/۫۠֡;->᩶:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, " \""

    const/4 v3, 0x2

    .line 116
    invoke-virtual {p1, v1, v2, v3}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 58
    invoke-static {p1, v0}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V

    const/16 v0, 0x22

    .line 59
    invoke-virtual {p1, v0}, Ll/ۗ᩵ۚ;->write(I)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
