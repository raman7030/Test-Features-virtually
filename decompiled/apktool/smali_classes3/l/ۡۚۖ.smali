.class public final Ll/ۡۚۖ;
.super Ljava/lang/Object;
.source "T9OQ"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/lang/Class;

.field public static final ܽ:Ll/ܿ֨ۖ;

.field public static final ᩳ:Ll/ܺ֨ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 787
    :try_start_0
    const-class v1, Ll/ۘᩴۖ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v1, v0

    .line 23
    :goto_0
    sput-object v1, Ll/ۡۚۖ;->ۧ:Ljava/lang/Class;

    .line 795
    :try_start_1
    const-class v1, Ll/ۖ֨ۖ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-object v1, v0

    :goto_1
    if-nez v1, :cond_0

    goto :goto_2

    .line 777
    :cond_0
    :try_start_2
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ֨ۖ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v0, v1

    .line 25
    :catchall_2
    :goto_2
    sput-object v0, Ll/ۡۚۖ;->ܽ:Ll/ܿ֨ۖ;

    .line 26
    new-instance v0, Ll/ܺ֨ۖ;

    .line 16
    invoke-direct {v0}, Ll/ܿ֨ۖ;-><init>()V

    .line 26
    sput-object v0, Ll/ۡۚۖ;->ᩳ:Ll/ܺ֨ۖ;

    return-void
.end method

.method public static ֫(ILjava/util/List;)I
    .locals 0

    .line 567
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 576
    :cond_0
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܿ(I)I

    move-result p0

    mul-int p0, p0, p1

    return p0
.end method

.method public static ֫(Ljava/util/List;)I
    .locals 5

    .line 418
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 425
    :cond_0
    instance-of v2, p0, Ll/᩹ᩴۖ;

    if-eqz v2, :cond_2

    .line 426
    check-cast p0, Ll/᩹ᩴۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 428
    invoke-virtual {p0, v1}, Ll/᩹ᩴۖ;->getInt(I)I

    move-result v3

    int-to-long v3, v3

    .line 696
    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 432
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    .line 696
    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return v2
.end method

.method public static ֫(Ljava/lang/Object;IILjava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;
    .locals 2

    if-nez p3, :cond_0

    .line 979
    invoke-virtual {p4, p0}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :cond_0
    int-to-long v0, p2

    .line 981
    invoke-virtual {p4, p1, v0, v1, p3}, Ll/ܿ֨ۖ;->ۧ(IJLjava/lang/Object;)V

    return-object p3
.end method

.method public static ֫(Ljava/lang/Object;ILjava/util/List;Ll/۫ᩴۖ;Ljava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;
    .locals 6

    if-nez p3, :cond_0

    return-object p4

    .line 937
    :cond_0
    instance-of v0, p2, Ljava/util/RandomAccess;

    if-eqz v0, :cond_5

    .line 939
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 941
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 942
    invoke-interface {p3, v4}, Ll/۫ᩴۖ;->֫(I)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eq v1, v2, :cond_1

    .line 944
    invoke-interface {p2, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 949
    :cond_2
    invoke-static {p0, p1, v4, p4, p5}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;IILjava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object p4

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-eq v2, v0, :cond_4

    .line 954
    invoke-interface {p2, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_4
    return-object p4

    .line 957
    :cond_5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 958
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 959
    invoke-interface {p3, v0}, Ll/۫ᩴۖ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_6

    .line 961
    invoke-static {p0, p1, v0, p4, p5}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;IILjava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object p4

    .line 963
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_7
    return-object p4
.end method

.method public static ֫()Ll/ܿ֨ۖ;
    .locals 1

    .line 764
    sget-object v0, Ll/ۡۚۖ;->ܽ:Ll/ܿ֨ۖ;

    return-object v0
.end method

.method public static ֫(ILjava/util/List;Ll/ۜ۠ۖ;Ll/ۢۚۖ;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 304
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 305
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 555
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 556
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, p0, v1, p3}, Ll/᩻᩷ۖ;->֫(ILjava/lang/Object;Ll/ۢۚۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 253
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->֫(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/lang/Class;)V
    .locals 1

    .line 40
    const-class v0, Ll/᩸ᩴۖ;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ۡۚۖ;->ۧ:Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Message classes must extend GeneratedMessage or GeneratedMessageLite"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    .line 851
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۖ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 218
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ۖ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ۘ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 183
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ۘ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ۜ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 176
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 177
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ۜ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ۡ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 225
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ۡ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ۢ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 204
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 205
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ۢ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ۧ(ILjava/util/List;)I
    .locals 0

    .line 585
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 552
    :cond_0
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    mul-int p0, p0, p1

    return p0
.end method

.method public static ۧ(Ljava/util/List;)I
    .locals 5

    .line 454
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 461
    :cond_0
    instance-of v2, p0, Ll/᩹ᩴۖ;

    if-eqz v2, :cond_2

    .line 462
    check-cast p0, Ll/᩹ᩴۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 464
    invoke-virtual {p0, v1}, Ll/᩹ᩴۖ;->getInt(I)I

    move-result v3

    int-to-long v3, v3

    .line 696
    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 468
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    .line 696
    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return v2
.end method

.method public static ۧ()Ll/ܺ֨ۖ;
    .locals 1

    .line 768
    sget-object v0, Ll/ۡۚۖ;->ᩳ:Ll/ܺ֨ۖ;

    return-object v0
.end method

.method public static ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Ll/ۢۚۖ;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 281
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 282
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 540
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 541
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, p0, v1, p3}, Ll/᩻᩷ۖ;->ۧ(ILjava/lang/Object;Ll/ۢۚۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 162
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ۧ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ܳ(Ljava/util/List;)I
    .locals 4

    .line 490
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 497
    :cond_0
    instance-of v2, p0, Ll/᩹ᩴۖ;

    if-eqz v2, :cond_2

    .line 498
    check-cast p0, Ll/᩹ᩴۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 500
    invoke-virtual {p0, v1}, Ll/᩹ᩴۖ;->getInt(I)I

    move-result v3

    invoke-static {v3}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 504
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return v2
.end method

.method public static ܳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 169
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 170
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ܳ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ܺ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 190
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 191
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ܺ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ܽ(Ljava/util/List;)I
    .locals 5

    .line 310
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 317
    :cond_0
    instance-of v2, p0, Ll/ۚ᩵ۖ;

    if-eqz v2, :cond_2

    .line 318
    check-cast p0, Ll/ۚ᩵ۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 320
    invoke-virtual {p0, v1}, Ll/ۚ᩵ۖ;->getLong(I)J

    move-result-wide v3

    .line 764
    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 324
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 764
    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return v2
.end method

.method public static ܽ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 246
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 247
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ܽ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ܿ(Ljava/util/List;)I
    .locals 9

    .line 382
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 389
    :cond_0
    instance-of v2, p0, Ll/ۚ᩵ۖ;

    const/16 v3, 0x3f

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    .line 390
    check-cast p0, Ll/ۚ᩵ۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 392
    invoke-virtual {p0, v1}, Ll/ۚ᩵ۖ;->getLong(I)J

    move-result-wide v5

    shl-long v7, v5, v4

    shr-long/2addr v5, v3

    xor-long/2addr v5, v7

    .line 779
    invoke-static {v5, v6}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v5

    add-int/2addr v2, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 396
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    shl-long v7, v5, v4

    shr-long/2addr v5, v3

    xor-long/2addr v5, v7

    .line 779
    invoke-static {v5, v6}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v5

    add-int/2addr v2, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return v2
.end method

.method public static ܿ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 197
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 198
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ܿ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ᩳ(Ljava/util/List;)I
    .locals 5

    .line 526
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 533
    :cond_0
    instance-of v2, p0, Ll/᩹ᩴۖ;

    if-eqz v2, :cond_2

    .line 534
    check-cast p0, Ll/᩹ᩴۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 536
    invoke-virtual {p0, v1}, Ll/᩹ᩴۖ;->getInt(I)I

    move-result v3

    shl-int/lit8 v4, v3, 0x1

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v4

    .line 746
    invoke-static {v3}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 540
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    shl-int/lit8 v4, v3, 0x1

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v4

    .line 746
    invoke-static {v3}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return v2
.end method

.method public static ᩳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 232
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 233
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->ᩳ(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ᩷(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 239
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 240
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->᩷(IZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static ᩻(Ljava/util/List;)I
    .locals 5

    .line 346
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 353
    :cond_0
    instance-of v2, p0, Ll/ۚ᩵ۖ;

    if-eqz v2, :cond_2

    .line 354
    check-cast p0, Ll/ۚ᩵ۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 356
    invoke-virtual {p0, v1}, Ll/ۚ᩵ۖ;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 360
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return v2
.end method

.method public static ᩻(ILjava/util/List;Ll/ۜ۠ۖ;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 211
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    check-cast p2, Ll/᩻᩷ۖ;

    invoke-virtual {p2, p0, p3, p1}, Ll/᩻᩷ۖ;->᩻(IZLjava/util/List;)V

    :cond_0
    return-void
.end method
