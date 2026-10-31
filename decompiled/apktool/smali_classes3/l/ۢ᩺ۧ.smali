.class public final Ll/ۢ᩺ۧ;
.super Ljava/lang/Object;
.source "84NK"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# instance fields
.field public ֫:[Ll/ܿ۬;


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 157
    check-cast p2, [Ll/ܿ۬;

    check-cast p3, [Ll/ܿ۬;

    .line 185
    invoke-static {p2, p3}, Ll/ܳ۬;->֫([Ll/ܿ۬;[Ll/ܿ۬;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 190
    iget-object v0, p0, Ll/ۢ᩺ۧ;->֫:[Ll/ܿ۬;

    invoke-static {v0, p2}, Ll/ܳ۬;->֫([Ll/ܿ۬;[Ll/ܿ۬;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 191
    invoke-static {p2}, Ll/ܳ۬;->֫([Ll/ܿ۬;)[Ll/ܿ۬;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ᩺ۧ;->֫:[Ll/ܿ۬;

    :cond_0
    const/4 v0, 0x0

    .line 194
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_1

    .line 195
    iget-object v1, p0, Ll/ۢ᩺ۧ;->֫:[Ll/ܿ۬;

    aget-object v1, v1, v0

    aget-object v2, p2, v0

    aget-object v3, p3, v0

    invoke-virtual {v1, v2, v3, p1}, Ll/ܿ۬;->֫(Ll/ܿ۬;Ll/ܿ۬;F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 199
    :cond_1
    iget-object p1, p0, Ll/ۢ᩺ۧ;->֫:[Ll/ܿ۬;

    return-object p1

    .line 186
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Can\'t interpolate between two incompatible pathData"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
