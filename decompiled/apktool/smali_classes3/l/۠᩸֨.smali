.class public final Ll/۠᩸֨;
.super Ljava/lang/Object;
.source "X43L"


# instance fields
.field public final ֫:Ll/ۙ֨֨;

.field public final ۧ:Ll/ۙ֨֨;

.field public final synthetic ܽ:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۛ᩸֨;)V
    .locals 0

    .line 3840
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/۠᩸֨;->ܽ:Ll/ۛ᩸֨;

    .line 3841
    iput-object p1, p0, Ll/۠᩸֨;->֫:Ll/ۙ֨֨;

    .line 3842
    iput-object p2, p0, Ll/۠᩸֨;->ۧ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 3852
    instance-of v0, p1, Ll/۠᩸֨;

    if-eqz v0, :cond_0

    .line 3850
    check-cast p1, Ll/۠᩸֨;

    iget-object v0, p0, Ll/۠᩸֨;->֫:Ll/ۙ֨֨;

    iget-object v1, p1, Ll/۠᩸֨;->֫:Ll/ۙ֨֨;

    .line 3851
    iget-object v2, p0, Ll/۠᩸֨;->ܽ:Ll/ۛ᩸֨;

    invoke-virtual {v2, v0, v1}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۠᩸֨;->ۧ:Ll/ۙ֨֨;

    iget-object p1, p1, Ll/۠᩸֨;->ۧ:Ll/ۙ֨֨;

    .line 3852
    invoke-virtual {v2, v0, p1}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

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

    .line 3846
    iget-object v0, p0, Ll/۠᩸֨;->֫:Ll/ۙ֨֨;

    invoke-static {v0}, Ll/ۛ᩸֨;->ۤ(Ll/ۙ֨֨;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x7f

    iget-object v1, p0, Ll/۠᩸֨;->ۧ:Ll/ۙ֨֨;

    invoke-static {v1}, Ll/ۛ᩸֨;->ۤ(Ll/ۙ֨֨;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
