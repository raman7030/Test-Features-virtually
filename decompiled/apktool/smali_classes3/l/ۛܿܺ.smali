.class public final Ll/ۛܿܺ;
.super Ll/֨ܳܺ;
.source "0BC1"


# instance fields
.field public ܿ:[Ll/ᩴܳܺ;


# direct methods
.method public constructor <init>(Ll/ۤۡܺ;Ll/᩶ۡܺ;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Ll/֨ܳܺ;-><init>(Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    .line 48
    invoke-virtual {p2}, Ll/ܿᩴܺ;->size()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, Ll/ۛܿܺ;->ܿ:[Ll/ᩴܳܺ;

    return-void

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "registers.size() == 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۖ()V
    .locals 8

    .line 88
    iget-object v0, p0, Ll/ۛܿܺ;->ܿ:[Ll/ᩴܳܺ;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 92
    :cond_0
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 95
    new-array v2, v1, [Ll/ᩴܳܺ;

    iput-object v2, p0, Ll/ۛܿܺ;->ܿ:[Ll/ᩴܳܺ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 98
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    .line 99
    iget-object v5, p0, Ll/ۛܿܺ;->ܿ:[Ll/ᩴܳܺ;

    .line 154
    sget-object v6, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    .line 155
    invoke-virtual {v4}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v7

    invoke-static {v3, v7}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v7

    .line 154
    invoke-static {v6, v7, v4}, Ll/ۙܿܺ;->֫(Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)Ll/ᩴܳܺ;

    move-result-object v6

    .line 99
    aput-object v6, v5, v2

    .line 100
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ۧ()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;
    .locals 2

    .line 109
    new-instance v0, Ll/ۛܿܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ۛܿܺ;-><init>(Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    return-object v0
.end method

.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 4

    .line 76
    invoke-direct {p0}, Ll/ۛܿܺ;->ۖ()V

    .line 78
    iget-object v0, p0, Ll/ۛܿܺ;->ܿ:[Ll/ᩴܳܺ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 79
    invoke-virtual {v3, p1}, Ll/ۤܿܺ;->֫(Ll/ᩳᩴܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()I
    .locals 5

    .line 62
    invoke-direct {p0}, Ll/ۛܿܺ;->ۖ()V

    .line 64
    iget-object v0, p0, Ll/ۛܿܺ;->ܿ:[Ll/ᩴܳܺ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    .line 65
    invoke-virtual {v4}, Ll/ۤܿܺ;->ۧ()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 8

    .line 125
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 127
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x64

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 130
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v5

    .line 154
    sget-object v6, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    .line 155
    invoke-virtual {v5}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v7

    invoke-static {v4, v7}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v7

    .line 154
    invoke-static {v6, v7, v5}, Ll/ۙܿܺ;->֫(Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)Ll/ᩴܳܺ;

    move-result-object v6

    if-eqz v3, :cond_0

    const/16 v7, 0xa

    .line 134
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    :cond_0
    invoke-virtual {v6}, Ll/ۤܿܺ;->ܺ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    invoke-virtual {v5}, Ll/᩸ۡܺ;->ۧ()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 142
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
