.class public final Ll/֫ۤ᩵;
.super Ll/ۧۤ᩵;
.source "2BMB"


# instance fields
.field public final ֫:Ll/ܳۤ᩵;


# direct methods
.method public constructor <init>(Ll/ܳۤ᩵;)V
    .locals 0

    .line 452
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 456
    iput-object p1, p0, Ll/֫ۤ᩵;->֫:Ll/ܳۤ᩵;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 457
    instance-of v0, p1, Ll/֫ۤ᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫ۤ᩵;

    iget-object p1, p1, Ll/֫ۤ᩵;->֫:Ll/ܳۤ᩵;

    .line 169
    iget-object v0, p0, Ll/֫ۤ᩵;->֫:Ll/ܳۤ᩵;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 458
    iget-object v0, p0, Ll/֫ۤ᩵;->֫:Ll/ܳۤ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 459
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Closed("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֫ۤ᩵;->֫:Ll/ܳۤ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
