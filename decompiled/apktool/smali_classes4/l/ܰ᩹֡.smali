.class public final Ll/ܰ᩹֡;
.super Ll/֫᩶֡;
.source "04TC"

# interfaces
.implements Ll/ܿ᩶֡;


# instance fields
.field public ۧ:[I

.field public ܽ:[I


# direct methods
.method public constructor <init>([BI)V
    .locals 6

    .line 71
    sget-object v0, Ll/᩻᩶֡;->ۗܿ:Ll/᩻᩶֡;

    invoke-direct {p0, v0}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 73
    aget-byte v0, p1, p2

    if-nez v0, :cond_2

    add-int/lit8 v0, p2, 0x1

    .line 77
    aget-byte v0, p1, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, p2, 0x2

    .line 82
    invoke-static {v0, p1}, Ll/ۨܺܺ;->ܽ(I[B)I

    move-result v0

    .line 83
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܰ᩹֡;->ۧ:[I

    .line 84
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܰ᩹֡;->ܽ:[I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 87
    iget-object v2, p0, Ll/ܰ᩹֡;->ۧ:[I

    add-int/lit8 v3, p2, 0x4

    mul-int/lit8 v4, v1, 0x4

    add-int v5, v3, v4

    invoke-static {v5, p1}, Ll/ۨܺܺ;->֫(I[B)I

    move-result v5

    aput v5, v2, v1

    .line 88
    iget-object v2, p0, Ll/ܰ᩹֡;->ܽ:[I

    mul-int/lit8 v5, v0, 0x4

    add-int/2addr v5, v3

    add-int/2addr v5, v4

    invoke-static {v5, p1}, Ll/ۨܺܺ;->֫(I[B)I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 79
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Invalid sub-opcode byte for a SparseSwitchData pseudo-instruction"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 75
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Invalid opcode byte for a SparseSwitchData pseudo-instruction"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([I[I)V
    .locals 2

    .line 51
    sget-object v0, Ll/᩻᩶֡;->ۗܿ:Ll/᩻᩶֡;

    invoke-direct {p0, v0}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 53
    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_2

    .line 57
    array-length v0, p2

    if-eqz v0, :cond_1

    .line 61
    array-length v0, p2

    const v1, 0xffff

    if-gt v0, v1, :cond_0

    .line 66
    iput-object p1, p0, Ll/ܰ᩹֡;->ۧ:[I

    .line 67
    iput-object p2, p0, Ll/ܰ᩹֡;->ܽ:[I

    return-void

    .line 62
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The sparse-switch data contains too many elements. The maximum number of switch elements is 65535"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The sparse-switch data must contain at least 1 key/target"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The number of keys and targets don\'t match"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܰ᩹֡;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ᩹֡;->ۧ:[I

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܰ᩹֡;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ᩹֡;->ܽ:[I

    return-object p0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ܰ᩹֡;->ܽ:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x2

    .line 47
    rem-int/lit8 p1, p1, 0x2

    add-int/2addr p1, v0

    return p1
.end method

.method public final ۡ()I
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ܰ᩹֡;->ܽ:[I

    array-length v0, v0

    return v0
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 126
    sget-object v0, Ll/᩻᩸֡;->᩸֫:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 4

    const/4 p2, 0x4

    .line 93
    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->֫(I)V

    const/4 p2, 0x0

    .line 95
    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    const/4 v0, 0x2

    .line 96
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    .line 97
    iget-object v0, p0, Ll/ܰ᩹֡;->ܽ:[I

    array-length v1, v0

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 99
    array-length v1, v0

    if-lez v1, :cond_1

    .line 100
    iget-object v1, p0, Ll/ܰ᩹֡;->ۧ:[I

    aget v2, v1, p2

    .line 102
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    const/4 v2, 0x1

    .line 104
    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_0

    .line 105
    aget v3, v1, v2

    .line 107
    invoke-virtual {p1, v3}, Ll/֫ۗ֡;->ܽ(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 110
    :cond_0
    array-length v1, v0

    :goto_1
    if-ge p2, v1, :cond_1

    aget v2, v0, p2

    .line 111
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ܺ()Ljava/util/Iterator;
    .locals 1

    .line 147
    new-instance v0, Ll/ۨ᩹֡;

    invoke-direct {v0, p0}, Ll/ۨ᩹֡;-><init>(Ll/ܰ᩹֡;)V

    return-object v0
.end method

.method public final ᩷()[I
    .locals 1

    .line 134
    iget-object v0, p0, Ll/ܰ᩹֡;->ܽ:[I

    return-object v0
.end method
