.class public final Ll/۟ܿ֨;
.super Ll/ۜ֫֨;
.source "57DZ"


# instance fields
.field public ۖۧ:Ll/ܰ۟ۚ;

.field public final ۘۧ:Ll/ܰܿ֨;

.field public final ᩴۧ:Ll/֫֫֨;


# direct methods
.method public constructor <init>(Ll/ۨܽ֨;Z)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Ll/ۜ֫֨;-><init>(Ll/ۨܽ֨;Z)V

    .line 45
    new-instance p1, Ll/ܰܿ֨;

    invoke-direct {p1, p0}, Ll/ܰܿ֨;-><init>(Ll/۟ܿ֨;)V

    iput-object p1, p0, Ll/۟ܿ֨;->ۘۧ:Ll/ܰܿ֨;

    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Ll/۟ܿ֨;->ۖۧ:Ll/ܰ۟ۚ;

    .line 52
    new-instance p1, Ll/֫֫֨;

    invoke-direct {p1}, Ll/֫֫֨;-><init>()V

    iput-object p1, p0, Ll/۟ܿ֨;->ᩴۧ:Ll/֫֫֨;

    const-string p1, "@T+"

    .line 53
    iput-object p1, p0, Ll/ۜ֫֨;->ۡۧ:Ljava/lang/String;

    const-string p1, "@T-"

    .line 54
    iput-object p1, p0, Ll/ۜ֫֨;->᩷ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/io/DataInputStream;)V
    .locals 9

    .line 61
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    .line 62
    invoke-static {v0}, Ll/ᩳ֫֨;->֫(I)Ll/ᩳ֫֨;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 70
    iget-object v0, p0, Ll/۟ܿ֨;->ۘۧ:Ll/ܰܿ֨;

    invoke-virtual {v0, p1}, Ll/ܰܿ֨;->֫(Ljava/io/DataInputStream;)V

    .line 71
    invoke-virtual {v0, v1}, Ll/ܰܿ֨;->ܺ(Ll/ᩳ֫֨;)V

    .line 72
    invoke-virtual {v0}, Ll/ܰܿ֨;->ۧ()Ll/ܰ۟ۚ;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܿ֨;->ۖۧ:Ll/ܰ۟ۚ;

    .line 75
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    .line 76
    iget-object v1, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    const-string v2, "[TypeAnnotationData.read]: Reading Location (length = "

    const-string v3, ")."

    .line 0
    invoke-static {v0, v2, v3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    .line 76
    invoke-virtual {v1, v2, v4}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v1, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    const-string v2, "[TypeAnnotationData.read]: [ "

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v4}, Ll/᩶ۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 79
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    .line 66
    invoke-static {}, Ll/ۧ֫֨;->values()[Ll/ۧ֫֨;

    move-result-object v4

    aget-object v4, v4, v2

    .line 80
    invoke-virtual {v4}, Ll/ۧ֫֨;->֫()Ljava/lang/String;

    move-result-object v4

    .line 81
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v5

    int-to-char v5, v5

    .line 82
    new-instance v6, Ll/ܿ֫֨;

    invoke-direct {v6, v2, v5}, Ll/ܿ֫֨;-><init>(II)V

    iget-object v7, p0, Ll/۟ܿ֨;->ᩴۧ:Ll/֫֫֨;

    invoke-virtual {v7, v6}, Ll/֫֫֨;->֫(Ll/ܿ֫֨;)V

    .line 83
    iget-object v6, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, " "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "), "

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v6, v2, v4}, Ll/᩶ۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    const-string v1, "] "

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    invoke-super {p0, p1}, Ll/ۜ֫֨;->ۧ(Ljava/io/DataInputStream;)V

    return-void

    .line 66
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Bad target type: "

    const-string v2, " in TypeAnnotationData"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩹()V
    .locals 5

    .line 103
    invoke-virtual {p0}, Ll/ۜ֫֨;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, " { { }"

    .line 105
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, " {"

    .line 107
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 108
    sget-object v0, Ll/ۛܽ֨;->ۙ:Ll/ۛܽ֨;

    invoke-virtual {p0, v0}, Ll/ۨܽ֨;->֫(Ll/ۛܽ֨;)V

    .line 109
    invoke-super {p0}, Ll/ۜ֫֨;->᩹()V

    .line 111
    :goto_0
    iget-object v0, p0, Ll/۟ܿ֨;->ۖۧ:Ll/ܰ۟ۚ;

    invoke-virtual {v0}, Ll/ܰ۟ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Ll/۟ܿ֨;->ᩴۧ:Ll/֫֫֨;

    .line 78
    invoke-virtual {v0}, Ll/֫֫֨;->toString()Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v1, " "

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    goto :goto_2

    .line 0
    :cond_1
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_1

    :cond_2
    :goto_2
    const-string v0, "}"

    .line 116
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    return-void
.end method
