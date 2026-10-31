.class public final Ll/᩹֡ۧ;
.super Ljava/lang/Object;
.source "T8HW"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public ۧ:Ll/᩵ۢۧ;

.field public ܳ:Z

.field public ܽ:I

.field public ܿ:J

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/᩹֡ۧ;->֫:Ll/ᩳ֨֫;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    iput-wide v0, p0, Ll/᩹֡ۧ;->ܿ:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p0, Ll/᩹֡ۧ;->ܳ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    iput-wide v0, p0, Ll/᩹֡ۧ;->ܿ:J

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 83
    iput-boolean p1, p0, Ll/᩹֡ۧ;->ܳ:Z

    .line 84
    iput-wide p2, p0, Ll/᩹֡ۧ;->ܿ:J

    const/4 p1, 0x0

    .line 85
    iput p1, p0, Ll/᩹֡ۧ;->ᩳ:I

    .line 86
    iput p1, p0, Ll/᩹֡ۧ;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 8

    .line 91
    iget-object v0, p0, Ll/᩹֡ۧ;->ۧ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 92
    iget-boolean v0, p0, Ll/᩹֡ۧ;->ܳ:Z

    if-nez v0, :cond_0

    return-void

    .line 95
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    .line 96
    iget v1, p0, Ll/᩹֡ۧ;->ܽ:I

    const/16 v2, 0xa

    if-ge v1, v2, :cond_3

    rsub-int/lit8 v1, v1, 0xa

    .line 98
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 100
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 101
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v4

    .line 102
    iget-object v5, p0, Ll/᩹֡ۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    iget v7, p0, Ll/᩹֡ۧ;->ܽ:I

    .line 99
    invoke-static {v3, v4, v6, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 105
    iget v3, p0, Ll/᩹֡ۧ;->ܽ:I

    add-int/2addr v3, v1

    if-ne v3, v2, :cond_3

    const/4 v1, 0x0

    .line 107
    invoke-virtual {v5, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    const/16 v3, 0x49

    .line 108
    invoke-virtual {v5}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    if-ne v3, v4, :cond_2

    const/16 v3, 0x44

    .line 109
    invoke-virtual {v5}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    if-ne v3, v4, :cond_2

    const/16 v3, 0x33

    .line 110
    invoke-virtual {v5}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    .line 115
    invoke-virtual {v5, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 116
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ۚ()I

    move-result v1

    add-int/2addr v1, v2

    iput v1, p0, Ll/᩹֡ۧ;->ᩳ:I

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "Discarding invalid ID3 tag"

    .line 111
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 112
    iput-boolean v1, p0, Ll/᩹֡ۧ;->ܳ:Z

    return-void

    .line 120
    :cond_3
    :goto_1
    iget v1, p0, Ll/᩹֡ۧ;->ᩳ:I

    iget v2, p0, Ll/᩹֡ۧ;->ܽ:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 121
    iget-object v1, p0, Ll/᩹֡ۧ;->ۧ:Ll/᩵ۢۧ;

    invoke-interface {v1, v0, p1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 122
    iget p1, p0, Ll/᩹֡ۧ;->ܽ:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩹֡ۧ;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 2

    .line 68
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 69
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v0

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹֡ۧ;->ۧ:Ll/᩵ۢۧ;

    .line 70
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    .line 72
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string p2, "video/mp2t"

    .line 73
    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string p2, "application/id3"

    .line 74
    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p2

    .line 70
    invoke-interface {p1, p2}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 8

    .line 127
    iget-object p1, p0, Ll/᩹֡ۧ;->ۧ:Ll/᩵ۢۧ;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 128
    iget-boolean p1, p0, Ll/᩹֡ۧ;->ܳ:Z

    if-eqz p1, :cond_2

    iget p1, p0, Ll/᩹֡ۧ;->ᩳ:I

    if-eqz p1, :cond_2

    iget v0, p0, Ll/᩹֡ۧ;->ܽ:I

    if-eq v0, p1, :cond_0

    goto :goto_1

    .line 132
    :cond_0
    iget-wide v0, p0, Ll/᩹֡ۧ;->ܿ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 p1, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 133
    iget-object v1, p0, Ll/᩹֡ۧ;->ۧ:Ll/᩵ۢۧ;

    iget-wide v2, p0, Ll/᩹֡ۧ;->ܿ:J

    iget v5, p0, Ll/᩹֡ۧ;->ᩳ:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    invoke-interface/range {v1 .. v7}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 134
    iput-boolean p1, p0, Ll/᩹֡ۧ;->ܳ:Z

    :cond_2
    :goto_1
    return-void
.end method
