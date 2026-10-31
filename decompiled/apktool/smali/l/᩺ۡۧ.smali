.class public final Ll/᩺ۡۧ;
.super Ll/ܳܺۧ;
.source "Q8R9"


# instance fields
.field public final ۧ:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Ll/ܳܺۧ;-><init>(Ljava/lang/String;)V

    .line 30
    iput-object p2, p0, Ll/᩺ۡۧ;->ۧ:[B

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

    .line 38
    const-class v2, Ll/᩺ۡۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 41
    :cond_1
    check-cast p1, Ll/᩺ۡۧ;

    .line 42
    iget-object v2, p0, Ll/ܳܺۧ;->֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳܺۧ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩺ۡۧ;->ۧ:[B

    iget-object p1, p1, Ll/᩺ۡۧ;->ۧ:[B

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 48
    iget-object v0, p0, Ll/ܳܺۧ;->֫:Ljava/lang/String;

    const/16 v1, 0x1f

    const/16 v2, 0x20f

    .line 0
    invoke-static {v2, v1, v0}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 49
    iget-object v1, p0, Ll/᩺ۡۧ;->ۧ:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
