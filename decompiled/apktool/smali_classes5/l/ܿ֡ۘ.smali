.class public final Ll/ܿ֡ۘ;
.super Ll/ۨ֡ۘ;
.source "C1X6"


# static fields
.field public static final ֡֫:Ljava/util/HashMap;


# instance fields
.field public ۘ֫:Ll/۟֡ۘ;

.field public ᩴ֫:Ljava/lang/String;

.field public ᩵֫:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܿ֡ۘ;->֡֫:Ljava/util/HashMap;

    const-string v1, "alpha"

    .line 43
    sget-object v2, Ll/۠֡ۘ;->֫:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "pivotX"

    .line 44
    sget-object v2, Ll/۠֡ۘ;->ۧ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "pivotY"

    .line 45
    sget-object v2, Ll/۠֡ۘ;->ܽ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "translationX"

    .line 46
    sget-object v2, Ll/۠֡ۘ;->ۡ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "translationY"

    .line 47
    sget-object v2, Ll/۠֡ۘ;->ܺ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "rotation"

    .line 48
    sget-object v2, Ll/۠֡ۘ;->ᩳ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "rotationX"

    .line 49
    sget-object v2, Ll/۠֡ۘ;->ܿ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "rotationY"

    .line 50
    sget-object v2, Ll/۠֡ۘ;->ܳ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "scaleX"

    .line 51
    sget-object v2, Ll/۠֡ۘ;->᩻:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "scaleY"

    .line 52
    sget-object v2, Ll/۠֡ۘ;->ۜ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "scrollX"

    .line 53
    sget-object v2, Ll/۠֡ۘ;->᩷:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "scrollY"

    .line 54
    sget-object v2, Ll/۠֡ۘ;->ۢ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "x"

    .line 55
    sget-object v2, Ll/۠֡ۘ;->ۖ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "y"

    .line 56
    sget-object v2, Ll/۠֡ۘ;->ۘ:Ll/۟֡ۘ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 149
    invoke-direct {p0}, Ll/ۨ֡ۘ;-><init>()V

    return-void
.end method

.method public static varargs ֫(Ljava/lang/Object;[F)Ll/ܿ֡ۘ;
    .locals 5

    .line 230
    new-instance v0, Ll/ܿ֡ۘ;

    .line 161
    invoke-direct {v0}, Ll/ۨ֡ۘ;-><init>()V

    .line 162
    iput-object p0, v0, Ll/ܿ֡ۘ;->᩵֫:Ljava/lang/Object;

    .line 95
    iget-object p0, v0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    const-string v1, "alpha"

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    .line 96
    aget-object p0, p0, v2

    .line 713
    iget-object v3, p0, Ll/᩸֡ۘ;->۫:Ljava/lang/String;

    .line 689
    iput-object v1, p0, Ll/᩸֡ۘ;->۫:Ljava/lang/String;

    .line 99
    iget-object v4, v0, Ll/ۨ֡ۘ;->ܿ֫:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object v3, v0, Ll/ۨ֡ۘ;->ܿ֫:Ljava/util/HashMap;

    invoke-virtual {v3, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    :cond_0
    iput-object v1, v0, Ll/ܿ֡ۘ;->ᩴ֫:Ljava/lang/String;

    .line 104
    iput-boolean v2, v0, Ll/ۨ֡ۘ;->ۗ:Z

    .line 231
    invoke-virtual {v0, p1}, Ll/ܿ֡ۘ;->֫([F)V

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 499
    invoke-super {p0}, Ll/ۨ֡ۘ;->clone()Ll/ۨ֡ۘ;

    move-result-object v0

    check-cast v0, Ll/ܿ֡ۘ;

    return-object v0
.end method

.method public final clone()Ll/ۨ֡ۘ;
    .locals 1

    .line 499
    invoke-super {p0}, Ll/ۨ֡ۘ;->clone()Ll/ۨ֡ۘ;

    move-result-object v0

    check-cast v0, Ll/ܿ֡ۘ;

    return-object v0
.end method

.method public final clone()Ll/᩺᩵ۘ;
    .locals 1

    .line 499
    invoke-super {p0}, Ll/ۨ֡ۘ;->clone()Ll/ۨ֡ۘ;

    move-result-object v0

    check-cast v0, Ll/ܿ֡ۘ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 505
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ObjectAnimator@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", target "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿ֡ۘ;->᩵֫:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 507
    iget-object v1, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 508
    :goto_0
    iget-object v2, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    const-string v2, "\n    "

    .line 0
    invoke-static {v0, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 509
    iget-object v2, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ll/᩸֡ۘ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(F)V
    .locals 3

    .line 490
    invoke-super {p0, p1}, Ll/ۨ֡ۘ;->֫(F)V

    .line 491
    iget-object p1, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 493
    iget-object v1, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    aget-object v1, v1, v0

    iget-object v2, p0, Ll/ܿ֡ۘ;->᩵֫:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ll/᩸֡ۘ;->֫(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final varargs ֫([F)V
    .locals 4

    .line 344
    iget-object v0, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    if-eqz v0, :cond_1

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 353
    :cond_0
    invoke-super {p0, p1}, Ll/ۨ֡ۘ;->֫([F)V

    return-void

    .line 347
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܿ֡ۘ;->ۘ֫:Ll/۟֡ۘ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 348
    sget v3, Ll/᩸֡ۘ;->᩺:I

    .line 187
    new-instance v3, Ll/ܶ֡ۘ;

    invoke-direct {v3, v0, p1}, Ll/ܶ֡ۘ;-><init>(Ll/۟֡ۘ;[F)V

    new-array p1, v2, [Ll/᩸֡ۘ;

    aput-object v3, p1, v1

    .line 348
    invoke-virtual {p0, p1}, Ll/ۨ֡ۘ;->֫([Ll/᩸֡ۘ;)V

    return-void

    .line 350
    :cond_2
    iget-object v0, p0, Ll/ܿ֡ۘ;->ᩴ֫:Ljava/lang/String;

    sget v3, Ll/᩸֡ۘ;->᩺:I

    .line 176
    new-instance v3, Ll/ܶ֡ۘ;

    .line 918
    invoke-direct {v3, v0}, Ll/᩸֡ۘ;-><init>(Ljava/lang/String;)V

    .line 919
    invoke-virtual {v3, p1}, Ll/ܶ֡ۘ;->֫([F)V

    new-array p1, v2, [Ll/᩸֡ۘ;

    aput-object v3, p1, v1

    .line 350
    invoke-virtual {p0, p1}, Ll/ۨ֡ۘ;->֫([Ll/᩸֡ۘ;)V

    return-void
.end method

.method public final ۧ(J)Ll/ۨ֡ۘ;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۧ(J)V
    .locals 0

    .line 426
    invoke-super {p0, p1, p2}, Ll/ۨ֡ۘ;->ۧ(J)Ll/ۨ֡ۘ;

    return-void
.end method

.method public final ᩳ()V
    .locals 6

    .line 401
    iget-object v0, p0, Ll/ܿ֡ۘ;->᩵֫:Ljava/lang/Object;

    iget-boolean v1, p0, Ll/ۨ֡ۘ;->ۗ:Z

    if-nez v1, :cond_4

    .line 404
    iget-object v1, p0, Ll/ܿ֡ۘ;->ۘ֫:Ll/۟֡ۘ;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    sget-boolean v1, Ll/۟᩵ۘ;->ᩳ֫:Z

    if-eqz v1, :cond_2

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܿ֡ۘ;->ᩴ֫:Ljava/lang/String;

    sget-object v3, Ll/ܿ֡ۘ;->֡֫:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 405
    iget-object v1, p0, Ll/ܿ֡ۘ;->ᩴ֫:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟֡ۘ;

    .line 117
    iget-object v3, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    if-eqz v3, :cond_0

    .line 118
    aget-object v3, v3, v2

    .line 713
    iget-object v4, v3, Ll/᩸֡ۘ;->۫:Ljava/lang/String;

    .line 701
    iput-object v1, v3, Ll/᩸֡ۘ;->ۗ:Ll/۟֡ۘ;

    .line 121
    iget-object v5, p0, Ll/ۨ֡ۘ;->ܿ֫:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    iget-object v4, p0, Ll/ۨ֡ۘ;->ܿ֫:Ljava/util/HashMap;

    iget-object v5, p0, Ll/ܿ֡ۘ;->ᩴ֫:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    :cond_0
    iget-object v3, p0, Ll/ܿ֡ۘ;->ۘ֫:Ll/۟֡ۘ;

    if-eqz v3, :cond_1

    .line 125
    invoke-virtual {v1}, Ll/۟֡ۘ;->֫()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ܿ֡ۘ;->ᩴ֫:Ljava/lang/String;

    .line 127
    :cond_1
    iput-object v1, p0, Ll/ܿ֡ۘ;->ۘ֫:Ll/۟֡ۘ;

    .line 129
    iput-boolean v2, p0, Ll/ۨ֡ۘ;->ۗ:Z

    .line 407
    :cond_2
    iget-object v1, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    array-length v1, v1

    :goto_0
    if-ge v2, v1, :cond_3

    .line 409
    iget-object v3, p0, Ll/ۨ֡ۘ;->ᩳ֫:[Ll/᩸֡ۘ;

    aget-object v3, v3, v2

    invoke-virtual {v3, v0}, Ll/᩸֡ۘ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 411
    :cond_3
    invoke-super {p0}, Ll/ۨ֡ۘ;->ᩳ()V

    :cond_4
    return-void
.end method
