.class public interface abstract Lbin/mt/plugin/api/util/ResultCallback;
.super Ljava/lang/Object;
.source "ResultCallback.java"


# static fields
.field public static final ERROR_OPERATION_CANCELED:Ljava/lang/String; = "Operation cancelled"

.field public static final ERROR_UNSUPPORTED_OPERATION:Ljava/lang/String; = "Unsupported operation"


# virtual methods
.method public abstract onFailure(Ljava/lang/String;)V
.end method

.method public abstract onSuccess()V
.end method
