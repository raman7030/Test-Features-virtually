.class public final synthetic Ll/ᩴ᩻ۧ;
.super Ljava/lang/Object;
.source "Q8Q4"

# interfaces
.implements Ll/ۛܶܺ;


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    :try_start_0
    const-string v0, "androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder"

    .line 1212
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 1216
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
