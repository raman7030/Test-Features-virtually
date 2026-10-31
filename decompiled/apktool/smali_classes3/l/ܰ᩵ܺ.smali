.class public final Ll/ܰ᩵ܺ;
.super Ljava/lang/Object;
.source "C5LF"


# instance fields
.field public ֫:I

.field public ۧ:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-wide p2, p0, Ll/ܰ᩵ܺ;->ۧ:J

    .line 35
    iput p1, p0, Ll/ܰ᩵ܺ;->֫:I

    return-void
.end method

.method public static ֫(IILjava/lang/String;)Ll/ܰ᩵ܺ;
    .locals 6

    if-lt p0, p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    move v2, p0

    :goto_0
    if-ge v2, p1, :cond_2

    .line 75
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_2

    const/16 v4, 0x39

    if-gt v3, v4, :cond_2

    const-wide/16 v4, 0xa

    mul-long v0, v0, v4

    add-int/lit8 v3, v3, -0x30

    int-to-long v3, v3

    add-long/2addr v0, v3

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v0, v3

    if-lez v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-ne v2, p0, :cond_3

    :goto_1
    const/4 p0, 0x0

    return-object p0

    .line 98
    :cond_3
    new-instance p0, Ll/ܰ᩵ܺ;

    invoke-direct {p0, v2, v0, v1}, Ll/ܰ᩵ܺ;-><init>(IJ)V

    return-object p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 44
    iget v0, p0, Ll/ܰ᩵ܺ;->֫:I

    return v0
.end method

.method public final ۧ()I
    .locals 2

    .line 107
    iget-wide v0, p0, Ll/ܰ᩵ܺ;->ۧ:J

    long-to-int v1, v0

    return v1
.end method
