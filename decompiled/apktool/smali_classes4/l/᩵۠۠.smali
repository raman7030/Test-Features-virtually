.class public final Ll/᩵۠۠;
.super Ljava/lang/Object;
.source "37P4"


# instance fields
.field public ֫:I

.field public ۧ:Ll/ᩴܶ۠;

.field public ܽ:Ll/ᩴܶ۠;


# direct methods
.method public static ֫(Ll/᩵۠۠;Ljava/lang/Iterable;)Ll/ۖܶ۠;
    .locals 3

    .line 170
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡۠۠;

    .line 171
    iget v1, v0, Ll/֡۠۠;->᩹:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 172
    invoke-direct {p0, v0}, Ll/᩵۠۠;->֫(Ll/֡۠۠;)V

    goto :goto_0

    .line 175
    :cond_1
    iget-object p0, p0, Ll/᩵۠۠;->ۧ:Ll/ᩴܶ۠;

    invoke-virtual {p0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/֡۠۠;)V
    .locals 5

    .line 197
    iget v0, p0, Ll/᩵۠۠;->֫:I

    iput v0, p1, Ll/֡۠۠;->᩹:I

    .line 198
    iput v0, p1, Ll/֡۠۠;->᩶:I

    add-int/lit8 v0, v0, 0x1

    .line 199
    iput v0, p0, Ll/᩵۠۠;->֫:I

    .line 200
    iget-object v0, p0, Ll/᩵۠۠;->ܽ:Ll/ᩴܶ۠;

    invoke-virtual {v0, p1}, Ll/ᩴܶ۠;->ۧ(Ljava/lang/Object;)V

    .line 180
    invoke-virtual {p1}, Ll/֡۠۠;->ܿ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡۠۠;

    .line 181
    iget v3, v2, Ll/֡۠۠;->᩹:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 183
    invoke-direct {p0, v2}, Ll/᩵۠۠;->֫(Ll/֡۠۠;)V

    .line 184
    iget v3, p1, Ll/֡۠۠;->᩶:I

    iget v2, v2, Ll/֡۠۠;->᩶:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p1, Ll/֡۠۠;->᩶:I

    goto :goto_0

    .line 185
    :cond_1
    invoke-virtual {v0, v2}, Ll/ᩴܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 187
    iget v3, p1, Ll/֡۠۠;->᩶:I

    iget v2, v2, Ll/֡۠۠;->᩹:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p1, Ll/֡۠۠;->᩶:I

    goto :goto_0

    .line 190
    :cond_2
    iget v1, p1, Ll/֡۠۠;->᩶:I

    iget v2, p1, Ll/֡۠۠;->᩹:I

    if-ne v1, v2, :cond_4

    .line 206
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 208
    :cond_3
    invoke-virtual {v0}, Ljava/util/AbstractQueue;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡۠۠;

    .line 209
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    invoke-virtual {v1, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    if-ne v2, p1, :cond_3

    .line 212
    iget-object p1, p0, Ll/᩵۠۠;->ۧ:Ll/ᩴܶ۠;

    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    .line 227
    invoke-virtual {p1, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method
