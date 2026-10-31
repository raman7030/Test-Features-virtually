.class public final Ll/۫ۤ֫;
.super Ll/֨֡֫;
.source "28IA"


# static fields
.field public static final ᩷:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 41
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    sput v0, Ll/۫ۤ֫;->᩷:I

    return-void
.end method

.method public static ֫(Ljava/nio/ByteBuffer;I)V
    .locals 4

    const-wide v0, 0x3e00000000200000L    # 4.656612875245797E-10

    int-to-double v2, p1

    mul-double v2, v2, v0

    double-to-float p1, v2

    .line 130
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    .line 131
    sget v0, Ll/۫ۤ֫;->᩷:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 132
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    .line 134
    :cond_0
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 5

    .line 59
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    .line 60
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    sub-int v2, v1, v0

    .line 64
    iget-object v3, p0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v3, v3, Ll/ᩴ֡֫;->ܽ:I

    const/16 v4, 0x15

    if-eq v3, v4, :cond_3

    const/16 v4, 0x16

    if-eq v3, v4, :cond_2

    const/high16 v4, 0x50000000

    if-eq v3, v4, :cond_1

    const/high16 v4, 0x60000000

    if-ne v3, v4, :cond_0

    .line 97
    invoke-virtual {p0, v2}, Ll/֨֡֫;->֫(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    :goto_0
    if-ge v0, v1, :cond_4

    add-int/lit8 v3, v0, 0x3

    .line 100
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v0, 0x2

    .line 101
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v3, v4

    add-int/lit8 v4, v0, 0x1

    .line 102
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    .line 103
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v3, v4

    .line 104
    invoke-static {v2, v3}, Ll/۫ۤ֫;->֫(Ljava/nio/ByteBuffer;I)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    .line 115
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 76
    :cond_1
    div-int/lit8 v2, v2, 0x3

    mul-int/lit8 v2, v2, 0x4

    invoke-virtual {p0, v2}, Ll/֨֡֫;->֫(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    :goto_1
    if-ge v0, v1, :cond_4

    add-int/lit8 v3, v0, 0x2

    .line 79
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    add-int/lit8 v4, v0, 0x1

    .line 80
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    .line 81
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v3, v4

    .line 82
    invoke-static {v2, v3}, Ll/۫ۤ֫;->֫(Ljava/nio/ByteBuffer;I)V

    add-int/lit8 v0, v0, 0x3

    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {p0, v2}, Ll/֨֡֫;->֫(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    :goto_2
    if-ge v0, v1, :cond_4

    .line 89
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v0, 0x1

    .line 90
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v3, v4

    add-int/lit8 v4, v0, 0x2

    .line 91
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    add-int/lit8 v4, v0, 0x3

    .line 92
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v3, v4

    .line 93
    invoke-static {v2, v3}, Ll/۫ۤ֫;->֫(Ljava/nio/ByteBuffer;I)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_2

    .line 66
    :cond_3
    div-int/lit8 v2, v2, 0x3

    mul-int/lit8 v2, v2, 0x4

    invoke-virtual {p0, v2}, Ll/֨֡֫;->֫(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    :goto_3
    if-ge v0, v1, :cond_4

    .line 69
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    add-int/lit8 v4, v0, 0x1

    .line 70
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    add-int/lit8 v4, v0, 0x2

    .line 71
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v3, v4

    .line 72
    invoke-static {v2, v3}, Ll/۫ۤ֫;->֫(Ljava/nio/ByteBuffer;I)V

    add-int/lit8 v0, v0, 0x3

    goto :goto_3

    .line 118
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 119
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-void
.end method

.method public final ۧ(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;
    .locals 3

    .line 47
    iget v0, p1, Ll/ᩴ֡֫;->ܽ:I

    const/16 v1, 0x15

    const/4 v2, 0x4

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x50000000

    if-eq v0, v1, :cond_1

    const/16 v1, 0x16

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x60000000

    if-eq v0, v1, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    new-instance v0, Ll/᩵֡֫;

    invoke-direct {v0, p1}, Ll/᩵֡֫;-><init>(Ll/ᩴ֡֫;)V

    throw v0

    :cond_1
    :goto_0
    if-eq v0, v2, :cond_2

    .line 52
    new-instance v0, Ll/ᩴ֡֫;

    iget v1, p1, Ll/ᩴ֡֫;->ᩳ:I

    iget p1, p1, Ll/ᩴ֡֫;->ۧ:I

    invoke-direct {v0, v1, p1, v2}, Ll/ᩴ֡֫;-><init>(III)V

    return-object v0

    .line 54
    :cond_2
    sget-object p1, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    return-object p1
.end method
