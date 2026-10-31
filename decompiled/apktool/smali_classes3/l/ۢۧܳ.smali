.class public final Ll/ۢۧܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֫֫:[Z

.field public final ۗ:Ljava/util/ArrayList;

.field public final ۙ:Ljava/util/ArrayList;

.field public final ۛ:[Ll/۫ܽܳ;

.field public ۟:Z

.field public final ۤ:Ljava/io/DataInput;

.field public ۨ:[Ll/ۛۧܳ;

.field public ۫:[Ll/ۡᩳܳ;

.field public ۬:Ll/ۜۧܳ;

.field public final ܰ:Ll/᩸᩺ܿ;

.field public final ᩶:Ll/ۚܽܳ;

.field public final ᩸:Ll/ܿۧܳ;

.field public final ᩹:Ll/᩸ۧܳ;

.field public ᩺:J


# direct methods
.method public constructor <init>(Ll/ۚܽܳ;Ljava/io/DataInput;[Ll/۫ܽܳ;Ll/᩸᩺ܿ;Ll/ܿۧܳ;)V
    .locals 2

    .line 2771
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2757
    new-instance v0, Ll/᩸ۧܳ;

    invoke-direct {v0}, Ll/᩸ۧܳ;-><init>()V

    iput-object v0, p0, Ll/ۢۧܳ;->᩹:Ll/᩸ۧܳ;

    .line 2758
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢۧܳ;->ۙ:Ljava/util/ArrayList;

    .line 2759
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢۧܳ;->ۗ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    new-array v1, v0, [Ll/ۡᩳܳ;

    .line 2760
    iput-object v1, p0, Ll/ۢۧܳ;->۫:[Ll/ۡᩳܳ;

    new-array v1, v0, [Z

    .line 2761
    iput-object v1, p0, Ll/ۢۧܳ;->֫֫:[Z

    new-array v0, v0, [Ll/ۛۧܳ;

    .line 2762
    iput-object v0, p0, Ll/ۢۧܳ;->ۨ:[Ll/ۛۧܳ;

    .line 2772
    iput-object p1, p0, Ll/ۢۧܳ;->᩶:Ll/ۚܽܳ;

    .line 2773
    iput-object p2, p0, Ll/ۢۧܳ;->ۤ:Ljava/io/DataInput;

    .line 2774
    iput-object p3, p0, Ll/ۢۧܳ;->ۛ:[Ll/۫ܽܳ;

    .line 2775
    iput-object p4, p0, Ll/ۢۧܳ;->ܰ:Ll/᩸᩺ܿ;

    .line 2776
    iput-object p5, p0, Ll/ۢۧܳ;->᩸:Ll/ܿۧܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۧܳ;)Ll/᩸ۧܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۧܳ;->᩹:Ll/᩸ۧܳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۢۧܳ;)[Ll/ۛۧܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۧܳ;->ۨ:[Ll/ۛۧܳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 3050
    iget-boolean v0, p0, Ll/ۢۧܳ;->۟:Z

    if-eqz v0, :cond_0

    goto :goto_3

    .line 3054
    :cond_0
    iget-object v0, p0, Ll/ۢۧܳ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    if-ltz v1, :cond_2

    .line 3056
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۧܳ;

    invoke-virtual {v4}, Ll/ۛۧܳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    if-nez v3, :cond_1

    move-object v3, v4

    goto :goto_1

    .line 3061
    :cond_1
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 3065
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3066
    iget-object v0, p0, Ll/ۢۧܳ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3067
    iget-object v0, p0, Ll/ۢۧܳ;->۬:Ll/ۜۧܳ;

    if-eqz v0, :cond_4

    .line 3069
    :try_start_1
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    if-nez v3, :cond_3

    move-object v3, v0

    goto :goto_2

    .line 3074
    :cond_3
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 3077
    :goto_2
    iput-object v2, p0, Ll/ۢۧܳ;->۬:Ll/ۜۧܳ;

    :cond_4
    if-nez v3, :cond_5

    :goto_3
    return-void

    .line 3080
    :cond_5
    invoke-static {v3}, Ll/ᩳܽܳ;->֫(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final ֫(III)Ll/ۡᩳܳ;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    if-ltz v2, :cond_f

    if-nez v1, :cond_0

    if-nez v2, :cond_f

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_f

    if-gt v2, v1, :cond_f

    :goto_0
    int-to-long v3, v2

    .line 2858
    invoke-static {v3, v4}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v3

    const-wide/32 v5, 0x4000000

    cmp-long v7, v3, v5

    if-gtz v7, :cond_e

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_c

    .line 2865
    iget-object v7, v0, Ll/ۢۧܳ;->ۤ:Ljava/io/DataInput;

    invoke-interface {v7}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v8

    int-to-long v9, v1

    sub-long/2addr v9, v4

    long-to-int v10, v9

    .line 2869
    iget-object v9, v0, Ll/ۢۧܳ;->ۛ:[Ll/۫ܽܳ;

    const/4 v11, 0x1

    iget-object v12, v0, Ll/ۢۧܳ;->᩸:Ll/ܿۧܳ;

    if-ne v8, v11, :cond_2

    .line 2870
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v8

    .line 2871
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v11

    .line 2872
    invoke-static {v11, v10}, Ll/ᩳܽܳ;->֫(II)V

    int-to-long v13, v8

    int-to-long v1, v11

    add-long/2addr v13, v1

    if-ltz v8, :cond_1

    .line 2874
    iget-object v1, v0, Ll/ۢۧܳ;->᩶:Ll/ۚܽܳ;

    invoke-virtual {v1}, Ll/ۚܽܳ;->length()I

    move-result v2

    move-wide v15, v4

    int-to-long v4, v2

    cmp-long v2, v13, v4

    if-gtz v2, :cond_1

    const-wide/16 v4, 0x1

    .line 2878
    invoke-static {v4, v5}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v4

    .line 2877
    invoke-virtual {v12, v4, v5}, Ll/ܿۧܳ;->֫(J)V

    .line 2879
    invoke-static {v7, v8, v11, v9, v12}, Ll/ܿᩳܳ;->֫(Ljava/io/DataInput;II[Ll/۫ܽܳ;Ll/ܿۧܳ;)Ll/ܿᩳܳ;

    move-result-object v2

    .line 2881
    new-instance v4, Ll/᩷ᩳܳ;

    invoke-direct {v4, v1, v8, v11, v2}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    invoke-static {v4}, Ll/᩵ᩳܳ;->֫(Ll/᩷ᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v1

    goto/16 :goto_3

    :cond_1
    const-string v1, "BASE range is outside source"

    .line 2875
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_2
    move-wide v15, v4

    const-wide/16 v1, 0x1

    const/4 v4, 0x2

    if-ne v8, v4, :cond_6

    .line 2884
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v1

    if-ltz v1, :cond_5

    .line 2885
    iget-object v2, v0, Ll/ۢۧܳ;->۫:[Ll/ۡᩳܳ;

    array-length v4, v2

    if-ge v1, v4, :cond_5

    .line 2888
    aget-object v2, v2, v1

    if-nez v2, :cond_3

    const/4 v4, 0x0

    goto :goto_2

    .line 45
    :cond_3
    iget v4, v2, Ll/ۡᩳܳ;->᩻:I

    .line 2890
    :goto_2
    invoke-static {v4, v10}, Ll/ᩳܽܳ;->֫(II)V

    .line 2891
    iget-object v5, v0, Ll/ۢۧܳ;->֫֫:[Z

    aget-boolean v5, v5, v1

    if-eqz v5, :cond_4

    .line 2893
    invoke-static {v2}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v7

    .line 2892
    invoke-virtual {v12, v7, v8}, Ll/ܿۧܳ;->֫(J)V

    .line 2895
    :cond_4
    iget-object v5, v0, Ll/ۢۧܳ;->֫֫:[Z

    aput-boolean v11, v5, v1

    move/from16 v10, p3

    goto/16 :goto_4

    :cond_5
    const-string v1, "Invalid delta identity"

    .line 2886
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_6
    const/4 v4, 0x3

    if-ne v8, v4, :cond_7

    .line 2897
    invoke-interface {v7}, Ljava/io/DataInput;->readByte()B

    move-result v4

    .line 2898
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v11

    .line 2899
    invoke-static {v11, v10}, Ll/ᩳܽܳ;->֫(II)V

    .line 2901
    invoke-static {v1, v2}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v1

    .line 2900
    invoke-virtual {v12, v1, v2}, Ll/ܿۧܳ;->֫(J)V

    .line 2902
    new-instance v1, Ll/᩶ۧܳ;

    invoke-direct {v1, v4, v11}, Ll/᩶ۧܳ;-><init>(BI)V

    invoke-static {v1}, Ll/᩵ᩳܳ;->֫(Ll/ᩴܽܳ;)Ll/ۡᩳܳ;

    move-result-object v1

    goto :goto_3

    :cond_7
    const/4 v4, 0x5

    if-ne v8, v4, :cond_9

    .line 2905
    invoke-interface {v7}, Ljava/io/DataInput;->readByte()B

    move-result v4

    .line 2906
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v11

    .line 2907
    invoke-static {v11, v10}, Ll/ᩳܽܳ;->֫(II)V

    .line 2909
    invoke-static {v1, v2}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v1

    .line 2908
    invoke-virtual {v12, v1, v2}, Ll/ܿۧܳ;->֫(J)V

    const/4 v1, 0x0

    .line 2910
    invoke-static {v7, v1, v11, v9, v12}, Ll/ܿᩳܳ;->֫(Ljava/io/DataInput;II[Ll/۫ܽܳ;Ll/ܿۧܳ;)Ll/ܿᩳܳ;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 2915
    new-instance v5, Ll/᩷ᩳܳ;

    new-instance v7, Ll/᩶ۧܳ;

    invoke-direct {v7, v4, v11}, Ll/᩶ۧܳ;-><init>(BI)V

    invoke-direct {v5, v7, v1, v11, v2}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    invoke-static {v5}, Ll/᩵ᩳܳ;->֫(Ll/᩷ᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v1

    :goto_3
    move/from16 v10, p3

    move-object v2, v1

    move v4, v11

    goto :goto_4

    :cond_8
    const-string v1, "Patched FILL has no patches"

    .line 2913
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_9
    const/4 v4, 0x4

    if-ne v8, v4, :cond_b

    .line 2918
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v4

    .line 2919
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v5

    .line 2920
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v8

    .line 2921
    invoke-static {v8, v10}, Ll/ᩳܽܳ;->֫(II)V

    if-ltz v4, :cond_a

    move/from16 v10, p3

    if-ge v4, v10, :cond_a

    .line 2922
    iget-object v11, v0, Ll/ۢۧܳ;->ۨ:[Ll/ۛۧܳ;

    aget-object v11, v11, v4

    if-eqz v11, :cond_a

    if-ltz v5, :cond_a

    int-to-long v13, v5

    int-to-long v1, v8

    add-long/2addr v13, v1

    .line 2926
    invoke-virtual {v11}, Ll/ۛۧܳ;->length()I

    move-result v1

    int-to-long v1, v1

    cmp-long v11, v13, v1

    if-gtz v11, :cond_a

    .line 2929
    invoke-static {v7, v5, v8, v9, v12}, Ll/ܿᩳܳ;->֫(Ljava/io/DataInput;II[Ll/۫ܽܳ;Ll/ܿۧܳ;)Ll/ܿᩳܳ;

    move-result-object v1

    const-wide/16 v13, 0x1

    .line 2932
    invoke-static {v13, v14}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v13

    .line 2931
    invoke-virtual {v12, v13, v14}, Ll/ܿۧܳ;->֫(J)V

    .line 2933
    new-instance v2, Ll/᩷ᩳܳ;

    iget-object v7, v0, Ll/ۢۧܳ;->ۨ:[Ll/ۛۧܳ;

    aget-object v4, v7, v4

    invoke-direct {v2, v4, v5, v8, v1}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    invoke-static {v2}, Ll/᩵ᩳܳ;->֫(Ll/᩷ᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v2

    move v4, v8

    .line 2938
    :goto_4
    invoke-static {v3, v2}, Ll/᩵ᩳܳ;->ᩳ(Ll/ۡᩳܳ;Ll/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v3

    int-to-long v1, v4

    add-long v4, v15, v1

    add-int/lit8 v6, v6, 0x1

    move/from16 v1, p1

    move/from16 v2, p2

    goto/16 :goto_1

    :cond_a
    const-string v1, "Invalid replacement recipe extent"

    .line 2927
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_b
    const-string v1, "Unknown extent tag "

    .line 0
    invoke-static {v8, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2936
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_c
    move-wide v15, v4

    int-to-long v1, v1

    cmp-long v4, v15, v1

    if-nez v4, :cond_d

    return-object v3

    :cond_d
    const-string v1, "Extent lengths do not match document length"

    .line 2942
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_e
    const-string v1, "Span structure exceeds memory limit"

    .line 2860
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_f
    const-string v1, "Invalid extent count"

    .line 2856
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1
.end method

.method public final ֫()V
    .locals 1

    .line 3022
    iget-object v0, p0, Ll/ۢۧܳ;->۬:Ll/ۜۧܳ;

    if-eqz v0, :cond_0

    .line 3023
    invoke-interface {v0}, Ll/ۜۧܳ;->finish()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۡᩳܳ;)V
    .locals 4

    .line 2949
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2950
    invoke-static {p1, v0}, Ll/ᩳܽܳ;->֫(Ll/ۡᩳܳ;Ljava/util/ArrayList;)V

    .line 2951
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 2952
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1, v0}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 2953
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 2954
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۧܳ;

    .line 2955
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v2, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 2958
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2959
    invoke-static {v2}, Ll/ۛۧܳ;->ܽ(Ll/ۛۧܳ;)Ll/ۡᩳܳ;

    move-result-object v2

    invoke-static {v2, v0}, Ll/ᩳܽܳ;->֫(Ll/ۡᩳܳ;Ljava/util/ArrayList;)V

    .line 2960
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۧܳ;

    .line 2961
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_1

    .line 2964
    :cond_2
    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->size()I

    move-result p1

    iget-object v0, p0, Ll/ۢۧܳ;->ۨ:[Ll/ۛۧܳ;

    array-length v0, v0

    if-ne p1, v0, :cond_5

    .line 2967
    iget-object p1, p0, Ll/ۢۧܳ;->֫֫:[Z

    array-length v0, p1

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_4

    aget-boolean v2, p1, v1

    if-eqz v2, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    const-string p1, "Unreachable delta definition"

    .line 2969
    invoke-static {p1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_4
    return-void

    :cond_5
    const-string p1, "Unreachable replacement recipe definition"

    .line 2965
    invoke-static {p1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Ll/ᩳܽܳ;)V
    .locals 6

    .line 3029
    iget-boolean v0, p0, Ll/ۢۧܳ;->۟:Z

    if-nez v0, :cond_3

    .line 3032
    iget-object v0, p0, Ll/ۢۧܳ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴܽܳ;

    .line 3033
    invoke-static {p1}, Ll/ᩳܽܳ;->ܳ(Ll/ᩳܽܳ;)Ljava/util/IdentityHashMap;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v2, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 3035
    :cond_0
    iget-object v1, p0, Ll/ۢۧܳ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۧܳ;

    .line 3036
    invoke-static {p1}, Ll/ᩳܽܳ;->ܳ(Ll/ᩳܽܳ;)Ljava/util/IdentityHashMap;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v3, v5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 3038
    :cond_1
    iget-object p1, p0, Ll/ۢۧܳ;->۬:Ll/ۜۧܳ;

    if-eqz p1, :cond_2

    .line 3039
    invoke-interface {p1}, Ll/ۜۧܳ;->ܽ֫()V

    .line 3041
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3042
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const/4 p1, 0x0

    .line 3043
    iput-object p1, p0, Ll/ۢۧܳ;->۬:Ll/ۜۧܳ;

    const/4 p1, 0x1

    .line 3044
    iput-boolean p1, p0, Ll/ۢۧܳ;->۟:Z

    return-void

    .line 3030
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Checkpoint sources already transferred"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ()V
    .locals 15

    .line 2781
    iget-object v0, p0, Ll/ۢۧܳ;->ۤ:Ljava/io/DataInput;

    invoke-interface {v0}, Ljava/io/DataInput;->readInt()I

    move-result v1

    if-ltz v1, :cond_8

    const/high16 v2, 0x100000

    if-gt v1, v2, :cond_8

    int-to-long v2, v1

    .line 2786
    invoke-static {v2, v3}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v2

    iget-object v4, p0, Ll/ۢۧܳ;->᩸:Ll/ܿۧܳ;

    invoke-virtual {v4, v2, v3}, Ll/ܿۧܳ;->֫(J)V

    .line 2787
    new-array v2, v1, [Ll/ۡᩳܳ;

    iput-object v2, p0, Ll/ۢۧܳ;->۫:[Ll/ۡᩳܳ;

    .line 2788
    new-array v2, v1, [Z

    iput-object v2, p0, Ll/ۢۧܳ;->֫֫:[Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_7

    .line 2790
    invoke-interface {v0}, Ljava/io/DataInput;->readInt()I

    move-result v5

    if-lez v5, :cond_6

    .line 2794
    iget-object v6, p0, Ll/ۢۧܳ;->۫:[Ll/ۡᩳܳ;

    const/high16 v7, 0x10000

    .line 2976
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v7

    new-array v8, v7, [B

    const/4 v9, 0x0

    .line 2977
    iget-object v10, p0, Ll/ۢۧܳ;->ܰ:Ll/᩸᩺ܿ;

    if-nez v10, :cond_1

    int-to-long v10, v5

    const-wide/32 v12, 0xffff

    add-long/2addr v10, v12

    const-wide/32 v12, 0x10000

    .line 2978
    div-long/2addr v10, v12

    const-wide/16 v12, 0x1

    cmp-long v14, v10, v12

    if-lez v14, :cond_0

    sub-long/2addr v10, v12

    .line 2982
    invoke-static {v10, v11}, Ll/᩵ᩳܳ;->֫(J)J

    move-result-wide v10

    .line 2981
    invoke-virtual {v4, v10, v11}, Ll/ܿۧܳ;->֫(J)V

    :cond_0
    :goto_1
    if-lez v5, :cond_4

    .line 2987
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 2988
    invoke-interface {v0, v8, v2, v10}, Ljava/io/DataInput;->readFully([BII)V

    .line 2989
    iget-object v11, p0, Ll/ۢۧܳ;->᩹:Ll/᩸ۧܳ;

    invoke-virtual {v11, v10, v8}, Ll/᩸ۧܳ;->֫(I[B)Ll/ۡᩳܳ;

    move-result-object v11

    invoke-static {v9, v11}, Ll/᩵ᩳܳ;->ᩳ(Ll/ۡᩳܳ;Ll/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v9

    sub-int/2addr v5, v10

    goto :goto_1

    .line 2994
    :cond_1
    iget-object v11, p0, Ll/ۢۧܳ;->۬:Ll/ۜۧܳ;

    if-nez v11, :cond_2

    .line 2996
    invoke-virtual {v10}, Ll/᩸᩺ܿ;->֫()Ll/ۜۧܳ;

    move-result-object v10

    .line 2995
    iput-object v10, p0, Ll/ۢۧܳ;->۬:Ll/ۜۧܳ;

    .line 2999
    :cond_2
    iget-object v10, p0, Ll/ۢۧܳ;->۬:Ll/ۜۧܳ;

    .line 3000
    invoke-interface {v10, v5}, Ll/ۜۧܳ;->ܿ(I)Ll/ܳۧܳ;

    move-result-object v10

    move v11, v5

    :goto_2
    if-lez v11, :cond_3

    .line 3004
    invoke-static {v7, v11}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 3005
    invoke-interface {v0, v8, v2, v12}, Ljava/io/DataInput;->readFully([BII)V

    .line 3006
    invoke-interface {v10, v12, v8}, Ll/ܳۧܳ;->֫(I[B)V

    sub-int/2addr v11, v12

    goto :goto_2

    .line 3009
    :cond_3
    invoke-interface {v10}, Ll/ܳۧܳ;->finish()V

    .line 3010
    invoke-interface {v10}, Ll/ܳۧܳ;->position()I

    move-result v7

    if-ne v7, v5, :cond_5

    .line 3014
    invoke-interface {v10}, Ll/ܳۧܳ;->֫()Ll/ᩴܽܳ;

    move-result-object v7

    const-string v8, "checkpoint delta source"

    .line 3013
    invoke-static {v7, v8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3015
    iget-object v8, p0, Ll/ۢۧܳ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3016
    new-instance v8, Ll/᩷ᩳܳ;

    invoke-direct {v8, v7, v2, v5, v9}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    invoke-static {v8}, Ll/᩵ᩳܳ;->֫(Ll/᩷ᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v9

    .line 2794
    :cond_4
    aput-object v9, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    const-string v0, "Incomplete delta table payload"

    .line 3011
    invoke-static {v0}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_6
    const-string v0, "Invalid delta table payload length"

    .line 2792
    invoke-static {v0}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_7
    return-void

    :cond_8
    const-string v0, "Invalid delta table size"

    .line 2783
    invoke-static {v0}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final ᩳ()V
    .locals 32

    move-object/from16 v0, p0

    .line 2800
    iget-object v1, v0, Ll/ۢۧܳ;->ۤ:Ljava/io/DataInput;

    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v2

    if-ltz v2, :cond_a

    const/high16 v3, 0x100000

    if-gt v2, v3, :cond_a

    int-to-long v4, v2

    const-wide/16 v6, 0x18

    mul-long v4, v4, v6

    const-wide/16 v6, 0x10

    add-long/2addr v6, v4

    .line 2804
    iget-object v8, v0, Ll/ۢۧܳ;->᩸:Ll/ܿۧܳ;

    invoke-virtual {v8, v6, v7}, Ll/ܿۧܳ;->֫(J)V

    .line 2807
    iget-object v6, v0, Ll/ۢۧܳ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 2809
    iput-wide v4, v0, Ll/ۢۧܳ;->᩺:J

    const-string v7, "Replacement recipe table exceeds memory limit"

    const-wide/32 v9, 0x4000000

    cmp-long v11, v4, v9

    if-gtz v11, :cond_9

    .line 2814
    new-array v4, v2, [Ll/ۛۧܳ;

    iput-object v4, v0, Ll/ۢۧܳ;->ۨ:[Ll/ۛۧܳ;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_8

    .line 2816
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v13

    .line 2817
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v14

    .line 2818
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v15

    .line 2819
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v5

    if-ltz v13, :cond_7

    if-lez v14, :cond_7

    if-lez v15, :cond_7

    if-ltz v5, :cond_7

    int-to-long v11, v5

    cmp-long v16, v11, v9

    if-gtz v16, :cond_7

    .line 2825
    iget-wide v9, v0, Ll/ۢۧܳ;->᩺:J

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    const-wide/16 v6, 0x40

    move/from16 v16, v14

    move/from16 v17, v15

    .line 2826
    invoke-static {v11, v12, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v14

    .line 2825
    invoke-static {v9, v10, v14, v15}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v9

    iput-wide v9, v0, Ll/ۢۧܳ;->᩺:J

    const-wide/32 v14, 0x4000000

    cmp-long v22, v9, v14

    if-gtz v22, :cond_6

    .line 2831
    invoke-static {v11, v12, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v6

    invoke-virtual {v8, v6, v7}, Ll/ܿۧܳ;->֫(J)V

    .line 2833
    new-array v5, v5, [B

    .line 2834
    invoke-interface {v1, v5}, Ljava/io/DataInput;->readFully([B)V

    .line 5500
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v6

    if-lez v6, :cond_5

    if-gt v6, v3, :cond_5

    .line 5504
    invoke-static {v6}, Ll/ᩳܽܳ;->֫(I)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ll/ܿۧܳ;->֫(J)V

    .line 5505
    new-array v3, v6, [Ll/ۧᩳܳ;

    .line 5506
    new-array v7, v6, [J

    const-wide/16 v9, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x0

    move-wide v14, v9

    :goto_1
    if-ge v12, v6, :cond_3

    move/from16 v29, v2

    const/4 v2, 0x0

    move-object/from16 v30, v5

    .line 5511
    invoke-static {v1, v2, v8}, Ll/ۧᩳܳ;->֫(Ljava/io/DataInput;ILl/ܿۧܳ;)Ll/ۧᩳܳ;

    move-result-object v5

    .line 5513
    invoke-virtual {v5, v2}, Ll/ۧᩳܳ;->ܽ(I)I

    move-result v2

    if-ltz v2, :cond_2

    if-eqz v12, :cond_0

    if-le v2, v11, :cond_2

    .line 5517
    :cond_0
    invoke-virtual {v5}, Ll/ۧᩳܳ;->ܽ()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v5, v2}, Ll/ۧᩳܳ;->ܽ(I)I

    move-result v11

    move-object/from16 v31, v1

    .line 5519
    invoke-virtual {v5}, Ll/ۧᩳܳ;->֫()J

    move-result-wide v1

    .line 5518
    invoke-static {v9, v10, v1, v2}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v9

    .line 5520
    invoke-static {v6, v9, v10}, Ll/ᩳܽܳ;->֫(IJ)J

    move-result-wide v1

    const-wide/32 v18, 0x4000000

    cmp-long v22, v1, v18

    if-gtz v22, :cond_1

    .line 5525
    invoke-virtual {v5}, Ll/ۧᩳܳ;->ܽ()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v14, v15, v1, v2}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v14

    .line 5526
    aput-object v5, v3, v12

    .line 5527
    aput-wide v14, v7, v12

    add-int/lit8 v12, v12, 0x1

    move/from16 v2, v29

    move-object/from16 v5, v30

    move-object/from16 v1, v31

    goto :goto_1

    :cond_1
    const-string v1, "Replacement recipe index exceeds memory limit"

    .line 5523
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_2
    const-string v1, "Replacement recipe starts are not sorted"

    .line 5515
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_3
    move-object/from16 v31, v1

    move/from16 v29, v2

    move-object/from16 v30, v5

    .line 5529
    new-instance v1, Ll/۬ۧܳ;

    .line 5530
    invoke-static {v6, v9, v10}, Ll/ᩳܽܳ;->֫(IJ)J

    move-result-wide v27

    move-object/from16 v22, v1

    move-object/from16 v23, v3

    move-object/from16 v24, v7

    move-wide/from16 v25, v14

    invoke-direct/range {v22 .. v28}, Ll/۬ۧܳ;-><init>([Ll/ۧᩳܳ;[JJJ)V

    .line 2836
    iget-wide v2, v0, Ll/ۢۧܳ;->᩺:J

    .line 2837
    invoke-virtual {v1}, Ll/۬ۧܳ;->֫()J

    move-result-wide v5

    .line 2836
    invoke-static {v2, v3, v5, v6}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    iput-wide v2, v0, Ll/ۢۧܳ;->᩺:J

    const-wide/32 v5, 0x4000000

    cmp-long v7, v2, v5

    if-gtz v7, :cond_4

    .line 2841
    invoke-interface/range {v31 .. v31}, Ljava/io/DataInput;->readInt()I

    move-result v2

    .line 2842
    invoke-virtual {v0, v13, v2, v4}, Ll/ۢۧܳ;->֫(III)Ll/ۡᩳܳ;

    move-result-object v12

    .line 2843
    new-instance v2, Ll/ۛۧܳ;

    move-object v11, v2

    move/from16 v14, v16

    move/from16 v15, v17

    move-object/from16 v16, v30

    move-object/from16 v17, v1

    invoke-direct/range {v11 .. v17}, Ll/ۛۧܳ;-><init>(Ll/ۡᩳܳ;III[BLl/۬ۧܳ;)V

    .line 2846
    iget-object v1, v0, Ll/ۢۧܳ;->ۨ:[Ll/ۛۧܳ;

    aput-object v2, v1, v4

    move-object/from16 v1, v20

    .line 2847
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    const/high16 v3, 0x100000

    move-wide v9, v5

    move-object/from16 v7, v21

    move/from16 v2, v29

    move-object v6, v1

    move-object/from16 v1, v31

    goto/16 :goto_0

    .line 2839
    :cond_4
    invoke-static/range {v21 .. v21}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_5
    const-string v1, "Invalid replacement recipe index size"

    .line 5502
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    .line 2829
    :cond_6
    invoke-static/range {v21 .. v21}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_7
    const-string v1, "Invalid replacement recipe header"

    .line 2823
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_8
    return-void

    :cond_9
    move-object/from16 v21, v7

    .line 2812
    invoke-static/range {v21 .. v21}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_a
    const-string v1, "Invalid recipe table size"

    .line 2802
    invoke-static {v1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1
.end method
