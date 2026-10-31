.class public final Ll/ۨۚۢ;
.super Ljava/lang/Object;
.source "91T6"


# static fields
.field public static ֫:Z

.field public static ۧ:Z

.field public static ܽ:Ljava/lang/String;


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 58
    sget-boolean v0, Ll/ۨۚۢ;->֫:Z

    if-nez v0, :cond_0

    .line 59
    invoke-static {}, Ll/ۨۚۢ;->֫()V

    .line 60
    :cond_0
    sget-boolean v0, Ll/ۨۚۢ;->ۧ:Z

    if-nez v0, :cond_1

    return-object p0

    .line 63
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/system"

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "/system/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return-object p0

    .line 65
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ll/ۨۚۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()V
    .locals 4

    const/4 v0, 0x1

    .line 20
    sput-boolean v0, Ll/ۨۚۢ;->֫:Z

    .line 21
    sget-boolean v1, Ll/ۨۚۢ;->ۧ:Z

    if-eqz v1, :cond_0

    goto/16 :goto_0

    .line 24
    :cond_0
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_0

    .line 27
    :cond_1
    invoke-static {}, Ll/ᩳ֨ۢ;->ۧ()V

    .line 28
    sget-object v1, Ll/ᩳ֨ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ֨ۢ;

    .line 29
    iget-object v2, v2, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    const-string v3, "/system"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 33
    :cond_3
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string v2, "magisk -v"

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v1

    const-wide/16 v2, 0xc8

    .line 34
    invoke-static {v1, v2, v3}, Ll/᩻ۛۡ;->֫(Ljava/lang/Process;J)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Ljava/lang/Process;->exitValue()I

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    .line 37
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-static {v1, v2}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "lite"

    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "/sbin/.magisk/mirror/system_root/system"

    .line 46
    invoke-static {v3, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 47
    sput-boolean v0, Ll/ۨۚۢ;->ۧ:Z

    .line 48
    sput-object v3, Ll/ۨۚۢ;->ܽ:Ljava/lang/String;

    .line 49
    new-instance v0, Ll/ۛۚۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۛۚۢ;-><init>(I)V

    invoke-static {v0}, Ll/᩹᩶ܿ;->֫(Ljava/util/function/Function;)V

    return-void

    :cond_6
    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "/sbin/.magisk/mirror/system"

    .line 50
    invoke-static {v2, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 51
    sput-boolean v0, Ll/ۨۚۢ;->ۧ:Z

    .line 52
    sput-object v2, Ll/ۨۚۢ;->ܽ:Ljava/lang/String;

    .line 53
    new-instance v0, Ll/ۛۚۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۛۚۢ;-><init>(I)V

    invoke-static {v0}, Ll/᩹᩶ܿ;->֫(Ljava/util/function/Function;)V

    :catch_0
    :cond_7
    :goto_0
    return-void
.end method
