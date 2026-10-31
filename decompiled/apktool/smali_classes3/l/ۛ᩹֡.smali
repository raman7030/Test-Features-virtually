.class public final Ll/ۛ᩹֡;
.super Ll/֫᩶֡;
.source "C6AF"

# interfaces
.implements Ll/ܿ᩶֡;


# instance fields
.field public ۧ:I

.field public ܽ:[I


# direct methods
.method public constructor <init>(I[I)V
    .locals 2

    .line 51
    sget-object v0, Ll/᩻᩶֡;->ۗܿ:Ll/᩻᩶֡;

    invoke-direct {p0, v0}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 53
    array-length v0, p2

    const v1, 0xffff

    if-gt v0, v1, :cond_0

    .line 58
    iput p1, p0, Ll/ۛ᩹֡;->ۧ:I

    .line 59
    iput-object p2, p0, Ll/ۛ᩹֡;->ܽ:[I

    return-void

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The packed-switch data contains too many elements. The maximum number of switch elements is 65535"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([BI)V
    .locals 5

    .line 63
    sget-object v0, Ll/᩻᩶֡;->ۗܿ:Ll/᩻᩶֡;

    invoke-direct {p0, v0}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 65
    aget-byte v0, p1, p2

    if-nez v0, :cond_2

    add-int/lit8 v0, p2, 0x1

    .line 69
    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, p2, 0x2

    .line 74
    invoke-static {v0, p1}, Ll/ۨܺܺ;->ܽ(I[B)I

    move-result v0

    add-int/lit8 v1, p2, 0x4

    .line 75
    invoke-static {v1, p1}, Ll/ۨܺܺ;->֫(I[B)I

    move-result v1

    iput v1, p0, Ll/ۛ᩹֡;->ۧ:I

    .line 76
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ۛ᩹֡;->ܽ:[I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 79
    iget-object v2, p0, Ll/ۛ᩹֡;->ܽ:[I

    add-int/lit8 v3, p2, 0x8

    mul-int/lit8 v4, v1, 0x4

    add-int/2addr v4, v3

    invoke-static {v4, p1}, Ll/ۨܺܺ;->֫(I[B)I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 71
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Invalid sub-opcode byte for a PackedSwitchData pseudo-instruction"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 67
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Invalid opcode byte for a PackedSwitchData pseudo-instruction"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۛ᩹֡;->ܽ:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    .line 47
    rem-int/lit8 p1, p1, 0x2

    add-int/2addr p1, v0

    return p1
.end method

.method public final ۡ()I
    .locals 1

    .line 114
    iget v0, p0, Ll/ۛ᩹֡;->ۧ:I

    return v0
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 106
    sget-object v0, Ll/᩻᩸֡;->ܶ֫:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 3

    const/4 p2, 0x4

    .line 84
    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->֫(I)V

    const/4 p2, 0x0

    .line 86
    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    const/4 v0, 0x1

    .line 87
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    .line 88
    iget-object v0, p0, Ll/ۛ᩹֡;->ܽ:[I

    array-length v1, v0

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 89
    iget v1, p0, Ll/ۛ᩹֡;->ۧ:I

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 91
    array-length v1, v0

    :goto_0
    if-ge p2, v1, :cond_0

    aget v2, v0, p2

    .line 92
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩷()[I
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۛ᩹֡;->ܽ:[I

    return-object v0
.end method
