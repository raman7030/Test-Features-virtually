.class public final Ll/ۡ֡ۧ;
.super Ljava/lang/Object;
.source "F8HT"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public ֫:I

.field public final ۧ:[Ll/᩵ۢۧ;

.field public ܳ:Z

.field public ܽ:I

.field public final ܿ:Ljava/util/List;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/ۡ֡ۧ;->ܿ:Ljava/util/List;

    .line 53
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ll/᩵ۢۧ;

    iput-object p1, p0, Ll/ۡ֡ۧ;->ۧ:[Ll/᩵ۢۧ;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    iput-wide v0, p0, Ll/ۡ֡ۧ;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Ll/ۡ֡ۧ;->ܳ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    iput-wide v0, p0, Ll/ۡ֡ۧ;->ᩳ:J

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 86
    iput-boolean p1, p0, Ll/ۡ֡ۧ;->ܳ:Z

    .line 87
    iput-wide p2, p0, Ll/ۡ֡ۧ;->ᩳ:J

    const/4 p1, 0x0

    .line 88
    iput p1, p0, Ll/ۡ֡ۧ;->ܽ:I

    const/4 p1, 0x2

    .line 89
    iput p1, p0, Ll/ۡ֡ۧ;->֫:I

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 6

    .line 106
    iget-boolean v0, p0, Ll/ۡ֡ۧ;->ܳ:Z

    if-eqz v0, :cond_7

    .line 107
    iget v0, p0, Ll/ۡ֡ۧ;->֫:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_2

    .line 126
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 129
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    .line 130
    iput-boolean v2, p0, Ll/ۡ֡ۧ;->ܳ:Z

    .line 132
    :cond_1
    iget v0, p0, Ll/ۡ֡ۧ;->֫:I

    sub-int/2addr v0, v3

    iput v0, p0, Ll/ۡ֡ۧ;->֫:I

    .line 133
    iget-boolean v0, p0, Ll/ۡ֡ۧ;->ܳ:Z

    :goto_0
    if-nez v0, :cond_2

    goto :goto_3

    .line 111
    :cond_2
    iget v0, p0, Ll/ۡ֡ۧ;->֫:I

    if-ne v0, v3, :cond_5

    .line 126
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_1

    .line 129
    :cond_3
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    if-eqz v0, :cond_4

    .line 130
    iput-boolean v2, p0, Ll/ۡ֡ۧ;->ܳ:Z

    .line 132
    :cond_4
    iget v0, p0, Ll/ۡ֡ۧ;->֫:I

    sub-int/2addr v0, v3

    iput v0, p0, Ll/ۡ֡ۧ;->֫:I

    .line 133
    iget-boolean v0, p0, Ll/ۡ֡ۧ;->ܳ:Z

    :goto_1
    if-nez v0, :cond_5

    goto :goto_3

    .line 115
    :cond_5
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    .line 116
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    .line 117
    iget-object v3, p0, Ll/ۡ֡ۧ;->ۧ:[Ll/᩵ۢۧ;

    array-length v4, v3

    :goto_2
    if-ge v2, v4, :cond_6

    aget-object v5, v3, v2

    .line 118
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 119
    invoke-interface {v5, v1, p1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 121
    :cond_6
    iget p1, p0, Ll/ۡ֡ۧ;->ܽ:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۡ֡ۧ;->ܽ:I

    :cond_7
    :goto_3
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 6

    const/4 v0, 0x0

    .line 65
    :goto_0
    iget-object v1, p0, Ll/ۡ֡ۧ;->ۧ:[Ll/᩵ۢۧ;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 66
    iget-object v2, p0, Ll/ۡ֡ۧ;->ܿ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۚۧ;

    .line 67
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 68
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v3

    const/4 v4, 0x3

    invoke-interface {p1, v3, v4}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v3

    .line 69
    new-instance v4, Ll/֨ᩴ֫;

    invoke-direct {v4}, Ll/֨ᩴ֫;-><init>()V

    .line 71
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v5, "video/mp2t"

    .line 72
    invoke-virtual {v4, v5}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v5, "application/dvbsubs"

    .line 73
    invoke-virtual {v4, v5}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v5, v2, Ll/ۖۚۧ;->֫:[B

    .line 74
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    iget-object v2, v2, Ll/ۖۚۧ;->ۧ:Ljava/lang/String;

    .line 75
    invoke-virtual {v4, v2}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v4}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v2

    .line 69
    invoke-interface {v3, v2}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 77
    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 10

    .line 94
    iget-boolean p1, p0, Ll/ۡ֡ۧ;->ܳ:Z

    if-eqz p1, :cond_2

    .line 96
    iget-wide v0, p0, Ll/ۡ֡ۧ;->ᩳ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 p1, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 97
    iget-object v0, p0, Ll/ۡ֡ۧ;->ۧ:[Ll/᩵ۢۧ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 98
    iget-wide v4, p0, Ll/ۡ֡ۧ;->ᩳ:J

    iget v7, p0, Ll/ۡ֡ۧ;->ܽ:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x1

    invoke-interface/range {v3 .. v9}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 100
    :cond_1
    iput-boolean p1, p0, Ll/ۡ֡ۧ;->ܳ:Z

    :cond_2
    return-void
.end method
