.class public final Ll/ۛᩳܿ;
.super Ll/۬ᩴܺ;
.source "J7R3"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ll/ۤۤ;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۤۤ;)V
    .locals 0

    .line 405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛᩳܿ;->ᩳ:Ljava/lang/String;

    iput-object p2, p0, Ll/ۛᩳܿ;->ܿ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۛᩳܿ;->֫:Ljava/lang/String;

    iput-object p4, p0, Ll/ۛᩳܿ;->ۧ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۛᩳܿ;->ܽ:Ll/ۤۤ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛᩳܿ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛᩳܿ;->֫:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۛᩳܿ;)Ll/ۤۤ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛᩳܿ;->ܽ:Ll/ۤۤ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۛᩳܿ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛᩳܿ;->ᩳ:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 405
    instance-of v0, p1, Ll/ۛᩳܿ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۛᩳܿ;

    iget-object v0, p0, Ll/ۛᩳܿ;->ᩳ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۛᩳܿ;->ᩳ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛᩳܿ;->ܿ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۛᩳܿ;->ܿ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛᩳܿ;->֫:Ljava/lang/String;

    iget-object v1, p1, Ll/ۛᩳܿ;->֫:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛᩳܿ;->ۧ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۛᩳܿ;->ۧ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛᩳܿ;->ܽ:Ll/ۤۤ;

    iget-object p1, p1, Ll/ۛᩳܿ;->ܽ:Ll/ۤۤ;

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
    .locals 3

    .line 405
    iget-object v0, p0, Ll/ۛᩳܿ;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-object v2, p0, Ll/ۛᩳܿ;->ܿ:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ll/ۛᩳܿ;->֫:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ll/ۛᩳܿ;->ۧ:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 405
    iget-object v1, p0, Ll/ۛᩳܿ;->ܽ:Ll/ۤۤ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 412
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۛᩳܿ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛᩳܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 416
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۛᩳܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛᩳܿ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 420
    iget-object v0, p0, Ll/ۛᩳܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۛᩳܿ;->֫:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()Ll/ۤۤ;
    .locals 1

    .line 405
    iget-object v0, p0, Ll/ۛᩳܿ;->ܽ:Ll/ۤۤ;

    return-object v0
.end method
