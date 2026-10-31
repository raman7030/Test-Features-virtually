.class public final Ll/ᩳۜ᩵;
.super Ljava/lang/Object;
.source "H6Q8"


# static fields
.field public static final ۖ:J

.field public static final ۘ:Lsun/misc/Unsafe;

.field public static final ۡ:I

.field public static final ܺ:I


# instance fields
.field public ֫:[Ll/ۡۜ᩵;

.field public volatile ۜ:I

.field public ۢ:I

.field public volatile ۧ:I

.field public volatile ܳ:I

.field public ܽ:I

.field public final ܿ:Ll/ۘۜ᩵;

.field public ᩳ:I

.field public ᩷:I

.field public final ᩻:Ll/ܿۜ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1009
    const-class v0, [Ll/ۡۜ᩵;

    sget-object v1, Ll/֨ۜ᩵;->֫:Lsun/misc/Unsafe;

    sput-object v1, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    .line 1015
    :try_start_0
    const-class v2, Ll/ᩳۜ᩵;

    const-string v3, "\u0733"

    .line 1016
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/ᩳۜ᩵;->ۖ:J

    .line 1017
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    move-result v2

    sput v2, Ll/ᩳۜ᩵;->ۡ:I

    .line 1018
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 1021
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x1f

    sput v0, Ll/ᩳۜ᩵;->ܺ:I

    return-void

    .line 1020
    :cond_0
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    const-string v1, "array index scale not a power of two"

    invoke-direct {v0, v1}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 1023
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Ll/ܿۜ᩵;Ll/ۘۜ᩵;)V
    .locals 0

    .line 746
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 747
    iput-object p1, p0, Ll/ᩳۜ᩵;->᩻:Ll/ܿۜ᩵;

    .line 748
    iput-object p2, p0, Ll/ᩳۜ᩵;->ܿ:Ll/ۘۜ᩵;

    const/16 p1, 0x1000

    .line 750
    iput p1, p0, Ll/ᩳۜ᩵;->ۢ:I

    iput p1, p0, Ll/ᩳۜ᩵;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 10

    .line 790
    iget-object v0, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v0, :cond_0

    .line 791
    array-length v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x2000

    if-lez v1, :cond_1

    shl-int/lit8 v3, v1, 0x1

    goto :goto_1

    :cond_1
    const/16 v3, 0x2000

    :goto_1
    if-lt v3, v2, :cond_5

    const/high16 v2, 0x4000000

    if-gt v3, v2, :cond_5

    .line 796
    new-array v2, v3, [Ll/ۡۜ᩵;

    iput-object v2, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v0, :cond_4

    add-int/lit8 v1, v1, -0x1

    if-lez v1, :cond_4

    .line 797
    iget v4, p0, Ll/ᩳۜ᩵;->ۢ:I

    iget v5, p0, Ll/ᩳۜ᩵;->ۧ:I

    sub-int v6, v4, v5

    if-lez v6, :cond_4

    add-int/lit8 v3, v3, -0x1

    :cond_2
    and-int v6, v5, v1

    int-to-long v6, v6

    .line 802
    sget v8, Ll/ᩳۜ᩵;->ܺ:I

    shl-long/2addr v6, v8

    sget v8, Ll/ᩳۜ᩵;->ۡ:I

    int-to-long v8, v8

    add-long/2addr v6, v8

    .line 803
    sget-object v8, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    .line 804
    invoke-virtual {v8, v0, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۡۜ᩵;

    if-eqz v9, :cond_3

    .line 806
    invoke-static {v8, v0, v6, v7, v9}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    and-int v6, v5, v3

    .line 807
    aput-object v9, v2, v6

    :cond_3
    add-int/lit8 v5, v5, 0x1

    if-ne v5, v4, :cond_2

    .line 809
    invoke-static {}, Ll/ܽۜ᩵;->ۧ()V

    :cond_4
    return-void

    .line 794
    :cond_5
    new-instance v0, Ljava/util/concurrent/RejectedExecutionException;

    const-string v1, "Queue capacity exceeded"

    invoke-direct {v0, v1}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 10

    :cond_0
    const/4 v0, 0x0

    .line 905
    :cond_1
    iget v1, p0, Ll/ᩳۜ᩵;->ۧ:I

    iget v2, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 906
    iget-object v3, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v3, :cond_3

    sub-int v2, v1, v2

    if-gez v2, :cond_3

    array-length v4, v3

    if-lez v4, :cond_3

    add-int/lit8 v4, v4, -0x1

    add-int/lit8 v5, v1, 0x1

    and-int/2addr v1, v4

    int-to-long v6, v1

    .line 909
    sget v1, Ll/ᩳۜ᩵;->ܺ:I

    shl-long/2addr v6, v1

    sget v1, Ll/ᩳۜ᩵;->ۡ:I

    int-to-long v8, v1

    add-long/2addr v6, v8

    .line 911
    invoke-static {v6, v7, v3}, Ll/ܿۜ᩵;->֫(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡۜ᩵;

    if-eqz v1, :cond_2

    .line 913
    iput v5, p0, Ll/ᩳۜ᩵;->ۧ:I

    .line 914
    invoke-virtual {v1}, Ll/ۡۜ᩵;->ۧ()I

    if-eqz p1, :cond_1

    add-int/lit8 v0, v0, 0x1

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    if-ne v2, v0, :cond_0

    :cond_3
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۡۜ᩵;)V
    .locals 7

    .line 768
    iget v0, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 769
    iget-object v1, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v1, :cond_1

    array-length v2, v1

    if-lez v2, :cond_1

    add-int/lit8 v3, v2, -0x1

    and-int/2addr v3, v0

    int-to-long v3, v3

    .line 771
    sget v5, Ll/ᩳۜ᩵;->ܺ:I

    shl-long/2addr v3, v5

    sget v5, Ll/ᩳۜ᩵;->ۡ:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    .line 772
    iget-object v5, p0, Ll/ᩳۜ᩵;->᩻:Ll/ܿۜ᩵;

    add-int/lit8 v6, v0, 0x1

    .line 773
    iput v6, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 774
    sget-object v6, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    invoke-virtual {v6, v1, v3, v4, p1}, Lsun/misc/Unsafe;->putOrderedObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 775
    iget p1, p0, Ll/ᩳۜ᩵;->ۧ:I

    sub-int/2addr p1, v0

    if-nez p1, :cond_0

    .line 776
    invoke-static {}, Ll/ܽۜ᩵;->֫()V

    .line 777
    invoke-virtual {v5}, Ll/ܿۜ᩵;->ܽ()V

    return-void

    :cond_0
    add-int/2addr p1, v2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 780
    invoke-virtual {p0}, Ll/ᩳۜ᩵;->֫()V

    :cond_1
    return-void
.end method

.method public final ۧ()Ll/ۡۜ᩵;
    .locals 9

    .line 819
    :cond_0
    iget v0, p0, Ll/ᩳۜ᩵;->ۧ:I

    iget v1, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 820
    iget-object v2, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v2, :cond_2

    sub-int v1, v0, v1

    if-gez v1, :cond_2

    array-length v3, v2

    if-lez v3, :cond_2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v3, v0

    int-to-long v3, v3

    .line 823
    sget v5, Ll/ᩳۜ᩵;->ܺ:I

    shl-long/2addr v3, v5

    sget v5, Ll/ᩳۜ᩵;->ۡ:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    .line 824
    sget-object v5, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    .line 825
    invoke-virtual {v5, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۡۜ᩵;

    add-int/lit8 v7, v0, 0x1

    .line 826
    iget v8, p0, Ll/ᩳۜ᩵;->ۧ:I

    if-ne v0, v8, :cond_0

    if-eqz v6, :cond_1

    .line 828
    invoke-static {v5, v2, v3, v4, v6}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 829
    iput v7, p0, Ll/ᩳۜ᩵;->ۧ:I

    return-object v6

    :cond_1
    const/4 v0, -0x1

    if-ne v1, v0, :cond_0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 7

    .line 877
    :cond_0
    iget v0, p0, Ll/ᩳۜ᩵;->ۧ:I

    iget v1, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 878
    iget-object v2, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v2, :cond_1

    if-eq v0, v1, :cond_1

    array-length v0, v2

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    int-to-long v3, v0

    .line 880
    sget v0, Ll/ᩳۜ᩵;->ܺ:I

    shl-long/2addr v3, v0

    sget v0, Ll/ᩳۜ᩵;->ۡ:I

    int-to-long v5, v0

    add-long/2addr v3, v5

    .line 882
    invoke-static {v3, v4, v2}, Ll/ܿۜ᩵;->֫(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡۜ᩵;

    if-eqz v0, :cond_1

    .line 884
    iput v1, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 885
    invoke-static {}, Ll/ܽۜ᩵;->ۧ()V

    .line 886
    invoke-virtual {v0}, Ll/ۡۜ᩵;->ۧ()I

    if-eqz p1, :cond_0

    add-int/lit8 p1, p1, -0x1

    if-nez p1, :cond_0

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/ۡۜ᩵;)V
    .locals 12

    .line 933
    iget v0, p0, Ll/ᩳۜ᩵;->ۧ:I

    iget v1, p0, Ll/ᩳۜ᩵;->ۢ:I

    sub-int/2addr v0, v1

    if-gez v0, :cond_3

    iget-object v0, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v0, :cond_3

    array-length v2, v0

    if-lez v2, :cond_3

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v1, v1, -0x1

    move v3, v1

    :goto_0
    and-int v4, v3, v2

    .line 937
    sget v5, Ll/ᩳۜ᩵;->ܺ:I

    shl-int/2addr v4, v5

    sget v5, Ll/ᩳۜ᩵;->ۡ:I

    add-int/2addr v4, v5

    int-to-long v4, v4

    .line 938
    sget-object v6, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    .line 939
    invoke-virtual {v6, v0, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۡۜ᩵;

    if-nez v7, :cond_0

    goto :goto_2

    :cond_0
    if-ne v7, p1, :cond_2

    .line 943
    invoke-static {v6, v0, v4, v5, v7}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 944
    iput v1, p0, Ll/ᩳۜ᩵;->ۢ:I

    :goto_1
    if-eq v3, v1, :cond_1

    add-int/lit8 p1, v3, 0x1

    and-int v4, p1, v2

    .line 948
    sget v5, Ll/ᩳۜ᩵;->ܺ:I

    shl-int/2addr v4, v5

    sget v6, Ll/ᩳۜ᩵;->ۡ:I

    add-int/2addr v4, v6

    int-to-long v8, v4

    .line 949
    sget-object v4, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    invoke-virtual {v4, v0, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۡۜ᩵;

    const/4 v11, 0x0

    .line 950
    invoke-virtual {v4, v0, v8, v9, v11}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    and-int/2addr v3, v2

    shl-int/2addr v3, v5

    add-int/2addr v3, v6

    int-to-long v5, v3

    .line 954
    invoke-virtual {v4, v0, v5, v6, v10}, Lsun/misc/Unsafe;->putOrderedObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move v3, p1

    goto :goto_1

    .line 956
    :cond_1
    invoke-static {}, Ll/ܽۜ᩵;->ۧ()V

    .line 957
    invoke-virtual {v7}, Ll/ۡۜ᩵;->ۧ()I

    return-void

    :cond_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public final ܽ()Z
    .locals 6

    .line 971
    sget-object v0, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    const/4 v4, 0x0

    const/4 v5, 0x1

    sget-wide v2, Ll/ᩳۜ᩵;->ۖ:J

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    return v0
.end method

.method public final ܽ(Ll/ۡۜ᩵;)Z
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    .line 979
    iget v8, v6, Ll/ᩳۜ᩵;->ۢ:I

    add-int/lit8 v9, v8, -0x1

    .line 980
    iget-object v10, v6, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    const/4 v11, 0x0

    if-eqz v10, :cond_1

    array-length v0, v10

    if-lez v0, :cond_1

    const/4 v12, 0x1

    sub-int/2addr v0, v12

    and-int/2addr v0, v9

    int-to-long v0, v0

    .line 982
    sget v2, Ll/ᩳۜ᩵;->ܺ:I

    shl-long/2addr v0, v2

    sget v2, Ll/ᩳۜ᩵;->ۡ:I

    int-to-long v2, v2

    add-long v13, v0, v2

    .line 983
    sget-object v15, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    invoke-virtual {v15, v10, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡۜ᩵;

    if-ne v0, v7, :cond_1

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 985
    sget-wide v2, Ll/ᩳۜ᩵;->ۖ:J

    move-object v0, v15

    move-object/from16 v1, p0

    move-wide/from16 v16, v2

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 986
    iget v0, v6, Ll/ᩳۜ᩵;->ۢ:I

    if-ne v0, v8, :cond_0

    iget-object v0, v6, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-ne v0, v10, :cond_0

    .line 987
    invoke-static {v15, v10, v13, v14, v7}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 989
    iput v9, v6, Ll/ᩳۜ᩵;->ۢ:I

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_0
    move-wide/from16 v0, v16

    .line 991
    invoke-virtual {v15, v6, v0, v1, v11}, Lsun/misc/Unsafe;->putOrderedInt(Ljava/lang/Object;JI)V

    return v12

    :cond_1
    return v11
.end method

.method public final ᩳ(Ll/ۡۜ᩵;)Z
    .locals 8

    .line 847
    iget v0, p0, Ll/ᩳۜ᩵;->ۧ:I

    iget v1, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 848
    iget-object v2, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v2, :cond_0

    if-eq v0, v1, :cond_0

    array-length v0, v2

    if-lez v0, :cond_0

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    int-to-long v4, v0

    .line 850
    sget v0, Ll/ᩳۜ᩵;->ܺ:I

    shl-long/2addr v4, v0

    sget v0, Ll/ᩳۜ᩵;->ۡ:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    .line 851
    sget-object v0, Ll/ᩳۜ᩵;->ۘ:Lsun/misc/Unsafe;

    invoke-static {v0, v2, v4, v5, p1}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 852
    iput v1, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 853
    invoke-static {}, Ll/ܽۜ᩵;->ۧ()V

    return v3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
