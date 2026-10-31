.class public final Ll/ۛܳ۠;
.super Ll/ۨܳ۠;
.source "8412"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 164
    invoke-direct {p0, p1}, Ll/ۨܳ۠;-><init>(Ljava/lang/String;)V

    const-string v0, "/"

    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 166
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ll/ۤܳ۠;Ljava/lang/String;)V
    .locals 1

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    .line 0
    invoke-static {v0, p1, p2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 173
    invoke-direct {p0, p1}, Ll/ۛܳ۠;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ܽ᩶۠;)Ll/ۛܳ۠;
    .locals 4

    .line 160
    new-instance v0, Ll/ۛܳ۠;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x2e

    const/16 v3, 0x2f

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p1, Ll/ܽ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۛܳ۠;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 158
    check-cast p1, Ll/ۨܳ۠;

    .line 71
    iget-object v0, p0, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    iget-object p1, p1, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RelativeFile["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    const-string v2, "]"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۤܳ۠;
    .locals 4

    const/16 v0, 0x2f

    .line 182
    iget-object v1, p0, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 183
    new-instance v2, Ll/ۤܳ۠;

    add-int/lit8 v0, v0, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ll/ۤܳ۠;-><init>(Ljava/lang/String;)V

    return-object v2
.end method
