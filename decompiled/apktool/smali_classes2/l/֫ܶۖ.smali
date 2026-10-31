.class public final Ll/֫ܶۖ;
.super Ljava/lang/Object;
.source "L5RL"


# instance fields
.field public ֫:Ll/ܰ۠ۖ;

.field public ۧ:Ll/۟۠ۖ;

.field public ܽ:I


# direct methods
.method public constructor <init>(ILl/۟۠ۖ;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Ll/֫ܶۖ;->ܽ:I

    .line 40
    iput-object p2, p0, Ll/֫ܶۖ;->ۧ:Ll/۟۠ۖ;

    return-void
.end method

.method public constructor <init>(ILl/ܰ۠ۖ;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Ll/֫ܶۖ;->ܽ:I

    .line 35
    iput-object p2, p0, Ll/֫ܶۖ;->֫:Ll/ܰ۠ۖ;

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

    .line 52
    const-class v2, Ll/֫ܶۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 54
    :cond_1
    check-cast p1, Ll/֫ܶۖ;

    iget-object v2, p1, Ll/֫ܶۖ;->ۧ:Ll/۟۠ۖ;

    iget-object v3, p1, Ll/֫ܶۖ;->֫:Ll/ܰ۠ۖ;

    .line 56
    iget v4, p0, Ll/֫ܶۖ;->ܽ:I

    iget p1, p1, Ll/֫ܶۖ;->ܽ:I

    if-eq v4, p1, :cond_2

    return v1

    .line 57
    :cond_2
    iget-object p1, p0, Ll/֫ܶۖ;->֫:Ll/ܰ۠ۖ;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    :goto_0
    return v1

    .line 58
    :cond_4
    iget-object p1, p0, Ll/֫ܶۖ;->ۧ:Ll/۟۠ۖ;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v2}, Ll/۟۠ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    if-nez v2, :cond_6

    return v0

    :cond_6
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 64
    iget v0, p0, Ll/֫ܶۖ;->ܽ:I

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    iget-object v2, p0, Ll/֫ܶۖ;->֫:Ll/ܰ۠ۖ;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 65
    iget-object v2, p0, Ll/֫ܶۖ;->ۧ:Ll/۟۠ۖ;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/۟۠ۖ;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫()Ll/ܰ۠ۖ;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/֫ܶۖ;->֫:Ll/ܰ۠ۖ;

    return-object v0
.end method

.method public final ۧ()Ll/۟۠ۖ;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/֫ܶۖ;->ۧ:Ll/۟۠ۖ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 70
    iget v0, p0, Ll/֫ܶۖ;->ܽ:I

    return v0
.end method
