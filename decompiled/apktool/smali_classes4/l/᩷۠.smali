.class public final Ll/᩷۠;
.super Ljava/lang/Object;
.source "E1CE"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final synthetic ᩸:Ll/ۢ۠;

.field public ᩹:Ll/ܺ۠;


# direct methods
.method public constructor <init>(Ll/ۢ۠;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷۠;->᩸:Ll/ۢ۠;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 130
    check-cast p1, Ll/ܺ۠;

    .line 131
    iget-object v0, p0, Ll/᩷۠;->᩹:Ll/ܺ۠;

    iget v0, v0, Ll/ܺ۠;->ᩳ:I

    iget p1, p1, Ll/ܺ۠;->ᩳ:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 140
    iget-object v0, p0, Ll/᩷۠;->᩹:Ll/ܺ۠;

    const-string v1, "[ "

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0x9

    if-ge v0, v2, :cond_0

    .line 0
    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 142
    iget-object v2, p0, Ll/᩷۠;->᩹:Ll/ܺ۠;

    iget-object v2, v2, Ll/ܺ۠;->ܽ:[F

    aget v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "] "

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 145
    iget-object v1, p0, Ll/᩷۠;->᩹:Ll/ܺ۠;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
