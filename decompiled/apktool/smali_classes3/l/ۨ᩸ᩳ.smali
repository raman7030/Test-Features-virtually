.class public final Ll/ۨ᩸ᩳ;
.super Ljava/lang/Object;
.source "O6UZ"


# static fields
.field public static final ֡:[[I

.field public static ᩴ:[Ljava/lang/Object;

.field public static ᩵:[Ljava/lang/Object;


# instance fields
.field public final ֫:Ll/ۤ᩸ᩳ;

.field public ۖ:[Ljava/lang/Object;

.field public ۘ:J

.field public ۜ:[I

.field public ۡ:[I

.field public ۢ:[J

.field public ۧ:J

.field public ܳ:I

.field public ܺ:[J

.field public ܽ:J

.field public ܿ:I

.field public ᩳ:Ljava/util/IdentityHashMap;

.field public ᩷:I

.field public ᩻:[J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 695
    sput-object v1, Ll/ۨ᩸ᩳ;->ᩴ:[Ljava/lang/Object;

    const/16 v1, 0x49

    new-array v1, v1, [Ljava/lang/Object;

    .line 697
    sput-object v1, Ll/ۨ᩸ᩳ;->᩵:[Ljava/lang/Object;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x1

    aput v0, v1, v2

    const/4 v2, 0x6

    aput v2, v1, v0

    .line 1105
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    sput-object v0, Ll/ۨ᩸ᩳ;->֡:[[I

    return-void
.end method

.method public constructor <init>(Ll/ۤ᩸ᩳ;Ljava/lang/CharSequence;I)V
    .locals 11

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    .line 1098
    invoke-virtual {p1}, Ll/ۤ᩸ᩳ;->length()I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0x2

    mul-long v2, v2, v0

    const-wide/16 v4, 0x8

    .line 37
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Ll/ۨ᩸ᩳ;->ۘ:J

    .line 38
    iput-wide v0, p0, Ll/ۨ᩸ᩳ;->ܽ:J

    sub-long/2addr v2, v0

    .line 39
    iput-wide v2, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    const/4 p1, 0x0

    .line 41
    iput p1, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    .line 42
    iput p1, p0, Ll/ۨ᩸ᩳ;->᩷:I

    new-array v0, p1, [Ljava/lang/Object;

    .line 43
    iput-object v0, p0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    new-array v0, p1, [J

    .line 44
    iput-object v0, p0, Ll/ۨ᩸ᩳ;->ܺ:[J

    new-array v0, p1, [J

    .line 45
    iput-object v0, p0, Ll/ۨ᩸ᩳ;->᩻:[J

    new-array v0, p1, [I

    .line 46
    iput-object v0, p0, Ll/ۨ᩸ᩳ;->ۜ:[I

    new-array v0, p1, [J

    .line 47
    iput-object v0, p0, Ll/ۨ᩸ᩳ;->ۢ:[J

    new-array v0, p1, [I

    .line 48
    iput-object v0, p0, Ll/ۨ᩸ᩳ;->ۡ:[I

    .line 50
    instance-of v0, p2, Landroid/text/Spanned;

    if-eqz v0, :cond_6

    .line 51
    check-cast p2, Landroid/text/Spanned;

    .line 52
    const-class v0, Ljava/lang/Object;

    invoke-interface {p2, p1, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    .line 54
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_5

    aget-object v4, p1, v1

    .line 55
    instance-of v2, v4, Landroid/text/NoCopySpan;

    if-eqz v2, :cond_0

    goto :goto_1

    .line 59
    :cond_0
    invoke-interface {p2, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v2

    .line 60
    invoke-interface {p2, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v3

    .line 61
    invoke-interface {p2, v4}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v9

    if-gez v2, :cond_1

    const/4 v2, 0x0

    :cond_1
    if-le v2, p3, :cond_2

    move v2, p3

    :cond_2
    if-gez v3, :cond_3

    const/4 v3, 0x0

    :cond_3
    if-le v3, p3, :cond_4

    move v3, p3

    :cond_4
    int-to-long v5, v2

    int-to-long v7, v3

    const/4 v10, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    .line 73
    invoke-direct/range {v2 .. v10}, Ll/ۨ᩸ᩳ;->֫(ZLjava/lang/Object;JJIZ)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 75
    :cond_5
    invoke-direct {p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    :cond_6
    return-void
.end method

.method private ֫(J)C
    .locals 4

    long-to-int v0, p1

    int-to-long v1, v0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    .line 1102
    iget-object p1, p0, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    invoke-virtual {p1, v0}, Ll/ۤ᩸ᩳ;->charAt(I)C

    move-result p1

    return p1

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method private ֫(IIILjava/lang/Class;)I
    .locals 10

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_1

    .line 717
    invoke-static {p3}, Ll/ۨ᩸ᩳ;->ۧ(I)I

    move-result v1

    .line 718
    iget-object v2, p0, Ll/ۨ᩸ᩳ;->ۢ:[J

    aget-wide v3, v2, v1

    .line 719
    iget-wide v5, p0, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v2, v3, v5

    if-lez v2, :cond_0

    .line 720
    iget-wide v5, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v3, v5

    :cond_0
    int-to-long v5, p1

    cmp-long v2, v3, v5

    if-ltz v2, :cond_1

    .line 723
    invoke-direct {p0, p1, p2, v1, p4}, Ll/ۨ᩸ᩳ;->֫(IIILjava/lang/Class;)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 726
    :goto_0
    iget v2, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge p3, v2, :cond_7

    .line 727
    iget-object v2, p0, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v3, v2, p3

    .line 728
    iget-wide v5, p0, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v2, v3, v5

    if-lez v2, :cond_2

    .line 729
    iget-wide v7, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v3, v7

    :cond_2
    int-to-long v7, p2

    cmp-long v2, v3, v7

    if-gtz v2, :cond_7

    .line 732
    iget-object v7, p0, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v8, v7, p3

    cmp-long v7, v8, v5

    if-lez v7, :cond_3

    .line 734
    iget-wide v5, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v8, v5

    :cond_3
    int-to-long v5, p1

    cmp-long v7, v8, v5

    if-ltz v7, :cond_6

    cmp-long v5, v3, v8

    if-eqz v5, :cond_4

    if-eq p1, p2, :cond_4

    if-eqz v2, :cond_6

    if-eqz v7, :cond_6

    .line 736
    :cond_4
    const-class v2, Ljava/lang/Object;

    if-eq v2, p4, :cond_5

    iget-object v2, p0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v2, v2, p3

    .line 739
    invoke-virtual {p4, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_5
    add-int/lit8 v1, v1, 0x1

    :cond_6
    if-eqz v0, :cond_7

    .line 743
    invoke-static {p3}, Ll/ۨ᩸ᩳ;->ܿ(I)I

    move-result p3

    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۨ᩸ᩳ;->֫(IIILjava/lang/Class;)I

    move-result p1

    add-int/2addr v1, p1

    :cond_7
    return v1
.end method

.method private ֫(IILjava/lang/Class;I[Ljava/lang/Object;[I[II)I
    .locals 16

    move-object/from16 v9, p0

    move/from16 v10, p1

    move/from16 v11, p2

    move-object/from16 v12, p3

    move/from16 v13, p4

    move-object/from16 v14, p5

    and-int/lit8 v15, v13, 0x1

    if-eqz v15, :cond_1

    .line 755
    invoke-static/range {p4 .. p4}, Ll/ۨ᩸ᩳ;->ۧ(I)I

    move-result v4

    .line 756
    iget-object v0, v9, Ll/ۨ᩸ᩳ;->ۢ:[J

    aget-wide v1, v0, v4

    .line 757
    iget-wide v5, v9, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v0, v1, v5

    if-lez v0, :cond_0

    .line 758
    iget-wide v5, v9, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v1, v5

    :cond_0
    int-to-long v5, v10

    cmp-long v0, v1, v5

    if-ltz v0, :cond_1

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    .line 761
    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/Class;I[Ljava/lang/Object;[I[II)I

    move-result v0

    goto :goto_0

    :cond_1
    move/from16 v0, p8

    .line 765
    :goto_0
    iget v1, v9, Ll/ۨ᩸ᩳ;->ܳ:I

    if-lt v13, v1, :cond_2

    goto/16 :goto_1

    .line 766
    :cond_2
    iget-object v1, v9, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v2, v1, v13

    .line 767
    iget-wide v4, v9, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_3

    .line 768
    iget-wide v6, v9, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v2, v6

    :cond_3
    int-to-long v6, v11

    cmp-long v1, v2, v6

    if-gtz v1, :cond_9

    .line 771
    iget-object v6, v9, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v7, v6, v13

    cmp-long v6, v7, v4

    if-lez v6, :cond_4

    .line 773
    iget-wide v4, v9, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v7, v4

    :cond_4
    int-to-long v4, v10

    cmp-long v6, v7, v4

    if-ltz v6, :cond_7

    cmp-long v4, v2, v7

    if-eqz v4, :cond_5

    if-eq v10, v11, :cond_5

    if-eqz v1, :cond_7

    if-eqz v6, :cond_7

    .line 775
    :cond_5
    const-class v1, Ljava/lang/Object;

    if-eq v1, v12, :cond_6

    iget-object v1, v9, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v1, v1, v13

    .line 778
    invoke-virtual {v12, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 779
    :cond_6
    iget-object v1, v9, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v1, v1, v13

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    .line 782
    aput v1, p6, v0

    .line 783
    iget-object v1, v9, Ll/ۨ᩸ᩳ;->ۡ:[I

    aget v1, v1, v13

    aput v1, p7, v0

    .line 794
    iget-object v1, v9, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v1, v1, v13

    aput-object v1, v14, v0

    add-int/lit8 v0, v0, 0x1

    :cond_7
    move v8, v0

    .line 797
    array-length v0, v14

    if-ge v8, v0, :cond_8

    if-eqz v15, :cond_8

    .line 798
    invoke-static/range {p4 .. p4}, Ll/ۨ᩸ᩳ;->ܿ(I)I

    move-result v4

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/Class;I[Ljava/lang/Object;[I[II)I

    move-result v0

    return v0

    :cond_8
    return v8

    :cond_9
    :goto_1
    return v0
.end method

.method private ֫(I)J
    .locals 6

    and-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_0

    .line 1038
    invoke-static {p1}, Ll/ۨ᩸ᩳ;->ۧ(I)I

    move-result v1

    invoke-direct {p0, v1}, Ll/ۨ᩸ᩳ;->֫(I)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    .line 1040
    :goto_0
    iget v3, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge p1, v3, :cond_1

    .line 1041
    iget-object v3, p0, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v4, v3, p1

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    if-eqz v0, :cond_1

    .line 1043
    invoke-static {p1}, Ll/ۨ᩸ᩳ;->ܿ(I)I

    move-result v0

    invoke-direct {p0, v0}, Ll/ۨ᩸ᩳ;->֫(I)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 1046
    :cond_1
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ۢ:[J

    aput-wide v1, v0, p1

    return-wide v1
.end method

.method private ֫(IIIJZZ)J
    .locals 12

    move-object v0, p0

    move v1, p3

    move v2, p1

    int-to-long v2, v2

    cmp-long v4, p4, v2

    if-ltz v4, :cond_5

    .line 392
    iget-wide v5, v0, Ll/ۨ᩸ᩳ;->ܽ:J

    iget-wide v7, v0, Ll/ۨ᩸ᩳ;->ۧ:J

    add-long v9, v5, v7

    cmp-long v11, p4, v9

    if-gez v11, :cond_5

    const/4 v9, 0x2

    if-ne v1, v9, :cond_1

    if-nez p7, :cond_0

    if-lez v4, :cond_5

    :cond_0
    add-long/2addr v5, v7

    return-wide v5

    :cond_1
    const/4 v4, 0x3

    if-ne v1, v4, :cond_2

    if-eqz p6, :cond_5

    add-long/2addr v5, v7

    return-wide v5

    :cond_2
    if-nez p7, :cond_4

    move v1, p2

    int-to-long v7, v1

    sub-long v7, v5, v7

    cmp-long v1, p4, v7

    if-gez v1, :cond_3

    goto :goto_0

    :cond_3
    return-wide v5

    :cond_4
    :goto_0
    return-wide v2

    :cond_5
    return-wide p4
.end method

.method public static ֫(JJ)Ljava/lang/String;
    .locals 2

    const-string v0, "("

    const-string v1, " ... "

    .line 0
    invoke-static {v0, v1, p0, p1}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, ")"

    invoke-static {p0, p2, p3, p1}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(I[Ljava/lang/Object;I[I[I)V
    .locals 5

    mul-int/lit8 v0, p0, 0x2

    add-int/lit8 v0, v0, 0x1

    :goto_0
    if-ge v0, p2, :cond_4

    add-int/lit8 v1, p2, -0x1

    if-ge v0, v1, :cond_1

    add-int/lit8 v1, v0, 0x1

    .line 902
    aget v2, p3, v0

    .line 903
    aget v3, p3, v1

    if-ne v2, v3, :cond_0

    .line 905
    aget v2, p4, v0

    aget v3, p4, v1

    invoke-static {v2, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v2

    goto :goto_1

    .line 908
    :cond_0
    invoke-static {v3, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v2

    :goto_1
    if-gez v2, :cond_1

    move v0, v1

    .line 902
    :cond_1
    aget v1, p3, p0

    .line 903
    aget v2, p3, v0

    if-ne v1, v2, :cond_2

    .line 905
    aget v1, p4, p0

    aget v2, p4, v0

    invoke-static {v1, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    goto :goto_2

    .line 908
    :cond_2
    invoke-static {v2, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    :goto_2
    if-ltz v1, :cond_3

    goto :goto_3

    .line 883
    :cond_3
    aget-object v1, p1, p0

    .line 884
    aget-object v2, p1, v0

    aput-object v2, p1, p0

    .line 885
    aput-object v1, p1, v0

    .line 887
    aget v1, p3, p0

    .line 888
    aget v2, p3, v0

    aput v2, p3, p0

    .line 889
    aput v1, p3, v0

    .line 891
    aget v1, p4, p0

    .line 892
    aget v2, p4, v0

    aput v2, p4, p0

    .line 893
    aput v1, p4, v0

    mul-int/lit8 p0, v0, 0x2

    add-int/lit8 p0, p0, 0x1

    move v4, v0

    move v0, p0

    move p0, v4

    goto :goto_0

    :cond_4
    :goto_3
    return-void
.end method

.method private ֫(Ljava/lang/Object;JJ)V
    .locals 5

    .line 621
    sget-object v0, Landroid/text/Selection;->SELECTION_START:Ljava/lang/Object;

    iget-object v1, p0, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    if-eq p1, v0, :cond_0

    sget-object v0, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-virtual {v1}, Ll/ۤ᩸ᩳ;->ۖ()V

    :cond_1
    long-to-int v0, p2

    int-to-long v2, v0

    cmp-long v4, p2, v2

    if-nez v4, :cond_6

    long-to-int p2, p4

    int-to-long v2, p2

    cmp-long p3, p4, v2

    if-nez p3, :cond_5

    .line 973
    const-class p4, Landroid/text/SpanWatcher;

    invoke-virtual {p0, v0, p2, p4}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Landroid/text/SpanWatcher;

    .line 974
    array-length p5, p4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p5, :cond_4

    aget-object v3, p4, v2

    if-nez v4, :cond_3

    if-nez p3, :cond_2

    .line 975
    invoke-interface {v3, v1, p1, v0, p2}, Landroid/text/SpanWatcher;->onSpanAdded(Landroid/text/Spannable;Ljava/lang/Object;II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 0
    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method private ֫(Ljava/lang/Object;JJJJ)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    move-wide/from16 v13, p6

    move-wide/from16 v6, p8

    .line 621
    sget-object v1, Landroid/text/Selection;->SELECTION_START:Ljava/lang/Object;

    iget-object v15, v0, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    if-eq v8, v1, :cond_0

    sget-object v1, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    if-ne v8, v1, :cond_1

    :cond_0
    invoke-virtual {v15}, Ll/ۤ᩸ᩳ;->ۖ()V

    .line 989
    :cond_1
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v3, v1

    int-to-long v4, v3

    cmp-long v16, v1, v4

    if-nez v16, :cond_8

    .line 990
    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 1098
    invoke-virtual {v15}, Ll/ۤ᩸ᩳ;->length()I

    move-result v4

    int-to-long v4, v4

    .line 990
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v4, v1

    int-to-long v5, v4

    cmp-long v7, v1, v5

    if-nez v7, :cond_7

    const-class v1, Landroid/text/SpanWatcher;

    .line 989
    invoke-virtual {v0, v3, v4, v1}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, [Landroid/text/SpanWatcher;

    .line 991
    array-length v6, v7

    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v6, :cond_6

    aget-object v1, v7, v5

    long-to-int v4, v9

    int-to-long v2, v4

    cmp-long v16, v9, v2

    if-nez v16, :cond_5

    long-to-int v3, v11

    move/from16 v17, v5

    move/from16 v16, v6

    int-to-long v5, v3

    cmp-long v2, v11, v5

    if-nez v2, :cond_4

    long-to-int v6, v13

    move v5, v3

    int-to-long v2, v6

    cmp-long v18, v13, v2

    if-nez v18, :cond_3

    move-wide/from16 v2, p8

    long-to-int v0, v2

    move-object/from16 v18, v7

    int-to-long v7, v0

    cmp-long v19, v2, v7

    if-nez v19, :cond_2

    move-object v2, v15

    move-object/from16 v3, p1

    move/from16 v8, v17

    move-object/from16 v17, v18

    move v7, v0

    .line 992
    invoke-interface/range {v1 .. v7}, Landroid/text/SpanWatcher;->onSpanChanged(Landroid/text/Spannable;Ljava/lang/Object;IIII)V

    add-int/lit8 v5, v8, 0x1

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v6, v16

    move-object/from16 v7, v17

    goto :goto_0

    .line 0
    :cond_2
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_6
    return-void

    :cond_7
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0
.end method

.method private ֫(Ljava/lang/String;JJ)V
    .locals 5

    const-string v0, " "

    cmp-long v1, p4, p2

    if-ltz v1, :cond_2

    .line 1098
    iget-object v1, p0, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    invoke-virtual {v1}, Ll/ۤ᩸ᩳ;->length()I

    move-result v1

    int-to-long v2, v1

    cmp-long v4, p2, v2

    if-gtz v4, :cond_1

    cmp-long v4, p4, v2

    if-gtz v4, :cond_1

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-ltz v3, :cond_0

    cmp-long v3, p4, v1

    if-ltz v3, :cond_0

    return-void

    .line 1015
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {p1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 1016
    invoke-static {p2, p3, p4, p5}, Ll/ۨ᩸ᩳ;->֫(JJ)Ljava/lang/String;

    move-result-object p2

    const-string p3, " starts before 0"

    .line 0
    invoke-static {p1, p2, p3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1016
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1010
    :cond_1
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {p1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 1011
    invoke-static {p2, p3, p4, p5}, Ll/ۨ᩸ᩳ;->֫(JJ)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " ends beyond length "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1003
    :cond_2
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {p1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 1004
    invoke-static {p2, p3, p4, p5}, Ll/ۨ᩸ᩳ;->֫(JJ)Ljava/lang/String;

    move-result-object p2

    const-string p3, " has end before start"

    .line 0
    invoke-static {p1, p2, p3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1004
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private ֫(ZLjava/lang/Object;JJIZ)V
    .locals 19

    move-object/from16 v10, p0

    move-object/from16 v6, p2

    move-wide/from16 v7, p3

    move-wide/from16 v11, p5

    move/from16 v9, p7

    const-string v1, "setSpan"

    move-object/from16 v0, p0

    move-wide/from16 v2, p3

    move-wide/from16 v4, p5

    .line 534
    invoke-direct/range {v0 .. v5}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/String;JJ)V

    and-int/lit16 v0, v9, 0xf0

    shr-int/lit8 v0, v0, 0x4

    .line 537
    invoke-direct {v10, v0, v7, v8}, Ll/ۨ᩸ᩳ;->֫(IJ)Z

    move-result v1

    const-string v2, ")"

    const-wide/16 v3, 0x1

    const-string v5, " follows "

    if-eqz v1, :cond_1

    if-nez p8, :cond_0

    goto/16 :goto_4

    .line 542
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "PARAGRAPH span must start at paragraph boundary ("

    .line 0
    invoke-static {v1, v5, v7, v8}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v1

    sub-long v3, v7, v3

    .line 543
    invoke-direct {v10, v3, v4}, Ll/ۨ᩸ᩳ;->֫(J)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    and-int/lit8 v1, v9, 0xf

    .line 547
    invoke-direct {v10, v1, v11, v12}, Ll/ۨ᩸ᩳ;->֫(IJ)Z

    move-result v13

    if-eqz v13, :cond_3

    if-nez p8, :cond_2

    goto/16 :goto_4

    .line 552
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "PARAGRAPH span must end at paragraph boundary ("

    .line 0
    invoke-static {v1, v5, v11, v12}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v1

    sub-long v3, v11, v3

    .line 553
    invoke-direct {v10, v3, v4}, Ll/ۨ᩸ᩳ;->֫(J)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v0, v3, :cond_4

    if-ne v1, v2, :cond_4

    cmp-long v4, v7, v11

    if-nez v4, :cond_4

    goto/16 :goto_4

    .line 567
    :cond_4
    iget-wide v4, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    iget-object v13, v10, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    const/4 v14, 0x3

    cmp-long v15, v7, v4

    if-lez v15, :cond_5

    .line 568
    iget-wide v4, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    goto :goto_0

    :cond_5
    if-nez v15, :cond_7

    if-eq v0, v3, :cond_6

    if-ne v0, v14, :cond_7

    .line 1098
    invoke-virtual {v13}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    int-to-long v4, v0

    cmp-long v0, v7, v4

    if-nez v0, :cond_7

    .line 571
    :cond_6
    iget-wide v4, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    :goto_0
    add-long/2addr v4, v7

    goto :goto_1

    :cond_7
    move-wide v4, v7

    .line 574
    :goto_1
    iget-wide v14, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v0, v11, v14

    if-lez v0, :cond_8

    .line 575
    iget-wide v0, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    goto :goto_2

    :cond_8
    if-nez v0, :cond_a

    if-eq v1, v3, :cond_9

    const/4 v0, 0x3

    if-ne v1, v0, :cond_a

    .line 1098
    invoke-virtual {v13}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    int-to-long v0, v0

    cmp-long v3, v11, v0

    if-nez v3, :cond_a

    .line 578
    :cond_9
    iget-wide v0, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    :goto_2
    add-long/2addr v0, v11

    goto :goto_3

    :cond_a
    move-wide v0, v11

    .line 581
    :goto_3
    iget-object v3, v10, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    if-eqz v3, :cond_d

    .line 582
    invoke-virtual {v3, v6}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_d

    .line 584
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 585
    iget-object v3, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v13, v3, v2

    .line 586
    iget-object v15, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v16, v15, v2

    .line 588
    iget-wide v7, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v18, v13, v7

    if-lez v18, :cond_b

    .line 589
    iget-wide v11, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v13, v11

    :cond_b
    cmp-long v11, v16, v7

    if-lez v11, :cond_c

    .line 591
    iget-wide v7, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long v16, v16, v7

    .line 593
    :cond_c
    aput-wide v4, v3, v2

    .line 594
    aput-wide v0, v15, v2

    .line 595
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aput v9, v0, v2

    if-eqz p1, :cond_14

    .line 598
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-wide v2, v13

    move-wide/from16 v4, v16

    move-wide/from16 v6, p3

    move-wide/from16 v8, p5

    .line 599
    invoke-direct/range {v0 .. v9}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Object;JJJJ)V

    return-void

    .line 606
    :cond_d
    iget-object v3, v10, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    iget v7, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    .line 15
    array-length v8, v3

    if-ne v7, v8, :cond_e

    invoke-static {v7}, Ll/ۛ᩸ᩳ;->֫(I)I

    move-result v8

    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    .line 16
    :cond_e
    aput-object v6, v3, v7

    .line 606
    iput-object v3, v10, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    .line 607
    iget-object v3, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    iget v7, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    .line 27
    array-length v8, v3

    if-ne v7, v8, :cond_f

    invoke-static {v7}, Ll/ۛ᩸ᩳ;->֫(I)I

    move-result v8

    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    .line 28
    :cond_f
    aput-wide v4, v3, v7

    .line 607
    iput-object v3, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    .line 608
    iget-object v3, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    iget v4, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    .line 27
    array-length v5, v3

    if-ne v4, v5, :cond_10

    invoke-static {v4}, Ll/ۛ᩸ᩳ;->֫(I)I

    move-result v5

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    .line 28
    :cond_10
    aput-wide v0, v3, v4

    .line 608
    iput-object v3, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    .line 609
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    iget v1, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    .line 21
    array-length v3, v0

    if-ne v1, v3, :cond_11

    invoke-static {v1}, Ll/ۛ᩸ᩳ;->֫(I)I

    move-result v3

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    .line 22
    :cond_11
    aput v9, v0, v1

    .line 609
    iput-object v0, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    .line 610
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۡ:[I

    iget v1, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    iget v3, v10, Ll/ۨ᩸ᩳ;->᩷:I

    .line 21
    array-length v4, v0

    if-ne v1, v4, :cond_12

    invoke-static {v1}, Ll/ۛ᩸ᩳ;->֫(I)I

    move-result v4

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    .line 22
    :cond_12
    aput v3, v0, v1

    .line 610
    iput-object v0, v10, Ll/ۨ᩸ᩳ;->ۡ:[I

    .line 611
    iget v0, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    .line 1094
    iget v1, v10, Ll/ۨ᩸ᩳ;->ܿ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v10, Ll/ۨ᩸ᩳ;->ܿ:I

    .line 612
    iget v0, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    add-int/2addr v0, v2

    iput v0, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    .line 613
    iget v0, v10, Ll/ۨ᩸ᩳ;->᩷:I

    add-int/2addr v0, v2

    iput v0, v10, Ll/ۨ᩸ᩳ;->᩷:I

    .line 615
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ܽ()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v2

    .line 616
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->ۢ:[J

    array-length v1, v1

    if-ge v1, v0, :cond_13

    .line 617
    new-array v0, v0, [J

    iput-object v0, v10, Ll/ۨ᩸ᩳ;->ۢ:[J

    :cond_13
    if-eqz p1, :cond_14

    .line 621
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-wide/from16 v2, p3

    move-wide/from16 v4, p5

    .line 622
    invoke-direct/range {v0 .. v5}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Object;JJ)V

    :cond_14
    :goto_4
    return-void
.end method

.method public static ֫([I)V
    .locals 5

    .line 832
    sget-object v0, Ll/ۨ᩸ᩳ;->֡:[[I

    monitor-enter v0

    const/4 v1, 0x0

    .line 833
    :goto_0
    :try_start_0
    sget-object v2, Ll/ۨ᩸ᩳ;->֡:[[I

    array-length v3, v2

    if-ge v1, v3, :cond_2

    .line 834
    aget-object v3, v2, v1

    if-eqz v3, :cond_1

    array-length v4, p0

    array-length v3, v3

    if-le v4, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 835
    :cond_1
    :goto_1
    aput-object p0, v2, v1

    .line 839
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private ֫(IIIZ)Z
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    and-int/lit8 v5, v3, 0x1

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    .line 179
    iget-object v7, v0, Ll/ۨ᩸ᩳ;->ۢ:[J

    aget-wide v8, v7, v3

    invoke-direct {v0, v8, v9}, Ll/ۨ᩸ᩳ;->ۧ(J)I

    move-result v7

    if-lt v7, v1, :cond_0

    .line 180
    invoke-static/range {p3 .. p3}, Ll/ۨ᩸ᩳ;->ۧ(I)I

    move-result v7

    invoke-direct {v0, v1, v2, v7, v4}, Ll/ۨ᩸ᩳ;->֫(IIIZ)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    .line 184
    :cond_0
    iget v7, v0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge v3, v7, :cond_3

    .line 185
    iget-object v7, v0, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v7, v7, v3

    const/16 v8, 0x21

    and-int/2addr v7, v8

    if-ne v7, v8, :cond_2

    iget-object v7, v0, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v8, v7, v3

    int-to-long v10, v1

    cmp-long v7, v8, v10

    if-ltz v7, :cond_2

    iget-wide v12, v0, Ll/ۨ᩸ᩳ;->ܽ:J

    iget-wide v14, v0, Ll/ۨ᩸ᩳ;->ۧ:J

    add-long/2addr v14, v12

    cmp-long v16, v8, v14

    if-gez v16, :cond_2

    iget-object v8, v0, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v16, v8, v3

    cmp-long v8, v16, v10

    if-ltz v8, :cond_2

    cmp-long v8, v16, v14

    if-gez v8, :cond_2

    if-nez v4, :cond_1

    if-gtz v7, :cond_1

    cmp-long v7, v16, v12

    if-gez v7, :cond_2

    .line 191
    :cond_1
    iget-object v1, v0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    iget-object v2, v0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    invoke-direct {v0, v3}, Ll/ۨ᩸ᩳ;->ᩳ(I)V

    return v6

    .line 195
    :cond_2
    iget-object v7, v0, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v8, v7, v3

    invoke-direct {v0, v8, v9}, Ll/ۨ᩸ᩳ;->ۧ(J)I

    move-result v7

    if-gt v7, v2, :cond_3

    if-eqz v5, :cond_3

    .line 196
    invoke-static/range {p3 .. p3}, Ll/ۨ᩸ᩳ;->ܿ(I)I

    move-result v3

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۨ᩸ᩳ;->֫(IIIZ)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    return v6

    :cond_3
    const/4 v1, 0x0

    return v1
.end method

.method private ֫(IJ)Z
    .locals 2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-eqz p1, :cond_0

    .line 1098
    iget-object p1, p0, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    invoke-virtual {p1}, Ll/ۤ᩸ᩳ;->length()I

    move-result p1

    int-to-long v0, p1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x1

    sub-long/2addr p2, v0

    .line 627
    invoke-direct {p0, p2, p3}, Ll/ۨ᩸ᩳ;->֫(J)C

    move-result p1

    const/16 p2, 0xa

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ֫(Ljava/lang/Class;)[Ljava/lang/Object;
    .locals 4

    .line 701
    const-class v0, Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    .line 702
    sget-object p0, Ll/ۨ᩸ᩳ;->ᩴ:[Ljava/lang/Object;

    return-object p0

    .line 704
    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    rem-int/lit8 v0, v0, 0x49

    .line 705
    sget-object v1, Ll/ۨ᩸ᩳ;->᩵:[Ljava/lang/Object;

    aget-object v2, v1, v0

    if-eqz v2, :cond_1

    .line 706
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v3

    if-eq v3, p0, :cond_2

    :cond_1
    const/4 v2, 0x0

    .line 707
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v2

    .line 708
    aput-object v2, v1, v0

    .line 710
    :cond_2
    check-cast v2, [Ljava/lang/Object;

    return-object v2
.end method

.method public static ۧ(I)I
    .locals 2

    add-int/lit8 v0, p0, 0x1

    not-int v1, p0

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1

    sub-int/2addr p0, v0

    return p0
.end method

.method private ۧ(IIILjava/lang/Class;)I
    .locals 5

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    .line 922
    invoke-static {p3}, Ll/ۨ᩸ᩳ;->ۧ(I)I

    move-result v1

    .line 923
    iget-object v2, p0, Ll/ۨ᩸ᩳ;->ۢ:[J

    aget-wide v3, v2, v1

    invoke-direct {p0, v3, v4}, Ll/ۨ᩸ᩳ;->ۧ(J)I

    move-result v2

    if-le v2, p1, :cond_0

    .line 924
    invoke-direct {p0, p1, p2, v1, p4}, Ll/ۨ᩸ᩳ;->ۧ(IIILjava/lang/Class;)I

    move-result p2

    .line 927
    :cond_0
    iget v1, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge p3, v1, :cond_4

    .line 928
    iget-object v1, p0, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v2, v1, p3

    invoke-direct {p0, v2, v3}, Ll/ۨ᩸ᩳ;->ۧ(J)I

    move-result v1

    .line 929
    iget-object v2, p0, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v3, v2, p3

    invoke-direct {p0, v3, v4}, Ll/ۨ᩸ᩳ;->ۧ(J)I

    move-result v2

    if-le v1, p1, :cond_1

    if-ge v1, p2, :cond_1

    .line 930
    iget-object v3, p0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v3, v3, p3

    invoke-virtual {p4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move p2, v1

    :cond_1
    if-le v2, p1, :cond_2

    if-ge v2, p2, :cond_2

    .line 932
    iget-object v3, p0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v3, v3, p3

    invoke-virtual {p4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    move v2, p2

    :goto_0
    if-ge v1, v2, :cond_3

    if-eqz v0, :cond_3

    .line 935
    invoke-static {p3}, Ll/ۨ᩸ᩳ;->ܿ(I)I

    move-result p2

    invoke-direct {p0, p1, v2, p2, p4}, Ll/ۨ᩸ᩳ;->ۧ(IIILjava/lang/Class;)I

    move-result p1

    return p1

    :cond_3
    return v2

    :cond_4
    return p2
.end method

.method private ۧ(J)I
    .locals 4

    .line 644
    iget-wide v0, p0, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    iget-wide v0, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr p1, v0

    :cond_0
    long-to-int v0, p1

    int-to-long v1, v0

    cmp-long v3, p1, v1

    if-nez v3, :cond_1

    return v0

    .line 0
    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method private ۧ()V
    .locals 18

    move-object/from16 v0, p0

    .line 1052
    iget v1, v0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1054
    :goto_0
    iget v2, v0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge v1, v2, :cond_4

    .line 1055
    iget-object v2, v0, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v3, v2, v1

    add-int/lit8 v5, v1, -0x1

    aget-wide v5, v2, v5

    cmp-long v2, v3, v5

    if-gez v2, :cond_3

    .line 1056
    iget-object v2, v0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v2, v2, v1

    .line 1058
    iget-object v5, v0, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v6, v5, v1

    .line 1059
    iget-object v5, v0, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v5, v5, v1

    .line 1060
    iget-object v8, v0, Ll/ۨ᩸ᩳ;->ۡ:[I

    aget v8, v8, v1

    move v9, v1

    .line 1063
    :goto_1
    iget-object v10, v0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    add-int/lit8 v11, v9, -0x1

    aget-object v12, v10, v11

    aput-object v12, v10, v9

    .line 1064
    iget-object v12, v0, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v13, v12, v11

    aput-wide v13, v12, v9

    .line 1065
    iget-object v13, v0, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v14, v13, v11

    aput-wide v14, v13, v9

    .line 1066
    iget-object v14, v0, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v15, v14, v11

    aput v15, v14, v9

    .line 1067
    iget-object v15, v0, Ll/ۨ᩸ᩳ;->ۡ:[I

    aget v11, v15, v11

    aput v11, v15, v9

    add-int/lit8 v11, v9, -0x1

    if-lez v11, :cond_2

    add-int/lit8 v9, v9, -0x2

    .line 1069
    aget-wide v16, v12, v9

    cmp-long v9, v3, v16

    if-ltz v9, :cond_1

    goto :goto_2

    :cond_1
    move v9, v11

    goto :goto_1

    .line 1070
    :cond_2
    :goto_2
    aput-object v2, v10, v11

    .line 1071
    aput-wide v3, v12, v11

    .line 1072
    aput-wide v6, v13, v11

    .line 1073
    aput v5, v14, v11

    .line 1074
    aput v8, v15, v11

    .line 1094
    iget v2, v0, Ll/ۨ᩸ᩳ;->ܿ:I

    invoke-static {v11, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v0, Ll/ۨ᩸ᩳ;->ܿ:I

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1079
    :cond_4
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ܽ()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ۨ᩸ᩳ;->֫(I)J

    .line 1081
    iget-object v1, v0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    if-nez v1, :cond_5

    .line 1082
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v1, v0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    .line 1084
    :cond_5
    iget v1, v0, Ll/ۨ᩸ᩳ;->ܿ:I

    :goto_3
    iget v2, v0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge v1, v2, :cond_8

    .line 1085
    iget-object v2, v0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    iget-object v3, v0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v3, v3, v1

    invoke-virtual {v2, v3}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_6

    .line 1086
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v2, v1, :cond_7

    .line 1087
    :cond_6
    iget-object v2, v0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    iget-object v3, v0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v3, v3, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_8
    const v1, 0x7fffffff

    .line 1090
    iput v1, v0, Ll/ۨ᩸ᩳ;->ܿ:I

    return-void
.end method

.method private ۧ(Ljava/lang/Object;JJ)V
    .locals 5

    .line 621
    sget-object v0, Landroid/text/Selection;->SELECTION_START:Ljava/lang/Object;

    iget-object v1, p0, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    if-eq p1, v0, :cond_0

    sget-object v0, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-virtual {v1}, Ll/ۤ᩸ᩳ;->ۖ()V

    :cond_1
    long-to-int v0, p2

    int-to-long v2, v0

    cmp-long v4, p2, v2

    if-nez v4, :cond_6

    long-to-int p2, p4

    int-to-long v2, p2

    cmp-long p3, p4, v2

    if-nez p3, :cond_5

    .line 981
    const-class p4, Landroid/text/SpanWatcher;

    invoke-virtual {p0, v0, p2, p4}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Landroid/text/SpanWatcher;

    .line 982
    array-length p5, p4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p5, :cond_4

    aget-object v3, p4, v2

    if-nez v4, :cond_3

    if-nez p3, :cond_2

    .line 983
    invoke-interface {v3, v1, p1, v0, p2}, Landroid/text/SpanWatcher;->onSpanRemoved(Landroid/text/Spannable;Ljava/lang/Object;II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 0
    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method private ܽ()I
    .locals 1

    .line 1022
    iget v0, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public static ܽ(I)[I
    .locals 5

    .line 808
    sget-object v1, Ll/ۨ᩸ᩳ;->֡:[[I

    move-object v0, v1

    monitor-enter v0

    .line 811
    :try_start_0
    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, -0x1

    const/4 v3, -0x1

    :goto_0
    if-ltz v1, :cond_2

    .line 812
    sget-object v4, Ll/ۨ᩸ᩳ;->֡:[[I

    aget-object v4, v4, v1

    if-eqz v4, :cond_1

    .line 813
    array-length v4, v4

    if-lt v4, p0, :cond_0

    goto :goto_1

    :cond_0
    if-ne v3, v2, :cond_1

    move v3, v1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_1
    const/4 v3, 0x0

    if-eq v1, v2, :cond_3

    .line 823
    sget-object v2, Ll/ۨ᩸ᩳ;->֡:[[I

    aget-object v4, v2, v1

    .line 824
    aput-object v3, v2, v1

    move-object v3, v4

    .line 826
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_5

    .line 843
    array-length v0, v3

    if-le p0, v0, :cond_4

    goto :goto_2

    :cond_4
    return-object v3

    .line 844
    :cond_5
    :goto_2
    invoke-static {p0}, Ll/ۛ᩸ᩳ;->֫(I)I

    move-result p0

    new-array p0, p0, [I

    return-object p0

    :catchall_0
    move-exception p0

    .line 826
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ܿ(I)I
    .locals 2

    add-int/lit8 v0, p0, 0x1

    not-int v1, p0

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1

    add-int/2addr p0, v0

    return p0
.end method

.method private ᩳ(I)V
    .locals 11

    .line 419
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v2, v0, p1

    .line 421
    iget-object v1, p0, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v3, v1, p1

    .line 422
    iget-object v1, p0, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v5, v1, p1

    .line 424
    iget-wide v7, p0, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v1, v3, v7

    if-lez v1, :cond_0

    iget-wide v9, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v3, v9

    :cond_0
    cmp-long v1, v5, v7

    if-lez v1, :cond_1

    .line 425
    iget-wide v7, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v5, v7

    .line 427
    :cond_1
    iget v1, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    add-int/lit8 v7, p1, 0x1

    sub-int/2addr v1, v7

    .line 428
    invoke-static {v0, v7, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 429
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ܺ:[J

    invoke-static {v0, v7, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 430
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->᩻:[J

    invoke-static {v0, v7, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 431
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ۜ:[I

    invoke-static {v0, v7, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 432
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ۡ:[I

    invoke-static {v0, v7, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 434
    iget v0, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    .line 1094
    iget v0, p0, Ll/ۨ᩸ᩳ;->ܿ:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ۨ᩸ᩳ;->ܿ:I

    .line 437
    iget-object p1, p0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    iget v0, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    const/4 v1, 0x0

    aput-object v1, p1, v0

    .line 439
    invoke-direct {p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    move-object v1, p0

    .line 442
    invoke-direct/range {v1 .. v6}, Ll/ۨ᩸ᩳ;->ۧ(Ljava/lang/Object;JJ)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 3

    .line 654
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    if-nez v0, :cond_0

    goto :goto_0

    .line 655
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, -0x1

    return p1

    .line 656
    :cond_1
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->᩻:[J

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget-wide v1, v0, p1

    invoke-direct {p0, v1, v2}, Ll/ۨ᩸ᩳ;->ۧ(J)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 12

    .line 152
    iget v0, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_3

    .line 153
    iget-object v1, p0, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v3, v1, v0

    .line 154
    iget-object v2, p0, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v4, v2, v0

    .line 155
    iget-object v2, p0, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v6, v2, v0

    .line 157
    iget-wide v8, p0, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v2, v4, v8

    if-lez v2, :cond_0

    .line 158
    iget-wide v10, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v4, v10

    :cond_0
    cmp-long v2, v6, v8

    if-lez v2, :cond_1

    .line 160
    iget-wide v8, p0, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v6, v8

    .line 162
    :cond_1
    iput v0, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    const/4 v2, 0x0

    .line 163
    aput-object v2, v1, v0

    .line 165
    iget-object v1, p0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v3}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move-object v2, p0

    .line 167
    invoke-direct/range {v2 .. v7}, Ll/ۨ᩸ᩳ;->ۧ(Ljava/lang/Object;JJ)V

    goto :goto_0

    .line 169
    :cond_3
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    if-eqz v0, :cond_4

    .line 170
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->clear()V

    :cond_4
    const/4 v0, 0x0

    .line 172
    iput v0, p0, Ll/ۨ᩸ᩳ;->᩷:I

    return-void
.end method

.method public final ֫(IILjava/lang/CharSequence;IIZ)V
    .locals 42

    move-object/from16 v10, p0

    move/from16 v9, p1

    move/from16 v11, p2

    move-object/from16 v12, p3

    move/from16 v13, p4

    move/from16 v14, p5

    int-to-long v7, v9

    int-to-long v4, v11

    const-string v1, "replace"

    move-object/from16 v0, p0

    move-wide v2, v7

    move-wide v15, v4

    .line 208
    invoke-direct/range {v0 .. v5}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/String;JJ)V

    sub-int v5, v11, v9

    sub-int v6, v14, v13

    .line 213
    const-class v3, Ljava/lang/Object;

    if-nez v5, :cond_1

    if-nez v6, :cond_1

    .line 447
    instance-of v0, v12, Landroid/text/Spanned;

    if-eqz v0, :cond_54

    .line 448
    move-object v0, v12

    check-cast v0, Landroid/text/Spanned;

    .line 449
    invoke-interface {v0, v13, v13, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    .line 450
    array-length v2, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_54

    move/from16 v17, v2

    .line 452
    aget-object v2, v1, v4

    .line 453
    invoke-interface {v0, v2}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v0

    const/16 v0, 0x21

    if-eq v2, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    move/from16 v2, v17

    move-object/from16 v0, v18

    goto :goto_0

    :cond_1
    :goto_1
    add-int v0, v9, v5

    .line 218
    const-class v1, Landroid/text/TextWatcher;

    invoke-virtual {v10, v9, v0, v1}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [Landroid/text/TextWatcher;

    .line 948
    array-length v0, v4

    const/4 v1, 0x0

    :goto_2
    iget-object v2, v10, Ll/ۨ᩸ᩳ;->֫:Ll/ۤ᩸ᩳ;

    if-ge v1, v0, :cond_2

    move/from16 v17, v0

    aget-object v0, v4, v1

    .line 949
    invoke-interface {v0, v2, v9, v5, v6}, Landroid/text/TextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;III)V

    add-int/lit8 v1, v1, 0x1

    move/from16 v0, v17

    goto :goto_2

    :cond_2
    if-eqz v5, :cond_3

    if-eqz v6, :cond_3

    const/4 v0, 0x1

    const/16 v17, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    const/16 v17, 0x0

    :goto_3
    if-nez v17, :cond_5

    if-eqz p6, :cond_4

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x0

    const/16 v18, 0x0

    goto :goto_5

    .line 225
    :cond_5
    :goto_4
    invoke-static {v2}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    .line 226
    invoke-static {v2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    move/from16 v18, v0

    move v0, v1

    :goto_5
    sub-int v1, v6, v5

    move/from16 v19, v0

    .line 278
    iget v0, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    add-int/lit8 v0, v0, -0x1

    const/16 v20, 0x0

    move/from16 v20, v0

    const/4 v0, 0x0

    :goto_6
    const-wide/16 v21, 0x1

    if-ltz v20, :cond_16

    move/from16 v23, v1

    .line 279
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v24, v1, v20

    move-object/from16 v26, v3

    move-object/from16 v27, v4

    .line 280
    iget-wide v3, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v1, v24, v3

    if-lez v1, :cond_6

    move/from16 v28, v5

    move/from16 v29, v6

    .line 281
    iget-wide v5, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long v24, v24, v5

    goto :goto_7

    :cond_6
    move/from16 v28, v5

    move/from16 v29, v6

    .line 283
    :goto_7
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v5, v1, v20

    cmp-long v1, v5, v3

    if-lez v1, :cond_7

    .line 285
    iget-wide v3, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v5, v3

    .line 287
    :cond_7
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v1, v1, v20

    const/16 v3, 0x33

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_11

    .line 1098
    invoke-virtual {v2}, Ll/ۤ᩸ᩳ;->length()I

    move-result v1

    cmp-long v3, v24, v7

    if-lez v3, :cond_9

    move-wide v3, v15

    cmp-long v15, v24, v3

    if-gtz v15, :cond_a

    move-wide v15, v3

    :goto_8
    int-to-long v13, v1

    cmp-long v30, v15, v13

    if-gez v30, :cond_b

    cmp-long v13, v15, v3

    if-lez v13, :cond_8

    sub-long v13, v15, v21

    .line 294
    invoke-direct {v10, v13, v14}, Ll/ۨ᩸ᩳ;->֫(J)C

    move-result v13

    const/16 v14, 0xa

    if-ne v13, v14, :cond_8

    goto :goto_9

    :cond_8
    add-long v15, v15, v21

    goto :goto_8

    :cond_9
    move-wide v3, v15

    :cond_a
    move-wide/from16 v15, v24

    :cond_b
    :goto_9
    cmp-long v13, v5, v7

    if-lez v13, :cond_d

    cmp-long v13, v5, v3

    if-gtz v13, :cond_d

    move-wide v13, v3

    move-wide/from16 v30, v7

    :goto_a
    int-to-long v7, v1

    cmp-long v32, v13, v7

    if-gez v32, :cond_e

    cmp-long v7, v13, v3

    if-lez v7, :cond_c

    sub-long v7, v13, v21

    .line 300
    invoke-direct {v10, v7, v8}, Ll/ۨ᩸ᩳ;->֫(J)C

    move-result v7

    const/16 v8, 0xa

    if-ne v7, v8, :cond_c

    goto :goto_b

    :cond_c
    add-long v13, v13, v21

    goto :goto_a

    :cond_d
    move-wide/from16 v30, v7

    move-wide v13, v5

    :cond_e
    :goto_b
    cmp-long v1, v15, v24

    if-nez v1, :cond_10

    cmp-long v1, v13, v5

    if-eqz v1, :cond_f

    goto :goto_c

    :cond_f
    const v1, 0x8000

    move-wide/from16 v35, v3

    move-wide v5, v13

    move-wide/from16 v24, v15

    move/from16 v33, v18

    move/from16 v41, v19

    move/from16 v34, v23

    move-object/from16 v40, v26

    move-object/from16 v37, v27

    move/from16 v38, v28

    move/from16 v39, v29

    move-wide/from16 v26, v30

    move-object/from16 v18, v2

    goto :goto_d

    .line 305
    :cond_10
    :goto_c
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v5, v0, v20

    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v7, v0, v20

    const/4 v8, 0x1

    const/4 v1, 0x0

    const v21, 0x8000

    move/from16 v6, v19

    move-object/from16 v0, p0

    move/from16 v33, v18

    move/from16 v34, v23

    move-object/from16 v18, v2

    move-object v2, v5

    move-wide/from16 v35, v3

    move-object/from16 v5, v26

    move-object/from16 v37, v27

    move-wide v3, v15

    move-object/from16 v40, v5

    move/from16 v41, v6

    move/from16 v38, v28

    move/from16 v39, v29

    move-wide v5, v13

    move-wide/from16 v26, v30

    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(ZLjava/lang/Object;JJIZ)V

    const/4 v0, 0x1

    goto :goto_e

    :cond_11
    move-wide/from16 v35, v15

    move/from16 v33, v18

    move/from16 v41, v19

    move/from16 v34, v23

    move-object/from16 v40, v26

    move-object/from16 v37, v27

    move/from16 v38, v28

    move/from16 v39, v29

    move-object/from16 v18, v2

    move-wide/from16 v26, v7

    const v1, 0x8000

    :goto_d
    move/from16 v21, v1

    move-wide v13, v5

    move-wide/from16 v15, v24

    :goto_e
    cmp-long v1, v15, v26

    if-nez v1, :cond_12

    const/16 v1, 0x1000

    move/from16 v8, v34

    goto :goto_f

    :cond_12
    move/from16 v8, v34

    add-int v1, v11, v8

    int-to-long v1, v1

    cmp-long v3, v15, v1

    if-nez v3, :cond_13

    const/16 v1, 0x2000

    goto :goto_f

    :cond_13
    const/4 v1, 0x0

    :goto_f
    cmp-long v2, v13, v26

    if-nez v2, :cond_14

    or-int/lit16 v1, v1, 0x4000

    goto :goto_10

    :cond_14
    add-int v2, v11, v8

    int-to-long v2, v2

    cmp-long v4, v13, v2

    if-nez v4, :cond_15

    or-int v1, v1, v21

    .line 316
    :cond_15
    :goto_10
    iget-object v2, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v3, v2, v20

    or-int/2addr v1, v3

    aput v1, v2, v20

    add-int/lit8 v20, v20, -0x1

    move/from16 v13, p4

    move/from16 v14, p5

    move v1, v8

    move-object/from16 v2, v18

    move-wide/from16 v7, v26

    move/from16 v18, v33

    move-wide/from16 v15, v35

    move-object/from16 v4, v37

    move/from16 v5, v38

    move/from16 v6, v39

    move-object/from16 v3, v40

    move/from16 v19, v41

    goto/16 :goto_6

    :cond_16
    move-object/from16 v40, v3

    move-object/from16 v37, v4

    move/from16 v38, v5

    move/from16 v39, v6

    move-wide/from16 v26, v7

    move-wide/from16 v35, v15

    move/from16 v33, v18

    move/from16 v41, v19

    move v8, v1

    move-object/from16 v18, v2

    if-eqz v0, :cond_17

    .line 319
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    .line 105
    :cond_17
    iget-wide v0, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    move-wide/from16 v2, v35

    cmp-long v4, v2, v0

    if-nez v4, :cond_18

    goto/16 :goto_16

    .line 1098
    :cond_18
    invoke-virtual/range {v18 .. v18}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    if-ne v11, v0, :cond_19

    const/4 v0, 0x1

    goto :goto_11

    :cond_19
    const/4 v0, 0x0

    .line 110
    :goto_11
    iget v1, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    if-eqz v1, :cond_25

    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 112
    :goto_12
    iget v5, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge v1, v5, :cond_23

    .line 113
    iget-object v5, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v6, v5, v1

    .line 114
    iget-object v14, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v15, v14, v1

    move-object/from16 v20, v14

    .line 116
    iget-wide v13, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v23, v6, v13

    if-lez v23, :cond_1a

    .line 117
    iget-wide v11, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v6, v11

    :cond_1a
    cmp-long v11, v6, v2

    if-lez v11, :cond_1b

    .line 119
    iget-wide v11, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    goto :goto_13

    :cond_1b
    if-nez v11, :cond_1d

    .line 121
    iget-object v11, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v11, v11, v1

    and-int/lit16 v11, v11, 0xf0

    shr-int/lit8 v11, v11, 0x4

    const/4 v12, 0x2

    if-eq v11, v12, :cond_1c

    if-eqz v0, :cond_1d

    const/4 v12, 0x3

    if-ne v11, v12, :cond_1d

    .line 124
    :cond_1c
    iget-wide v11, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    :goto_13
    add-long/2addr v6, v11

    :cond_1d
    cmp-long v11, v15, v13

    if-lez v11, :cond_1e

    .line 128
    iget-wide v11, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v15, v11

    :cond_1e
    cmp-long v11, v15, v2

    if-lez v11, :cond_1f

    .line 130
    iget-wide v11, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    goto :goto_14

    :cond_1f
    if-nez v11, :cond_21

    .line 132
    iget-object v11, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v11, v11, v1

    and-int/lit8 v11, v11, 0xf

    const/4 v12, 0x2

    if-eq v11, v12, :cond_20

    if-eqz v0, :cond_21

    const/4 v12, 0x3

    if-ne v11, v12, :cond_21

    .line 135
    :cond_20
    iget-wide v11, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    :goto_14
    add-long/2addr v15, v11

    .line 138
    :cond_21
    aput-wide v6, v5, v1

    .line 139
    aput-wide v15, v20, v1

    if-lez v1, :cond_22

    add-int/lit8 v11, v1, -0x1

    .line 140
    aget-wide v11, v5, v11

    cmp-long v5, v6, v11

    if-gez v5, :cond_22

    const/4 v4, 0x1

    :cond_22
    add-int/lit8 v1, v1, 0x1

    move/from16 v11, p2

    move-object/from16 v12, p3

    goto :goto_12

    :cond_23
    if-eqz v4, :cond_24

    .line 144
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    goto :goto_15

    .line 145
    :cond_24
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ܽ()I

    move-result v0

    invoke-direct {v10, v0}, Ll/ۨ᩸ᩳ;->֫(I)J

    .line 148
    :cond_25
    :goto_15
    iput-wide v2, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    :goto_16
    int-to-long v11, v8

    .line 324
    iget-wide v0, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    const-string v6, "mGapLength < 1"

    cmp-long v2, v11, v0

    if-ltz v2, :cond_2b

    .line 325
    iget-wide v2, v10, Ll/ۨ᩸ᩳ;->ۘ:J

    add-long v4, v2, v11

    sub-long/2addr v4, v0

    add-long v0, v4, v21

    cmp-long v7, v0, v2

    if-gtz v7, :cond_26

    goto :goto_18

    :cond_26
    const-wide/16 v0, 0x2

    mul-long v4, v4, v0

    const-wide/16 v0, 0x8

    .line 86
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sub-long v2, v0, v2

    .line 88
    iput-wide v0, v10, Ll/ۨ᩸ᩳ;->ۘ:J

    .line 90
    iget-wide v0, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    add-long/2addr v0, v2

    iput-wide v0, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    cmp-long v4, v0, v21

    if-gez v4, :cond_27

    .line 92
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 94
    :cond_27
    iget v0, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    if-eqz v0, :cond_2b

    const/4 v0, 0x0

    .line 95
    :goto_17
    iget v1, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge v0, v1, :cond_2a

    .line 96
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v4, v1, v0

    iget-wide v13, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v7, v4, v13

    if-lez v7, :cond_28

    add-long/2addr v4, v2

    aput-wide v4, v1, v0

    .line 97
    :cond_28
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v4, v1, v0

    cmp-long v7, v4, v13

    if-lez v7, :cond_29

    add-long/2addr v4, v2

    aput-wide v4, v1, v0

    :cond_29
    add-int/lit8 v0, v0, 0x1

    goto :goto_17

    .line 99
    :cond_2a
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ܽ()I

    move-result v0

    invoke-direct {v10, v0}, Ll/ۨ᩸ᩳ;->֫(I)J

    :cond_2b
    :goto_18
    move/from16 v13, v39

    if-nez v13, :cond_2c

    const/4 v0, 0x1

    move/from16 v15, v38

    const/4 v14, 0x1

    goto :goto_19

    :cond_2c
    const/4 v0, 0x0

    move/from16 v15, v38

    const/4 v14, 0x0

    :goto_19
    if-lez v15, :cond_2d

    .line 331
    :goto_1a
    iget v0, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    if-lez v0, :cond_2d

    .line 332
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ܽ()I

    move-result v0

    move/from16 v7, p2

    invoke-direct {v10, v9, v7, v0, v14}, Ll/ۨ᩸ᩳ;->֫(IIIZ)Z

    move-result v0

    if-eqz v0, :cond_2e

    goto :goto_1a

    :cond_2d
    move/from16 v7, p2

    :cond_2e
    move-object/from16 v0, v18

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    .line 338
    invoke-virtual/range {v0 .. v5}, Ll/ۤ᩸ᩳ;->֫(IILjava/lang/CharSequence;II)V

    .line 340
    iget-wide v0, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    add-long/2addr v0, v11

    iput-wide v0, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    .line 341
    iget-wide v0, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v0, v11

    iput-wide v0, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    cmp-long v2, v0, v21

    if-gez v2, :cond_2f

    .line 344
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :cond_2f
    if-lez v15, :cond_32

    .line 348
    iget-wide v0, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    iget-wide v2, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    add-long/2addr v0, v2

    iget-wide v2, v10, Ll/ۨ᩸ᩳ;->ۘ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_30

    const/4 v0, 0x1

    const/16 v16, 0x1

    goto :goto_1b

    :cond_30
    const/4 v0, 0x0

    const/16 v16, 0x0

    :goto_1b
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 350
    :goto_1c
    iget v0, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge v6, v0, :cond_31

    .line 351
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v0, v0, v6

    and-int/lit16 v0, v0, 0xf0

    shr-int/lit8 v3, v0, 0x4

    .line 352
    iget-object v4, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v20, v4, v6

    move-object/from16 v0, p0

    move/from16 v1, p1

    move v2, v8

    move-object/from16 v22, v4

    move-wide/from16 v4, v20

    move/from16 v20, v6

    move/from16 v6, v16

    move-wide/from16 v23, v11

    move v11, v7

    move v7, v14

    invoke-direct/range {v0 .. v7}, Ll/ۨ᩸ᩳ;->֫(IIIJZZ)J

    move-result-wide v0

    aput-wide v0, v22, v20

    .line 355
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v0, v0, v20

    and-int/lit8 v3, v0, 0xf

    .line 356
    iget-object v12, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v4, v12, v20

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct/range {v0 .. v7}, Ll/ۨ᩸ᩳ;->֫(IIIJZZ)J

    move-result-wide v0

    aput-wide v0, v12, v20

    add-int/lit8 v6, v20, 0x1

    move v7, v11

    move-wide/from16 v11, v23

    goto :goto_1c

    :cond_31
    move-wide/from16 v23, v11

    move v11, v7

    .line 360
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    goto :goto_1d

    :cond_32
    move-wide/from16 v23, v11

    move v11, v7

    :goto_1d
    move-object/from16 v0, p3

    .line 363
    instance-of v1, v0, Landroid/text/Spanned;

    if-eqz v1, :cond_38

    move-object v12, v0

    check-cast v12, Landroid/text/Spanned;

    move/from16 v14, p4

    move/from16 v7, p5

    move-object/from16 v0, v40

    .line 364
    invoke-interface {v12, v14, v7, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    .line 366
    array-length v6, v5

    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_1e
    if-ge v3, v6, :cond_37

    aget-object v2, v5, v3

    .line 367
    instance-of v0, v2, Landroid/text/TextWatcher;

    if-eqz v0, :cond_34

    :cond_33
    move/from16 v16, v3

    move-object/from16 v22, v5

    move/from16 v25, v6

    move/from16 v20, v8

    goto :goto_1f

    .line 370
    :cond_34
    invoke-interface {v12, v2}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    .line 371
    invoke-interface {v12, v2}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v1

    if-ge v0, v14, :cond_35

    move v0, v14

    :cond_35
    if-le v1, v7, :cond_36

    move v1, v7

    .line 376
    :cond_36
    invoke-virtual {v10, v2}, Ll/ۨ᩸ᩳ;->ܽ(Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_33

    sub-int/2addr v0, v14

    add-int/2addr v0, v9

    sub-int/2addr v1, v14

    add-int/2addr v1, v9

    .line 379
    invoke-interface {v12, v2}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v4

    or-int/lit16 v4, v4, 0x800

    move/from16 v16, v3

    move/from16 v20, v4

    int-to-long v3, v0

    int-to-long v0, v1

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-wide/from16 v28, v0

    move-object/from16 v0, p0

    move/from16 v1, v22

    move-object/from16 v22, v5

    move/from16 v25, v6

    move-wide/from16 v5, v28

    move/from16 v7, v20

    move/from16 v20, v8

    move/from16 v8, v21

    .line 381
    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(ZLjava/lang/Object;JJIZ)V

    :goto_1f
    add-int/lit8 v3, v16, 0x1

    move/from16 v7, p5

    move/from16 v8, v20

    move-object/from16 v5, v22

    move/from16 v6, v25

    goto :goto_1e

    :cond_37
    move/from16 v20, v8

    .line 385
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    goto :goto_20

    :cond_38
    move/from16 v20, v8

    :goto_20
    if-eqz v17, :cond_3e

    move/from16 v0, v33

    if-le v0, v9, :cond_3a

    if-ge v0, v11, :cond_3a

    sub-int/2addr v0, v9

    int-to-long v0, v0

    int-to-long v2, v13

    mul-long v0, v0, v2

    int-to-long v2, v15

    .line 235
    div-long/2addr v0, v2

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_39

    add-int v12, v9, v2

    .line 239
    sget-object v2, Landroid/text/Selection;->SELECTION_START:Ljava/lang/Object;

    int-to-long v5, v12

    const/16 v7, 0x22

    const/4 v8, 0x1

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-wide v3, v5

    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(ZLjava/lang/Object;JJIZ)V

    const/4 v0, 0x1

    goto :goto_21

    .line 0
    :cond_39
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_3a
    const/4 v1, 0x0

    move v12, v0

    const/4 v0, 0x0

    :goto_21
    move/from16 v1, v41

    if-le v1, v9, :cond_3c

    if-ge v1, v11, :cond_3c

    sub-int v0, v1, v9

    int-to-long v0, v0

    int-to-long v2, v13

    mul-long v0, v0, v2

    int-to-long v2, v15

    .line 244
    div-long/2addr v0, v2

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_3b

    add-int v14, v9, v2

    .line 248
    sget-object v2, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    int-to-long v5, v14

    const/16 v7, 0x22

    const/4 v8, 0x1

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-wide v3, v5

    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(ZLjava/lang/Object;JJIZ)V

    const/4 v0, 0x1

    goto :goto_22

    .line 0
    :cond_3b
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_3c
    move v14, v1

    :goto_22
    if-eqz v0, :cond_3d

    .line 252
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    :cond_3d
    move v1, v12

    goto :goto_23

    :cond_3e
    move/from16 v0, v33

    move/from16 v1, v41

    move v14, v1

    move v1, v0

    :goto_23
    if-eqz p6, :cond_41

    if-ltz v1, :cond_3f

    .line 257
    sget-object v2, Landroid/text/Selection;->SELECTION_START:Ljava/lang/Object;

    int-to-long v5, v1

    const/16 v7, 0x22

    const/4 v8, 0x1

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-wide v3, v5

    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(ZLjava/lang/Object;JJIZ)V

    :cond_3f
    if-ltz v14, :cond_40

    .line 259
    sget-object v2, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    int-to-long v5, v14

    const/16 v7, 0x22

    const/4 v8, 0x1

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-wide v3, v5

    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(ZLjava/lang/Object;JJIZ)V

    .line 261
    :cond_40
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩸ᩳ;->ۧ()V

    .line 263
    :cond_41
    invoke-virtual/range {v18 .. v18}, Ll/ۤ᩸ᩳ;->ۖ()V

    move-object/from16 v0, v37

    .line 956
    array-length v1, v0

    const/4 v2, 0x0

    :goto_24
    if-ge v2, v1, :cond_42

    aget-object v3, v0, v2

    move-object/from16 v4, v18

    .line 957
    invoke-interface {v3, v4, v9, v15, v13}, Landroid/text/TextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_24

    :cond_42
    move-object/from16 v4, v18

    .line 965
    array-length v1, v0

    const/4 v2, 0x0

    :goto_25
    if-ge v2, v1, :cond_43

    aget-object v3, v0, v2

    .line 966
    invoke-interface {v3, v4}, Landroid/text/TextWatcher;->afterTextChanged(Landroid/text/Editable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_25

    :cond_43
    const/4 v0, 0x0

    const/4 v12, 0x0

    const v13, 0x8000

    .line 462
    :goto_26
    iget v0, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge v12, v0, :cond_50

    .line 463
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v0, v0, v12

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_44

    goto/16 :goto_2c

    .line 466
    :cond_44
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v2, v1, v12

    .line 467
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v4, v1, v12

    .line 468
    iget-wide v6, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v1, v2, v6

    if-lez v1, :cond_45

    iget-wide v8, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v2, v8

    :cond_45
    move-wide v8, v2

    cmp-long v1, v4, v6

    if-lez v1, :cond_46

    .line 469
    iget-wide v1, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v4, v1

    :cond_46
    move-wide v14, v4

    add-int v1, v11, v20

    int-to-long v1, v1

    cmp-long v3, v8, v1

    if-lez v3, :cond_47

    if-eqz v20, :cond_4a

    sub-long v3, v8, v23

    goto :goto_27

    :cond_47
    cmp-long v4, v8, v26

    if-ltz v4, :cond_4a

    if-nez v4, :cond_48

    and-int/lit16 v4, v0, 0x1000

    const/16 v5, 0x1000

    if-eq v4, v5, :cond_4a

    :cond_48
    if-nez v3, :cond_49

    and-int/lit16 v3, v0, 0x2000

    const/16 v4, 0x2000

    if-eq v3, v4, :cond_4a

    :cond_49
    move-wide v3, v8

    :goto_27
    const/4 v5, 0x1

    goto :goto_28

    :cond_4a
    const/4 v5, 0x0

    move-wide v3, v8

    :goto_28
    cmp-long v6, v14, v1

    if-lez v6, :cond_4b

    if-eqz v20, :cond_4e

    sub-long v0, v14, v23

    goto :goto_29

    :cond_4b
    cmp-long v1, v14, v26

    if-ltz v1, :cond_4e

    if-nez v1, :cond_4c

    and-int/lit16 v1, v0, 0x4000

    const/16 v2, 0x4000

    if-eq v1, v2, :cond_4e

    :cond_4c
    if-nez v6, :cond_4d

    and-int/2addr v0, v13

    const v1, 0x8000

    if-eq v0, v1, :cond_4e

    :cond_4d
    move-wide v0, v14

    :goto_29
    const/4 v5, 0x1

    move-wide v5, v0

    const/4 v0, 0x1

    goto :goto_2a

    :cond_4e
    move v0, v5

    move-wide v5, v14

    :goto_2a
    if-eqz v0, :cond_4f

    .line 509
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v1, v0, v12

    const v13, 0x8000

    move-object/from16 v0, p0

    move-wide v2, v3

    move-wide v4, v5

    move-wide v6, v8

    move-wide v8, v14

    invoke-direct/range {v0 .. v9}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Object;JJJJ)V

    goto :goto_2b

    :cond_4f
    const v13, 0x8000

    .line 511
    :goto_2b
    iget-object v0, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v1, v0, v12

    const v2, -0xf001

    and-int/2addr v1, v2

    aput v1, v0, v12

    :goto_2c
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_26

    :cond_50
    const/4 v0, 0x0

    .line 514
    :goto_2d
    iget v1, v10, Ll/ۨ᩸ᩳ;->ܳ:I

    if-ge v0, v1, :cond_54

    .line 515
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->ۜ:[I

    aget v2, v1, v0

    and-int/lit16 v3, v2, 0x800

    if-eqz v3, :cond_53

    and-int/lit16 v2, v2, -0x801

    .line 517
    aput v2, v1, v0

    .line 518
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->ܺ:[J

    aget-wide v2, v1, v0

    .line 519
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->᩻:[J

    aget-wide v4, v1, v0

    .line 520
    iget-wide v6, v10, Ll/ۨ᩸ᩳ;->ܽ:J

    cmp-long v1, v2, v6

    if-lez v1, :cond_51

    iget-wide v8, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v2, v8

    :cond_51
    cmp-long v1, v4, v6

    if-lez v1, :cond_52

    .line 521
    iget-wide v6, v10, Ll/ۨ᩸ᩳ;->ۧ:J

    sub-long/2addr v4, v6

    .line 522
    :cond_52
    iget-object v1, v10, Ll/ۨ᩸ᩳ;->ۖ:[Ljava/lang/Object;

    aget-object v1, v1, v0

    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-wide/from16 p3, v2

    move-wide/from16 p5, v4

    invoke-direct/range {p1 .. p6}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Object;JJ)V

    :cond_53
    add-int/lit8 v0, v0, 0x1

    goto :goto_2d

    :cond_54
    return-void
.end method

.method public final ֫(Ljava/lang/Object;III)V
    .locals 9

    int-to-long v3, p2

    int-to-long v5, p3

    const/4 v8, 0x1

    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p1

    move v7, p4

    .line 528
    invoke-direct/range {v0 .. v8}, Ll/ۨ᩸ᩳ;->֫(ZLjava/lang/Object;JJIZ)V

    return-void
.end method

.method public final ֫(IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 12

    if-nez p3, :cond_0

    .line 673
    const-class p1, Ljava/lang/Object;

    invoke-static {p1}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 675
    :cond_0
    iget v0, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-nez v0, :cond_1

    invoke-static {p3}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 676
    :cond_1
    invoke-direct {p0}, Ll/ۨ᩸ᩳ;->ܽ()I

    move-result v0

    invoke-direct {p0, p1, p2, v0, p3}, Ll/ۨ᩸ᩳ;->֫(IIILjava/lang/Class;)I

    move-result v0

    if-nez v0, :cond_2

    .line 678
    invoke-static {p3}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 682
    :cond_2
    invoke-static {p3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    .line 683
    invoke-static {v0}, Ll/ۨ᩸ᩳ;->ܽ(I)[I

    move-result-object v11

    .line 684
    invoke-static {v0}, Ll/ۨ᩸ᩳ;->ܽ(I)[I

    move-result-object v0

    .line 685
    invoke-direct {p0}, Ll/ۨ᩸ᩳ;->ܽ()I

    move-result v6

    const/4 v10, 0x0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v7, v1

    move-object v8, v11

    move-object v9, v0

    invoke-direct/range {v2 .. v10}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/Class;I[Ljava/lang/Object;[I[II)I

    .line 850
    array-length p1, v1

    .line 851
    div-int/lit8 p2, p1, 0x2

    :goto_0
    add-int/lit8 p2, p2, -0x1

    if-ltz p2, :cond_3

    .line 852
    invoke-static {p2, v1, p1, v11, v0}, Ll/ۨ᩸ᩳ;->֫(I[Ljava/lang/Object;I[I[I)V

    goto :goto_0

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, -0x1

    if-lez p1, :cond_4

    const/4 p2, 0x0

    .line 856
    aget-object p3, v1, p2

    .line 857
    aget-object v2, v1, p1

    aput-object v2, v1, p2

    .line 858
    aput-object p3, v1, p1

    .line 860
    aget p3, v11, p2

    .line 861
    aget v2, v11, p1

    aput v2, v11, p2

    .line 862
    aput p3, v11, p1

    .line 864
    aget p3, v0, p2

    .line 865
    aget v2, v0, p1

    aput v2, v0, p2

    .line 866
    aput p3, v0, p1

    .line 868
    invoke-static {p2, v1, p1, v11, v0}, Ll/ۨ᩸ᩳ;->֫(I[Ljava/lang/Object;I[I[I)V

    goto :goto_1

    .line 689
    :cond_4
    invoke-static {v11}, Ll/ۨ᩸ᩳ;->֫([I)V

    .line 690
    invoke-static {v0}, Ll/ۨ᩸ᩳ;->֫([I)V

    return-object v1
.end method

.method public final ۧ(IILjava/lang/Class;)I
    .locals 1

    .line 912
    iget v0, p0, Ll/ۨ᩸ᩳ;->ܳ:I

    if-nez v0, :cond_0

    return p2

    :cond_0
    if-nez p3, :cond_1

    .line 914
    const-class p3, Ljava/lang/Object;

    .line 916
    :cond_1
    invoke-direct {p0}, Ll/ۨ᩸ᩳ;->ܽ()I

    move-result v0

    invoke-direct {p0, p1, p2, v0, p3}, Ll/ۨ᩸ᩳ;->ۧ(IIILjava/lang/Class;)I

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 2

    .line 660
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 661
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_1

    return v1

    .line 662
    :cond_1
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ۜ:[I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget p1, v0, p1

    return p1
.end method

.method public final ܽ(Ljava/lang/Object;)I
    .locals 3

    .line 648
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 649
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_1

    return v1

    .line 650
    :cond_1
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ܺ:[J

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget-wide v1, v0, p1

    invoke-direct {p0, v1, v2}, Ll/ۨ᩸ᩳ;->ۧ(J)I

    move-result p1

    return p1
.end method

.method public final ᩳ(Ljava/lang/Object;)V
    .locals 1

    .line 635
    iget-object v0, p0, Ll/ۨ᩸ᩳ;->ᩳ:Ljava/util/IdentityHashMap;

    if-nez v0, :cond_0

    goto :goto_0

    .line 636
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 638
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۨ᩸ᩳ;->ᩳ(I)V

    :cond_1
    :goto_0
    return-void
.end method
