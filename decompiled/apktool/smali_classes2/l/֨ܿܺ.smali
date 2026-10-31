.class public final Ll/֨ܿܺ;
.super Ljava/lang/Object;
.source "VBEJ"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:Ll/ۚܿܺ;


# direct methods
.method public constructor <init>(IILl/ۚܿܺ;)V
    .locals 1

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_2

    if-le p2, p1, :cond_1

    .line 131
    invoke-virtual {p3}, Ll/ᩴᩴܺ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    iput p1, p0, Ll/֨ܿܺ;->᩶:I

    .line 136
    iput p2, p0, Ll/֨ܿܺ;->᩸:I

    .line 137
    iput-object p3, p0, Ll/֨ܿܺ;->᩹:Ll/ۚܿܺ;

    return-void

    .line 132
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "handlers.isMutable()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 128
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end <= start"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 124
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "start < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 99
    check-cast p1, Ll/֨ܿܺ;

    invoke-virtual {p0, p1}, Ll/֨ܿܺ;->֫(Ll/֨ܿܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 155
    instance-of v0, p1, Ll/֨ܿܺ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 156
    check-cast p1, Ll/֨ܿܺ;

    invoke-virtual {p0, p1}, Ll/֨ܿܺ;->֫(Ll/֨ܿܺ;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 145
    iget v0, p0, Ll/֨ܿܺ;->᩶:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/֨ܿܺ;->᩸:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 146
    iget-object v1, p0, Ll/֨ܿܺ;->᩹:Ll/ۚܿܺ;

    invoke-virtual {v1}, Ll/ܿᩴܺ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()I
    .locals 1

    .line 197
    iget v0, p0, Ll/֨ܿܺ;->᩸:I

    return v0
.end method

.method public final ֫(Ll/֨ܿܺ;)I
    .locals 4

    .line 167
    iget v0, p1, Ll/֨ܿܺ;->᩶:I

    const/4 v1, -0x1

    iget v2, p0, Ll/֨ܿܺ;->᩶:I

    if-ge v2, v0, :cond_0

    return v1

    :cond_0
    const/4 v3, 0x1

    if-le v2, v0, :cond_1

    return v3

    .line 173
    :cond_1
    iget v0, p1, Ll/֨ܿܺ;->᩸:I

    iget v2, p0, Ll/֨ܿܺ;->᩸:I

    if-ge v2, v0, :cond_2

    return v1

    :cond_2
    if-le v2, v0, :cond_3

    return v3

    .line 179
    :cond_3
    iget-object v0, p0, Ll/֨ܿܺ;->᩹:Ll/ۚܿܺ;

    iget-object p1, p1, Ll/֨ܿܺ;->᩹:Ll/ۚܿܺ;

    invoke-virtual {v0, p1}, Ll/ۚܿܺ;->֫(Ll/ۚܿܺ;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ll/ۚܿܺ;
    .locals 1

    .line 206
    iget-object v0, p0, Ll/֨ܿܺ;->᩹:Ll/ۚܿܺ;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 188
    iget v0, p0, Ll/֨ܿܺ;->᩶:I

    return v0
.end method
