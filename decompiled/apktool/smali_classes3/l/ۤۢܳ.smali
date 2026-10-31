.class public final Ll/ۤۢܳ;
.super Ljava/lang/Object;
.source "X1XW"


# instance fields
.field public final ֫:Z

.field public ۧ:Ll/ܶ᩵ܿ;

.field public final ܳ:Ljava/lang/String;

.field public ܽ:Ll/ᩳۜܳ;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ۤۢܳ;->ܿ:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Ll/ۤۢܳ;->ܳ:Ljava/lang/String;

    .line 44
    iput-boolean p3, p0, Ll/ۤۢܳ;->ᩳ:Z

    .line 45
    iput-boolean p4, p0, Ll/ۤۢܳ;->֫:Z

    const-string p3, "/"

    .line 46
    invoke-virtual {p1, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p4

    if-nez p4, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    return-void

    .line 47
    :cond_0
    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string p4, "name: "

    const-string v0, " parent: "

    .line 0
    invoke-static {p4, p1, v0, p2}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public constructor <init>(Ll/ᩳۜܳ;)V
    .locals 4

    .line 37
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Ll/ۤۢܳ;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 38
    iput-object p1, p0, Ll/ۤۢܳ;->ܽ:Ll/ᩳۜܳ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 87
    iget-boolean v0, p0, Ll/ۤۢܳ;->ᩳ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۤۢܳ;->ۧ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to get file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۤۢܳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 93
    iput-object p1, p0, Ll/ۤۢܳ;->ۧ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Ll/ۤۢܳ;->֫:Z

    return v0
.end method

.method public final ۧ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۤۢܳ;->ۧ:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۤۢܳ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۤۢܳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/ᩳۜܳ;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۤۢܳ;->ܽ:Ll/ᩳۜܳ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۤۢܳ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ۤۢܳ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Ll/ۤۢܳ;->ᩳ:Z

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 5

    const-string v0, "[:\\\\*?<>\"|]"

    const-string v1, "_"

    .line 55
    iget-object v2, p0, Ll/ۤۢܳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xc8

    if-le v1, v2, :cond_2

    .line 57
    invoke-static {v0}, Ll/ܶ᩵ܿ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v4, 0x32

    if-le v2, v4, :cond_0

    .line 60
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 62
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v4, :cond_1

    .line 63
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 0
    :cond_1
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method
