.class public final Ll/ܺᩴ֨;
.super Ll/ۖᩴ֨;
.source "C7LA"


# instance fields
.field public final ֫:Ll/ܳ֡֨;


# direct methods
.method public constructor <init>(Ll/ܳ֡֨;)V
    .locals 0

    .line 333
    invoke-direct {p0}, Ll/ۖᩴ֨;-><init>()V

    .line 334
    iput-object p1, p0, Ll/ܺᩴ֨;->֫:Ll/ܳ֡֨;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 361
    instance-of v0, p1, Ll/ܺᩴ֨;

    if-eqz v0, :cond_0

    .line 360
    check-cast p1, Ll/ܺᩴ֨;

    iget-object v0, p0, Ll/ܺᩴ֨;->֫:Ll/ܳ֡֨;

    iget-object p1, p1, Ll/ܺᩴ֨;->֫:Ll/ܳ֡֨;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 367
    iget-object v0, p0, Ll/ܺᩴ֨;->֫:Ll/ܳ֡֨;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 349
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Uses["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܺᩴ֨;->֫:Ll/ܳ֡֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩳ᩹۠;)V
    .locals 0

    .line 354
    invoke-interface {p1, p0}, Ll/ᩳ᩹۠;->֫(Ll/ܺᩴ֨;)V

    return-void
.end method
