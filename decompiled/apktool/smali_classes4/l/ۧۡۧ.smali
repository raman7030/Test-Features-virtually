.class public final Ll/ۧۡۧ;
.super Ljava/lang/Object;
.source "G8K7"

# interfaces
.implements Ll/ܳ᩷ۧ;


# instance fields
.field public final ֫:Ll/ۛ᩷ۧ;

.field public final ۧ:I

.field public final ܽ:Ll/ۙ᩷ۧ;


# direct methods
.method public constructor <init>(Ll/ۛ᩷ۧ;I)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Ll/ۧۡۧ;->֫:Ll/ۛ᩷ۧ;

    .line 71
    iput p2, p0, Ll/ۧۡۧ;->ۧ:I

    .line 72
    new-instance p1, Ll/ۙ᩷ۧ;

    .line 30
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Ll/ۧۡۧ;->ܽ:Ll/ۙ᩷ۧ;

    return-void
.end method

.method private ֫(Ll/۠᩷ۧ;)J
    .locals 14

    .line 116
    :goto_0
    invoke-interface {p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v0

    invoke-interface {p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v2

    const-wide/16 v4, 0x6

    sub-long/2addr v2, v4

    iget-object v6, p0, Ll/ۧۡۧ;->ܽ:Ll/ۙ᩷ۧ;

    iget-object v7, p0, Ll/ۧۡۧ;->֫:Ll/ۛ᩷ۧ;

    cmp-long v8, v0, v2

    if-gez v8, :cond_3

    .line 96
    invoke-interface {p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v0

    const/4 v2, 0x2

    new-array v3, v2, [B

    const/4 v8, 0x0

    .line 99
    invoke-interface {p1, v8, v2, v3}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 100
    aget-byte v9, v3, v8

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    const/4 v10, 0x1

    aget-byte v11, v3, v10

    and-int/lit16 v11, v11, 0xff

    or-int/2addr v9, v11

    .line 101
    iget v11, p0, Ll/ۧۡۧ;->ۧ:I

    if-eq v9, v11, :cond_0

    .line 102
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 103
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-interface {p1, v1}, Ll/۠᩷ۧ;->֫(I)V

    goto :goto_3

    .line 107
    :cond_0
    new-instance v9, Ll/ᩳ֨֫;

    const/16 v12, 0x10

    invoke-direct {v9, v12}, Ll/ᩳ֨֫;-><init>(I)V

    .line 109
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    .line 108
    invoke-static {v3, v8, v12, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 113
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    :goto_1
    const/16 v12, 0xe

    if-ge v8, v12, :cond_2

    add-int v12, v2, v8

    rsub-int/lit8 v13, v8, 0xe

    .line 60
    invoke-interface {p1, v12, v13, v3}, Ll/۠᩷ۧ;->ۧ(II[B)I

    move-result v12

    const/4 v13, -0x1

    if-ne v12, v13, :cond_1

    goto :goto_2

    :cond_1
    add-int/2addr v8, v12

    goto :goto_1

    .line 114
    :cond_2
    :goto_2
    invoke-virtual {v9, v8}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 116
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 117
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-interface {p1, v1}, Ll/۠᩷ۧ;->֫(I)V

    .line 119
    invoke-static {v9, v7, v11, v6}, Ll/ۗ᩷ۧ;->֫(Ll/ᩳ֨֫;Ll/ۛ᩷ۧ;ILl/ۙ᩷ۧ;)Z

    move-result v8

    :goto_3
    if-nez v8, :cond_3

    invoke-interface {p1, v10}, Ll/۠᩷ۧ;->֫(I)V

    goto :goto_0

    .line 122
    :cond_3
    invoke-interface {p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v0

    invoke-interface {p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v2

    sub-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_4

    .line 123
    invoke-interface {p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v0

    invoke-interface {p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-interface {p1, v1}, Ll/۠᩷ۧ;->֫(I)V

    .line 124
    iget-wide v0, v7, Ll/ۛ᩷ۧ;->ܺ:J

    return-wide v0

    .line 127
    :cond_4
    iget-wide v0, v6, Ll/ۙ᩷ۧ;->֫:J

    return-wide v0
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;J)Ll/ܿ᩷ۧ;
    .locals 10

    .line 78
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v0

    .line 81
    invoke-direct {p0, p1}, Ll/ۧۡۧ;->֫(Ll/۠᩷ۧ;)J

    move-result-wide v2

    .line 82
    invoke-interface {p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v4

    .line 84
    iget-object v6, p0, Ll/ۧۡۧ;->֫:Ll/ۛ᩷ۧ;

    iget v6, v6, Ll/ۛ᩷ۧ;->ۜ:I

    const/4 v7, 0x6

    .line 85
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 84
    invoke-interface {p1, v6}, Ll/۠᩷ۧ;->֫(I)V

    .line 88
    invoke-direct {p0, p1}, Ll/ۧۡۧ;->֫(Ll/۠᩷ۧ;)J

    move-result-wide v6

    .line 89
    invoke-interface {p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v8

    cmp-long p1, v2, p2

    if-gtz p1, :cond_0

    cmp-long p1, v6, p2

    if-lez p1, :cond_0

    .line 93
    invoke-static {v4, v5}, Ll/ܿ᩷ۧ;->֫(J)Ll/ܿ᩷ۧ;

    move-result-object p1

    return-object p1

    :cond_0
    cmp-long p1, v6, p2

    if-gtz p1, :cond_1

    .line 95
    invoke-static {v6, v7, v8, v9}, Ll/ܿ᩷ۧ;->ۧ(JJ)Ll/ܿ᩷ۧ;

    move-result-object p1

    return-object p1

    .line 98
    :cond_1
    invoke-static {v2, v3, v0, v1}, Ll/ܿ᩷ۧ;->֫(JJ)Ll/ܿ᩷ۧ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ֫()V
    .locals 0

    return-void
.end method
