.class public final Ll/ᩳܽۧ;
.super Ljava/lang/Object;
.source "L8S9"

# interfaces
.implements Ll/ۢۧۧ;
.implements Ll/᩸᩷ۧ;
.implements Ll/ᩳܳۧ;
.implements Ll/ۜܳۧ;
.implements Ll/ۖܽۧ;


# static fields
.field public static final ۛ֫:Ll/۠ᩴ֫;

.field public static final synthetic ۤ֫:I

.field public static final ۨ֫:Ljava/util/Map;


# instance fields
.field public ֡֫:Z

.field public ֨֫:Z

.field public ֫֫:Z

.field public final ۖ֫:Ll/ۛۧۧ;

.field public ۗ:I

.field public final ۗ֫:Ll/۠ᩴ֫;

.field public ۘ֫:Z

.field public final ۙ:Ll/᩸۠֫;

.field public final ۙ֫:J

.field public final ۚ֫:Ll/ܺ֫ۧ;

.field public ۛ:I

.field public final ۜ֫:Ll/ۡܳۧ;

.field public ۟:Ll/ۤۡۧ;

.field public ۠֫:[Ll/ۧܽۧ;

.field public final ۡ֫:Ll/۠ۧۧ;

.field public final ۢ֫:Ll/ۤۧۧ;

.field public ۤ:J

.field public ۧ֫:Z

.field public ۨ:I

.field public final ۫:Ll/ۙۛ֫;

.field public final ۫֫:Landroid/net/Uri;

.field public final ۬:Ll/ܶۛ֫;

.field public ۬֫:Ll/ܽܽۧ;

.field public ܰ:Z

.field public final ܳ֫:Ll/ܳۚ֫;

.field public ܶ֫:[Ll/ۘܽۧ;

.field public ܺ֫:Z

.field public ܽ֫:Z

.field public final ܿ֫:Ll/᩻ܽۧ;

.field public ᩳ֫:J

.field public ᩴ֫:Z

.field public ᩵֫:J

.field public final ᩶:J

.field public ᩶֫:Z

.field public ᩷֫:Z

.field public final ᩸:Ll/᩸ܿۧ;

.field public ᩸֫:Z

.field public ᩹:Ll/᩷ۧۧ;

.field public ᩹֫:Ll/ۢۢۧ;

.field public final ᩺:Landroid/os/Handler;

.field public final ᩻֫:Ll/ۧܳۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1252
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Icy-MetaData"

    const-string v2, "1"

    .line 1253
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1256
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 108
    sput-object v0, Ll/ᩳܽۧ;->ۨ֫:Ljava/util/Map;

    .line 110
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "icy"

    .line 111
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v1, "application/x-icy"

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    sput-object v0, Ll/ᩳܽۧ;->ۛ֫:Ll/۠ᩴ֫;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Ll/᩸۠֫;Ll/ܺ֫ۧ;Ll/ۙۛ֫;Ll/ܶۛ֫;Ll/ۧܳۧ;Ll/۠ۧۧ;Ll/᩻ܽۧ;Ll/᩸ܿۧ;ILl/۠ᩴ֫;JLl/۠ܳۧ;)V
    .locals 0

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    iput-object p1, p0, Ll/ᩳܽۧ;->۫֫:Landroid/net/Uri;

    .line 205
    iput-object p2, p0, Ll/ᩳܽۧ;->ۙ:Ll/᩸۠֫;

    .line 206
    iput-object p4, p0, Ll/ᩳܽۧ;->۫:Ll/ۙۛ֫;

    .line 207
    iput-object p5, p0, Ll/ᩳܽۧ;->۬:Ll/ܶۛ֫;

    .line 208
    iput-object p6, p0, Ll/ᩳܽۧ;->᩻֫:Ll/ۧܳۧ;

    .line 209
    iput-object p7, p0, Ll/ᩳܽۧ;->ۡ֫:Ll/۠ۧۧ;

    .line 210
    iput-object p8, p0, Ll/ᩳܽۧ;->ܿ֫:Ll/᩻ܽۧ;

    .line 211
    iput-object p9, p0, Ll/ᩳܽۧ;->᩸:Ll/᩸ܿۧ;

    int-to-long p1, p10

    .line 213
    iput-wide p1, p0, Ll/ᩳܽۧ;->᩶:J

    .line 215
    iput-object p11, p0, Ll/ᩳܽۧ;->ۗ֫:Ll/۠ᩴ֫;

    if-eqz p14, :cond_0

    .line 218
    new-instance p1, Ll/ۡܳۧ;

    invoke-direct {p1, p14}, Ll/ۡܳۧ;-><init>(Ll/۠ܳۧ;)V

    goto :goto_0

    .line 219
    :cond_0
    new-instance p1, Ll/ۡܳۧ;

    const-string p2, "ProgressiveMediaPeriod"

    invoke-direct {p1, p2}, Ll/ۡܳۧ;-><init>(Ljava/lang/String;)V

    :goto_0
    iput-object p1, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    .line 220
    iput-object p3, p0, Ll/ᩳܽۧ;->ۚ֫:Ll/ܺ֫ۧ;

    .line 221
    iput-wide p12, p0, Ll/ᩳܽۧ;->ۙ֫:J

    .line 222
    new-instance p1, Ll/ܳۚ֫;

    invoke-direct {p1}, Ll/ܳۚ֫;-><init>()V

    iput-object p1, p0, Ll/ᩳܽۧ;->ܳ֫:Ll/ܳۚ֫;

    .line 223
    new-instance p1, Ll/ۤۧۧ;

    invoke-direct {p1, p0}, Ll/ۤۧۧ;-><init>(Ll/ᩳܽۧ;)V

    iput-object p1, p0, Ll/ᩳܽۧ;->ۢ֫:Ll/ۤۧۧ;

    .line 224
    new-instance p1, Ll/ۛۧۧ;

    invoke-direct {p1, p0}, Ll/ۛۧۧ;-><init>(Ll/ᩳܽۧ;)V

    iput-object p1, p0, Ll/ᩳܽۧ;->ۖ֫:Ll/ۛۧۧ;

    const/4 p1, 0x0

    .line 715
    invoke-static {p1}, Ll/ۘ֨֫;->֫(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    .line 230
    iput-object p1, p0, Ll/ᩳܽۧ;->᩺:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [Ll/ۧܽۧ;

    .line 231
    iput-object p2, p0, Ll/ᩳܽۧ;->۠֫:[Ll/ۧܽۧ;

    new-array p1, p1, [Ll/ۘܽۧ;

    .line 232
    iput-object p1, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 233
    iput-wide p1, p0, Ll/ᩳܽۧ;->᩵֫:J

    const/4 p1, 0x1

    .line 234
    iput p1, p0, Ll/ᩳܽۧ;->ۗ:I

    return-void
.end method

.method private ֡()V
    .locals 15

    .line 838
    iget-boolean v0, p0, Ll/ᩳܽۧ;->֨֫:Z

    if-nez v0, :cond_c

    iget-boolean v0, p0, Ll/ᩳܽۧ;->֡֫:Z

    if-nez v0, :cond_c

    iget-boolean v0, p0, Ll/ᩳܽۧ;->᩸֫:Z

    if-eqz v0, :cond_c

    iget-object v0, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 841
    :cond_0
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 842
    invoke-virtual {v4}, Ll/ۘܽۧ;->᩻()Ll/۠ᩴ֫;

    move-result-object v4

    if-nez v4, :cond_1

    goto/16 :goto_6

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 846
    :cond_2
    iget-object v0, p0, Ll/ᩳܽۧ;->ܳ֫:Ll/ܳۚ֫;

    invoke-virtual {v0}, Ll/ܳۚ֫;->ܽ()V

    .line 847
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v0, v0

    .line 848
    new-array v1, v0, [Ll/۬᩵֫;

    .line 849
    new-array v3, v0, [Z

    const/4 v4, 0x0

    :goto_1
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 850
    iget-wide v7, p0, Ll/ᩳܽۧ;->ۙ֫:J

    const/4 v9, 0x1

    if-ge v4, v0, :cond_a

    .line 851
    iget-object v10, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object v10, v10, v4

    invoke-virtual {v10}, Ll/ۘܽۧ;->᩻()Ll/۠ᩴ֫;

    move-result-object v10

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    iget-object v11, v10, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 853
    invoke-static {v11}, Ll/ۢ᩵֫;->᩻(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 854
    invoke-static {v11}, Ll/ۢ᩵֫;->ۢ(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3

    goto :goto_2

    :cond_3
    const/4 v13, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v13, 0x1

    .line 855
    :goto_3
    aput-boolean v13, v3, v4

    .line 856
    iget-boolean v14, p0, Ll/ᩳܽۧ;->ܰ:Z

    or-int/2addr v13, v14

    iput-boolean v13, p0, Ll/ᩳܽۧ;->ܰ:Z

    .line 857
    invoke-static {v11}, Ll/ۢ᩵֫;->ۜ(Ljava/lang/String;)Z

    move-result v11

    cmp-long v13, v7, v5

    if-eqz v13, :cond_5

    if-ne v0, v9, :cond_5

    if-eqz v11, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    .line 858
    :goto_4
    iput-boolean v5, p0, Ll/ᩳܽۧ;->ܽ֫:Z

    .line 859
    iget-object v5, p0, Ll/ᩳܽۧ;->۟:Ll/ۤۡۧ;

    if-eqz v5, :cond_9

    .line 860
    iget v6, v5, Ll/ۤۡۧ;->֫:I

    if-nez v12, :cond_6

    .line 861
    iget-object v7, p0, Ll/ᩳܽۧ;->۠֫:[Ll/ۧܽۧ;

    aget-object v7, v7, v4

    iget-boolean v7, v7, Ll/ۧܽۧ;->ۧ:Z

    if-eqz v7, :cond_8

    .line 862
    :cond_6
    iget-object v7, v10, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    if-nez v7, :cond_7

    .line 864
    new-instance v7, Ll/᩻᩵֫;

    new-array v8, v9, [Ll/ܳ᩵֫;

    aput-object v5, v8, v2

    invoke-direct {v7, v8}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    goto :goto_5

    :cond_7
    new-array v8, v9, [Ll/ܳ᩵֫;

    aput-object v5, v8, v2

    .line 866
    invoke-virtual {v7, v8}, Ll/᩻᩵֫;->֫([Ll/ܳ᩵֫;)Ll/᩻᩵֫;

    move-result-object v7

    .line 868
    :goto_5
    invoke-virtual {v10}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v5

    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v10

    :cond_8
    if-eqz v12, :cond_9

    .line 872
    iget v5, v10, Ll/۠ᩴ֫;->ܽ:I

    const/4 v7, -0x1

    if-ne v5, v7, :cond_9

    iget v5, v10, Ll/۠ᩴ֫;->ۨ:I

    if-ne v5, v7, :cond_9

    if-eq v6, v7, :cond_9

    .line 876
    invoke-virtual {v10}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v5

    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ܽ(I)V

    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v10

    .line 879
    :cond_9
    iget-object v5, p0, Ll/ᩳܽۧ;->۫:Ll/ۙۛ֫;

    invoke-interface {v5, v10}, Ll/ۙۛ֫;->֫(Ll/۠ᩴ֫;)I

    move-result v5

    invoke-virtual {v10, v5}, Ll/۠ᩴ֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v5

    .line 880
    new-instance v6, Ll/۬᩵֫;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    new-array v8, v9, [Ll/۠ᩴ֫;

    aput-object v5, v8, v2

    invoke-direct {v6, v7, v8}, Ll/۬᩵֫;-><init>(Ljava/lang/String;[Ll/۠ᩴ֫;)V

    aput-object v6, v1, v4

    .line 881
    iget-boolean v6, p0, Ll/ᩳܽۧ;->ᩴ֫:Z

    iget-boolean v5, v5, Ll/۠ᩴ֫;->ۚ:Z

    or-int/2addr v5, v6

    iput-boolean v5, p0, Ll/ᩳܽۧ;->ᩴ֫:Z

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 883
    :cond_a
    new-instance v0, Ll/ܽܽۧ;

    new-instance v2, Ll/ۛܽۧ;

    invoke-direct {v2, v1}, Ll/ۛܽۧ;-><init>([Ll/۬᩵֫;)V

    invoke-direct {v0, v2, v3}, Ll/ܽܽۧ;-><init>(Ll/ۛܽۧ;[Z)V

    iput-object v0, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    .line 884
    iget-boolean v0, p0, Ll/ᩳܽۧ;->ܽ֫:Z

    if-eqz v0, :cond_b

    iget-wide v0, p0, Ll/ᩳܽۧ;->ۤ:J

    cmp-long v2, v0, v5

    if-nez v2, :cond_b

    .line 885
    iput-wide v7, p0, Ll/ᩳܽۧ;->ۤ:J

    .line 886
    new-instance v0, Ll/ܰۧۧ;

    iget-object v1, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    invoke-direct {v0, p0, v1}, Ll/ܰۧۧ;-><init>(Ll/ᩳܽۧ;Ll/ۢۢۧ;)V

    iput-object v0, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    .line 894
    :cond_b
    iget-wide v0, p0, Ll/ᩳܽۧ;->ۤ:J

    iget-object v2, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    iget-boolean v3, p0, Ll/ᩳܽۧ;->ۧ֫:Z

    iget-object v4, p0, Ll/ᩳܽۧ;->ܿ֫:Ll/᩻ܽۧ;

    invoke-virtual {v4, v0, v1, v2, v3}, Ll/᩻ܽۧ;->֫(JLl/ۢۢۧ;Z)V

    .line 895
    iput-boolean v9, p0, Ll/ᩳܽۧ;->֡֫:Z

    .line 896
    iget-object v0, p0, Ll/ᩳܽۧ;->᩹:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    invoke-interface {v0, p0}, Ll/᩷ۧۧ;->֫(Ll/ۢۧۧ;)V

    :cond_c
    :goto_6
    return-void
.end method

.method private ֨()Z
    .locals 1

    .line 604
    iget-boolean v0, p0, Ll/ᩳܽۧ;->ܺ֫:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/ᩳܽۧ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private ֫(Z)J
    .locals 5

    const-wide/high16 v0, -0x8000000000000000L

    const/4 v2, 0x0

    .line 1008
    :goto_0
    iget-object v3, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v3, v3

    if-ge v2, v3, :cond_2

    if-nez p1, :cond_0

    .line 1009
    iget-object v3, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    iget-object v3, v3, Ll/ܽܽۧ;->֫:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_1

    .line 1010
    :cond_0
    iget-object v3, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object v3, v3, v2

    .line 1011
    invoke-virtual {v3}, Ll/ۘܽۧ;->ᩳ()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method private ֫(Ll/ۧܽۧ;)Ll/᩵ۢۧ;
    .locals 5

    .line 802
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 804
    iget-object v2, p0, Ll/ᩳܽۧ;->۠֫:[Ll/ۧܽۧ;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Ll/ۧܽۧ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 805
    iget-object p1, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object p1, p1, v1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 808
    :cond_1
    iget-boolean v1, p0, Ll/ᩳܽۧ;->᩸֫:Z

    if-eqz v1, :cond_2

    .line 809
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Extractor added new track (id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p1, p1, Ll/ۧܽۧ;->֫:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") after finishing tracks."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 810
    new-instance p1, Ll/᩵᩷ۧ;

    invoke-direct {p1}, Ll/᩵᩷ۧ;-><init>()V

    return-object p1

    .line 138
    :cond_2
    new-instance v1, Ll/ۘܽۧ;

    .line 155
    iget-object v2, p0, Ll/ᩳܽۧ;->۫:Ll/ۙۛ֫;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    iget-object v3, p0, Ll/ᩳܽۧ;->᩸:Ll/᩸ܿۧ;

    iget-object v4, p0, Ll/ᩳܽۧ;->۬:Ll/ܶۛ֫;

    invoke-direct {v1, v3, v2, v4}, Ll/ۘܽۧ;-><init>(Ll/᩸ܿۧ;Ll/ۙۛ֫;Ll/ܶۛ֫;)V

    .line 814
    invoke-virtual {v1, p0}, Ll/ۘܽۧ;->֫(Ll/ۖܽۧ;)V

    .line 816
    iget-object v2, p0, Ll/ᩳܽۧ;->۠֫:[Ll/ۧܽۧ;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ۧܽۧ;

    .line 817
    aput-object p1, v2, v0

    .line 818
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iput-object v2, p0, Ll/ᩳܽۧ;->۠֫:[Ll/ۧܽۧ;

    .line 819
    iget-object p1, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۘܽۧ;

    .line 820
    aput-object v1, p1, v0

    .line 821
    iput-object p1, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    return-object v1
.end method

.method public static ֫(Ll/ᩳܽۧ;)V
    .locals 1

    .line 226
    iget-boolean v0, p0, Ll/ᩳܽۧ;->֨֫:Z

    if-nez v0, :cond_0

    .line 227
    iget-object v0, p0, Ll/ᩳܽۧ;->᩹:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    invoke-interface {v0, p0}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ᩳܽۧ;Ll/ۢۢۧ;)V
    .locals 0

    .line 779
    invoke-direct {p0, p1}, Ll/ᩳܽۧ;->ۧ(Ll/ۢۢۧ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳܽۧ;Ll/ۤۡۧ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩳܽۧ;->۟:Ll/ۤۡۧ;

    return-void
.end method

.method public static bridge synthetic ۖ()Ljava/util/Map;
    .locals 1

    .line 0
    sget-object v0, Ll/ᩳܽۧ;->ۨ֫:Ljava/util/Map;

    return-object v0
.end method

.method private ۘ()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackState",
            "seekMap"
        }
    .end annotation

    .line 1023
    iget-boolean v0, p0, Ll/ᩳܽۧ;->֡֫:Z

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1024
    iget-object v0, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    iget-object v0, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private ۚ()V
    .locals 10

    .line 900
    new-instance v7, Ll/۟ۧۧ;

    iget-object v4, p0, Ll/ᩳܽۧ;->ۚ֫:Ll/ܺ֫ۧ;

    iget-object v6, p0, Ll/ᩳܽۧ;->ܳ֫:Ll/ܳۚ֫;

    iget-object v2, p0, Ll/ᩳܽۧ;->۫֫:Landroid/net/Uri;

    iget-object v3, p0, Ll/ᩳܽۧ;->ۙ:Ll/᩸۠֫;

    move-object v0, v7

    move-object v1, p0

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Ll/۟ۧۧ;-><init>(Ll/ᩳܽۧ;Landroid/net/Uri;Ll/᩸۠֫;Ll/ܺ֫ۧ;Ll/᩸᩷ۧ;Ll/ܳۚ֫;)V

    .line 903
    iget-boolean v0, p0, Ll/ᩳܽۧ;->֡֫:Z

    if-eqz v0, :cond_2

    .line 904
    invoke-direct {p0}, Ll/ᩳܽۧ;->᩵()Z

    move-result v0

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 905
    iget-wide v0, p0, Ll/ᩳܽۧ;->ۤ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v4, p0, Ll/ᩳܽۧ;->᩵֫:J

    cmp-long v6, v4, v0

    if-lez v6, :cond_0

    const/4 v0, 0x1

    .line 906
    iput-boolean v0, p0, Ll/ᩳܽۧ;->᩷֫:Z

    .line 907
    iput-wide v2, p0, Ll/ᩳܽۧ;->᩵֫:J

    return-void

    .line 910
    :cond_0
    iget-object v0, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    iget-wide v4, p0, Ll/ᩳܽۧ;->᩵֫:J

    invoke-interface {v0, v4, v5}, Ll/ۢۢۧ;->֫(J)Ll/ۜۢۧ;

    move-result-object v0

    iget-object v0, v0, Ll/ۜۢۧ;->֫:Ll/ۡۢۧ;

    iget-wide v0, v0, Ll/ۡۢۧ;->֫:J

    iget-wide v4, p0, Ll/ᩳܽۧ;->᩵֫:J

    .line 910
    invoke-static {v7, v0, v1, v4, v5}, Ll/۟ۧۧ;->֫(Ll/۟ۧۧ;JJ)V

    .line 913
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v1, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v5, v0, v4

    .line 914
    iget-wide v8, p0, Ll/ᩳܽۧ;->᩵֫:J

    invoke-virtual {v5, v8, v9}, Ll/ۘܽۧ;->ܽ(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 916
    :cond_1
    iput-wide v2, p0, Ll/ᩳܽۧ;->᩵֫:J

    .line 918
    :cond_2
    invoke-direct {p0}, Ll/ᩳܽۧ;->ᩴ()I

    move-result v0

    iput v0, p0, Ll/ᩳܽۧ;->ۨ:I

    .line 919
    iget-object v0, p0, Ll/ᩳܽۧ;->᩻֫:Ll/ۧܳۧ;

    iget v1, p0, Ll/ᩳܽۧ;->ۗ:I

    .line 920
    invoke-interface {v0, v1}, Ll/ۧܳۧ;->֫(I)I

    move-result v0

    .line 919
    iget-object v1, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    invoke-virtual {v1, v7, p0, v0}, Ll/ۡܳۧ;->֫(Ll/᩻ܳۧ;Ll/ᩳܳۧ;I)V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ᩳܽۧ;)Ll/ۛۧۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳܽۧ;->ۖ֫:Ll/ۛۧۧ;

    return-object p0
.end method

.method public static ۢ(Ll/ᩳܽۧ;)V
    .locals 2

    .line 798
    iget-object v0, p0, Ll/ᩳܽۧ;->᩺:Landroid/os/Handler;

    new-instance v1, Ll/᩺ۧۧ;

    invoke-direct {v1, p0}, Ll/᩺ۧۧ;-><init>(Ll/ᩳܽۧ;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private ۧ(Ll/ۢۢۧ;)V
    .locals 6

    .line 826
    iget-object v0, p0, Ll/ᩳܽۧ;->۟:Ll/ۤۡۧ;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ll/᩷ۢۧ;

    invoke-direct {v0, v1, v2}, Ll/᩷ۢۧ;-><init>(J)V

    :goto_0
    iput-object v0, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    .line 827
    invoke-interface {p1}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v3

    iput-wide v3, p0, Ll/ᩳܽۧ;->ۤ:J

    .line 828
    iget-boolean v0, p0, Ll/ᩳܽۧ;->֫֫:Z

    const/4 v3, 0x1

    if-nez v0, :cond_1

    invoke-interface {p1}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v4

    cmp-long v0, v4, v1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Ll/ᩳܽۧ;->ۧ֫:Z

    if-eqz v0, :cond_2

    const/4 v3, 0x7

    .line 829
    :cond_2
    iput v3, p0, Ll/ᩳܽۧ;->ۗ:I

    .line 830
    iget-boolean v1, p0, Ll/ᩳܽۧ;->֡֫:Z

    if-eqz v1, :cond_3

    .line 831
    iget-object v1, p0, Ll/ᩳܽۧ;->ܿ֫:Ll/᩻ܽۧ;

    iget-wide v2, p0, Ll/ᩳܽۧ;->ۤ:J

    invoke-virtual {v1, v2, v3, p1, v0}, Ll/᩻ܽۧ;->֫(JLl/ۢۢۧ;Z)V

    return-void

    .line 833
    :cond_3
    invoke-direct {p0}, Ll/ᩳܽۧ;->֡()V

    return-void
.end method

.method public static synthetic ۧ(Ll/ᩳܽۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩳܽۧ;->֡()V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ᩳܽۧ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳܽۧ;->᩺:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic ܺ()Ll/۠ᩴ֫;
    .locals 1

    .line 0
    sget-object v0, Ll/ᩳܽۧ;->ۛ֫:Ll/۠ᩴ֫;

    return-object v0
.end method

.method private ܽ(I)V
    .locals 13

    .line 571
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۘ()V

    .line 572
    iget-object v0, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    iget-object v1, v0, Ll/ܽܽۧ;->ܽ:[Z

    .line 573
    aget-boolean v2, v1, p1

    if-nez v2, :cond_0

    .line 574
    iget-object v0, v0, Ll/ܽܽۧ;->ᩳ:Ll/ۛܽۧ;

    invoke-virtual {v0, p1}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v6

    .line 575
    iget-object v0, v6, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 576
    invoke-static {v0}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v5

    iget-wide v2, p0, Ll/ᩳܽۧ;->ᩳ֫:J

    .line 494
    new-instance v0, Ll/ۜۧۧ;

    .line 501
    invoke-static {v2, v3}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v9

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v12}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 507
    new-instance v2, Ll/۬֡ۢ;

    iget-object v3, p0, Ll/ᩳܽۧ;->ۡ֫:Ll/۠ۧۧ;

    invoke-direct {v2, v3, v0}, Ll/۬֡ۢ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v2}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    const/4 v0, 0x1

    .line 581
    aput-boolean v0, v1, p1

    :cond_0
    return-void
.end method

.method public static synthetic ܽ(Ll/ᩳܽۧ;)V
    .locals 1

    const/4 v0, 0x1

    .line 798
    iput-boolean v0, p0, Ll/ᩳܽۧ;->֫֫:Z

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ᩳܽۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩳܽۧ;->ۤ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩳܽۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩳܽۧ;->᩶:J

    return-wide v0
.end method

.method private ᩳ(I)V
    .locals 4

    .line 586
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۘ()V

    .line 587
    iget-boolean v0, p0, Ll/ᩳܽۧ;->ۘ֫:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ll/ᩳܽۧ;->ܰ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    iget-object v0, v0, Ll/ܽܽۧ;->ۧ:[Z

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    .line 589
    invoke-virtual {p1, v0}, Ll/ۘܽۧ;->֫(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 v1, 0x0

    .line 592
    iput-wide v1, p0, Ll/ᩳܽۧ;->᩵֫:J

    .line 593
    iput-boolean v0, p0, Ll/ᩳܽۧ;->ۘ֫:Z

    const/4 p1, 0x1

    .line 594
    iput-boolean p1, p0, Ll/ᩳܽۧ;->ܺ֫:Z

    .line 595
    iput-wide v1, p0, Ll/ᩳܽۧ;->ᩳ֫:J

    .line 596
    iput v0, p0, Ll/ᩳܽۧ;->ۨ:I

    .line 597
    iget-object p1, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 198
    invoke-virtual {v3, v0}, Ll/ۘܽۧ;->ۧ(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 600
    :cond_2
    iget-object p1, p0, Ll/ᩳܽۧ;->᩹:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    invoke-interface {p1, p0}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private ᩴ()I
    .locals 5

    .line 1000
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    .line 1001
    invoke-virtual {v4}, Ll/ۘܽۧ;->ۜ()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method private ᩵()Z
    .locals 5

    .line 1018
    iget-wide v0, p0, Ll/ᩳܽۧ;->᩵֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ᩷(Ll/ᩳܽۧ;)J
    .locals 2

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, v0}, Ll/ᩳܽۧ;->֫(Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public static bridge synthetic ᩻(Ll/ᩳܽۧ;)Ll/ۤۡۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳܽۧ;->۟:Ll/ۤۡۧ;

    return-object p0
.end method


# virtual methods
.method public final ֫(IJ)I
    .locals 2

    .line 557
    invoke-direct {p0}, Ll/ᩳܽۧ;->֨()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 560
    :cond_0
    invoke-direct {p0, p1}, Ll/ᩳܽۧ;->ܽ(I)V

    .line 561
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object v0, v0, p1

    .line 562
    iget-boolean v1, p0, Ll/ᩳܽۧ;->᩷֫:Z

    invoke-virtual {v0, p2, p3, v1}, Ll/ۘܽۧ;->֫(JZ)I

    move-result p2

    .line 563
    invoke-virtual {v0, p2}, Ll/ۘܽۧ;->ܽ(I)V

    if-nez p2, :cond_1

    .line 565
    invoke-direct {p0, p1}, Ll/ᩳܽۧ;->ᩳ(I)V

    :cond_1
    return p2
.end method

.method public final ֫(ILl/ۗۙ֫;Ll/᩸᩸֫;I)I
    .locals 3

    .line 544
    invoke-direct {p0}, Ll/ᩳܽۧ;->֨()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    .line 547
    :cond_0
    invoke-direct {p0, p1}, Ll/ᩳܽۧ;->ܽ(I)V

    .line 548
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Ll/ᩳܽۧ;->᩷֫:Z

    .line 549
    invoke-virtual {v0, p2, p3, p4, v2}, Ll/ۘܽۧ;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;IZ)I

    move-result p2

    if-ne p2, v1, :cond_1

    .line 551
    invoke-direct {p0, p1}, Ll/ᩳܽۧ;->ᩳ(I)V

    :cond_1
    return p2
.end method

.method public final ֫(J)J
    .locals 9

    .line 470
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۘ()V

    .line 471
    iget-object v0, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    iget-object v0, v0, Ll/ܽܽۧ;->ۧ:[Z

    .line 473
    iget-object v1, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    invoke-interface {v1}, Ll/ۢۢۧ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    .line 475
    iput-boolean v1, p0, Ll/ᩳܽۧ;->ܺ֫:Z

    .line 476
    iget-wide v2, p0, Ll/ᩳܽۧ;->ᩳ֫:J

    const/4 v4, 0x1

    cmp-long v5, v2, p1

    if-nez v5, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 477
    :goto_1
    iput-wide p1, p0, Ll/ᩳܽۧ;->ᩳ֫:J

    .line 478
    invoke-direct {p0}, Ll/ᩳܽۧ;->᩵()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 480
    iput-wide p1, p0, Ll/ᩳܽۧ;->᩵֫:J

    return-wide p1

    .line 486
    :cond_2
    iget v3, p0, Ll/ᩳܽۧ;->ۗ:I

    const/4 v5, 0x7

    iget-object v6, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    if-eq v3, v5, :cond_9

    iget-boolean v3, p0, Ll/ᩳܽۧ;->᩷֫:Z

    if-nez v3, :cond_3

    .line 487
    invoke-virtual {v6}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 977
    :cond_3
    iget-object v3, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v3, v3

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v3, :cond_8

    .line 979
    iget-object v7, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object v7, v7, v5

    .line 980
    invoke-virtual {v7}, Ll/ۘܽۧ;->ܳ()I

    move-result v8

    if-nez v8, :cond_4

    if-eqz v2, :cond_4

    goto :goto_4

    .line 984
    :cond_4
    iget-boolean v8, p0, Ll/ᩳܽۧ;->ܽ֫:Z

    if-eqz v8, :cond_5

    .line 985
    invoke-virtual {v7}, Ll/ۘܽۧ;->ܽ()I

    move-result v8

    invoke-virtual {v7, v8}, Ll/ۘܽۧ;->ۧ(I)Z

    move-result v7

    goto :goto_3

    .line 986
    :cond_5
    iget-boolean v8, p0, Ll/ᩳܽۧ;->᩷֫:Z

    invoke-virtual {v7, p1, p2, v8}, Ll/ۘܽۧ;->ۧ(JZ)Z

    move-result v7

    :goto_3
    if-nez v7, :cond_7

    .line 991
    aget-boolean v7, v0, v5

    if-nez v7, :cond_6

    iget-boolean v7, p0, Ll/ᩳܽۧ;->ܰ:Z

    if-nez v7, :cond_7

    :cond_6
    const/4 v4, 0x0

    goto :goto_5

    :cond_7
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_8
    :goto_5
    if-eqz v4, :cond_9

    goto :goto_8

    .line 493
    :cond_9
    iput-boolean v1, p0, Ll/ᩳܽۧ;->ۘ֫:Z

    .line 494
    iput-wide p1, p0, Ll/ᩳܽۧ;->᩵֫:J

    .line 495
    iput-boolean v1, p0, Ll/ᩳܽۧ;->᩷֫:Z

    .line 496
    iput-boolean v1, p0, Ll/ᩳܽۧ;->ᩴ֫:Z

    .line 497
    invoke-virtual {v6}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 499
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v2, v0

    :goto_6
    if-ge v1, v2, :cond_a

    aget-object v3, v0, v1

    .line 500
    invoke-virtual {v3}, Ll/ۘܽۧ;->֫()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 502
    :cond_a
    invoke-virtual {v6}, Ll/ۡܳۧ;->֫()V

    return-wide p1

    .line 504
    :cond_b
    invoke-virtual {v6}, Ll/ۡܳۧ;->ۧ()V

    .line 505
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_7
    if-ge v3, v2, :cond_c

    aget-object v4, v0, v3

    .line 198
    invoke-virtual {v4, v1}, Ll/ۘܽۧ;->ۧ(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_c
    :goto_8
    return-wide p1
.end method

.method public final ֫(JLl/ۢ۬֫;)J
    .locals 9

    .line 514
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۘ()V

    .line 515
    iget-object v0, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    invoke-interface {v0}, Ll/ۢۢۧ;->ܿ()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    .line 519
    :cond_0
    iget-object v0, p0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    invoke-interface {v0, p1, p2}, Ll/ۢۢۧ;->֫(J)Ll/ۜۢۧ;

    move-result-object v0

    .line 520
    iget-object v1, v0, Ll/ۜۢۧ;->֫:Ll/ۡۢۧ;

    iget-wide v5, v1, Ll/ۡۢۧ;->ۧ:J

    iget-object v0, v0, Ll/ۜۢۧ;->ۧ:Ll/ۡۢۧ;

    iget-wide v7, v0, Ll/ۡۢۧ;->ۧ:J

    move-object v2, p3

    move-wide v3, p1

    invoke-virtual/range {v2 .. v8}, Ll/ۢ۬֫;->֫(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J
    .locals 8

    .line 303
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۘ()V

    .line 304
    iget-object v0, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    iget-object v1, v0, Ll/ܽܽۧ;->ᩳ:Ll/ۛܽۧ;

    .line 305
    iget-object v0, v0, Ll/ܽܽۧ;->֫:[Z

    .line 306
    iget v2, p0, Ll/ᩳܽۧ;->ۛ:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 308
    :goto_0
    array-length v5, p1

    const/4 v6, 0x1

    if-ge v4, v5, :cond_2

    .line 309
    aget-object v5, p3, v4

    if-eqz v5, :cond_1

    aget-object v7, p1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    .line 310
    :cond_0
    check-cast v5, Ll/֫ܽۧ;

    invoke-static {v5}, Ll/֫ܽۧ;->֫(Ll/֫ܽۧ;)I

    move-result v5

    .line 311
    aget-boolean v7, v0, v5

    invoke-static {v7}, Ll/᩺֡֫;->ۧ(Z)V

    .line 312
    iget v7, p0, Ll/ᩳܽۧ;->ۛ:I

    sub-int/2addr v7, v6

    iput v7, p0, Ll/ᩳܽۧ;->ۛ:I

    .line 313
    aput-boolean v3, v0, v5

    const/4 v5, 0x0

    .line 314
    aput-object v5, p3, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 321
    :cond_2
    iget-boolean p2, p0, Ll/ᩳܽۧ;->᩶֫:Z

    if-eqz p2, :cond_3

    if-nez v2, :cond_4

    goto :goto_1

    :cond_3
    const-wide/16 v4, 0x0

    cmp-long p2, p5, v4

    if-eqz p2, :cond_4

    iget-boolean p2, p0, Ll/ᩳܽۧ;->ܽ֫:Z

    if-nez p2, :cond_4

    :goto_1
    const/4 p2, 0x1

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    :goto_2
    const/4 v2, 0x0

    .line 323
    :goto_3
    array-length v4, p1

    if-ge v2, v4, :cond_9

    .line 324
    aget-object v4, p3, v2

    if-nez v4, :cond_8

    aget-object v4, p1, v2

    if-eqz v4, :cond_8

    .line 326
    invoke-interface {v4}, Ll/ᩴܿۧ;->length()I

    move-result v5

    if-ne v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    invoke-static {v5}, Ll/᩺֡֫;->ۧ(Z)V

    .line 327
    invoke-interface {v4, v3}, Ll/ᩴܿۧ;->ۧ(I)I

    move-result v5

    if-nez v5, :cond_6

    const/4 v5, 0x1

    goto :goto_5

    :cond_6
    const/4 v5, 0x0

    :goto_5
    invoke-static {v5}, Ll/᩺֡֫;->ۧ(Z)V

    .line 328
    invoke-interface {v4}, Ll/ᩴܿۧ;->ܿ()Ll/۬᩵֫;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/ۛܽۧ;->֫(Ll/۬᩵֫;)I

    move-result v5

    .line 329
    aget-boolean v7, v0, v5

    xor-int/2addr v7, v6

    invoke-static {v7}, Ll/᩺֡֫;->ۧ(Z)V

    .line 330
    iget v7, p0, Ll/ᩳܽۧ;->ۛ:I

    add-int/2addr v7, v6

    iput v7, p0, Ll/ᩳܽۧ;->ۛ:I

    .line 331
    aput-boolean v6, v0, v5

    .line 332
    iget-boolean v7, p0, Ll/ᩳܽۧ;->ᩴ֫:Z

    invoke-interface {v4}, Ll/ۢܿۧ;->ۜ()Ll/۠ᩴ֫;

    move-result-object v4

    iget-boolean v4, v4, Ll/۠ᩴ֫;->ۚ:Z

    or-int/2addr v4, v7

    iput-boolean v4, p0, Ll/ᩳܽۧ;->ᩴ֫:Z

    .line 333
    new-instance v4, Ll/֫ܽۧ;

    invoke-direct {v4, p0, v5}, Ll/֫ܽۧ;-><init>(Ll/ᩳܽۧ;I)V

    aput-object v4, p3, v2

    .line 334
    aput-boolean v6, p4, v2

    if-nez p2, :cond_8

    .line 337
    iget-object p2, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object p2, p2, v5

    .line 342
    invoke-virtual {p2}, Ll/ۘܽۧ;->ܳ()I

    move-result v4

    if-eqz v4, :cond_7

    .line 343
    invoke-virtual {p2, p5, p6, v6}, Ll/ۘܽۧ;->ۧ(JZ)Z

    move-result p2

    if-nez p2, :cond_7

    const/4 p2, 0x1

    goto :goto_6

    :cond_7
    const/4 p2, 0x0

    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 347
    :cond_9
    iget p1, p0, Ll/ᩳܽۧ;->ۛ:I

    if-nez p1, :cond_c

    .line 348
    iput-boolean v3, p0, Ll/ᩳܽۧ;->ۘ֫:Z

    .line 349
    iput-boolean v3, p0, Ll/ᩳܽۧ;->ܺ֫:Z

    .line 350
    iput-boolean v3, p0, Ll/ᩳܽۧ;->ᩴ֫:Z

    .line 351
    iget-object p1, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    invoke-virtual {p1}, Ll/ۡܳۧ;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_b

    .line 353
    iget-object p2, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length p3, p2

    :goto_7
    if-ge v3, p3, :cond_a

    aget-object p4, p2, v3

    .line 354
    invoke-virtual {p4}, Ll/ۘܽۧ;->֫()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 356
    :cond_a
    invoke-virtual {p1}, Ll/ۡܳۧ;->֫()V

    goto :goto_a

    .line 358
    :cond_b
    iput-boolean v3, p0, Ll/ᩳܽۧ;->᩷֫:Z

    .line 359
    iget-object p1, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length p2, p1

    const/4 p3, 0x0

    :goto_8
    if-ge p3, p2, :cond_e

    aget-object p4, p1, p3

    .line 198
    invoke-virtual {p4, v3}, Ll/ۘܽۧ;->ۧ(Z)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_8

    :cond_c
    if-eqz p2, :cond_e

    .line 364
    invoke-virtual {p0, p5, p6}, Ll/ᩳܽۧ;->֫(J)J

    move-result-wide p5

    .line 366
    :goto_9
    array-length p1, p3

    if-ge v3, p1, :cond_e

    .line 367
    aget-object p1, p3, v3

    if-eqz p1, :cond_d

    .line 368
    aput-boolean v6, p4, v3

    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    .line 372
    :cond_e
    :goto_a
    iput-boolean v6, p0, Ll/ᩳܽۧ;->᩶֫:Z

    return-wide p5
.end method

.method public final ֫(Ll/᩻ܳۧ;JJLjava/io/IOException;I)Ll/ܿܳۧ;
    .locals 17

    move-object/from16 v0, p0

    .line 79
    move-object/from16 v1, p1

    check-cast v1, Ll/۟ۧۧ;

    .line 712
    invoke-static {v1}, Ll/۟ۧۧ;->֫(Ll/۟ۧۧ;)Ll/ᩴܶ֫;

    move-result-object v2

    .line 713
    new-instance v4, Ll/ۧۧۧ;

    invoke-static {v1}, Ll/۟ۧۧ;->ܽ(Ll/۟ۧۧ;)J

    invoke-static {v1}, Ll/۟ۧۧ;->ۧ(Ll/۟ۧۧ;)Ll/ۗ۠֫;

    .line 717
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    invoke-virtual {v2}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v2

    move-wide/from16 v5, p4

    .line 721
    invoke-direct {v4, v5, v6, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 722
    invoke-static {v1}, Ll/۟ۧۧ;->ᩳ(Ll/۟ۧۧ;)J

    move-result-wide v2

    .line 729
    invoke-static {v2, v3}, Ll/ۘ֨֫;->ۧ(J)J

    iget-wide v2, v0, Ll/ᩳܽۧ;->ۤ:J

    .line 730
    invoke-static {v2, v3}, Ll/ۘ֨֫;->ۧ(J)J

    .line 732
    new-instance v2, Ll/֫ܳۧ;

    move-object/from16 v14, p6

    move/from16 v3, p7

    invoke-direct {v2, v14, v3}, Ll/֫ܳۧ;-><init>(Ljava/io/IOException;I)V

    .line 733
    iget-object v3, v0, Ll/ᩳܽۧ;->᩻֫:Ll/ۧܳۧ;

    invoke-interface {v3, v2}, Ll/ۧܳۧ;->֫(Ll/֫ܳۧ;)J

    move-result-wide v2

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v7, v2, v5

    if-nez v7, :cond_0

    .line 736
    sget-object v2, Ll/ۡܳۧ;->ܿ:Ll/ܿܳۧ;

    goto :goto_4

    .line 738
    :cond_0
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۧ;->ᩴ()I

    move-result v7

    .line 739
    iget v8, v0, Ll/ᩳܽۧ;->ۨ:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-le v7, v8, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    .line 933
    :goto_0
    iget-boolean v11, v0, Ll/ᩳܽۧ;->֫֫:Z

    if-nez v11, :cond_5

    iget-object v11, v0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    if-eqz v11, :cond_2

    invoke-interface {v11}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v11

    cmp-long v13, v11, v5

    if-eqz v13, :cond_2

    goto :goto_2

    .line 938
    :cond_2
    iget-boolean v5, v0, Ll/ᩳܽۧ;->֡֫:Z

    if-eqz v5, :cond_3

    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۧ;->֨()Z

    move-result v5

    if-nez v5, :cond_3

    .line 948
    iput-boolean v10, v0, Ll/ᩳܽۧ;->ۘ֫:Z

    .line 743
    sget-object v2, Ll/ۡܳۧ;->ᩳ:Ll/ܿܳۧ;

    goto :goto_4

    .line 955
    :cond_3
    iget-boolean v5, v0, Ll/ᩳܽۧ;->֡֫:Z

    iput-boolean v5, v0, Ll/ᩳܽۧ;->ܺ֫:Z

    const-wide/16 v5, 0x0

    .line 956
    iput-wide v5, v0, Ll/ᩳܽۧ;->ᩳ֫:J

    .line 957
    iput v9, v0, Ll/ᩳܽۧ;->ۨ:I

    .line 958
    iget-object v7, v0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v10, v7

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_4

    aget-object v12, v7, v11

    .line 198
    invoke-virtual {v12, v9}, Ll/ۘܽۧ;->ۧ(Z)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 961
    :cond_4
    invoke-static {v1, v5, v6, v5, v6}, Ll/۟ۧۧ;->֫(Ll/۟ۧۧ;JJ)V

    goto :goto_3

    .line 936
    :cond_5
    :goto_2
    iput v7, v0, Ll/ᩳܽۧ;->ۨ:I

    .line 742
    :goto_3
    invoke-static {v2, v3, v8}, Ll/ۡܳۧ;->֫(JZ)Ll/ܿܳۧ;

    move-result-object v2

    .line 746
    :goto_4
    invoke-virtual {v2}, Ll/ܿܳۧ;->֫()Z

    move-result v16

    xor-int/lit8 v15, v16, 0x1

    .line 747
    invoke-static {v1}, Ll/۟ۧۧ;->ᩳ(Ll/۟ۧۧ;)J

    move-result-wide v10

    iget-wide v12, v0, Ll/ᩳܽۧ;->ۤ:J

    iget-object v3, v0, Ll/ᩳܽۧ;->ۡ֫:Ll/۠ۧۧ;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v14, p6

    invoke-virtual/range {v3 .. v15}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-nez v16, :cond_6

    .line 759
    invoke-static {v1}, Ll/۟ۧۧ;->ܽ(Ll/۟ۧۧ;)J

    :cond_6
    return-object v2
.end method

.method public final ֫(II)Ll/᩵ۢۧ;
    .locals 1

    .line 768
    new-instance p2, Ll/ۧܽۧ;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Ll/ۧܽۧ;-><init>(IZ)V

    invoke-direct {p0, p2}, Ll/ᩳܽۧ;->֫(Ll/ۧܽۧ;)Ll/᩵ۢۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(JZ)V
    .locals 5

    .line 378
    iget-boolean v0, p0, Ll/ᩳܽۧ;->ܽ֫:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 382
    :cond_0
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۘ()V

    .line 383
    invoke-direct {p0}, Ll/ᩳܽۧ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 386
    :cond_1
    iget-object v0, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    iget-object v0, v0, Ll/ܽܽۧ;->֫:[Z

    .line 387
    iget-object v1, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 389
    iget-object v3, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object v3, v3, v2

    aget-boolean v4, v0, v2

    invoke-virtual {v3, p1, p2, p3, v4}, Ll/ۘܽۧ;->֫(JZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۢۢۧ;)V
    .locals 1

    .line 779
    new-instance v0, Ll/ۨۧۧ;

    invoke-direct {v0, p0, p1}, Ll/ۨۧۧ;-><init>(Ll/ᩳܽۧ;Ll/ۢۢۧ;)V

    iget-object p1, p0, Ll/ᩳܽۧ;->᩺:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ֫(Ll/᩷ۧۧ;J)V
    .locals 5

    .line 261
    iput-object p1, p0, Ll/ᩳܽۧ;->᩹:Ll/᩷ۧۧ;

    .line 262
    iget-object p1, p0, Ll/ᩳܽۧ;->ۗ֫:Ll/۠ᩴ֫;

    if-eqz p1, :cond_0

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 266
    invoke-virtual {p0, v1, v0}, Ll/ᩳܽۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    .line 267
    invoke-interface {v0, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 268
    new-instance p1, Ll/ᩳۢۧ;

    const/4 v0, 0x1

    new-array v2, v0, [J

    const-wide/16 v3, 0x0

    aput-wide v3, v2, v1

    new-array v0, v0, [J

    aput-wide v3, v0, v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p1, v3, v4, v2, v0}, Ll/ᩳۢۧ;-><init>(J[J[J)V

    invoke-direct {p0, p1}, Ll/ᩳܽۧ;->ۧ(Ll/ۢۢۧ;)V

    .line 273
    invoke-virtual {p0}, Ll/ᩳܽۧ;->ܳ()V

    .line 274
    iput-wide p2, p0, Ll/ᩳܽۧ;->᩵֫:J

    return-void

    .line 276
    :cond_0
    iget-object p1, p0, Ll/ᩳܽۧ;->ܳ֫:Ll/ܳۚ֫;

    invoke-virtual {p1}, Ll/ܳۚ֫;->ܿ()Z

    .line 277
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۚ()V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJ)V
    .locals 18

    move-object/from16 v0, p0

    .line 79
    move-object/from16 v1, p1

    check-cast v1, Ll/۟ۧۧ;

    .line 639
    iget-wide v2, v0, Ll/ᩳܽۧ;->ۤ:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x1

    cmp-long v7, v2, v4

    if-nez v7, :cond_1

    iget-object v2, v0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    if-eqz v2, :cond_1

    .line 641
    invoke-direct {v0, v6}, Ll/ᩳܽۧ;->֫(Z)J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v7, v2, v4

    if-nez v7, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x2710

    add-long/2addr v2, v4

    .line 645
    :goto_0
    iput-wide v2, v0, Ll/ᩳܽۧ;->ۤ:J

    .line 646
    iget-object v4, v0, Ll/ᩳܽۧ;->᩹֫:Ll/ۢۢۧ;

    iget-boolean v5, v0, Ll/ᩳܽۧ;->ۧ֫:Z

    iget-object v7, v0, Ll/ᩳܽۧ;->ܿ֫:Ll/᩻ܽۧ;

    invoke-virtual {v7, v2, v3, v4, v5}, Ll/᩻ܽۧ;->֫(JLl/ۢۢۧ;Z)V

    .line 648
    :cond_1
    invoke-static {v1}, Ll/۟ۧۧ;->֫(Ll/۟ۧۧ;)Ll/ᩴܶ֫;

    move-result-object v2

    .line 649
    new-instance v8, Ll/ۧۧۧ;

    invoke-static {v1}, Ll/۟ۧۧ;->ܽ(Ll/۟ۧۧ;)J

    invoke-static {v1}, Ll/۟ۧۧ;->ۧ(Ll/۟ۧۧ;)Ll/ۗ۠֫;

    .line 653
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    invoke-virtual {v2}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v2

    move-wide/from16 v3, p4

    .line 657
    invoke-direct {v8, v3, v4, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 658
    invoke-static {v1}, Ll/۟ۧۧ;->ܽ(Ll/۟ۧۧ;)J

    iget-object v2, v0, Ll/ᩳܽۧ;->᩻֫:Ll/ۧܳۧ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    invoke-static {v1}, Ll/۟ۧۧ;->ᩳ(Ll/۟ۧۧ;)J

    move-result-wide v14

    iget-wide v1, v0, Ll/ᩳܽۧ;->ۤ:J

    iget-object v7, v0, Ll/ᩳܽۧ;->ۡ֫:Ll/۠ۧۧ;

    const/4 v9, 0x1

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide/from16 v16, v1

    invoke-virtual/range {v7 .. v17}, Ll/۠ۧۧ;->ۧ(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 668
    iput-boolean v6, v0, Ll/ᩳܽۧ;->᩷֫:Z

    .line 669
    iget-object v1, v0, Ll/ᩳܽۧ;->᩹:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    invoke-interface {v1, v0}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJI)V
    .locals 15

    move-object v0, p0

    .line 79
    move-object/from16 v1, p1

    check-cast v1, Ll/۟ۧۧ;

    .line 612
    invoke-static {v1}, Ll/۟ۧۧ;->֫(Ll/۟ۧۧ;)Ll/ᩴܶ֫;

    move-result-object v2

    if-nez p6, :cond_0

    .line 615
    new-instance v2, Ll/ۧۧۧ;

    invoke-static {v1}, Ll/۟ۧۧ;->ܽ(Ll/۟ۧۧ;)J

    invoke-static {v1}, Ll/۟ۧۧ;->ۧ(Ll/۟ۧۧ;)Ll/ۗ۠֫;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/ۧۧۧ;-><init>(Ll/ۗ۠֫;)V

    move-object v4, v2

    goto :goto_0

    .line 616
    :cond_0
    new-instance v3, Ll/ۧۧۧ;

    invoke-static {v1}, Ll/۟ۧۧ;->ܽ(Ll/۟ۧۧ;)J

    invoke-static {v1}, Ll/۟ۧۧ;->ۧ(Ll/۟ۧۧ;)Ll/ۗ۠֫;

    .line 619
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    invoke-virtual {v2}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v2

    move-wide/from16 v4, p4

    .line 623
    invoke-direct {v3, v4, v5, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    move-object v4, v3

    .line 624
    :goto_0
    invoke-static {v1}, Ll/۟ۧۧ;->ᩳ(Ll/۟ۧۧ;)J

    move-result-wide v10

    iget-wide v12, v0, Ll/ᩳܽۧ;->ۤ:J

    iget-object v3, v0, Ll/ᩳܽۧ;->ۡ֫:Ll/۠ۧۧ;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v14, p6

    invoke-virtual/range {v3 .. v14}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJI)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJZ)V
    .locals 14

    move-object v0, p0

    .line 79
    move-object v1, p1

    check-cast v1, Ll/۟ۧۧ;

    .line 675
    invoke-static {v1}, Ll/۟ۧۧ;->֫(Ll/۟ۧۧ;)Ll/ᩴܶ֫;

    move-result-object v2

    .line 676
    new-instance v4, Ll/ۧۧۧ;

    invoke-static {v1}, Ll/۟ۧۧ;->ܽ(Ll/۟ۧۧ;)J

    invoke-static {v1}, Ll/۟ۧۧ;->ۧ(Ll/۟ۧۧ;)Ll/ۗ۠֫;

    .line 680
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    invoke-virtual {v2}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v2

    move-wide/from16 v5, p4

    .line 684
    invoke-direct {v4, v5, v6, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 685
    invoke-static {v1}, Ll/۟ۧۧ;->ܽ(Ll/۟ۧۧ;)J

    iget-object v2, v0, Ll/ᩳܽۧ;->᩻֫:Ll/ۧܳۧ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    invoke-static {v1}, Ll/۟ۧۧ;->ᩳ(Ll/۟ۧۧ;)J

    move-result-wide v10

    iget-wide v12, v0, Ll/ᩳܽۧ;->ۤ:J

    iget-object v3, v0, Ll/ᩳܽۧ;->ۡ֫:Ll/۠ۧۧ;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v3 .. v13}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_1

    .line 696
    iget-object v1, v0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    .line 198
    invoke-virtual {v5, v3}, Ll/ۘܽۧ;->ۧ(Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 699
    :cond_0
    iget v1, v0, Ll/ᩳܽۧ;->ۛ:I

    if-lez v1, :cond_1

    .line 700
    iget-object v1, v0, Ll/ᩳܽۧ;->᩹:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    invoke-interface {v1, p0}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    :cond_1
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 416
    iget-object v0, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    invoke-virtual {v0}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩳܽۧ;->ܳ֫:Ll/ܳۚ֫;

    invoke-virtual {v0}, Ll/ܳۚ֫;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 527
    invoke-direct {p0}, Ll/ᩳܽۧ;->֨()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Ll/ᩳܽۧ;->᩷֫:Z

    invoke-virtual {p1, v0}, Ll/ۘܽۧ;->֫(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 1

    .line 400
    iget-boolean p1, p0, Ll/ᩳܽۧ;->᩷֫:Z

    if-nez p1, :cond_3

    .line 401
    iget-object p1, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    invoke-virtual {p1}, Ll/ۡܳۧ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ᩳܽۧ;->ۘ֫:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ᩳܽۧ;->֡֫:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳܽۧ;->ۗ֫:Ll/۠ᩴ֫;

    if-eqz v0, :cond_1

    :cond_0
    iget v0, p0, Ll/ᩳܽۧ;->ۛ:I

    if-nez v0, :cond_1

    goto :goto_0

    .line 406
    :cond_1
    iget-object v0, p0, Ll/ᩳܽۧ;->ܳ֫:Ll/ܳۚ֫;

    invoke-virtual {v0}, Ll/ܳۚ֫;->ܿ()Z

    move-result v0

    .line 407
    invoke-virtual {p1}, Ll/ۡܳۧ;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_2

    .line 408
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۚ()V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()J
    .locals 11

    .line 441
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۘ()V

    .line 442
    iget-boolean v0, p0, Ll/ᩳܽۧ;->᩷֫:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-nez v0, :cond_7

    iget v0, p0, Ll/ᩳܽۧ;->ۛ:I

    if-nez v0, :cond_0

    goto :goto_1

    .line 444
    :cond_0
    invoke-direct {p0}, Ll/ᩳܽۧ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 445
    iget-wide v0, p0, Ll/ᩳܽۧ;->᩵֫:J

    return-wide v0

    .line 448
    :cond_1
    iget-boolean v0, p0, Ll/ᩳܽۧ;->ܰ:Z

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v0, :cond_3

    .line 450
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v0, v0

    const/4 v6, 0x0

    move-wide v7, v4

    :goto_0
    if-ge v6, v0, :cond_4

    .line 452
    iget-object v9, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    iget-object v10, v9, Ll/ܽܽۧ;->ۧ:[Z

    aget-boolean v10, v10, v6

    if-eqz v10, :cond_2

    iget-object v9, v9, Ll/ܽܽۧ;->֫:[Z

    aget-boolean v9, v9, v6

    if-eqz v9, :cond_2

    iget-object v9, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object v9, v9, v6

    .line 454
    invoke-virtual {v9}, Ll/ۘܽۧ;->ۢ()Z

    move-result v9

    if-nez v9, :cond_2

    .line 455
    iget-object v9, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object v9, v9, v6

    .line 456
    invoke-virtual {v9}, Ll/ۘܽۧ;->ᩳ()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-wide v7, v4

    :cond_4
    cmp-long v0, v7, v4

    if-nez v0, :cond_5

    .line 461
    invoke-direct {p0, v3}, Ll/ᩳܽۧ;->֫(Z)J

    move-result-wide v7

    :cond_5
    cmp-long v0, v7, v1

    if-nez v0, :cond_6

    .line 464
    iget-wide v0, p0, Ll/ᩳܽۧ;->ᩳ֫:J

    return-wide v0

    :cond_6
    return-wide v7

    :cond_7
    :goto_1
    return-wide v1
.end method

.method public final ۡ()V
    .locals 4

    .line 238
    iget-boolean v0, p0, Ll/ᩳܽۧ;->֡֫:Z

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 242
    invoke-virtual {v3}, Ll/ۘܽۧ;->ۖ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 245
    :cond_0
    iget-object v0, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    invoke-virtual {v0, p0}, Ll/ۡܳۧ;->֫(Ll/ۜܳۧ;)V

    .line 246
    iget-object v0, p0, Ll/ᩳܽۧ;->᩺:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 247
    iput-object v1, p0, Ll/ᩳܽۧ;->᩹:Ll/᩷ۧۧ;

    const/4 v0, 0x1

    .line 248
    iput-boolean v0, p0, Ll/ᩳܽۧ;->֨֫:Z

    return-void
.end method

.method public final ۢ()Ll/᩵ۢۧ;
    .locals 3

    .line 785
    new-instance v0, Ll/ۧܽۧ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۧܽۧ;-><init>(IZ)V

    invoke-direct {p0, v0}, Ll/ᩳܽۧ;->֫(Ll/ۧܽۧ;)Ll/᩵ۢۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()J
    .locals 2

    .line 421
    invoke-virtual {p0}, Ll/ᩳܽۧ;->ۜ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 531
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ll/ۘܽۧ;->ۡ()V

    .line 536
    iget-object p1, p0, Ll/ᩳܽۧ;->᩻֫:Ll/ۧܳۧ;

    iget v0, p0, Ll/ᩳܽۧ;->ۗ:I

    invoke-interface {p1, v0}, Ll/ۧܳۧ;->֫(I)I

    move-result p1

    iget-object v0, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    invoke-virtual {v0, p1}, Ll/ۡܳۧ;->֫(I)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 0

    return-void
.end method

.method public final ܳ()V
    .locals 2

    const/4 v0, 0x1

    .line 773
    iput-boolean v0, p0, Ll/ᩳܽۧ;->᩸֫:Z

    .line 774
    iget-object v0, p0, Ll/ᩳܽۧ;->᩺:Landroid/os/Handler;

    iget-object v1, p0, Ll/ᩳܽۧ;->ۢ֫:Ll/ۤۧۧ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ܽ()J
    .locals 3

    .line 426
    iget-boolean v0, p0, Ll/ᩳܽۧ;->ᩴ֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 427
    iput-boolean v1, p0, Ll/ᩳܽۧ;->ᩴ֫:Z

    .line 428
    iget-wide v0, p0, Ll/ᩳܽۧ;->ᩳ֫:J

    return-wide v0

    .line 431
    :cond_0
    iget-boolean v0, p0, Ll/ᩳܽۧ;->ܺ֫:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/ᩳܽۧ;->᩷֫:Z

    if-nez v0, :cond_1

    .line 432
    invoke-direct {p0}, Ll/ᩳܽۧ;->ᩴ()I

    move-result v0

    iget v2, p0, Ll/ᩳܽۧ;->ۨ:I

    if-le v0, v2, :cond_2

    .line 433
    :cond_1
    iput-boolean v1, p0, Ll/ᩳܽۧ;->ܺ֫:Z

    .line 434
    iget-wide v0, p0, Ll/ᩳܽۧ;->ᩳ֫:J

    return-wide v0

    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final ܿ()V
    .locals 2

    .line 536
    iget-object v0, p0, Ll/ᩳܽۧ;->᩻֫:Ll/ۧܳۧ;

    iget v1, p0, Ll/ᩳܽۧ;->ۗ:I

    invoke-interface {v0, v1}, Ll/ۧܳۧ;->֫(I)I

    move-result v0

    iget-object v1, p0, Ll/ᩳܽۧ;->ۜ֫:Ll/ۡܳۧ;

    invoke-virtual {v1, v0}, Ll/ۡܳۧ;->֫(I)V

    .line 284
    iget-boolean v0, p0, Ll/ᩳܽۧ;->᩷֫:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ᩳܽۧ;->֡֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Loading finished before preparation is complete."

    const/4 v1, 0x0

    .line 285
    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩳ()V
    .locals 4

    .line 253
    iget-object v0, p0, Ll/ᩳܽۧ;->ܶ֫:[Ll/ۘܽۧ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 254
    invoke-virtual {v3}, Ll/ۘܽۧ;->ۘ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 256
    :cond_0
    iget-object v0, p0, Ll/ᩳܽۧ;->ۚ֫:Ll/ܺ֫ۧ;

    invoke-virtual {v0}, Ll/ܺ֫ۧ;->ܽ()V

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 792
    iget-object v0, p0, Ll/ᩳܽۧ;->᩺:Landroid/os/Handler;

    iget-object v1, p0, Ll/ᩳܽۧ;->ۢ֫:Ll/ۤۧۧ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ᩻()Ll/ۛܽۧ;
    .locals 1

    .line 292
    invoke-direct {p0}, Ll/ᩳܽۧ;->ۘ()V

    .line 293
    iget-object v0, p0, Ll/ᩳܽۧ;->۬֫:Ll/ܽܽۧ;

    iget-object v0, v0, Ll/ܽܽۧ;->ᩳ:Ll/ۛܽۧ;

    return-object v0
.end method
