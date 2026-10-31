.class public abstract Ll/ܰ۟ۚ;
.super Ljava/lang/Object;
.source "A7FF"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ᩸:Ll/ᩳ֫֨;


# direct methods
.method public constructor <init>(Ll/ᩳ֫֨;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ܰ۟ۚ;->᩸:Ll/ᩳ֫֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 58
    iget-object v0, p0, Ll/ܰ۟ۚ;->᩸:Ll/ᩳ֫֨;

    invoke-virtual {v0}, Ll/ᩳ֫֨;->ܿ()Ll/ܽ֫֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֫֨;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܰ۟ۚ;->ܽ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "_target "

    .line 0
    invoke-static {v0, v2, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫()Ljava/lang/String;
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract ܽ()Ljava/lang/String;
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 8

    .line 49
    invoke-virtual {p0}, Ll/ܰ۟ۚ;->֫()Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const-string v3, " } "

    const-string v4, " { "

    iget-object v5, p0, Ll/ܰ۟ۚ;->᩸:Ll/ᩳ֫֨;

    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v7

    if-nez v7, :cond_0

    .line 51
    invoke-virtual {v5}, Ll/ᩳ֫֨;->֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    .line 0
    invoke-static {v4, v1, v2, v0, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v5}, Ll/ᩳ֫֨;->֫()Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-static {v4, v0, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
