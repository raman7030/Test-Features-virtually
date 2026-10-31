.class public final Ll/۠֨֨;
.super Ll/᩶ۚ֨;
.source "34PY"


# instance fields
.field public final ۧ֫:Ll/ۖܶ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۚ֨;Ll/ۖܶ۠;)V
    .locals 3

    .line 1192
    invoke-static {p1}, Ll/᩶ۚ֨;->֫(Ll/᩶ۚ֨;)Ll/ۙ֨֨;

    move-result-object v0

    iget-object v1, p1, Ll/᩶ۚ֨;->֫֫:Ll/ۖܶ۠;

    iget-object v2, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-direct {p0, v2, v0, v1}, Ll/᩶ۚ֨;-><init>(Ll/᩶֡֨;Ll/ۙ֨֨;Ll/ۖܶ۠;)V

    .line 1193
    iget-object v0, p1, Ll/᩶ۚ֨;->ۛ:Ll/ۖܶ۠;

    iput-object v0, p0, Ll/᩶ۚ֨;->ۛ:Ll/ۖܶ۠;

    .line 1194
    iget-object v0, p1, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    iput-object v0, p0, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    .line 1195
    iget-object v0, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    iput-object v0, p0, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    .line 1196
    iget-object p1, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    iput-object p1, p0, Ll/᩶ۚ֨;->ۤ:Ll/ۖܶ۠;

    .line 1197
    iput-object p2, p0, Ll/۠֨֨;->ۧ֫:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֡᩹۠;
    .locals 1

    .line 1226
    sget-object v0, Ll/֡᩹۠;->ۜ֫:Ll/֡᩹۠;

    return-object v0
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 1

    .line 1202
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot add metadata to a union type"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/᩶ۚ֨;
    .locals 1

    .line 1202
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot add metadata to a union type"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ۫֫()Ll/ۖܶ۠;
    .locals 1

    .line 1235
    iget-object v0, p0, Ll/۠֨֨;->ۧ֫:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final ܳ֫()Z
    .locals 1

    .line 1206
    iget-object v0, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 1221
    invoke-virtual {v0}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v0

    return v0
.end method
