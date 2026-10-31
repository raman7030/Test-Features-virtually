.class public final Lcom/amazonaws/logging/ConsoleLog;
.super Ljava/lang/Object;
.source "ConsoleLog.java"

# interfaces
.implements Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/amazonaws/logging/ConsoleLog;->֫:Ljava/lang/String;

    return-void
.end method

.method private ֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V
    .locals 4

    .line 139
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/amazonaws/logging/ConsoleLog;->֫:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 p1, 0x2

    aput-object p2, v1, p1

    const-string p1, "%s/%s: %s\n"

    invoke-virtual {v0, p1, v1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    if-eqz p3, :cond_0

    .line 141
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p3}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 122
    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->ۗ:Lcom/amazonaws/logging/LogFactory$Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/amazonaws/logging/ConsoleLog;->֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 87
    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->ۙ:Lcom/amazonaws/logging/LogFactory$Level;

    invoke-direct {p0, v0, p1, p2}, Lcom/amazonaws/logging/ConsoleLog;->֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 80
    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->ۙ:Lcom/amazonaws/logging/LogFactory$Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/amazonaws/logging/ConsoleLog;->֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 129
    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->ۗ:Lcom/amazonaws/logging/LogFactory$Level;

    invoke-direct {p0, v0, p1, p2}, Lcom/amazonaws/logging/ConsoleLog;->֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 94
    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->۬:Lcom/amazonaws/logging/LogFactory$Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/amazonaws/logging/ConsoleLog;->֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 115
    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->ۛ:Lcom/amazonaws/logging/LogFactory$Level;

    invoke-direct {p0, v0, p1, p2}, Lcom/amazonaws/logging/ConsoleLog;->֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 2

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 66
    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->ۤ:Lcom/amazonaws/logging/LogFactory$Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/amazonaws/logging/ConsoleLog;->֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 2

    .line 153
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 108
    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->ۛ:Lcom/amazonaws/logging/LogFactory$Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/amazonaws/logging/ConsoleLog;->֫(Lcom/amazonaws/logging/LogFactory$Level;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method
