.class public final Ll/ܽܶܿ;
.super Ll/ᩳܶܿ;
.source "R14O"


# instance fields
.field public ᩺:Ll/ܿ᩹ܿ;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ܿ᩹ܿ;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ᩳܶܿ;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iput-object p5, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 0

    return-object p0
.end method

.method public final ֫()Ll/ܽܶܿ;
    .locals 0

    return-object p0
.end method

.method public final ۛۧ()Ll/ܿ᩹ܿ;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    return-object v0
.end method

.method public final ۤۧ()Ll/ܿ᩹ܿ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    if-nez v0, :cond_0

    .line 64
    invoke-super {p0}, Ll/ۧ᩹ܿ;->ۤۧ()Ll/ܿ᩹ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    :cond_0
    return-object v0
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 0

    .line 48
    invoke-super {p0, p1}, Ll/ۧ᩹ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۫()Z
    .locals 1

    .line 39
    invoke-super {p0}, Ll/ۧ᩹ܿ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۬()Z
    .locals 1

    .line 24
    invoke-super {p0}, Ll/ۧ᩹ܿ;->۬()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۬ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 57
    iput-object v0, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    return-void
.end method

.method public final ᩺ۧ()Z
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ܽܶܿ;->᩺:Ll/ܿ᩹ܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
