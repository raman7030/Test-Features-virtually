.class public final Ll/۟ۡۧ;
.super Ll/ܳܺۧ;
.source "68N9"


# instance fields
.field public final ۧ:[Ljava/lang/String;

.field public final ܳ:[Ll/ܳܺۧ;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Ll/ܳܺۧ;)V
    .locals 1

    const-string v0, "CTOC"

    .line 41
    invoke-direct {p0, v0}, Ll/ܳܺۧ;-><init>(Ljava/lang/String;)V

    .line 42
    iput-object p1, p0, Ll/۟ۡۧ;->ܽ:Ljava/lang/String;

    .line 43
    iput-boolean p2, p0, Ll/۟ۡۧ;->ܿ:Z

    .line 44
    iput-boolean p3, p0, Ll/۟ۡۧ;->ᩳ:Z

    .line 45
    iput-object p4, p0, Ll/۟ۡۧ;->ۧ:[Ljava/lang/String;

    .line 46
    iput-object p5, p0, Ll/۟ۡۧ;->ܳ:[Ll/ܳܺۧ;

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

    .line 64
    const-class v2, Ll/۟ۡۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 67
    :cond_1
    check-cast p1, Ll/۟ۡۧ;

    .line 68
    iget-boolean v2, p0, Ll/۟ۡۧ;->ܿ:Z

    iget-boolean v3, p1, Ll/۟ۡۧ;->ܿ:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/۟ۡۧ;->ᩳ:Z

    iget-boolean v3, p1, Ll/۟ۡۧ;->ᩳ:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/۟ۡۧ;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/۟ۡۧ;->ܽ:Ljava/lang/String;

    .line 70
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/۟ۡۧ;->ۧ:[Ljava/lang/String;

    iget-object v3, p1, Ll/۟ۡۧ;->ۧ:[Ljava/lang/String;

    .line 71
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/۟ۡۧ;->ܳ:[Ll/ܳܺۧ;

    iget-object p1, p1, Ll/۟ۡۧ;->ܳ:[Ll/ܳܺۧ;

    .line 72
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 78
    iget-boolean v0, p0, Ll/۟ۡۧ;->ܿ:Z

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 79
    iget-boolean v1, p0, Ll/۟ۡۧ;->ᩳ:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 80
    iget-object v1, p0, Ll/۟ۡۧ;->ܽ:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
