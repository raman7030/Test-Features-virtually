.class public final Ll/᩹۠ۖ;
.super Ljava/lang/Object;
.source "2267"


# instance fields
.field public final ֫:[[B

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(II)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x1

    aput p1, v0, v1

    const/4 v1, 0x0

    aput p2, v0, v1

    .line 34
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    iput-object v0, p0, Ll/᩹۠ۖ;->֫:[[B

    .line 35
    iput p1, p0, Ll/᩹۠ۖ;->ܽ:I

    .line 36
    iput p2, p0, Ll/᩹۠ۖ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩹۠ۖ;->ܽ:I

    mul-int/lit8 v2, v1, 0x2

    iget v3, p0, Ll/᩹۠ۖ;->ۧ:I

    mul-int v2, v2, v3

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v3, :cond_3

    .line 80
    iget-object v4, p0, Ll/᩹۠ۖ;->֫:[[B

    aget-object v4, v4, v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v1, :cond_2

    .line 82
    aget-byte v6, v4, v5

    if-eqz v6, :cond_1

    const/4 v7, 0x1

    if-eq v6, v7, :cond_0

    const-string v6, "  "

    .line 90
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    const-string v6, " 1"

    .line 87
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const-string v6, " 0"

    .line 84
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    const/16 v4, 0xa

    .line 94
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 96
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(II)B
    .locals 1

    .line 48
    iget-object v0, p0, Ll/᩹۠ۖ;->֫:[[B

    aget-object p2, v0, p2

    aget-byte p1, p2, p1

    return p1
.end method

.method public final ֫()V
    .locals 5

    .line 71
    iget-object v0, p0, Ll/᩹۠ۖ;->֫:[[B

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    const/4 v4, -0x1

    .line 72
    invoke-static {v3, v4}, Ljava/util/Arrays;->fill([BB)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(III)V
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩹۠ۖ;->֫:[[B

    aget-object p2, v0, p2

    int-to-byte p3, p3

    aput-byte p3, p2, p1

    return-void
.end method

.method public final ֫(IIZ)V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩹۠ۖ;->֫:[[B

    aget-object p2, v0, p2

    int-to-byte p3, p3

    aput-byte p3, p2, p1

    return-void
.end method

.method public final ۧ()[[B
    .locals 1

    .line 55
    iget-object v0, p0, Ll/᩹۠ۖ;->֫:[[B

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 40
    iget v0, p0, Ll/᩹۠ۖ;->ۧ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 44
    iget v0, p0, Ll/᩹۠ۖ;->ܽ:I

    return v0
.end method
