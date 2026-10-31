.class public final Ll/ᩴۛۚ;
.super Ll/ۖۤۚ;
.source "K3OA"


# instance fields
.field public final ܽ:Ll/ܽۤۚ;


# direct methods
.method public constructor <init>(Ll/ܽۤۚ;Ll/ܺۤۚ;)V
    .locals 1

    .line 946
    sget-object v0, Ll/ۧۤۚ;->۠֫:Ll/ۧۤۚ;

    invoke-direct {p0, v0, p2}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    .line 947
    iput-object p1, p0, Ll/ᩴۛۚ;->ܽ:Ll/ܽۤۚ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 960
    :cond_0
    instance-of v1, p1, Ll/ᩴۛۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 961
    :cond_1
    invoke-super {p0, p1}, Ll/ۖۤۚ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    .line 962
    :cond_2
    check-cast p1, Ll/ᩴۛۚ;

    .line 963
    iget-object v1, p0, Ll/ᩴۛۚ;->ܽ:Ll/ܽۤۚ;

    iget-object p1, p1, Ll/ᩴۛۚ;->ܽ:Ll/ܽۤۚ;

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 977
    invoke-super {p0}, Ll/ۖۤۚ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 978
    iget-object v1, p0, Ll/ᩴۛۚ;->ܽ:Ll/ܽۤۚ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 952
    invoke-super {p0, p1}, Ll/ۖۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 953
    iget-object v0, p0, Ll/ᩴۛۚ;->ܽ:Ll/ܽۤۚ;

    invoke-virtual {v0}, Ll/ܽۤۚ;->ۧ()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 954
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    invoke-virtual {v0, p1}, Ll/ܺۤۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 969
    :cond_0
    instance-of v1, p1, Ll/ᩴۛۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 970
    :cond_1
    invoke-super {p0, p1}, Ll/ۖۤۚ;->֫(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    .line 971
    :cond_2
    check-cast p1, Ll/ᩴۛۚ;

    .line 972
    iget-object v1, p0, Ll/ᩴۛۚ;->ܽ:Ll/ܽۤۚ;

    iget-object p1, p1, Ll/ᩴۛۚ;->ܽ:Ll/ܽۤۚ;

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method
