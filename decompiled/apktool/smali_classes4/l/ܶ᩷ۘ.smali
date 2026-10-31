.class public final synthetic Ll/ܶ᩷ۘ;
.super Ljava/lang/Object;
.source "27Y0"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩶ۛ֫;
.implements Ll/۟ܶۧ;
.implements Ll/᩷ܿۖ;
.implements Ll/֡ۡ֡;


# direct methods
.method public static ֫(IILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p0

    .line 2
    invoke-virtual {p2, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p2, p0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-virtual {p1, p4, p0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 0
    check-cast p1, Ljava/io/File;

    invoke-static {p1}, Ll/ܺۢ֡;->֫(Ljava/io/File;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ll/֫᩸ۧ;)Ljava/lang/CharSequence;
    .locals 6

    .line 2
    check-cast p1, Ll/᩵ۙ᩷;

    .line 34
    invoke-virtual {p1}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v4, 0x2

    and-int/2addr v0, v4

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    new-array v5, v4, [Z

    aput-boolean v1, v5, v2

    aput-boolean v0, v5, v3

    .line 39
    invoke-virtual {p1}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f1203a9

    .line 40
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 41
    array-length v0, p1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    aget-boolean v1, v5, v2

    if-nez v1, :cond_2

    .line 46
    aget-object v1, p1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 48
    :cond_2
    aget-object v1, p1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    const-string v1, ", "

    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    aget-boolean v1, v5, v3

    if-nez v1, :cond_3

    .line 52
    aget-object p1, p1, v4

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    const/4 v1, 0x3

    .line 54
    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 42
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ֫()V
    .locals 0

    return-void
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 1

    .line 383
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method
