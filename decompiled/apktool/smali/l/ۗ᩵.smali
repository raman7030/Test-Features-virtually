.class public Ll/ۗ᩵;
.super Ljava/lang/Object;
.source "05OF"


# static fields
.field public static ֫۠۟:I

.field public static ۗ:I

.field public static ۙ:[Ljava/lang/Object;

.field public static ۫:I

.field public static ۬:[Ljava/lang/Object;


# instance fields
.field public ᩶:I

.field public ᩸:[Ljava/lang/Object;

.field public ᩹:[I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>()V
    .locals 1

    .line 236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 237
    sget-object v0, Ll/֡᩵;->֫:[I

    iput-object v0, p0, Ll/ۗ᩵;->᩹:[I

    .line 238
    sget-object v0, Ll/֡᩵;->ۧ:[Ljava/lang/Object;

    iput-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 239
    iput v0, p0, Ll/ۗ᩵;->᩶:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 248
    sget-object p1, Ll/֡᩵;->֫:[I

    iput-object p1, p0, Ll/ۗ᩵;->᩹:[I

    .line 249
    sget-object p1, Ll/֡᩵;->ۧ:[Ljava/lang/Object;

    iput-object p1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    goto :goto_0

    .line 251
    :cond_0
    invoke-direct {p0, p1}, Ll/ۗ᩵;->ۜ(I)V

    :goto_0
    const/4 p1, 0x0

    .line 253
    iput p1, p0, Ll/ۗ᩵;->᩶:I

    return-void
.end method

.method public static ֡֫ܶ(IILjava/lang/Object;)V
    .locals 0

    check-cast p2, [B

    invoke-static {p0, p1, p2}, Ll/ܺܰۡ;->֫(II[B)V

    return-void
.end method

.method public static ֫([I[Ljava/lang/Object;I)V
    .locals 7

    .line 201
    array-length v0, p0

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/16 v5, 0xa

    const/4 v6, 0x1

    if-ne v0, v1, :cond_2

    .line 202
    const-class v0, Ll/ۗ᩵;

    monitor-enter v0

    .line 203
    :try_start_0
    sget v1, Ll/ۗ᩵;->۫:I

    if-ge v1, v5, :cond_1

    .line 204
    sget-object v1, Ll/ۗ᩵;->۬:[Ljava/lang/Object;

    aput-object v1, p1, v4

    .line 205
    aput-object p0, p1, v6

    shl-int/lit8 p0, p2, 0x1

    sub-int/2addr p0, v6

    :goto_0
    if-lt p0, v3, :cond_0

    .line 207
    aput-object v2, p1, p0

    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    .line 209
    :cond_0
    sput-object p1, Ll/ۗ᩵;->۬:[Ljava/lang/Object;

    .line 210
    sget p0, Ll/ۗ᩵;->۫:I

    add-int/2addr p0, v6

    sput p0, Ll/ۗ᩵;->۫:I

    .line 214
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 215
    :cond_2
    array-length v0, p0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 216
    const-class v0, Ll/ۗ᩵;

    monitor-enter v0

    .line 217
    :try_start_1
    sget v1, Ll/ۗ᩵;->ۗ:I

    if-ge v1, v5, :cond_4

    .line 218
    sget-object v1, Ll/ۗ᩵;->ۙ:[Ljava/lang/Object;

    aput-object v1, p1, v4

    .line 219
    aput-object p0, p1, v6

    shl-int/lit8 p0, p2, 0x1

    sub-int/2addr p0, v6

    :goto_1
    if-lt p0, v3, :cond_3

    .line 221
    aput-object v2, p1, p0

    add-int/lit8 p0, p0, -0x1

    goto :goto_1

    .line 223
    :cond_3
    sput-object p1, Ll/ۗ᩵;->ۙ:[Ljava/lang/Object;

    .line 224
    sget p0, Ll/ۗ᩵;->ۗ:I

    add-int/2addr p0, v6

    sput p0, Ll/ۗ᩵;->ۗ:I

    .line 228
    :cond_4
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0

    :cond_5
    return-void
.end method

.method public static ֫ۖ᩻()I
    .locals 1

    const v0, 0x1d3b2d06

    return v0
.end method

.method public static ֫ۧܺ(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ᩶ۨ()Landroid/app/Application;
    .locals 1

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method private ۜ(I)V
    .locals 5

    const/16 v0, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p1, v0, :cond_1

    .line 166
    const-class v0, Ll/ۗ᩵;

    monitor-enter v0

    .line 167
    :try_start_0
    sget-object v4, Ll/ۗ᩵;->۬:[Ljava/lang/Object;

    if-eqz v4, :cond_0

    .line 169
    iput-object v4, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    .line 170
    aget-object p1, v4, v2

    check-cast p1, [Ljava/lang/Object;

    sput-object p1, Ll/ۗ᩵;->۬:[Ljava/lang/Object;

    .line 171
    aget-object p1, v4, v3

    check-cast p1, [I

    iput-object p1, p0, Ll/ۗ᩵;->᩹:[I

    .line 172
    aput-object v1, v4, v3

    aput-object v1, v4, v2

    .line 173
    sget p1, Ll/ۗ᩵;->۫:I

    sub-int/2addr p1, v3

    sput p1, Ll/ۗ᩵;->۫:I

    .line 176
    monitor-exit v0

    return-void

    .line 178
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    .line 180
    const-class v0, Ll/ۗ᩵;

    monitor-enter v0

    .line 181
    :try_start_1
    sget-object v4, Ll/ۗ᩵;->ۙ:[Ljava/lang/Object;

    if-eqz v4, :cond_2

    .line 183
    iput-object v4, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    .line 184
    aget-object p1, v4, v2

    check-cast p1, [Ljava/lang/Object;

    sput-object p1, Ll/ۗ᩵;->ۙ:[Ljava/lang/Object;

    .line 185
    aget-object p1, v4, v3

    check-cast p1, [I

    iput-object p1, p0, Ll/ۗ᩵;->᩹:[I

    .line 186
    aput-object v1, v4, v3

    aput-object v1, v4, v2

    .line 187
    sget p1, Ll/ۗ᩵;->ۗ:I

    sub-int/2addr p1, v3

    sput p1, Ll/ۗ᩵;->ۗ:I

    .line 190
    monitor-exit v0

    return-void

    .line 192
    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    .line 195
    :cond_3
    :goto_0
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ۗ᩵;->᩹:[I

    shl-int/2addr p1, v3

    .line 196
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    return-void
.end method

.method public static ۡᩴۙ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method

.method public static ۢܰܰ(JJ)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ۧ֡֫(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ۨᩴ۫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۤ᩸ᩳ;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ll/ۤ᩸ᩳ;->append(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ܳ֡ۜ(Ljava/lang/Object;CLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Ll/۬۟ۘ;

    invoke-interface {p0, p1, p2}, Ll/۬۟ۘ;->֫(CLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ܳ᩺᩷(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    check-cast p0, Ljava/util/IdentityHashMap;

    invoke-virtual {p0}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ܶᩴ۬(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, [Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ܶ᩺᩹([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ܿۚۗ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ᩴ᩵ܰ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->ۧ(I)V

    return-void
.end method

.method public static ᩵ۨۘ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    check-cast p0, Ll/ܺ֫ۚ;

    invoke-interface {p0}, Ll/ܺ֫ۚ;->ۧ()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ᩺ᩴۗ(Ljava/lang/Object;I)I
    .locals 0

    check-cast p0, Landroid/content/res/Resources$Theme;

    invoke-static {p0, p1}, Ll/᩸֡᩷;->ۧ(Landroid/content/res/Resources$Theme;I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final clear()V
    .locals 4

    .line 270
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    if-lez v0, :cond_0

    .line 271
    iget-object v1, p0, Ll/ۗ᩵;->᩹:[I

    .line 272
    iget-object v2, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    .line 274
    sget-object v3, Ll/֡᩵;->֫:[I

    iput-object v3, p0, Ll/ۗ᩵;->᩹:[I

    .line 275
    sget-object v3, Ll/֡᩵;->ۧ:[Ljava/lang/Object;

    iput-object v3, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    const/4 v3, 0x0

    .line 276
    iput v3, p0, Ll/ۗ᩵;->᩶:I

    .line 277
    invoke-static {v1, v2, v0}, Ll/ۗ᩵;->֫([I[Ljava/lang/Object;I)V

    .line 279
    :cond_0
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    if-gtz v0, :cond_1

    return-void

    .line 280
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 312
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->֫(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 352
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->ۧ(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 684
    :cond_0
    instance-of v1, p1, Ll/ۗ᩵;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    .line 685
    check-cast p1, Ll/ۗ᩵;

    .line 668
    iget v1, p0, Ll/ۗ᩵;->᩶:I

    iget v3, p1, Ll/ۗ᩵;->᩶:I

    if-eq v1, v3, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x0

    .line 691
    :goto_0
    :try_start_0
    iget v3, p0, Ll/ۗ᩵;->᩶:I

    if-ge v1, v3, :cond_5

    .line 692
    invoke-virtual {p0, v1}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v3

    .line 693
    invoke-virtual {p0, v1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    .line 369
    invoke-virtual {p1, v3, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    if-nez v5, :cond_2

    .line 696
    invoke-virtual {p1, v3}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_2
    return v2

    .line 699
    :cond_3
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_4

    return v2

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return v0

    :catch_0
    return v2

    .line 709
    :cond_6
    instance-of v1, p1, Ljava/util/Map;

    if-eqz v1, :cond_c

    .line 710
    check-cast p1, Ljava/util/Map;

    .line 668
    iget v1, p0, Ll/ۗ᩵;->᩶:I

    .line 711
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v3

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    const/4 v1, 0x0

    .line 716
    :goto_1
    :try_start_1
    iget v3, p0, Ll/ۗ᩵;->᩶:I

    if-ge v1, v3, :cond_b

    .line 717
    invoke-virtual {p0, v1}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v3

    .line 718
    invoke-virtual {p0, v1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v4

    .line 719
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_9

    if-nez v5, :cond_8

    .line 721
    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_8
    return v2

    .line 724
    :cond_9
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v3, :cond_a

    return v2

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_b
    return v0

    :catch_1
    :cond_c
    return v2
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 369
    invoke-virtual {p0, p1, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 380
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->֫(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 381
    iget-object p2, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, p2, p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public final hashCode()I
    .locals 8

    .line 743
    iget-object v0, p0, Ll/ۗ᩵;->᩹:[I

    .line 744
    iget-object v1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    .line 746
    iget v2, p0, Ll/ۗ᩵;->᩶:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    .line 747
    aget-object v6, v1, v3

    .line 748
    aget v7, v0, v4

    if-nez v6, :cond_0

    const/4 v6, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v6

    :goto_1
    xor-int/2addr v6, v7

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_1
    return v5
.end method

.method public final isEmpty()Z
    .locals 1

    .line 419
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 432
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 437
    invoke-virtual {p0}, Ll/ۗ᩵;->֫()I

    move-result v2

    const/4 v3, 0x0

    goto :goto_0

    .line 439
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    .line 440
    invoke-virtual {p0, v3, p1}, Ll/ۗ᩵;->֫(ILjava/lang/Object;)I

    move-result v2

    :goto_0
    if-ltz v2, :cond_1

    shl-int/lit8 p1, v2, 0x1

    add-int/lit8 p1, p1, 0x1

    .line 444
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 445
    aput-object p2, v0, p1

    return-object v1

    :cond_1
    not-int v2, v2

    .line 450
    iget-object v4, p0, Ll/ۗ᩵;->᩹:[I

    array-length v5, v4

    if-lt v0, v5, :cond_6

    const/16 v5, 0x8

    if-lt v0, v5, :cond_2

    shr-int/lit8 v5, v0, 0x1

    add-int/2addr v5, v0

    goto :goto_1

    :cond_2
    const/4 v6, 0x4

    if-lt v0, v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x4

    .line 457
    :goto_1
    iget-object v6, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    .line 458
    invoke-direct {p0, v5}, Ll/ۗ᩵;->ۜ(I)V

    .line 460
    iget v5, p0, Ll/ۗ᩵;->᩶:I

    if-ne v0, v5, :cond_5

    .line 464
    iget-object v5, p0, Ll/ۗ᩵;->᩹:[I

    array-length v7, v5

    if-lez v7, :cond_4

    .line 466
    array-length v7, v4

    invoke-static {v4, v1, v5, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 467
    iget-object v5, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    array-length v7, v6

    invoke-static {v6, v1, v5, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 470
    :cond_4
    invoke-static {v4, v6, v0}, Ll/ۗ᩵;->֫([I[Ljava/lang/Object;I)V

    goto :goto_2

    .line 461
    :cond_5
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_6
    :goto_2
    if-ge v2, v0, :cond_7

    .line 476
    iget-object v1, p0, Ll/ۗ᩵;->᩹:[I

    add-int/lit8 v4, v2, 0x1

    sub-int v5, v0, v2

    invoke-static {v1, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 477
    iget-object v1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v5, v2, 0x1

    shl-int/lit8 v4, v4, 0x1

    iget v6, p0, Ll/ۗ᩵;->᩶:I

    sub-int/2addr v6, v2

    shl-int/lit8 v6, v6, 0x1

    invoke-static {v1, v5, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 481
    :cond_7
    iget v1, p0, Ll/ۗ᩵;->᩶:I

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Ll/ۗ᩵;->᩹:[I

    array-length v4, v0

    if-ge v2, v4, :cond_8

    .line 486
    aput v3, v0, v2

    .line 487
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v2, v2, 0x1

    aput-object p1, v0, v2

    add-int/lit8 v2, v2, 0x1

    .line 488
    aput-object p2, v0, v2

    add-int/lit8 v1, v1, 0x1

    .line 489
    iput v1, p0, Ll/ۗ᩵;->᩶:I

    const/4 p1, 0x0

    return-object p1

    .line 482
    :cond_8
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method public final putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 369
    invoke-virtual {p0, p1, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 525
    invoke-virtual {p0, p1, p2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 538
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->֫(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 540
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->ܿ(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 553
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->֫(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 555
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v0

    if-eq p2, v0, :cond_0

    if-eqz p2, :cond_1

    .line 556
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 557
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->ܿ(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 637
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->֫(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    .line 410
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 411
    aput-object p2, v0, p1

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 653
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->֫(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 655
    invoke-virtual {p0, p1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p2, :cond_0

    if-eqz p2, :cond_1

    .line 656
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    const/4 p2, 0x1

    shl-int/2addr p1, p2

    add-int/2addr p1, p2

    .line 410
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 411
    aput-object p3, v0, p1

    return p2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 668
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 762
    invoke-virtual {p0}, Ll/ۗ᩵;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    .line 766
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۗ᩵;->᩶:I

    mul-int/lit8 v1, v1, 0x1c

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    .line 767
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 768
    :goto_0
    iget v2, p0, Ll/ۗ᩵;->᩶:I

    if-ge v1, v2, :cond_4

    if-lez v1, :cond_1

    const-string v2, ", "

    .line 770
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    :cond_1
    invoke-virtual {p0, v1}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "(this Map)"

    if-eq v2, p0, :cond_2

    .line 774
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 776
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const/16 v2, 0x3d

    .line 778
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 779
    invoke-virtual {p0, v1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_3

    .line 781
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 783
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/16 v1, 0x7d

    .line 786
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 787
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 5

    .line 126
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 133
    :cond_0
    iget-object v1, p0, Ll/ۗ᩵;->᩹:[I

    const/4 v2, 0x0

    .line 77
    :try_start_0
    invoke-static {v0, v2, v1}, Ll/֡᩵;->֫(II[I)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v1, :cond_1

    goto :goto_0

    .line 141
    :cond_1
    iget-object v2, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v3, v1, 0x1

    aget-object v2, v2, v3

    if-nez v2, :cond_2

    :goto_0
    return v1

    :cond_2
    add-int/lit8 v2, v1, 0x1

    :goto_1
    if-ge v2, v0, :cond_4

    .line 147
    iget-object v3, p0, Ll/ۗ᩵;->᩹:[I

    aget v3, v3, v2

    if-nez v3, :cond_4

    .line 148
    iget-object v3, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v4, v2, 0x1

    aget-object v3, v3, v4

    if-nez v3, :cond_3

    return v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_5

    .line 152
    iget-object v0, p0, Ll/ۗ᩵;->᩹:[I

    aget v0, v0, v1

    if-nez v0, :cond_5

    .line 153
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v3, v1, 0x1

    aget-object v0, v0, v3

    if-nez v0, :cond_4

    return v1

    :cond_5
    not-int v0, v2

    return v0

    .line 80
    :catch_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final ֫(ILjava/lang/Object;)I
    .locals 5

    .line 88
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 95
    :cond_0
    iget-object v1, p0, Ll/ۗ᩵;->᩹:[I

    .line 77
    :try_start_0
    invoke-static {v0, p1, v1}, Ll/֡᩵;->֫(II[I)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v1, :cond_1

    goto :goto_0

    .line 103
    :cond_1
    iget-object v2, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v3, v1, 0x1

    aget-object v2, v2, v3

    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_0
    return v1

    :cond_2
    add-int/lit8 v2, v1, 0x1

    :goto_1
    if-ge v2, v0, :cond_4

    .line 109
    iget-object v3, p0, Ll/ۗ᩵;->᩹:[I

    aget v3, v3, v2

    if-ne v3, p1, :cond_4

    .line 110
    iget-object v3, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v4, v2, 0x1

    aget-object v3, v3, v4

    invoke-virtual {p2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_5

    .line 114
    iget-object v0, p0, Ll/ۗ᩵;->᩹:[I

    aget v0, v0, v1

    if-ne v0, p1, :cond_5

    .line 115
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v3, v1, 0x1

    aget-object v0, v0, v3

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_5
    not-int p1, v2

    return p1

    .line 80
    :catch_0
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/Object;)I
    .locals 1

    if-nez p1, :cond_0

    .line 322
    invoke-virtual {p0}, Ll/ۗ᩵;->֫()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Ll/ۗ᩵;->֫(ILjava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 4

    .line 326
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    mul-int/lit8 v0, v0, 0x2

    .line 327
    iget-object v1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    :goto_0
    if-ge p1, v0, :cond_3

    .line 330
    aget-object v2, v1, p1

    if-nez v2, :cond_0

    shr-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    :goto_1
    if-ge v2, v0, :cond_3

    .line 336
    aget-object v3, v1, v2

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    shr-int/lit8 p1, v2, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method public final ۧ(I)V
    .locals 5

    .line 289
    iget v0, p0, Ll/ۗ᩵;->᩶:I

    .line 290
    iget-object v1, p0, Ll/ۗ᩵;->᩹:[I

    array-length v2, v1

    if-ge v2, p1, :cond_1

    .line 292
    iget-object v2, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    .line 293
    invoke-direct {p0, p1}, Ll/ۗ᩵;->ۜ(I)V

    .line 294
    iget p1, p0, Ll/ۗ᩵;->᩶:I

    if-lez p1, :cond_0

    .line 295
    iget-object p1, p0, Ll/ۗ᩵;->᩹:[I

    const/4 v3, 0x0

    invoke-static {v1, v3, p1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 296
    iget-object p1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v4, v0, 0x1

    invoke-static {v2, v3, p1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 298
    :cond_0
    invoke-static {v1, v2, v0}, Ll/ۗ᩵;->֫([I[Ljava/lang/Object;I)V

    .line 300
    :cond_1
    iget p1, p0, Ll/ۗ᩵;->᩶:I

    if-ne p1, v0, :cond_2

    return-void

    .line 301
    :cond_2
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method public final ܳ(I)Ljava/lang/Object;
    .locals 1

    .line 399
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ܽ(I)Ljava/lang/Object;
    .locals 1

    .line 390
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ܿ(I)Ljava/lang/Object;
    .locals 10

    .line 570
    iget-object v0, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v1, p1, 0x1

    add-int/lit8 v2, v1, 0x1

    aget-object v2, v0, v2

    .line 571
    iget v3, p0, Ll/ۗ᩵;->᩶:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-gt v3, v5, :cond_0

    .line 576
    iget-object p1, p0, Ll/ۗ᩵;->᩹:[I

    invoke-static {p1, v0, v3}, Ll/ۗ᩵;->֫([I[Ljava/lang/Object;I)V

    .line 577
    sget-object p1, Ll/֡᩵;->֫:[I

    iput-object p1, p0, Ll/ۗ᩵;->᩹:[I

    .line 578
    sget-object p1, Ll/֡᩵;->ۧ:[Ljava/lang/Object;

    iput-object p1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v3, -0x1

    .line 582
    iget-object v7, p0, Ll/ۗ᩵;->᩹:[I

    array-length v8, v7

    const/16 v9, 0x8

    if-le v8, v9, :cond_4

    array-length v8, v7

    div-int/lit8 v8, v8, 0x3

    if-ge v3, v8, :cond_4

    if-le v3, v9, :cond_1

    shr-int/lit8 v5, v3, 0x1

    add-int v9, v3, v5

    .line 592
    :cond_1
    invoke-direct {p0, v9}, Ll/ۗ᩵;->ۜ(I)V

    .line 594
    iget v5, p0, Ll/ۗ᩵;->᩶:I

    if-ne v3, v5, :cond_3

    if-lez p1, :cond_2

    .line 600
    iget-object v5, p0, Ll/ۗ᩵;->᩹:[I

    invoke-static {v7, v4, v5, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 601
    iget-object v5, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    invoke-static {v0, v4, v5, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    if-ge p1, v6, :cond_6

    add-int/lit8 v4, p1, 0x1

    .line 606
    iget-object v5, p0, Ll/ۗ᩵;->᩹:[I

    sub-int v8, v6, p1

    invoke-static {v7, v4, v5, p1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    shl-int/lit8 p1, v4, 0x1

    .line 607
    iget-object v4, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v5, v8, 0x1

    invoke-static {v0, p1, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 595
    :cond_3
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_4
    if-ge p1, v6, :cond_5

    add-int/lit8 v0, p1, 0x1

    sub-int v4, v6, p1

    .line 614
    invoke-static {v7, v0, v7, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 615
    iget-object p1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/2addr v0, v5

    shl-int/2addr v4, v5

    invoke-static {p1, v0, p1, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 618
    :cond_5
    iget-object p1, p0, Ll/ۗ᩵;->᩸:[Ljava/lang/Object;

    shl-int/lit8 v0, v6, 0x1

    const/4 v1, 0x0

    aput-object v1, p1, v0

    add-int/2addr v0, v5

    .line 619
    aput-object v1, p1, v0

    :cond_6
    :goto_0
    move v4, v6

    .line 622
    :goto_1
    iget p1, p0, Ll/ۗ᩵;->᩶:I

    if-ne v3, p1, :cond_7

    .line 625
    iput v4, p0, Ll/ۗ᩵;->᩶:I

    return-object v2

    .line 623
    :cond_7
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method
