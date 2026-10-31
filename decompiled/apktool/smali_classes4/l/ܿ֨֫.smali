.class public final Ll/ܿ֨֫;
.super Ljava/lang/Object;
.source "R3P1"


# static fields
.field public static final ܽ:Ll/ܿ֨֫;


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Ll/ܿ֨֫;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Ll/ܿ֨֫;-><init>(II)V

    sput-object v0, Ll/ܿ֨֫;->ܽ:Ll/ܿ֨֫;

    .line 33
    new-instance v0, Ll/ܿ֨֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/ܿ֨֫;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-ltz p1, :cond_1

    :cond_0
    if-eq p2, v0, :cond_2

    if-ltz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 46
    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 49
    iput p1, p0, Ll/ܿ֨֫;->ۧ:I

    .line 50
    iput p2, p0, Ll/ܿ֨֫;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    .line 71
    :cond_1
    instance-of v2, p1, Ll/ܿ֨֫;

    if-eqz v2, :cond_2

    .line 72
    check-cast p1, Ll/ܿ֨֫;

    .line 73
    iget v2, p0, Ll/ܿ֨֫;->ۧ:I

    iget v3, p1, Ll/ܿ֨֫;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ܿ֨֫;->֫:I

    iget p1, p1, Ll/ܿ֨֫;->֫:I

    if-ne v2, p1, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 86
    iget v0, p0, Ll/ܿ֨֫;->ۧ:I

    shl-int/lit8 v1, v0, 0x10

    ushr-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v1

    iget v1, p0, Ll/ܿ֨֫;->֫:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ܿ֨֫;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܿ֨֫;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 60
    iget v0, p0, Ll/ܿ֨֫;->֫:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ܿ֨֫;->ۧ:I

    return v0
.end method
