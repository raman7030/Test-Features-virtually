.class public final Ll/ܺۙᩳ;
.super Ljava/lang/Object;
.source "R6U3"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ll/ۢۙᩳ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, v0}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۢۙᩳ;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    return-void
.end method

.method public static ֫(Ll/ۢۙᩳ;I)Ll/ۡۙᩳ;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 100
    new-instance p1, Ll/ۡۙᩳ;

    invoke-direct {p1, v0, p0}, Ll/ۡۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object p1

    :cond_0
    if-nez p0, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 130
    :cond_1
    iget v1, p0, Ll/ۢۙᩳ;->᩻:I

    :goto_0
    if-ne p1, v1, :cond_2

    .line 101
    new-instance p1, Ll/ۡۙᩳ;

    invoke-direct {p1, p0, v0}, Ll/ۡۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object p1

    .line 102
    :cond_2
    iget-object v0, p0, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    iget-object v1, p0, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    iget v2, v0, Ll/ۢۙᩳ;->᩻:I

    if-ge p1, v2, :cond_3

    .line 103
    invoke-static {v0, p1}, Ll/ܺۙᩳ;->֫(Ll/ۢۙᩳ;I)Ll/ۡۙᩳ;

    move-result-object p0

    .line 104
    new-instance p1, Ll/ۡۙᩳ;

    iget-object v0, p0, Ll/ۡۙᩳ;->֫:Ll/ۢۙᩳ;

    iget-object p0, p0, Ll/ۡۙᩳ;->ۧ:Ll/ۢۙᩳ;

    invoke-static {p0, v1}, Ll/ܺۙᩳ;->ۧ(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/ۡۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object p1

    :cond_3
    sub-int/2addr p1, v2

    .line 106
    invoke-static {v1, p1}, Ll/ܺۙᩳ;->֫(Ll/ۢۙᩳ;I)Ll/ۡۙᩳ;

    move-result-object p1

    .line 107
    new-instance v0, Ll/ۡۙᩳ;

    iget-object p0, p0, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    iget-object v1, p1, Ll/ۡۙᩳ;->֫:Ll/ۢۙᩳ;

    invoke-static {p0, v1}, Ll/ܺۙᩳ;->ۧ(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;

    move-result-object p0

    iget-object p1, p1, Ll/ۡۙᩳ;->ۧ:Ll/ۢۙᩳ;

    invoke-direct {v0, p0, p1}, Ll/ۡۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object v0
.end method

.method public static ֫(Ll/ۢۙᩳ;Ljava/lang/Object;)Ll/ۢۙᩳ;
    .locals 2

    .line 96
    iget-object v0, p0, Ll/ۢۙᩳ;->ۧ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    new-instance p0, Ll/ۢۙᩳ;

    invoke-direct {p0, p1}, Ll/ۢۙᩳ;-><init>(Ljava/lang/Object;)V

    return-object p0

    :cond_0
    new-instance v0, Ll/ۢۙᩳ;

    iget-object v1, p0, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    iget-object p0, p0, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-static {p0, p1}, Ll/ܺۙᩳ;->֫(Ll/ۢۙᩳ;Ljava/lang/Object;)Ll/ۢۙᩳ;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object v0
.end method

.method public static ֫(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;
    .locals 6

    .line 119
    iget v0, p0, Ll/ۢۙᩳ;->֫:I

    iget-object v1, p0, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    iget v2, p1, Ll/ۢۙᩳ;->֫:I

    iget-object v3, p1, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    iget-object v4, p1, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    add-int/lit8 v5, v2, 0x1

    if-le v0, v5, :cond_1

    .line 120
    iget-object p0, p0, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    iget v0, p0, Ll/ۢۙᩳ;->֫:I

    iget v2, v1, Ll/ۢۙᩳ;->֫:I

    if-lt v0, v2, :cond_0

    new-instance v0, Ll/ۢۙᩳ;

    new-instance v2, Ll/ۢۙᩳ;

    invoke-direct {v2, v1, p1}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    invoke-direct {v0, p0, v2}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object v0

    .line 121
    :cond_0
    new-instance v0, Ll/ۢۙᩳ;

    new-instance v2, Ll/ۢۙᩳ;

    iget-object v3, v1, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    invoke-direct {v2, p0, v3}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    new-instance p0, Ll/ۢۙᩳ;

    iget-object v1, v1, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-direct {p0, v1, p1}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    invoke-direct {v0, v2, p0}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    if-le v2, v0, :cond_3

    .line 124
    iget p1, v4, Ll/ۢۙᩳ;->֫:I

    iget v0, v3, Ll/ۢۙᩳ;->֫:I

    if-lt p1, v0, :cond_2

    new-instance p1, Ll/ۢۙᩳ;

    new-instance v0, Ll/ۢۙᩳ;

    invoke-direct {v0, p0, v3}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    invoke-direct {p1, v0, v4}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object p1

    .line 125
    :cond_2
    new-instance p1, Ll/ۢۙᩳ;

    new-instance v0, Ll/ۢۙᩳ;

    iget-object v1, v3, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    invoke-direct {v0, p0, v1}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    new-instance p0, Ll/ۢۙᩳ;

    iget-object v1, v3, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-direct {p0, v1, v4}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    invoke-direct {p1, v0, p0}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object p1

    .line 127
    :cond_3
    new-instance v0, Ll/ۢۙᩳ;

    invoke-direct {v0, p0, p1}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object v0
.end method

.method public static ۧ(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;
    .locals 3

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    .line 113
    :cond_1
    iget v0, p0, Ll/ۢۙᩳ;->֫:I

    iget v1, p1, Ll/ۢۙᩳ;->֫:I

    add-int/lit8 v2, v1, 0x1

    if-le v0, v2, :cond_2

    iget-object v0, p0, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    iget-object p0, p0, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-static {p0, p1}, Ll/ܺۙᩳ;->ۧ(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܺۙᩳ;->֫(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_3

    .line 114
    iget-object v0, p1, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    invoke-static {p0, v0}, Ll/ܺۙᩳ;->ۧ(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;

    move-result-object p0

    iget-object p1, p1, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-static {p0, p1}, Ll/ܺۙᩳ;->֫(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;

    move-result-object p0

    return-object p0

    .line 115
    :cond_3
    new-instance v0, Ll/ۢۙᩳ;

    invoke-direct {v0, p0, p1}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    return-object v0
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    if-ltz p1, :cond_2

    .line 22
    invoke-virtual {p0}, Ll/ܺۙᩳ;->ۧ()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 23
    iget-object v0, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    .line 24
    :goto_0
    iget-object v1, v0, Ll/ۢۙᩳ;->ۧ:Ljava/lang/Object;

    if-nez v1, :cond_1

    .line 25
    iget-object v1, v0, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    iget v2, v1, Ll/ۢۙᩳ;->᩻:I

    if-ge p1, v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v2

    .line 26
    iget-object v0, v0, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    goto :goto_0

    :cond_1
    return-object v1

    .line 22
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid history index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 19
    iget-object v0, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 77
    new-instance v0, Ll/᩷ۙᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/᩷ۙᩳ;-><init>(Ll/ܺۙᩳ;Z)V

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1

    .line 32
    invoke-virtual {p0}, Ll/ܺۙᩳ;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ll/ܺۙᩳ;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final removeFirst()Ll/ܺۙᩳ;
    .locals 3

    .line 53
    iget-object v0, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    if-eqz v0, :cond_1

    .line 68
    invoke-virtual {p0}, Ll/ܺۙᩳ;->ۧ()I

    move-result v1

    const/4 v2, 0x1

    if-gt v2, v1, :cond_0

    .line 64
    new-instance v1, Ll/ܺۙᩳ;

    invoke-static {v0, v2}, Ll/ܺۙᩳ;->֫(Ll/ۢۙᩳ;I)Ll/ۡۙᩳ;

    move-result-object v0

    iget-object v0, v0, Ll/ۡۙᩳ;->ۧ:Ll/ۢۙᩳ;

    invoke-direct {v1, v0}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    return-object v1

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid history count"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final removeLast()Ll/ܺۙᩳ;
    .locals 3

    .line 48
    iget-object v0, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {p0}, Ll/ܺۙᩳ;->ۧ()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 68
    invoke-virtual {p0}, Ll/ܺۙᩳ;->ۧ()I

    move-result v2

    if-gt v1, v2, :cond_0

    .line 59
    new-instance v2, Ll/ܺۙᩳ;

    invoke-static {v0, v1}, Ll/ܺۙᩳ;->֫(Ll/ۢۙᩳ;I)Ll/ۡۙᩳ;

    move-result-object v0

    iget-object v0, v0, Ll/ۡۙᩳ;->֫:Ll/ۢۙᩳ;

    invoke-direct {v2, v0}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    return-object v2

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid history count"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 48
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ֫(Ljava/lang/Object;)Ll/ܺۙᩳ;
    .locals 2

    .line 35
    new-instance v0, Ll/ܺۙᩳ;

    new-instance v1, Ll/ۢۙᩳ;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, p1}, Ll/ۢۙᩳ;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    invoke-static {p1, v1}, Ll/ܺۙᩳ;->ۧ(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    return-object v0
.end method

.method public final ֫(Ll/ܺۙᩳ;)Ll/ܺۙᩳ;
    .locals 2

    .line 39
    new-instance v0, Ll/ܺۙᩳ;

    iget-object v1, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    iget-object p1, p1, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    invoke-static {v1, p1}, Ll/ܺۙᩳ;->ۧ(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)Ll/ۢۙᩳ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Ll/ۢۙᩳ;->᩻:I

    return v0
.end method

.method public final ۧ(Ljava/lang/Object;)Ll/ܺۙᩳ;
    .locals 2

    .line 43
    iget-object v0, p0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    if-eqz v0, :cond_0

    .line 44
    new-instance v1, Ll/ܺۙᩳ;

    invoke-static {v0, p1}, Ll/ܺۙᩳ;->֫(Ll/ۢۙᩳ;Ljava/lang/Object;)Ll/ۢۙᩳ;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    return-object v1

    .line 43
    :cond_0
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method
