.class public final Ll/ۙۙ;
.super Ljava/lang/Object;
.source "F942"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Landroid/content/LocusId;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 81
    iput-object p1, p0, Ll/ۙۙ;->֫:Ljava/lang/String;

    .line 82
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 83
    invoke-static {p1}, Ll/᩶ۙ;->֫(Ljava/lang/String;)Landroid/content/LocusId;

    move-result-object p1

    iput-object p1, p0, Ll/ۙۙ;->ۧ:Landroid/content/LocusId;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 85
    iput-object p1, p0, Ll/ۙۙ;->ۧ:Landroid/content/LocusId;

    return-void

    .line 102
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "id cannot be empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Landroid/content/LocusId;)Ll/ۙۙ;
    .locals 2

    const-string v0, "locusId cannot be null"

    .line 139
    invoke-static {p0, v0}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    new-instance v0, Ll/ۙۙ;

    invoke-static {p0}, Ll/᩶ۙ;->֫(Landroid/content/LocusId;)Ljava/lang/String;

    move-result-object p0

    .line 101
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 140
    invoke-direct {v0, p0}, Ll/ۙۙ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 102
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "id cannot be empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 109
    :cond_1
    const-class v2, Ll/ۙۙ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 110
    :cond_2
    check-cast p1, Ll/ۙۙ;

    iget-object p1, p1, Ll/ۙۙ;->֫:Ljava/lang/String;

    .line 111
    iget-object v2, p0, Ll/ۙۙ;->֫:Ljava/lang/String;

    if-nez v2, :cond_4

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v1

    .line 114
    :cond_4
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۙۙ;->֫:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LocusIdCompat["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    iget-object v1, p0, Ll/ۙۙ;->֫:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "_chars"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۙۙ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Landroid/content/LocusId;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ۙۙ;->ۧ:Landroid/content/LocusId;

    return-object v0
.end method
