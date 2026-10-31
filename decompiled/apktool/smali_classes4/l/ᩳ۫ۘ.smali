.class public final Ll/ᩳ۫ۘ;
.super Ljava/lang/Object;
.source "G67D"

# interfaces
.implements Ljava/util/Map$Entry;
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ll/ܳ۫ۘ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۫ۘ;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 41
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ۫ۘ;->᩸:Ljava/lang/String;

    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_0

    .line 43
    iput-object p2, p0, Ll/ᩳ۫ۘ;->᩶:Ljava/lang/String;

    .line 44
    iput-object p3, p0, Ll/ᩳ۫ۘ;->᩹:Ll/ܳ۫ۘ;

    return-void

    .line 102
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "String must not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Object must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 203
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ۫ۘ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 205
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 187
    const-class v2, Ll/ᩳ۫ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 188
    :cond_1
    check-cast p1, Ll/ᩳ۫ۘ;

    iget-object v2, p1, Ll/ᩳ۫ۘ;->᩸:Ljava/lang/String;

    .line 189
    iget-object v3, p0, Ll/ᩳ۫ۘ;->᩸:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 190
    :cond_3
    iget-object v2, p0, Ll/ᩳ۫ۘ;->᩶:Ljava/lang/String;

    iget-object p1, p1, Ll/ᩳ۫ۘ;->᩶:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    if-nez p1, :cond_5

    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ᩳ۫ۘ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ᩳ۫ۘ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ᩳ۫ۘ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ᩳ۫ۘ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 195
    iget-object v1, p0, Ll/ᩳ۫ۘ;->᩸:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 196
    iget-object v2, p0, Ll/ᩳ۫ۘ;->᩶:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 10
    check-cast p1, Ljava/lang/String;

    .line 91
    iget-object v0, p0, Ll/ᩳ۫ۘ;->᩹:Ll/ܳ۫ۘ;

    iget-object v1, p0, Ll/ᩳ۫ۘ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ܳ۫ۘ;->֫(Ljava/lang/String;)I

    move-result v2

    const-string v3, ""

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    iget-object v5, v0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    aget-object v2, v5, v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v2

    .line 90
    :goto_0
    invoke-virtual {v0, v1}, Ll/ܳ۫ۘ;->֫(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v4, :cond_2

    .line 92
    iget-object v0, v0, Ll/ܳ۫ۘ;->᩶:[Ljava/lang/String;

    aput-object p1, v0, v1

    .line 94
    :cond_2
    iput-object p1, p0, Ll/ᩳ۫ۘ;->᩶:Ljava/lang/String;

    return-object v3
.end method
