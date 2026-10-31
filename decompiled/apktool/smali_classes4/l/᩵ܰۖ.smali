.class public final Ll/᩵ܰۖ;
.super Ljava/lang/Object;
.source "S9I7"


# instance fields
.field public ֫:Ll/ۘܰۖ;

.field public ۧ:Ll/ᩴܰۖ;

.field public ܽ:Ll/ۖܰۖ;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۘܰۖ;Ll/ᩴܰۖ;Ll/ۖܰۖ;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Ll/᩵ܰۖ;->֫:Ll/ۘܰۖ;

    .line 84
    iput-object p2, p0, Ll/᩵ܰۖ;->ۧ:Ll/ᩴܰۖ;

    const/16 p1, 0x1db0

    .line 85
    iput p1, p0, Ll/᩵ܰۖ;->ᩳ:I

    .line 86
    iput-object p3, p0, Ll/᩵ܰۖ;->ܽ:Ll/ۖܰۖ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 117
    const-class v2, Ll/᩵ܰۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 118
    :cond_1
    check-cast p1, Ll/᩵ܰۖ;

    .line 119
    iget v2, p0, Ll/᩵ܰۖ;->ᩳ:I

    iget v3, p1, Ll/᩵ܰۖ;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩵ܰۖ;->֫:Ll/ۘܰۖ;

    iget-object v3, p1, Ll/᩵ܰۖ;->֫:Ll/ۘܰۖ;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩵ܰۖ;->ۧ:Ll/ᩴܰۖ;

    iget-object v3, p1, Ll/᩵ܰۖ;->ۧ:Ll/ᩴܰۖ;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩵ܰۖ;->ܽ:Ll/ۖܰۖ;

    iget-object p1, p1, Ll/᩵ܰۖ;->ܽ:Ll/ۖܰۖ;

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 124
    iget-object v0, p0, Ll/᩵ܰۖ;->֫:Ll/ۘܰۖ;

    iget-object v1, p0, Ll/᩵ܰۖ;->ۧ:Ll/ᩴܰۖ;

    iget v2, p0, Ll/᩵ܰۖ;->ᩳ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Ll/᩵ܰۖ;->ܽ:Ll/ۖܰۖ;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 111
    iget-object v0, p0, Ll/᩵ܰۖ;->֫:Ll/ۘܰۖ;

    iget-object v1, p0, Ll/᩵ܰۖ;->ۧ:Ll/ᩴܰۖ;

    iget v2, p0, Ll/᩵ܰۖ;->ᩳ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Ll/᩵ܰۖ;->ܽ:Ll/ۖܰۖ;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    const-string v0, "WindowsVersion[%s, %s, %d, %s]"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۖܰۖ;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/᩵ܰۖ;->ܽ:Ll/ۖܰۖ;

    return-object v0
.end method

.method public final ֫(Ll/۫ܰۖ;)V
    .locals 4

    .line 93
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܿ()B

    move-result v0

    int-to-long v0, v0

    const-class v2, Ll/ۘܰۖ;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;

    move-result-object v0

    check-cast v0, Ll/ۘܰۖ;

    iput-object v0, p0, Ll/᩵ܰۖ;->֫:Ll/ۘܰۖ;

    .line 94
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܿ()B

    move-result v0

    int-to-long v0, v0

    const-class v2, Ll/ᩴܰۖ;

    invoke-static {v0, v1, v2, v3}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;

    move-result-object v0

    check-cast v0, Ll/ᩴܰۖ;

    iput-object v0, p0, Ll/᩵ܰۖ;->ۧ:Ll/ᩴܰۖ;

    .line 95
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    iput v0, p0, Ll/᩵ܰۖ;->ᩳ:I

    const/4 v0, 0x3

    .line 96
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 97
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܿ()B

    move-result p1

    int-to-long v0, p1

    const-class p1, Ll/ۖܰۖ;

    invoke-static {v0, v1, p1, v3}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;

    move-result-object p1

    check-cast p1, Ll/ۖܰۖ;

    iput-object p1, p0, Ll/᩵ܰۖ;->ܽ:Ll/ۖܰۖ;

    return-void
.end method

.method public final ۧ(Ll/۫ܰۖ;)V
    .locals 2

    .line 102
    iget-object v0, p0, Ll/᩵ܰۖ;->֫:Ll/ۘܰۖ;

    invoke-static {v0}, Ll/ۘܰۖ;->֫(Ll/ۘܰۖ;)J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 103
    iget-object v0, p0, Ll/᩵ܰۖ;->ۧ:Ll/ᩴܰۖ;

    invoke-static {v0}, Ll/ᩴܰۖ;->֫(Ll/ᩴܰۖ;)J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 104
    iget v0, p0, Ll/᩵ܰۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v0, 0x3

    new-array v1, v0, [B

    .line 105
    fill-array-data v1, :array_0

    .line 318
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->֫(I[B)V

    .line 106
    iget-object v0, p0, Ll/᩵ܰۖ;->ܽ:Ll/ۖܰۖ;

    invoke-virtual {v0}, Ll/ۖܰۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
    .end array-data
.end method
