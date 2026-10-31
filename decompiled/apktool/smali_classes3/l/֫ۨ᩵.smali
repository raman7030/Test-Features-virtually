.class public final Ll/֫ۨ᩵;
.super Ll/ܶ۬᩵;
.source "54FB"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final ۙ:Ll/ᩳۛ᩵;

.field public static final ᩶:Ll/֫ۨ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 2
    new-instance v0, Ll/֫ۨ᩵;

    .line 44
    invoke-direct {v0}, Ll/ܶ۬᩵;-><init>()V

    .line 0
    sput-object v0, Ll/֫ۨ᩵;->᩶:Ll/֫ۨ᩵;

    .line 46
    sget-object v0, Ll/ۡۨ᩵;->᩶:Ll/ۡۨ᩵;

    .line 49
    invoke-static {}, Ll/᩸ۛ᩵;->֫()I

    move-result v1

    const/16 v2, 0x40

    if-ge v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x40

    :goto_0
    const/16 v2, 0xc

    const-string v3, "kotlinx.coroutines.io.parallelism"

    .line 47
    invoke-static {v1, v2, v3}, Ll/᩸ۛ᩵;->֫(IILjava/lang/String;)I

    move-result v1

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    if-lt v1, v2, :cond_1

    .line 107
    new-instance v2, Ll/ᩳۛ᩵;

    invoke-direct {v2, v0, v1}, Ll/ᩳۛ᩵;-><init>(Ll/ۗۗ᩵;I)V

    .line 46
    sput-object v2, Ll/֫ۨ᩵;->ۙ:Ll/ᩳۛ᩵;

    return-void

    :cond_1
    const-string v0, "Expected positive parallelism level, but got "

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 106
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 56
    sget-object v0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    invoke-virtual {p0, v0, p1}, Ll/֫ۨ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method

.method public final ֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V
    .locals 1

    .line 65
    sget-object v0, Ll/֫ۨ᩵;->ۙ:Ll/ᩳۛ᩵;

    invoke-virtual {v0, p1, p2}, Ll/ᩳۛ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V

    return-void
.end method
