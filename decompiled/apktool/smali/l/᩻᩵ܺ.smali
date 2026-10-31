.class public final Ll/᩻᩵ܺ;
.super Ljava/lang/RuntimeException;
.source "ZB99"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:I

.field public final ᩸:Z

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V
    .locals 1

    .line 461
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 462
    invoke-static {p1}, Ll/ۜ᩵ܺ;->֫(Ll/ۜ᩵ܺ;)I

    move-result v0

    iput v0, p0, Ll/᩻᩵ܺ;->᩹:I

    .line 463
    invoke-static {p1}, Ll/ۜ᩵ܺ;->ۧ(Ll/ۜ᩵ܺ;)I

    move-result p1

    iput p1, p0, Ll/᩻᩵ܺ;->᩶:I

    .line 464
    iput-boolean p3, p0, Ll/᩻᩵ܺ;->᩸:Z

    .line 465
    iput-object p2, p0, Ll/᩻᩵ܺ;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 470
    iget-boolean v0, p0, Ll/᩻᩵ܺ;->᩸:Z

    iget-object v1, p0, Ll/᩻᩵ܺ;->ۙ:Ljava/lang/String;

    iget v2, p0, Ll/᩻᩵ܺ;->᩹:I

    const-string v3, "Parse error ["

    if-eqz v0, :cond_0

    .line 471
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ":eol] "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ":"

    .line 0
    invoke-static {v2, v3, v0}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 473
    iget v2, p0, Ll/᩻᩵ܺ;->᩶:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
