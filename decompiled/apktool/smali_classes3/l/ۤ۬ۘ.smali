.class public final Ll/ۤ۬ۘ;
.super Ljava/lang/Object;
.source "I8ZW"

# interfaces
.implements Ll/ۙ۬ۘ;


# instance fields
.field public final synthetic ֫:Ll/᩺۬ۘ;

.field public final synthetic ۧ:Ll/ۗ᩶ۘ;


# direct methods
.method public constructor <init>(Ll/᩺۬ۘ;Ll/ۗ᩶ۘ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ۬ۘ;->֫:Ll/᩺۬ۘ;

    iput-object p2, p0, Ll/ۤ۬ۘ;->ۧ:Ll/ۗ᩶ۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/List;)V
    .locals 4

    .line 42
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠۬ۘ;

    .line 45
    invoke-interface {v0}, Ll/ܶ۬ۘ;->isClosed()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {v0}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۤ۬ۘ;->֫:Ll/᩺۬ۘ;

    invoke-virtual {v2, v1}, Ll/᩺۬ۘ;->֫(Ljava/lang/String;)Ll/۟۬ۘ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 51
    iget-object v3, p0, Ll/ۤ۬ۘ;->ۧ:Ll/ۗ᩶ۘ;

    invoke-virtual {v1, v3, v2, v0}, Ll/۟۬ۘ;->֫(Ll/ۗ᩶ۘ;Ll/֫᩺᩵;Ll/ܶ۬ۘ;)V

    goto :goto_0

    :cond_2
    return-void
.end method
