.class public abstract Ll/᩻֡ᩴ;
.super Ljava/lang/Object;
.source "DD2"


# instance fields
.field public ۗ:I

.field public ۙ:Z

.field public final synthetic ۬:Ll/ۢ֡ᩴ;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۢ֡ᩴ;)V
    .locals 2

    .line 815
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻֡ᩴ;->۬:Ll/ۢ֡ᩴ;

    const/4 v0, 0x0

    .line 806
    iput v0, p0, Ll/᩻֡ᩴ;->ۗ:I

    .line 808
    iget v1, p1, Ll/ۢ֡ᩴ;->ۛ:I

    iput v1, p0, Ll/᩻֡ᩴ;->᩶:I

    .line 810
    iput v0, p0, Ll/᩻֡ᩴ;->᩸:I

    .line 812
    iget-boolean p1, p1, Ll/ۢ֡ᩴ;->᩸:Z

    iput-boolean p1, p0, Ll/᩻֡ᩴ;->ۙ:Z

    .line 813
    iput-boolean v0, p0, Ll/᩻֡ᩴ;->᩹:Z

    return-void
.end method

.method public constructor <init>(Ll/ۢ֡ᩴ;IIZ)V
    .locals 0

    .line 818
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻֡ᩴ;->۬:Ll/ۢ֡ᩴ;

    const/4 p1, 0x0

    .line 810
    iput p1, p0, Ll/᩻֡ᩴ;->᩸:I

    .line 819
    iput p2, p0, Ll/᩻֡ᩴ;->ۗ:I

    .line 820
    iput p3, p0, Ll/᩻֡ᩴ;->᩶:I

    .line 821
    iput-boolean p4, p0, Ll/᩻֡ᩴ;->ۙ:Z

    const/4 p1, 0x1

    .line 822
    iput-boolean p1, p0, Ll/᩻֡ᩴ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final estimateSize()J
    .locals 6

    .line 865
    iget-boolean v0, p0, Ll/᩻֡ᩴ;->᩹:Z

    iget-object v1, p0, Ll/᩻֡ᩴ;->۬:Ll/ۢ֡ᩴ;

    if-nez v0, :cond_0

    .line 867
    iget v0, v1, Ll/ۢ֡ᩴ;->ۨ:I

    iget v1, p0, Ll/᩻֡ᩴ;->᩸:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0

    .line 872
    :cond_0
    iget v0, v1, Ll/ۢ֡ᩴ;->ۨ:I

    iget v2, p0, Ll/᩻֡ᩴ;->᩸:I

    sub-int v2, v0, v2

    int-to-long v2, v2

    .line 208
    iget-boolean v4, v1, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz v4, :cond_1

    add-int/lit8 v0, v0, -0x1

    :cond_1
    int-to-double v4, v0

    .line 872
    iget v0, v1, Ll/ۢ֡ᩴ;->ۛ:I

    int-to-double v0, v0

    div-double/2addr v4, v0

    iget v0, p0, Ll/᩻֡ᩴ;->᩶:I

    iget v1, p0, Ll/᩻֡ᩴ;->ۗ:I

    sub-int/2addr v0, v1

    int-to-double v0, v0

    mul-double v4, v4, v0

    double-to-long v0, v4

    iget-boolean v4, p0, Ll/᩻֡ᩴ;->ۙ:Z

    int-to-long v4, v4

    add-long/2addr v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 3

    .line 849
    iget-boolean v0, p0, Ll/᩻֡ᩴ;->ۙ:Z

    iget-object v1, p0, Ll/᩻֡ᩴ;->۬:Ll/ۢ֡ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 850
    iput-boolean v0, p0, Ll/᩻֡ᩴ;->ۙ:Z

    .line 851
    iget v0, p0, Ll/᩻֡ᩴ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩻֡ᩴ;->᩸:I

    .line 852
    iget v0, v1, Ll/ۢ֡ᩴ;->ۛ:I

    invoke-virtual {p0, v0, p1}, Ll/᩻֡ᩴ;->֫(ILjava/lang/Object;)V

    .line 854
    :cond_0
    iget-object v0, v1, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 855
    :goto_0
    iget v1, p0, Ll/᩻֡ᩴ;->ۗ:I

    iget v2, p0, Ll/᩻֡ᩴ;->᩶:I

    if-ge v1, v2, :cond_2

    .line 856
    aget-object v2, v0, v1

    if-eqz v2, :cond_1

    .line 857
    invoke-virtual {p0, v1, p1}, Ll/᩻֡ᩴ;->֫(ILjava/lang/Object;)V

    .line 858
    iget v1, p0, Ll/᩻֡ᩴ;->᩸:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩻֡ᩴ;->᩸:I

    .line 860
    :cond_1
    iget v1, p0, Ll/᩻֡ᩴ;->ۗ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩻֡ᩴ;->ۗ:I

    goto :goto_0

    :cond_2
    return-void
.end method

.method public tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 4

    .line 830
    iget-boolean v0, p0, Ll/᩻֡ᩴ;->ۙ:Z

    iget-object v1, p0, Ll/᩻֡ᩴ;->۬:Ll/ۢ֡ᩴ;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 831
    iput-boolean v2, p0, Ll/᩻֡ᩴ;->ۙ:Z

    .line 832
    iget v0, p0, Ll/᩻֡ᩴ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩻֡ᩴ;->᩸:I

    .line 833
    iget v0, v1, Ll/ۢ֡ᩴ;->ۛ:I

    invoke-virtual {p0, v0, p1}, Ll/᩻֡ᩴ;->֫(ILjava/lang/Object;)V

    goto :goto_1

    .line 836
    :cond_0
    iget-object v0, v1, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 837
    :goto_0
    iget v1, p0, Ll/᩻֡ᩴ;->ۗ:I

    iget v3, p0, Ll/᩻֡ᩴ;->᩶:I

    if-ge v1, v3, :cond_2

    .line 838
    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    .line 839
    iget v0, p0, Ll/᩻֡ᩴ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩻֡ᩴ;->᩸:I

    add-int/lit8 v0, v1, 0x1

    .line 840
    iput v0, p0, Ll/᩻֡ᩴ;->ۗ:I

    invoke-virtual {p0, v1, p1}, Ll/᩻֡ᩴ;->֫(ILjava/lang/Object;)V

    :goto_1
    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 843
    iput v1, p0, Ll/᩻֡ᩴ;->ۗ:I

    goto :goto_0

    :cond_2
    :goto_2
    return v2
.end method

.method public trySplit()Ll/ܶ۫ᩴ;
    .locals 4

    .line 877
    iget v0, p0, Ll/᩻֡ᩴ;->ۗ:I

    iget v1, p0, Ll/᩻֡ᩴ;->᩶:I

    add-int/lit8 v2, v1, -0x1

    if-lt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr v1, v0

    const/4 v2, 0x1

    shr-int/2addr v1, v2

    if-gt v1, v2, :cond_1

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    add-int/2addr v1, v0

    .line 886
    iget-boolean v3, p0, Ll/᩻֡ᩴ;->ۙ:Z

    invoke-virtual {p0, v0, v1, v3}, Ll/᩻֡ᩴ;->֫(IIZ)Ll/᩻֡ᩴ;

    move-result-object v0

    .line 887
    iput v1, p0, Ll/᩻֡ᩴ;->ۗ:I

    const/4 v1, 0x0

    .line 888
    iput-boolean v1, p0, Ll/᩻֡ᩴ;->ۙ:Z

    .line 889
    iput-boolean v2, p0, Ll/᩻֡ᩴ;->᩹:Z

    .line 913
    :goto_1
    check-cast v0, Ll/ܶ۫ᩴ;

    return-object v0
.end method

.method public abstract ֫(IIZ)Ll/᩻֡ᩴ;
.end method

.method public abstract ֫(ILjava/lang/Object;)V
.end method
