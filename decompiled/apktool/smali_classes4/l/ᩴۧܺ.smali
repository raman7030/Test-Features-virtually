.class public final Ll/ᩴۧܺ;
.super Ljava/lang/Object;
.source "IAUY"

# interfaces
.implements Ljava/lang/reflect/ParameterizedType;


# instance fields
.field public final ᩶:Ljava/lang/reflect/Type;

.field public final ᩸:[Ljava/lang/reflect/Type;

.field public final ᩹:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/ᩴۧܺ;->᩸:[Ljava/lang/reflect/Type;

    .line 15
    iput-object p2, p0, Ll/ᩴۧܺ;->᩹:Ljava/lang/reflect/Type;

    .line 16
    iput-object p3, p0, Ll/ᩴۧܺ;->᩶:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 34
    const-class v2, Ll/ᩴۧܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 36
    :cond_1
    check-cast p1, Ll/ᩴۧܺ;

    iget-object v2, p1, Ll/ᩴۧܺ;->᩶:Ljava/lang/reflect/Type;

    iget-object v3, p1, Ll/ᩴۧܺ;->᩹:Ljava/lang/reflect/Type;

    .line 39
    iget-object v4, p0, Ll/ᩴۧܺ;->᩸:[Ljava/lang/reflect/Type;

    iget-object p1, p1, Ll/ᩴۧܺ;->᩸:[Ljava/lang/reflect/Type;

    invoke-static {v4, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    .line 40
    :cond_2
    iget-object p1, p0, Ll/ᩴۧܺ;->᩹:Ljava/lang/reflect/Type;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    :goto_0
    return v1

    .line 41
    :cond_4
    iget-object p1, p0, Ll/ᩴۧܺ;->᩶:Ljava/lang/reflect/Type;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    if-nez v2, :cond_6

    return v0

    :cond_6
    :goto_1
    return v1
.end method

.method public final getActualTypeArguments()[Ljava/lang/reflect/Type;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ᩴۧܺ;->᩸:[Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final getOwnerType()Ljava/lang/reflect/Type;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ᩴۧܺ;->᩹:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final getRawType()Ljava/lang/reflect/Type;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ᩴۧܺ;->᩶:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 47
    iget-object v1, p0, Ll/ᩴۧܺ;->᩸:[Ljava/lang/reflect/Type;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 48
    iget-object v2, p0, Ll/ᩴۧܺ;->᩹:Ljava/lang/reflect/Type;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 49
    iget-object v2, p0, Ll/ᩴۧܺ;->᩶:Ljava/lang/reflect/Type;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_2
    add-int/2addr v1, v0

    return v1
.end method
