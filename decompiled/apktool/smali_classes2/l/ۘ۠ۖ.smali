.class public final Ll/ۘ۠ۖ;
.super Ljava/lang/Object;
.source "W26L"


# static fields
.field public static final ᩻:Ll/ۘ۠ۖ;


# instance fields
.field public final ֫:[I

.field public final ۧ:I

.field public final ܳ:Ll/ᩴ۠ۖ;

.field public final ܽ:[I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 33
    new-instance v0, Ll/ۘ۠ۖ;

    const/16 v1, 0x1069

    const/16 v2, 0x1000

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ll/ۘ۠ۖ;-><init>(III)V

    .line 34
    new-instance v0, Ll/ۘ۠ۖ;

    const/16 v1, 0x409

    const/16 v2, 0x400

    invoke-direct {v0, v1, v2, v3}, Ll/ۘ۠ۖ;-><init>(III)V

    .line 35
    new-instance v0, Ll/ۘ۠ۖ;

    const/16 v1, 0x43

    const/16 v2, 0x40

    invoke-direct {v0, v1, v2, v3}, Ll/ۘ۠ۖ;-><init>(III)V

    .line 36
    new-instance v0, Ll/ۘ۠ۖ;

    const/16 v1, 0x13

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2, v3}, Ll/ۘ۠ۖ;-><init>(III)V

    .line 37
    new-instance v0, Ll/ۘ۠ۖ;

    const/4 v1, 0x0

    const/16 v2, 0x11d

    const/16 v4, 0x100

    invoke-direct {v0, v2, v4, v1}, Ll/ۘ۠ۖ;-><init>(III)V

    sput-object v0, Ll/ۘ۠ۖ;->᩻:Ll/ۘ۠ۖ;

    .line 38
    new-instance v0, Ll/ۘ۠ۖ;

    const/16 v1, 0x12d

    invoke-direct {v0, v1, v4, v3}, Ll/ۘ۠ۖ;-><init>(III)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 4

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput p1, p0, Ll/ۘ۠ۖ;->ᩳ:I

    .line 63
    iput p2, p0, Ll/ۘ۠ۖ;->ܿ:I

    .line 64
    iput p3, p0, Ll/ۘ۠ۖ;->ۧ:I

    .line 66
    new-array p3, p2, [I

    iput-object p3, p0, Ll/ۘ۠ۖ;->֫:[I

    .line 67
    new-array p3, p2, [I

    iput-object p3, p0, Ll/ۘ۠ۖ;->ܽ:[I

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    :goto_0
    if-ge v1, p2, :cond_1

    .line 70
    iget-object v3, p0, Ll/ۘ۠ۖ;->֫:[I

    aput v2, v3, v1

    mul-int/lit8 v2, v2, 0x2

    if-lt v2, p2, :cond_0

    xor-int/2addr v2, p1

    add-int/lit8 v3, p2, -0x1

    and-int/2addr v2, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_1
    add-int/lit8 v1, p2, -0x1

    if-ge p1, v1, :cond_2

    .line 78
    iget-object v1, p0, Ll/ۘ۠ۖ;->ܽ:[I

    iget-object v2, p0, Ll/ۘ۠ۖ;->֫:[I

    aget v2, v2, p1

    aput p1, v1, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Ll/ᩴ۠ۖ;

    filled-new-array {v0}, [I

    move-result-object p2

    invoke-direct {p1, p0, p2}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    iput-object p1, p0, Ll/ۘ۠ۖ;->ܳ:Ll/ᩴ۠ۖ;

    .line 82
    new-instance p1, Ll/ᩴ۠ۖ;

    filled-new-array {p3}, [I

    move-result-object p2

    invoke-direct {p1, p0, p2}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GF(0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۘ۠ۖ;->ᩳ:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۘ۠ۖ;->ܿ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 159
    iget v0, p0, Ll/ۘ۠ۖ;->ۧ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 121
    iget-object v0, p0, Ll/ۘ۠ۖ;->֫:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(II)Ll/ᩴ۠ۖ;
    .locals 1

    if-ltz p1, :cond_1

    if-nez p2, :cond_0

    .line 101
    iget-object p1, p0, Ll/ۘ۠ۖ;->ܳ:Ll/ᩴ۠ۖ;

    return-object p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 103
    new-array p1, p1, [I

    const/4 v0, 0x0

    .line 104
    aput p2, p1, v0

    .line 105
    new-instance p2, Ll/ᩴ۠ۖ;

    invoke-direct {p2, p0, p1}, Ll/ᩴ۠ۖ;-><init>(Ll/ۘ۠ۖ;[I)V

    return-object p2

    .line 98
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۧ(I)I
    .locals 1

    if-eqz p1, :cond_0

    .line 141
    iget-object v0, p0, Ll/ۘ۠ۖ;->ܽ:[I

    aget p1, v0, p1

    iget v0, p0, Ll/ۘ۠ۖ;->ܿ:I

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    iget-object p1, p0, Ll/ۘ۠ۖ;->֫:[I

    aget p1, p1, v0

    return p1

    .line 139
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ۧ(II)I
    .locals 1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Ll/ۘ۠ۖ;->ܽ:[I

    aget p1, v0, p1

    aget p2, v0, p2

    add-int/2addr p1, p2

    iget p2, p0, Ll/ۘ۠ۖ;->ܿ:I

    add-int/lit8 p2, p2, -0x1

    rem-int/2addr p1, p2

    iget-object p2, p0, Ll/ۘ۠ۖ;->֫:[I

    aget p1, p2, p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ll/ᩴ۠ۖ;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۘ۠ۖ;->ܳ:Ll/ᩴ۠ۖ;

    return-object v0
.end method

.method public final ܽ(I)I
    .locals 1

    if-eqz p1, :cond_0

    .line 131
    iget-object v0, p0, Ll/ۘ۠ۖ;->ܽ:[I

    aget p1, v0, p1

    return p1

    .line 129
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
