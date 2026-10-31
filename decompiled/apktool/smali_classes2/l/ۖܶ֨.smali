.class public final Ll/ۖܶ֨;
.super Ljava/lang/Object;
.source "X43L"


# instance fields
.field public ֫:Ll/ۘ֡֨;

.field public ۧ:Ll/ۙ֨֨;

.field public final synthetic ܽ:Ll/ۘܶ֨;


# direct methods
.method public constructor <init>(Ll/ۘܶ֨;Ll/ۙ֨֨;Ll/ۘ֡֨;)V
    .locals 0

    .line 3157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܶ֨;->ܽ:Ll/ۘܶ֨;

    .line 3158
    iput-object p2, p0, Ll/ۖܶ֨;->ۧ:Ll/ۙ֨֨;

    .line 3159
    iput-object p3, p0, Ll/ۖܶ֨;->֫:Ll/ۘ֡֨;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 3166
    instance-of v0, p1, Ll/ۖܶ֨;

    if-eqz v0, :cond_0

    .line 3164
    check-cast p1, Ll/ۖܶ֨;

    iget-object v0, p1, Ll/ۖܶ֨;->֫:Ll/ۘ֡֨;

    iget-object v1, p0, Ll/ۖܶ֨;->֫:Ll/ۘ֡֨;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۖܶ֨;->ܽ:Ll/ۘܶ֨;

    iget-object v0, v0, Ll/ۘܶ֨;->ۧ:Ll/ۛ᩸֨;

    iget-object v1, p0, Ll/ۖܶ֨;->ۧ:Ll/ۙ֨֨;

    iget-object p1, p1, Ll/ۖܶ֨;->ۧ:Ll/ۙ֨֨;

    .line 3166
    invoke-virtual {v0, v1, p1}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

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

    .line 3171
    iget-object v0, p0, Ll/ۖܶ֨;->ܽ:Ll/ۘܶ֨;

    iget-object v0, v0, Ll/ۘܶ֨;->ۧ:Ll/ۛ᩸֨;

    iget-object v0, p0, Ll/ۖܶ֨;->ۧ:Ll/ۙ֨֨;

    invoke-static {v0}, Ll/ۛ᩸֨;->ۤ(Ll/ۙ֨֨;)I

    move-result v0

    iget-object v1, p0, Ll/ۖܶ֨;->֫:Ll/ۘ֡֨;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    not-int v1, v1

    and-int/2addr v0, v1

    return v0
.end method
