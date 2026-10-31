.class public Lcom/amazonaws/logging/AndroidLog;
.super Ljava/lang/Object;
.source "AndroidLog.java"

# interfaces
.implements Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/amazonaws/logging/AndroidLog;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 154
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 154
    sget p2, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/amazonaws/logging/AndroidLog;->֫:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 154
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 154
    sget p2, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/amazonaws/logging/AndroidLog;->֫:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 154
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 154
    sget p2, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 0

    .line 154
    sget p1, Lcom/amazonaws/logging/LogFactory;->֫:I

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 154
    sget v0, Lcom/amazonaws/logging/LogFactory;->֫:I

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
