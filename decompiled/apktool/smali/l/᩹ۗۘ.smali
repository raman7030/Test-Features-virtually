.class public final Ll/᩹ۗۘ;
.super Ljava/lang/Object;
.source "690O"

# interfaces
.implements Ll/ۙ᩶ۘ;


# instance fields
.field public final synthetic ֫:Ll/۫ۗۘ;


# direct methods
.method public constructor <init>(Ll/۫ۗۘ;)V
    .locals 0

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۗۘ;->֫:Ll/۫ۗۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 7

    .line 156
    check-cast p2, Ll/᩸ᩴ֡;

    .line 160
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    .line 162
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ۧ(Ll/֡ۚ֡;)V

    .line 164
    iget-object v1, p0, Ll/᩹ۗۘ;->֫:Ll/۫ۗۘ;

    invoke-static {v1}, Ll/۫ۗۘ;->֫(Ll/۫ۗۘ;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x2

    if-nez v2, :cond_0

    .line 165
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v1, v2}, Ll/۫ۗۘ;->֫(Ll/۫ۗۘ;Ljava/util/ArrayList;)V

    .line 168
    :cond_0
    invoke-static {v1}, Ll/۫ۗۘ;->֫(Ll/۫ۗۘ;)Ljava/util/List;

    move-result-object v2

    new-instance v4, Ll/ܰۗۘ;

    .line 169
    invoke-virtual {p2}, Ll/᩸ᩴ֡;->᩷()Ll/ܶᩴ֡;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 227
    sget-object v6, Ll/᩸ۗۘ;->֫:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_1

    if-eq v5, v3, :cond_3

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x0

    .line 170
    :cond_3
    :goto_1
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ᩳۙۘ;->ۧ(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-direct {v4, v3, p1}, Ll/ܰۗۘ;-><init>(ILjava/lang/CharSequence;)V

    .line 168
    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    invoke-virtual {p2}, Ll/᩸ᩴ֡;->ۢ()Z

    move-result p1

    invoke-static {v1, p1}, Ll/۫ۗۘ;->֫(Ll/۫ۗۘ;Z)V

    return-void
.end method
