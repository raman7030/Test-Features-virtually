.class public final Ll/ۖ᩻֨;
.super Ljava/lang/Object;
.source "R5PD"


# static fields
.field public static ֫:Ll/ܺ᩻֨;

.field public static ۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()Ljava/lang/Class;
    .locals 4

    .line 75
    sget-object v0, Ll/ۖ᩻֨;->֫:Ll/ܺ᩻֨;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 77
    :cond_0
    sget-boolean v0, Ll/ۖ᩻֨;->ۧ:Z

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_1

    .line 88
    :cond_1
    :try_start_0
    new-instance v0, Ll/ܺ᩻֨;

    .line 65
    invoke-direct {v0}, Ljava/lang/SecurityManager;-><init>()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    .line 80
    :goto_0
    sput-object v0, Ll/ۖ᩻֨;->֫:Ll/ܺ᩻֨;

    const/4 v2, 0x1

    .line 81
    sput-boolean v2, Ll/ۖ᩻֨;->ۧ:Z

    :goto_1
    if-nez v0, :cond_2

    return-object v1

    .line 103
    :cond_2
    invoke-virtual {v0}, Ll/ܺ᩻֨;->getClassContext()[Ljava/lang/Class;

    move-result-object v0

    .line 104
    const-class v1, Ll/ۖ᩻֨;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 108
    :goto_2
    array-length v3, v0

    if-ge v2, v3, :cond_4

    .line 109
    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 114
    :cond_4
    :goto_3
    array-length v1, v0

    if-ge v2, v1, :cond_5

    add-int/lit8 v2, v2, 0x2

    array-length v1, v0

    if-ge v2, v1, :cond_5

    .line 118
    aget-object v0, v0, v2

    return-object v0

    .line 115
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ֫(Ljava/lang/String;)V
    .locals 3

    .line 128
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SLF4J: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
