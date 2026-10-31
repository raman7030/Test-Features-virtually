.class public final Ll/ۧܽۘ;
.super Ljava/lang/Object;
.source "N9IR"

# interfaces
.implements Ll/ܽܽۘ;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۧܽۘ;->֫:Ljava/lang/String;

    .line 24
    iput p2, p0, Ll/ۧܽۘ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 38
    const-class v1, Ll/ۧܽۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 40
    :cond_1
    check-cast p1, Ll/ۧܽۘ;

    .line 42
    iget v1, p0, Ll/ۧܽۘ;->ۧ:I

    iget v2, p1, Ll/ۧܽۘ;->ۧ:I

    if-eq v1, v2, :cond_2

    return v0

    .line 43
    :cond_2
    iget-object v0, p0, Ll/ۧܽۘ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۧܽۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 48
    iget-object v0, p0, Ll/ۧܽۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 49
    iget v1, p0, Ll/ۧܽۘ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ۧܽۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 32
    iget v0, p0, Ll/ۧܽۘ;->ۧ:I

    return v0
.end method
