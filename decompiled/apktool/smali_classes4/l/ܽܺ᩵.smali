.class public final Ll/ܽܺ᩵;
.super Ljava/lang/Object;
.source "99VK"

# interfaces
.implements Ll/ᩴۡ᩵;


# instance fields
.field public ᩶:Ll/ۜۚ᩵;

.field public ᩸:Ll/ۛ֡᩵;

.field public final ᩹:Ll/֫ܺ᩵;


# direct methods
.method public constructor <init>(Ll/֫ܺ᩵;Ll/ۛ֡᩵;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ܽܺ᩵;->᩹:Ll/֫ܺ᩵;

    .line 46
    iput-object p2, p0, Ll/ܽܺ᩵;->᩸:Ll/ۛ֡᩵;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/String;)Ll/۬ۚ᩵;
    .locals 3

    .line 66
    :try_start_0
    new-instance v0, Ll/۬ۚ᩵;

    invoke-direct {v0, p1, p0}, Ll/۬ۚ᩵;-><init>(Ljava/lang/String;Ll/ᩴۡ᩵;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 68
    new-instance v1, Ll/᩵ۡ᩵;

    const-string v2, "Invalid URL "

    .line 0
    invoke-static {v2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 50
    invoke-direct {v1, p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    throw v1
.end method

.method public final ֫()Ll/ۛ֡᩵;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܽܺ᩵;->᩸:Ll/ۛ֡᩵;

    return-object v0
.end method

.method public final ۜ()Ll/ۜۚ᩵;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ܽܺ᩵;->᩶:Ll/ۜۚ᩵;

    if-nez v0, :cond_0

    .line 114
    new-instance v0, Ll/ۜۚ᩵;

    invoke-direct {v0, p0}, Ll/ۜۚ᩵;-><init>(Ll/ᩴۡ᩵;)V

    iput-object v0, p0, Ll/ܽܺ᩵;->᩶:Ll/ۜۚ᩵;

    .line 116
    :cond_0
    iget-object v0, p0, Ll/ܽܺ᩵;->᩶:Ll/ۜۚ᩵;

    return-object v0
.end method

.method public final ۧ()Ll/ᩴۡ᩵;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ܽܺ᩵;->᩹:Ll/֫ܺ᩵;

    invoke-virtual {v0}, Ll/֫ܺ᩵;->ۧ()Ll/ᩴۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ll/ۨۡ᩵;
    .locals 1

    .line 176
    iget-object v0, p0, Ll/ܽܺ᩵;->᩹:Ll/֫ܺ᩵;

    check-cast v0, Ll/ۧܺ᩵;

    invoke-virtual {v0}, Ll/ۧܺ᩵;->ܳ()Ll/ۨۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/᩶ۡ᩵;
    .locals 1

    .line 164
    iget-object v0, p0, Ll/ܽܺ᩵;->᩹:Ll/֫ܺ᩵;

    check-cast v0, Ll/ۧܺ᩵;

    invoke-virtual {v0}, Ll/ۧܺ᩵;->ܽ()Ll/᩶ۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ll/֨ۡ᩵;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ܽܺ᩵;->᩹:Ll/֫ܺ᩵;

    check-cast v0, Ll/ۧܺ᩵;

    invoke-virtual {v0}, Ll/ۧܺ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/ܶۡ᩵;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ܽܺ᩵;->᩹:Ll/֫ܺ᩵;

    check-cast v0, Ll/ۧܺ᩵;

    invoke-virtual {v0}, Ll/ۧܺ᩵;->ᩳ()Ll/ܶۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/ۤ֡᩵;
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ܽܺ᩵;->᩹:Ll/֫ܺ᩵;

    check-cast v0, Ll/ۧܺ᩵;

    invoke-virtual {v0}, Ll/ۧܺ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 57
    iget-object v0, p0, Ll/ܽܺ᩵;->᩸:Ll/ۛ֡᩵;

    .line 69
    instance-of v1, v0, Ll/ܽ֨᩵;

    if-eqz v1, :cond_0

    .line 70
    check-cast v0, Ll/ܽ֨᩵;

    .line 71
    invoke-interface {v0}, Ll/ܽ֨᩵;->ܿۧ()Ll/ۛ֡᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    iput-object v0, p0, Ll/ܽܺ᩵;->᩸:Ll/ۛ֡᩵;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
