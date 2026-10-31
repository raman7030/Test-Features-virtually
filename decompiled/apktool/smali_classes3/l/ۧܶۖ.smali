.class public final Ll/ۧܶۖ;
.super Ljava/lang/Object;
.source "H5T9"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:[Ljava/lang/String;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p2, p0, Ll/ۧܶۖ;->ۧ:[Ljava/lang/String;

    .line 23
    iput-object p1, p0, Ll/ۧܶۖ;->ܽ:Ljava/lang/String;

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

    if-eqz p1, :cond_4

    .line 68
    const-class v2, Ll/ۧܶۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 70
    :cond_1
    check-cast p1, Ll/ۧܶۖ;

    iget-object v2, p1, Ll/ۧܶۖ;->ܽ:Ljava/lang/String;

    .line 73
    iget-object v3, p0, Ll/ۧܶۖ;->ۧ:[Ljava/lang/String;

    iget-object p1, p1, Ll/ۧܶۖ;->ۧ:[Ljava/lang/String;

    invoke-static {v3, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    .line 74
    :cond_2
    iget-object p1, p0, Ll/ۧܶۖ;->ܽ:Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-nez v2, :cond_4

    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 79
    iget-object v0, p0, Ll/ۧܶۖ;->ۧ:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 80
    iget-object v1, p0, Ll/ۧܶۖ;->ܽ:Ljava/lang/String;

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

.method public final ֫()Ljava/lang/String;
    .locals 5

    .line 52
    iget-object v0, p0, Ll/ۧܶۖ;->֫:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    iget-object v1, p0, Ll/ۧܶۖ;->ۧ:[Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 55
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 56
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const-string v1, ")"

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧܶۖ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۧܶۖ;->֫:Ljava/lang/String;

    .line 62
    :cond_1
    iget-object v0, p0, Ll/ۧܶۖ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()[Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۧܶۖ;->ۧ:[Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۧܶۖ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
