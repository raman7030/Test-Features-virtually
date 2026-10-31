.class public final synthetic Ll/᩻᩻ۜ;
.super Ljava/lang/Object;
.source "H78K"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/ܿ᩺᩻;

    .line 4
    check-cast p2, Ll/ܿ᩺᩻;

    .line 336
    iget-object v0, p1, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    iget-object v1, p2, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 340
    :cond_0
    iget-object v0, p1, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;

    iget-object v1, p2, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 344
    :cond_1
    iget p1, p1, Ll/ܿ᩺᩻;->֫:I

    iget p2, p2, Ll/ܿ᩺᩻;->֫:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
