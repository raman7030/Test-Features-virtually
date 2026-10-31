.class public Ll/ܳܳܽ;
.super Ljava/lang/Object;
.source "V1EX"


# instance fields
.field public final ֫:Ll/ۢ᩻ܽ;

.field public volatile ۧ:Ll/ܿᩳܽ;

.field public final ܽ:Ll/ۙۜᩴ;


# direct methods
.method public constructor <init>(Ll/ۢ᩻ܽ;)V
    .locals 6

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ll/ۙۜᩴ;

    invoke-direct {v0}, Ll/ۙۜᩴ;-><init>()V

    iput-object v0, p0, Ll/ܳܳܽ;->ܽ:Ll/ۙۜᩴ;

    .line 26
    iput-object p1, p0, Ll/ܳܳܽ;->֫:Ll/ۢ᩻ܽ;

    .line 28
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->ۚ()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 29
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩻ܽ;

    .line 30
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v2

    .line 32
    iget-object v3, p0, Ll/ܳܳܽ;->ܽ:Ll/ۙۜᩴ;

    invoke-virtual {v3, v2}, Ll/ۙۜᩴ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    if-eq v2, v1, :cond_2

    const-string v3, "app"

    const/16 v4, 0x7f

    if-eq v2, v4, :cond_1

    .line 43
    iget-object v4, p0, Ll/ܳܳܽ;->ܽ:Ll/ۙۜᩴ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ll/ۙۜᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 37
    :cond_1
    iget-object v2, p0, Ll/ܳܳܽ;->ܽ:Ll/ۙۜᩴ;

    invoke-virtual {v2, v4, v3}, Ll/ۙۜᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 40
    :cond_2
    iget-object v2, p0, Ll/ܳܳܽ;->ܽ:Ll/ۙۜᩴ;

    const-string v3, "android"

    invoke-virtual {v2, v1, v3}, Ll/ۙۜᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method

.method private ֫(ILl/ۢ᩻ܽ;III)Ljava/lang/String;
    .locals 4

    .line 106
    invoke-interface {p2}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 107
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    if-ne v1, p3, :cond_0

    .line 108
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩻ܽ;

    .line 109
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v2

    if-ne v2, p4, :cond_1

    .line 110
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ᩻ܽ;

    .line 111
    invoke-interface {v3, p5}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 113
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1, p3}, Ll/ܳܳܽ;->֫(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-interface {v1}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    invoke-interface {v3}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public static ֫(Ll/ۢ᩻ܽ;II)Ll/֡᩻ܽ;
    .locals 3

    .line 79
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 80
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    if-ne v1, p1, :cond_0

    .line 81
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩻ܽ;

    .line 82
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v2

    if-ne v2, p2, :cond_1

    return-object v1

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫(II)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 130
    :cond_0
    iget-object p1, p0, Ll/ܳܳܽ;->ܽ:Ll/ۙۜᩴ;

    invoke-virtual {p1, p2}, Ll/ۙۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    const-string p2, ":"

    .line 132
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    if-ne p2, v0, :cond_2

    const-string p1, "android:"

    return-object p1

    :cond_2
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public final ֫(I)Ll/֡᩻ܽ;
    .locals 4

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    ushr-int/lit8 p1, p1, 0x10

    and-int/lit16 p1, p1, 0xff

    .line 71
    iget-object v1, p0, Ll/ܳܳܽ;->֫:Ll/ۢ᩻ܽ;

    invoke-static {v1, v0, p1}, Ll/ܳܳܽ;->֫(Ll/ۢ᩻ܽ;II)Ll/֡᩻ܽ;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    .line 72
    invoke-interface {v1}, Ll/ۢ᩻ܽ;->ۙ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 73
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v1

    invoke-static {v1, v0, p1}, Ll/ܳܳܽ;->֫(Ll/ۢ᩻ܽ;II)Ll/֡᩻ܽ;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v2
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ܳܳܽ;->֫:Ll/ۢ᩻ܽ;

    return-object v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ܳܳܽ;->ܽ:Ll/ۙۜᩴ;

    invoke-virtual {v0, p1}, Ll/ۙۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public ۧ(II)Ljava/lang/String;
    .locals 12

    ushr-int/lit8 v0, p2, 0x18

    and-int/lit16 v7, v0, 0xff

    ushr-int/lit8 v8, p2, 0x10

    and-int/lit16 v9, v8, 0xff

    const v1, 0xffff

    and-int v10, p2, v1

    .line 95
    iget-object v3, p0, Ll/ܳܳܽ;->֫:Ll/ۢ᩻ܽ;

    move-object v1, p0

    move v2, p1

    move v4, v7

    move v5, v9

    move v6, v10

    invoke-direct/range {v1 .. v6}, Ll/ܳܳܽ;->֫(ILl/ۢ᩻ܽ;III)Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x1

    if-nez v1, :cond_0

    if-ne v7, v11, :cond_0

    .line 96
    iget-object v2, p0, Ll/ܳܳܽ;->֫:Ll/ۢ᩻ܽ;

    invoke-interface {v2}, Ll/ۢ᩻ܽ;->ۙ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 97
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v3

    move-object v1, p0

    move v2, p1

    move v4, v7

    move v5, v9

    move v6, v10

    invoke-direct/range {v1 .. v6}, Ll/ܳܳܽ;->֫(ILl/ۢ᩻ܽ;III)Ljava/lang/String;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    ushr-int/lit8 p1, p2, 0x1c

    and-int/lit8 p1, p1, 0xf

    const-string v1, "0123456789abcdef"

    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    and-int/lit8 v0, v0, 0xf

    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    ushr-int/lit8 v2, p2, 0x14

    and-int/lit8 v2, v2, 0xf

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    and-int/lit8 v3, v8, 0xf

    .line 13
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    ushr-int/lit8 v4, p2, 0xc

    and-int/lit8 v4, v4, 0xf

    .line 14
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    ushr-int/lit8 v5, p2, 0x8

    and-int/lit8 v5, v5, 0xf

    .line 15
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    ushr-int/lit8 v6, p2, 0x4

    and-int/lit8 v6, v6, 0xf

    .line 16
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    and-int/lit8 p2, p2, 0xf

    .line 17
    invoke-virtual {v1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v1, 0x8

    new-array v1, v1, [C

    const/4 v7, 0x0

    aput-char p1, v1, v7

    aput-char v0, v1, v11

    const/4 p1, 0x2

    aput-char v2, v1, p1

    const/4 p1, 0x3

    aput-char v3, v1, p1

    const/4 p1, 0x4

    aput-char v4, v1, p1

    const/4 p1, 0x5

    aput-char v5, v1, p1

    const/4 p1, 0x6

    aput-char v6, v1, p1

    const/4 p1, 0x7

    aput-char p2, v1, p1

    .line 18
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>([C)V

    move-object v1, p1

    :cond_1
    return-object v1
.end method

.method public final ۧ()Ll/ܿᩳܽ;
    .locals 3

    .line 51
    iget-object v0, p0, Ll/ܳܳܽ;->ۧ:Ll/ܿᩳܽ;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 52
    monitor-enter v0

    .line 53
    :try_start_0
    iget-object v1, p0, Ll/ܳܳܽ;->ۧ:Ll/ܿᩳܽ;

    if-nez v1, :cond_0

    .line 54
    new-instance v1, Ll/ܿᩳܽ;

    iget-object v2, p0, Ll/ܳܳܽ;->֫:Ll/ۢ᩻ܽ;

    invoke-direct {v1, v2}, Ll/ܿᩳܽ;-><init>(Ll/ۢ᩻ܽ;)V

    iput-object v1, p0, Ll/ܳܳܽ;->ۧ:Ll/ܿᩳܽ;

    .line 56
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܳܳܽ;->ۧ:Ll/ܿᩳܽ;

    return-object v0
.end method
