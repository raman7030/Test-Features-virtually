.class public final Ll/ܶ۠۠;
.super Ljava/lang/Object;
.source "I5ZF"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ljava/util/function/Predicate;

.field public ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Ljava/util/function/Predicate;)V
    .locals 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ۠۠;->᩹:Ljava/util/Iterator;

    iput-object p2, p0, Ll/ܶ۠۠;->᩶:Ljava/util/function/Predicate;

    .line 101
    :cond_0
    move-object p2, p1

    check-cast p2, Ll/᩸۠۠;

    invoke-virtual {p2}, Ll/᩸۠۠;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    invoke-virtual {p2}, Ll/᩸۠۠;->next()Ljava/lang/Object;

    move-result-object p2

    .line 103
    iget-object v0, p0, Ll/ܶ۠۠;->᩶:Ljava/util/function/Predicate;

    invoke-interface {v0, p2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 99
    :goto_0
    iput-object p2, p0, Ll/ܶ۠۠;->᩸:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ܶ۠۠;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 117
    iget-object v0, p0, Ll/ܶ۠۠;->᩸:Ljava/lang/Object;

    .line 101
    :cond_0
    iget-object v1, p0, Ll/ܶ۠۠;->᩹:Ljava/util/Iterator;

    check-cast v1, Ll/᩸۠۠;

    invoke-virtual {v1}, Ll/᩸۠۠;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 102
    invoke-virtual {v1}, Ll/᩸۠۠;->next()Ljava/lang/Object;

    move-result-object v1

    .line 103
    iget-object v2, p0, Ll/ܶ۠۠;->᩶:Ljava/util/function/Predicate;

    invoke-interface {v2, v1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 118
    :goto_0
    iput-object v1, p0, Ll/ܶ۠۠;->᩸:Ljava/lang/Object;

    return-object v0
.end method
