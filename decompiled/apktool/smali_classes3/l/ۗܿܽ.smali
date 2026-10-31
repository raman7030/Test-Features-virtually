.class public final Ll/ۗܿܽ;
.super Ll/ۧܿܽ;
.source "255M"


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Z

.field public ᩶:[Ll/᩸᩻ܽ;

.field public ᩸:I

.field public final ᩹:Ll/۬ܿܽ;


# direct methods
.method public constructor <init>(Ll/۬ܿܽ;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 18
    invoke-direct {p0, p1, p2, v0, v1}, Ll/ۗܿܽ;-><init>(Ll/۬ܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;Z)V

    return-void
.end method

.method public constructor <init>(Ll/۬ܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;Z)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 15
    iput v0, p0, Ll/ۗܿܽ;->᩸:I

    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    iput-object p1, p0, Ll/ۗܿܽ;->᩹:Ll/۬ܿܽ;

    .line 29
    iput-object p2, p0, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    if-eqz p3, :cond_0

    if-eqz p4, :cond_0

    .line 32
    array-length p2, p3

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p2, :cond_0

    aget-object v0, p3, p4

    .line 33
    iget-object v0, v0, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/۬ܿܽ;->ᩳ(Ljava/lang/String;)Ll/ۗܿܽ;

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_0
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

    .line 112
    const-class v2, Ll/ۗܿܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 114
    :cond_1
    check-cast p1, Ll/ۗܿܽ;

    .line 116
    iget-object v2, p0, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    iget-object v3, p1, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final getStyle()[I
    .locals 7

    .line 75
    invoke-virtual {p0}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 101
    :cond_0
    iget-object v0, p0, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    invoke-virtual {p0, v0}, Ll/ۧܿܽ;->֫([Ll/᩸᩻ܽ;)[Ll/᩸᩻ܽ;

    move-result-object v0

    .line 77
    invoke-static {v0}, Ll/ۙ᩻ܽ;->ۧ([Ll/᩸᩻ܽ;)[Ll/᩸᩻ܽ;

    move-result-object v0

    .line 79
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x3

    new-array v1, v1, [I

    const/4 v2, 0x0

    .line 80
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    .line 81
    aget-object v3, v0, v2

    mul-int/lit8 v4, v2, 0x3

    .line 82
    iget-object v5, p0, Ll/ۗܿܽ;->᩹:Ll/۬ܿܽ;

    iget-object v6, v3, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ll/۬ܿܽ;->ܽ(Ljava/lang/String;)I

    move-result v5

    aput v5, v1, v4

    add-int/lit8 v5, v4, 0x1

    .line 83
    iget v6, v3, Ll/᩸᩻ܽ;->ۧ:I

    aput v6, v1, v5

    add-int/lit8 v4, v4, 0x2

    .line 84
    iget v3, v3, Ll/᩸᩻ܽ;->֫:I

    add-int/lit8 v3, v3, -0x1

    aput v3, v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 121
    iget-object v0, p0, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 3

    .line 56
    iget-object v0, p0, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    iget-object v1, p0, Ll/ۗܿܽ;->᩹:Ll/۬ܿܽ;

    if-nez v0, :cond_1

    .line 58
    iget-object v0, p0, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    iget-object v0, v1, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iput-object p1, p0, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    .line 61
    iget-object v0, v1, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    .line 65
    :cond_1
    iget-object v0, v1, Ll/۬ܿܽ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    iput-object p1, p0, Ll/ۗܿܽ;->ۗ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    .line 68
    iget-object v0, v1, Ll/۬ܿܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܰ֫()[Ll/᩸᩻ܽ;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    invoke-virtual {p0, v0}, Ll/ۧܿܽ;->֫([Ll/᩸᩻ܽ;)[Ll/᩸᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()I
    .locals 3

    .line 42
    iget v0, p0, Ll/ۗܿܽ;->᩸:I

    const/4 v1, -0x1

    iget-object v2, p0, Ll/ۗܿܽ;->᩹:Ll/۬ܿܽ;

    if-eq v0, v1, :cond_0

    .line 43
    invoke-virtual {v2, v0}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 44
    iget v0, p0, Ll/ۗܿܽ;->᩸:I

    return v0

    .line 46
    :cond_0
    invoke-virtual {v2, p0}, Ll/۬ܿܽ;->֫(Ll/ۗܿܽ;)I

    move-result v0

    iput v0, p0, Ll/ۗܿܽ;->᩸:I

    return v0
.end method

.method public final ᩶֫()[Ll/᩸᩻ܽ;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {v0}, [Ll/᩸᩻ܽ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸᩻ܽ;

    :cond_0
    return-object v0
.end method

.method public final ᩺֫()Z
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۗܿܽ;->᩶:[Ll/᩸᩻ܽ;

    if-eqz v0, :cond_0

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
