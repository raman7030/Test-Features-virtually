.class public final Ll/ۢۡۧ;
.super Ll/᩷ۡۧ;
.source "48T4"


# instance fields
.field public ۧ:I

.field public final ܳ:Ll/ᩳ֨֫;

.field public ܽ:Z

.field public final ܿ:Ll/ᩳ֨֫;

.field public ᩳ:Z

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/᩵ۢۧ;)V
    .locals 1

    .line 55
    invoke-direct {p0, p1}, Ll/᩷ۡۧ;-><init>(Ll/᩵ۢۧ;)V

    .line 56
    new-instance p1, Ll/ᩳ֨֫;

    sget-object v0, Ll/ܽ۠֫;->ۧ:[B

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object p1, p0, Ll/ۢۡۧ;->ܳ:Ll/ᩳ֨֫;

    .line 57
    new-instance p1, Ll/ᩳ֨֫;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ۢۡۧ;->ܿ:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(JLl/ᩳ֨֫;)Z
    .locals 10

    .line 80
    invoke-virtual {p3}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 81
    invoke-virtual {p3}, Ll/ᩳ֨֫;->ۜ()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    add-long v4, v1, p1

    .line 85
    iget-object p1, p0, Ll/᩷ۡۧ;->֫:Ll/᩵ۢۧ;

    const/4 p2, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v2, p0, Ll/ۢۡۧ;->ܽ:Z

    if-nez v2, :cond_0

    .line 86
    new-instance v0, Ll/ᩳ֨֫;

    invoke-virtual {p3}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    new-array v2, v2, [B

    invoke-direct {v0, v2}, Ll/ᩳ֨֫;-><init>([B)V

    .line 87
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-virtual {p3}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    invoke-virtual {p3, v1, v3, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 88
    invoke-static {v0}, Ll/۟ۜۧ;->֫(Ll/ᩳ֨֫;)Ll/۟ۜۧ;

    move-result-object p3

    .line 89
    iget v0, p3, Ll/۟ۜۧ;->ۢ:I

    iput v0, p0, Ll/ۢۡۧ;->᩻:I

    .line 91
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v2, "video/x-flv"

    .line 93
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v2, "video/avc"

    .line 94
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v2, p3, Ll/۟ۜۧ;->ܽ:Ljava/lang/String;

    .line 95
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    iget v2, p3, Ll/۟ۜۧ;->ܺ:I

    .line 96
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ۙ(I)V

    iget v2, p3, Ll/۟ۜۧ;->᩻:I

    .line 97
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ۡ(I)V

    iget v2, p3, Ll/۟ۜۧ;->ۡ:F

    .line 98
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ۧ(F)V

    iget-object p3, p3, Ll/۟ۜۧ;->ۜ:Ljava/util/ArrayList;

    .line 99
    invoke-virtual {v0, p3}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 100
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p3

    .line 101
    invoke-interface {p1, p3}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 102
    iput-boolean p2, p0, Ll/ۢۡۧ;->ܽ:Z

    return v1

    :cond_0
    if-ne v0, p2, :cond_4

    .line 104
    iget-boolean v0, p0, Ll/ۢۡۧ;->ܽ:Z

    if-eqz v0, :cond_4

    .line 105
    iget v0, p0, Ll/ۢۡۧ;->ۧ:I

    if-ne v0, p2, :cond_1

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 106
    :goto_0
    iget-boolean v0, p0, Ll/ۢۡۧ;->ᩳ:Z

    if-nez v0, :cond_2

    if-nez v6, :cond_2

    goto :goto_2

    .line 112
    :cond_2
    iget-object v0, p0, Ll/ۢۡۧ;->ܿ:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    .line 113
    aput-byte v1, v2, v1

    .line 114
    aput-byte v1, v2, p2

    const/4 v3, 0x2

    .line 115
    aput-byte v1, v2, v3

    .line 116
    iget v2, p0, Ll/ۢۡۧ;->᩻:I

    const/4 v3, 0x4

    rsub-int/lit8 v2, v2, 0x4

    const/4 v7, 0x0

    .line 122
    :goto_1
    invoke-virtual {p3}, Ll/ᩳ֨֫;->֫()I

    move-result v8

    if-lez v8, :cond_3

    .line 124
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v8

    iget v9, p0, Ll/ۢۡۧ;->᩻:I

    invoke-virtual {p3, v2, v9, v8}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 125
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 126
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v8

    .line 129
    iget-object v9, p0, Ll/ۢۡۧ;->ܳ:Ll/ᩳ֨֫;

    invoke-virtual {v9, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 130
    invoke-interface {p1, v3, v9}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    add-int/lit8 v7, v7, 0x4

    .line 134
    invoke-interface {p1, v8, p3}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    add-int/2addr v7, v8

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 137
    iget-object v3, p0, Ll/᩷ۡۧ;->֫:Ll/᩵ۢۧ;

    invoke-interface/range {v3 .. v9}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 139
    iput-boolean p2, p0, Ll/ۢۡۧ;->ᩳ:Z

    return p2

    :cond_4
    :goto_2
    return v1
.end method

.method public final ֫(Ll/ᩳ֨֫;)Z
    .locals 2

    .line 67
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    and-int/lit8 p1, p1, 0xf

    const/4 v1, 0x7

    if-ne p1, v1, :cond_1

    .line 74
    iput v0, p0, Ll/ۢۡۧ;->ۧ:I

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 72
    :cond_1
    new-instance v0, Ll/ۜۡۧ;

    const-string v1, "Video format not supported: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 72
    invoke-direct {v0, p1}, Ll/ۜۡۧ;-><init>(Ljava/lang/String;)V

    throw v0
.end method
