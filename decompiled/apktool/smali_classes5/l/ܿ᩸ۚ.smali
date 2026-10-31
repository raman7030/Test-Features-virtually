.class public final Ll/ܿ᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Ll/᩷᩹ۚ;-><init>()V

    .line 156
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 157
    invoke-static {p1}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩸ۚ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "[^"

    const-string v1, "]"

    .line 0
    iget-object v2, p0, Ll/ܿ᩸ۚ;->֫:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 1

    .line 162
    invoke-virtual {p2}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܺ֡ۚ;->ܽ()Ljava/util/List;

    move-result-object p1

    .line 163
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۢ֡ۚ;

    .line 164
    invoke-virtual {p2}, Ll/ۢ֡ۚ;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Ll/ܿ᩸ۚ;->֫:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
