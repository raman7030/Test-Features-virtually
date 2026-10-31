.class public final Ll/۟۬ۡ;
.super Ljava/lang/Object;
.source "U7TD"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۬ۡ;->ۙ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Ll/۟۬ۡ;->᩸:I

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    .line 23
    iput-boolean p1, p0, Ll/۟۬ۡ;->᩹:Z

    return-void
.end method

.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 7

    .line 27
    iget-boolean v0, p0, Ll/۟۬ۡ;->᩹:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_5

    .line 45
    iput-boolean v2, p0, Ll/۟۬ۡ;->᩹:Z

    .line 47
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    iget-object v3, p0, Ll/۟۬ۡ;->ۙ:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    if-le v0, v4, :cond_0

    .line 48
    iput-object v5, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    goto/16 :goto_3

    .line 53
    :cond_0
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const-string v6, ""

    if-ne v0, v4, :cond_2

    .line 55
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    if-lez v0, :cond_1

    sub-int/2addr v0, v2

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/۟۬ۡ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    iput-object v6, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    .line 57
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/۟۬ۡ;->᩸:I

    goto :goto_3

    .line 59
    :cond_1
    iput-object v5, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    goto :goto_3

    .line 65
    :cond_2
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    if-nez v0, :cond_3

    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/۟۬ۡ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 66
    iput-object v6, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    .line 68
    :goto_0
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_5

    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/۟۬ۡ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 69
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/۟۬ۡ;->᩸:I

    goto :goto_0

    .line 75
    :cond_3
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    .line 78
    :goto_1
    iget v4, p0, Ll/۟۬ۡ;->᩸:I

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_4

    iget v4, p0, Ll/۟۬ۡ;->᩸:I

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/۟۬ۡ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_4

    .line 79
    iget v4, p0, Ll/۟۬ۡ;->᩸:I

    add-int/2addr v4, v2

    iput v4, p0, Ll/۟۬ۡ;->᩸:I

    goto :goto_1

    .line 83
    :cond_4
    iget v4, p0, Ll/۟۬ۡ;->᩸:I

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    .line 86
    :goto_2
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_5

    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/۟۬ۡ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 87
    iget v0, p0, Ll/۟۬ۡ;->᩸:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/۟۬ۡ;->᩸:I

    goto :goto_2

    .line 30
    :cond_5
    :goto_3
    iget-object v0, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    if-eqz v0, :cond_6

    return v2

    :cond_6
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 35
    invoke-virtual {p0}, Ll/۟۬ۡ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    const/4 v1, 0x0

    .line 39
    iput-boolean v1, p0, Ll/۟۬ۡ;->᩹:Z

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Ll/۟۬ۡ;->᩶:Ljava/lang/String;

    return-object v0

    .line 36
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
