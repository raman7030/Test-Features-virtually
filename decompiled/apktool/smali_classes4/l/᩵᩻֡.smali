.class public final Ll/᩵᩻֡;
.super Ljava/lang/Object;
.source "TASN"


# instance fields
.field public final ֫:I

.field public final ۧ:[Ll/ᩴ᩻֡;


# direct methods
.method public constructor <init>([Ll/ᩴ᩻֡;)V
    .locals 4

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/᩵᩻֡;->ۧ:[Ll/ᩴ᩻֡;

    .line 45
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v3, p1, v1

    .line 46
    invoke-static {v2, v3}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 49
    :cond_0
    array-length p1, p1

    invoke-static {v2, p1}, Ll/֫᩸ۡ;->֫(II)I

    move-result p1

    iput p1, p0, Ll/᩵᩻֡;->֫:I

    return-void
.end method

.method public static ֫(Ll/᩵᩻֡;Ll/ᩴ᩻֡;)Ll/᩵᩻֡;
    .locals 2

    const/4 v0, 0x1

    if-nez p0, :cond_0

    .line 69
    new-instance p0, Ll/᩵᩻֡;

    new-array v0, v0, [Ll/ᩴ᩻֡;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-direct {p0, v0}, Ll/᩵᩻֡;-><init>([Ll/ᩴ᩻֡;)V

    return-object p0

    .line 72
    :cond_0
    iget-object p0, p0, Ll/᩵᩻֡;->ۧ:[Ll/ᩴ᩻֡;

    array-length v1, p0

    add-int/2addr v1, v0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/ᩴ᩻֡;

    .line 73
    array-length v1, p0

    sub-int/2addr v1, v0

    aput-object p1, p0, v1

    .line 74
    new-instance p1, Ll/᩵᩻֡;

    invoke-direct {p1, p0}, Ll/᩵᩻֡;-><init>([Ll/ᩴ᩻֡;)V

    return-object p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 188
    :cond_0
    instance-of v1, p1, Ll/᩵᩻֡;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 192
    :cond_1
    check-cast p1, Ll/᩵᩻֡;

    .line 193
    iget v1, p0, Ll/᩵᩻֡;->֫:I

    iget v3, p1, Ll/᩵᩻֡;->֫:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/᩵᩻֡;->ۧ:[Ll/ᩴ᩻֡;

    iget-object p1, p1, Ll/᩵᩻֡;->ۧ:[Ll/ᩴ᩻֡;

    .line 194
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 1

    .line 180
    iget v0, p0, Ll/᩵᩻֡;->֫:I

    return v0
.end method

.method public final ֫(I)Ll/᩵᩻֡;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 108
    :goto_0
    iget-object v2, p0, Ll/᩵᩻֡;->ۧ:[Ll/ᩴ᩻֡;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    .line 109
    aget-object v3, v2, v1

    invoke-interface {v3}, Ll/ᩴ᩻֡;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    aget-object v3, v2, v1

    instance-of v3, v3, Ll/۠᩻֡;

    if-nez v3, :cond_1

    if-nez v0, :cond_0

    .line 111
    invoke-virtual {v2}, [Ll/ᩴ᩻֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴ᩻֡;

    .line 114
    :cond_0
    new-instance v3, Ll/۠᩻֡;

    aget-object v2, v2, v1

    invoke-direct {v3, p1, v2}, Ll/۠᩻֡;-><init>(ILl/ᩴ᩻֡;)V

    aput-object v3, v0, v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    return-object p0

    .line 122
    :cond_3
    new-instance p1, Ll/᩵᩻֡;

    invoke-direct {p1, v0}, Ll/᩵᩻֡;-><init>([Ll/ᩴ᩻֡;)V

    return-object p1
.end method

.method public final ֫(Ll/᩻ܳ֡;Ll/᩺ܿ֡;I)V
    .locals 7

    .line 154
    invoke-interface {p2}, Ll/ܳܳ֡;->index()I

    move-result v0

    const/4 v1, 0x0

    .line 156
    :try_start_0
    iget-object v2, p0, Ll/᩵᩻֡;->ۧ:[Ll/ᩴ᩻֡;

    array-length v1, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    :try_start_1
    aget-object v5, v2, v3

    .line 157
    instance-of v6, v5, Ll/۠᩻֡;

    if-eqz v6, :cond_0

    .line 158
    move-object v6, v5

    check-cast v6, Ll/۠᩻֡;

    invoke-virtual {v6}, Ll/۠᩻֡;->ܽ()I

    move-result v6

    add-int/2addr v6, p3

    .line 159
    invoke-interface {p2, v6}, Ll/ܳܳ֡;->֫(I)V

    .line 160
    check-cast v5, Ll/۠᩻֡;

    invoke-virtual {v5}, Ll/۠᩻֡;->ۧ()Ll/ᩴ᩻֡;

    move-result-object v5

    if-eq v6, v0, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    .line 163
    :cond_0
    invoke-interface {v5}, Ll/ᩴ᩻֡;->֫()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 164
    invoke-interface {p2, v0}, Ll/ܳܳ֡;->֫(I)V

    :cond_1
    const/4 v4, 0x0

    .line 168
    :cond_2
    :goto_1
    invoke-interface {v5, p1}, Ll/ᩴ᩻֡;->֫(Ll/᩻ܳ֡;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    move v1, v4

    goto :goto_2

    :cond_3
    if-eqz v4, :cond_4

    .line 173
    invoke-interface {p2, v0}, Ll/ܳܳ֡;->֫(I)V

    :cond_4
    return-void

    :catchall_1
    move-exception p1

    :goto_2
    if-eqz v1, :cond_5

    invoke-interface {p2, v0}, Ll/ܳܳ֡;->֫(I)V

    .line 175
    :cond_5
    throw p1
.end method
