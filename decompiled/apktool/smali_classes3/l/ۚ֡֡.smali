.class public abstract Ll/ۚ֡֡;
.super Ljava/lang/Object;
.source "J8YL"

# interfaces
.implements Ll/֡֨֡;


# instance fields
.field public final ֫:C


# direct methods
.method public constructor <init>(C)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-char p1, p0, Ll/ۚ֡֡;->֫:C

    return-void
.end method


# virtual methods
.method public final ֫()C
    .locals 1

    .line 22
    iget-char v0, p0, Ll/ۚ֡֡;->֫:C

    return v0
.end method

.method public final ֫(Ll/ܺ᩵֡;Ll/ܺ᩵֡;)I
    .locals 6

    .line 33
    iget-object v0, p2, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ܺ᩵֡;->֫()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p2}, Ll/ܺ᩵֡;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 34
    :cond_0
    invoke-virtual {p2}, Ll/ܺ᩵֡;->ᩳ()I

    move-result v1

    rem-int/lit8 v1, v1, 0x3

    if-eqz v1, :cond_1

    .line 35
    invoke-virtual {p1}, Ll/ܺ᩵֡;->ᩳ()I

    move-result v1

    invoke-virtual {p2}, Ll/ܺ᩵֡;->ᩳ()I

    move-result v3

    add-int/2addr v3, v1

    rem-int/lit8 v3, v3, 0x3

    if-nez v3, :cond_1

    return v2

    .line 49
    :cond_1
    iget-object v1, p1, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 42
    iget-char v3, p0, Ll/ۚ֡֡;->֫:C

    const/4 v4, 0x2

    if-lt v1, v4, :cond_2

    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v1, v4, :cond_2

    .line 44
    new-instance v1, Ll/ۗۚ֡;

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 19
    invoke-direct {v1}, Ll/֡ۚ֡;-><init>()V

    goto :goto_0

    .line 47
    :cond_2
    new-instance v1, Ll/ܿۚ֡;

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 19
    invoke-direct {v1}, Ll/֡ۚ֡;-><init>()V

    const/4 v4, 0x1

    .line 16
    :goto_0
    new-instance v3, Ll/ۙۚ֡;

    .line 11
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-virtual {p1, v4}, Ll/ܺ᩵֡;->ۧ(I)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ۙۚ֡;->ۧ(Ljava/util/List;)V

    .line 53
    invoke-virtual {p1}, Ll/ܺ᩵֡;->ܽ()Ll/۬ۚ֡;

    move-result-object p1

    .line 64
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۚ֡;

    .line 54
    invoke-static {p1, v0}, Ll/۠ۚ֡;->֫(Ll/۬ۚ֡;Ll/۬ۚ֡;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۚ֡;

    .line 55
    invoke-virtual {v1, v2}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    .line 56
    invoke-virtual {v2}, Ll/֡ۚ֡;->ܳ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/ۙۚ֡;->֫(Ljava/util/List;)V

    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {p2, v4}, Ll/ܺ᩵֡;->֫(I)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v3, p2}, Ll/ۙۚ֡;->ۧ(Ljava/util/List;)V

    .line 61
    invoke-virtual {v3}, Ll/ۙۚ֡;->֫()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ll/֡ۚ֡;->֫(Ljava/util/List;)V

    .line 62
    invoke-virtual {p1, v1}, Ll/֡ۚ֡;->ۧ(Ll/֡ۚ֡;)V

    return v4
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()C
    .locals 1

    .line 17
    iget-char v0, p0, Ll/ۚ֡֡;->֫:C

    return v0
.end method
