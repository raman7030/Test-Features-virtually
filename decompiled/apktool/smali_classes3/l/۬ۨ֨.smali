.class public final Ll/۬ۨ֨;
.super Ljava/lang/Object;
.source "Y7SB"


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ۘ֡֨;

.field public final synthetic ܽ:Ll/ۡ᩺֨;

.field public final ᩳ:Ll/ۚۚ۠;


# direct methods
.method public constructor <init>(Ll/ۡ᩺֨;Ll/ۘ֡֨;Ll/ۖ᩵۠;)V
    .locals 0

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۨ֨;->ܽ:Ll/ۡ᩺֨;

    .line 189
    iput-object p2, p0, Ll/۬ۨ֨;->ۧ:Ll/ۘ֡֨;

    .line 190
    iput-object p3, p0, Ll/۬ۨ֨;->ᩳ:Ll/ۚۚ۠;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ۨ֨;)Ll/ۘ֡֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۨ֨;->ۧ:Ll/ۘ֡֨;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 207
    instance-of v0, p1, Ll/۬ۨ֨;

    if-eqz v0, :cond_0

    .line 205
    check-cast p1, Ll/۬ۨ֨;

    iget-object v0, p1, Ll/۬ۨ֨;->ۧ:Ll/ۘ֡֨;

    iget-object v1, p0, Ll/۬ۨ֨;->ܽ:Ll/ۡ᩺֨;

    invoke-static {v1}, Ll/ۡ᩺֨;->ۘ(Ll/ۡ᩺֨;)Ll/ۛ᩸֨;

    move-result-object v1

    .line 702
    iget-object v2, p0, Ll/۬ۨ֨;->ۧ:Ll/ۘ֡֨;

    iget-object v3, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v4, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 206
    invoke-virtual {v1, v3, v4}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ll/ܽᩳ۠;

    .line 207
    invoke-virtual {v2}, Ll/ۘ֡֨;->ۗ֫()Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v0}, Ll/ۘ֡֨;->ۗ֫()Ll/ۖܶ۠;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ll/ܽᩳ۠;-><init>(Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    iget-object v0, p0, Ll/۬ۨ֨;->ᩳ:Ll/ۚۚ۠;

    iget-object p1, p1, Ll/۬ۨ֨;->ᩳ:Ll/ۚۚ۠;

    invoke-virtual {v1, v0, p1}, Ll/ܽᩳ۠;->֫(Ll/ۚۚ۠;Ll/ۚۚ۠;)Z

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

    .line 196
    iget v0, p0, Ll/۬ۨ֨;->֫:I

    if-nez v0, :cond_0

    .line 198
    iget-object v0, p0, Ll/۬ۨ֨;->ۧ:Ll/ۘ֡֨;

    invoke-virtual {v0}, Ll/ۘ֡֨;->ۗ֫()Ll/ۖܶ۠;

    move-result-object v0

    iget-object v1, p0, Ll/۬ۨ֨;->ᩳ:Ll/ۚۚ۠;

    invoke-static {v1, v0}, Ll/ܿᩳ۠;->֫(Ll/ۚۚ۠;Ll/ۖܶ۠;)I

    move-result v0

    iput v0, p0, Ll/۬ۨ֨;->֫:I

    :cond_0
    return v0
.end method
