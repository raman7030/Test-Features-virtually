.class public final Ll/ܳ᩸֡;
.super Ll/֫᩶֡;
.source "F67X"


# instance fields
.field public ۧ:I

.field public ܽ:[B


# direct methods
.method public constructor <init>(I[B)V
    .locals 2

    .line 50
    sget-object v0, Ll/᩻᩶֡;->ۗܿ:Ll/᩻᩶֡;

    invoke-direct {p0, v0}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 52
    array-length v0, p2

    rem-int/2addr v0, p1

    if-nez v0, :cond_0

    .line 56
    iput p1, p0, Ll/ܳ᩸֡;->ۧ:I

    .line 57
    iput-object p2, p0, Ll/ܳ᩸֡;->ܽ:[B

    return-void

    .line 53
    :cond_0
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "There are not a whole number of "

    const-string v1, " byte elements"

    .line 0
    invoke-static {p1, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 53
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>([BI)V
    .locals 3

    .line 61
    sget-object v0, Ll/᩻᩶֡;->ۗܿ:Ll/᩻᩶֡;

    invoke-direct {p0, v0}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 63
    aget-byte v0, p1, p2

    if-nez v0, :cond_1

    add-int/lit8 v0, p2, 0x1

    .line 68
    aget-byte v0, p1, v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, p2, 0x2

    .line 73
    invoke-static {v0, p1}, Ll/ۨܺܺ;->ܽ(I[B)I

    move-result v0

    iput v0, p0, Ll/ܳ᩸֡;->ۧ:I

    add-int/lit8 v1, p2, 0x4

    .line 74
    invoke-static {v1, p1}, Ll/ۨܺܺ;->֫(I[B)I

    move-result v1

    mul-int v1, v1, v0

    .line 75
    new-array v0, v1, [B

    iput-object v0, p0, Ll/ܳ᩸֡;->ܽ:[B

    add-int/lit8 p2, p2, 0x8

    const/4 v2, 0x0

    .line 76
    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 70
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Invalid sub-opcode byte for an ArrayData pseudo-instruction"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Invalid opcode byte for an ArrayData pseudo-instruction"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܳ᩸֡;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩸֡;->ܽ:[B

    return-object p0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܳ᩸֡;->ܽ:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    rem-int/lit8 p1, p1, 0x2

    add-int/2addr p1, v0

    return p1
.end method

.method public final ۖ()Ljava/util/Iterator;
    .locals 1

    .line 123
    new-instance v0, Ll/ᩳ᩸֡;

    invoke-direct {v0, p0}, Ll/ᩳ᩸֡;-><init>(Ll/ܳ᩸֡;)V

    return-object v0
.end method

.method public final ۡ()I
    .locals 2

    .line 108
    iget-object v0, p0, Ll/ܳ᩸֡;->ܽ:[B

    array-length v0, v0

    iget v1, p0, Ll/ܳ᩸֡;->ۧ:I

    div-int/2addr v0, v1

    return v0
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 100
    sget-object v0, Ll/᩻᩸֡;->ۗ:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 4

    const/4 p2, 0x4

    .line 80
    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->֫(I)V

    .line 82
    iget-object p2, p0, Ll/ܳ᩸֡;->ܽ:[B

    array-length v0, p2

    iget v1, p0, Ll/ܳ᩸֡;->ۧ:I

    div-int/2addr v0, v1

    const/4 v2, 0x0

    .line 84
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ۧ(I)V

    const/4 v3, 0x3

    .line 85
    invoke-virtual {p1, v3}, Ll/֫ۗ֡;->ۧ(I)V

    .line 86
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 87
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 347
    array-length v0, p2

    invoke-virtual {p1, p2, v2, v0}, Ll/֫ۗ֡;->֫([BII)V

    const/4 p2, 0x2

    .line 91
    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->֫(I)V

    return-void
.end method

.method public final ܺ()I
    .locals 1

    .line 104
    iget v0, p0, Ll/ܳ᩸֡;->ۧ:I

    return v0
.end method
