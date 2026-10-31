.class public final Ll/᩷ۜܽ;
.super Ll/ۧܿܽ;
.source "C4LO"


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/᩷ܿܽ;

.field public final ᩹:[I


# direct methods
.method public constructor <init>(Ll/᩷ܿܽ;Ljava/lang/String;[I)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    iput-object p1, p0, Ll/᩷ۜܽ;->᩸:Ll/᩷ܿܽ;

    .line 20
    iput-object p2, p0, Ll/᩷ۜܽ;->᩶:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Ll/᩷ۜܽ;->᩹:[I

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

    .line 84
    const-class v2, Ll/᩷ۜܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 86
    :cond_1
    check-cast p1, Ll/᩷ۜܽ;

    .line 88
    iget-object v2, p0, Ll/᩷ۜܽ;->᩶:Ljava/lang/String;

    iget-object v3, p1, Ll/᩷ۜܽ;->᩶:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩷ۜܽ;->᩹:[I

    iget-object p1, p1, Ll/᩷ۜܽ;->᩹:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final getStyle()[I
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩷ۜܽ;->᩹:[I

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/᩷ۜܽ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ܰ֫()[Ll/᩸᩻ܽ;
    .locals 8

    .line 58
    iget-object v0, p0, Ll/᩷ۜܽ;->᩹:[I

    if-eqz v0, :cond_2

    array-length v1, v0

    rem-int/lit8 v1, v1, 0x3

    if-eqz v1, :cond_0

    goto :goto_1

    .line 61
    :cond_0
    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    new-array v2, v1, [Ll/᩸᩻ܽ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    mul-int/lit8 v4, v3, 0x3

    .line 65
    :try_start_0
    iget-object v5, p0, Ll/᩷ۜܽ;->᩸:Ll/᩷ܿܽ;

    aget v6, v0, v4

    .line 33
    invoke-interface {v5, v6}, Ll/۫᩻ܽ;->֫(I)Ll/ۗ᩻ܽ;

    move-result-object v5

    invoke-interface {v5}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    .line 66
    aget v6, v0, v6

    add-int/lit8 v4, v4, 0x2

    .line 67
    aget v4, v0, v4

    .line 68
    new-instance v7, Ll/᩸᩻ܽ;

    add-int/lit8 v4, v4, 0x1

    invoke-direct {v7, v5, v6, v4}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    aput-object v7, v2, v3
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {p0, v2}, Ll/ۧܿܽ;->֫([Ll/᩸᩻ܽ;)[Ll/᩸᩻ܽ;

    move-result-object v0

    return-object v0

    :catch_0
    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩶֫()[Ll/᩸᩻ܽ;
    .locals 8

    .line 40
    iget-object v0, p0, Ll/᩷ۜܽ;->᩹:[I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 43
    :cond_0
    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    new-array v2, v1, [Ll/᩸᩻ܽ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    mul-int/lit8 v4, v3, 0x3

    .line 46
    iget-object v5, p0, Ll/᩷ۜܽ;->᩸:Ll/᩷ܿܽ;

    aget v6, v0, v4

    invoke-virtual {v5, v6}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    .line 47
    aget v6, v0, v6

    add-int/lit8 v4, v4, 0x2

    .line 48
    aget v4, v0, v4

    .line 49
    new-instance v7, Ll/᩸᩻ܽ;

    add-int/lit8 v4, v4, 0x1

    invoke-direct {v7, v5, v6, v4}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    aput-object v7, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public final ᩺֫()Z
    .locals 1

    .line 78
    iget-object v0, p0, Ll/᩷ۜܽ;->᩹:[I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
