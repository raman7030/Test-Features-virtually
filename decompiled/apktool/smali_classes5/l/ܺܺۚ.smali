.class public final Ll/ܺܺۚ;
.super Ll/ۘ᩵ۚ;
.source "956A"


# instance fields
.field public ᩹ܺ:Ll/᩻ܺۚ;


# direct methods
.method public constructor <init>(Ll/᩵ܿ֡;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Ll/ۘ᩵ۚ;-><init>(Ll/᩵ܿ֡;)V

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Ll/ܺܺۚ;->᩹ܺ:Ll/᩻ܺۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳܿ֡;[Ljava/lang/String;)V
    .locals 3

    .line 442
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۗܿ֡;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Ll/ܳܿ֡;->ۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Ll/ܳܿ֡;->᩹:I

    const-string v2, "]"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-virtual {p0, p1, p2}, Ll/ۘ᩵ۚ;->ۧ(Ll/ܳܿ֡;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, " "

    .line 0
    invoke-static {v0, v1, p2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 344
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v0, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Ll/ܺܺۚ;->᩹ܺ:Ll/᩻ܺۚ;

    if-nez v0, :cond_0

    .line 26
    new-instance v0, Ll/᩻ܺۚ;

    invoke-direct {v0, p2, p1}, Ll/᩻ܺۚ;-><init>(Ljava/lang/String;Ll/ܳܿ֡;)V

    iput-object v0, p0, Ll/ܺܺۚ;->᩹ܺ:Ll/᩻ܺۚ;

    :cond_0
    return-void
.end method

.method public final ᩵ܽ()Ll/ܳܿ֡;
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ܺܺۚ;->᩹ܺ:Ll/᩻ܺۚ;

    return-object v0
.end method
