.class public final Ll/ۘ᩸ܿ;
.super Ljava/lang/Object;
.source "L51E"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/io/File;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    .line 15
    iput-object p2, p0, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    const/4 p2, 0x0

    .line 16
    iput-object p2, p0, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    .line 17
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2f

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩸ܿ;->֫:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-virtual {p1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    .line 22
    iput-object p2, p0, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    .line 23
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput-object p3, p0, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2f

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩸ܿ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    .line 34
    const-class v2, Ll/ۘ᩸ܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    .line 36
    :cond_1
    check-cast p1, Ll/ۘ᩸ܿ;

    iget-object v2, p1, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    .line 38
    iget-object v4, p0, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v3}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    :goto_0
    return v1

    .line 39
    :cond_3
    iget-object v3, p0, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    if-eqz v3, :cond_4

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    if-eqz v2, :cond_5

    :goto_1
    return v1

    .line 40
    :cond_5
    iget-object v2, p0, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    if-eqz v2, :cond_6

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    if-nez p1, :cond_7

    return v0

    :cond_7
    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 45
    iget-object v1, p0, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 46
    iget-object v2, p0, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 47
    iget-object v2, p0, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_2
    add-int/2addr v1, v0

    return v1
.end method
