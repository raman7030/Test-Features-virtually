.class public final Ll/۬ܶ֡;
.super Ll/ۚۙ֡;
.source "M5FW"


# instance fields
.field public ۗ:I

.field public ۙ:Ll/۫᩶֡;

.field public ۬:Ll/ۨܶ֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    const/4 p1, 0x0

    .line 36
    iput p1, p0, Ll/۬ܶ֡;->ۗ:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 35
    check-cast p1, Ll/۬ܶ֡;

    invoke-virtual {p0, p1}, Ll/۬ܶ֡;->֫(Ll/۬ܶ֡;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 181
    const-class v2, Ll/۬ܶ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 185
    :cond_1
    check-cast p1, Ll/۬ܶ֡;

    .line 186
    iget-object v2, p0, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    iget-object v3, p1, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    iget-object p1, p1, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    invoke-virtual {v2, p1}, Ll/ܽۙ֡;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 171
    iget v0, p0, Ll/۬ܶ֡;->ۗ:I

    if-nez v0, :cond_0

    .line 163
    iget-object v0, p0, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    iget-byte v0, v0, Ll/ۨܶ֡;->᩸:B

    iput v0, p0, Ll/۬ܶ֡;->ۗ:I

    mul-int/lit8 v0, v0, 0x1f

    .line 164
    iget-object v1, p0, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    invoke-virtual {v1}, Ll/۫᩶֡;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ll/۬ܶ֡;->ۗ:I

    .line 173
    :cond_0
    iget v0, p0, Ll/۬ܶ֡;->ۗ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 103
    iget-object v0, p0, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Ll/۫᩶֡;->֫(I)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/۬ܶ֡;)I
    .locals 2

    .line 138
    iget-object v0, p0, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    iget-byte v0, v0, Ll/ۨܶ֡;->᩸:B

    iget-object v1, p1, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    iget-byte v1, v1, Ll/ۨܶ֡;->᩸:B

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 140
    iget-object v0, p0, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    iget-object p1, p1, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    invoke-virtual {v0, p1}, Ll/ܽۙ֡;->֫(Ll/ܽۙ֡;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "annotation_item @0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    iget v1, p0, Ll/ۚۙ֡;->᩶:I

    .line 0
    invoke-static {v0, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶֡;)Ll/۬ܶ֡;
    .locals 10

    .line 82
    iget-object v0, p0, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    iget-object v1, p0, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    .line 115
    new-instance v2, Ll/۫᩶֡;

    .line 116
    iget-object v3, v1, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move-object v3, v4

    goto :goto_0

    .line 118
    :cond_0
    invoke-virtual {v3}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v3

    .line 116
    invoke-static {v3, p1}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object v3

    .line 86
    :goto_0
    iget-object v5, v1, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    const/4 v6, 0x0

    if-nez v5, :cond_1

    goto :goto_2

    .line 89
    :cond_1
    array-length v4, v5

    new-array v7, v4, [Ll/ۨۙ֡;

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v4, :cond_2

    .line 91
    aget-object v9, v5, v8

    .line 93
    invoke-virtual {v9}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v9

    .line 91
    invoke-static {v9, p1}, Ll/ۨۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/ۨۙ֡;

    move-result-object v9

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    move-object v4, v7

    .line 121
    :goto_2
    invoke-virtual {v1, p1}, Ll/۫᩶֡;->֫(Ll/ۗ᩶֡;)[Ll/ܽۙ֡;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Ll/۫᩶֡;-><init>(Ll/᩺ۙ֡;[Ll/ۨۙ֡;[Ll/ܽۙ֡;)V

    .line 76
    new-instance v1, Ll/۬ܶ֡;

    .line 59
    invoke-direct {v1, p1}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    .line 36
    iput v6, v1, Ll/۬ܶ֡;->ۗ:I

    .line 60
    iput-object v0, v1, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    .line 61
    iput-object v2, v1, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    .line 77
    iget-object p1, p1, Ll/ۗ᩶֡;->ᩳ:Ll/ۗۙ֡;

    invoke-virtual {p1, v1}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/۬ܶ֡;

    return-object p1
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 1

    .line 115
    iget-object v0, p0, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    iget-byte v0, v0, Ll/ۨܶ֡;->᩸:B

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    .line 116
    iget-object v0, p0, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    invoke-virtual {v0, p1}, Ll/۫᩶֡;->֫(Ll/֫ۗ֡;)V

    return-void
.end method

.method public final ֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
    .locals 1

    .line 95
    invoke-virtual {p1}, Ll/ۧۗ֡;->ۧ()B

    move-result p2

    invoke-static {p2}, Ll/ۨܶ֡;->֫(B)Ll/ۨܶ֡;

    move-result-object p2

    iput-object p2, p0, Ll/۬ܶ֡;->۬:Ll/ۨܶ֡;

    .line 96
    new-instance p2, Ll/۫᩶֡;

    iget-object v0, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    invoke-direct {p2, v0, p1}, Ll/۫᩶֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V

    iput-object p2, p0, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    return-void
.end method

.method public final ᩻()Ll/۫᩶֡;
    .locals 1

    .line 156
    iget-object v0, p0, Ll/۬ܶ֡;->ۙ:Ll/۫᩶֡;

    return-object v0
.end method
