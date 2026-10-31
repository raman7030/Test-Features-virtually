.class public abstract Ll/֨ۙۡ;
.super Ljava/lang/Object;
.source "G1V3"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ᩳ()Ll/֨ۙۡ;
    .locals 2

    .line 18
    :try_start_0
    const-class v0, Ll/۫᩶ۡ;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۙۡ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 20
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/String;
.end method

.method public abstract ۧ()V
.end method

.method public abstract ܽ()V
.end method
