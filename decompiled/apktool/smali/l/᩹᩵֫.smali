.class public final Ll/᩹᩵֫;
.super Ljava/lang/Object;
.source "B8N9"


# instance fields
.field public ֫:Ll/۟ۘ֫;

.field public ۧ:J

.field public ܳ:Ljava/lang/Object;

.field public ܽ:Ljava/lang/Object;

.field public ܿ:J

.field public ᩳ:Z

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۚ۬ۚ;->֫(IIIII)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 592
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 593
    sget-object v0, Ll/۟ۘ֫;->ܽ:Ll/۟ۘ֫;

    iput-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 880
    const-class v0, Ll/᩹᩵֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 883
    :cond_1
    check-cast p1, Ll/᩹᩵֫;

    .line 884
    iget-object v0, p0, Ll/᩹᩵֫;->ܽ:Ljava/lang/Object;

    iget-object v1, p1, Ll/᩹᩵֫;->ܽ:Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    iget-object v1, p1, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    .line 885
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ll/᩹᩵֫;->᩻:I

    iget v1, p1, Ll/᩹᩵֫;->᩻:I

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Ll/᩹᩵֫;->ۧ:J

    iget-wide v2, p1, Ll/᩹᩵֫;->ۧ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-wide v0, p0, Ll/᩹᩵֫;->ܿ:J

    iget-wide v2, p1, Ll/᩹᩵֫;->ܿ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-boolean v0, p0, Ll/᩹᩵֫;->ᩳ:Z

    iget-boolean v1, p1, Ll/᩹᩵֫;->ᩳ:Z

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    iget-object p1, p1, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    .line 890
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 896
    iget-object v0, p0, Ll/᩹᩵֫;->ܽ:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/lit16 v0, v0, 0xd9

    mul-int/lit8 v0, v0, 0x1f

    .line 897
    iget-object v2, p0, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 898
    iget v1, p0, Ll/᩹᩵֫;->᩻:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 899
    iget-wide v1, p0, Ll/᩹᩵֫;->ۧ:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 900
    iget-wide v1, p0, Ll/᩹᩵֫;->ܿ:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 901
    iget-boolean v1, p0, Ll/᩹᩵֫;->ᩳ:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 902
    iget-object v1, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v1}, Ll/۟ۘ֫;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫(J)I
    .locals 11

    .line 787
    iget-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    iget-wide v1, p0, Ll/᩹᩵֫;->ۧ:J

    .line 870
    iget v3, v0, Ll/۟ۘ֫;->֫:I

    const-wide/high16 v4, -0x8000000000000000L

    const/4 v6, -0x1

    cmp-long v7, p1, v4

    if-eqz v7, :cond_4

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v7, v1, v4

    if-eqz v7, :cond_0

    cmp-long v4, p1, v1

    if-ltz v4, :cond_0

    goto :goto_2

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const-wide/16 v8, 0x0

    if-ge v4, v3, :cond_2

    .line 878
    invoke-virtual {v0, v4}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    invoke-virtual {v0, v4}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    cmp-long v5, v8, p1

    if-lez v5, :cond_1

    .line 880
    invoke-virtual {v0, v4}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v5

    .line 190
    iget v10, v5, Ll/ܰۘ֫;->֫:I

    if-eq v10, v6, :cond_2

    .line 164
    invoke-virtual {v5, v6}, Ll/ܰۘ֫;->֫(I)I

    move-result v5

    if-ge v5, v10, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v4, v3, :cond_4

    if-eqz v7, :cond_3

    .line 884
    invoke-virtual {v0, v4}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    cmp-long p1, v8, v1

    if-gtz p1, :cond_4

    :cond_3
    return v4

    :cond_4
    :goto_2
    return v6
.end method

.method public final ֫(I)J
    .locals 2

    .line 724
    iget-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v0, p1}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ֫(II)J
    .locals 2

    .line 810
    iget-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v0, p1}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object p1

    .line 811
    iget v0, p1, Ll/ܰۘ֫;->֫:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p1, Ll/ܰۘ֫;->ۧ:[J

    aget-wide v0, p1, p2

    return-wide v0

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;IJJLl/۟ۘ֫;Z)V
    .locals 0

    .line 658
    iput-object p1, p0, Ll/᩹᩵֫;->ܽ:Ljava/lang/Object;

    .line 659
    iput-object p2, p0, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    .line 660
    iput p3, p0, Ll/᩹᩵֫;->᩻:I

    .line 661
    iput-wide p4, p0, Ll/᩹᩵֫;->ۧ:J

    .line 662
    iput-wide p6, p0, Ll/᩹᩵֫;->ܿ:J

    .line 663
    iput-object p8, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    .line 664
    iput-boolean p9, p0, Ll/᩹᩵֫;->ᩳ:Z

    return-void
.end method

.method public final ۧ(I)I
    .locals 1

    .line 736
    iget-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v0, p1}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object p1

    const/4 v0, -0x1

    .line 164
    invoke-virtual {p1, v0}, Ll/ܰۘ֫;->֫(I)I

    move-result p1

    return p1
.end method

.method public final ۧ(J)I
    .locals 6

    .line 776
    iget-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    .line 850
    iget v1, v0, Ll/۟ۘ֫;->֫:I

    add-int/lit8 v2, v1, -0x1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    if-ne v2, v1, :cond_0

    .line 1360
    invoke-virtual {v0, v2}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    :goto_0
    if-ltz v2, :cond_2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v1, p1, v4

    if-nez v1, :cond_1

    goto :goto_1

    .line 1505
    :cond_1
    invoke-virtual {v0, v2}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v1

    .line 1506
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v4, 0x0

    cmp-long v1, p1, v4

    if-gez v1, :cond_2

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p1, -0x1

    if-ltz v2, :cond_6

    .line 855
    invoke-virtual {v0, v2}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object p2

    .line 197
    iget v0, p2, Ll/ܰۘ֫;->֫:I

    if-ne v0, p1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_6

    .line 201
    iget-object v4, p2, Ll/ܰۘ֫;->ܳ:[I

    aget v4, v4, v1

    if-eqz v4, :cond_5

    if-ne v4, v3, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    return v2

    :cond_6
    return p1
.end method

.method public final ܽ(I)Z
    .locals 3

    .line 704
    iget-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    iget v1, v0, Ll/۟ۘ֫;->֫:I

    add-int/lit8 v2, v1, -0x1

    if-ne p1, v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    .line 1360
    invoke-virtual {v0, p1}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(I)Z
    .locals 1

    .line 860
    iget-object v0, p0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v0, p1}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method
