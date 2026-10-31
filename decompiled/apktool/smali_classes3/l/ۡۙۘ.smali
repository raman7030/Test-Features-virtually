.class public final Ll/ۡۙۘ;
.super Ljava/lang/Object;
.source "T91K"

# interfaces
.implements Ll/ۙ᩶ۘ;


# instance fields
.field public final synthetic ֫:Ll/᩸ۙۘ;


# direct methods
.method public constructor <init>(Ll/᩸ۙۘ;)V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۙۘ;->֫:Ll/᩸ۙۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 2

    .line 211
    check-cast p2, Ll/۬ۚ֡;

    .line 215
    invoke-virtual {p2}, Ll/۬ۚ֡;->᩷()Ljava/lang/String;

    move-result-object p2

    .line 217
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ᩳۙۘ;->ۧ(Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Ll/ۡۙۘ;->֫:Ll/᩸ۙۘ;

    invoke-static {v0}, Ll/᩸ۙۘ;->֫(Ll/᩸ۙۘ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 222
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 223
    invoke-static {v0}, Ll/᩸ۙۘ;->֫(Ll/᩸ۙۘ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶۙۘ;

    .line 224
    invoke-interface {p2}, Ll/ܶۙۘ;->֫()V

    goto :goto_0

    :cond_0
    return-void
.end method
