.class public final Ll/ܿۡۧ;
.super Ll/᩷ۡۧ;
.source "U8QL"


# static fields
.field public static final ܿ:[I


# instance fields
.field public ۧ:I

.field public ܽ:Z

.field public ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x5622

    const v1, 0xac44

    const/16 v2, 0x1588

    const/16 v3, 0x2b11

    .line 38
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ܿۡۧ;->ܿ:[I

    return-void
.end method


# virtual methods
.method public final ֫(JLl/ᩳ֨֫;)Z
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p3

    .line 96
    iget v2, v0, Ll/ܿۡۧ;->ۧ:I

    const/4 v3, 0x2

    iget-object v4, v0, Ll/᩷ۡۧ;->֫:Ll/᩵ۢۧ;

    const/4 v5, 0x1

    if-ne v2, v3, :cond_0

    .line 97
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->֫()I

    move-result v10

    .line 98
    invoke-interface {v4, v10, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 99
    iget-object v6, v0, Ll/᩷ۡۧ;->֫:Ll/᩵ۢۧ;

    const/4 v9, 0x1

    move-wide/from16 v7, p1

    invoke-interface/range {v6 .. v12}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    return v5

    .line 102
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 103
    iget-boolean v6, v0, Ll/ܿۡۧ;->ܽ:Z

    if-nez v6, :cond_1

    .line 105
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    new-array v6, v2, [B

    .line 106
    invoke-virtual {v1, v3, v2, v6}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 195
    new-instance v1, Ll/ܽ֨֫;

    .line 48
    invoke-direct {v1, v6, v2}, Ll/ܽ֨֫;-><init>([BI)V

    .line 195
    invoke-static {v1, v3}, Ll/۫ۜۧ;->֫(Ll/ܽ֨֫;Z)Ll/۬ۜۧ;

    move-result-object v1

    .line 108
    new-instance v2, Ll/֨ᩴ֫;

    invoke-direct {v2}, Ll/֨ᩴ֫;-><init>()V

    const-string v7, "video/x-flv"

    .line 110
    invoke-virtual {v2, v7}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v7, "audio/mp4a-latm"

    .line 111
    invoke-virtual {v2, v7}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v7, v1, Ll/۬ۜۧ;->ۧ:Ljava/lang/String;

    .line 112
    invoke-virtual {v2, v7}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    iget v7, v1, Ll/۬ۜۧ;->֫:I

    .line 113
    invoke-virtual {v2, v7}, Ll/֨ᩴ֫;->ᩳ(I)V

    iget v1, v1, Ll/۬ۜۧ;->ܽ:I

    .line 114
    invoke-virtual {v2, v1}, Ll/֨ᩴ֫;->۠(I)V

    .line 115
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 116
    invoke-virtual {v2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 117
    invoke-interface {v4, v1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 118
    iput-boolean v5, v0, Ll/ܿۡۧ;->ܽ:Z

    return v3

    .line 120
    :cond_1
    iget v6, v0, Ll/ܿۡۧ;->ۧ:I

    const/16 v7, 0xa

    if-ne v6, v7, :cond_3

    if-ne v2, v5, :cond_2

    goto :goto_0

    :cond_2
    return v3

    .line 121
    :cond_3
    :goto_0
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->֫()I

    move-result v12

    .line 122
    invoke-interface {v4, v12, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 123
    iget-object v8, v0, Ll/᩷ۡۧ;->֫:Ll/᩵ۢۧ;

    const/4 v11, 0x1

    move-wide/from16 v9, p1

    invoke-interface/range {v8 .. v14}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    return v5
.end method

.method public final ֫(Ll/ᩳ֨֫;)Z
    .locals 5

    .line 56
    iget-boolean v0, p0, Ll/ܿۡۧ;->ᩳ:Z

    const/4 v1, 0x1

    if-nez v0, :cond_5

    .line 57
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    .line 58
    iput v0, p0, Ll/ܿۡۧ;->ۧ:I

    .line 59
    iget-object v2, p0, Ll/᩷ۡۧ;->֫:Ll/᩵ۢۧ;

    const-string v3, "video/x-flv"

    const/4 v4, 0x2

    if-ne v0, v4, :cond_0

    shr-int/2addr p1, v4

    and-int/lit8 p1, p1, 0x3

    .line 61
    sget-object v0, Ll/ܿۡۧ;->ܿ:[I

    aget p1, v0, p1

    .line 62
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    .line 64
    invoke-virtual {v0, v3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v3, "audio/mpeg"

    .line 65
    invoke-virtual {v0, v3}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 67
    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->۠(I)V

    .line 68
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 69
    invoke-interface {v2, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 70
    iput-boolean v1, p0, Ll/ܿۡۧ;->ܽ:Z

    goto :goto_2

    :cond_0
    const/4 p1, 0x7

    if-eq v0, p1, :cond_3

    const/16 v4, 0x8

    if-ne v0, v4, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0xa

    if-ne v0, p1, :cond_2

    goto :goto_2

    .line 84
    :cond_2
    new-instance p1, Ll/ۜۡۧ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Audio format not supported: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܿۡۧ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ۜۡۧ;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    if-ne v0, p1, :cond_4

    const-string p1, "audio/g711-alaw"

    goto :goto_1

    :cond_4
    const-string p1, "audio/g711-mlaw"

    .line 74
    :goto_1
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    .line 76
    invoke-virtual {v0, v3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 78
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ᩳ(I)V

    const/16 p1, 0x1f40

    .line 79
    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->۠(I)V

    .line 80
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 81
    invoke-interface {v2, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 82
    iput-boolean v1, p0, Ll/ܿۡۧ;->ܽ:Z

    .line 86
    :goto_2
    iput-boolean v1, p0, Ll/ܿۡۧ;->ᩳ:Z

    return v1

    .line 89
    :cond_5
    invoke-virtual {p1, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    return v1
.end method
