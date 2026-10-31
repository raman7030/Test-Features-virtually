.class public final Ll/᩹ۛ֨;
.super Ljava/lang/Object;
.source "M43N"


# instance fields
.field public ֫:Ll/ۙ֨֨;

.field public ۧ:Ll/ۙ֨֨;

.field public ܽ:Ll/ۗۛ֨;

.field public final synthetic ᩳ:Ll/ۜۨ֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;Ll/ۗۛ֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 1197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۛ֨;->ᩳ:Ll/ۜۨ֨;

    .line 1198
    iput-object p2, p0, Ll/᩹ۛ֨;->ܽ:Ll/ۗۛ֨;

    .line 1199
    iput-object p3, p0, Ll/᩹ۛ֨;->֫:Ll/ۙ֨֨;

    .line 1200
    iput-object p4, p0, Ll/᩹ۛ֨;->ۧ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1208
    instance-of v0, p1, Ll/᩹ۛ֨;

    if-eqz v0, :cond_0

    .line 1205
    check-cast p1, Ll/᩹ۛ֨;

    iget-object v0, p0, Ll/᩹ۛ֨;->ܽ:Ll/ۗۛ֨;

    iget-object v1, p1, Ll/᩹ۛ֨;->ܽ:Ll/ۗۛ֨;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/᩹ۛ֨;->ᩳ:Ll/ۜۨ֨;

    iget-object v1, v0, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    iget-object v2, p0, Ll/᩹ۛ֨;->֫:Ll/ۙ֨֨;

    iget-object v3, p1, Ll/᩹ۛ֨;->֫:Ll/ۙ֨֨;

    .line 1207
    invoke-virtual {v1, v2, v3}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    iget-object v1, p0, Ll/᩹ۛ֨;->ۧ:Ll/ۙ֨֨;

    iget-object p1, p1, Ll/᩹ۛ֨;->ۧ:Ll/ۙ֨֨;

    .line 1208
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
    .locals 3

    .line 1213
    iget-object v0, p0, Ll/᩹ۛ֨;->ܽ:Ll/ۗۛ֨;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x7f

    .line 1215
    iget-object v1, p0, Ll/᩹ۛ֨;->ᩳ:Ll/ۜۨ֨;

    iget-object v1, v1, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Ll/᩹ۛ֨;->֫:Ll/ۙ֨֨;

    invoke-static {v2}, Ll/ۛ᩸֨;->ۤ(Ll/ۙ֨֨;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x7f

    .line 1217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ll/᩹ۛ֨;->ۧ:Ll/ۙ֨֨;

    invoke-static {v0}, Ll/ۛ᩸֨;->ۤ(Ll/ۙ֨֨;)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method
