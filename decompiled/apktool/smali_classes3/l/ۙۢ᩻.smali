.class public final Ll/ۙۢ᩻;
.super Ll/۬ᩴܺ;
.source "KAHM"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 419
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۢ᩻;->֫:Ljava/lang/String;

    iput p2, p0, Ll/ۙۢ᩻;->ۧ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 419
    instance-of v0, p1, Ll/ۙۢ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۙۢ᩻;

    iget v0, p0, Ll/ۙۢ᩻;->ۧ:I

    iget v1, p1, Ll/ۙۢ᩻;->ۧ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۙۢ᩻;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۙۢ᩻;->֫:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 419
    iget v0, p0, Ll/ۙۢ᩻;->ۧ:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۙۢ᩻;->֫:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 423
    iget-object v0, p0, Ll/ۙۢ᩻;->֫:Ljava/lang/String;

    iget v1, p0, Ll/ۙۢ᩻;->ۧ:I

    if-gez v1, :cond_0

    .line 424
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 426
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 419
    iget-object v0, p0, Ll/ۙۢ᩻;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 419
    iget v0, p0, Ll/ۙۢ᩻;->ۧ:I

    return v0
.end method
