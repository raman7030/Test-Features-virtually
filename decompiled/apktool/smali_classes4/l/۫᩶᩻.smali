.class public final Ll/۫᩶᩻;
.super Ll/ܺۘܳ;
.source "M60I"


# static fields
.field public static final synthetic ᩳ֫:I


# instance fields
.field public final ۧ֫:Ll/ܶ᩺ۡ;

.field public ܽ֫:Ll/ۗ᩺ۡ;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;)V
    .locals 9

    .line 12
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->᩶()Ljava/lang/String;

    move-result-object v1

    .line 41
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getParent()Ljava/lang/String;

    move-result-object v0

    const-string v2, "/"

    if-nez v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 12
    :goto_0
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v4

    .line 13
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v6

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    .line 12
    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 14
    iput-object p1, p0, Ll/۫᩶᩻;->ܽ֫:Ll/ۗ᩺ۡ;

    .line 15
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۚ()Ll/ܶ᩺ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩶᩻;->ۧ֫:Ll/ܶ᩺ۡ;

    if-eqz p1, :cond_1

    .line 16
    invoke-virtual {p1}, Ll/ܶ᩺ۡ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    invoke-virtual {p1}, Ll/ܶ᩺ۡ;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۘܳ;->֫(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֨ۧ()Ll/ܽۜܳ;
    .locals 3

    const/4 v0, 0x0

    .line 33
    iget-object v1, p0, Ll/۫᩶᩻;->ۧ֫:Ll/ܶ᩺ۡ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ܶ᩺ۡ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 34
    new-instance v2, Ll/ܽۜܳ;

    invoke-virtual {v1}, Ll/ܶ᩺ۡ;->ܽ()I

    move-result v1

    invoke-direct {v2, v1, v0, v0}, Ll/ܽۜܳ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_0
    return-object v0
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Ll/ۗ᩺ۡ;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/۫᩶᩻;->ܽ֫:Ll/ۗ᩺ۡ;

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 23
    iget-object v0, p0, Ll/۫᩶᩻;->ܽ֫:Ll/ۗ᩺ۡ;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v0

    return v0
.end method
